package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.m;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        ParcelableSparseBooleanArray.CREATOR = new m(12);
    }

    public ParcelableSparseBooleanArray() {
    }

    public ParcelableSparseBooleanArray(int v) {
        super(v);
    }

    public ParcelableSparseBooleanArray(@NonNull SparseBooleanArray sparseBooleanArray0) {
        super(sparseBooleanArray0.size());
        for(int v = 0; v < sparseBooleanArray0.size(); ++v) {
            this.put(sparseBooleanArray0.keyAt(v), sparseBooleanArray0.valueAt(v));
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int[] arr_v = new int[this.size()];
        boolean[] arr_z = new boolean[this.size()];
        for(int v1 = 0; v1 < this.size(); ++v1) {
            arr_v[v1] = this.keyAt(v1);
            arr_z[v1] = this.valueAt(v1);
        }
        parcel0.writeInt(this.size());
        parcel0.writeIntArray(arr_v);
        parcel0.writeBooleanArray(arr_z);
    }
}

