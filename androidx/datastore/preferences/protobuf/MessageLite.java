package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@CheckReturnValue
public interface MessageLite extends MessageLiteOrBuilder {
    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        @CanIgnoreReturnValue
        Builder clear();

        Builder clone();

        boolean mergeDelimitedFrom(InputStream arg1) throws IOException;

        boolean mergeDelimitedFrom(InputStream arg1, ExtensionRegistryLite arg2) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(ByteString arg1) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(ByteString arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(CodedInputStream arg1) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(CodedInputStream arg1, ExtensionRegistryLite arg2) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(MessageLite arg1);

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream arg1) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream arg1, ExtensionRegistryLite arg2) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] arg1) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] arg1, int arg2, int arg3) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] arg1, int arg2, int arg3, ExtensionRegistryLite arg4) throws InvalidProtocolBufferException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] arg1, ExtensionRegistryLite arg2) throws InvalidProtocolBufferException;
    }

    Parser getParserForType();

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream arg1) throws IOException;

    void writeTo(CodedOutputStream arg1) throws IOException;

    void writeTo(OutputStream arg1) throws IOException;
}

