package com.campy.service;

import java.util.Arrays;

/**
 * @author ran_ych
 * @create 2019-10-11  16:06
 * @desc
 */
public class Test {
    public static void main(String []args){
        findComplement(65);
    }

    public static int findComplement(int num) {
        long num0 = 1;

        while(num0 <= num){
            num0 = num0 << 1;
        }
        System.out.println(num);
        System.out.println(num0);
        num0 -= 1;
        System.out.println((int)num0 ^ num);
        return (int)num0 ^ num;

        }

}
