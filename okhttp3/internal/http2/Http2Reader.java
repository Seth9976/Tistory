package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000B\u0018\u0000 \u00122\u00020\u0001:\u0003\u0012\u0013\u0014B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000E\u001A\u00020\u00042\u0006\u0010\r\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Lokio/BufferedSource;", "source", "", "client", "<init>", "(Lokio/BufferedSource;Z)V", "Lokhttp3/internal/http2/Http2Reader$Handler;", "handler", "", "readConnectionPreface", "(Lokhttp3/internal/http2/Http2Reader$Handler;)V", "requireSettings", "nextFrame", "(ZLokhttp3/internal/http2/Http2Reader$Handler;)Z", "close", "()V", "Companion", "ContinuationSource", "Handler", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Http2Reader implements Closeable {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J%\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "", "length", "flags", "padding", "lengthWithoutPadding", "(III)I", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Logger getLogger() {
            return Http2Reader.e;
        }

        public final int lengthWithoutPadding(int v, int v1, int v2) throws IOException {
            if((v1 & 8) != 0) {
                --v;
            }
            if(v2 > v) {
                throw new IOException("PROTOCOL_ERROR padding " + v2 + " > remaining length " + v);
            }
            return v - v2;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\n\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001A\u00020\u00128\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001D\u001A\u00020\u00128\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u0014\u001A\u0004\b\u001B\u0010\u0016\"\u0004\b\u001C\u0010\u0018R\"\u0010!\u001A\u00020\u00128\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u0014\u001A\u0004\b\u001F\u0010\u0016\"\u0004\b \u0010\u0018R\"\u0010%\u001A\u00020\u00128\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001A\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\"\u0010)\u001A\u00020\u00128\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b&\u0010\u0014\u001A\u0004\b\'\u0010\u0016\"\u0004\b(\u0010\u0018¨\u0006*"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokio/Source;", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "", "close", "()V", "", "b", "I", "getLength", "()I", "setLength", "(I)V", "length", "c", "getFlags", "setFlags", "flags", "d", "getStreamId", "setStreamId", "streamId", "e", "getLeft", "setLeft", "left", "f", "getPadding", "setPadding", "padding", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ContinuationSource implements Source {
        public final BufferedSource a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;

        public ContinuationSource(@NotNull BufferedSource bufferedSource0) {
            Intrinsics.checkNotNullParameter(bufferedSource0, "source");
            super();
            this.a = bufferedSource0;
        }

        @Override  // okio.Source
        public void close() throws IOException {
        }

        public final int getFlags() {
            return this.c;
        }

        public final int getLeft() {
            return this.e;
        }

        public final int getLength() {
            return this.b;
        }

        public final int getPadding() {
            return this.f;
        }

        public final int getStreamId() {
            return this.d;
        }

        @Override  // okio.Source
        public long read(@NotNull Buffer buffer0, long v) throws IOException {
            BufferedSource bufferedSource0;
            int v1;
            Intrinsics.checkNotNullParameter(buffer0, "sink");
            do {
                v1 = this.e;
                bufferedSource0 = this.a;
                if(v1 != 0) {
                    goto label_23;
                }
                bufferedSource0.skip(((long)this.f));
                this.f = 0;
                if((this.c & 4) != 0) {
                    return -1L;
                }
                int v2 = this.d;
                int v3 = Util.readMedium(bufferedSource0);
                this.e = v3;
                this.b = v3;
                int v4 = Util.and(bufferedSource0.readByte(), ((byte)0xFF));
                this.c = Util.and(bufferedSource0.readByte(), ((byte)0xFF));
                Companion http2Reader$Companion0 = Http2Reader.Companion;
                if(http2Reader$Companion0.getLogger().isLoggable(Level.FINE)) {
                    http2Reader$Companion0.getLogger().fine(Http2.INSTANCE.frameLog(true, this.d, this.b, v4, this.c));
                }
                int v5 = bufferedSource0.readInt();
                this.d = v5 & 0x7FFFFFFF;
                if(v4 != 9) {
                    throw new IOException(v4 + " != TYPE_CONTINUATION");
                }
            }
            while((v5 & 0x7FFFFFFF) == v2);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        label_23:
            long v6 = bufferedSource0.read(buffer0, Math.min(v, v1));
            if(v6 == -1L) {
                return -1L;
            }
            this.e -= (int)v6;
            return v6;
        }

        public final void setFlags(int v) {
            this.c = v;
        }

        public final void setLeft(int v) {
            this.e = v;
        }

        public final void setLength(int v) {
            this.b = v;
        }

        public final void setPadding(int v) {
            this.f = v;
        }

        public final void setStreamId(int v) {
            this.d = v;
        }

        @Override  // okio.Source
        @NotNull
        public Timeout timeout() {
            return this.a.timeout();
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J8\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u000EH&J(\u0010\u000F\u001A\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u0006H&J \u0010\u0015\u001A\u00020\u00032\u0006\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\nH&J.\u0010\u001A\u001A\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u001B\u001A\u00020\u00062\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001E0\u001DH&J \u0010\u001F\u001A\u00020\u00032\u0006\u0010 \u001A\u00020\u00112\u0006\u0010!\u001A\u00020\u00062\u0006\u0010\"\u001A\u00020\u0006H&J(\u0010#\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010$\u001A\u00020\u00062\u0006\u0010%\u001A\u00020\u00062\u0006\u0010&\u001A\u00020\u0011H&J&\u0010\'\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010(\u001A\u00020\u00062\f\u0010)\u001A\b\u0012\u0004\u0012\u00020\u001E0\u001DH&J\u0018\u0010*\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u0018H&J\u0018\u0010+\u001A\u00020\u00032\u0006\u0010,\u001A\u00020\u00112\u0006\u0010+\u001A\u00020-H&J\u0018\u0010.\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010/\u001A\u00020\u000EH&¨\u00060"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "ackSettings", "", "alternateService", "streamId", "", "origin", "", "protocol", "Lokio/ByteString;", "host", "port", "maxAge", "", "data", "inFinished", "", "source", "Lokio/BufferedSource;", "length", "goAway", "lastGoodStreamId", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "debugData", "headers", "associatedStreamId", "headerBlock", "", "Lokhttp3/internal/http2/Header;", "ping", "ack", "payload1", "payload2", "priority", "streamDependency", "weight", "exclusive", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "settings", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "windowUpdate", "windowSizeIncrement", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Handler {
        void ackSettings();

        void alternateService(int arg1, @NotNull String arg2, @NotNull ByteString arg3, @NotNull String arg4, int arg5, long arg6);

        void data(boolean arg1, int arg2, @NotNull BufferedSource arg3, int arg4) throws IOException;

        void goAway(int arg1, @NotNull ErrorCode arg2, @NotNull ByteString arg3);

        void headers(boolean arg1, int arg2, int arg3, @NotNull List arg4);

        void ping(boolean arg1, int arg2, int arg3);

        void priority(int arg1, int arg2, int arg3, boolean arg4);

        void pushPromise(int arg1, int arg2, @NotNull List arg3) throws IOException;

        void rstStream(int arg1, @NotNull ErrorCode arg2);

        void settings(boolean arg1, @NotNull Settings arg2);

        void windowUpdate(int arg1, long arg2);
    }

    @NotNull
    public static final Companion Companion;
    public final BufferedSource a;
    public final boolean b;
    public final ContinuationSource c;
    public final Reader d;
    public static final Logger e;

    static {
        Http2Reader.Companion = new Companion(null);
        Logger logger0 = Logger.getLogger("okhttp3.internal.http2.Http2");
        Intrinsics.checkNotNullExpressionValue(logger0, "getLogger(Http2::class.java.name)");
        Http2Reader.e = logger0;
    }

    public Http2Reader(@NotNull BufferedSource bufferedSource0, boolean z) {
        Intrinsics.checkNotNullParameter(bufferedSource0, "source");
        super();
        this.a = bufferedSource0;
        this.b = z;
        ContinuationSource http2Reader$ContinuationSource0 = new ContinuationSource(bufferedSource0);
        this.c = http2Reader$ContinuationSource0;
        this.d = new Reader(http2Reader$ContinuationSource0, 0x1000, 0, 4, null);
    }

    public final List a(int v, int v1, int v2, int v3) {
        this.c.setLeft(v);
        int v4 = this.c.getLeft();
        this.c.setLength(v4);
        this.c.setPadding(v1);
        this.c.setFlags(v2);
        this.c.setStreamId(v3);
        this.d.readHeaders();
        return this.d.getAndResetHeaderList();
    }

    public final void b(Handler http2Reader$Handler0, int v) {
        int v1 = this.a.readInt();
        http2Reader$Handler0.priority(v, v1 & 0x7FFFFFFF, Util.and(this.a.readByte(), ((byte)0xFF)) + 1, (0x80000000 & v1) != 0);
    }

    @Override
    public void close() throws IOException {
        this.a.close();
    }

    public final boolean nextFrame(boolean z, @NotNull Handler http2Reader$Handler0) throws IOException {
        int v4;
        BufferedSource bufferedSource0 = this.a;
        Intrinsics.checkNotNullParameter(http2Reader$Handler0, "handler");
        try {
            bufferedSource0.require(9L);
        }
        catch(EOFException unused_ex) {
            return false;
        }
        int v = Util.readMedium(bufferedSource0);
        if(v <= 0x4000) {
            int v1 = Util.and(bufferedSource0.readByte(), ((byte)0xFF));
            int v2 = Util.and(bufferedSource0.readByte(), ((byte)0xFF));
            int v3 = bufferedSource0.readInt();
            Logger logger0 = Http2Reader.e;
            if(logger0.isLoggable(Level.FINE)) {
                v4 = v3 & 0x7FFFFFFF;
                logger0.fine(Http2.INSTANCE.frameLog(true, v3 & 0x7FFFFFFF, v, v1, v2));
            }
            else {
                v4 = v3 & 0x7FFFFFFF;
            }
            if(z && v1 != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(v1));
            }
            switch(v1) {
                case 0: {
                    if(v4 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    if((v2 & 0x20) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int v5 = (v2 & 8) == 0 ? 0 : Util.and(bufferedSource0.readByte(), ((byte)0xFF));
                    http2Reader$Handler0.data((v2 & 1) != 0, v4, bufferedSource0, Http2Reader.Companion.lengthWithoutPadding(v, v2, v5));
                    bufferedSource0.skip(((long)v5));
                    return true;
                }
                case 1: {
                    if(v4 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    int v6 = (v2 & 8) == 0 ? 0 : Util.and(bufferedSource0.readByte(), ((byte)0xFF));
                    if((v2 & 0x20) != 0) {
                        this.b(http2Reader$Handler0, v4);
                        v -= 5;
                    }
                    http2Reader$Handler0.headers((v2 & 1) != 0, v4, -1, this.a(Http2Reader.Companion.lengthWithoutPadding(v, v2, v6), v6, v2, v4));
                    return true;
                }
                case 2: {
                    if(v != 5) {
                        throw new IOException("TYPE_PRIORITY length: " + v + " != 5");
                    }
                    if(v4 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    this.b(http2Reader$Handler0, v4);
                    return true;
                }
                case 3: {
                    if(v != 4) {
                        throw new IOException("TYPE_RST_STREAM length: " + v + " != 4");
                    }
                    if(v4 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int v7 = bufferedSource0.readInt();
                    ErrorCode errorCode0 = ErrorCode.Companion.fromHttp2(v7);
                    if(errorCode0 == null) {
                        throw new IOException("TYPE_RST_STREAM unexpected error code: " + v7);
                    }
                    http2Reader$Handler0.rstStream(v4, errorCode0);
                    return true;
                }
                case 4: {
                    if(v4 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if((v2 & 1) != 0) {
                        if(v != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        http2Reader$Handler0.ackSettings();
                        return true;
                    }
                    if(v % 6 != 0) {
                        throw new IOException("TYPE_SETTINGS length % 6 != 0: " + v);
                    }
                    Settings settings0 = new Settings();
                    IntProgression intProgression0 = c.step(c.until(0, v), 6);
                    int v8 = intProgression0.getFirst();
                    int v9 = intProgression0.getLast();
                    int v10 = intProgression0.getStep();
                    if(v10 > 0 && v8 <= v9 || v10 < 0 && v9 <= v8) {
                        while(true) {
                            int v11 = Util.and(bufferedSource0.readShort(), ((short)0xFFFF));
                            int v12 = bufferedSource0.readInt();
                            if(v11 != 2) {
                                switch(v11) {
                                    case 3: {
                                        v11 = 4;
                                        break;
                                    }
                                    case 4: {
                                        if(v12 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        v11 = 7;
                                        break;
                                    }
                                    case 5: {
                                        if(v12 < 0x4000 || v12 > 0xFFFFFF) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + v12);
                                        }
                                    }
                                }
                            }
                            else if(v12 != 0 && v12 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            settings0.set(v11, v12);
                            if(v8 == v9) {
                                break;
                            }
                            v8 += v10;
                        }
                    }
                    http2Reader$Handler0.settings(false, settings0);
                    return true;
                }
                case 5: {
                    if(v4 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int v13 = (v2 & 8) == 0 ? 0 : Util.and(bufferedSource0.readByte(), ((byte)0xFF));
                    http2Reader$Handler0.pushPromise(v4, bufferedSource0.readInt() & 0x7FFFFFFF, this.a(Http2Reader.Companion.lengthWithoutPadding(v - 4, v2, v13), v13, v2, v4));
                    return true;
                }
                case 6: {
                    if(v != 8) {
                        throw new IOException("TYPE_PING length != 8: " + v);
                    }
                    if(v4 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    http2Reader$Handler0.ping((v2 & 1) != 0, bufferedSource0.readInt(), bufferedSource0.readInt());
                    return true;
                }
                case 7: {
                    if(v < 8) {
                        throw new IOException("TYPE_GOAWAY length < 8: " + v);
                    }
                    if(v4 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int v14 = bufferedSource0.readInt();
                    int v15 = bufferedSource0.readInt();
                    ErrorCode errorCode1 = ErrorCode.Companion.fromHttp2(v15);
                    if(errorCode1 == null) {
                        throw new IOException("TYPE_GOAWAY unexpected error code: " + v15);
                    }
                    http2Reader$Handler0.goAway(v14, errorCode1, (v - 8 <= 0 ? ByteString.EMPTY : bufferedSource0.readByteString(((long)(v - 8)))));
                    return true;
                }
                case 8: {
                    if(v != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + v);
                    }
                    long v16 = Util.and(bufferedSource0.readInt(), 0x7FFFFFFFL);
                    if(v16 == 0L) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    http2Reader$Handler0.windowUpdate(v4, v16);
                    return true;
                }
                default: {
                    bufferedSource0.skip(((long)v));
                    return true;
                }
            }
        }
        throw new IOException("FRAME_SIZE_ERROR: " + v);
    }

    public final void readConnectionPreface(@NotNull Handler http2Reader$Handler0) throws IOException {
        Intrinsics.checkNotNullParameter(http2Reader$Handler0, "handler");
        if(this.b) {
            if(!this.nextFrame(true, http2Reader$Handler0)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        ByteString byteString0 = Http2.CONNECTION_PREFACE;
        ByteString byteString1 = this.a.readByteString(((long)byteString0.size()));
        Logger logger0 = Http2Reader.e;
        if(logger0.isLoggable(Level.FINE)) {
            logger0.fine(Util.format(("<< CONNECTION " + byteString1.hex()), new Object[0]));
        }
        if(!Intrinsics.areEqual(byteString0, byteString1)) {
            throw new IOException("Expected a connection header but was " + byteString1.utf8());
        }
    }
}

