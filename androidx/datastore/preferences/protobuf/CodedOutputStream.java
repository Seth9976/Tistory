package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends ByteOutput {
    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException(RuntimeException runtimeException0) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", runtimeException0);
        }

        public OutOfSpaceException(String s) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + s);
        }

        public OutOfSpaceException(String s, IndexOutOfBoundsException indexOutOfBoundsException0) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + s, indexOutOfBoundsException0);
        }
    }

    public static final int DEFAULT_BUFFER_SIZE = 0x1000;
    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public g0 a;
    public boolean b;
    public static final Logger c;
    public static final boolean d;

    static {
        CodedOutputStream.c = Logger.getLogger("androidx.datastore.preferences.protobuf.CodedOutputStream");
        CodedOutputStream.d = d4.e;
    }

    public static int a(int v, MessageLite messageLite0, Schema schema0) {
        return ((AbstractMessageLite)messageLite0).b(schema0) + CodedOutputStream.computeTagSize(v) * 2;
    }

    public final void b(String s, f4 f40) {
        CodedOutputStream.c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", f40);
        byte[] arr_b = s.getBytes(Internal.a);
        try {
            this.writeUInt32NoTag(arr_b.length);
            this.writeLazy(arr_b, 0, arr_b.length);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new OutOfSpaceException(indexOutOfBoundsException0);
        }
    }

    public abstract void c(byte[] arg1, int arg2, int arg3);

    public final void checkNoSpaceLeft() {
        if(this.spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static int computeBoolSize(int v, boolean z) {
        return CodedOutputStream.computeTagSize(v) + 1;
    }

    public static int computeBoolSizeNoTag(boolean z) [...] // Inlined contents

    public static int computeByteArraySize(int v, byte[] arr_b) {
        return CodedOutputStream.computeByteArraySizeNoTag(arr_b) + CodedOutputStream.computeTagSize(v);
    }

    public static int computeByteArraySizeNoTag(byte[] arr_b) {
        return CodedOutputStream.computeUInt32SizeNoTag(arr_b.length) + arr_b.length;
    }

    public static int computeByteBufferSize(int v, ByteBuffer byteBuffer0) {
        return CodedOutputStream.computeByteBufferSizeNoTag(byteBuffer0) + CodedOutputStream.computeTagSize(v);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.capacity();
        return CodedOutputStream.computeUInt32SizeNoTag(v) + v;
    }

    public static int computeBytesSize(int v, ByteString byteString0) {
        return CodedOutputStream.computeBytesSizeNoTag(byteString0) + CodedOutputStream.computeTagSize(v);
    }

    public static int computeBytesSizeNoTag(ByteString byteString0) {
        int v = byteString0.size();
        return CodedOutputStream.computeUInt32SizeNoTag(v) + v;
    }

    public static int computeDoubleSize(int v, double f) {
        return CodedOutputStream.computeTagSize(v) + 8;
    }

    public static int computeDoubleSizeNoTag(double f) [...] // Inlined contents

    public static int computeEnumSize(int v, int v1) {
        return CodedOutputStream.computeEnumSizeNoTag(v1) + CodedOutputStream.computeTagSize(v);
    }

    public static int computeEnumSizeNoTag(int v) {
        return CodedOutputStream.computeInt32SizeNoTag(v);
    }

    public static int computeFixed32Size(int v, int v1) {
        return CodedOutputStream.computeTagSize(v) + 4;
    }

    public static int computeFixed32SizeNoTag(int v) [...] // Inlined contents

    public static int computeFixed64Size(int v, long v1) {
        return CodedOutputStream.computeTagSize(v) + 8;
    }

    public static int computeFixed64SizeNoTag(long v) [...] // Inlined contents

    public static int computeFloatSize(int v, float f) {
        return CodedOutputStream.computeTagSize(v) + 4;
    }

    public static int computeFloatSizeNoTag(float f) [...] // Inlined contents

    @Deprecated
    public static int computeGroupSize(int v, MessageLite messageLite0) {
        return messageLite0.getSerializedSize() + CodedOutputStream.computeTagSize(v) * 2;
    }

    @InlineMe(replacement = "value.getSerializedSize()")
    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite0) {
        return messageLite0.getSerializedSize();
    }

    public static int computeInt32Size(int v, int v1) {
        return CodedOutputStream.computeInt32SizeNoTag(v1) + CodedOutputStream.computeTagSize(v);
    }

    public static int computeInt32SizeNoTag(int v) {
        return v < 0 ? 10 : CodedOutputStream.computeUInt32SizeNoTag(v);
    }

    public static int computeInt64Size(int v, long v1) {
        return CodedOutputStream.computeInt64SizeNoTag(v1) + CodedOutputStream.computeTagSize(v);
    }

    public static int computeInt64SizeNoTag(long v) {
        return CodedOutputStream.computeUInt64SizeNoTag(v);
    }

    // 去混淆评级： 低(20)
    public static int computeLazyFieldMessageSetExtensionSize(int v, LazyFieldLite lazyFieldLite0) {
        return CodedOutputStream.computeLazyFieldSize(3, lazyFieldLite0) + (CodedOutputStream.computeUInt32Size(2, v) + 2);
    }

    public static int computeLazyFieldSize(int v, LazyFieldLite lazyFieldLite0) {
        return CodedOutputStream.computeLazyFieldSizeNoTag(lazyFieldLite0) + CodedOutputStream.computeTagSize(v);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite0) {
        int v = lazyFieldLite0.getSerializedSize();
        return CodedOutputStream.computeUInt32SizeNoTag(v) + v;
    }

    // 去混淆评级： 低(20)
    public static int computeMessageSetExtensionSize(int v, MessageLite messageLite0) {
        return CodedOutputStream.computeMessageSize(3, messageLite0) + (CodedOutputStream.computeUInt32Size(2, v) + 2);
    }

    public static int computeMessageSize(int v, MessageLite messageLite0) {
        return CodedOutputStream.computeMessageSizeNoTag(messageLite0) + CodedOutputStream.computeTagSize(v);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite0) {
        int v = messageLite0.getSerializedSize();
        return CodedOutputStream.computeUInt32SizeNoTag(v) + v;
    }

    // 去混淆评级： 低(20)
    public static int computeRawMessageSetExtensionSize(int v, ByteString byteString0) {
        return CodedOutputStream.computeBytesSize(3, byteString0) + (CodedOutputStream.computeUInt32Size(2, v) + 2);
    }

    @InlineMe(imports = {"androidx.datastore.preferences.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt32SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint32Size(int v) {
        return CodedOutputStream.computeUInt32SizeNoTag(v);
    }

    @InlineMe(imports = {"androidx.datastore.preferences.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt64SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint64Size(long v) {
        return CodedOutputStream.computeUInt64SizeNoTag(v);
    }

    public static int computeSFixed32Size(int v, int v1) {
        return CodedOutputStream.computeTagSize(v) + 4;
    }

    public static int computeSFixed32SizeNoTag(int v) [...] // Inlined contents

    public static int computeSFixed64Size(int v, long v1) {
        return CodedOutputStream.computeTagSize(v) + 8;
    }

    public static int computeSFixed64SizeNoTag(long v) [...] // Inlined contents

    public static int computeSInt32Size(int v, int v1) {
        return CodedOutputStream.computeSInt32SizeNoTag(v1) + CodedOutputStream.computeTagSize(v);
    }

    public static int computeSInt32SizeNoTag(int v) {
        return CodedOutputStream.computeUInt32SizeNoTag(v >> 0x1F ^ v << 1);
    }

    public static int computeSInt64Size(int v, long v1) {
        return CodedOutputStream.computeSInt64SizeNoTag(v1) + CodedOutputStream.computeTagSize(v);
    }

    public static int computeSInt64SizeNoTag(long v) {
        return CodedOutputStream.computeUInt64SizeNoTag(v >> 0x3F ^ v << 1);
    }

    public static int computeStringSize(int v, String s) {
        return CodedOutputStream.computeStringSizeNoTag(s) + CodedOutputStream.computeTagSize(v);
    }

    public static int computeStringSizeNoTag(String s) {
        int v;
        try {
            v = g4.e(s);
            return CodedOutputStream.computeUInt32SizeNoTag(v) + v;
        }
        catch(f4 unused_ex) {
            v = s.getBytes(Internal.a).length;
            return CodedOutputStream.computeUInt32SizeNoTag(v) + v;
        }
    }

    public static int computeTagSize(int v) [...] // 潜在的解密器

    public static int computeUInt32Size(int v, int v1) {
        return CodedOutputStream.computeUInt32SizeNoTag(v1) + CodedOutputStream.computeTagSize(v);
    }

    public static int computeUInt32SizeNoTag(int v) {
        if((v & 0xFFFFFF80) == 0) {
            return 1;
        }
        if((v & 0xFFFFC000) == 0) {
            return 2;
        }
        if((0xFFE00000 & v) == 0) {
            return 3;
        }
        return (v & 0xF0000000) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int v, long v1) {
        return CodedOutputStream.computeUInt64SizeNoTag(v1) + CodedOutputStream.computeTagSize(v);
    }

    public static int computeUInt64SizeNoTag(long v) {
        int v1;
        if((0xFFFFFFFFFFFFFF80L & v) == 0L) {
            return 1;
        }
        if(v < 0L) {
            return 10;
        }
        if((0xFFFFFFF800000000L & v) == 0L) {
            v1 = 2;
        }
        else {
            v >>>= 28;
            v1 = 6;
        }
        if((0xFFFFFFFFFFE00000L & v) != 0L) {
            v1 += 2;
            v >>>= 14;
        }
        return (v & 0xFFFFFFFFFFFFC000L) == 0L ? v1 : v1 + 1;
    }

    public abstract void d(int arg1, MessageLite arg2, Schema arg3);

    public static int encodeZigZag32(int v) [...] // Inlined contents

    public static long encodeZigZag64(long v) [...] // Inlined contents

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public static CodedOutputStream newInstance(OutputStream outputStream0) {
        return CodedOutputStream.newInstance(outputStream0, 0x1000);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream0, int v) {
        return new c0(outputStream0, v);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer0) {
        if(byteBuffer0.hasArray()) {
            return new b0(byteBuffer0);
        }
        if(!byteBuffer0.isDirect() || byteBuffer0.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return d4.d ? new e0(byteBuffer0) : new d0(byteBuffer0);
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer0, int v) {
        return CodedOutputStream.newInstance(byteBuffer0);
    }

    public static CodedOutputStream newInstance(byte[] arr_b) {
        return CodedOutputStream.newInstance(arr_b, 0, arr_b.length);
    }

    public static CodedOutputStream newInstance(byte[] arr_b, int v, int v1) {
        return new a0(arr_b, v, v1);
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.b = true;
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte arg1) throws IOException;

    @Override  // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(ByteBuffer arg1) throws IOException;

    @Override  // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte[] arg1, int arg2, int arg3) throws IOException;

    public abstract void writeBool(int arg1, boolean arg2) throws IOException;

    public final void writeBoolNoTag(boolean z) throws IOException {
        this.write(((byte)z));
    }

    public abstract void writeByteArray(int arg1, byte[] arg2) throws IOException;

    public abstract void writeByteArray(int arg1, byte[] arg2, int arg3, int arg4) throws IOException;

    public final void writeByteArrayNoTag(byte[] arr_b) throws IOException {
        this.c(arr_b, 0, arr_b.length);
    }

    public abstract void writeByteBuffer(int arg1, ByteBuffer arg2) throws IOException;

    public abstract void writeBytes(int arg1, ByteString arg2) throws IOException;

    public abstract void writeBytesNoTag(ByteString arg1) throws IOException;

    public final void writeDouble(int v, double f) throws IOException {
        this.writeFixed64(v, Double.doubleToRawLongBits(f));
    }

    public final void writeDoubleNoTag(double f) throws IOException {
        this.writeFixed64NoTag(Double.doubleToRawLongBits(f));
    }

    public final void writeEnum(int v, int v1) throws IOException {
        this.writeInt32(v, v1);
    }

    public final void writeEnumNoTag(int v) throws IOException {
        this.writeInt32NoTag(v);
    }

    public abstract void writeFixed32(int arg1, int arg2) throws IOException;

    public abstract void writeFixed32NoTag(int arg1) throws IOException;

    public abstract void writeFixed64(int arg1, long arg2) throws IOException;

    public abstract void writeFixed64NoTag(long arg1) throws IOException;

    public final void writeFloat(int v, float f) throws IOException {
        this.writeFixed32(v, Float.floatToRawIntBits(f));
    }

    public final void writeFloatNoTag(float f) throws IOException {
        this.writeFixed32NoTag(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void writeGroup(int v, MessageLite messageLite0) throws IOException {
        this.writeTag(v, 3);
        this.writeGroupNoTag(messageLite0);
        this.writeTag(v, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite0) throws IOException {
        messageLite0.writeTo(this);
    }

    public abstract void writeInt32(int arg1, int arg2) throws IOException;

    public abstract void writeInt32NoTag(int arg1) throws IOException;

    public final void writeInt64(int v, long v1) throws IOException {
        this.writeUInt64(v, v1);
    }

    public final void writeInt64NoTag(long v) throws IOException {
        this.writeUInt64NoTag(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer arg1) throws IOException;

    @Override  // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(byte[] arg1, int arg2, int arg3) throws IOException;

    public abstract void writeMessage(int arg1, MessageLite arg2) throws IOException;

    public abstract void writeMessageNoTag(MessageLite arg1) throws IOException;

    public abstract void writeMessageSetExtension(int arg1, MessageLite arg2) throws IOException;

    public final void writeRawByte(byte b) throws IOException {
        this.write(b);
    }

    public final void writeRawByte(int v) throws IOException {
        this.write(((byte)v));
    }

    public final void writeRawBytes(ByteString byteString0) throws IOException {
        byteString0.g(this);
    }

    public abstract void writeRawBytes(ByteBuffer arg1) throws IOException;

    public final void writeRawBytes(byte[] arr_b) throws IOException {
        this.write(arr_b, 0, arr_b.length);
    }

    public final void writeRawBytes(byte[] arr_b, int v, int v1) throws IOException {
        this.write(arr_b, v, v1);
    }

    @InlineMe(replacement = "this.writeFixed32NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian32(int v) throws IOException {
        this.writeFixed32NoTag(v);
    }

    @InlineMe(replacement = "this.writeFixed64NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian64(long v) throws IOException {
        this.writeFixed64NoTag(v);
    }

    public abstract void writeRawMessageSetExtension(int arg1, ByteString arg2) throws IOException;

    @InlineMe(replacement = "this.writeUInt32NoTag(value)")
    @Deprecated
    public final void writeRawVarint32(int v) throws IOException {
        this.writeUInt32NoTag(v);
    }

    @InlineMe(replacement = "this.writeUInt64NoTag(value)")
    @Deprecated
    public final void writeRawVarint64(long v) throws IOException {
        this.writeUInt64NoTag(v);
    }

    public final void writeSFixed32(int v, int v1) throws IOException {
        this.writeFixed32(v, v1);
    }

    public final void writeSFixed32NoTag(int v) throws IOException {
        this.writeFixed32NoTag(v);
    }

    public final void writeSFixed64(int v, long v1) throws IOException {
        this.writeFixed64(v, v1);
    }

    public final void writeSFixed64NoTag(long v) throws IOException {
        this.writeFixed64NoTag(v);
    }

    public final void writeSInt32(int v, int v1) throws IOException {
        this.writeUInt32(v, v1 >> 0x1F ^ v1 << 1);
    }

    public final void writeSInt32NoTag(int v) throws IOException {
        this.writeUInt32NoTag(v >> 0x1F ^ v << 1);
    }

    public final void writeSInt64(int v, long v1) throws IOException {
        this.writeUInt64(v, v1 >> 0x3F ^ v1 << 1);
    }

    public final void writeSInt64NoTag(long v) throws IOException {
        this.writeUInt64NoTag(CodedOutputStream.encodeZigZag64(v));
    }

    public abstract void writeString(int arg1, String arg2) throws IOException;

    public abstract void writeStringNoTag(String arg1) throws IOException;

    public abstract void writeTag(int arg1, int arg2) throws IOException;

    public abstract void writeUInt32(int arg1, int arg2) throws IOException;

    public abstract void writeUInt32NoTag(int arg1) throws IOException;

    public abstract void writeUInt64(int arg1, long arg2) throws IOException;

    public abstract void writeUInt64NoTag(long arg1) throws IOException;
}

