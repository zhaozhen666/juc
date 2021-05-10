package com.zhao.producerconsumer;

public class More {
    public static void main(String[] args) {
        MyQueue2 myQueue2 = new MyQueue2();
        for(int i=0;i<3;i++){
            new ConsumerThread(myQueue2).start();
        }
        for (int j=0;j<5;j++){
            new ProducerThread(myQueue2).start();
        }
    }
}
