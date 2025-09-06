package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public final class h0 implements zzii, Serializable {
    public final zzii a;
    public volatile transient boolean b;
    public transient Object c;

    public h0(zzii zzii0) {
        zzii0.getClass();
        this.a = zzii0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Suppliers.memoize(");
        String s = this.b ? "<supplier that returned " + this.c + ">" : this.a;
        stringBuilder0.append(s);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    Object object0 = this.a.zza();
                    this.c = object0;
                    this.b = true;
                    return object0;
                }
            }
        }
        return this.c;
    }
}

