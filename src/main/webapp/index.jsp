<%@page import="java.util.Map"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="pascal.orz.cn.simplejbatch.JobManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Method</h1>
        <ul>
            <li><a href="./webresources/simplejob">Simple Job</a></li>
            <li><a href="./webresources/jobstop">Job Stop</a></li>
        </ul>

        <h1>Jobs</h1>
        <table>
            <tr>
                <th>Job Name</th>
                <th>Thread ID</th>
            </tr>
            <%
                for (Map.Entry<String, Thread> job : JobManager.getInstance().getJobs().entrySet()) {
                    out.println("<tr>");
                    out.println("<td>" + job.getKey() + "</td>");
                    out.println("<td>" + job.getValue().getId() + "</td>");
                    out.println("</tr>");
                }
            %>
        </table>
    </body>
</html>
