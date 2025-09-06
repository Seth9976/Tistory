package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class e implements ObjectEncoder {
    public static final e a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;

    static {
        e.a = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        e.b = FieldDescriptor.of("filename");
        e.c = FieldDescriptor.of("contents");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        String s = ((File)object0).getFilename();
        ((ObjectEncoderContext)object1).add(e.b, s);
        byte[] arr_b = ((File)object0).getContents();
        ((ObjectEncoderContext)object1).add(e.c, arr_b);
    }
}

