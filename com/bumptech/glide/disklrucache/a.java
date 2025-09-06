package com.bumptech.glide.disklrucache;

import java.io.File;

public final class a {
    public final String a;
    public final long[] b;
    public final File[] c;
    public final File[] d;
    public boolean e;
    public Editor f;
    public long g;
    public final DiskLruCache h;

    public a(DiskLruCache diskLruCache0, String s) {
        this.h = diskLruCache0;
        this.a = s;
        this.b = new long[diskLruCache0.g];
        this.c = new File[diskLruCache0.g];
        this.d = new File[diskLruCache0.g];
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append('.');
        int v = stringBuilder0.length();
        for(int v1 = 0; v1 < diskLruCache0.g; ++v1) {
            stringBuilder0.append(v1);
            this.c[v1] = new File(diskLruCache0.a, stringBuilder0.toString());
            stringBuilder0.append(".tmp");
            this.d[v1] = new File(diskLruCache0.a, stringBuilder0.toString());
            stringBuilder0.setLength(v);
        }
    }

    public final String a() {
        StringBuilder stringBuilder0 = new StringBuilder();
        long[] arr_v = this.b;
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            stringBuilder0.append(' ');
            stringBuilder0.append(v1);
        }
        return stringBuilder0.toString();
    }
}

