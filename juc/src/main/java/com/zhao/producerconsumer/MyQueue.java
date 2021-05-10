package com.zhao.producerconsumer;

public class MyQueue {
    private  String [] data = new  String[10];
    private Integer getIndex = 0;
    private Integer putIndex = 0;
    private int size =0;

    public synchronized void  put(String element){
        if (size==data.length){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data[putIndex]=element;
        ++putIndex;
        if (putIndex==data.length)
            putIndex=0;
        ++size;
        notify();
    }

    public synchronized String get(){
        if (size==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String result = data[putIndex];
        ++getIndex;
        if (getIndex==data.length)
            getIndex=0;
        --size;
        notify();
        return result;
    }
}
