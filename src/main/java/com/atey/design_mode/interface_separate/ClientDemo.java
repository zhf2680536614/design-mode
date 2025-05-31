package com.atey.design_mode.interface_separate;

public class ClientDemo {
    public static void main(String[] args) {
        ATEYSafetyDoor safetyDoor = new ATEYSafetyDoor();
        safetyDoor.antiTheft();
        safetyDoor.fireproof();
    }
}
