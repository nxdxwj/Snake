package com.itheima;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class MainFrame extends JFrame {
    private Snake snake;
    public MainFrame() throws HeadlessException {
        //初始化窗口参数
        initFrame();
        //初始化游戏棋盘
        initGamePanel();
        //初始化蛇
        initSnake();
    }

    private void initSnake() {
        snake=new Snake();
    }

    private void initGamePanel() {
        JPanel jPanel = new JPanel() {
            //paint是用来绘制面板中的内容
            @Override
            public void paint(Graphics g) {
                //设置画笔颜色
                g.setColor(Color.BLACK);
                //绘制40条横线
                for (int i = 0; i <40 ; i++) {
                    g.drawLine(0,15*i,600,15*i);
                }
                //绘制40条竖线
                for (int i = 0; i <40 ; i++) {
                    g.drawLine(15*i,0,15*i,600);
                }
                //绘制蛇
                LinkedList<Node> body=snake.getBody();
                for (Node node : body) {
                    g.fillRect(node.getX()*15,node.getY()*15,15,15);
                }
            }
        };
        add(jPanel);
    }

    private void initFrame() {
        //设置窗口标题
        setTitle("贪吃蛇游戏");
        //设置窗口宽高
        setSize(610,640);
        //设置窗口位置
        setLocation(400,400);
        //设置关闭按钮
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口大小不可变
        setResizable(false);
    }

    //主程序
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}
