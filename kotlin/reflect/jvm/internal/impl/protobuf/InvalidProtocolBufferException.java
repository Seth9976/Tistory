package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {
    public MessageLite a;

    public InvalidProtocolBufferException(String s) {
        super(s);
        this.a = null;
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public MessageLite getUnfinishedMessage() {
        return this.a;
    }

    public InvalidProtocolBufferException setUnfinishedMessage(MessageLite messageLite0) {
        this.a = messageLite0;
        return this;
    }
}

