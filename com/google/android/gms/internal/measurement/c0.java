package com.google.android.gms.internal.measurement;

import a5.b;
import android.content.Context;

public final class c0 {
    public final Context a;
    public final zzii b;

    public c0(Context context0, zzii zzii0) {
        this.a = context0;
        this.b = zzii0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof c0 && this.a.equals(((c0)object0).a)) {
            zzii zzii0 = ((c0)object0).b;
            return this.b == null ? zzii0 == null : this.b.equals(zzii0);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? (v ^ 1000003) * 1000003 : (v ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public final String toString() {
        return b.o("FlagsContext{context=", this.a.toString(), ", hermeticFileOverrides=", String.valueOf(this.b), "}");
    }
}

