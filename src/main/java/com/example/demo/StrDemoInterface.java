package com.example.demo;

import java.util.regex.Pattern;

/**
 * @Author echo
 * @Version 1.0
 * @Description
 */
public interface StrDemoInterface {
    String validRegex = "^[a-zA-Z]+$";
    default void check(String raw) {
        if (!Pattern.compile(validRegex).matcher(raw).find()) {
            throw new IllegalArgumentException("Only English characters are allowed");
        }
    }
}
