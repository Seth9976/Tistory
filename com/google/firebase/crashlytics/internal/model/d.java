package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class d implements ObjectEncoder {
    public static final d a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;

    static {
        d.a = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        d.b = FieldDescriptor.of("files");
        d.c = FieldDescriptor.of("orgId");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        ImmutableList immutableList0 = ((FilesPayload)object0).getFiles();
        ((ObjectEncoderContext)object1).add(d.b, immutableList0);
        String s = ((FilesPayload)object0).getOrgId();
        ((ObjectEncoderContext)object1).add(d.c, s);
    }
}

