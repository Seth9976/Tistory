package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class f implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        ArrayList arrayList0 = parcel0.readArrayList(DateValidator.class.getClassLoader());
        int v = parcel0.readInt();
        e e0 = CompositeDateValidator.d;
        if(v != 2 && v == 1) {
            e0 = CompositeDateValidator.c;
        }
        return new CompositeDateValidator(((List)Preconditions.checkNotNull(arrayList0)), e0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CompositeDateValidator[v];
    }
}

