package hello.servlet.web.frontcontroller.v1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface ControllerV1 {
    // 프론트 컨트롤러는 다형성에 의존한다.
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
