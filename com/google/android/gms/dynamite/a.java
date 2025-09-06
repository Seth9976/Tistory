package com.google.android.gms.dynamite;

import android.content.Context;

public final class a implements IVersions {
    @Override  // com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions
    public final int zza(Context context0, String s) {
        return DynamiteModule.getLocalVersion(context0, s);
    }

    @Override  // com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions
    public final int zzb(Context context0, String s, boolean z) {
        return DynamiteModule.zza(context0, s, z);
    }
}

