package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class g implements ObjectEncoder {
    public static final g a;
    public static final FieldDescriptor b;

    static {
        g.a = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        g.b = FieldDescriptor.of("clsId");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        String s = ((Organization)object0).getClsId();
        ((ObjectEncoderContext)object1).add(g.b, s);
    }
}

