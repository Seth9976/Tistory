package com.google.android.gms.internal.measurement;

public final class i0 implements zzii {
    public volatile zzii a;
    public volatile boolean b;
    public Object c;

    @Override
    public final String toString() {
        zzii zzii0 = this.a;
        StringBuilder stringBuilder0 = new StringBuilder("Suppliers.memoize(");
        if(zzii0 == null) {
            zzii0 = "<supplier that returned " + this.c + ">";
        }
        stringBuilder0.append(zzii0);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        if(!this.b) {
            synchronized(this) {
                if(!this.b) {
                    zzii zzii0 = this.a;
                    zzii0.getClass();
                    Object object0 = zzii0.zza();
                    this.c = object0;
                    this.b = true;
                    this.a = null;
                    return object0;
                }
            }
        }
        return this.c;
    }
}

