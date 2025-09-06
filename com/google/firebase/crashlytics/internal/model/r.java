package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class r implements ObjectEncoder {
    public static final r a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;

    static {
        r.a = new r();  // 初始化器: Ljava/lang/Object;-><init>()V
        r.b = FieldDescriptor.of("timestamp");
        r.c = FieldDescriptor.of("type");
        r.d = FieldDescriptor.of("app");
        r.e = FieldDescriptor.of("device");
        r.f = FieldDescriptor.of("log");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        long v = ((Event)object0).getTimestamp();
        ((ObjectEncoderContext)object1).add(r.b, v);
        String s = ((Event)object0).getType();
        ((ObjectEncoderContext)object1).add(r.c, s);
        Application crashlyticsReport$Session$Event$Application0 = ((Event)object0).getApp();
        ((ObjectEncoderContext)object1).add(r.d, crashlyticsReport$Session$Event$Application0);
        Device crashlyticsReport$Session$Event$Device0 = ((Event)object0).getDevice();
        ((ObjectEncoderContext)object1).add(r.e, crashlyticsReport$Session$Event$Device0);
        Log crashlyticsReport$Session$Event$Log0 = ((Event)object0).getLog();
        ((ObjectEncoderContext)object1).add(r.f, crashlyticsReport$Session$Event$Log0);
    }
}

