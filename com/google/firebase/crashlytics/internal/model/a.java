package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class a implements ObjectEncoder {
    public static final a a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;
    public static final FieldDescriptor g;
    public static final FieldDescriptor h;
    public static final FieldDescriptor i;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a.b = FieldDescriptor.of("pid");
        a.c = FieldDescriptor.of("processName");
        a.d = FieldDescriptor.of("reasonCode");
        a.e = FieldDescriptor.of("importance");
        a.f = FieldDescriptor.of("pss");
        a.g = FieldDescriptor.of("rss");
        a.h = FieldDescriptor.of("timestamp");
        a.i = FieldDescriptor.of("traceFile");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        int v = ((ApplicationExitInfo)object0).getPid();
        ((ObjectEncoderContext)object1).add(a.b, v);
        String s = ((ApplicationExitInfo)object0).getProcessName();
        ((ObjectEncoderContext)object1).add(a.c, s);
        int v1 = ((ApplicationExitInfo)object0).getReasonCode();
        ((ObjectEncoderContext)object1).add(a.d, v1);
        int v2 = ((ApplicationExitInfo)object0).getImportance();
        ((ObjectEncoderContext)object1).add(a.e, v2);
        long v3 = ((ApplicationExitInfo)object0).getPss();
        ((ObjectEncoderContext)object1).add(a.f, v3);
        long v4 = ((ApplicationExitInfo)object0).getRss();
        ((ObjectEncoderContext)object1).add(a.g, v4);
        long v5 = ((ApplicationExitInfo)object0).getTimestamp();
        ((ObjectEncoderContext)object1).add(a.h, v5);
        String s1 = ((ApplicationExitInfo)object0).getTraceFile();
        ((ObjectEncoderContext)object1).add(a.i, s1);
    }
}

