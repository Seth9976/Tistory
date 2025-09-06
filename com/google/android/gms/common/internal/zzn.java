package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;

public final class zzn {
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;
    public static final Uri f;

    static {
        zzn.f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    }

    public zzn(ComponentName componentName0, int v) {
        this.a = null;
        this.b = null;
        Preconditions.checkNotNull(componentName0);
        this.c = componentName0;
        this.d = v;
        this.e = false;
    }

    public zzn(String s, int v, boolean z) {
        this(s, "com.google.android.gms", v, false);
    }

    public zzn(String s, String s1, int v, boolean z) {
        Preconditions.checkNotEmpty(s);
        this.a = s;
        Preconditions.checkNotEmpty(s1);
        this.b = s1;
        this.c = null;
        this.d = v;
        this.e = z;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzn ? Objects.equal(this.a, ((zzn)object0).a) && Objects.equal(this.b, ((zzn)object0).b) && Objects.equal(this.c, ((zzn)object0).c) && this.d == ((zzn)object0).d && this.e == ((zzn)object0).e : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e)});
    }

    @Override
    public final String toString() {
        String s = this.a;
        if(s == null) {
            Preconditions.checkNotNull(this.c);
            return this.c.flattenToString();
        }
        return s;
    }

    public final int zza() {
        return this.d;
    }

    @Nullable
    public final ComponentName zzb() {
        return this.c;
    }

    public final Intent zzc(Context context0) {
        Bundle bundle1;
        Intent intent0 = null;
        String s = this.a;
        if(s != null) {
            if(this.e) {
                Bundle bundle0 = new Bundle();
                bundle0.putString("serviceActionBundleKey", s);
                try {
                    bundle1 = context0.getContentResolver().call(zzn.f, "serviceIntentCall", null, bundle0);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: " + illegalArgumentException0.toString());
                    bundle1 = null;
                }
                if(bundle1 != null) {
                    intent0 = (Intent)bundle1.getParcelable("serviceResponseIntentKey");
                }
                if(intent0 == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: " + s);
                }
            }
            return intent0 == null ? new Intent(s).setPackage(this.b) : intent0;
        }
        return new Intent().setComponent(this.c);
    }

    @Nullable
    public final String zzd() {
        return this.b;
    }
}

