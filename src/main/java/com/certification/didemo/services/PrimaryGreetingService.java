package com.certification.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
/**
 * Primary is used when there is more of one bean implementing an interface and
 * we don't use a qualifier, the app context knows that this is the one that should
 * be injected
 */
@Primary
/**
 * When theres no profile defined the default one will be chosen
 */
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello I was injected via the primary service";
    }
}
