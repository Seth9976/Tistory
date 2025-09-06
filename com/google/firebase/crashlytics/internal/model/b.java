package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class b implements ObjectEncoder {
    public static final b a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        b.b = FieldDescriptor.of("key");
        b.c = FieldDescriptor.of("value");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        String s = ((CustomAttribute)object0).getKey();
        ((ObjectEncoderContext)object1).add(b.b, s);
        String s1 = ((CustomAttribute)object0).getValue();
        ((ObjectEncoderContext)object1).add(b.c, s1);
    }
}

