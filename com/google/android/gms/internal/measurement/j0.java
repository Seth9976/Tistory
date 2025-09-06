package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

public final class j0 implements zzii, Serializable {
    public final Object a;

    public j0(Object object0) {
        this.a = object0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof j0) {
            Object object1 = ((j0)object0).a;
            return this.a == object1 || this.a.equals(object1);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override
    public final String toString() {
        return "Suppliers.ofInstance(" + this.a + ")";
    }

    @Override  // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        return this.a;
    }
}

