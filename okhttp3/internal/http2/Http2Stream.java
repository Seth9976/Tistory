package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import jeb.synthetic.FIN;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 z2\u00020\u0001:\u0004z{|}B3\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u000B\u0010\fJ\r\u0010\r\u001A\u00020\t\u00A2\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u000F\u001A\u00020\t\u00A2\u0006\u0004\b\u000F\u0010\u000EJ+\u0010\u0015\u001A\u00020\u00142\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u000F\u001A\u00020\t\u00A2\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001A\u001A\u00020\u0019\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\r\u0010\u001C\u001A\u00020\u0019\u00A2\u0006\u0004\b\u001C\u0010\u001BJ\r\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\r\u0010!\u001A\u00020 \u00A2\u0006\u0004\b!\u0010\"J\u001F\u0010\'\u001A\u00020\u00142\u0006\u0010$\u001A\u00020#2\b\u0010&\u001A\u0004\u0018\u00010%\u00A2\u0006\u0004\b\'\u0010(J\u0015\u0010*\u001A\u00020\u00142\u0006\u0010)\u001A\u00020#\u00A2\u0006\u0004\b*\u0010+J\u001D\u0010/\u001A\u00020\u00142\u0006\u0010-\u001A\u00020,2\u0006\u0010.\u001A\u00020\u0002\u00A2\u0006\u0004\b/\u00100J\u001D\u00101\u001A\u00020\u00142\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0006\u00A2\u0006\u0004\b1\u00102J\u0015\u00103\u001A\u00020\u00142\u0006\u0010)\u001A\u00020#\u00A2\u0006\u0004\b3\u0010+J\u000F\u00106\u001A\u00020\u0014H\u0000\u00A2\u0006\u0004\b4\u00105J\u0015\u00109\u001A\u00020\u00142\u0006\u00108\u001A\u000207\u00A2\u0006\u0004\b9\u0010:J\u000F\u0010<\u001A\u00020\u0014H\u0000\u00A2\u0006\u0004\b;\u00105J\u000F\u0010>\u001A\u00020\u0014H\u0000\u00A2\u0006\u0004\b=\u00105R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010FR*\u0010M\u001A\u0002072\u0006\u0010G\u001A\u0002078\u0006@@X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010K\"\u0004\bL\u0010:R*\u0010Q\u001A\u0002072\u0006\u0010G\u001A\u0002078\u0006@@X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bN\u0010I\u001A\u0004\bO\u0010K\"\u0004\bP\u0010:R*\u0010U\u001A\u0002072\u0006\u0010G\u001A\u0002078\u0006@@X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bR\u0010I\u001A\u0004\bS\u0010K\"\u0004\bT\u0010:R*\u0010Y\u001A\u0002072\u0006\u0010G\u001A\u0002078\u0006@@X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bV\u0010I\u001A\u0004\bW\u0010K\"\u0004\bX\u0010:R\u001E\u0010-\u001A\u00060ZR\u00020\u00008\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b[\u0010\\\u001A\u0004\b]\u0010^R\u001E\u0010d\u001A\u00060_R\u00020\u00008\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b`\u0010a\u001A\u0004\bb\u0010cR\u001E\u0010\u001A\u001A\u00060eR\u00020\u00008\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bf\u0010g\u001A\u0004\bh\u0010iR\u001E\u0010\u001C\u001A\u00060eR\u00020\u00008\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bj\u0010g\u001A\u0004\bk\u0010iR$\u0010)\u001A\u0004\u0018\u00010#8@@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bl\u0010m\u001A\u0004\bn\u0010o\"\u0004\bp\u0010+R$\u0010&\u001A\u0004\u0018\u00010%8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bq\u0010r\u001A\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0011\u0010w\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\bw\u0010xR\u0011\u0010y\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\by\u0010x\u00A8\u0006~"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "", "id", "Lokhttp3/internal/http2/Http2Connection;", "connection", "", "outFinished", "inFinished", "Lokhttp3/Headers;", "headers", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "takeHeaders", "()Lokhttp3/Headers;", "trailers", "", "Lokhttp3/internal/http2/Header;", "responseHeaders", "flushHeaders", "", "writeHeaders", "(Ljava/util/List;ZZ)V", "enqueueTrailers", "(Lokhttp3/Headers;)V", "Lokio/Timeout;", "readTimeout", "()Lokio/Timeout;", "writeTimeout", "Lokio/Source;", "getSource", "()Lokio/Source;", "Lokio/Sink;", "getSink", "()Lokio/Sink;", "Lokhttp3/internal/http2/ErrorCode;", "rstStatusCode", "Ljava/io/IOException;", "errorException", "close", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "errorCode", "closeLater", "(Lokhttp3/internal/http2/ErrorCode;)V", "Lokio/BufferedSource;", "source", "length", "receiveData", "(Lokio/BufferedSource;I)V", "receiveHeaders", "(Lokhttp3/Headers;Z)V", "receiveRstStream", "cancelStreamIfNecessary$okhttp", "()V", "cancelStreamIfNecessary", "", "delta", "addBytesToWriteWindow", "(J)V", "checkOutNotClosed$okhttp", "checkOutNotClosed", "waitForIo$okhttp", "waitForIo", "a", "I", "getId", "()I", "b", "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "<set-?>", "c", "J", "getReadBytesTotal", "()J", "setReadBytesTotal$okhttp", "readBytesTotal", "d", "getReadBytesAcknowledged", "setReadBytesAcknowledged$okhttp", "readBytesAcknowledged", "e", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeBytesTotal", "f", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "writeBytesMaximum", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "i", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "j", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "k", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "l", "getWriteTimeout$okhttp", "m", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "n", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "isOpen", "()Z", "isLocallyInitiated", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n615#3,4:699\n615#3,4:703\n563#3:707\n563#3:708\n615#3,4:709\n563#3:713\n557#3:714\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream\n*L\n176#1:690,4\n255#1:694,4\n263#1:698\n274#1:699,4\n281#1:703,4\n295#1:707\n305#1:708\n491#1:709,4\n637#1:713\n657#1:714\n*E\n"})
public final class Http2Stream {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "", "EMIT_BUFFER_SIZE", "J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000ER\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010 \u001A\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\"\u0010$\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b!\u0010\u0014\u001A\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018¨\u0006%"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "", "finished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "(Lokio/Buffer;J)V", "flush", "()V", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "close", "a", "Z", "getFinished", "()Z", "setFinished", "(Z)V", "Lokhttp3/Headers;", "c", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "trailers", "d", "getClosed", "setClosed", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n615#2,4:689\n615#2,4:693\n615#2,4:697\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n*L\n528#1:689,4\n573#1:693,4\n589#1:697,4\n*E\n"})
    public final class FramingSink implements Sink {
        public boolean a;
        public final Buffer b;
        public Headers c;
        public boolean d;
        public final Http2Stream e;

        public FramingSink(boolean z) {
            this.a = z;
            this.b = new Buffer();
        }

        public FramingSink(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                z = false;
            }
            this(z);
        }

        public final void a(boolean z) {
            long v2;
            Http2Stream http2Stream0 = Http2Stream.this;
            synchronized(http2Stream0) {
                http2Stream0.getWriteTimeout$okhttp().enter();
                try {
                    while(http2Stream0.getWriteBytesTotal() >= http2Stream0.getWriteBytesMaximum() && !this.a && !this.d && http2Stream0.getErrorCode$okhttp() == null) {
                        http2Stream0.waitForIo$okhttp();
                    }
                }
                finally {
                    http2Stream0.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                }
                http2Stream0.checkOutNotClosed$okhttp();
                v2 = Math.min(http2Stream0.getWriteBytesMaximum() - http2Stream0.getWriteBytesTotal(), this.b.size());
                http2Stream0.setWriteBytesTotal$okhttp(http2Stream0.getWriteBytesTotal() + v2);
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z && v2 == this.b.size(), this.b, v2);
            }
            finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        @Override  // okio.Sink
        public void close() throws IOException {
            boolean z;
            Http2Stream http2Stream0 = Http2Stream.this;
            if(Util.assertionsEnabled && Thread.holdsLock(http2Stream0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-2299 MUST NOT hold lock on " + http2Stream0);
            }
            Http2Stream http2Stream1 = Http2Stream.this;
            synchronized(http2Stream1) {
                if(this.d) {
                    return;
                }
                z = http2Stream1.getErrorCode$okhttp() == null;
            }
            if(!Http2Stream.this.getSink$okhttp().a) {
                boolean z1 = this.b.size() > 0L;
                if(this.c != null) {
                    while(this.b.size() > 0L) {
                        this.a(false);
                    }
                    Headers headers0 = this.c;
                    Intrinsics.checkNotNull(headers0);
                    Http2Stream.this.getConnection().writeHeaders$okhttp(Http2Stream.this.getId(), z, Util.toHeaderList(headers0));
                }
                else if(z1) {
                    while(this.b.size() > 0L) {
                        this.a(true);
                    }
                }
                else if(z) {
                    Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                }
            }
            synchronized(Http2Stream.this) {
                this.d = true;
            }
            Http2Stream.this.getConnection().flush();
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        @Override  // okio.Sink
        public void flush() throws IOException {
            Http2Stream http2Stream0 = Http2Stream.this;
            if(Util.assertionsEnabled && Thread.holdsLock(http2Stream0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-2302 MUST NOT hold lock on " + http2Stream0);
            }
            synchronized(Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed$okhttp();
            }
            while(this.b.size() > 0L) {
                this.a(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.d;
        }

        public final boolean getFinished() {
            return this.a;
        }

        @Nullable
        public final Headers getTrailers() {
            return this.c;
        }

        public final void setClosed(boolean z) {
            this.d = z;
        }

        public final void setFinished(boolean z) {
            this.a = z;
        }

        public final void setTrailers(@Nullable Headers headers0) {
            this.c = headers0;
        }

        @Override  // okio.Sink
        @NotNull
        public Timeout timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override  // okio.Sink
        public void write(@NotNull Buffer buffer0, long v) throws IOException {
            Intrinsics.checkNotNullParameter(buffer0, "source");
            if(Util.assertionsEnabled) {
                Http2Stream http2Stream0 = Http2Stream.this;
                if(Thread.holdsLock(http2Stream0)) {
                    throw new AssertionError("Thread jeb-dexdec-sb-st-2322 MUST NOT hold lock on " + http2Stream0);
                }
            }
            Buffer buffer1 = this.b;
            buffer1.write(buffer0, v);
            while(buffer1.size() >= 0x4000L) {
                this.a(false);
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\u000B\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001A\u00020\u00048\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR\u0017\u0010\"\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u0017\u0010%\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010\u001F\u001A\u0004\b$\u0010!R$\u0010-\u001A\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001A\u00020\u00048\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b.\u0010\u0019\u001A\u0004\b/\u0010\u001B\"\u0004\b0\u0010\u001D¨\u00062"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "", "maxByteCount", "", "finished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "Lokio/Buffer;", "sink", "byteCount", "read", "(Lokio/Buffer;J)J", "Lokio/BufferedSource;", "source", "", "receive$okhttp", "(Lokio/BufferedSource;J)V", "receive", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "close", "()V", "b", "Z", "getFinished$okhttp", "()Z", "setFinished$okhttp", "(Z)V", "c", "Lokio/Buffer;", "getReceiveBuffer", "()Lokio/Buffer;", "receiveBuffer", "d", "getReadBuffer", "readBuffer", "Lokhttp3/Headers;", "e", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "trailers", "f", "getClosed$okhttp", "setClosed$okhttp", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n1#2:689\n615#3,4:690\n615#3,4:694\n563#3:698\n563#3:699\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSource\n*L\n407#1:690,4\n418#1:694,4\n458#1:698\n480#1:699\n*E\n"})
    public final class FramingSource implements Source {
        public final long a;
        public boolean b;
        public final Buffer c;
        public final Buffer d;
        public Headers e;
        public boolean f;
        public final Http2Stream g;

        public FramingSource(long v, boolean z) {
            this.a = v;
            this.b = z;
            this.c = new Buffer();
            this.d = new Buffer();
        }

        public final void a(long v) {
            Http2Stream http2Stream0 = Http2Stream.this;
            if(Util.assertionsEnabled && Thread.holdsLock(http2Stream0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-2298 MUST NOT hold lock on " + http2Stream0);
            }
            http2Stream0.getConnection().updateConnectionFlowControl$okhttp(v);
        }

        @Override  // okio.Source
        public void close() throws IOException {
            long v1;
            synchronized(Http2Stream.this) {
                this.f = true;
                v1 = this.d.size();
                this.d.clear();
                Intrinsics.checkNotNull(Http2Stream.this, "null cannot be cast to non-null type java.lang.Object");
                Http2Stream.this.notifyAll();
            }
            if(v1 > 0L) {
                this.a(v1);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.f;
        }

        public final boolean getFinished$okhttp() {
            return this.b;
        }

        @NotNull
        public final Buffer getReadBuffer() {
            return this.d;
        }

        @NotNull
        public final Buffer getReceiveBuffer() {
            return this.c;
        }

        @Nullable
        public final Headers getTrailers() {
            return this.e;
        }

        // This method was un-flattened
        @Override  // okio.Source
        public long read(@NotNull Buffer buffer0, long v) throws IOException {
            long v2;
            IOException iOException1;
            int v1;
            Http2Stream http2Stream0;
            Intrinsics.checkNotNullParameter(buffer0, "sink");
            if(v < 0L) {
                throw new IllegalArgumentException(q.n(v, "byteCount < 0: ").toString());
            }
            while(true) {
                http2Stream0 = Http2Stream.this;
                __monitor_enter(http2Stream0);
                v1 = FIN.finallyOpen$NT();
                http2Stream0.getReadTimeout$okhttp().enter();
                try {
                    if(http2Stream0.getErrorCode$okhttp() == null || this.b) {
                        iOException1 = null;
                    }
                    else {
                        IOException iOException0 = http2Stream0.getErrorException$okhttp();
                        if(iOException0 == null) {
                            ErrorCode errorCode0 = http2Stream0.getErrorCode$okhttp();
                            Intrinsics.checkNotNull(errorCode0);
                            iOException1 = new StreamResetException(errorCode0);
                        }
                        else {
                            iOException1 = iOException0;
                        }
                    }
                    if(this.f) {
                        throw new IOException("stream closed");
                    }
                    if(Long.compare(this.d.size(), 0L) > 0) {
                        goto label_26;
                    }
                    if(this.b || iOException1 != null) {
                        v2 = -1L;
                        break;
                    }
                    http2Stream0.waitForIo$okhttp();
                }
                catch(Throwable throwable0) {
                    goto label_34;
                }
                http2Stream0.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                FIN.finallyExec$NT(v1);
                continue;
                try {
                label_26:
                    v2 = this.d.read(buffer0, Math.min(v, this.d.size()));
                    http2Stream0.setReadBytesTotal$okhttp(http2Stream0.getReadBytesTotal() + v2);
                    long v3 = http2Stream0.getReadBytesTotal() - http2Stream0.getReadBytesAcknowledged();
                    if(iOException1 == null && v3 >= ((long)(http2Stream0.getConnection().getOkHttpSettings().getInitialWindowSize() / 2))) {
                        http2Stream0.getConnection().writeWindowUpdateLater$okhttp(http2Stream0.getId(), v3);
                        http2Stream0.setReadBytesAcknowledged$okhttp(http2Stream0.getReadBytesTotal());
                    }
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_34:
                http2Stream0.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                FIN.finallyExec$NT(v1);
                throw throwable0;
            }
            http2Stream0.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
            FIN.finallyCodeBegin$NT(v1);
            __monitor_exit(http2Stream0);
            FIN.finallyCodeEnd$NT(v1);
            if(v2 != -1L) {
                return v2;
            }
            if(iOException1 != null) {
                throw iOException1;
            }
            return -1L;
        }

        public final void receive$okhttp(@NotNull BufferedSource bufferedSource0, long v) throws IOException {
            boolean z;
            Intrinsics.checkNotNullParameter(bufferedSource0, "source");
            Http2Stream http2Stream0 = Http2Stream.this;
            if(Util.assertionsEnabled && Thread.holdsLock(http2Stream0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-2354 MUST NOT hold lock on " + http2Stream0);
            }
            long v1 = v;
            while(v1 > 0L) {
                synchronized(Http2Stream.this) {
                    z = false;
                    boolean z1 = this.b;
                }
                if(Long.compare(this.d.size() + v1, this.a) > 0) {
                    bufferedSource0.skip(v1);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if(z1) {
                    bufferedSource0.skip(v1);
                    return;
                }
                long v3 = bufferedSource0.read(this.c, v1);
                if(v3 == -1L) {
                    throw new EOFException();
                }
                v1 -= v3;
                Http2Stream http2Stream1 = Http2Stream.this;
                synchronized(http2Stream1) {
                    if(this.f) {
                        this.c.clear();
                    }
                    else {
                        if(this.d.size() == 0L) {
                            z = true;
                        }
                        this.d.writeAll(this.c);
                        if(z) {
                            Intrinsics.checkNotNull(http2Stream1, "null cannot be cast to non-null type java.lang.Object");
                            http2Stream1.notifyAll();
                        }
                    }
                }
            }
            this.a(v);
        }

        public final void setClosed$okhttp(boolean z) {
            this.f = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.b = z;
        }

        public final void setTrailers(@Nullable Headers headers0) {
            this.e = headers0;
        }

        @Override  // okio.Source
        @NotNull
        public Timeout timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001A\u00020\u0004J\u0012\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001A\u00020\u0004H\u0014¨\u0006\t"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "(Lokhttp3/internal/http2/Http2Stream;)V", "exitAndThrowIfTimedOut", "", "newTimeoutException", "Ljava/io/IOException;", "cause", "timedOut", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public final class StreamTimeout extends AsyncTimeout {
        public final Http2Stream n;

        public final void exitAndThrowIfTimedOut() throws IOException {
            if(this.exit()) {
                throw this.newTimeoutException(null);
            }
        }

        @Override  // okio.AsyncTimeout
        @NotNull
        public IOException newTimeoutException(@Nullable IOException iOException0) {
            IOException iOException1 = new SocketTimeoutException("timeout");
            if(iOException0 != null) {
                iOException1.initCause(iOException0);
            }
            return iOException1;
        }

        @Override  // okio.AsyncTimeout
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final long EMIT_BUFFER_SIZE = 0x4000L;
    public final int a;
    public final Http2Connection b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final FramingSource i;
    public final FramingSink j;
    public final StreamTimeout k;
    public final StreamTimeout l;
    public ErrorCode m;
    public IOException n;

    static {
        Http2Stream.Companion = new Companion(null);
    }

    public Http2Stream(int v, @NotNull Http2Connection http2Connection0, boolean z, boolean z1, @Nullable Headers headers0) {
        Intrinsics.checkNotNullParameter(http2Connection0, "connection");
        super();
        this.a = v;
        this.b = http2Connection0;
        this.f = (long)http2Connection0.getPeerSettings().getInitialWindowSize();
        ArrayDeque arrayDeque0 = new ArrayDeque();
        this.g = arrayDeque0;
        this.i = new FramingSource(this, ((long)http2Connection0.getOkHttpSettings().getInitialWindowSize()), z1);
        this.j = new FramingSink(this, z);
        this.k = new StreamTimeout(this);
        this.l = new StreamTimeout(this);
        if(headers0 != null) {
            if(this.isLocallyInitiated()) {
                throw new IllegalStateException("locally-initiated streams shouldn\'t have headers yet");
            }
            arrayDeque0.add(headers0);
            return;
        }
        if(!this.isLocallyInitiated()) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final boolean a(ErrorCode errorCode0, IOException iOException0) {
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2298 MUST NOT hold lock on " + this);
        }
        synchronized(this) {
            if(this.m != null) {
                return false;
            }
            this.m = errorCode0;
            this.n = iOException0;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
            if(this.i.getFinished$okhttp() && this.j.getFinished()) {
                return false;
            }
        }
        this.b.removeStream$okhttp(this.a);
        return true;
    }

    public final void addBytesToWriteWindow(long v) {
        this.f += v;
        if(v > 0L) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2309 MUST NOT hold lock on " + this);
        }
        synchronized(this) {
            boolean z = this.isOpen();
        }
        if(!this.i.getFinished$okhttp() && this.i.getClosed$okhttp() && (this.j.getFinished() || this.j.getClosed())) {
            this.close(ErrorCode.CANCEL, null);
            return;
        }
        if(!z) {
            this.b.removeStream$okhttp(this.a);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        FramingSink http2Stream$FramingSink0 = this.j;
        if(http2Stream$FramingSink0.getClosed()) {
            throw new IOException("stream closed");
        }
        if(http2Stream$FramingSink0.getFinished()) {
            throw new IOException("stream finished");
        }
        if(this.m != null) {
            IOException iOException0 = this.n;
            if(iOException0 == null) {
                ErrorCode errorCode0 = this.m;
                Intrinsics.checkNotNull(errorCode0);
                iOException0 = new StreamResetException(errorCode0);
            }
            throw iOException0;
        }
    }

    public final void close(@NotNull ErrorCode errorCode0, @Nullable IOException iOException0) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode0, "rstStatusCode");
        if(!this.a(errorCode0, iOException0)) {
            return;
        }
        this.b.writeSynReset$okhttp(this.a, errorCode0);
    }

    public final void closeLater(@NotNull ErrorCode errorCode0) {
        Intrinsics.checkNotNullParameter(errorCode0, "errorCode");
        if(!this.a(errorCode0, null)) {
            return;
        }
        this.b.writeSynResetLater$okhttp(this.a, errorCode0);
    }

    public final void enqueueTrailers(@NotNull Headers headers0) {
        Intrinsics.checkNotNullParameter(headers0, "trailers");
        synchronized(this) {
            if(!this.j.getFinished()) {
                if(headers0.size() == 0) {
                    throw new IllegalArgumentException("trailers.size() == 0");
                }
                this.j.setTrailers(headers0);
                return;
            }
        }
        throw new IllegalStateException("already finished");
    }

    @NotNull
    public final Http2Connection getConnection() {
        return this.b;
    }

    @Nullable
    public final ErrorCode getErrorCode$okhttp() {
        synchronized(this) {
        }
        return this.m;
    }

    @Nullable
    public final IOException getErrorException$okhttp() {
        return this.n;
    }

    public final int getId() {
        return this.a;
    }

    public final long getReadBytesAcknowledged() {
        return this.d;
    }

    public final long getReadBytesTotal() {
        return this.c;
    }

    @NotNull
    public final StreamTimeout getReadTimeout$okhttp() {
        return this.k;
    }

    @NotNull
    public final Sink getSink() {
        synchronized(this) {
            if(!this.h && !this.isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
            return this.j;
        }
    }

    @NotNull
    public final FramingSink getSink$okhttp() {
        return this.j;
    }

    @NotNull
    public final Source getSource() {
        return this.i;
    }

    @NotNull
    public final FramingSource getSource$okhttp() {
        return this.i;
    }

    public final long getWriteBytesMaximum() {
        return this.f;
    }

    public final long getWriteBytesTotal() {
        return this.e;
    }

    @NotNull
    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.l;
    }

    public final boolean isLocallyInitiated() {
        return this.b.getClient$okhttp() == ((this.a & 1) == 1);
    }

    public final boolean isOpen() {
        synchronized(this) {
            if(this.m != null) {
                return false;
            }
            return (this.i.getFinished$okhttp() || this.i.getClosed$okhttp()) && (this.j.getFinished() || this.j.getClosed()) && this.h ? false : true;
        }
    }

    @NotNull
    public final Timeout readTimeout() {
        return this.k;
    }

    public final void receiveData(@NotNull BufferedSource bufferedSource0, int v) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource0, "source");
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2300 MUST NOT hold lock on " + this);
        }
        this.i.receive$okhttp(bufferedSource0, ((long)v));
    }

    public final void receiveHeaders(@NotNull Headers headers0, boolean z) {
        Intrinsics.checkNotNullParameter(headers0, "headers");
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2344 MUST NOT hold lock on " + this);
        }
        synchronized(this) {
            if(!this.h || !z) {
                this.h = true;
                this.g.add(headers0);
            }
            else {
                this.i.setTrailers(headers0);
            }
            if(z) {
                this.i.setFinished$okhttp(true);
            }
            boolean z1 = this.isOpen();
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
        }
        if(!z1) {
            this.b.removeStream$okhttp(this.a);
        }
    }

    public final void receiveRstStream(@NotNull ErrorCode errorCode0) {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(errorCode0, "errorCode");
            if(this.m == null) {
                this.m = errorCode0;
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                this.notifyAll();
            }
        }
    }

    public final void setErrorCode$okhttp(@Nullable ErrorCode errorCode0) {
        this.m = errorCode0;
    }

    public final void setErrorException$okhttp(@Nullable IOException iOException0) {
        this.n = iOException0;
    }

    public final void setReadBytesAcknowledged$okhttp(long v) {
        this.d = v;
    }

    public final void setReadBytesTotal$okhttp(long v) {
        this.c = v;
    }

    public final void setWriteBytesMaximum$okhttp(long v) {
        this.f = v;
    }

    public final void setWriteBytesTotal$okhttp(long v) {
        this.e = v;
    }

    @NotNull
    public final Headers takeHeaders() throws IOException {
        IOException iOException0;
        synchronized(this) {
            this.k.enter();
            try {
                while(this.g.isEmpty() && this.m == null) {
                    this.waitForIo$okhttp();
                }
            }
            finally {
                this.k.exitAndThrowIfTimedOut();
            }
            if(!this.g.isEmpty()) {
                Object object0 = this.g.removeFirst();
                Intrinsics.checkNotNullExpressionValue(object0, "headersQueue.removeFirst()");
                return (Headers)object0;
            }
            iOException0 = this.n;
            if(iOException0 == null) {
                ErrorCode errorCode0 = this.m;
                Intrinsics.checkNotNull(errorCode0);
                iOException0 = new StreamResetException(errorCode0);
            }
        }
        throw iOException0;
    }

    @NotNull
    public final Headers trailers() throws IOException {
        synchronized(this) {
            if(this.i.getFinished$okhttp() && this.i.getReceiveBuffer().exhausted() && this.i.getReadBuffer().exhausted()) {
                Headers headers0 = this.i.getTrailers();
                if(headers0 == null) {
                    headers0 = Util.EMPTY_HEADERS;
                }
                return headers0;
            }
            if(this.m != null) {
                IOException iOException0 = this.n;
                if(iOException0 == null) {
                    ErrorCode errorCode0 = this.m;
                    Intrinsics.checkNotNull(errorCode0);
                    iOException0 = new StreamResetException(errorCode0);
                }
                throw iOException0;
            }
        }
        throw new IllegalStateException("too early; can\'t read the trailers yet");
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            this.wait();
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(@NotNull List list0, boolean z, boolean z1) throws IOException {
        boolean z2;
        Intrinsics.checkNotNullParameter(list0, "responseHeaders");
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2301 MUST NOT hold lock on " + this);
        }
        synchronized(this) {
            z2 = true;
            this.h = true;
            if(z) {
                this.j.setFinished(true);
            }
        }
        if(!z1) {
            synchronized(this.b) {
                if(this.b.getWriteBytesTotal() < this.b.getWriteBytesMaximum()) {
                    z2 = false;
                }
            }
            z1 = z2;
        }
        this.b.writeHeaders$okhttp(this.a, z, list0);
        if(z1) {
            this.b.flush();
        }
    }

    @NotNull
    public final Timeout writeTimeout() {
        return this.l;
    }
}

