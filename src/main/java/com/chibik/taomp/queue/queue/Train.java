package com.chibik.taomp.queue.queue;

public class Train {

    public static int CAPACITY = 32768;

    private final long[] goodsArray = new long[CAPACITY];

    private int index;

    public int goodsCount() {
        return index;
    }

    public void addGoods(long i) {
        goodsArray[index++] = i;
    }

    public long getGoods(int i) {
        index--;
        return goodsArray[i];
    }

    public int getCapacity() {
        return CAPACITY;
    }


}