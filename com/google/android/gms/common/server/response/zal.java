package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import java.util.ArrayList;
import java.util.Map;

@ShowFirstParty
@Class(creator = "FieldMappingDictionaryEntryCreator")
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final ArrayList c;

    static {
        zal.CREATOR = new zap();
    }

    public zal(int v, String s, ArrayList arrayList0) {
        this.a = v;
        this.b = s;
        this.c = arrayList0;
    }

    public zal(String s, Map map0) {
        ArrayList arrayList0;
        this.a = 1;
        this.b = s;
        if(map0 == null) {
            arrayList0 = null;
        }
        else {
            arrayList0 = new ArrayList();
            for(Object object0: map0.keySet()) {
                arrayList0.add(new zam(((Field)map0.get(((String)object0))), ((String)object0)));
            }
        }
        this.c = arrayList0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeString(parcel0, 2, this.b, false);
        SafeParcelWriter.writeTypedList(parcel0, 3, this.c, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

