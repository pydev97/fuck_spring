package com.example.fuck_spring.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

@Component("index")
public class KKK implements View {
    private Resource resource;

    @Autowired(required = false)
    KKK() {

        this.resource = resource;
    }

    public String getContentType() {
        return "text/html";
    }

    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType(this.getContentType());
        FileCopyUtils.copy(this.resource.getInputStream(), response.getOutputStream());
    }
}
