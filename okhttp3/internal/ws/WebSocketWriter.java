package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer.UnsafeCursor;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0013\u0010\u0012J\u001F\u0010\u0017\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00020\u00142\b\u0010\u0016\u001A\u0004\u0018\u00010\u000E¢\u0006\u0004\b\u0017\u0010\u0018J\u001D\u0010\u001B\u001A\u00020\u00102\u0006\u0010\u0019\u001A\u00020\u00142\u0006\u0010\u001A\u001A\u00020\u000E¢\u0006\u0004\b\u001B\u0010\u0018J\u000F\u0010\u001C\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "isClient", "Lokio/BufferedSink;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "<init>", "(ZLokio/BufferedSink;Ljava/util/Random;ZZJ)V", "Lokio/ByteString;", "payload", "", "writePing", "(Lokio/ByteString;)V", "writePong", "", "code", "reason", "writeClose", "(ILokio/ByteString;)V", "formatOpcode", "data", "writeMessageFrame", "close", "()V", "b", "Lokio/BufferedSink;", "getSink", "()Lokio/BufferedSink;", "c", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nokhttp3/internal/ws/WebSocketWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n1#2:203\n*E\n"})
public final class WebSocketWriter implements Closeable {
    public final boolean a;
    public final BufferedSink b;
    public final Random c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final Buffer g;
    public final Buffer h;
    public boolean i;
    public MessageDeflater j;
    public final byte[] k;
    public final UnsafeCursor l;

    public WebSocketWriter(boolean z, @NotNull BufferedSink bufferedSink0, @NotNull Random random0, boolean z1, boolean z2, long v) {
        Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
        Intrinsics.checkNotNullParameter(random0, "random");
        super();
        this.a = z;
        this.b = bufferedSink0;
        this.c = random0;
        this.d = z1;
        this.e = z2;
        this.f = v;
        this.g = new Buffer();
        this.h = bufferedSink0.getBuffer();
        UnsafeCursor buffer$UnsafeCursor0 = null;
        this.k = z ? new byte[4] : null;
        if(z) {
            buffer$UnsafeCursor0 = new UnsafeCursor();
        }
        this.l = buffer$UnsafeCursor0;
    }

    public final void a(int v, ByteString byteString0) {
        if(this.i) {
            throw new IOException("closed");
        }
        int v1 = byteString0.size();
        if(((long)v1) > 0x7DL) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        Buffer buffer0 = this.h;
        buffer0.writeByte(v | 0x80);
        if(this.a) {
            buffer0.writeByte(v1 | 0x80);
            byte[] arr_b = this.k;
            Intrinsics.checkNotNull(arr_b);
            this.c.nextBytes(arr_b);
            buffer0.write(arr_b);
            if(v1 > 0) {
                buffer0.write(byteString0);
                Intrinsics.checkNotNull(this.l);
                buffer0.readAndWriteUnsafe(this.l);
                this.l.seek(buffer0.size());
                WebSocketProtocol.INSTANCE.toggleMask(this.l, arr_b);
                this.l.close();
            }
        }
        else {
            buffer0.writeByte(v1);
            buffer0.write(byteString0);
        }
        this.b.flush();
    }

    @Override
    public void close() {
        MessageDeflater messageDeflater0 = this.j;
        if(messageDeflater0 != null) {
            messageDeflater0.close();
        }
    }

    @NotNull
    public final Random getRandom() {
        return this.c;
    }

    @NotNull
    public final BufferedSink getSink() {
        return this.b;
    }

    public final void writeClose(int v, @Nullable ByteString byteString0) throws IOException {
        ByteString byteString1 = ByteString.EMPTY;
        if(v != 0 || byteString0 != null) {
            if(v != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(v);
            }
            Buffer buffer0 = new Buffer();
            buffer0.writeShort(v);
            if(byteString0 != null) {
                buffer0.write(byteString0);
            }
            byteString1 = buffer0.readByteString();
        }
        try {
            this.a(8, byteString1);
            this.i = true;
        }
        catch(Throwable throwable0) {
            this.i = true;
            throw throwable0;
        }
    }

    public final void writeMessageFrame(int v, @NotNull ByteString byteString0) throws IOException {
        Intrinsics.checkNotNullParameter(byteString0, "data");
        if(this.i) {
            throw new IOException("closed");
        }
        Buffer buffer0 = this.g;
        buffer0.write(byteString0);
        int v1 = v | 0x80;
        if(this.d && ((long)byteString0.size()) >= this.f) {
            MessageDeflater messageDeflater0 = this.j;
            if(messageDeflater0 == null) {
                messageDeflater0 = new MessageDeflater(this.e);
                this.j = messageDeflater0;
            }
            messageDeflater0.deflate(buffer0);
            v1 = v | 0xC0;
        }
        long v2 = buffer0.size();
        Buffer buffer1 = this.h;
        buffer1.writeByte(v1);
        boolean z = this.a;
        if(v2 <= 0x7DL) {
            buffer1.writeByte((z ? 0x80 : 0) | ((int)v2));
        }
        else if(v2 <= 0xFFFFL) {
            buffer1.writeByte((z ? 0x80 : 0) | 0x7E);
            buffer1.writeShort(((int)v2));
        }
        else {
            buffer1.writeByte((z ? 0x80 : 0) | 0x7F);
            buffer1.writeLong(v2);
        }
        if(z) {
            byte[] arr_b = this.k;
            Intrinsics.checkNotNull(arr_b);
            this.c.nextBytes(arr_b);
            buffer1.write(arr_b);
            if(v2 > 0L) {
                Intrinsics.checkNotNull(this.l);
                buffer0.readAndWriteUnsafe(this.l);
                this.l.seek(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.l, arr_b);
                this.l.close();
            }
        }
        buffer1.write(buffer0, v2);
        this.b.emit();
    }

    public final void writePing(@NotNull ByteString byteString0) throws IOException {
        Intrinsics.checkNotNullParameter(byteString0, "payload");
        this.a(9, byteString0);
    }

    public final void writePong(@NotNull ByteString byteString0) throws IOException {
        Intrinsics.checkNotNullParameter(byteString0, "payload");
        this.a(10, byteString0);
    }
}

