package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a proxy for internet connection with access denied
        Internet internetProxy = new InternetProxy(false);

        try {
            // Try to connect to a server
            internetProxy.connectTo("www.example.com");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Create another proxy for internet connection with access granted
        Internet internetProxy2 = new InternetProxy(true);

        try {
            // Try to connect to a server
            internetProxy2.connectTo("www.example.com");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
