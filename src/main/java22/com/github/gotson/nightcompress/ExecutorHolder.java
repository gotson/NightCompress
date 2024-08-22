package com.github.gotson.nightcompress;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import static com.github.gotson.nightcompress.PropertyUtils.getPropertyAs;

/**
 * Class to ensure the lazy initialization of the {@link java.util.concurrent.ThreadPoolExecutor} upon first usage.<br><br>
 * <p>
 * Using a cached thread pool executor is more efficient and creating a new thread for each extraction.
 * The total number of threads will only increase if there are tasks on its queue and all current threads are busy.
 * If there are available threads, those will be reused instead of a new one being created.
 * <br><br>
 * <p>
 * Configuration options:
 * <ul>
 * <li>To avoid the possibility of too many simultaneous active threads being started, the maximum
 * number of threads can be configured through the {@code nightcompress.extractor.max-threads} system property.
 * The default maximum number of threads is unbounded.</li>
 * <li>The keep alive time can be configured through the {@code nightcompress.extractor.thread-keep-alive-seconds} system property.
 * The default is 5s.</li>
 * </ul>
 */
class ExecutorHolder {

    private ExecutorHolder() {
    }

    private static final AtomicLong threadIndex = new AtomicLong();
    private static final int maxThreads = getPropertyAs("nightcompress.extractor.max-threads", Integer::parseInt, Integer.MAX_VALUE);
    private static final int threadKeepAlive = getPropertyAs("nightcompress.extractor.thread-keep-alive-seconds", Integer::parseInt, 5);

    /**
     * Equivalent to {@link java.util.concurrent.Executors#newCachedThreadPool()}, but customizable through system properties.
     */
    static final ExecutorService cachedExecutorService = new ThreadPoolExecutor(
        0,
        maxThreads,
        threadKeepAlive,
        TimeUnit.SECONDS,
        new SynchronousQueue<>(),
        r -> {
            Thread t = new Thread(r, "NightCompress-extractor-" + threadIndex.getAndIncrement());
            t.setDaemon(true);
            return t;
        });

}