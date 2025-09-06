package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class t implements ObjectEncoder {
    public static final t a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;

    static {
        t.a = new t();  // 初始化器: Ljava/lang/Object;-><init>()V
        t.b = FieldDescriptor.of("platform");
        t.c = FieldDescriptor.of("version");
        t.d = FieldDescriptor.of("buildVersion");
        t.e = FieldDescriptor.of("jailbroken");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        int v = ((OperatingSystem)object0).getPlatform();
        ((ObjectEncoderContext)object1).add(t.b, v);
        String s = ((OperatingSystem)object0).getVersion();
        ((ObjectEncoderContext)object1).add(t.c, s);
        String s1 = ((OperatingSystem)object0).getBuildVersion();
        ((ObjectEncoderContext)object1).add(t.d, s1);
        boolean z = ((OperatingSystem)object0).isJailbroken();
        ((ObjectEncoderContext)object1).add(t.e, z);
    }
}

