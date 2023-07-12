package com.ms.eureka.login.Login.security.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedCloudOAuthToken {


        /** The access token. */
        @JsonProperty(value = "access_token")
        private String accessToken;

        /** The token type. */
        @JsonProperty(value = "token_type")
        private String tokenType;

        /** The refresh token. */
        @JsonProperty(value = "refresh_token")
        private String refreshToken;

        /** The refresh token expires in. */
        @JsonProperty(value = "expires_in")
        private int refreshTokenExpiresIn;

        /** The authenticated user. */
        @JsonProperty(value = "authenticated_user")
        private String authenticatedUser;

    }
