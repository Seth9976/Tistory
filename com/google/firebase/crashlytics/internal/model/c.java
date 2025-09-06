package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class c implements ObjectEncoder {
    public static final c a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;
    public static final FieldDescriptor g;
    public static final FieldDescriptor h;
    public static final FieldDescriptor i;

    static {
        c.a = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        c.b = FieldDescriptor.of("sdkVersion");
        c.c = FieldDescriptor.of("gmpAppId");
        c.d = FieldDescriptor.of("platform");
        c.e = FieldDescriptor.of("installationUuid");
        c.f = FieldDescriptor.of("buildVersion");
        c.g = FieldDescriptor.of("displayVersion");
        c.h = FieldDescriptor.of("session");
        c.i = FieldDescriptor.of("ndkPayload");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        String s = ((CrashlyticsReport)object0).getSdkVersion();
        ((ObjectEncoderContext)object1).add(c.b, s);
        String s1 = ((CrashlyticsReport)object0).getGmpAppId();
        ((ObjectEncoderContext)object1).add(c.c, s1);
        int v = ((CrashlyticsReport)object0).getPlatform();
        ((ObjectEncoderContext)object1).add(c.d, v);
        String s2 = ((CrashlyticsReport)object0).getInstallationUuid();
        ((ObjectEncoderContext)object1).add(c.e, s2);
        String s3 = ((CrashlyticsReport)object0).getBuildVersion();
        ((ObjectEncoderContext)object1).add(c.f, s3);
        String s4 = ((CrashlyticsReport)object0).getDisplayVersion();
        ((ObjectEncoderContext)object1).add(c.g, s4);
        Session crashlyticsReport$Session0 = ((CrashlyticsReport)object0).getSession();
        ((ObjectEncoderContext)object1).add(c.h, crashlyticsReport$Session0);
        FilesPayload crashlyticsReport$FilesPayload0 = ((CrashlyticsReport)object0).getNdkPayload();
        ((ObjectEncoderContext)object1).add(c.i, crashlyticsReport$FilesPayload0);
    }
}

