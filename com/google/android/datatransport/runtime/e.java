package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class e implements ObjectEncoder {
    public static final e a;
    public static final FieldDescriptor b;

    static {
        e.a = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        e.b = FieldDescriptor.of("clientMetrics");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        ClientMetrics clientMetrics0 = ((ProtoEncoderDoNotUse)object0).getClientMetrics();
        ((ObjectEncoderContext)object1).add(e.b, clientMetrics0);
    }
}

