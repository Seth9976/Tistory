package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.m;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;

@KeepForSdk
@KeepName
public final class BinderWrapper implements Parcelable {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    public IBinder a;

    static {
        BinderWrapper.CREATOR = new m(6);
    }

    @KeepForSdk
    public BinderWrapper(@NonNull IBinder iBinder0) {
        this.a = iBinder0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        parcel0.writeStrongBinder(this.a);
    }
}

