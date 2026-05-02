import com.sun.net.httpserver.HttpServer;
import funtionality.CalculatorMenus;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server=HttpServer.create(new InetSocketAddress(8000),0);
server.createContext("/add",  new CalculatorMenus("add"));
server.setExecutor(null);
server.start();
        System.out.println("server is running on port 8000");
    }
ArrayList<Integer>myList=new ArrayList<>();
}