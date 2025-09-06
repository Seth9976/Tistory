package com.google.android.material.color;

public final class c {
    public final byte a;
    public final byte b;
    public final short c;
    public final String d;
    public final int e;

    public c(int v, String s, int v1) {
        this.d = s;
        this.e = v1;
        this.c = (short)(0xFFFF & v);
        this.b = (byte)(v >> 16 & 0xFF);
        this.a = (byte)(v >> 24 & 0xFF);
    }
}

