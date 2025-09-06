package com.google.android.material.color;

import java.io.ByteArrayOutputStream;

public final class f {
    public final short a;
    public final short b;
    public final int c;

    public f(short v, short v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream0) {
        byteArrayOutputStream0.write(j.e(this.a));
        byteArrayOutputStream0.write(j.e(this.b));
        byteArrayOutputStream0.write(j.a(this.c));
    }
}

