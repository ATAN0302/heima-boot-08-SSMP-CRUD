package com.example.dao;

import com.alibaba.druid.wall.Violation;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * 阿谭
 * <p>
 * 2022-09-26 10:30
 */
public class test {
    @Test
    public void test1(){
        for (int i = 1000; i <= 9999; i++){
            int a = i / 100;
            int b = i % 100 ;
            int num = a+b;
            if(num * num == i){
                System.out.println(i);
            }
        }
    }

    @Test
    public void test2(){
        for(int i = 1; i <= 9; i++ ){
            for (int j = 1; j <= i; j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
    @Test
    public void test3(){
        int i,a = 0,b,c;
        for ( i =1;i<=666666;i++) {
            for (c=1,b=0; c <= i; c++)
            b=b+c;
            a=a+b;
            if(a>666666){
                System.out.println(i);
                break;
            }
        }
}
    @Test
    public void test4() {
        System.out.println("请输入天数:");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        System.out.println(days+"天");
        int num = 1;//最后一天还剩一个
        for (int i = 1; i <= days; i++ ){
            num = (num+1)*2;
        }
        for(int i =1; i<=days; i++){
            num = (num/2)-1;
            System.out.println("第"+i+"天有"+num+"个苹果");
        }
    }

    }
