package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import okio.Buffer.UnsafeCursor;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u000BJ\r\u0010\r\u001A\u00020\f¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000F\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "", "isClient", "Lokio/BufferedSource;", "source", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLokio/BufferedSource;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "", "processNextFrame", "()V", "close", "b", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "FrameCallback", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWebSocketReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketReader.kt\nokhttp3/internal/ws/WebSocketReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
public final class WebSocketReader implements Closeable {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H&J\u0010\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0007H&J\u0010\u0010\b\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u000BH&J\u0010\u0010\f\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u000BH&J\u0010\u0010\u000E\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u000BH&¨\u0006\u000F"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "onReadClose", "", "code", "", "reason", "", "onReadMessage", "text", "bytes", "Lokio/ByteString;", "onReadPing", "payload", "onReadPong", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface FrameCallback {
        void onReadClose(int arg1, @NotNull String arg2);

        void onReadMessage(@NotNull String arg1) throws IOException;

        void onReadMessage(@NotNull ByteString arg1) throws IOException;

        void onReadPing(@NotNull ByteString arg1);

        void onReadPong(@NotNull ByteString arg1);
    }

    public final boolean a;
    public final BufferedSource b;
    public final FrameCallback c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    public int g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final Buffer l;
    public final Buffer m;
    public MessageInflater n;
    public final byte[] o;
    public final UnsafeCursor p;

    public WebSocketReader(boolean z, @NotNull BufferedSource bufferedSource0, @NotNull FrameCallback webSocketReader$FrameCallback0, boolean z1, boolean z2) {
        Intrinsics.checkNotNullParameter(bufferedSource0, "source");
        Intrinsics.checkNotNullParameter(webSocketReader$FrameCallback0, "frameCallback");
        super();
        this.a = z;
        this.b = bufferedSource0;
        this.c = webSocketReader$FrameCallback0;
        this.d = z1;
        this.e = z2;
        this.l = new Buffer();
        this.m = new Buffer();
        UnsafeCursor buffer$UnsafeCursor0 = null;
        this.o = z ? null : new byte[4];
        if(!z) {
            buffer$UnsafeCursor0 = new UnsafeCursor();
        }
        this.p = buffer$UnsafeCursor0;
    }

    public final void a() {
        int v2;
        long v = this.h;
        Buffer buffer0 = this.l;
        if(Long.compare(v, 0L) > 0) {
            this.b.readFully(buffer0, v);
            if(!this.a) {
                Intrinsics.checkNotNull(this.p);
                buffer0.readAndWriteUnsafe(this.p);
                this.p.seek(0L);
                Intrinsics.checkNotNull(this.o);
                WebSocketProtocol.INSTANCE.toggleMask(this.p, this.o);
                this.p.close();
            }
        }
        FrameCallback webSocketReader$FrameCallback0 = this.c;
        switch(this.g) {
            case 8: {
                long v1 = buffer0.size();
                if(v1 == 1L) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if(v1 == 0L) {
                    v2 = 1005;
                }
                else {
                    v2 = buffer0.readShort();
                    String s = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(v2);
                    if(s != null) {
                        throw new ProtocolException(s);
                    }
                }
                webSocketReader$FrameCallback0.onReadClose(v2, "");
                this.f = true;
                return;
            }
            case 9: {
                webSocketReader$FrameCallback0.onReadPing(buffer0.readByteString());
                return;
            }
            case 10: {
                webSocketReader$FrameCallback0.onReadPong(buffer0.readByteString());
                return;
            }
            default: {
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.g));
            }
        }
    }

    public final void b() {
        int v2;
        boolean z4;
        if(this.f) {
            throw new IOException("closed");
        }
        BufferedSource bufferedSource0 = this.b;
        long v = bufferedSource0.timeout().timeoutNanos();
        bufferedSource0.timeout().clearTimeout();
        try {
            v2 = Util.and(bufferedSource0.readByte(), ((byte)0xFF));
        }
        finally {
            bufferedSource0.timeout().timeout(v, TimeUnit.NANOSECONDS);
        }
        this.g = v2 & 15;
        boolean z = false;
        boolean z1 = (v2 & 0x80) != 0;
        this.i = z1;
        boolean z2 = (v2 & 8) != 0;
        this.j = z2;
        if(z2 && !z1) {
            throw new ProtocolException("Control frames must be final.");
        }
        boolean z3 = (v2 & 0x40) != 0;
        if((v2 & 15) == 1 || (v2 & 15) == 2) {
            if(z3) {
                if(!this.d) {
                    throw new ProtocolException("Unexpected rsv1 flag");
                }
                z4 = true;
            }
            else {
                z4 = false;
            }
            this.k = z4;
        }
        else if(z3) {
            throw new ProtocolException("Unexpected rsv1 flag");
        }
        if((v2 & 0x20) != 0) {
            throw new ProtocolException("Unexpected rsv2 flag");
        }
        if((v2 & 16) != 0) {
            throw new ProtocolException("Unexpected rsv3 flag");
        }
        int v3 = Util.and(bufferedSource0.readByte(), ((byte)0xFF));
        if((v3 & 0x80) != 0) {
            z = true;
        }
        boolean z5 = this.a;
        if(z == z5) {
            throw new ProtocolException((z5 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked."));
        }
        this.h = (long)(v3 & 0x7F);
        if(((long)(v3 & 0x7F)) == 0x7EL) {
            this.h = (long)Util.and(bufferedSource0.readShort(), ((short)0xFFFF));
        }
        else if(((long)(v3 & 0x7F)) == 0x7FL) {
            long v4 = bufferedSource0.readLong();
            this.h = v4;
            if(v4 < 0L) {
                throw new ProtocolException("Frame length 0x" + Util.toHexString(this.h) + " > 0x7FFFFFFFFFFFFFFF");
            }
        }
        if(this.j && this.h > 0x7DL) {
            throw new ProtocolException("Control frame must be less than 125B.");
        }
        if(z) {
            Intrinsics.checkNotNull(this.o);
            bufferedSource0.readFully(this.o);
        }
    }

    @Override
    public void close() throws IOException {
        MessageInflater messageInflater0 = this.n;
        if(messageInflater0 != null) {
            messageInflater0.close();
        }
    }

    @NotNull
    public final BufferedSource getSource() {
        return this.b;
    }

    public final void processNextFrame() throws IOException {
        this.b();
        if(this.j) {
            this.a();
            return;
        }
        int v = this.g;
        if(v != 1 && v != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(v));
        }
        while(!this.f) {
            long v1 = this.h;
            Buffer buffer0 = this.m;
            if(Long.compare(v1, 0L) > 0) {
                this.b.readFully(buffer0, v1);
                if(!this.a) {
                    Intrinsics.checkNotNull(this.p);
                    buffer0.readAndWriteUnsafe(this.p);
                    this.p.seek(buffer0.size() - this.h);
                    Intrinsics.checkNotNull(this.o);
                    WebSocketProtocol.INSTANCE.toggleMask(this.p, this.o);
                    this.p.close();
                }
            }
            if(!this.i) {
                while(!this.f) {
                    this.b();
                    if(!this.j) {
                        break;
                    }
                    this.a();
                }
                if(this.g != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.g));
                }
                continue;
            }
            if(this.k) {
                MessageInflater messageInflater0 = this.n;
                if(messageInflater0 == null) {
                    messageInflater0 = new MessageInflater(this.e);
                    this.n = messageInflater0;
                }
                messageInflater0.inflate(buffer0);
            }
            FrameCallback webSocketReader$FrameCallback0 = this.c;
            if(v == 1) {
                webSocketReader$FrameCallback0.onReadMessage("");
                return;
            }
            webSocketReader$FrameCallback0.onReadMessage(buffer0.readByteString());
            return;
        }
        throw new IOException("closed");
    }
}

