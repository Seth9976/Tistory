package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

public final class x0 {
    public final t1 a;
    public boolean b;
    public static final int c;

    static {
        new x0(0);
    }

    public x0() {
        this.a = new t1(16);
    }

    public x0(int v) {
        t1 t10 = new t1(0);
        super();
        this.a = t10;
        this.a();
        this.a();
    }

    public final void a() {
        t1 t10;
        if(!this.b) {
            for(int v1 = 0; true; ++v1) {
                t10 = this.a;
                if(v1 >= t10.b.size()) {
                    break;
                }
                Map.Entry map$Entry0 = (Map.Entry)t10.b.get(v1);
                if(map$Entry0.getValue() instanceof zzkf) {
                    ((zzkf)map$Entry0.getValue()).zzbJ();
                }
            }
            if(!t10.d) {
                for(int v = 0; v < t10.b.size(); ++v) {
                    Map.Entry map$Entry1 = (Map.Entry)t10.b.get(v);
                    if(((zzjv)map$Entry1.getKey()).zzc()) {
                        map$Entry1.setValue(Collections.unmodifiableList(((List)map$Entry1.getValue())));
                    }
                }
                v1 v10 = t10.c.isEmpty() ? n0.b : t10.c.entrySet();
                for(Object object0: v10) {
                    Map.Entry map$Entry2 = (Map.Entry)object0;
                    if(((zzjv)map$Entry2.getKey()).zzc()) {
                        map$Entry2.setValue(Collections.unmodifiableList(((List)map$Entry2.getValue())));
                    }
                }
            }
            if(!t10.d) {
                t10.c = t10.c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(t10.c);
                t10.f = t10.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(t10.f);
                t10.d = true;
            }
            this.b = true;
        }
    }

    public final void b(zzjv zzjv0, Object object0) {
        if(zzjv0.zzc()) {
            if(!(object0 instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(((List)object0));
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                x0.c(zzjv0, arrayList0.get(v1));
            }
            object0 = arrayList0;
        }
        else {
            x0.c(zzjv0, object0);
        }
        this.a.a(zzjv0, object0);
    }

    public static final void c(zzjv zzjv0, Object object0) {
        boolean z;
        zzne zzne0 = zzjv0.zzb();
        object0.getClass();
        switch(zzne0.zza().ordinal()) {
            case 0: {
                z = object0 instanceof Integer;
                goto label_15;
            }
            case 1: {
                z = object0 instanceof Long;
                goto label_15;
            }
            case 2: {
                z = object0 instanceof Float;
                goto label_15;
            }
            case 3: {
                z = object0 instanceof Double;
                goto label_15;
            }
            case 4: {
                z = object0 instanceof Boolean;
                goto label_15;
            }
            case 5: {
                z = object0 instanceof String;
            label_15:
                if(z) {
                    return;
                }
                break;
            }
            case 6: {
                if(object0 instanceof zzje || object0 instanceof byte[]) {
                    return;
                }
                break;
            }
            case 7: {
                if(object0 instanceof Integer || object0 instanceof zzkh) {
                    return;
                }
                break;
            }
            case 8: {
                if(object0 instanceof zzlm || object0 instanceof zzkr) {
                    return;
                }
            }
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", zzjv0.zza(), zzjv0.zzb().zza(), object0.getClass().getName()));
    }

    @Override
    public final Object clone() {
        t1 t10;
        x0 x00 = new x0();
        for(int v = 0; true; ++v) {
            t10 = this.a;
            if(v >= t10.b.size()) {
                break;
            }
            Map.Entry map$Entry0 = (Map.Entry)t10.b.get(v);
            x00.b(((zzjv)map$Entry0.getKey()), map$Entry0.getValue());
        }
        v1 v10 = t10.c.isEmpty() ? n0.b : t10.c.entrySet();
        for(Object object0: v10) {
            x00.b(((zzjv)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        return x00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof x0 ? this.a.equals(((x0)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

