package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class o implements ObjectEncoder {
    public static final o a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;

    static {
        o.a = new o();  // 初始化器: Ljava/lang/Object;-><init>()V
        o.b = FieldDescriptor.of("name");
        o.c = FieldDescriptor.of("importance");
        o.d = FieldDescriptor.of("frames");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        String s = ((Thread)object0).getName();
        ((ObjectEncoderContext)object1).add(o.b, s);
        int v = ((Thread)object0).getImportance();
        ((ObjectEncoderContext)object1).add(o.c, v);
        ImmutableList immutableList0 = ((Thread)object0).getFrames();
        ((ObjectEncoderContext)object1).add(o.d, immutableList0);
    }
}

