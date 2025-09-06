package com.google.android.gms.dynamite;

import android.content.Context;

public final class i implements IVersions {
    public final int a;

    public i(int v) {
        this.a = v;
    }

    @Override  // com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions
    public final int zza(Context context0, String s) {
        return this.a;
    }

    @Override  // com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions
    public final int zzb(Context context0, String s, boolean z) {
        return 0;
    }
}

