package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.p;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.a;

@Metadata(d1 = {"\u0000\u008A\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0005\\[]^_BA\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\r\u0012\u0006\u0010\u000F\u001A\u00020\u000B\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001B\u001A\u00020\u00162\u0006\u0010\u001A\u001A\u00020\u0019\u00A2\u0006\u0004\b\u001B\u0010\u001CJ!\u0010#\u001A\u00020\u00162\u0006\u0010\u001E\u001A\u00020\u001D2\b\u0010 \u001A\u0004\u0018\u00010\u001FH\u0000\u00A2\u0006\u0004\b!\u0010\"J\u001D\u0010(\u001A\u00020\u00162\u0006\u0010%\u001A\u00020$2\u0006\u0010\'\u001A\u00020&\u00A2\u0006\u0004\b(\u0010)J\r\u0010*\u001A\u00020\u0016\u00A2\u0006\u0004\b*\u0010\u0018J\r\u0010,\u001A\u00020+\u00A2\u0006\u0004\b,\u0010-J\u001D\u00101\u001A\u00020\u00162\u0006\u0010.\u001A\u00020\u000B2\u0006\u00100\u001A\u00020/\u00A2\u0006\u0004\b1\u00102J\r\u00103\u001A\u00020\u0016\u00A2\u0006\u0004\b3\u0010\u0018J\r\u00105\u001A\u000204\u00A2\u0006\u0004\b5\u00106J\r\u00107\u001A\u000204\u00A2\u0006\u0004\b7\u00106J\r\u00108\u001A\u000204\u00A2\u0006\u0004\b8\u00106J\u0017\u0010:\u001A\u00020\u00162\u0006\u00109\u001A\u00020$H\u0016\u00A2\u0006\u0004\b:\u0010;J\u0017\u0010:\u001A\u00020\u00162\u0006\u0010=\u001A\u00020<H\u0016\u00A2\u0006\u0004\b:\u0010>J\u0017\u0010@\u001A\u00020\u00162\u0006\u0010?\u001A\u00020<H\u0016\u00A2\u0006\u0004\b@\u0010>J\u0017\u0010A\u001A\u00020\u00162\u0006\u0010?\u001A\u00020<H\u0016\u00A2\u0006\u0004\bA\u0010>J\u001F\u0010D\u001A\u00020\u00162\u0006\u0010B\u001A\u0002042\u0006\u0010C\u001A\u00020$H\u0016\u00A2\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001A\u00020+2\u0006\u00109\u001A\u00020$H\u0016\u00A2\u0006\u0004\bF\u0010GJ\u0017\u0010F\u001A\u00020+2\u0006\u0010=\u001A\u00020<H\u0016\u00A2\u0006\u0004\bF\u0010HJ\u0015\u0010I\u001A\u00020+2\u0006\u0010?\u001A\u00020<\u00A2\u0006\u0004\bI\u0010HJ!\u0010J\u001A\u00020+2\u0006\u0010B\u001A\u0002042\b\u0010C\u001A\u0004\u0018\u00010$H\u0016\u00A2\u0006\u0004\bJ\u0010KJ\'\u0010J\u001A\u00020+2\u0006\u0010B\u001A\u0002042\b\u0010C\u001A\u0004\u0018\u00010$2\u0006\u0010L\u001A\u00020\u000B\u00A2\u0006\u0004\bJ\u0010MJ\u000F\u0010O\u001A\u00020+H\u0000\u00A2\u0006\u0004\bN\u0010-J\u000F\u0010Q\u001A\u00020\u0016H\u0000\u00A2\u0006\u0004\bP\u0010\u0018J#\u0010U\u001A\u00020\u00162\n\u0010T\u001A\u00060Rj\u0002`S2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001D\u00A2\u0006\u0004\bU\u0010VR\u001A\u0010\b\u001A\u00020\u00078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bW\u0010X\u001A\u0004\bY\u0010Z\u00A8\u0006`"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/Request;", "originalRequest", "Lokhttp3/WebSocketListener;", "listener", "Ljava/util/Random;", "random", "", "pingIntervalMillis", "Lokhttp3/internal/ws/WebSocketExtensions;", "extensions", "minimumDeflateSize", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "request", "()Lokhttp3/Request;", "queueSize", "()J", "", "cancel", "()V", "Lokhttp3/OkHttpClient;", "client", "connect", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Response;", "response", "Lokhttp3/internal/connection/Exchange;", "exchange", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)V", "checkUpgradeSuccess", "", "name", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "streams", "initReaderAndWriter", "(Ljava/lang/String;Lokhttp3/internal/ws/RealWebSocket$Streams;)V", "loopReader", "", "processNextFrame", "()Z", "timeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)V", "tearDown", "", "sentPingCount", "()I", "receivedPingCount", "receivedPongCount", "text", "onReadMessage", "(Ljava/lang/String;)V", "Lokio/ByteString;", "bytes", "(Lokio/ByteString;)V", "payload", "onReadPing", "onReadPong", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "send", "(Ljava/lang/String;)Z", "(Lokio/ByteString;)Z", "pong", "close", "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "(ILjava/lang/String;J)Z", "writeOneFrame$okhttp", "writeOneFrame", "writePingFrame$okhttp", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failWebSocket", "(Ljava/lang/Exception;Lokhttp3/Response;)V", "b", "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "Companion", "Close", "Message", "Streams", "ug/a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRealWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,654:1\n1#2:655\n84#3,4:656\n90#3,13:664\n608#4,4:660\n*S KotlinDebug\n*F\n+ 1 RealWebSocket.kt\nokhttp3/internal/ws/RealWebSocket\n*L\n269#1:656,4\n512#1:664,13\n457#1:660,4\n*E\n"})
public final class RealWebSocket implements WebSocket, FrameCallback {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "", "code", "Lokio/ByteString;", "reason", "", "cancelAfterCloseMillis", "<init>", "(ILokio/ByteString;J)V", "a", "I", "getCode", "()I", "b", "Lokio/ByteString;", "getReason", "()Lokio/ByteString;", "c", "J", "getCancelAfterCloseMillis", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Close {
        public final int a;
        public final ByteString b;
        public final long c;

