package dmit2015.model;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    string urlString = request.getParameter("url");
    String imageSizeString = request.getParameter("imageSize");
    int imageSize = (imageSizeString==null || imageSizeString.isBlank()) ? 114: Integer.parseInt(imageSizeString);

    if (urlString == null || urlString.isBlank()) {
        response.getWriter().write("Missing <strong>url</strong> parameter");
    } else{
        String downloadImage =  request.getParameter("download");
        if(downloadImage != null){
            response.setHeader("content-disposition", "attachment;filename=linkQRCode");
        }
        try {
            byte[] imageContent = generateQRCodeImage(urlString, imageSize);
            response.setContentType("image/png");
            response.setContentLength(imageContent.length);
            response.getOutputStream().write(imageContent);
        } catch (WriterException e){
            e.printStackTrace();
            response.getWriter().write("Error generating QRCode Image");
        }
    }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
