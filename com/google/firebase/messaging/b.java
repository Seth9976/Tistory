package com.google.firebase.messaging;

import androidx.room.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

public final class b implements ObjectEncoder {
    public static final b a;
    public static final FieldDescriptor b;

    static {
        b.a = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        b.b = a.e(1, FieldDescriptor.builder("messagingClientEvent"));
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        MessagingClientEvent messagingClientEvent0 = ((MessagingClientEventExtension)object0).getMessagingClientEventInternal();
        ((ObjectEncoderContext)object1).add(b.b, messagingClientEvent0);
    }
}

