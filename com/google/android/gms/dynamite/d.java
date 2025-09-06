package com.google.android.gms.dynamite;

import android.content.Context;

public final class d implements VersionPolicy {
    @Override  // com.google.android.gms.dynamite.DynamiteModule$VersionPolicy
    public final SelectionResult selectModule(Context context0, String s, IVersions dynamiteModule$VersionPolicy$IVersions0) {
        SelectionResult dynamiteModule$VersionPolicy$SelectionResult0 = new SelectionResult();
        int v = dynamiteModule$VersionPolicy$IVersions0.zzb(context0, s, false);
        dynamiteModule$VersionPolicy$SelectionResult0.remoteVersion = v;
        if(v == 0) {
            dynamiteModule$VersionPolicy$SelectionResult0.selection = 0;
            return dynamiteModule$VersionPolicy$SelectionResult0;
        }
        dynamiteModule$VersionPolicy$SelectionResult0.selection = 1;
        return dynamiteModule$VersionPolicy$SelectionResult0;
    }
}

