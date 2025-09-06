package com.google.android.gms.internal.common;

import androidx.appcompat.view.menu.f;
import j7.h;
import j7.i;
import j7.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jspecify.nullness.NullMarked;

@NullMarked
public final class zzx {
    public final h a;
    public final boolean b;
    public final f c;

    public zzx(f f0, boolean z, h h0) {
        this.c = f0;
        this.b = z;
        this.a = h0;
    }

    public final zzx zzb() {
        return new zzx(this.c, true, this.a);
    }

    public static zzx zzc(zzo zzo0) {
        return new zzx(new f(zzo0, 21), false, h.b);
    }

    public final Iterable zzd(CharSequence charSequence0) {
        return new j(this, charSequence0);
    }

    public final List zzf(CharSequence charSequence0) {
        charSequence0.getClass();
        i i0 = new i(this.c, this, charSequence0);
        ArrayList arrayList0 = new ArrayList();
        while(i0.hasNext()) {
            arrayList0.add(((String)i0.next()));
        }
        return Collections.unmodifiableList(arrayList0);
    }
}

