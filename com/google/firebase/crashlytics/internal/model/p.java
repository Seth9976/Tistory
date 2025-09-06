package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class p implements ObjectEncoder {
    public static final p a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;

    static {
        p.a = new p();  // 初始化器: Ljava/lang/Object;-><init>()V
        p.b = FieldDescriptor.of("pc");
        p.c = FieldDescriptor.of("symbol");
        p.d = FieldDescriptor.of("file");
        p.e = FieldDescriptor.of("offset");
        p.f = FieldDescriptor.of("importance");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        long v = ((Frame)object0).getPc();
        ((ObjectEncoderContext)object1).add(p.b, v);
        String s = ((Frame)object0).getSymbol();
        ((ObjectEncoderContext)object1).add(p.c, s);
        String s1 = ((Frame)object0).getFile();
        ((ObjectEncoderContext)object1).add(p.d, s1);
        long v1 = ((Frame)object0).getOffset();
        ((ObjectEncoderContext)object1).add(p.e, v1);
        int v2 = ((Frame)object0).getImportance();
        ((ObjectEncoderContext)object1).add(p.f, v2);
    }
}

