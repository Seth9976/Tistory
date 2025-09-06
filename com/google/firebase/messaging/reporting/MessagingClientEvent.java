package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

public final class MessagingClientEvent {
    public static final class Builder {
        public long a;
        public String b;
        public String c;
        public MessageType d;
        public SDKPlatform e;
        public String f;
        public String g;
        public int h;
        public int i;
        public String j;
        public long k;
        public Event l;
        public String m;
        public long n;
        public String o;

        public Builder() {
            this.a = 0L;
            this.b = "";
            this.c = "";
            this.d = MessageType.UNKNOWN;
            this.e = SDKPlatform.UNKNOWN_OS;
            this.f = "";
            this.g = "";
            this.h = 0;
            this.i = 0;
            this.j = "";
            this.k = 0L;
            this.l = Event.UNKNOWN_EVENT;
            this.m = "";
            this.n = 0L;
            this.o = "";
        }

        public MessagingClientEvent build() {
            return new MessagingClientEvent(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }

        public Builder setAnalyticsLabel(String s) {
            this.m = s;
            return this;
        }

        public Builder setBulkId(long v) {
            this.k = v;
            return this;
        }

        public Builder setCampaignId(long v) {
            this.n = v;
            return this;
        }

        public Builder setCollapseKey(String s) {
            this.g = s;
            return this;
        }

        public Builder setComposerLabel(String s) {
            this.o = s;
            return this;
        }

        public Builder setEvent(Event messagingClientEvent$Event0) {
            this.l = messagingClientEvent$Event0;
            return this;
        }

        public Builder setInstanceId(String s) {
            this.c = s;
            return this;
        }

        public Builder setMessageId(String s) {
            this.b = s;
            return this;
        }

        public Builder setMessageType(MessageType messagingClientEvent$MessageType0) {
            this.d = messagingClientEvent$MessageType0;
            return this;
        }

        public Builder setPackageName(String s) {
            this.f = s;
            return this;
        }

        public Builder setPriority(int v) {
            this.h = v;
            return this;
        }

        public Builder setProjectNumber(long v) {
            this.a = v;
            return this;
        }

        public Builder setSdkPlatform(SDKPlatform messagingClientEvent$SDKPlatform0) {
            this.e = messagingClientEvent$SDKPlatform0;
            return this;
        }

        public Builder setTopic(String s) {
            this.j = s;
            return this;
        }

        public Builder setTtl(int v) {
            this.i = v;
            return this;
        }
    }

    public static enum Event implements ProtoEnum {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        public final int a;

        public Event(int v1) {
            this.a = v1;
        }

        @Override  // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.a;
        }
    }

    public static enum MessageType implements ProtoEnum {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        public final int a;

        public MessageType(int v1) {
            this.a = v1;
        }

        @Override  // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.a;
        }
    }

    public static enum SDKPlatform implements ProtoEnum {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        public final int a;

        public SDKPlatform(int v1) {
            this.a = v1;
        }

        @Override  // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.a;
        }
    }

    public final long a;
    public final String b;
    public final String c;
    public final MessageType d;
    public final SDKPlatform e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;
    public final long k;
    public final Event l;
    public final String m;
    public final long n;
    public final String o;
    public static final MessagingClientEvent p;

    static {
        MessagingClientEvent.p = new Builder().build();
    }

    public MessagingClientEvent(long v, String s, String s1, MessageType messagingClientEvent$MessageType0, SDKPlatform messagingClientEvent$SDKPlatform0, String s2, String s3, int v1, int v2, String s4, long v3, Event messagingClientEvent$Event0, String s5, long v4, String s6) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = messagingClientEvent$MessageType0;
        this.e = messagingClientEvent$SDKPlatform0;
        this.f = s2;
        this.g = s3;
        this.h = v1;
        this.i = v2;
        this.j = s4;
        this.k = v3;
        this.l = messagingClientEvent$Event0;
        this.m = s5;
        this.n = v4;
        this.o = s6;
    }

    @Protobuf(tag = 13)
    public String getAnalyticsLabel() {
        return this.m;
    }

    @Protobuf(tag = 11)
    public long getBulkId() {
        return this.k;
    }

    @Protobuf(tag = 14)
    public long getCampaignId() {
        return this.n;
    }

    @Protobuf(tag = 7)
    public String getCollapseKey() {
        return this.g;
    }

    @Protobuf(tag = 15)
    public String getComposerLabel() {
        return this.o;
    }

    public static MessagingClientEvent getDefaultInstance() {
        return MessagingClientEvent.p;
    }

    @Protobuf(tag = 12)
    public Event getEvent() {
        return this.l;
    }

    @Protobuf(tag = 3)
    public String getInstanceId() {
        return this.c;
    }

    @Protobuf(tag = 2)
    public String getMessageId() {
        return this.b;
    }

    @Protobuf(tag = 4)
    public MessageType getMessageType() {
        return this.d;
    }

    @Protobuf(tag = 6)
    public String getPackageName() {
        return this.f;
    }

    @Protobuf(tag = 8)
    public int getPriority() {
        return this.h;
    }

    @Protobuf(tag = 1)
    public long getProjectNumber() {
        return this.a;
    }

    @Protobuf(tag = 5)
    public SDKPlatform getSdkPlatform() {
        return this.e;
    }

    @Protobuf(tag = 10)
    public String getTopic() {
        return this.j;
    }

    @Protobuf(tag = 9)
    public int getTtl() {
        return this.i;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}