        public Close(int v, @Nullable ByteString byteString0, long v1) {
            this.a = v;
            this.b = byteString0;
            this.c = v1;
        }

        public final long getCancelAfterCloseMillis() {
            return this.c;
        }

        public final int getCode() {
            return this.a;
        }

        @Nullable
        public final ByteString getReason() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001A\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "", "CANCEL_AFTER_CLOSE_MILLIS", "J", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "", "Lokhttp3/Protocol;", "ONLY_HTTP1", "Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "", "formatOpcode", "Lokio/ByteString;", "data", "<init>", "(ILokio/ByteString;)V", "a", "I", "getFormatOpcode", "()I", "b", "Lokio/ByteString;", "getData", "()Lokio/ByteString;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Message {
        public final int a;
        public final ByteString b;

        public Message(int v, @NotNull ByteString byteString0) {
            Intrinsics.checkNotNullParameter(byteString0, "data");
            super();
            this.a = v;
            this.b = byteString0;
        }

        @NotNull
        public final ByteString getData() {
            return this.b;
        }

        public final int getFormatOpcode() {
            return this.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "", "client", "Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "sink", "<init>", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "a", "Z", "getClient", "()Z", "b", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "c", "Lokio/BufferedSink;", "getSink", "()Lokio/BufferedSink;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class Streams implements Closeable {
        public final boolean a;
        public final BufferedSource b;
        public final BufferedSink c;

        public Streams(boolean z, @NotNull BufferedSource bufferedSource0, @NotNull BufferedSink bufferedSink0) {
            Intrinsics.checkNotNullParameter(bufferedSource0, "source");
            Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
            super();
            this.a = z;
            this.b = bufferedSource0;
            this.c = bufferedSink0;
        }

        public final boolean getClient() {
            return this.a;
        }

        @NotNull
        public final BufferedSink getSink() {
            return this.c;
        }

        @NotNull
        public final BufferedSource getSource() {
            return this.b;
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 0x400L;
    public final Request a;
    public final WebSocketListener b;
    public final Random c;
    public final long d;
    public WebSocketExtensions e;
    public final long f;
    public final String g;
    public RealCall h;
    public a i;
    public WebSocketReader j;
    public WebSocketWriter k;
    public final TaskQueue l;
    public String m;
    public Streams n;
    public final ArrayDeque o;
    public final ArrayDeque p;
    public long q;
    public boolean r;
    public int s;
    public String t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public static final List z;

    static {
        RealWebSocket.Companion = new Companion(null);
        RealWebSocket.z = k.listOf(Protocol.HTTP_1_1);
    }

    public RealWebSocket(@NotNull TaskRunner taskRunner0, @NotNull Request request0, @NotNull WebSocketListener webSocketListener0, @NotNull Random random0, long v, @Nullable WebSocketExtensions webSocketExtensions0, long v1) {
        Intrinsics.checkNotNullParameter(taskRunner0, "taskRunner");
        Intrinsics.checkNotNullParameter(request0, "originalRequest");
        Intrinsics.checkNotNullParameter(webSocketListener0, "listener");
        Intrinsics.checkNotNullParameter(random0, "random");
        super();
        this.a = request0;
        this.b = webSocketListener0;
        this.c = random0;
        this.d = v;
        this.e = webSocketExtensions0;
        this.f = v1;
        this.l = taskRunner0.newQueue();
        this.o = new ArrayDeque();
        this.p = new ArrayDeque();
        this.s = -1;
        if(!Intrinsics.areEqual("GET", request0.method())) {
            throw new IllegalArgumentException(("Request must be GET: " + request0.method()).toString());
        }
        byte[] arr_b = new byte[16];
        random0.nextBytes(arr_b);
        this.g = okio.ByteString.Companion.of$default(ByteString.Companion, arr_b, 0, 0, 3, null).base64();
    }

    public final void a() {
        if(Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2257 MUST hold lock on " + this);
        }
        a a0 = this.i;
        if(a0 != null) {
            TaskQueue.schedule$default(this.l, a0, 0L, 2, null);
        }
    }

    public static final boolean access$isValid(RealWebSocket realWebSocket0, WebSocketExtensions webSocketExtensions0) {
        realWebSocket0.getClass();
        return !webSocketExtensions0.unknownValues && webSocketExtensions0.clientMaxWindowBits == null && (webSocketExtensions0.serverMaxWindowBits == null || new IntRange(8, 15).contains(((int)webSocketExtensions0.serverMaxWindowBits)));
    }

    public final void awaitTermination(long v, @NotNull TimeUnit timeUnit0) throws InterruptedException {
        Intrinsics.checkNotNullParameter(timeUnit0, "timeUnit");
        this.l.idleLatch().await(v, timeUnit0);
    }

    public final boolean b(int v, ByteString byteString0) {
        synchronized(this) {
            if(!this.u && !this.r) {
                if(this.q + ((long)byteString0.size()) > 0x1000000L) {
                    this.close(1001, null);
                    return false;
                }
                this.q += (long)byteString0.size();
                Message realWebSocket$Message0 = new Message(v, byteString0);
                this.p.add(realWebSocket$Message0);
                this.a();
                return true;
            }
            return false;
        }
    }

    @Override  // okhttp3.WebSocket
    public void cancel() {
        RealCall realCall0 = this.h;
        Intrinsics.checkNotNull(realCall0);
        realCall0.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(@NotNull Response response0, @Nullable Exchange exchange0) throws IOException {
        Intrinsics.checkNotNullParameter(response0, "response");
        if(response0.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was \'" + response0.code() + ' ' + response0.message() + '\'');
        }
        String s = Response.header$default(response0, "Connection", null, 2, null);
        if(!p.equals("Upgrade", s, true)) {
            throw new ProtocolException("Expected \'Connection\' header value \'Upgrade\' but was \'" + s + '\'');
        }
        String s1 = Response.header$default(response0, "Upgrade", null, 2, null);
        if(!p.equals("websocket", s1, true)) {
            throw new ProtocolException("Expected \'Upgrade\' header value \'websocket\' but was \'" + s1 + '\'');
        }
        String s2 = Response.header$default(response0, "Sec-WebSocket-Accept", null, 2, null);
        String s3 = ByteString.Companion.encodeUtf8(this.g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
        if(!Intrinsics.areEqual(s3, s2)) {
            throw new ProtocolException("Expected \'Sec-WebSocket-Accept\' header value \'" + s3 + "\' but was \'" + s2 + '\'');
        }
        if(exchange0 == null) {
            throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
        }
    }

    @Override  // okhttp3.WebSocket
    public boolean close(int v, @Nullable String s) {
        return this.close(v, s, 60000L);
    }

    public final boolean close(int v, @Nullable String s, long v1) {
        ByteString byteString0;
        synchronized(this) {
            WebSocketProtocol.INSTANCE.validateCloseCode(v);
            if(s == null) {
                byteString0 = null;
            }
            else {
                byteString0 = ByteString.Companion.encodeUtf8(s);
                if(((long)byteString0.size()) > 0x7BL) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + s).toString());
                }
            }
            if(!this.u && !this.r) {
                this.r = true;
                Close realWebSocket$Close0 = new Close(v, byteString0, v1);
                this.p.add(realWebSocket$Close0);
                this.a();
                return true;
            }
            return false;
        }
    }

    public final void connect(@NotNull OkHttpClient okHttpClient0) {
        Intrinsics.checkNotNullParameter(okHttpClient0, "client");
        Request request0 = this.a;
        if(request0.header("Sec-WebSocket-Extensions") != null) {
            this.failWebSocket(new ProtocolException("Request header not permitted: \'Sec-WebSocket-Extensions\'"), null);
            return;
        }
        OkHttpClient okHttpClient1 = okHttpClient0.newBuilder().eventListener(EventListener.NONE).protocols(RealWebSocket.z).build();
        Request request1 = request0.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.g).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall0 = new RealCall(okHttpClient1, request1, true);
        this.h = realCall0;
        Intrinsics.checkNotNull(realCall0);
        realCall0.enqueue(new Callback() {
            public final RealWebSocket a;
            public final Request b;

            {
                RealWebSocket realWebSocket0 = request1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = realWebSocket0;
                this.b = request0;
            }

            @Override  // okhttp3.Callback
            public void onFailure(@NotNull Call call0, @NotNull IOException iOException0) {
                Intrinsics.checkNotNullParameter(call0, "call");
                Intrinsics.checkNotNullParameter(iOException0, "e");
                this.a.failWebSocket(iOException0, null);
            }

            @Override  // okhttp3.Callback
            public void onResponse(@NotNull Call call0, @NotNull Response response0) {
                Streams realWebSocket$Streams0;
                Intrinsics.checkNotNullParameter(call0, "call");
                Intrinsics.checkNotNullParameter(response0, "response");
                Exchange exchange0 = response0.exchange();
                try {
                    this.a.checkUpgradeSuccess$okhttp(response0, exchange0);
                    Intrinsics.checkNotNull(exchange0);
                    realWebSocket$Streams0 = exchange0.newWebSocketStreams();
                }
                catch(IOException iOException0) {
                    this.a.failWebSocket(iOException0, response0);
                    Util.closeQuietly(response0);
                    if(exchange0 != null) {
                        exchange0.webSocketUpgradeFailed();
                    }
                    return;
                }
                WebSocketExtensions webSocketExtensions0 = WebSocketExtensions.Companion.parse(response0.headers());
                this.a.e = webSocketExtensions0;
                if(!RealWebSocket.access$isValid(this.a, webSocketExtensions0)) {
                    synchronized(this.a) {
                        this.a.p.clear();
                        this.a.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    this.a.initReaderAndWriter(Util.okHttpName + " WebSocket " + this.b.url().redact(), realWebSocket$Streams0);
                    this.a.getListener$okhttp().onOpen(this.a, response0);
                    this.a.loopReader();
                }
                catch(Exception exception0) {
                    this.a.failWebSocket(exception0, null);
                }
            }
        });
    }

    public final void failWebSocket(@NotNull Exception exception0, @Nullable Response response0) {
        WebSocketWriter webSocketWriter0;
        WebSocketReader webSocketReader0;
        Streams realWebSocket$Streams0;
        Intrinsics.checkNotNullParameter(exception0, "e");
        synchronized(this) {
            if(this.u) {
                return;
            }
            this.u = true;
            realWebSocket$Streams0 = this.n;
            this.n = null;
            webSocketReader0 = this.j;
            this.j = null;
            webSocketWriter0 = this.k;
            this.k = null;
            this.l.shutdown();
        }
        try {
            this.b.onFailure(this, exception0, response0);
        }
        catch(Throwable throwable0) {
            if(realWebSocket$Streams0 != null) {
                Util.closeQuietly(realWebSocket$Streams0);
            }
            if(webSocketReader0 != null) {
                Util.closeQuietly(webSocketReader0);
            }
            if(webSocketWriter0 != null) {
                Util.closeQuietly(webSocketWriter0);
            }
            throw throwable0;
        }
        if(realWebSocket$Streams0 != null) {
            Util.closeQuietly(realWebSocket$Streams0);
        }
        if(webSocketReader0 != null) {
            Util.closeQuietly(webSocketReader0);
        }
        if(webSocketWriter0 != null) {
            Util.closeQuietly(webSocketWriter0);
        }
    }

    @NotNull
    public final WebSocketListener getListener$okhttp() {
        return this.b;
    }

    public final void initReaderAndWriter(@NotNull String s, @NotNull Streams realWebSocket$Streams0) throws IOException {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(realWebSocket$Streams0, "streams");
        WebSocketExtensions webSocketExtensions0 = this.e;
        Intrinsics.checkNotNull(webSocketExtensions0);
        synchronized(this) {
            this.m = s;
            this.n = realWebSocket$Streams0;
            boolean z = webSocketExtensions0.noContextTakeover(realWebSocket$Streams0.getClient());
            this.k = new WebSocketWriter(realWebSocket$Streams0.getClient(), realWebSocket$Streams0.getSink(), this.c, webSocketExtensions0.perMessageDeflate, z, this.f);
            this.i = new a(this);
            long v1 = this.d;
            if(v1 != 0L) {
                long v2 = TimeUnit.MILLISECONDS.toNanos(v1);
                okhttp3.internal.ws.RealWebSocket.initReaderAndWriter.lambda.3..inlined.schedule.1 realWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$10 = new Task(this, v2) {
                    public final RealWebSocket e;
                    public final long f;

                    {
                        this.e = realWebSocket0;
                        this.f = v;
                        super(s, false, 2, null);
                    }

                    @Override  // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.e.writePingFrame$okhttp();
                        return this.f;
                    }
                };
                this.l.schedule(realWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$10, v2);
            }
            if(!this.p.isEmpty()) {
                this.a();
            }
        }
        boolean z1 = webSocketExtensions0.noContextTakeover(!realWebSocket$Streams0.getClient());
        this.j = new WebSocketReader(realWebSocket$Streams0.getClient(), realWebSocket$Streams0.getSource(), this, webSocketExtensions0.perMessageDeflate, z1);
    }

    public final void loopReader() throws IOException {
        while(this.s == -1) {
            WebSocketReader webSocketReader0 = this.j;
            Intrinsics.checkNotNull(webSocketReader0);
            webSocketReader0.processNextFrame();
        }
    }

    @Override  // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public void onReadClose(int v, @NotNull String s) {
        WebSocketWriter webSocketWriter0;
        WebSocketReader webSocketReader0;
        Intrinsics.checkNotNullParameter(s, "reason");
        if(v == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized(this) {
            if(this.s == -1) {
                this.s = v;
                this.t = s;
                Streams realWebSocket$Streams0 = null;
                if(!this.r || !this.p.isEmpty()) {
                    webSocketReader0 = null;
                    webSocketWriter0 = null;
                }
                else {
                    Streams realWebSocket$Streams1 = this.n;
                    this.n = null;
                    webSocketReader0 = this.j;
                    this.j = null;
                    webSocketWriter0 = this.k;
                    this.k = null;
                    this.l.shutdown();
                    realWebSocket$Streams0 = realWebSocket$Streams1;
                }
                try {
                    this.b.onClosing(this, v, s);
                    if(realWebSocket$Streams0 != null) {
                        this.b.onClosed(this, v, s);
                    }
                }
                finally {
                    if(realWebSocket$Streams0 != null) {
                        Util.closeQuietly(realWebSocket$Streams0);
                    }
                    if(webSocketReader0 != null) {
                        Util.closeQuietly(webSocketReader0);
                    }
                    if(webSocketWriter0 != null) {
                        Util.closeQuietly(webSocketWriter0);
                    }
                }
                return;
            }
        }
        throw new IllegalStateException("already closed");
    }

    @Override  // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public void onReadMessage(@NotNull String s) throws IOException {
        Intrinsics.checkNotNullParameter(s, "text");
        this.b.onMessage(this, s);
    }

