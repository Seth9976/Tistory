package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class k implements ObjectEncoder {
    public static final k a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;

    static {
        k.a = new k();  // 初始化器: Ljava/lang/Object;-><init>()V
        k.b = FieldDescriptor.of("baseAddress");
        k.c = FieldDescriptor.of("size");
        k.d = FieldDescriptor.of("name");
        k.e = FieldDescriptor.of("uuid");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        long v = ((BinaryImage)object0).getBaseAddress();
        ((ObjectEncoderContext)object1).add(k.b, v);
        long v1 = ((BinaryImage)object0).getSize();
        ((ObjectEncoderContext)object1).add(k.c, v1);
        String s = ((BinaryImage)object0).getName();
        ((ObjectEncoderContext)object1).add(k.d, s);
        byte[] arr_b = ((BinaryImage)object0).getUuidUtf8Bytes();
        ((ObjectEncoderContext)object1).add(k.e, arr_b);
    }
}

