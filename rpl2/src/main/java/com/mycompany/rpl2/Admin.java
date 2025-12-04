/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl2;

/**
 *
 * @author alyak
 */
public class Admin extends User {
    public void login() {
        System.out.println("Admin melakukan login");
    }
    public void logout() {
        System.out.println("Admin melakukan logout");
    }
    public void manageUser() {
        System.out.println("Admin mengelola user!");
    }
}
