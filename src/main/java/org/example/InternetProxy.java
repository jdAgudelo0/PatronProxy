package org.example;

class InternetProxy implements Internet{
    private Internet realInternet;
    private boolean accessGranted;

    // Constructor
    public InternetProxy(boolean accessGranted) {
        this.accessGranted = accessGranted;
    }

    // Method to connect to a server
    @Override
    public void connectTo(String serverHost) throws Exception {
        if (accessGranted) {
            // If access is granted, connect using real internet connection
            if (realInternet == null) {
                realInternet = new RealInternet();
            }
            realInternet.connectTo(serverHost);
        } else {
            // If access is not granted, throw an exception
            throw new IllegalAccessException("Access to internet is not granted.");
        }
    }
}

