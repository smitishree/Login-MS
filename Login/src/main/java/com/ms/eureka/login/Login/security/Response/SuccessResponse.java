package com.ms.eureka.login.Login.security.Response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SuccessResponse<T> {

    /** The success code. */
    private String successCode;

    /** The success description. */
    private String successDescription;

    /** The error. */
    private String warning;

    /** The error description. */
    private String warningDescription;

    /** The details. */
    private T details;

 //   /** The alerts. */
   // private List<Alert> alerts;
}