    @Override  // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public void onReadMessage(@NotNull ByteString byteString0) throws IOException {
        Intrinsics.checkNotNullParameter(byteString0, "bytes");
        this.b.onMessage(this, byteString0);
    }

    @Override  // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public void onReadPing(@NotNull ByteString byteString0) {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(byteString0, "payload");
            if(!this.u && (!this.r || !this.p.isEmpty())) {
                this.o.add(byteString0);
                this.a();
                ++this.w;
            }
        }
    }

    @Override  // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public void onReadPong(@NotNull ByteString byteString0) {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(byteString0, "payload");
            ++this.x;
            this.y = false;
        }
    }

    public final boolean pong(@NotNull ByteString byteString0) {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(byteString0, "payload");
            if(!this.u && (!this.r || !this.p.isEmpty())) {
                this.o.add(byteString0);
                this.a();
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader0 = this.j;
            Intrinsics.checkNotNull(webSocketReader0);
            webSocketReader0.processNextFrame();
            if(this.s == -1) {
                return true;
            }
        }
        catch(Exception exception0) {
            this.failWebSocket(exception0, null);
        }
        return false;
    }

    @Override  // okhttp3.WebSocket
    public long queueSize() {
        synchronized(this) {
        }
        return this.q;
    }

    public final int receivedPingCount() {
        synchronized(this) {
        }
        return this.w;
    }

    public final int receivedPongCount() {
        synchronized(this) {
        }
        return this.x;
    }

    @Override  // okhttp3.WebSocket
    @NotNull
    public Request request() {
        return this.a;
    }

    @Override  // okhttp3.WebSocket
    public boolean send(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "text");
        return this.b(1, ByteString.Companion.encodeUtf8(s));
    }

    @Override  // okhttp3.WebSocket
    public boolean send(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "bytes");
        return this.b(2, byteString0);
    }

    public final int sentPingCount() {
        synchronized(this) {
        }
        return this.v;
    }

    public final void tearDown() throws InterruptedException {
        this.l.shutdown();
        this.l.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    public final boolean writeOneFrame$okhttp() throws IOException {
        WebSocketWriter webSocketWriter1;
        WebSocketReader webSocketReader0;
        Streams realWebSocket$Streams0;
        String s;
        int v;
        Object object2;
        Object object1;
        Object object0;
        WebSocketWriter webSocketWriter0;
        synchronized(this) {
            if(!this.u) {
                webSocketWriter0 = this.k;
                object0 = this.o.poll();
                object1 = null;
                if(object0 == null) {
                    object2 = this.p.poll();
                    if(object2 instanceof Close) {
                        v = this.s;
                        s = this.t;
                        if(v == -1) {
                            long v1 = ((Close)object2).getCancelAfterCloseMillis();
                            long v2 = TimeUnit.MILLISECONDS.toNanos(v1);
                            okhttp3.internal.ws.RealWebSocket.writeOneFrame.lambda.8..inlined.execute.default.1 realWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$10 = new Task(true, this) {
                                @Override  // okhttp3.internal.concurrent.Task
                                public long runOnce() {
                                    this.e.cancel();
                                    return -1L;
                                }
                            };
                            this.l.schedule(realWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$10, v2);
                            realWebSocket$Streams0 = null;
                            webSocketReader0 = null;
                            webSocketWriter1 = null;
                        }
                        else {
                            realWebSocket$Streams0 = this.n;
                            this.n = null;
                            webSocketReader0 = this.j;
                            this.j = null;
                            webSocketWriter1 = this.k;
                            this.k = null;
                            this.l.shutdown();
                        }
                    }
                    else {
                        goto label_27;
                    }
                    object1 = object2;
                }
                else {
                    goto label_37;
                }
                goto label_46;
            }
            return false;
        }
    label_27:
        if(object2 == null) {
            return false;
        }
        s = null;
        webSocketReader0 = null;
        webSocketWriter1 = null;
        v = -1;
        realWebSocket$Streams0 = null;
        object1 = object2;
        goto label_46;
    label_37:
        s = null;
        webSocketReader0 = null;
        webSocketWriter1 = null;
        v = -1;
        realWebSocket$Streams0 = null;
    label_46:
        try {
            if(object0 != null) {
                Intrinsics.checkNotNull(webSocketWriter0);
                webSocketWriter0.writePong(((ByteString)object0));
                return true;
            }
            if(object1 instanceof Message) {
                Message realWebSocket$Message0 = (Message)object1;
                Intrinsics.checkNotNull(webSocketWriter0);
                webSocketWriter0.writeMessageFrame(realWebSocket$Message0.getFormatOpcode(), realWebSocket$Message0.getData());
                synchronized(this) {
                    this.q -= (long)realWebSocket$Message0.getData().size();
                }
                return true;
            }
            if(object1 instanceof Close) {
                Intrinsics.checkNotNull(webSocketWriter0);
                webSocketWriter0.writeClose(((Close)object1).getCode(), ((Close)object1).getReason());
                if(realWebSocket$Streams0 != null) {
                    Intrinsics.checkNotNull(s);
                    this.b.onClosed(this, v, s);
                }
                return true;
            }
        }
        finally {
            if(realWebSocket$Streams0 != null) {
                Util.closeQuietly(realWebSocket$Streams0);
            }
            if(webSocketReader0 != null) {
                Util.closeQuietly(webSocketReader0);
            }
            if(webSocketWriter1 != null) {
                Util.closeQuietly(webSocketWriter1);
            }
        }
        throw new AssertionError();
    }

    public final void writePingFrame$okhttp() {
        int v;
        WebSocketWriter webSocketWriter0;
        synchronized(this) {
            if(this.u) {
                return;
            }
            webSocketWriter0 = this.k;
            if(webSocketWriter0 == null) {
                return;
            }
            v = this.y ? this.v : -1;
            ++this.v;
            this.y = true;
        }
        if(v != -1) {
            StringBuilder stringBuilder0 = new StringBuilder("sent ping but didn\'t receive pong within ");
            stringBuilder0.append(this.d);
            stringBuilder0.append("ms (after ");
            this.failWebSocket(new SocketTimeoutException(wb.a.c(v - 1, " successful ping/pongs)", stringBuilder0)), null);
            return;
        }
        try {
            webSocketWriter0.writePing(ByteString.EMPTY);
        }
        catch(IOException iOException0) {
            this.failWebSocket(iOException0, null);
        }
    }
}

