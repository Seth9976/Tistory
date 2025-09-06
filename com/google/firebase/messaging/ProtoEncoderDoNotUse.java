package com.google.firebase.messaging;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.IOException;
import java.io.OutputStream;

@Encodable
public abstract class ProtoEncoderDoNotUse {
    public static final ProtobufEncoder a;

    static {
        ProtoEncoderDoNotUse.a = ProtobufEncoder.builder().configureWith(AutoProtoEncoderDoNotUseEncoder.CONFIG).build();
    }

    public static void encode(Object object0, OutputStream outputStream0) throws IOException {
        ProtoEncoderDoNotUse.a.encode(object0, outputStream0);
    }

    public static byte[] encode(Object object0) {
        return ProtoEncoderDoNotUse.a.encode(object0);
    }

    public abstract MessagingClientEventExtension getMessagingClientEventExtension();
}

