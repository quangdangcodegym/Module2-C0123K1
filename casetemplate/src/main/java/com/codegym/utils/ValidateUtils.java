package com.codegym.utils;

import java.util.regex.Pattern;

public class ValidateUtils {

    public static final String BOOK_NAME_REGEX = "^[A-Za-z][A-Za-z0-9_ ]{7,19}$";
    public static final String BOOK_DESCRIPTION_REGEX = "^[A-Za-z][A-Za-z0-9_ ]{7,99}$";

    public static boolean isValidBookName(String bookName) {
        return Pattern.matches(BOOK_NAME_REGEX, bookName);
    }
    public static boolean isValidBooDescription(String bookDescription) {
        return Pattern.matches(BOOK_DESCRIPTION_REGEX, bookDescription);
    }

    public static boolean isValidPrice(double price) {
        if (price > 0 && price < 5000000) {
            return true;
        }
        return false;
    }
}
