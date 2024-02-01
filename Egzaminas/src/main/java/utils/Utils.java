package utils;

import java.util.UUID;


public class Utils {
    public static String getUniqueId() {
        return String.format(String.valueOf(System.currentTimeMillis() / 1000));
    }

    public static String generateRandomName() {
        return String.format("Myname"+ getUniqueId());
    }

}