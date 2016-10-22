package com.qingqing.study.classloader.domain;

/**
 * Created by xuya on 2016/10/22.
 */
public class HelloWorld {

    public void print() {
        System.out.println("hello world from simple_jar2");
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.print();
    }

}