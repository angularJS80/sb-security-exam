package me.cho.springsecuritytry;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;
@Component
public class AuthenticationEventHandlers {
    @EventListener
    public void BadCredentialHandler(AuthenticationFailureBadCredentialsEvent authenticationFailureBadCredentialsEvent){
        System.out.println("비번이 틀렸답니다"+authenticationFailureBadCredentialsEvent.getAuthentication().getPrincipal());

    }
}
