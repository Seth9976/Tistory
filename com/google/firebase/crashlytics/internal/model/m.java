package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class m implements ObjectEncoder {
    public static final m a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;

    static {
        m.a = new m();  // 初始化器: Ljava/lang/Object;-><init>()V
        m.b = FieldDescriptor.of("type");
        m.c = FieldDescriptor.of("reason");
        m.d = FieldDescriptor.of("frames");
        m.e = FieldDescriptor.of("causedBy");
        m.f = FieldDescriptor.of("overflowCount");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        String s = ((Exception)object0).getType();
        ((ObjectEncoderContext)object1).add(m.b, s);
        String s1 = ((Exception)object0).getReason();
        ((ObjectEncoderContext)object1).add(m.c, s1);
        ImmutableList immutableList0 = ((Exception)object0).getFrames();
        ((ObjectEncoderContext)object1).add(m.d, immutableList0);
        Exception crashlyticsReport$Session$Event$Application$Execution$Exception0 = ((Exception)object0).getCausedBy();
        ((ObjectEncoderContext)object1).add(m.e, crashlyticsReport$Session$Event$Application$Execution$Exception0);
        int v = ((Exception)object0).getOverflowCount();
        ((ObjectEncoderContext)object1).add(m.f, v);
    }
}

