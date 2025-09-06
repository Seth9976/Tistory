package com.google.gson.internal;

public final class q implements CharSequence {
    public char[] a;
    public String b;

    @Override
    public final char charAt(int v) {
        return this.a[v];
    }

    @Override
    public final int length() {
        return this.a.length;
    }

    @Override
    public final CharSequence subSequence(int v, int v1) {
        return new String(this.a, v, v1 - v);
    }

    @Override
    public final String toString() {
        if(this.b == null) {
            this.b = new String(this.a);
        }
        return this.b;
    }
}

