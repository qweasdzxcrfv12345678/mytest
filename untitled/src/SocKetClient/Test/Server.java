package SocKetClient.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        Socket accept= server.accept();
        InputStream is=accept.getInputStream();
        int len;
        byte[] bytes=new byte[1024];
        while ((len = is.read(bytes))!= -1){
            System.out.println(new String(bytes,0,len));
        }
        is.close();
        accept.close();
        server.close();
    }
}
