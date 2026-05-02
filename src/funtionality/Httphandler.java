package funtionality;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;

public interface Httphandler
{
    void handle(HttpExchange exchange) throws IOException;
}
