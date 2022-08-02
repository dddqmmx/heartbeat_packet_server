package com.dddqmmx.heart;

import com.dddqmmx.heart.socket.tcp.TCPServer;
import com.dddqmmx.heart.socket.udp.UDPServer;

public class Main {
    public static void main(String[] args) {
        TCPServer tcpServer = new TCPServer();
        tcpServer.start();
        UDPServer udpServer = new UDPServer();
        udpServer.start();
    }
}