package com.google.android.gms.internal.measurement;

public class zzks {
    public volatile zzje a;
    protected volatile zzlm zza;

    static {
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzks)) {
            return false;
        }
        zzlm zzlm0 = this.zza;
        zzlm zzlm1 = ((zzks)object0).zza;
        if(zzlm0 == null && zzlm1 == null) {
            return this.zzb().equals(((zzks)object0).zzb());
        }
        if(zzlm0 != null && zzlm1 != null) {
            return zzlm0.equals(zzlm1);
        }
        if(zzlm0 != null) {
            ((zzks)object0).zzc(zzlm0.zzbS());
            return zzlm0.equals(((zzks)object0).zza);
        }
        this.zzc(zzlm1.zzbS());
        return this.zza.equals(zzlm1);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if(this.a != null) {
            return ((q0)this.a).b.length;
        }
        return this.zza == null ? 0 : this.zza.zzbw();
    }

    public final zzje zzb() {
        if(this.a != null) {
            return this.a;
        }
        synchronized(this) {
            if(this.a != null) {
                return this.a;
            }
            this.a = this.zza == null ? zzje.zzb : this.zza.zzbs();
            return this.a;
        }
    }

    public final void zzc(zzlm zzlm0) {
        if(this.zza != null) {
            return;
        }
        synchronized(this) {
            if(this.zza == null) {
                this.zza = zzlm0;
                this.a = zzje.zzb;
            }
        }
    }
}

