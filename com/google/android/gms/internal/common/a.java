package com.google.android.gms.internal.common;

public final class a extends zzag {
    public final transient Object[] c;
    public final transient int d;
    public static final a e;

    static {
        a.e = new a(new Object[0], 0);
    }

    public a(Object[] arr_object, int v) {
        this.c = arr_object;
        this.d = v;
    }

    @Override  // com.google.android.gms.internal.common.zzag
    public final void a(Object[] arr_object) {
        System.arraycopy(this.c, 0, arr_object, 0, this.d);
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final int b() {
        return this.d;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final int c() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final boolean d() {
        return false;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final Object[] e() {
        return this.c;
    }

    @Override
    public final Object get(int v) {
        zzs.zza(v, this.d, "index");
        Object object0 = this.c[v];
        object0.getClass();
        return object0;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

