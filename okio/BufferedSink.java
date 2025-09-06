package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001A\u00020\u0004H\'J\b\u0010\u0007\u001A\u00020\u0000H&J\b\u0010\b\u001A\u00020\u0000H&J\b\u0010\t\u001A\u00020\nH&J\b\u0010\u000B\u001A\u00020\fH&J\u0010\u0010\r\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\u000FH&J \u0010\r\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0011H&J\u0010\u0010\r\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u0014H&J \u0010\r\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0011H&J\u0018\u0010\r\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\u00152\u0006\u0010\u0012\u001A\u00020\u0016H&J\u0010\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u000E\u001A\u00020\u0015H&J\u0010\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u0019\u001A\u00020\u0011H&J\u0010\u0010\u001A\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u0016H&J\u0010\u0010\u001C\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u0016H&J\u0010\u0010\u001D\u001A\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u0011H&J\u0010\u0010\u001F\u001A\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u0011H&J\u0010\u0010 \u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u0016H&J\u0010\u0010!\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u0016H&J\u0010\u0010\"\u001A\u00020\u00002\u0006\u0010#\u001A\u00020\u0011H&J\u0010\u0010$\u001A\u00020\u00002\u0006\u0010#\u001A\u00020\u0011H&J\u0018\u0010%\u001A\u00020\u00002\u0006\u0010&\u001A\u00020\'2\u0006\u0010(\u001A\u00020)H&J(\u0010%\u001A\u00020\u00002\u0006\u0010&\u001A\u00020\'2\u0006\u0010*\u001A\u00020\u00112\u0006\u0010+\u001A\u00020\u00112\u0006\u0010(\u001A\u00020)H&J\u0010\u0010,\u001A\u00020\u00002\u0006\u0010&\u001A\u00020\'H&J \u0010,\u001A\u00020\u00002\u0006\u0010&\u001A\u00020\'2\u0006\u0010*\u001A\u00020\u00112\u0006\u0010+\u001A\u00020\u0011H&J\u0010\u0010-\u001A\u00020\u00002\u0006\u0010.\u001A\u00020\u0011H&R\u0012\u0010\u0003\u001A\u00020\u0004X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0004/\u00F8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00A8\u00060\u00C0\u0006\u0001"}, d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "buffer", "Lokio/Buffer;", "getBuffer", "()Lokio/Buffer;", "emit", "emitCompleteSegments", "flush", "", "outputStream", "Ljava/io/OutputStream;", "write", "source", "", "offset", "", "byteCount", "byteString", "Lokio/ByteString;", "Lokio/Source;", "", "writeAll", "writeByte", "b", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", "s", "writeShortLe", "writeString", "string", "", "charset", "Ljava/nio/charset/Charset;", "beginIndex", "endIndex", "writeUtf8", "writeUtf8CodePoint", "codePoint", "Lokio/RealBufferedSink;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BufferedSink extends WritableByteChannel, Sink {
    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    @NotNull
    Buffer buffer();

    @NotNull
    BufferedSink emit() throws IOException;

    @NotNull
    BufferedSink emitCompleteSegments() throws IOException;

    @Override  // okio.Sink
    void flush() throws IOException;

    @NotNull
    Buffer getBuffer();

    @NotNull
    OutputStream outputStream();

    @NotNull
    BufferedSink write(@NotNull ByteString arg1) throws IOException;

    @NotNull
    BufferedSink write(@NotNull ByteString arg1, int arg2, int arg3) throws IOException;

    @NotNull
    BufferedSink write(@NotNull Source arg1, long arg2) throws IOException;

    @NotNull
    BufferedSink write(@NotNull byte[] arg1) throws IOException;

    @NotNull
    BufferedSink write(@NotNull byte[] arg1, int arg2, int arg3) throws IOException;

    long writeAll(@NotNull Source arg1) throws IOException;

    @NotNull
    BufferedSink writeByte(int arg1) throws IOException;

    @NotNull
    BufferedSink writeDecimalLong(long arg1) throws IOException;

    @NotNull
    BufferedSink writeHexadecimalUnsignedLong(long arg1) throws IOException;

    @NotNull
    BufferedSink writeInt(int arg1) throws IOException;

    @NotNull
    BufferedSink writeIntLe(int arg1) throws IOException;

    @NotNull
    BufferedSink writeLong(long arg1) throws IOException;

    @NotNull
    BufferedSink writeLongLe(long arg1) throws IOException;

    @NotNull
    BufferedSink writeShort(int arg1) throws IOException;

    @NotNull
    BufferedSink writeShortLe(int arg1) throws IOException;

    @NotNull
    BufferedSink writeString(@NotNull String arg1, int arg2, int arg3, @NotNull Charset arg4) throws IOException;

    @NotNull
    BufferedSink writeString(@NotNull String arg1, @NotNull Charset arg2) throws IOException;

    @NotNull
    BufferedSink writeUtf8(@NotNull String arg1) throws IOException;

    @NotNull
    BufferedSink writeUtf8(@NotNull String arg1, int arg2, int arg3) throws IOException;

    @NotNull
    BufferedSink writeUtf8CodePoint(int arg1) throws IOException;
}

