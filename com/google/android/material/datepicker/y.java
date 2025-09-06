package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.appcompat.widget.m;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public final class y implements Parcelable, Comparable {
    public static final Parcelable.Creator CREATOR;
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    static {
        y.CREATOR = new m(9);
    }

    public y(Calendar calendar0) {
        calendar0.set(5, 1);
        Calendar calendar1 = i0.c(calendar0);
        this.a = calendar1;
        this.b = calendar1.get(2);
        this.c = calendar1.get(1);
        this.d = calendar1.getMaximum(7);
        this.e = calendar1.getActualMaximum(5);
        this.f = calendar1.getTimeInMillis();
    }

    public final int a(y y0) {
        return this.a.compareTo(y0.a);
    }

    public static y b(int v, int v1) {
        Calendar calendar0 = i0.g(null);
        calendar0.set(1, v);
        calendar0.set(2, v1);
        return new y(calendar0);
    }

    public static y c(long v) {
        Calendar calendar0 = i0.g(null);
        calendar0.setTimeInMillis(v);
        return new y(calendar0);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((y)object0));
    }

    public final String d() {
        if(this.g == null) {
            long v = this.a.getTimeInMillis();
            this.g = i0.b("yMMMM", Locale.getDefault()).format(new Date(v));
        }
        return this.g;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(y y0) {
        if(!(this.a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return y0.b - this.b + (y0.c - this.c) * 12;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof y ? this.b == ((y)object0).b && this.c == ((y)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.c);
        parcel0.writeInt(this.b);
    }
}

