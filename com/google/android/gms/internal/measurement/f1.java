package com.google.android.gms.internal.measurement;

public final class f1 implements zzlk {
    public final zzlk[] a;

    public f1(zzlk[] arr_zzlk) {
        this.a = arr_zzlk;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlk
    public final zzlj zzb(Class class0) {
        for(int v = 0; v < 2; ++v) {
            zzlk zzlk0 = this.a[v];
            if(zzlk0.zzc(class0)) {
                return zzlk0.zzb(class0);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.measurement.zzlk
    public final boolean zzc(Class class0) {
        for(int v = 0; v < 2; ++v) {
            if(this.a[v].zzc(class0)) {
                return true;
            }
        }
        return false;
    }
}

