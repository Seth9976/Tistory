package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\r\u0010\u000EJ+\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u000F2\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00130\u0012\u00A2\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001A\u00020\b\u00A2\u0006\u0004\b\u0017\u0010\nJ\u001D\u0010\u001A\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0019\u001A\u00020\u0018\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\r\u0010\u001C\u001A\u00020\u000F\u00A2\u0006\u0004\b\u001C\u0010\u001DJ/\u0010\"\u001A\u00020\b2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u000F2\b\u0010 \u001A\u0004\u0018\u00010\u001F2\u0006\u0010!\u001A\u00020\u000F\u00A2\u0006\u0004\b\"\u0010#J/\u0010&\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010$\u001A\u00020\u000F2\b\u0010%\u001A\u0004\u0018\u00010\u001F2\u0006\u0010!\u001A\u00020\u000F\u00A2\u0006\u0004\b&\u0010\'J\u0015\u0010(\u001A\u00020\b2\u0006\u0010(\u001A\u00020\u000B\u00A2\u0006\u0004\b(\u0010\u000EJ%\u0010,\u001A\u00020\b2\u0006\u0010)\u001A\u00020\u00042\u0006\u0010*\u001A\u00020\u000F2\u0006\u0010+\u001A\u00020\u000F\u00A2\u0006\u0004\b,\u0010-J%\u00101\u001A\u00020\b2\u0006\u0010.\u001A\u00020\u000F2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u00100\u001A\u00020/\u00A2\u0006\u0004\b1\u00102J\u001D\u00105\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u00104\u001A\u000203\u00A2\u0006\u0004\b5\u00106J-\u00109\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u00107\u001A\u00020\u000F2\u0006\u00108\u001A\u00020\u000F2\u0006\u0010$\u001A\u00020\u000F\u00A2\u0006\u0004\b9\u0010:J\u000F\u0010;\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b;\u0010\nJ+\u0010=\u001A\u00020\b2\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u000F2\f\u0010<\u001A\b\u0012\u0004\u0012\u00020\u00130\u0012\u00A2\u0006\u0004\b=\u0010>R\u0017\u0010D\u001A\u00020?8\u0006\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010C\u00A8\u0006F"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Lokio/BufferedSink;", "sink", "", "client", "<init>", "(Lokio/BufferedSink;Z)V", "", "connectionPreface", "()V", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "(Lokhttp3/internal/http2/Settings;)V", "", "streamId", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "maxDataLength", "()I", "outFinished", "Lokio/Buffer;", "source", "byteCount", "data", "(ZILokio/Buffer;I)V", "flags", "buffer", "dataFrame", "(IILokio/Buffer;I)V", "settings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;[B)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "length", "type", "frameHeader", "(IIII)V", "close", "headerBlock", "headers", "(ZILjava/util/List;)V", "Lokhttp3/internal/http2/Hpack$Writer;", "f", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHttp2Writer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Writer.kt\nokhttp3/internal/http2/Http2Writer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1#2:318\n*E\n"})
public final class Http2Writer implements Closeable {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001C\u0010\u0004\u001A\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Writer$Companion;", "", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final BufferedSink a;
    public final boolean b;
    public final Buffer c;
    public int d;
    public boolean e;
    public final Writer f;
    public static final Logger g;

    static {
        Http2Writer.Companion = new Companion(null);
        Http2Writer.g = Logger.getLogger("okhttp3.internal.http2.Http2");
    }

    public Http2Writer(@NotNull BufferedSink bufferedSink0, boolean z) {
        Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
        super();
        this.a = bufferedSink0;
        this.b = z;
        Buffer buffer0 = new Buffer();
        this.c = buffer0;
        this.d = 0x4000;
        this.f = new Writer(0, false, buffer0, 3, null);
    }

    public final void a(int v, long v1) {
        while(v1 > 0L) {
            long v2 = Math.min(this.d, v1);
            v1 -= v2;
            this.frameHeader(v, ((int)v2), 9, (v1 == 0L ? 4 : 0));
            this.a.write(this.c, v2);
        }
    }

