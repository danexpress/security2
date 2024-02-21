package com.example.security22.security22.security;

import org.springframework.security.core.GrantedAuthority;

import com.example.security22.security22.entities.Authority;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {

    private final Authority authority;

    @Override
    public String getAuthority() {

        return authority.getName();
    }

}
