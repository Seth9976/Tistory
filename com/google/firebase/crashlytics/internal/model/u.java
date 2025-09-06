package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class u implements ObjectEncoder {
    public static final u a;
    public static final FieldDescriptor b;

    static {
        u.a = new u();  // 初始化器: Ljava/lang/Object;-><init>()V
        u.b = FieldDescriptor.of("identifier");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        String s = ((User)object0).getIdentifier();
        ((ObjectEncoderContext)object1).add(u.b, s);
    }
}

