package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

public final class ApiKey {
    public final int a;
    public final Api b;
    public final ApiOptions c;
    public final String d;

    public ApiKey(Api api0, ApiOptions api$ApiOptions0, String s) {
        this.b = api0;
        this.c = api$ApiOptions0;
        this.d = s;
        this.a = Objects.hashCode(new Object[]{api0, api$ApiOptions0, s});
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(object0 == null) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        return object0 instanceof ApiKey ? Objects.equal(this.b, ((ApiKey)object0).b) && Objects.equal(this.c, ((ApiKey)object0).c) && Objects.equal(this.d, ((ApiKey)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @NonNull
    public static ApiKey zaa(@NonNull Api api0, @Nullable ApiOptions api$ApiOptions0, @Nullable String s) {
        return new ApiKey(api0, api$ApiOptions0, s);
    }

    @NonNull
    public final String zab() {
        return this.b.zad();
    }
}

