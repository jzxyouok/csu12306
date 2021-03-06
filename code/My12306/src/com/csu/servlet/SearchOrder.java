package com.csu.servlet;

import com.csu.domain.order.YuPiao;
import com.csu.service.GetPiaoWuAndYuPIaoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.ArrayList;

/**
 * Created by 温 睿诚 on 2016/9/18/0018.
 */
@WebServlet(name = "SearchOrder",urlPatterns = {"/searchOrder"})
public class SearchOrder extends HttpServlet {
    private static final String url="/WEB-INF/jsp/order/searchOrder.jsp";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String date=req.getParameter("date");
        req.getRequestDispatcher(url).forward(req,resp);
        System.out.println(date);
    }
}
