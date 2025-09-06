package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class j implements ObjectEncoder {
    public static final j a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;

    static {
        j.a = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
        j.b = FieldDescriptor.of("execution");
        j.c = FieldDescriptor.of("customAttributes");
        j.d = FieldDescriptor.of("internalKeys");
        j.e = FieldDescriptor.of("background");
        j.f = FieldDescriptor.of("uiOrientation");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        Execution crashlyticsReport$Session$Event$Application$Execution0 = ((Application)object0).getExecution();
        ((ObjectEncoderContext)object1).add(j.b, crashlyticsReport$Session$Event$Application$Execution0);
        ImmutableList immutableList0 = ((Application)object0).getCustomAttributes();
        ((ObjectEncoderContext)object1).add(j.c, immutableList0);
        ImmutableList immutableList1 = ((Application)object0).getInternalKeys();
        ((ObjectEncoderContext)object1).add(j.d, immutableList1);
        Boolean boolean0 = ((Application)object0).getBackground();
        ((ObjectEncoderContext)object1).add(j.e, boolean0);
        int v = ((Application)object0).getUiOrientation();
        ((ObjectEncoderContext)object1).add(j.f, v);
    }
}

