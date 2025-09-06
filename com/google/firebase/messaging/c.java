package com.google.firebase.messaging;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

public final class c implements ObjectEncoder {
    public static final c a;
    public static final FieldDescriptor b;

    static {
        c.a = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        c.b = FieldDescriptor.of("messagingClientEventExtension");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        MessagingClientEventExtension messagingClientEventExtension0 = ((ProtoEncoderDoNotUse)object0).getMessagingClientEventExtension();
        ((ObjectEncoderContext)object1).add(c.b, messagingClientEventExtension0);
    }
}

