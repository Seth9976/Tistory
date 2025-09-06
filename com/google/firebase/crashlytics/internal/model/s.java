package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class s implements ObjectEncoder {
    public static final s a;
    public static final FieldDescriptor b;

    static {
        s.a = new s();  // 初始化器: Ljava/lang/Object;-><init>()V
        s.b = FieldDescriptor.of("content");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        String s = ((Log)object0).getContent();
        ((ObjectEncoderContext)object1).add(s.b, s);
    }
}

