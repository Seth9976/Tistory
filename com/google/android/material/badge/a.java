package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Locale;

public final class a implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        State badgeState$State0 = new State();  // 初始化器: Ljava/lang/Object;-><init>()V
        badgeState$State0.i = 0xFF;
        badgeState$State0.k = -2;
        badgeState$State0.l = -2;
        badgeState$State0.m = -2;
        badgeState$State0.t = Boolean.TRUE;
        badgeState$State0.a = parcel0.readInt();
        badgeState$State0.b = (Integer)parcel0.readSerializable();
        badgeState$State0.c = (Integer)parcel0.readSerializable();
        badgeState$State0.d = (Integer)parcel0.readSerializable();
        badgeState$State0.e = (Integer)parcel0.readSerializable();
        badgeState$State0.f = (Integer)parcel0.readSerializable();
        badgeState$State0.g = (Integer)parcel0.readSerializable();
        badgeState$State0.h = (Integer)parcel0.readSerializable();
        badgeState$State0.i = parcel0.readInt();
        badgeState$State0.j = parcel0.readString();
        badgeState$State0.k = parcel0.readInt();
        badgeState$State0.l = parcel0.readInt();
        badgeState$State0.m = parcel0.readInt();
        badgeState$State0.o = parcel0.readString();
        badgeState$State0.p = parcel0.readString();
        badgeState$State0.q = parcel0.readInt();
        badgeState$State0.s = (Integer)parcel0.readSerializable();
        badgeState$State0.u = (Integer)parcel0.readSerializable();
        badgeState$State0.v = (Integer)parcel0.readSerializable();
        badgeState$State0.w = (Integer)parcel0.readSerializable();
        badgeState$State0.x = (Integer)parcel0.readSerializable();
        badgeState$State0.y = (Integer)parcel0.readSerializable();
        badgeState$State0.z = (Integer)parcel0.readSerializable();
        badgeState$State0.C = (Integer)parcel0.readSerializable();
        badgeState$State0.A = (Integer)parcel0.readSerializable();
        badgeState$State0.B = (Integer)parcel0.readSerializable();
        badgeState$State0.t = (Boolean)parcel0.readSerializable();
        badgeState$State0.n = (Locale)parcel0.readSerializable();
        badgeState$State0.D = (Boolean)parcel0.readSerializable();
        return badgeState$State0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new State[v];
    }
}

