package com.ms.eureka.login.Login.security.bo;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserPasswordBO {
    /**
     * The user name.
     */

    private String userName;

    /**
     * The password.
     */

    private String password;
}
