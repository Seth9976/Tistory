package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import androidx.appcompat.widget.m;
import java.util.ArrayList;

public final class e extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public float a;
    public float b;
    public ArrayList c;
    public float d;
    public boolean e;

    static {
        e.CREATOR = new m(14);
    }

    @Override  // android.view.View$BaseSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeFloat(this.a);
        parcel0.writeFloat(this.b);
        parcel0.writeList(this.c);
        parcel0.writeFloat(this.d);
        parcel0.writeBooleanArray(new boolean[]{this.e});
    }
}

