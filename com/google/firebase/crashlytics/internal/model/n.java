package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class n implements ObjectEncoder {
    public static final n a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;

    static {
        n.a = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
        n.b = FieldDescriptor.of("name");
        n.c = FieldDescriptor.of("code");
        n.d = FieldDescriptor.of("address");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        String s = ((Signal)object0).getName();
        ((ObjectEncoderContext)object1).add(n.b, s);
        String s1 = ((Signal)object0).getCode();
        ((ObjectEncoderContext)object1).add(n.c, s1);
        long v = ((Signal)object0).getAddress();
        ((ObjectEncoderContext)object1).add(n.d, v);
    }
}

