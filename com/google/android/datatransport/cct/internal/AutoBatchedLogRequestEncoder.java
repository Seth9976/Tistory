package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import s6.b;
import s6.c;
import s6.d;
import s6.f;
import s6.g;
import s6.h;

public final class AutoBatchedLogRequestEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG;

    static {
        AutoBatchedLogRequestEncoder.CONFIG = new AutoBatchedLogRequestEncoder();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig0) {
        encoderConfig0.registerEncoder(BatchedLogRequest.class, b.a);
        encoderConfig0.registerEncoder(f.class, b.a);
        encoderConfig0.registerEncoder(LogRequest.class, d.a);
        encoderConfig0.registerEncoder(h.class, d.a);
        encoderConfig0.registerEncoder(ClientInfo.class, a.a);
        encoderConfig0.registerEncoder(e.class, a.a);
        encoderConfig0.registerEncoder(AndroidClientInfo.class, s6.a.a);
        encoderConfig0.registerEncoder(s6.e.class, s6.a.a);
        encoderConfig0.registerEncoder(LogEvent.class, c.a);
        encoderConfig0.registerEncoder(g.class, c.a);
        encoderConfig0.registerEncoder(NetworkConnectionInfo.class, com.google.android.datatransport.cct.internal.b.a);
        encoderConfig0.registerEncoder(i.class, com.google.android.datatransport.cct.internal.b.a);
    }
}

