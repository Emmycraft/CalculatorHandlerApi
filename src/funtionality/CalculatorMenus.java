package funtionality;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class CalculatorMenus implements HttpHandler {
    private  String calculatorOperand;
    //creating a constructor of the calculator
//initializing the result
    double result=0;

    public CalculatorMenus(String calculatorOperand) {
        this.calculatorOperand = calculatorOperand;
    }


    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String query=exchange.getRequestURI().getQuery();
        Double firstValue=Double.parseDouble(query.split("&")[0].split("=")[1]);
        //accessing the second value
        Double secondValue=Double.parseDouble(query.split("&")[1].split("=")[1]);


        //calling the addValue method
        addValue(exchange,firstValue,secondValue);

    }
    public void addValue(HttpExchange exchange , Double first, Double second) throws IOException{
        result=first+second;

        sendResponse(exchange,"result"+result);

    }

public void sendResponse(HttpExchange exchange,String response) throws IOException{

        exchange.sendResponseHeaders(200,response.getBytes().length);
    OutputStream os=exchange.getResponseBody();
    os.write(response.getBytes());
    os.close();
}
}
