package com.ms.eureka.login.Login.security.controller;

import com.ms.eureka.login.Login.security.Response.SuccessResponse;
import com.ms.eureka.login.Login.security.bo.UserPasswordBO;
import com.ms.eureka.login.Login.security.model.RedCloudOAuthToken;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SecurityController {

    SuccessResponse<RedCloudOAuthToken> authenticateUsingOAuth(HttpServletRequest request, HttpServletResponse response, UserPasswordBO userPassword);

}
