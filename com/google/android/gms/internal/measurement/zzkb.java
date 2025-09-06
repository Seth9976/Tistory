package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class zzkb extends zzin {
    public final zzkf a;
    protected zzkf zza;

    public zzkb(zzkf zzkf0) {
        this.a = zzkf0;
        if(zzkf0.f()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (zzkf)zzkf0.zzl(4, null, null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzin
    public final Object clone() throws CloneNotSupportedException {
        return this.zzaz();
    }

    public final zzkb zzaA(zzkf zzkf0) {
        if(!this.a.equals(zzkf0)) {
            if(!this.zza.f()) {
                this.zzaH();
            }
            zzkf zzkf1 = this.zza;
            Class class0 = zzkf1.getClass();
            o1.c.a(class0).zzg(zzkf1, zzkf0);
        }
        return this;
    }

    public final zzkb zzaB(byte[] arr_b, int v, int v1, zzjr zzjr0) throws zzkp {
        if(!this.zza.f()) {
            this.zzaH();
        }
        try {
            Class class0 = this.zza.getClass();
            o1.c.a(class0).zzh(this.zza, arr_b, 0, v1, new m0(zzjr0));
            return this;
        }
        catch(zzkp zzkp0) {
            throw zzkp0;
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw zzkp.d();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", iOException0);
        }
    }

    public final zzkf zzaC() {
        zzkf zzkf0 = this.zzaD();
        switch(((byte)(((Byte)zzkf0.zzl(1, null, null))))) {
            case 0: {
                break;
            }
            case 1: {
                return zzkf0;
            }
            default: {
                Class class0 = zzkf0.getClass();
                boolean z = o1.c.a(class0).zzk(zzkf0);
                zzkf0.zzl(2, (z ? zzkf0 : null), null);
                if(z) {
                    return zzkf0;
                }
            }
        }
        throw new zzmn(zzkf0);
    }

    public zzkf zzaD() {
        if(!this.zza.f()) {
            return this.zza;
        }
        this.zza.zzbJ();
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.measurement.zzll
    public zzlm zzaE() {
        return this.zzaD();
    }

    public final void zzaG() {
        if(!this.zza.f()) {
            this.zzaH();
        }
    }

    public void zzaH() {
        zzkf zzkf0 = (zzkf)this.a.zzl(4, null, null);
        zzkf zzkf1 = this.zza;
        Class class0 = zzkf0.getClass();
        o1.c.a(class0).zzg(zzkf0, zzkf1);
        this.zza = zzkf0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzin
    public final zzin zzau() {
        return this.zzaz();
    }

    @Override  // com.google.android.gms.internal.measurement.zzin
    public final zzin zzav(byte[] arr_b, int v, int v1) throws zzkp {
        this.zzaB(arr_b, 0, v1, zzjr.c);
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzin
    public final zzin zzaw(byte[] arr_b, int v, int v1, zzjr zzjr0) throws zzkp {
        this.zzaB(arr_b, 0, v1, zzjr0);
        return this;
    }

    public final zzkb zzaz() {
        zzkb zzkb0 = (zzkb)this.a.zzl(5, null, null);
        zzkb0.zza = this.zzaD();
        return zzkb0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzln
    public final zzlm zzbS() {
        throw null;
    }
}

