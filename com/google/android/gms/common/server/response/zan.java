package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@Class(creator = "FieldMappingDictionaryCreator")
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final HashMap b;
    public final String c;

    static {
        zan.CREATOR = new zao();
    }

    public zan(int v, String s, ArrayList arrayList0) {
        this.a = v;
        HashMap hashMap0 = new HashMap();
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            zal zal0 = (zal)arrayList0.get(v2);
            String s1 = zal0.b;
            HashMap hashMap1 = new HashMap();
            ArrayList arrayList1 = zal0.c;
            int v3 = ((ArrayList)Preconditions.checkNotNull(arrayList1)).size();
            for(int v4 = 0; v4 < v3; ++v4) {
                zam zam0 = (zam)arrayList1.get(v4);
                hashMap1.put(zam0.b, zam0.c);
            }
            hashMap0.put(s1, hashMap1);
        }
        this.b = hashMap0;
        this.c = (String)Preconditions.checkNotNull(s);
        this.zad();
    }

    public zan(java.lang.Class class0) {
        this.a = 1;
        this.b = new HashMap();
        this.c = (String)Preconditions.checkNotNull(class0.getCanonicalName());
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        HashMap hashMap0 = this.b;
        for(Object object0: hashMap0.keySet()) {
            stringBuilder0.append(((String)object0));
            stringBuilder0.append(":\n");
            Map map0 = (Map)hashMap0.get(((String)object0));
            for(Object object1: map0.keySet()) {
                stringBuilder0.append("  ");
                stringBuilder0.append(((String)object1));
                stringBuilder0.append(": ");
                stringBuilder0.append(map0.get(((String)object1)));
            }
        }
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = this.b;
        for(Object object0: hashMap0.keySet()) {
            arrayList0.add(new zal(((String)object0), ((Map)hashMap0.get(((String)object0)))));
        }
        SafeParcelWriter.writeTypedList(parcel0, 2, arrayList0, false);
        SafeParcelWriter.writeString(parcel0, 3, this.c, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final String zaa() {
        return this.c;
    }

    @Nullable
    public final Map zab(String s) {
        return (Map)this.b.get(s);
    }

    public final void zac() {
        HashMap hashMap0 = this.b;
        for(Object object0: hashMap0.keySet()) {
            Map map0 = (Map)hashMap0.get(((String)object0));
            HashMap hashMap1 = new HashMap();
            for(Object object1: map0.keySet()) {
                hashMap1.put(((String)object1), ((Field)map0.get(((String)object1))).zab());
            }
            hashMap0.put(((String)object0), hashMap1);
        }
    }

    public final void zad() {
        HashMap hashMap0 = this.b;
        for(Object object0: hashMap0.keySet()) {
            Map map0 = (Map)hashMap0.get(((String)object0));
            for(Object object1: map0.keySet()) {
                ((Field)map0.get(((String)object1))).zai(this);
            }
        }
    }

    public final void zae(java.lang.Class class0, Map map0) {
        String s = (String)Preconditions.checkNotNull(class0.getCanonicalName());
        this.b.put(s, map0);
    }

    public final boolean zaf(java.lang.Class class0) {
        Object object0 = Preconditions.checkNotNull(class0.getCanonicalName());
        return this.b.containsKey(object0);
    }
}

