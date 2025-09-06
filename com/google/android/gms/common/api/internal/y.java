package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;

public final class y {
    public final ApiKey a;
    public final Feature b;

    public y(ApiKey apiKey0, Feature feature0) {
        this.a = apiKey0;
        this.b = feature0;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0 instanceof y && Objects.equal(this.a, ((y)object0).a) && Objects.equal(this.b, ((y)object0).b);
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        return Objects.toStringHelper(this).add("key", this.a).add("feature", this.b).toString();
    }
}

