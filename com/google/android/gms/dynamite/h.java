package com.google.android.gms.dynamite;

import android.content.Context;

public final class h implements VersionPolicy {
    @Override  // com.google.android.gms.dynamite.DynamiteModule$VersionPolicy
    public final SelectionResult selectModule(Context context0, String s, IVersions dynamiteModule$VersionPolicy$IVersions0) {
        SelectionResult dynamiteModule$VersionPolicy$SelectionResult0 = new SelectionResult();
        int v = dynamiteModule$VersionPolicy$IVersions0.zza(context0, s);
        dynamiteModule$VersionPolicy$SelectionResult0.localVersion = v;
        int v1 = 0;
        int v2 = v == 0 ? dynamiteModule$VersionPolicy$IVersions0.zzb(context0, s, true) : dynamiteModule$VersionPolicy$IVersions0.zzb(context0, s, false);
        dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion = v2;
        int v3 = dynamiteModule$VersionPolicy$SelectionResult0.localVersion;
        if(v3 != 0) {
            v1 = v3;
        }
        else if(v2 == 0) {
            dynamiteModule$VersionPolicy$SelectionResult0.selection = 0;
            return dynamiteModule$VersionPolicy$SelectionResult0;
        }
        if(v2 >= v1) {
            dynamiteModule$VersionPolicy$SelectionResult0.selection = 1;
            return dynamiteModule$VersionPolicy$SelectionResult0;
        }
        dynamiteModule$VersionPolicy$SelectionResult0.selection = -1;
        return dynamiteModule$VersionPolicy$SelectionResult0;
    }
}

