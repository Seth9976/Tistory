package com.google.android.material.search;

import a5.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

public final class n extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public String b;
    public int c;

    static {
        n.CREATOR = new d(7);
    }

    public n(Parcel parcel0, ClassLoader classLoader0) {
        super(parcel0, classLoader0);
        this.b = parcel0.readString();
        this.c = parcel0.readInt();
    }

    @Override  // androidx.customview.view.AbsSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeString(this.b);
        parcel0.writeInt(this.c);
    }
}

