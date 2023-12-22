package com.github.gotson.nightcompress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.function.Function;

class PropertyUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(Archive.class);

    static <T> T getPropertyAs(String key, Function<String, T> function, T defaultValue) {
        Objects.requireNonNull(defaultValue, "default value must not be null");
        try {
            String integerString = System.getProperty(key);
            if (integerString != null && !integerString.isEmpty()) {
                return function.apply(integerString);
            }
        } catch (SecurityException | NumberFormatException e) {
            LOGGER.error(
                "Could not parse the System Property '{}' into an '{}'. Defaulting to '{}'",
                key,
                defaultValue.getClass().getTypeName(),
                defaultValue,
                e
            );
        }
        return defaultValue;
    }
}
