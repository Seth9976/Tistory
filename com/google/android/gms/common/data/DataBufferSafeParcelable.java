package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
public class DataBufferSafeParcelable extends AbstractDataBuffer {
    public final Parcelable.Creator a;
    public static final String[] b;

    static {
        DataBufferSafeParcelable.b = new String[]{"data"};
    }

    @KeepForSdk
    public DataBufferSafeParcelable(@NonNull DataHolder dataHolder0, @NonNull Parcelable.Creator parcelable$Creator0) {
        super(dataHolder0);
        this.a = parcelable$Creator0;
    }

    @KeepForSdk
    public static void addValue(@NonNull Builder dataHolder$Builder0, @NonNull SafeParcelable safeParcelable0) {
        Parcel parcel0 = Parcel.obtain();
        safeParcelable0.writeToParcel(parcel0, 0);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("data", parcel0.marshall());
        dataHolder$Builder0.withRow(contentValues0);
        parcel0.recycle();
    }

    @NonNull
    @KeepForSdk
    public static Builder buildDataHolder() {
        return DataHolder.builder(DataBufferSafeParcelable.b);
    }

    @NonNull
    @KeepForSdk
    public SafeParcelable get(int v) {
        DataHolder dataHolder0 = (DataHolder)Preconditions.checkNotNull(this.mDataHolder);
        byte[] arr_b = dataHolder0.getByteArray("data", v, dataHolder0.getWindowIndex(v));
        Parcel parcel0 = Parcel.obtain();
        parcel0.unmarshall(arr_b, 0, arr_b.length);
        parcel0.setDataPosition(0);
        SafeParcelable safeParcelable0 = (SafeParcelable)this.a.createFromParcel(parcel0);
        parcel0.recycle();
        return safeParcelable0;
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    @NonNull
    @KeepForSdk
    public final Object get(int v) {
        return this.get(v);
    }
}

