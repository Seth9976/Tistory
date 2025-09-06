package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class q implements ObjectEncoder {
    public static final q a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;
    public static final FieldDescriptor g;

    static {
        q.a = new q();  // 初始化器: Ljava/lang/Object;-><init>()V
        q.b = FieldDescriptor.of("batteryLevel");
        q.c = FieldDescriptor.of("batteryVelocity");
        q.d = FieldDescriptor.of("proximityOn");
        q.e = FieldDescriptor.of("orientation");
        q.f = FieldDescriptor.of("ramUsed");
        q.g = FieldDescriptor.of("diskUsed");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        Double double0 = ((Device)object0).getBatteryLevel();
        ((ObjectEncoderContext)object1).add(q.b, double0);
        int v = ((Device)object0).getBatteryVelocity();
        ((ObjectEncoderContext)object1).add(q.c, v);
        boolean z = ((Device)object0).isProximityOn();
        ((ObjectEncoderContext)object1).add(q.d, z);
        int v1 = ((Device)object0).getOrientation();
        ((ObjectEncoderContext)object1).add(q.e, v1);
        long v2 = ((Device)object0).getRamUsed();
        ((ObjectEncoderContext)object1).add(q.f, v2);
        long v3 = ((Device)object0).getDiskUsed();
        ((ObjectEncoderContext)object1).add(q.g, v3);
    }
}

