package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Stack;

/**
 * @Author echo
 * @Version 1.0
 * @Description Input:aabcccbbad
 *             Output: -->aabbbad
 *                     -->aaad
 *                     -->d
 */
@Component
public class RepeatStrDemo implements StrDemoInterface {
    public String removeRepeatStr(String str){
        check(str);
        StringBuilder sb = new StringBuilder(str);
        Stack<Integer> counts = new Stack<>();
        for (int i=0;i<sb.length();++i){
            if (i==0 || sb.charAt(i)!=sb.charAt(i-1)){
                counts.push(1);
            }else {
                int statistics = counts.pop()+1;
                if (Objects.equals(statistics,3)){
                    sb.delete(i-2,i+1);
                    i=i-3;
                }else {
                    counts.push(statistics);
                }
            }
        }
        return sb.toString();
    }
}
