package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.appcompat.widget.m;
import java.util.Arrays;

public final class k implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final i a;
    public final i b;
    public final int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        k.CREATOR = new m(16);
    }

    public k(int v) {
        this(0, 0, 10, v);
    }

    public k(int v, int v1, int v2, int v3) {
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.c = v3;
        int v4 = 12;
        this.g = v < 12 ? 0 : 1;
        this.a = new i(59);
        if(v3 == 1) {
            v4 = 23;
        }
        this.b = new i(v4);
    }

    public static String a(Resources resources0, CharSequence charSequence0, String s) {
        try {
            return String.format(resources0.getConfiguration().locale, s, Integer.parseInt(String.valueOf(charSequence0)));
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    public final int b() {
        if(this.c == 1) {
            return this.d % 24;
        }
        int v = this.d;
        if(v % 12 == 0) {
            return 12;
        }
        return this.g == 1 ? v - 12 : v;
    }

    public final void c(int v) {
        int v1 = 12;
        if(this.c == 1) {
            this.d = v;
            return;
        }
        if(this.g != 1) {
            v1 = 0;
        }
        this.d = v % 12 + v1;
    }

    public final void d(int v) {
        this.e = v % 60;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int v) {
        if(v != this.g) {
            this.g = v;
            int v1 = this.d;
            if(v1 < 12 && v == 1) {
                this.d = v1 + 12;
                return;
            }
            if(v1 >= 12 && v == 0) {
                this.d = v1 - 12;
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof k ? this.d == ((k)object0).d && this.e == ((k)object0).e && this.c == ((k)object0).c && this.f == ((k)object0).f : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.e, this.f});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeInt(this.f);
        parcel0.writeInt(this.c);
    }
}

