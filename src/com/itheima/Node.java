package com.itheima;

/*
* 节点类：每一条蛇是由若干个节点组成的，蛇由横纵坐标来确定位置
 */

public class Node {
    private int x;
    private int y;

    public Node() {
    }

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //随机
}
