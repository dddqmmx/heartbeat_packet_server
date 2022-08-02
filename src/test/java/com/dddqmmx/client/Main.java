package com.dddqmmx.client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 2042);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //从socket通信管道中得到一个字节输入流
        OutputStream os = null;
        try {
            os = socket.getOutputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //包装为高级打印流
        PrintStream ps = new PrintStream(os);
        //开始发送消息出去
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入消息：");
            ps.println(sc.nextLine());
            ps.flush();
        }
    }
}
