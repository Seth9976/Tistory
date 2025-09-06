package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class c0 {
    public long A;
    public String B;
    public boolean C;
    public long D;
    public long E;
    public final zzfr a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public long i;
    public String j;
    public long k;
    public String l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public String q;
    public Boolean r;
    public long s;
    public ArrayList t;
    public String u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public c0(zzfr zzfr0, String s) {
        Preconditions.checkNotNull(zzfr0);
        Preconditions.checkNotEmpty(s);
        this.a = zzfr0;
        this.b = s;
        zzfr0.zzaz().zzg();
    }

    public final String A() {
        this.a.zzaz().zzg();
        return this.d;
    }

    public final void a() {
        zzfr zzfr0 = this.a;
        zzfr0.zzaz().zzg();
        long v = this.g + 1L;
        if(v > 0x7FFFFFFFL) {
            zzfr0.zzay().zzk().zzb("Bundle index overflow. appId", zzeh.zzn(this.b));
            v = 0L;
        }
        this.C = true;
        this.g = v;
    }

    public final void b(String s) {
        this.a.zzaz().zzg();
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.C |= true ^ zzg.zza(this.q, s);
        this.q = s;
    }

    public final void c(String s) {
        this.a.zzaz().zzg();
        this.C |= !zzg.zza(this.c, s);
        this.c = s;
    }

    public final void d(String s) {
        this.a.zzaz().zzg();
        this.C |= !zzg.zza(this.l, s);
        this.l = s;
    }

    public final void e(String s) {
        this.a.zzaz().zzg();
        this.C |= !zzg.zza(this.j, s);
        this.j = s;
    }

    public final void f(long v) {
        this.a.zzaz().zzg();
        this.C |= this.k != v;
        this.k = v;
    }

    public final void g(long v) {
        this.a.zzaz().zzg();
        this.C |= this.D != v;
        this.D = v;
    }

    public final void h(long v) {
        this.a.zzaz().zzg();
        this.C |= this.n != v;
        this.n = v;
    }

    public final void i(long v) {
        this.a.zzaz().zzg();
        this.C |= this.s != v;
        this.s = v;
    }

    public final void j(String s) {
        this.a.zzaz().zzg();
        this.C |= !zzg.zza(this.f, s);
        this.f = s;
    }

    public final void k(String s) {
        this.a.zzaz().zzg();
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.C |= true ^ zzg.zza(this.d, s);
        this.d = s;
    }

    public final void l(long v) {
        this.a.zzaz().zzg();
        this.C |= this.m != v;
        this.m = v;
    }

    public final void m(String s) {
        this.a.zzaz().zzg();
        this.C |= !zzg.zza(this.B, s);
        this.B = s;
    }

    public final void n(long v) {
        this.a.zzaz().zzg();
        this.C |= this.i != v;
        this.i = v;
    }

    public final void o(long v) {
        boolean z = false;
        Preconditions.checkArgument(Long.compare(v, 0L) >= 0);
        this.a.zzaz().zzg();
        boolean z1 = this.C;
        if(this.g != v) {
            z = true;
        }
        this.C = z1 | z;
        this.g = v;
    }

    public final void p(long v) {
        this.a.zzaz().zzg();
        this.C |= this.h != v;
        this.h = v;
    }

    public final void q(boolean z) {
        this.a.zzaz().zzg();
        this.C |= this.o != z;
        this.o = z;
    }

    public final void r(String s) {
        this.a.zzaz().zzg();
        this.C |= !zzg.zza(this.e, s);
        this.e = s;
    }

    public final void s(List list0) {
        this.a.zzaz().zzg();
        if(!zzg.zza(this.t, list0)) {
            this.C = true;
            this.t = list0 == null ? null : new ArrayList(list0);
        }
    }

    public final long t() {
        this.a.zzaz().zzg();
        return this.k;
    }

    public final String u() {
        this.a.zzaz().zzg();
        return this.q;
    }

    public final String v() {
        this.a.zzaz().zzg();
        String s = this.B;
        this.m(null);
        return s;
    }

    public final String w() {
        this.a.zzaz().zzg();
        return this.b;
    }

    public final String x() {
        this.a.zzaz().zzg();
        return this.c;
    }

    public final String y() {
        this.a.zzaz().zzg();
        return this.j;
    }

    public final String z() {
        this.a.zzaz().zzg();
        return this.f;
    }
}

