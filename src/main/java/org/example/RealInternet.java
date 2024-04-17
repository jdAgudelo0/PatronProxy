package org.example;


// Class representing the real internet connection
class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) throws Exception {

        System.out.println("Connecting to " + serverHost);
        // Here goes the code to establish a real internet connection
    }
}