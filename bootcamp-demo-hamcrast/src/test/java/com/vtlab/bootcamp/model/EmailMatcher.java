package com.vtlab.bootcamp.model;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class EmailMatcher extends TypeSafeMatcher<String>{
    
    @Override
    public boolean matchesSafely(String email){
        return email.matches("^[A-Za-z0-9]+[A-Za-z0-9-._]*[A-Za-z0-9]\\@[A-Za-z0-9]+[A-Za-z0-9-.]+[A-Za-z0-9]+\\.[A-Za-z]{2,}$");
    }

    @Override
    public void describeTo(Description description){  //pass by reference
        description.appendText("The string should contain upper case only.");
    }

    public static Matcher<String> validateEmail(){
        return new EmailMatcher();
    }
}
