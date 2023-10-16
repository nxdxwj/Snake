package com.itheima;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() throws HeadlessException {
        //初始化窗口参数
        initFrame();
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
