package com.google.android.material.button;

import a5.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

public final class a extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public boolean b;

    static {
        a.CREATOR = new d(3);
    }

    public a(Parcel parcel0, ClassLoader classLoader0) {
        super(parcel0, classLoader0);
        this.b = parcel0.readInt() == 1;
    }

    @Override  // androidx.customview.view.AbsSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(((int)this.b));
    }
}

