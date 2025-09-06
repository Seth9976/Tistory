package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class b implements ObjectEncoder {
    public static final b a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        b.b = FieldDescriptor.of("networkType");
        b.c = FieldDescriptor.of("mobileSubtype");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        NetworkType networkConnectionInfo$NetworkType0 = ((NetworkConnectionInfo)object0).getNetworkType();
        ((ObjectEncoderContext)object1).add(b.b, networkConnectionInfo$NetworkType0);
        MobileSubtype networkConnectionInfo$MobileSubtype0 = ((NetworkConnectionInfo)object0).getMobileSubtype();
        ((ObjectEncoderContext)object1).add(b.c, networkConnectionInfo$MobileSubtype0);
    }
}

