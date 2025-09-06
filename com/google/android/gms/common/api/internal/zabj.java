package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zap;
import java.util.concurrent.ExecutorService;

public final class zabj {
    public static final ExecutorService a;

    static {
        zabj.a = zap.zaa().zac(2, new NumberedThreadFactory("GAC_Executor"), 2);
    }

    public static ExecutorService zaa() {
        return zabj.a;
    }
}

