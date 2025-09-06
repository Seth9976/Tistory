package kotlin.reflect.jvm.internal.impl.protobuf;

public class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException(MessageLite messageLite0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new InvalidProtocolBufferException(this.getMessage());
    }
}

