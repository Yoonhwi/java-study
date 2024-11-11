import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.net.InetSocketAddress;
import java.io.IOException;
import java.io.OutputStream;

public class ServerManager {
    public void start() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000),0);
        server.createContext("/test",new testHandler());
        server.start();
    }

    public class testHandler implements HttpHandler{
        @Override // Override 란 인터페이스에서 상속받은 메서드를 재정의 할때 사용합니다.
        public void handle(HttpExchange exchange) throws IOException{
            String response = "Api Test Success!";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            //HTTP 응답은 바이트 스트림으로 데이터를 전송합니다.
            //즉, HTTP응답 본문에 보내는 데이터는 반드시 바이트 형태여야 합니다.
            //response는 String타입이므로, 문자열을 바이트 배열로 변환하여 보냅니다.
            //getBytes().length를 사용하는 이유는 , HTTP 응답 헤더에서 Content-Length를 설정해야 하는데,
            //이는 응답 본문의 크기를 바이트 단위로 나타내기 위한 것입니다.
            //JS는 send함수 내부적으로 인코딩을 해줘서 따로 바이트 배열로 변환할 필요가 없음.
            //바이트 배열이란 
            //"hello" 를 바이트 배열로 변환하는 과정은
            //"h" => 0x68
            //"e" => 0x65
            //"l" => 0x6C
            //"o" => 0x6F 이므로,
            //[104,101,108,108,111] 로 변환됨.
 
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}

