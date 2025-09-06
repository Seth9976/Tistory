package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;

public abstract class AbstractMessageLite implements MessageLite {
    public static abstract class Builder implements kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder {
        @Override
        public Object clone() throws CloneNotSupportedException {
            return this.clone();
        }

        public abstract Builder clone();

        public abstract Builder mergeFrom(CodedInputStream arg1, ExtensionRegistryLite arg2) throws IOException;

        @Override  // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite$Builder
        public kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
        }

        public static UninitializedMessageException newUninitializedMessageException(MessageLite messageLite0) {
            return new UninitializedMessageException(messageLite0);
        }
    }

    protected int memoizedHashCode;

    public AbstractMessageLite() {
        this.memoizedHashCode = 0;
    }

    public void writeDelimitedTo(OutputStream outputStream0) throws IOException {
        int v = this.getSerializedSize();
        CodedOutputStream codedOutputStream0 = CodedOutputStream.newInstance(outputStream0, (CodedOutputStream.computeRawVarint32Size(v) + v <= 0x1000 ? CodedOutputStream.computeRawVarint32Size(v) + v : 0x1000));
        codedOutputStream0.writeRawVarint32(v);
        this.writeTo(codedOutputStream0);
        codedOutputStream0.flush();
    }
}

