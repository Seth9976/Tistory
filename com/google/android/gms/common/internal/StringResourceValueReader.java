package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.R.string;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class StringResourceValueReader {
    public final Resources a;
    public final String b;

    public StringResourceValueReader(@NonNull Context context0) {
        Preconditions.checkNotNull(context0);
        Resources resources0 = context0.getResources();
        this.a = resources0;
        this.b = resources0.getResourcePackageName(string.common_google_play_services_unknown_issue);
    }

    @Nullable
    @KeepForSdk
    public String getString(@NonNull String s) {
        int v = this.a.getIdentifier(s, "string", this.b);
        return v == 0 ? null : this.a.getString(v);
    }
}

