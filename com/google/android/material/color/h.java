package com.google.android.material.color;

import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class h {
    public final f a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final boolean j;
    public final int k;
    public final int l;

    public h(boolean z, String[] arr_s) {
        byte[] arr_b1;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = z;
        int v = 0;
        int v2 = 0;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s = arr_s[v1];
            if(this.j) {
                byte[] arr_b = s.getBytes(Charset.forName("UTF-8"));
                arr_b1 = new byte[arr_b.length + 3];
                System.arraycopy(arr_b, 0, arr_b1, 2, ((int)(((byte)arr_b.length))));
                arr_b1[1] = (byte)arr_b.length;
                arr_b1[0] = (byte)arr_b.length;
                arr_b1[arr_b.length + 2] = 0;
            }
            else {
                char[] arr_c = s.toCharArray();
                int v3 = arr_c.length * 2;
                arr_b1 = new byte[v3 + 4];
                byte[] arr_b2 = j.e(((short)arr_c.length));
                arr_b1[0] = arr_b2[0];
                arr_b1[1] = arr_b2[1];
                for(int v4 = 0; v4 < arr_c.length; ++v4) {
                    byte[] arr_b3 = j.c(arr_c[v4]);
                    arr_b1[v4 * 2 + 2] = arr_b3[0];
                    arr_b1[v4 * 2 + 3] = arr_b3[1];
                }
                arr_b1[v3 + 2] = 0;
                arr_b1[v3 + 3] = 0;
            }
            Pair pair0 = new Pair(arr_b1, Collections.emptyList());
            this.f.add(v2);
            v2 += ((byte[])pair0.first).length;
            this.h.add(((byte[])pair0.first));
            this.i.add(((List)pair0.second));
        }
        int v5 = 0;
        for(Object object0: this.i) {
            Iterator iterator1 = ((List)object0).iterator();
            if(!iterator1.hasNext()) {
                this.g.add(v5);
                v5 += ((List)object0).size() * 12 + 4;
                continue;
            }
            Object object1 = iterator1.next();
            if(object1 != null) {
                throw new ClassCastException();
            }
            this.f.add(v2);
            throw null;
        }
        int v6 = v2 % 4 == 0 ? 0 : 4 - v2 % 4;
        this.k = v6;
        int v7 = this.h.size();
        this.b = v7;
        this.c = this.h.size() - arr_s.length;
        boolean z1 = this.h.size() - arr_s.length > 0;
        if(!z1) {
            this.g.clear();
            this.i.clear();
        }
        int v8 = this.g.size() * 4 + (v7 * 4 + 28);
        this.d = v8;
        int v9 = v2 + v6;
        this.e = z1 ? v8 + v9 : 0;
        if(z1) {
            v = v5;
        }
        int v10 = v8 + v9 + v;
        this.l = v10;
        this.a = new f(1, 28, v10);
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream0) {
        this.a.a(byteArrayOutputStream0);
        byteArrayOutputStream0.write(j.a(this.b));
        byteArrayOutputStream0.write(j.a(this.c));
        byteArrayOutputStream0.write(j.a((this.j ? 0x100 : 0)));
        byteArrayOutputStream0.write(j.a(this.d));
        byteArrayOutputStream0.write(j.a(this.e));
        for(Object object0: this.f) {
            byteArrayOutputStream0.write(j.a(((int)(((Integer)object0)))));
        }
        for(Object object1: this.g) {
            byteArrayOutputStream0.write(j.a(((int)(((Integer)object1)))));
        }
        for(Object object2: this.h) {
            byteArrayOutputStream0.write(((byte[])object2));
        }
        int v = this.k;
        if(v > 0) {
            byteArrayOutputStream0.write(new byte[v]);
        }
        for(Object object3: this.i) {
            Iterator iterator4 = ((List)object3).iterator();
            if(!iterator4.hasNext()) {
                byteArrayOutputStream0.write(new byte[]{-1, -1, -1, -1});
                continue;
            }
            Object object4 = iterator4.next();
            object4.getClass();
            throw new ClassCastException();
        }
    }
}

