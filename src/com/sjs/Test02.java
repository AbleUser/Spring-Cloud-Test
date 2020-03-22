package com.sjs;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @outhor sjs
 * @create 2019-10-16-下午2:00
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入的字符串
        String next = scanner.next();
        //将输入的字符串变成char类型的数组
        char[] chars = next.toCharArray();
        Set set=new HashSet();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }
        System.out.println(set.toString());

    }
}
