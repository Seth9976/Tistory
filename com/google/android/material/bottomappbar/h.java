package com.google.android.material.bottomappbar;

import a5.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.customview.view.AbsSavedState;

public final class h extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public int b;
    public boolean c;

    static {
        h.CREATOR = new d(2);
    }

    public h(Parcel parcel0, ClassLoader classLoader0) {
        super(parcel0, classLoader0);
        this.b = parcel0.readInt();
        this.c = parcel0.readInt() != 0;
    }

    @Override  // androidx.customview.view.AbsSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeInt(this.b);
        parcel0.writeInt(((int)this.c));
    }
}

