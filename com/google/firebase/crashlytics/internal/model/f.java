package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class f implements ObjectEncoder {
    public static final f a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;
    public static final FieldDescriptor d;
    public static final FieldDescriptor e;
    public static final FieldDescriptor f;
    public static final FieldDescriptor g;
    public static final FieldDescriptor h;

    static {
        f.a = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
        f.b = FieldDescriptor.of("identifier");
        f.c = FieldDescriptor.of("version");
        f.d = FieldDescriptor.of("displayVersion");
        f.e = FieldDescriptor.of("organization");
        f.f = FieldDescriptor.of("installationUuid");
        f.g = FieldDescriptor.of("developmentPlatform");
        f.h = FieldDescriptor.of("developmentPlatformVersion");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        String s = ((Application)object0).getIdentifier();
        ((ObjectEncoderContext)object1).add(f.b, s);
        String s1 = ((Application)object0).getVersion();
        ((ObjectEncoderContext)object1).add(f.c, s1);
        String s2 = ((Application)object0).getDisplayVersion();
        ((ObjectEncoderContext)object1).add(f.d, s2);
        Organization crashlyticsReport$Session$Application$Organization0 = ((Application)object0).getOrganization();
        ((ObjectEncoderContext)object1).add(f.e, crashlyticsReport$Session$Application$Organization0);
        String s3 = ((Application)object0).getInstallationUuid();
        ((ObjectEncoderContext)object1).add(f.f, s3);
        String s4 = ((Application)object0).getDevelopmentPlatform();
        ((ObjectEncoderContext)object1).add(f.g, s4);
        String s5 = ((Application)object0).getDevelopmentPlatformVersion();
        ((ObjectEncoderContext)object1).add(f.h, s5);
    }
}

