package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

public final class c implements zai {
    @Override  // com.google.android.gms.common.server.response.zai
    public final Object zaa(FastParser fastParser0, BufferedReader bufferedReader0) {
        int v = fastParser0.d(bufferedReader0, fastParser0.c);
        return v == 0 ? 0.0f : Float.parseFloat(new String(fastParser0.c, 0, v));
    }
}

