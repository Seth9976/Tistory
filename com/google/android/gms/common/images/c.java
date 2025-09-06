package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

public final class c {
    public final Uri a;

    public c(Uri uri0) {
        this.a = uri0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c ? Objects.equal(((c)object0).a, this.a) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.a});
    }
}

