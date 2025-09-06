package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.m;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    static {
        ParcelableSparseIntArray.CREATOR = new m(13);
    }

    public ParcelableSparseIntArray() {
    }

    public ParcelableSparseIntArray(int v) {
        super(v);
    }

    public ParcelableSparseIntArray(@NonNull SparseIntArray sparseIntArray0) {
        for(int v = 0; v < sparseIntArray0.size(); ++v) {
            this.put(sparseIntArray0.keyAt(v), sparseIntArray0.valueAt(v));
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int[] arr_v = new int[this.size()];
        int[] arr_v1 = new int[this.size()];
        for(int v1 = 0; v1 < this.size(); ++v1) {
            arr_v[v1] = this.keyAt(v1);
            arr_v1[v1] = this.valueAt(v1);
        }
        parcel0.writeInt(this.size());
        parcel0.writeIntArray(arr_v);
        parcel0.writeIntArray(arr_v1);
    }
}

