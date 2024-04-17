package org.example;

// Interface defining the internet connection
interface Internet {
    // Method to connect to a server
    void connectTo(String serverHost) throws Exception;
}