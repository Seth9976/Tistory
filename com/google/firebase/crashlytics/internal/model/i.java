package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class i implements ObjectEncoder {
    public static final i a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;
    public static final FieldDescriptor g;
    public static final FieldDescriptor h;
    public static final FieldDescriptor i;
    public static final FieldDescriptor j;
    public static final FieldDescriptor k;
    public static final FieldDescriptor l;

    static {
        i.a = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
        i.b = FieldDescriptor.of("generator");
        i.c = FieldDescriptor.of("identifier");
        i.d = FieldDescriptor.of("startedAt");
        i.e = FieldDescriptor.of("endedAt");
        i.f = FieldDescriptor.of("crashed");
        i.g = FieldDescriptor.of("app");
        i.h = FieldDescriptor.of("user");
        i.i = FieldDescriptor.of("os");
        i.j = FieldDescriptor.of("device");
        i.k = FieldDescriptor.of("events");
        i.l = FieldDescriptor.of("generatorType");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        String s = ((Session)object0).getGenerator();
        ((ObjectEncoderContext)object1).add(i.b, s);
        byte[] arr_b = ((Session)object0).getIdentifierUtf8Bytes();
        ((ObjectEncoderContext)object1).add(i.c, arr_b);
        long v = ((Session)object0).getStartedAt();
        ((ObjectEncoderContext)object1).add(i.d, v);
        Long long0 = ((Session)object0).getEndedAt();
        ((ObjectEncoderContext)object1).add(i.e, long0);
        boolean z = ((Session)object0).isCrashed();
        ((ObjectEncoderContext)object1).add(i.f, z);
        Application crashlyticsReport$Session$Application0 = ((Session)object0).getApp();
        ((ObjectEncoderContext)object1).add(i.g, crashlyticsReport$Session$Application0);
        User crashlyticsReport$Session$User0 = ((Session)object0).getUser();
        ((ObjectEncoderContext)object1).add(i.h, crashlyticsReport$Session$User0);
        OperatingSystem crashlyticsReport$Session$OperatingSystem0 = ((Session)object0).getOs();
        ((ObjectEncoderContext)object1).add(i.i, crashlyticsReport$Session$OperatingSystem0);
        Device crashlyticsReport$Session$Device0 = ((Session)object0).getDevice();
        ((ObjectEncoderContext)object1).add(i.j, crashlyticsReport$Session$Device0);
        ImmutableList immutableList0 = ((Session)object0).getEvents();
        ((ObjectEncoderContext)object1).add(i.k, immutableList0);
        int v1 = ((Session)object0).getGeneratorType();
        ((ObjectEncoderContext)object1).add(i.l, v1);
    }
}

