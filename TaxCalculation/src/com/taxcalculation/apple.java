package com.taxcalculation;
class apple{
	private static final String USERNAME = "srinivas";
    private static final String PASSWORD = "srinivas@33";
    private String username;
    private String password;
    public void frontdesk(String username, String password) {
        this.username = username;
        this.password = password;
    }
 public boolean login() {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }

    public void updatePassword(String newPassword) {
        password = newPassword;
    }
	
}