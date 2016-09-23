package com.program.project.list;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @Author: lixiaodong@souyidai.com
 * @CreateDate: 2016/9/23
 */
public class TextOperationTest {

    @Test
    public void reverseStringTest() throws Exception {
        String testStr = "逆转字符串";
        String result = TextOperation.reverseString(testStr);
        System.out.println(result);
        Assert.assertEquals("串符字转逆",result);
    }

    @Test
    public void latinPigTest() throws Exception {
        String testStr = "three";
        String result = TextOperation.latinPig(testStr);
        System.out.println(result);
        Assert.assertEquals("ee-thray", result);
    }
}
