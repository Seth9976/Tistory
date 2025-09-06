package j7;

import com.google.android.gms.internal.common.zzag;
import com.google.android.gms.internal.common.zzs;
import java.util.List;

public final class c extends zzag {
    public final transient int c;
    public final transient int d;
    public final zzag e;

    public c(zzag zzag0, int v, int v1) {
        this.e = zzag0;
        super();
        this.c = v;
        this.d = v1;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final int b() {
        return this.e.c() + this.c + this.d;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final int c() {
        return this.e.c() + this.c;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final boolean d() {
        return true;
    }

    @Override  // com.google.android.gms.internal.common.zzac
    public final Object[] e() {
        return this.e.e();
    }

    @Override
    public final Object get(int v) {
        zzs.zza(v, this.d, "index");
        return this.e.get(v + this.c);
    }

    @Override
    public final int size() {
        return this.d;
    }

    @Override  // com.google.android.gms.internal.common.zzag
    public final List subList(int v, int v1) {
        return this.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.common.zzag
    public final zzag zzh(int v, int v1) {
        zzs.zzc(v, v1, this.d);
        return this.e.zzh(v + this.c, v1 + this.c);
    }
}

