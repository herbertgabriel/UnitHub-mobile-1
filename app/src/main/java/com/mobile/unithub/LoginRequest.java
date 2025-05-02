package com.mobile.unithub;

public class LoginRequest {
    private String email;
    private String password; // Alterado de "senha" para "password"

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getters (opcional, mas recomendado)
    public String getEmail() { return email; }
    public String getPassword() { return password; }
}