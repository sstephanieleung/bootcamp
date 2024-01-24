package com.vtlab.bootcamp.model;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class UppercasesStringMatcher extends TypeSafeMatcher<String>{

    @Override
    public boolean matchesSafely(String item){
        // Regular Expression - string pattern description
        return item.matches("[A-Z]+");
    }

    @Override
    public void describeTo(Description description){  //pass by reference
        description.appendText("The string should contain upper case only.");
    }

    public static Matcher<String> containsUppercaseOnly(){
        return new UppercasesStringMatcher();
    }
    
}
