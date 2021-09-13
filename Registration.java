package com.collection.class23;

public class Registration {

    private String mail;
    private String userName;
    private String password;


    public void setUserName(String userName) {
        if (userName.length() < 6) {
            System.out.println("Username must be longer than 6 characters");
        } else if (userName.isEmpty()) {
            System.out.println("Username cannot be empty");
        } else {
            this.userName = userName;
        }
    }

    public void createPassword(String password) {

        if (!(userName.isEmpty())) {
            if (password.length() < 6) {
                System.out.println("Password cannot be longer than 6 characters");
            } else if (password.isEmpty()) {
                System.out.println("Password cannot be empty");
            } else if (password.contains(userName)) {
                System.out.println("Password cannot contain Username");
            } else {
                this.password = password;
            }
        } else {
            System.out.println("Please set Username");
        }
    }

    public void setMail(String mail) {
        if (mail.contains("@yahoo.com")) {

            this.mail = mail;
        } else {
            System.out.println("Invalid e-mail. Please enter YAHOO email address");
        }

    }

}

class RegistrationTester {
    public static void main(String[] args) {

        Registration registration = new Registration();
        registration.setMail("EastCTeam@yahoo.com");
        registration.setUserName("JoseAntonio");
        registration.createPassword("JoseEgo123");

    }
}
