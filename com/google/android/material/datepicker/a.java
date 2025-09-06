package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class a implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Parcelable parcelable0 = parcel0.readParcelable(y.class.getClassLoader());
        Parcelable parcelable1 = parcel0.readParcelable(y.class.getClassLoader());
        Parcelable parcelable2 = parcel0.readParcelable(y.class.getClassLoader());
        return new CalendarConstraints(((y)parcelable0), ((y)parcelable1), ((DateValidator)parcel0.readParcelable(DateValidator.class.getClassLoader())), ((y)parcelable2), parcel0.readInt());
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CalendarConstraints[v];
    }
}

