package androidx.datastore.preferences.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {
    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        public InvalidWireTypeException(String s) {
            super(s);
        }
    }

    public MessageLite a;
    public boolean b;

    public InvalidProtocolBufferException(IOException iOException0) {
        super(iOException0.getMessage(), iOException0);
        this.a = null;
    }

    public InvalidProtocolBufferException(Exception exception0) {
        super(exception0.getMessage(), exception0);
        this.a = null;
    }

    public InvalidProtocolBufferException(String s) {
        super(s);
        this.a = null;
    }

    public InvalidProtocolBufferException(String s, IOException iOException0) {
        super(s, iOException0);
        this.a = null;
    }

    public InvalidProtocolBufferException(String s, Exception exception0) {
        super(s, exception0);
        this.a = null;
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    public static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    public static InvalidWireTypeException d() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    public static InvalidProtocolBufferException e() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public static InvalidProtocolBufferException f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static InvalidProtocolBufferException g() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    public MessageLite getUnfinishedMessage() {
        return this.a;
    }

    public static InvalidProtocolBufferException h() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public InvalidProtocolBufferException setUnfinishedMessage(MessageLite messageLite0) {
        this.a = messageLite0;
        return this;
    }

    public IOException unwrapIOException() {
        return this.getCause() instanceof IOException ? ((IOException)this.getCause()) : this;
    }
}

