package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.appcompat.widget.m;

public final class f extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public float a;
    public int b;

    static {
        f.CREATOR = new m(15);
    }

    public f(Parcel parcel0) {
        super(parcel0.readParcelable(f.class.getClassLoader()));
        this.a = parcel0.readFloat();
        this.b = parcel0.readInt();
    }

    public f(Parcelable parcelable0) {
        super(parcelable0);
    }

    @Override  // android.view.AbsSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeFloat(this.a);
        parcel0.writeInt(this.b);
    }
}

