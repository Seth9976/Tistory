package com.google.android.gms.internal.measurement;

import a5.b;
import java.util.HashMap;
import java.util.Map;

public final class zzaa {
    public String a;
    public final long b;
    public final HashMap c;

    public zzaa(String s, long v, Map map0) {
        this.a = s;
        this.b = v;
        HashMap hashMap0 = new HashMap();
        this.c = hashMap0;
        if(map0 != null) {
            hashMap0.putAll(map0);
        }
    }

    @Override
    public final Object clone() throws CloneNotSupportedException {
        return this.zzb();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzaa)) {
            return false;
        }
        if(this.b != ((zzaa)object0).b) {
            return false;
        }
        return this.a.equals(((zzaa)object0).a) ? this.c.equals(((zzaa)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = b.v("Event{name=\'", this.a, "\', timestamp=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", params=");
        stringBuilder0.append(this.c.toString());
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    public final long zza() {
        return this.b;
    }

    public final zzaa zzb() {
        String s = this.a;
        HashMap hashMap0 = new HashMap(this.c);
        return new zzaa(s, this.b, hashMap0);
    }

    // 去混淆评级： 低(20)
    public final Object zzc(String s) {
        return this.c.containsKey(s) ? this.c.get(s) : null;
    }

    public final String zzd() {
        return this.a;
    }

    public final Map zze() {
        return this.c;
    }

    public final void zzf(String s) {
        this.a = s;
    }

    public final void zzg(String s, Object object0) {
        HashMap hashMap0 = this.c;
        if(object0 == null) {
            hashMap0.remove(s);
            return;
        }
        hashMap0.put(s, object0);
    }
}

