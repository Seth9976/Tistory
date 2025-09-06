package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public abstract class zzaw {
    public final ArrayList a;

    public zzaw() {
        this.a = new ArrayList();
    }

    public final void a(String s) {
        zzbl zzbl0 = zzh.zze(s);
        if(!this.a.contains(zzbl0)) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: " + s);
    }

    public abstract zzap zza(String arg1, zzg arg2, List arg3);
}

