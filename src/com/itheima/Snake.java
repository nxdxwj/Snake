package com.itheima;

import java.util.LinkedList;

public class Snake {
    //body
    private LinkedList<Node> body;

    //创建蛇对象时，初始化蛇身
    public Snake(){
        initSnake();
    }

    public void initSnake() {
        //创建蛇的躯体
        body= new LinkedList<>();
        //给蛇添加3个节点
        body.add(new Node(20,20));
        body.add(new Node(21,20));
        body.add(new Node(22,20));
    }

    //获取蛇身
    public LinkedList<Node> getBody(){
        return body;
    }

}
