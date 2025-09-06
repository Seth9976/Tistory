package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@Class(creator = "StringToIntConverterCreator")
public final class StringToIntConverter extends AbstractSafeParcelable implements FieldConverter {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final HashMap b;
    public final SparseArray c;

    static {
        StringToIntConverter.CREATOR = new zad();
    }

    @KeepForSdk
    public StringToIntConverter() {
        this.a = 1;
        this.b = new HashMap();
        this.c = new SparseArray();
    }

    public StringToIntConverter(ArrayList arrayList0, int v) {
        this.a = v;
        this.b = new HashMap();
        this.c = new SparseArray();
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            zac zac0 = (zac)arrayList0.get(v2);
            this.add(zac0.b, zac0.c);
        }
    }

    @NonNull
    @KeepForSdk
    public StringToIntConverter add(@NonNull String s, int v) {
        this.b.put(s, v);
        this.c.put(v, s);
        return this;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = this.b;
        for(Object object0: hashMap0.keySet()) {
            arrayList0.add(new zac(((String)object0), ((int)(((Integer)hashMap0.get(((String)object0)))))));
        }
        SafeParcelWriter.writeTypedList(parcel0, 2, arrayList0, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter
    public final int zaa() {
        return 7;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter
    public final int zab() {
        return 0;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter
    @Nullable
    public final Object zac(@NonNull Object object0) {
        Integer integer0 = (Integer)this.b.get(((String)object0));
        return integer0 == null ? ((Integer)this.b.get("gms_unknown")) : integer0;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter
    @NonNull
    public final Object zad(@NonNull Object object0) {
        String s = (String)this.c.get(((int)(((Integer)object0))));
        return s != null || !this.b.containsKey("gms_unknown") ? s : "gms_unknown";
    }
}

