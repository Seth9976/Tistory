package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class l implements ObjectEncoder {
    public static final l a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;

    static {
        l.a = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
        l.b = FieldDescriptor.of("threads");
        l.c = FieldDescriptor.of("exception");
        l.d = FieldDescriptor.of("appExitInfo");
        l.e = FieldDescriptor.of("signal");
        l.f = FieldDescriptor.of("binaries");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        ImmutableList immutableList0 = ((Execution)object0).getThreads();
        ((ObjectEncoderContext)object1).add(l.b, immutableList0);
        Exception crashlyticsReport$Session$Event$Application$Execution$Exception0 = ((Execution)object0).getException();
        ((ObjectEncoderContext)object1).add(l.c, crashlyticsReport$Session$Event$Application$Execution$Exception0);
        ApplicationExitInfo crashlyticsReport$ApplicationExitInfo0 = ((Execution)object0).getAppExitInfo();
        ((ObjectEncoderContext)object1).add(l.d, crashlyticsReport$ApplicationExitInfo0);
        Signal crashlyticsReport$Session$Event$Application$Execution$Signal0 = ((Execution)object0).getSignal();
        ((ObjectEncoderContext)object1).add(l.e, crashlyticsReport$Session$Event$Application$Execution$Signal0);
        ImmutableList immutableList1 = ((Execution)object0).getBinaries();
        ((ObjectEncoderContext)object1).add(l.f, immutableList1);
    }
}

