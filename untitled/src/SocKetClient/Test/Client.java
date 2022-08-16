package SocKetClient.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//客户端
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",9999);
        OutputStream out=socket.getOutputStream();
        out.write("你好啊！，tcp".getBytes());
        socket.shutdownInput();
//        InputStream is=socket.getInputStream();
        out.close();
        socket.close();
    }
}
