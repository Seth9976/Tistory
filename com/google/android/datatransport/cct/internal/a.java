package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

public final class a implements ObjectEncoder {
    public static final a a;
    public static final FieldDescriptor b;
    public static final FieldDescriptor c;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a.b = FieldDescriptor.of("clientType");
        a.c = FieldDescriptor.of("androidClientInfo");
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        ClientType clientInfo$ClientType0 = ((ClientInfo)object0).getClientType();
        ((ObjectEncoderContext)object1).add(a.b, clientInfo$ClientType0);
        AndroidClientInfo androidClientInfo0 = ((ClientInfo)object0).getAndroidClientInfo();
        ((ObjectEncoderContext)object1).add(a.c, androidClientInfo0);
    }
}

