package com.qingqing.study.class_loader;

import com.qingqing.study.classloader.domain.HelloWorld;

/**
 * Created by xuya on 2016/10/22.
 */
public class HelloWorldLoader {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();

        helloWorld.print();
    }
}
