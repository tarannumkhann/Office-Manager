<%-- 
    Document   : empChangepassword
    Created on : 9 Mar, 2024, 1:38:58 PM
    Author     : Tarannum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="EmployeeHeader.jsp" %>
<div>
    <center>

        <br>
        <span style="font-size: 30px;color: brown;font-style: normal;">Change Password</span>
        <br><br>
        <form action="changepassword">
            <table width="600" border="1" cellpadding="20">
                <tr><td>Enter Old Password</td><td><input type="password" name="opswd"></td></tr>
                <tr><td>Enter New Password</td><td><input type="password" name="npswd"></td></tr>
                <tr><td>Enter Confirm Password</td><td><input type="password" name="cpswd"></td></tr>
                <tr><td></td><td><input type="submit" value="Submit"></td><td><input type="reset" value="Reset"></td></tr>
            </table>
        </form>
    </center>
</div>