    public final void applyAndAckSettings(@NotNull Settings settings0) throws IOException {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(settings0, "peerSettings");
            if(!this.e) {
                this.d = settings0.getMaxFrameSize(this.d);
                if(settings0.getHeaderTableSize() != -1) {
                    int v1 = settings0.getHeaderTableSize();
                    this.f.resizeHeaderTable(v1);
                }
                this.frameHeader(0, 0, 4, 1);
                this.a.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    @Override
    public void close() throws IOException {
        synchronized(this) {
            this.e = true;
            this.a.close();
        }
    }

    public final void connectionPreface() throws IOException {
        synchronized(this) {
            if(!this.e) {
                if(!this.b) {
                    return;
                }
                Logger logger0 = Http2Writer.g;
                if(logger0.isLoggable(Level.FINE)) {
                    logger0.fine(">> CONNECTION 505249202a20485454502f322e300d0a0d0a534d0d0a0d0a");
                }
                this.a.write(Http2.CONNECTION_PREFACE);
                this.a.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void data(boolean z, int v, @Nullable Buffer buffer0, int v1) throws IOException {
        synchronized(this) {
            if(!this.e) {
                this.dataFrame(v, ((int)z), buffer0, v1);
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void dataFrame(int v, int v1, @Nullable Buffer buffer0, int v2) throws IOException {
        this.frameHeader(v, v2, 0, v1);
        if(v2 > 0) {
            Intrinsics.checkNotNull(buffer0);
            this.a.write(buffer0, ((long)v2));
        }
    }

    public final void flush() throws IOException {
        synchronized(this) {
            if(!this.e) {
                this.a.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void frameHeader(int v, int v1, int v2, int v3) throws IOException {
        Logger logger0 = Http2Writer.g;
        if(logger0.isLoggable(Level.FINE)) {
            logger0.fine(Http2.INSTANCE.frameLog(false, v, v1, v2, v3));
        }
        if(v1 > this.d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.d + ": " + v1).toString());
        }
        if((0x80000000 & v) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + v).toString());
        }
        Util.writeMedium(this.a, v1);
        this.a.writeByte(v2 & 0xFF);
        this.a.writeByte(v3 & 0xFF);
        this.a.writeInt(v & 0x7FFFFFFF);
    }

    @NotNull
    public final Writer getHpackWriter() {
        return this.f;
    }

    public final void goAway(int v, @NotNull ErrorCode errorCode0, @NotNull byte[] arr_b) throws IOException {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(errorCode0, "errorCode");
            Intrinsics.checkNotNullParameter(arr_b, "debugData");
            if(!this.e) {
                if(errorCode0.getHttpCode() == -1) {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                this.frameHeader(0, arr_b.length + 8, 7, 0);
                this.a.writeInt(v);
                this.a.writeInt(errorCode0.getHttpCode());
                if(arr_b.length != 0) {
                    this.a.write(arr_b);
                }
                this.a.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void headers(boolean z, int v, @NotNull List list0) throws IOException {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(list0, "headerBlock");
            if(!this.e) {
                this.f.writeHeaders(list0);
                long v2 = this.c.size();
                long v3 = Math.min(this.d, v2);
                int v4 = Long.compare(v2, v3);
                int v5 = v4 == 0 ? 4 : 0;
                if(z) {
                    v5 |= 1;
                }
                this.frameHeader(v, ((int)v3), 1, v5);
                this.a.write(this.c, v3);
                if(v4 > 0) {
                    this.a(v, v2 - v3);
                }
                return;
            }
        }
        throw new IOException("closed");
    }

    public final int maxDataLength() {
        return this.d;
    }

    public final void ping(boolean z, int v, int v1) throws IOException {
        synchronized(this) {
            if(!this.e) {
                this.frameHeader(0, 8, 6, ((int)z));
                this.a.writeInt(v);
                this.a.writeInt(v1);
                this.a.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void pushPromise(int v, int v1, @NotNull List list0) throws IOException {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(list0, "requestHeaders");
            if(!this.e) {
                this.f.writeHeaders(list0);
                long v3 = this.c.size();
                int v4 = (int)Math.min(((long)this.d) - 4L, v3);
                int v5 = Long.compare(v3, v4);
                this.frameHeader(v, v4 + 4, 5, (v5 == 0 ? 4 : 0));
                this.a.writeInt(v1 & 0x7FFFFFFF);
                this.a.write(this.c, ((long)v4));
                if(v5 > 0) {
                    this.a(v, v3 - ((long)v4));
                }
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void rstStream(int v, @NotNull ErrorCode errorCode0) throws IOException {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(errorCode0, "errorCode");
            if(!this.e) {
                if(errorCode0.getHttpCode() == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                this.frameHeader(v, 4, 3, 0);
                this.a.writeInt(errorCode0.getHttpCode());
                this.a.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void settings(@NotNull Settings settings0) throws IOException {
        int v2;
        synchronized(this) {
            Intrinsics.checkNotNullParameter(settings0, "settings");
            if(!this.e) {
                this.frameHeader(0, settings0.size() * 6, 4, 0);
                for(int v1 = 0; v1 < 10; ++v1) {
                    if(settings0.isSet(v1)) {
                        switch(v1) {
                            case 4: {
                                v2 = 3;
                                break;
                            }
                            case 7: {
                                v2 = 4;
                                break;
                            }
                            default: {
                                v2 = v1;
                            }
                        }
                        this.a.writeShort(v2);
                        int v3 = settings0.get(v1);
                        this.a.writeInt(v3);
                    }
                }
                this.a.flush();
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void windowUpdate(int v, long v1) throws IOException {
        synchronized(this) {
            if(!this.e) {
                if(v1 == 0L || v1 > 0x7FFFFFFFL) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + v1).toString());
                }
                this.frameHeader(v, 4, 8, 0);
                this.a.writeInt(((int)v1));
                this.a.flush();
                return;
            }
        }
        throw new IOException("closed");
    }
}

