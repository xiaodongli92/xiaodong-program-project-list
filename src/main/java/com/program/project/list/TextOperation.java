package com.program.project.list;

import com.sun.istack.internal.NotNull;

import java.util.HashMap;
import java.util.Map;

public class TextOperation {

    private TextOperation() {

    }

    //元音字母
    private static final String VOWEL = "aeiou";
    //拉丁猪文字游戏后缀
    private static final String END_LATIN_PIG = "ay";

    /**
     * 逆转字符串——输入一个字符串，将其逆转并输出。
     */
    public static String reverseString(@NotNull final String value) {
        if ("".equals(value)) {
            return "";
        }
        char[] chars = value.toCharArray();
        int length = chars.length;
        char[] newChars = new char[length];
        for (int i=0; i<length/2 + 1; i++) {
            newChars[i] = chars[length - 1 - i];
            newChars[length - 1 - i] = chars[i];
        }
        return new String(newChars);
    }

    /**
     * 拉丁猪文字游戏——这是一个英语语言游戏。基本规则是将一个英语单词的第一个辅音音素的字母移动到词尾并且加上后缀-ay（譬如“banana”会变成“anana-bay”）。可以在维基百科上了解更多内容。
     */
    public static String latinPig(@NotNull String value) {
        char[] chars = value.toCharArray();
        int vowelIndex = 0;
        for (int i=0; i<chars.length; i++) {
            if (VOWEL.contains(String.valueOf(chars[i]).toLowerCase())) {
                vowelIndex = i;
                break;
            }
        }
        return value.substring(vowelIndex) + "-" + value.substring(0, vowelIndex) + END_LATIN_PIG;
    }
}
