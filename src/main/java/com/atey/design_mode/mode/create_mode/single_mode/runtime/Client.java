package com.atey.design_mode.mode.create_mode.single_mode.runtime;

import java.io.IOException;
import java.io.InputStream;

public class Client {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process ipconfig = runtime.exec("ipconfig");
        InputStream is = ipconfig.getInputStream();
        byte[] b = new byte[1024 * 1024 * 100];
        int read = is.read(b);
        System.out.println(new String(b, 0, read, "GBK"));
    }
}
