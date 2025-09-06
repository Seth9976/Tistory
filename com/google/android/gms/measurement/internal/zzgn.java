package com.google.android.gms.measurement.internal;

import a5.b;
import android.os.Bundle;
import androidx.annotation.NonNull;
import r0.a;

public final class zzgn {
    public static Object zza(@NonNull Bundle bundle0, String s, Class class0, Object object0) {
        Object object1 = bundle0.get(s);
        if(object1 == null) {
            return object0;
        }
        if(class0.isAssignableFrom(object1.getClass())) {
            return object1;
        }
        String s1 = object1.getClass().getCanonicalName();
        throw new IllegalStateException(a.o(b.w("Invalid conditional user property field type. \'", s, "\' expected [", class0.getCanonicalName(), "] but was ["), s1, "]"));
    }

    public static void zzb(@NonNull Bundle bundle0, @NonNull Object object0) {
        if(object0 instanceof Double) {
            bundle0.putDouble("value", ((double)(((Double)object0))));
            return;
        }
        if(object0 instanceof Long) {
            bundle0.putLong("value", ((long)(((Long)object0))));
            return;
        }
        bundle0.putString("value", object0.toString());
    }
}

