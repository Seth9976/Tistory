package com.google.android.material.color;

import androidx.annotation.ColorInt;

public final class ColorRoles {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ColorRoles(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @ColorInt
    public int getAccent() {
        return this.a;
    }

    @ColorInt
    public int getAccentContainer() {
        return this.c;
    }

    @ColorInt
    public int getOnAccent() {
        return this.b;
    }

    @ColorInt
    public int getOnAccentContainer() {
        return this.d;
    }
}

