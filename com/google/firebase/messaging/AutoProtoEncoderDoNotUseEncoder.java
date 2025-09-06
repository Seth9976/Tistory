package com.google.firebase.messaging;

import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG;

    static {
        AutoProtoEncoderDoNotUseEncoder.CONFIG = new AutoProtoEncoderDoNotUseEncoder();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig0) {
        encoderConfig0.registerEncoder(ProtoEncoderDoNotUse.class, c.a);
        encoderConfig0.registerEncoder(MessagingClientEventExtension.class, b.a);
        encoderConfig0.registerEncoder(MessagingClientEvent.class, a.a);
    }
}

