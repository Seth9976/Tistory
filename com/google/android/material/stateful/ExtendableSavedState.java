package com.google.android.material.stateful;

import a5.d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import androidx.customview.view.AbsSavedState;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    @NonNull
    public final SimpleArrayMap extendableStates;

    static {
        ExtendableSavedState.CREATOR = new d(8);
    }

    public ExtendableSavedState(Parcel parcel0, ClassLoader classLoader0) {
        super(parcel0, classLoader0);
        int v = parcel0.readInt();
        String[] arr_s = new String[v];
        parcel0.readStringArray(arr_s);
        Bundle[] arr_bundle = new Bundle[v];
        parcel0.readTypedArray(arr_bundle, Bundle.CREATOR);
        this.extendableStates = new SimpleArrayMap(v);
        for(int v1 = 0; v1 < v; ++v1) {
            this.extendableStates.put(arr_s[v1], arr_bundle[v1]);
        }
    }

    public ExtendableSavedState(Parcelable parcelable0) {
        super(parcelable0);
        this.extendableStates = new SimpleArrayMap();
    }

    @Override
    @NonNull
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.extendableStates + "}";
    }

    @Override  // androidx.customview.view.AbsSavedState
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        int v1 = this.extendableStates.size();
        parcel0.writeInt(v1);
        String[] arr_s = new String[v1];
        Bundle[] arr_bundle = new Bundle[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_s[v2] = (String)this.extendableStates.keyAt(v2);
            arr_bundle[v2] = (Bundle)this.extendableStates.valueAt(v2);
        }
        parcel0.writeStringArray(arr_s);
        parcel0.writeTypedArray(arr_bundle, 0);
    }
}

