package com.google.firebase.messaging;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.messaging.reporting.MessagingClientEvent.Event;
import com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType;
import com.google.firebase.messaging.reporting.MessagingClientEvent.SDKPlatform;
import com.google.firebase.messaging.reporting.MessagingClientEvent;

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
    public static final FieldDescriptor j;
    public static final FieldDescriptor k;
    public static final FieldDescriptor l;
    public static final FieldDescriptor m;
    public static final FieldDescriptor n;
    public static final FieldDescriptor o;
    public static final FieldDescriptor p;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a.b = androidx.room.a.e(1, FieldDescriptor.builder("projectNumber"));
        a.c = androidx.room.a.e(2, FieldDescriptor.builder("messageId"));
        a.d = androidx.room.a.e(3, FieldDescriptor.builder("instanceId"));
        a.e = androidx.room.a.e(4, FieldDescriptor.builder("messageType"));
        a.f = androidx.room.a.e(5, FieldDescriptor.builder("sdkPlatform"));
        a.g = androidx.room.a.e(6, FieldDescriptor.builder("packageName"));
        a.h = androidx.room.a.e(7, FieldDescriptor.builder("collapseKey"));
        a.i = androidx.room.a.e(8, FieldDescriptor.builder("priority"));
        a.j = androidx.room.a.e(9, FieldDescriptor.builder("ttl"));
        a.k = androidx.room.a.e(10, FieldDescriptor.builder("topic"));
        a.l = androidx.room.a.e(11, FieldDescriptor.builder("bulkId"));
        a.m = androidx.room.a.e(12, FieldDescriptor.builder("event"));
        a.n = androidx.room.a.e(13, FieldDescriptor.builder("analyticsLabel"));
        a.o = androidx.room.a.e(14, FieldDescriptor.builder("campaignId"));
        a.p = androidx.room.a.e(15, FieldDescriptor.builder("composerLabel"));
    }

    @Override  // com.google.firebase.encoders.Encoder
    public final void encode(Object object0, Object object1) {
        long v = ((MessagingClientEvent)object0).getProjectNumber();
        ((ObjectEncoderContext)object1).add(a.b, v);
        String s = ((MessagingClientEvent)object0).getMessageId();
        ((ObjectEncoderContext)object1).add(a.c, s);
        String s1 = ((MessagingClientEvent)object0).getInstanceId();
        ((ObjectEncoderContext)object1).add(a.d, s1);
        MessageType messagingClientEvent$MessageType0 = ((MessagingClientEvent)object0).getMessageType();
        ((ObjectEncoderContext)object1).add(a.e, messagingClientEvent$MessageType0);
        SDKPlatform messagingClientEvent$SDKPlatform0 = ((MessagingClientEvent)object0).getSdkPlatform();
        ((ObjectEncoderContext)object1).add(a.f, messagingClientEvent$SDKPlatform0);
        String s2 = ((MessagingClientEvent)object0).getPackageName();
        ((ObjectEncoderContext)object1).add(a.g, s2);
        String s3 = ((MessagingClientEvent)object0).getCollapseKey();
        ((ObjectEncoderContext)object1).add(a.h, s3);
        int v1 = ((MessagingClientEvent)object0).getPriority();
        ((ObjectEncoderContext)object1).add(a.i, v1);
        int v2 = ((MessagingClientEvent)object0).getTtl();
        ((ObjectEncoderContext)object1).add(a.j, v2);
        String s4 = ((MessagingClientEvent)object0).getTopic();
        ((ObjectEncoderContext)object1).add(a.k, s4);
        long v3 = ((MessagingClientEvent)object0).getBulkId();
        ((ObjectEncoderContext)object1).add(a.l, v3);
        Event messagingClientEvent$Event0 = ((MessagingClientEvent)object0).getEvent();
        ((ObjectEncoderContext)object1).add(a.m, messagingClientEvent$Event0);
        String s5 = ((MessagingClientEvent)object0).getAnalyticsLabel();
        ((ObjectEncoderContext)object1).add(a.n, s5);
        long v4 = ((MessagingClientEvent)object0).getCampaignId();
        ((ObjectEncoderContext)object1).add(a.o, v4);
        String s6 = ((MessagingClientEvent)object0).getComposerLabel();
        ((ObjectEncoderContext)object1).add(a.p, s6);
    }
}

