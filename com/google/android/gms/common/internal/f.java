package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;

public final class f implements ResultConverter {
    public final Response a;

    public f(Response response0) {
        this.a = response0;
    }

    @Override  // com.google.android.gms.common.internal.PendingResultUtil$ResultConverter
    public final Object convert(Result result0) {
        this.a.setResult(result0);
        return this.a;
    }
}

