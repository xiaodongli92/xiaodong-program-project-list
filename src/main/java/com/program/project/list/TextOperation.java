package com.program.project.list;

import com.sun.istack.internal.NotNull;

public class TextOperation {

    private TextOperation() {

    }

    /**
     * 逆转字符串——输入一个字符串，将其逆转并输出。
     */
    public static String reverseString(@NotNull String value) {
        char[] chars = value.toCharArray();
        int length = chars.length;
        char[] newChars = new char[length];
        for (int i=0; i<length/2 + 1; i++) {
            newChars[i] = chars[length - 1 - i];
            newChars[length - 1 - i] = chars[i];
        }
        return new String(newChars);
    }
}
