package com.motorola.io;
public class FileConnection {
    public String[] list() { return new String[0]; }
    public void close() {}
    public boolean exists() { return false; }
    public void create() {}
    public java.io.OutputStream openOutputStream() { return new java.io.ByteArrayOutputStream(); }
    public java.io.InputStream openInputStream() { return new java.io.ByteArrayInputStream(new byte[0]); }
    public long fileSize() { return 0L; }
}
