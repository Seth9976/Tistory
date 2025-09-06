package com.google.android.material.internal;

import a5.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

public final class c extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public boolean b;

    static {
        c.CREATOR = new d(4);
    }

    public c(Parcel parcel0, ClassLoader classLoader0) {
        super(parcel0, classLoader0);
        this.b = parcel0.readInt() == 1;
    }

    @Override  // androidx.customview.view.AbsSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(((int)this.b));
    }
}

