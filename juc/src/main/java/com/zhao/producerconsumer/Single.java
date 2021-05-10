package com.zhao.producerconsumer;

public class Single {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        ProducerThread producerThread = new ProducerThread(myQueue);
        ConsumerThread consumerThread = new ConsumerThread(myQueue);
        producerThread.start();
        consumerThread.start();
    }
}
