package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class h implements ObjectEncoder {
    public static final h a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;
    public static final FieldDescriptor g;
    public static final FieldDescriptor h;
    public static final FieldDescriptor i;
    public static final FieldDescriptor j;

    static {
        h.a = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
        h.b = FieldDescriptor.of("arch");
        h.c = FieldDescriptor.of("model");
        h.d = FieldDescriptor.of("cores");
        h.e = FieldDescriptor.of("ram");
        h.f = FieldDescriptor.of("diskSpace");
        h.g = FieldDescriptor.of("simulator");
        h.h = FieldDescriptor.of("state");
        h.i = FieldDescriptor.of("manufacturer");
        h.j = FieldDescriptor.of("modelClass");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        int v = ((Device)object0).getArch();
        ((ObjectEncoderContext)object1).add(h.b, v);
        String s = ((Device)object0).getModel();
        ((ObjectEncoderContext)object1).add(h.c, s);
        int v1 = ((Device)object0).getCores();
        ((ObjectEncoderContext)object1).add(h.d, v1);
        long v2 = ((Device)object0).getRam();
        ((ObjectEncoderContext)object1).add(h.e, v2);
        long v3 = ((Device)object0).getDiskSpace();
        ((ObjectEncoderContext)object1).add(h.f, v3);
        boolean z = ((Device)object0).isSimulator();
        ((ObjectEncoderContext)object1).add(h.g, z);
        int v4 = ((Device)object0).getState();
        ((ObjectEncoderContext)object1).add(h.h, v4);
        String s1 = ((Device)object0).getManufacturer();
        ((ObjectEncoderContext)object1).add(h.i, s1);
        String s2 = ((Device)object0).getModelClass();
        ((ObjectEncoderContext)object1).add(h.j, s2);
    }
}

