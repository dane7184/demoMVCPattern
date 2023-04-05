package co.istad.mvcapp;

import co.istad.mvcapp.controller.IndexController;

public class MainApplication {
    // Create reference or object dependency
    public static IndexController indexController;

    public static void main(String[] args) {
        indexController = new IndexController();
        IndexController indexController = new IndexController();
        indexController.handleIndex();
    }
}
