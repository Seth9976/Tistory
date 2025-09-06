package com.bumptech.glide.gifdecoder;

import b6.a;
import java.util.ArrayList;

public class GifHeader {
    public static final int NETSCAPE_LOOP_COUNT_DOES_NOT_EXIST = -1;
    public static final int NETSCAPE_LOOP_COUNT_FOREVER;
    public int[] a;
    public int b;
    public int c;
    public a d;
    public final ArrayList e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;

    public GifHeader() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.e = new ArrayList();
        this.l = -1;
    }

    public int getHeight() {
        return this.g;
    }

    public int getNumFrames() {
        return this.c;
    }

    public int getStatus() {
        return this.b;
    }

    public int getWidth() {
        return this.f;
    }
}

