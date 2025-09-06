package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.annotations.Encodable.Field;
import com.google.firebase.encoders.annotations.Encodable.Ignore;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.ProtoEncoderDoNotUse;
import java.io.IOException;
import java.io.OutputStream;

public final class MessagingClientEventExtension {
    public static final class Builder {
        public MessagingClientEvent a;

        public Builder() {
            this.a = null;
        }

        public MessagingClientEventExtension build() {
            return new MessagingClientEventExtension(this.a);
        }

        public Builder setMessagingClientEvent(MessagingClientEvent messagingClientEvent0) {
            this.a = messagingClientEvent0;
            return this;
        }
    }

    public final MessagingClientEvent a;
    public static final MessagingClientEventExtension b;

    static {
        MessagingClientEventExtension.b = new Builder().build();
    }

    public MessagingClientEventExtension(MessagingClientEvent messagingClientEvent0) {
        this.a = messagingClientEvent0;
    }

    public static MessagingClientEventExtension getDefaultInstance() {
        return MessagingClientEventExtension.b;
    }

    @Ignore
    public MessagingClientEvent getMessagingClientEvent() {
        return this.a == null ? MessagingClientEvent.getDefaultInstance() : this.a;
    }

    @Field(name = "messagingClientEvent")
    @Protobuf(tag = 1)
    public MessagingClientEvent getMessagingClientEventInternal() {
        return this.a;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream outputStream0) throws IOException {
        ProtoEncoderDoNotUse.encode(this, outputStream0);
    }
}

