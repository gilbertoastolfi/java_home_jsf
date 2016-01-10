package com.myimage.utils;
 
public enum Role {
     
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_COMMON("ROLE_COMMON");
 
    private String value;
     
    private Role(String value){
        this.value = value;
    }
 
    public String getValue() {
        return value;
    }    
}