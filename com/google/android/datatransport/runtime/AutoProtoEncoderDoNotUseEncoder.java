package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG;

    static {
        AutoProtoEncoderDoNotUseEncoder.CONFIG = new AutoProtoEncoderDoNotUseEncoder();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig0) {
        encoderConfig0.registerEncoder(ProtoEncoderDoNotUse.class, e.a);
        encoderConfig0.registerEncoder(ClientMetrics.class, a.a);
        encoderConfig0.registerEncoder(TimeWindow.class, g.a);
        encoderConfig0.registerEncoder(LogSourceMetrics.class, d.a);
        encoderConfig0.registerEncoder(LogEventDropped.class, c.a);
        encoderConfig0.registerEncoder(GlobalMetrics.class, b.a);
        encoderConfig0.registerEncoder(StorageMetrics.class, f.a);
    }
}

