package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.common.zzag;
import java.util.ArrayList;

@KeepForSdk
@VisibleForTesting
public final class SafeParcelableSerializer {
    @NonNull
    @KeepForSdk
    public static SafeParcelable deserializeFromBytes(@NonNull byte[] arr_b, @NonNull Parcelable.Creator parcelable$Creator0) {
        Preconditions.checkNotNull(parcelable$Creator0);
        Parcel parcel0 = Parcel.obtain();
        parcel0.unmarshall(arr_b, 0, arr_b.length);
        parcel0.setDataPosition(0);
        SafeParcelable safeParcelable0 = (SafeParcelable)parcelable$Creator0.createFromParcel(parcel0);
        parcel0.recycle();
        return safeParcelable0;
    }

    @Nullable
    @KeepForSdk
    public static SafeParcelable deserializeFromIntentExtra(@NonNull Intent intent0, @NonNull String s, @NonNull Parcelable.Creator parcelable$Creator0) {
        byte[] arr_b = intent0.getByteArrayExtra(s);
        return arr_b == null ? null : SafeParcelableSerializer.deserializeFromBytes(arr_b, parcelable$Creator0);
    }

    @NonNull
    @KeepForSdk
    public static SafeParcelable deserializeFromString(@NonNull String s, @NonNull Parcelable.Creator parcelable$Creator0) {
        return SafeParcelableSerializer.deserializeFromBytes(Base64Utils.decodeUrlSafe(s), parcelable$Creator0);
    }

    @Nullable
    @Deprecated
    public static ArrayList deserializeIterableFromBundle(@NonNull Bundle bundle0, @NonNull String s, @NonNull Parcelable.Creator parcelable$Creator0) {
        ArrayList arrayList0 = (ArrayList)bundle0.getSerializable(s);
        if(arrayList0 == null) {
            return null;
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList1.add(SafeParcelableSerializer.deserializeFromBytes(((byte[])arrayList0.get(v1)), parcelable$Creator0));
        }
        return arrayList1;
    }

    @Nullable
    @KeepForSdk
    public static ArrayList deserializeIterableFromBundleSafe(@NonNull Bundle bundle0, @NonNull String s, @NonNull Parcelable.Creator parcelable$Creator0) {
        return SafeParcelableSerializer.deserializeIterableFromBytes(bundle0.getByteArray(s), parcelable$Creator0);
    }

    @Nullable
    public static ArrayList deserializeIterableFromBytes(@Nullable byte[] arr_b, @NonNull Parcelable.Creator parcelable$Creator0) {
        if(arr_b == null) {
            return null;
        }
        Parcel parcel0 = Parcel.obtain();
        parcel0.unmarshall(arr_b, 0, arr_b.length);
        parcel0.setDataPosition(0);
        try {
            ArrayList arrayList0 = new ArrayList();
            parcel0.readTypedList(arrayList0, parcelable$Creator0);
            return arrayList0;
        }
        finally {
            parcel0.recycle();
        }
    }

    @Nullable
    @KeepForSdk
    @Deprecated
    public static ArrayList deserializeIterableFromIntentExtra(@NonNull Intent intent0, @NonNull String s, @NonNull Parcelable.Creator parcelable$Creator0) {
        ArrayList arrayList0 = (ArrayList)intent0.getSerializableExtra(s);
        if(arrayList0 == null) {
            return null;
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList1.add(SafeParcelableSerializer.deserializeFromBytes(((byte[])arrayList0.get(v1)), parcelable$Creator0));
        }
        return arrayList1;
    }

    @Nullable
    @KeepForSdk
    public static ArrayList deserializeIterableFromIntentExtraSafe(@NonNull Intent intent0, @NonNull String s, @NonNull Parcelable.Creator parcelable$Creator0) {
        return SafeParcelableSerializer.deserializeIterableFromBytes(intent0.getByteArrayExtra(s), parcelable$Creator0);
    }

    @Deprecated
    public static void serializeIterableToBundle(@NonNull Iterable iterable0, @NonNull Bundle bundle0, @NonNull String s) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            arrayList0.add(SafeParcelableSerializer.serializeToBytes(((SafeParcelable)object0)));
        }
        bundle0.putSerializable(s, arrayList0);
    }

    public static void serializeIterableToBundleSafe(@NonNull Iterable iterable0, @NonNull Bundle bundle0, @NonNull String s) {
        byte[] arr_b;
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeTypedList(zzag.zzj(iterable0));
            arr_b = parcel0.marshall();
        }
        finally {
            parcel0.recycle();
        }
        bundle0.putByteArray(s, arr_b);
    }

    @KeepForSdk
    @Deprecated
    public static void serializeIterableToIntentExtra(@NonNull Iterable iterable0, @NonNull Intent intent0, @NonNull String s) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            arrayList0.add(SafeParcelableSerializer.serializeToBytes(((SafeParcelable)object0)));
        }
        intent0.putExtra(s, arrayList0);
    }

    @KeepForSdk
    public static void serializeIterableToIntentExtraSafe(@NonNull Iterable iterable0, @NonNull Intent intent0, @NonNull String s) {
        byte[] arr_b;
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeTypedList(zzag.zzj(iterable0));
            arr_b = parcel0.marshall();
        }
        finally {
            parcel0.recycle();
        }
        intent0.putExtra(s, arr_b);
    }

    @NonNull
    @KeepForSdk
    public static byte[] serializeToBytes(@NonNull SafeParcelable safeParcelable0) {
        Parcel parcel0 = Parcel.obtain();
        safeParcelable0.writeToParcel(parcel0, 0);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        return arr_b;
    }

    @KeepForSdk
    public static void serializeToIntentExtra(@NonNull SafeParcelable safeParcelable0, @NonNull Intent intent0, @NonNull String s) {
        intent0.putExtra(s, SafeParcelableSerializer.serializeToBytes(safeParcelable0));
    }

    @NonNull
    @KeepForSdk
    public static String serializeToString(@NonNull SafeParcelable safeParcelable0) {
        return Base64Utils.encodeUrlSafe(SafeParcelableSerializer.serializeToBytes(safeParcelable0));
    }
}

