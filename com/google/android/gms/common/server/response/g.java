package com.google.android.gms.common.server.response;

import java.io.BufferedReader;
import java.math.BigInteger;

public final class g implements zai {
    @Override  // com.google.android.gms.common.server.response.zai
    public final Object zaa(FastParser fastParser0, BufferedReader bufferedReader0) {
        int v = fastParser0.d(bufferedReader0, fastParser0.c);
        return v == 0 ? null : new BigInteger(new String(fastParser0.c, 0, v));
    }
}

