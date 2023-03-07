package org.example.excption;


import lombok.extern.slf4j.Slf4j;

/**
 * @author Ahang
 * @version 1.0
 * @description try catch finally 代码块 finally 一定会执行 无论是否有异常
 * @date 2023/3/7 22:14
 */
@Slf4j
public class Test3 {
    public static void main(String[] args) {
        try {
            //代码区
            int i = 1 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            log.warn(e.getMessage());
        } finally {
            //最后必须执行的部分
            System.out.println("finally 我是最后执行的");
        }
    }
}
