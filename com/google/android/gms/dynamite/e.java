package com.google.android.gms.dynamite;

import android.content.Context;

public final class e implements VersionPolicy {
    @Override  // com.google.android.gms.dynamite.DynamiteModule$VersionPolicy
    public final SelectionResult selectModule(Context context0, String s, IVersions dynamiteModule$VersionPolicy$IVersions0) {
        SelectionResult dynamiteModule$VersionPolicy$SelectionResult0 = new SelectionResult();
        dynamiteModule$VersionPolicy$SelectionResult0.localVersion = dynamiteModule$VersionPolicy$IVersions0.zza(context0, s);
        int v = dynamiteModule$VersionPolicy$IVersions0.zzb(context0, s, true);
        dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion = v;
        int v1 = dynamiteModule$VersionPolicy$SelectionResult0.localVersion;
        if(v1 == 0 && v == 0) {
            dynamiteModule$VersionPolicy$SelectionResult0.selection = 0;
            return dynamiteModule$VersionPolicy$SelectionResult0;
        }
        if(v1 >= v) {
            dynamiteModule$VersionPolicy$SelectionResult0.selection = -1;
            return dynamiteModule$VersionPolicy$SelectionResult0;
        }
        dynamiteModule$VersionPolicy$SelectionResult0.selection = 1;
        return dynamiteModule$VersionPolicy$SelectionResult0;
    }
}

