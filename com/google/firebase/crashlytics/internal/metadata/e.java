package com.google.firebase.crashlytics.internal.metadata;

import wb.a;

public final class e {
    public final int a;
    public final int b;
    public static final e c;

    static {
        e.c = new e(0, 0);
    }

    public e(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("e");
        stringBuilder0.append("[position = ");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", length = ");
        return a.c(this.b, "]", stringBuilder0);
    }
}

