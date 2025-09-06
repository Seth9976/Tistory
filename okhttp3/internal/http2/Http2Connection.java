package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00A0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\'\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00B2\u00012\u00020\u0001:\b\u00B3\u0001\u00B2\u0001\u00B4\u0001\u00B5\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u0004\u0018\u00010\n2\u0006\u0010\t\u001A\u00020\u0006\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0019\u0010\u000F\u001A\u0004\u0018\u00010\n2\u0006\u0010\r\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\u000E\u0010\fJ\u0017\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001C\u001A\u00020\n2\u0006\u0010\u0016\u001A\u00020\u00062\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001B\u001A\u00020\u001A\u00A2\u0006\u0004\b\u001C\u0010\u001DJ#\u0010\u001E\u001A\u00020\n2\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001B\u001A\u00020\u001A\u00A2\u0006\u0004\b\u001E\u0010\u001FJ-\u0010$\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010 \u001A\u00020\u001A2\f\u0010!\u001A\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0000\u00A2\u0006\u0004\b\"\u0010#J/\u0010(\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010 \u001A\u00020\u001A2\b\u0010&\u001A\u0004\u0018\u00010%2\u0006\u0010\'\u001A\u00020\u0010\u00A2\u0006\u0004\b(\u0010)J\u001F\u0010.\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010+\u001A\u00020*H\u0000\u00A2\u0006\u0004\b,\u0010-J\u001F\u00101\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010/\u001A\u00020*H\u0000\u00A2\u0006\u0004\b0\u0010-J\u001F\u00105\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00062\u0006\u00102\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b3\u00104J%\u00109\u001A\u00020\u00122\u0006\u00106\u001A\u00020\u001A2\u0006\u00107\u001A\u00020\u00062\u0006\u00108\u001A\u00020\u0006\u00A2\u0006\u0004\b9\u0010:J\r\u0010;\u001A\u00020\u0012\u00A2\u0006\u0004\b;\u0010<J\r\u00109\u001A\u00020\u0012\u00A2\u0006\u0004\b9\u0010<J\r\u0010=\u001A\u00020\u0012\u00A2\u0006\u0004\b=\u0010<J\r\u0010>\u001A\u00020\u0012\u00A2\u0006\u0004\b>\u0010<J\u0015\u0010?\u001A\u00020\u00122\u0006\u0010/\u001A\u00020*\u00A2\u0006\u0004\b?\u0010@J\u000F\u0010A\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\bA\u0010<J)\u0010A\u001A\u00020\u00122\u0006\u0010B\u001A\u00020*2\u0006\u0010C\u001A\u00020*2\b\u0010E\u001A\u0004\u0018\u00010DH\u0000\u00A2\u0006\u0004\bF\u0010GJ#\u0010K\u001A\u00020\u00122\b\b\u0002\u0010H\u001A\u00020\u001A2\b\b\u0002\u0010J\u001A\u00020IH\u0007\u00A2\u0006\u0004\bK\u0010LJ\u0015\u0010O\u001A\u00020\u00122\u0006\u0010N\u001A\u00020M\u00A2\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001A\u00020\u001A2\u0006\u0010Q\u001A\u00020\u0010\u00A2\u0006\u0004\bR\u0010SJ\u000F\u0010U\u001A\u00020\u0012H\u0000\u00A2\u0006\u0004\bT\u0010<J\u0017\u0010X\u001A\u00020\u001A2\u0006\u0010\r\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\bV\u0010WJ%\u0010[\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00062\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0000\u00A2\u0006\u0004\bY\u0010ZJ-\u0010_\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00062\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\\\u001A\u00020\u001AH\u0000\u00A2\u0006\u0004\b]\u0010^J/\u0010d\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010a\u001A\u00020`2\u0006\u0010\'\u001A\u00020\u00062\u0006\u0010\\\u001A\u00020\u001AH\u0000\u00A2\u0006\u0004\bb\u0010cJ\u001F\u0010f\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010+\u001A\u00020*H\u0000\u00A2\u0006\u0004\be\u0010-R\u001A\u0010k\u001A\u00020\u001A8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bg\u0010h\u001A\u0004\bi\u0010jR\u001A\u0010q\u001A\u00020l8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bm\u0010n\u001A\u0004\bo\u0010pR&\u0010w\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0r8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bs\u0010t\u001A\u0004\bu\u0010vR\u001A\u0010}\u001A\u00020x8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\by\u0010z\u001A\u0004\b{\u0010|R&\u0010\u0083\u0001\u001A\u00020\u00068\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0015\n\u0004\b~\u0010\u007F\u001A\u0005\b\u0080\u0001\u0010\b\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\'\u0010\u0087\u0001\u001A\u00020\u00068\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0016\n\u0005\b\u0084\u0001\u0010\u007F\u001A\u0005\b\u0085\u0001\u0010\b\"\u0006\b\u0086\u0001\u0010\u0082\u0001R\u001C\u0010\u008C\u0001\u001A\u00020M8\u0006\u00A2\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001A\u0006\b\u008A\u0001\u0010\u008B\u0001R(\u0010\u0090\u0001\u001A\u00020M8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0017\n\u0006\b\u008D\u0001\u0010\u0089\u0001\u001A\u0006\b\u008E\u0001\u0010\u008B\u0001\"\u0005\b\u008F\u0001\u0010PR*\u0010\u0096\u0001\u001A\u00020\u00102\u0007\u0010\u0091\u0001\u001A\u00020\u00108\u0006@BX\u0086\u000E\u00A2\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001A\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u0099\u0001\u001A\u00020\u00102\u0007\u0010\u0091\u0001\u001A\u00020\u00108\u0006@BX\u0086\u000E\u00A2\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0093\u0001\u001A\u0006\b\u0098\u0001\u0010\u0095\u0001R*\u0010\u009C\u0001\u001A\u00020\u00102\u0007\u0010\u0091\u0001\u001A\u00020\u00108\u0006@BX\u0086\u000E\u00A2\u0006\u0010\n\u0006\b\u009A\u0001\u0010\u0093\u0001\u001A\u0006\b\u009B\u0001\u0010\u0095\u0001R*\u0010\u009F\u0001\u001A\u00020\u00102\u0007\u0010\u0091\u0001\u001A\u00020\u00108\u0006@BX\u0086\u000E\u00A2\u0006\u0010\n\u0006\b\u009D\u0001\u0010\u0093\u0001\u001A\u0006\b\u009E\u0001\u0010\u0095\u0001R \u0010\u00A5\u0001\u001A\u00030\u00A0\u00018\u0000X\u0080\u0004\u00A2\u0006\u0010\n\u0006\b\u00A1\u0001\u0010\u00A2\u0001\u001A\u0006\b\u00A3\u0001\u0010\u00A4\u0001R\u001D\u0010\u00AB\u0001\u001A\u00030\u00A6\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00A7\u0001\u0010\u00A8\u0001\u001A\u0006\b\u00A9\u0001\u0010\u00AA\u0001R!\u0010\u00B1\u0001\u001A\u00070\u00AC\u0001R\u00020\u00008\u0006\u00A2\u0006\u0010\n\u0006\b\u00AD\u0001\u0010\u00AE\u0001\u001A\u0006\b\u00AF\u0001\u0010\u00B0\u0001\u00A8\u0006\u00B6\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Lokhttp3/internal/http2/Http2Connection$Builder;", "builder", "<init>", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "", "openStreamCount", "()I", "id", "Lokhttp3/internal/http2/Http2Stream;", "getStream", "(I)Lokhttp3/internal/http2/Http2Stream;", "streamId", "removeStream$okhttp", "removeStream", "", "read", "", "updateConnectionFlowControl$okhttp", "(J)V", "updateConnectionFlowControl", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "", "out", "pushStream", "(ILjava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "newStream", "(Ljava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "outFinished", "alternating", "writeHeaders$okhttp", "(IZLjava/util/List;)V", "writeHeaders", "Lokio/Buffer;", "buffer", "byteCount", "writeData", "(IZLokio/Buffer;J)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "writeSynResetLater$okhttp", "(ILokhttp3/internal/http2/ErrorCode;)V", "writeSynResetLater", "statusCode", "writeSynReset$okhttp", "writeSynReset", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "(IJ)V", "writeWindowUpdateLater", "reply", "payload1", "payload2", "writePing", "(ZII)V", "writePingAndAwaitPong", "()V", "awaitPong", "flush", "shutdown", "(Lokhttp3/internal/http2/ErrorCode;)V", "close", "connectionCode", "streamCode", "Ljava/io/IOException;", "cause", "close$okhttp", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "sendConnectionPreface", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "start", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "Lokhttp3/internal/http2/Settings;", "settings", "setSettings", "(Lokhttp3/internal/http2/Settings;)V", "nowNs", "isHealthy", "(J)Z", "sendDegradedPingLater$okhttp", "sendDegradedPingLater", "pushedStream$okhttp", "(I)Z", "pushedStream", "pushRequestLater$okhttp", "(ILjava/util/List;)V", "pushRequestLater", "inFinished", "pushHeadersLater$okhttp", "(ILjava/util/List;Z)V", "pushHeadersLater", "Lokio/BufferedSource;", "source", "pushDataLater$okhttp", "(ILokio/BufferedSource;IZ)V", "pushDataLater", "pushResetLater$okhttp", "pushResetLater", "a", "Z", "getClient$okhttp", "()Z", "client", "Lokhttp3/internal/http2/Http2Connection$Listener;", "b", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "", "c", "Ljava/util/Map;", "getStreams$okhttp", "()Ljava/util/Map;", "streams", "", "d", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "connectionName", "e", "I", "getLastGoodStreamId$okhttp", "setLastGoodStreamId$okhttp", "(I)V", "lastGoodStreamId", "f", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "nextStreamId", "t", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "okHttpSettings", "u", "getPeerSettings", "setPeerSettings", "peerSettings", "<set-?>", "v", "J", "getReadBytesTotal", "()J", "readBytesTotal", "w", "getReadBytesAcknowledged", "readBytesAcknowledged", "x", "getWriteBytesTotal", "writeBytesTotal", "y", "getWriteBytesMaximum", "writeBytesMaximum", "Ljava/net/Socket;", "z", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "socket", "Lokhttp3/internal/http2/Http2Writer;", "A", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "writer", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "B", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "Companion", "Builder", "Listener", "ReaderRunnable", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1006:1\n84#2,4:1007\n90#2,13:1014\n90#2,13:1027\n90#2,13:1069\n90#2,13:1082\n90#2,13:1095\n90#2,13:1108\n90#2,13:1121\n90#2,13:1134\n563#3:1011\n557#3:1013\n557#3:1040\n615#3,4:1041\n402#3,5:1045\n402#3,5:1053\n402#3,5:1059\n402#3,5:1064\n1#4:1012\n37#5,2:1050\n13309#6:1052\n13310#6:1058\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n152#1:1007,4\n340#1:1014,13\n361#1:1027,13\n506#1:1069,13\n554#1:1082,13\n893#1:1095,13\n911#1:1108,13\n938#1:1121,13\n952#1:1134,13\n183#1:1011\n319#1:1013\n402#1:1040\n446#1:1041,4\n448#1:1045,5\n461#1:1053,5\n467#1:1059,5\n472#1:1064,5\n455#1:1050,2\n460#1:1052\n460#1:1058\n*E\n"})
public final class Http2Connection implements Closeable {
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J5\u0010\t\u001A\u00020\u00002\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000EH\u0007\u00A2\u0006\u0004\b\t\u0010\u0010J\u0015\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001B\u001A\u00020\u001A\u00A2\u0006\u0004\b\u001B\u0010\u001CR\"\u0010\u0003\u001A\u00020\u00028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\"\u0010\t\u001A\u00020\b8\u0000@\u0000X\u0080.\u00A2\u0006\u0012\n\u0004\b\t\u0010\'\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001A\u00020\n8\u0000@\u0000X\u0080.\u00A2\u0006\u0012\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\r\u001A\u00020\f8\u0000@\u0000X\u0080.\u00A2\u0006\u0012\n\u0004\b\r\u00102\u001A\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u000F\u001A\u00020\u000E8\u0000@\u0000X\u0080.\u00A2\u0006\u0012\n\u0004\b\u000F\u00107\u001A\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u0012\u001A\u00020\u00118\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010\u0015\u001A\u00020\u00148\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bB\u0010C\u001A\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\u0018\u001A\u00020\u00178\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010K\"\u0004\bL\u0010M\u00A8\u0006N"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "", "client", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "Ljava/net/Socket;", "socket", "", "peerName", "Lokio/BufferedSource;", "source", "Lokio/BufferedSink;", "sink", "(Ljava/net/Socket;Ljava/lang/String;Lokio/BufferedSource;Lokio/BufferedSink;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "(Lokhttp3/internal/http2/Http2Connection$Listener;)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "(Lokhttp3/internal/http2/PushObserver;)Lokhttp3/internal/http2/Http2Connection$Builder;", "", "pingIntervalMillis", "(I)Lokhttp3/internal/http2/Http2Connection$Builder;", "Lokhttp3/internal/http2/Http2Connection;", "build", "()Lokhttp3/internal/http2/Http2Connection;", "a", "Z", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "b", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "Lokio/BufferedSource;", "getSource$okhttp", "()Lokio/BufferedSource;", "setSource$okhttp", "(Lokio/BufferedSource;)V", "Lokio/BufferedSink;", "getSink$okhttp", "()Lokio/BufferedSink;", "setSink$okhttp", "(Lokio/BufferedSink;)V", "c", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "d", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "e", "I", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Builder {
        public boolean a;
        public final TaskRunner b;
        public Listener c;
        public String connectionName;
        public PushObserver d;
        public int e;
        public BufferedSink sink;
        public Socket socket;
        public BufferedSource source;

        public Builder(boolean z, @NotNull TaskRunner taskRunner0) {
            Intrinsics.checkNotNullParameter(taskRunner0, "taskRunner");
            super();
            this.a = z;
            this.b = taskRunner0;
            this.c = Listener.REFUSE_INCOMING_STREAMS;
            this.d = PushObserver.CANCEL;
        }

        @NotNull
        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.a;
        }

        @NotNull
        public final String getConnectionName$okhttp() {
            String s = this.connectionName;
            if(s != null) {
                return s;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        @NotNull
        public final Listener getListener$okhttp() {
            return this.c;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.e;
        }

        @NotNull
        public final PushObserver getPushObserver$okhttp() {
            return this.d;
        }

        @NotNull
        public final BufferedSink getSink$okhttp() {
            BufferedSink bufferedSink0 = this.sink;
            if(bufferedSink0 != null) {
                return bufferedSink0;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        @NotNull
        public final Socket getSocket$okhttp() {
            Socket socket0 = this.socket;
            if(socket0 != null) {
                return socket0;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        @NotNull
        public final BufferedSource getSource$okhttp() {
            BufferedSource bufferedSource0 = this.source;
            if(bufferedSource0 != null) {
                return bufferedSource0;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        @NotNull
        public final TaskRunner getTaskRunner$okhttp() {
            return this.b;
        }

        @NotNull
        public final Builder listener(@NotNull Listener http2Connection$Listener0) {
            Intrinsics.checkNotNullParameter(http2Connection$Listener0, "listener");
            this.c = http2Connection$Listener0;
            return this;
        }

        @NotNull
        public final Builder pingIntervalMillis(int v) {
            this.e = v;
            return this;
        }

        @NotNull
        public final Builder pushObserver(@NotNull PushObserver pushObserver0) {
            Intrinsics.checkNotNullParameter(pushObserver0, "pushObserver");
            this.d = pushObserver0;
            return this;
        }

        public final void setClient$okhttp(boolean z) {
            this.a = z;
        }

        public final void setConnectionName$okhttp(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "<set-?>");
            this.connectionName = s;
        }

        public final void setListener$okhttp(@NotNull Listener http2Connection$Listener0) {
            Intrinsics.checkNotNullParameter(http2Connection$Listener0, "<set-?>");
            this.c = http2Connection$Listener0;
        }

        public final void setPingIntervalMillis$okhttp(int v) {
            this.e = v;
        }

        public final void setPushObserver$okhttp(@NotNull PushObserver pushObserver0) {
            Intrinsics.checkNotNullParameter(pushObserver0, "<set-?>");
            this.d = pushObserver0;
        }

        public final void setSink$okhttp(@NotNull BufferedSink bufferedSink0) {
            Intrinsics.checkNotNullParameter(bufferedSink0, "<set-?>");
            this.sink = bufferedSink0;
        }

        public final void setSocket$okhttp(@NotNull Socket socket0) {
            Intrinsics.checkNotNullParameter(socket0, "<set-?>");
            this.socket = socket0;
        }

        public final void setSource$okhttp(@NotNull BufferedSource bufferedSource0) {
            Intrinsics.checkNotNullParameter(bufferedSource0, "<set-?>");
            this.source = bufferedSource0;
        }

        @JvmOverloads
        @NotNull
        public final Builder socket(@NotNull Socket socket0) throws IOException {
            Intrinsics.checkNotNullParameter(socket0, "socket");
            return Builder.socket$default(this, socket0, null, null, null, 14, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder socket(@NotNull Socket socket0, @NotNull String s) throws IOException {
            Intrinsics.checkNotNullParameter(socket0, "socket");
            Intrinsics.checkNotNullParameter(s, "peerName");
            return Builder.socket$default(this, socket0, s, null, null, 12, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder socket(@NotNull Socket socket0, @NotNull String s, @NotNull BufferedSource bufferedSource0) throws IOException {
            Intrinsics.checkNotNullParameter(socket0, "socket");
            Intrinsics.checkNotNullParameter(s, "peerName");
            Intrinsics.checkNotNullParameter(bufferedSource0, "source");
            return Builder.socket$default(this, socket0, s, bufferedSource0, null, 8, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder socket(@NotNull Socket socket0, @NotNull String s, @NotNull BufferedSource bufferedSource0, @NotNull BufferedSink bufferedSink0) throws IOException {
            Intrinsics.checkNotNullParameter(socket0, "socket");
            Intrinsics.checkNotNullParameter(s, "peerName");
            Intrinsics.checkNotNullParameter(bufferedSource0, "source");
            Intrinsics.checkNotNullParameter(bufferedSink0, "sink");
            this.setSocket$okhttp(socket0);
            this.setConnectionName$okhttp((this.a ? "OkHttp" + ' ' + s : "MockWebServer " + s));
            this.setSource$okhttp(bufferedSource0);
            this.setSink$okhttp(bufferedSink0);
            return this;
        }

        public static Builder socket$default(Builder http2Connection$Builder0, Socket socket0, String s, BufferedSource bufferedSource0, BufferedSink bufferedSink0, int v, Object object0) throws IOException {
            if((v & 2) != 0) {
                s = Util.peerName(socket0);
            }
            if((v & 4) != 0) {
                bufferedSource0 = Okio.buffer(Okio.source(socket0));
            }
            if((v & 8) != 0) {
                bufferedSink0 = Okio.buffer(Okio.sink(socket0));
            }
            return http2Connection$Builder0.socket(socket0, s, bufferedSource0, bufferedSink0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001A\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001A\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000B\u001A\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\tR\u0014\u0010\f\u001A\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001A\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000E"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "Lokhttp3/internal/http2/Settings;", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.D;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0016J\u0010\u0010\t\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u000BH&¨\u0006\r"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "()V", "onSettings", "", "connection", "Lokhttp3/internal/http2/Http2Connection;", "settings", "Lokhttp3/internal/http2/Settings;", "onStream", "stream", "Lokhttp3/internal/http2/Http2Stream;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static abstract class Listener {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "", "Lokhttp3/internal/http2/Http2Connection$Listener;", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class okhttp3.internal.http2.Http2Connection.Listener.Companion {
            public okhttp3.internal.http2.Http2Connection.Listener.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }
        }

        @NotNull
        public static final okhttp3.internal.http2.Http2Connection.Listener.Companion Companion;
        @JvmField
        @NotNull
        public static final Listener REFUSE_INCOMING_STREAMS;

        static {
            Listener.Companion = new okhttp3.internal.http2.Http2Connection.Listener.Companion(null);
            Listener.REFUSE_INCOMING_STREAMS = new Http2Connection.Listener.Companion.REFUSE_INCOMING_STREAMS.1();  // 初始化器: Lokhttp3/internal/http2/Http2Connection$Listener;-><init>()V
        }

        public void onSettings(@NotNull Http2Connection http2Connection0, @NotNull Settings settings0) {
            Intrinsics.checkNotNullParameter(http2Connection0, "connection");
            Intrinsics.checkNotNullParameter(settings0, "settings");
        }

        public abstract void onStream(@NotNull Http2Stream arg1) throws IOException;
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0003H\u0096\u0002\u00A2\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00020\f2\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u001F\u0010\u001B\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u001A\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001F\u0010\u001F\u001A\u00020\u00032\u0006\u0010\u001D\u001A\u00020\n2\u0006\u0010\u001F\u001A\u00020\u001EH\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u001D\u0010!\u001A\u00020\u00032\u0006\u0010\u001D\u001A\u00020\n2\u0006\u0010\u001F\u001A\u00020\u001E\u00A2\u0006\u0004\b!\u0010 J\u000F\u0010\"\u001A\u00020\u0003H\u0016\u00A2\u0006\u0004\b\"\u0010\tJ\'\u0010&\u001A\u00020\u00032\u0006\u0010#\u001A\u00020\n2\u0006\u0010$\u001A\u00020\f2\u0006\u0010%\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b&\u0010\'J\'\u0010+\u001A\u00020\u00032\u0006\u0010(\u001A\u00020\f2\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010*\u001A\u00020)H\u0016\u00A2\u0006\u0004\b+\u0010,J\u001F\u0010/\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\f2\u0006\u0010.\u001A\u00020-H\u0016\u00A2\u0006\u0004\b/\u00100J/\u00104\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\f2\u0006\u00101\u001A\u00020\f2\u0006\u00102\u001A\u00020\f2\u0006\u00103\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b4\u00105J-\u00108\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\f2\u0006\u00106\u001A\u00020\f2\f\u00107\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016\u00A2\u0006\u0004\b8\u00109J?\u0010@\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\f2\u0006\u0010;\u001A\u00020:2\u0006\u0010<\u001A\u00020)2\u0006\u0010=\u001A\u00020:2\u0006\u0010>\u001A\u00020\f2\u0006\u0010?\u001A\u00020-H\u0016\u00A2\u0006\u0004\b@\u0010AR\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010E\u00A8\u0006F"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "", "Lokhttp3/internal/http2/Http2Reader;", "reader", "<init>", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "invoke", "()V", "", "inFinished", "", "streamId", "Lokio/BufferedSource;", "source", "length", "data", "(ZILokio/BufferedSource;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "(ZLokhttp3/internal/http2/Settings;)V", "applyAndAckSettings", "ackSettings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "Lokio/ByteString;", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;Lokio/ByteString;)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "streamDependency", "weight", "exclusive", "priority", "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "", "origin", "protocol", "host", "port", "maxAge", "alternateService", "(ILjava/lang/String;Lokio/ByteString;Ljava/lang/String;IJ)V", "a", "Lokhttp3/internal/http2/Http2Reader;", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nHttp2Connection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 2 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1006:1\n90#2,13:1007\n90#2,13:1020\n90#2,13:1035\n90#2,13:1049\n37#3,2:1033\n37#3,2:1062\n563#4:1048\n563#4:1064\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n687#1:1007,13\n715#1:1020,13\n758#1:1035,13\n806#1:1049,13\n753#1:1033,2\n824#1:1062,2\n797#1:1048\n841#1:1064\n*E\n"})
    public final class ReaderRunnable implements Function0, Handler {
        public final Http2Reader a;
        public final Http2Connection b;

        public ReaderRunnable(@NotNull Http2Reader http2Reader0) {
            Intrinsics.checkNotNullParameter(http2Reader0, "reader");
            this.b = http2Connection0;
            super();
            this.a = http2Reader0;
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void ackSettings() {
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void alternateService(int v, @NotNull String s, @NotNull ByteString byteString0, @NotNull String s1, int v1, long v2) {
            Intrinsics.checkNotNullParameter(s, "origin");
            Intrinsics.checkNotNullParameter(byteString0, "protocol");
            Intrinsics.checkNotNullParameter(s1, "host");
        }

        public final void applyAndAckSettings(boolean z, @NotNull Settings settings0) {
            Http2Stream[] arr_http2Stream;
            long v2;
            Intrinsics.checkNotNullParameter(settings0, "settings");
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            Http2Writer http2Writer0 = this.b.getWriter();
            Http2Connection http2Connection0 = this.b;
            synchronized(http2Writer0) {
                synchronized(http2Connection0) {
                    Settings settings1 = http2Connection0.getPeerSettings();
                    if(!z) {
                        Settings settings2 = new Settings();
                        settings2.merge(settings1);
                        settings2.merge(settings0);
                        settings0 = settings2;
                    }
                    ref$ObjectRef0.element = settings0;
                    v2 = ((long)settings0.getInitialWindowSize()) - ((long)settings1.getInitialWindowSize());
                    arr_http2Stream = Long.compare(v2, 0L) == 0 || http2Connection0.getStreams$okhttp().isEmpty() ? null : ((Http2Stream[])http2Connection0.getStreams$okhttp().values().toArray(new Http2Stream[0]));
                    http2Connection0.setPeerSettings(((Settings)ref$ObjectRef0.element));
                    http2Connection0.k.schedule(new Task(true, http2Connection0) {
                        @Override  // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            ref$ObjectRef0.getListener$okhttp().onSettings(ref$ObjectRef0, ((Settings)this.f.element));
                            return -1L;
                        }
                    }, 0L);
                }
                try {
                    http2Connection0.getWriter().applyAndAckSettings(((Settings)ref$ObjectRef0.element));
                }
                catch(IOException iOException0) {
                    Http2Connection.access$failConnection(http2Connection0, iOException0);
                }
            }
            if(arr_http2Stream != null) {
                for(int v3 = 0; v3 < arr_http2Stream.length; ++v3) {
                    Http2Stream http2Stream0 = arr_http2Stream[v3];
                    synchronized(http2Stream0) {
                        http2Stream0.addBytesToWriteWindow(v2);
                    }
                }
            }
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void data(boolean z, int v, @NotNull BufferedSource bufferedSource0, int v1) throws IOException {
            Intrinsics.checkNotNullParameter(bufferedSource0, "source");
            Http2Connection http2Connection0 = this.b;
            if(http2Connection0.pushedStream$okhttp(v)) {
                http2Connection0.pushDataLater$okhttp(v, bufferedSource0, v1, z);
                return;
            }
            Http2Stream http2Stream0 = http2Connection0.getStream(v);
            if(http2Stream0 == null) {
                http2Connection0.writeSynResetLater$okhttp(v, ErrorCode.PROTOCOL_ERROR);
                http2Connection0.updateConnectionFlowControl$okhttp(((long)v1));
                bufferedSource0.skip(((long)v1));
                return;
            }
            http2Stream0.receiveData(bufferedSource0, v1);
            if(z) {
                http2Stream0.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        @NotNull
        public final Http2Reader getReader$okhttp() {
            return this.a;
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void goAway(int v, @NotNull ErrorCode errorCode0, @NotNull ByteString byteString0) {
            Object[] arr_object;
            Intrinsics.checkNotNullParameter(errorCode0, "errorCode");
            Intrinsics.checkNotNullParameter(byteString0, "debugData");
            byteString0.size();
            synchronized(this.b) {
                arr_object = this.b.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                this.b.g = true;
            }
            for(int v2 = 0; v2 < ((Http2Stream[])arr_object).length; ++v2) {
                Http2Stream http2Stream0 = ((Http2Stream[])arr_object)[v2];
                if(http2Stream0.getId() > v && http2Stream0.isLocallyInitiated()) {
                    http2Stream0.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.b.removeStream$okhttp(http2Stream0.getId());
                }
            }
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void headers(boolean z, int v, int v1, @NotNull List list0) {
            Http2Stream http2Stream0;
            Intrinsics.checkNotNullParameter(list0, "headerBlock");
            if(this.b.pushedStream$okhttp(v)) {
                this.b.pushHeadersLater$okhttp(v, list0, z);
                return;
            }
            Http2Connection http2Connection0 = this.b;
            synchronized(http2Connection0) {
                http2Stream0 = http2Connection0.getStream(v);
                if(http2Stream0 == null) {
                    if(http2Connection0.g) {
                        return;
                    }
                    if(v <= http2Connection0.getLastGoodStreamId$okhttp()) {
                        return;
                    }
                    if(v % 2 == http2Connection0.getNextStreamId$okhttp() % 2) {
                        return;
                    }
                    Http2Stream http2Stream1 = new Http2Stream(v, http2Connection0, false, z, Util.toHeaders(list0));
                    http2Connection0.setLastGoodStreamId$okhttp(v);
                    http2Connection0.getStreams$okhttp().put(v, http2Stream1);
                    http2Connection0.h.newQueue().schedule(new Task(true, http2Connection0) {
                        @Override  // okhttp3.internal.concurrent.Task
                        public long runOnce() {
                            Http2Connection http2Connection0;
                            Http2Stream http2Stream0;
                            try {
                                http2Stream0 = this.f;
                                http2Connection0 = http2Stream1;
                                http2Connection0.getListener$okhttp().onStream(http2Stream0);
                            }
                            catch(IOException iOException0) {
                                Platform.Companion.get().log("Http2Connection.Listener failure for " + http2Connection0.getConnectionName$okhttp(), 4, iOException0);
                                try {
                                    http2Stream0.close(ErrorCode.PROTOCOL_ERROR, iOException0);
                                }
                                catch(IOException unused_ex) {
                                }
                            }
                            return -1L;
                        }
                    }, 0L);
                    return;
                }
            }
            http2Stream0.receiveHeaders(Util.toHeaders(list0), z);
        }

        @Override  // kotlin.jvm.functions.Function0
        public Object invoke() {
            this.invoke();
            return Unit.INSTANCE;
        }

        public void invoke() {
            ErrorCode errorCode0;
            Http2Reader http2Reader0;
            Http2Connection http2Connection0;
            try {
                http2Connection0 = this.b;
                http2Reader0 = this.a;
                errorCode0 = ErrorCode.INTERNAL_ERROR;
                http2Reader0.readConnectionPreface(this);
                while(http2Reader0.nextFrame(false, this)) {
                }
            }
            catch(IOException iOException0) {
                http2Connection0.close$okhttp(ErrorCode.PROTOCOL_ERROR, ErrorCode.PROTOCOL_ERROR, iOException0);
                Util.closeQuietly(http2Reader0);
                return;
            }
            catch(Throwable throwable0) {
                http2Connection0.close$okhttp(errorCode0, errorCode0, null);
                Util.closeQuietly(http2Reader0);
                throw throwable0;
            }
            http2Connection0.close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
            Util.closeQuietly(http2Reader0);
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void ping(boolean z, int v, int v1) {
            if(z) {
                Http2Connection http2Connection0 = this.b;
                synchronized(http2Connection0) {
                    switch(v) {
                        case 1: {
                            ++http2Connection0.n;
                            break;
                        }
                        case 2: {
                            ++http2Connection0.p;
                            break;
                        }
                        case 3: {
                            ++http2Connection0.r;
                            Intrinsics.checkNotNull(http2Connection0, "null cannot be cast to non-null type java.lang.Object");
                            http2Connection0.notifyAll();
                        }
                    }
                }
                return;
            }
            this.b.i.schedule(new Task(true, this.b) {
                @Override  // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    v.writePing(true, v1, this.g);
                    return -1L;
                }
            }, 0L);
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void priority(int v, int v1, int v2, boolean z) {
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void pushPromise(int v, int v1, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "requestHeaders");
            this.b.pushRequestLater$okhttp(v1, list0);
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void rstStream(int v, @NotNull ErrorCode errorCode0) {
            Intrinsics.checkNotNullParameter(errorCode0, "errorCode");
            Http2Connection http2Connection0 = this.b;
            if(http2Connection0.pushedStream$okhttp(v)) {
                http2Connection0.pushResetLater$okhttp(v, errorCode0);
                return;
            }
            Http2Stream http2Stream0 = http2Connection0.removeStream$okhttp(v);
            if(http2Stream0 != null) {
                http2Stream0.receiveRstStream(errorCode0);
            }
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void settings(boolean z, @NotNull Settings settings0) {
            Intrinsics.checkNotNullParameter(settings0, "settings");
            okhttp3.internal.http2.Http2Connection.ReaderRunnable.settings..inlined.execute.default.1 http2Connection$ReaderRunnable$settings$$inlined$execute$default$10 = new Task(true, this) {
                @Override  // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    z.applyAndAckSettings(settings0, this.g);
                    return -1L;
                }
            };
            this.b.i.schedule(http2Connection$ReaderRunnable$settings$$inlined$execute$default$10, 0L);
        }

        @Override  // okhttp3.internal.http2.Http2Reader$Handler
        public void windowUpdate(int v, long v1) {
            if(v == 0) {
                synchronized(this.b) {
                    this.b.y = this.b.getWriteBytesMaximum() + v1;
                    Intrinsics.checkNotNull(this.b, "null cannot be cast to non-null type java.lang.Object");
                    this.b.notifyAll();
                }
                return;
            }
            Http2Stream http2Stream0 = this.b.getStream(v);
            if(http2Stream0 != null) {
                synchronized(http2Stream0) {
                    http2Stream0.addBytesToWriteWindow(v1);
                }
            }
        }
    }

    public final Http2Writer A;
    public static final int AWAIT_PING = 3;
    public final ReaderRunnable B;
    public final LinkedHashSet C;
    @NotNull
    public static final Companion Companion = null;
    public static final Settings D = null;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 0x1000000;
    public final boolean a;
    public final Listener b;
    public final LinkedHashMap c;
    public final String d;
    public int e;
    public int f;
    public boolean g;
    public final TaskRunner h;
    public final TaskQueue i;
    public final TaskQueue j;
    public final TaskQueue k;
    public final PushObserver l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public final Settings t;
    public Settings u;
    public long v;
    public long w;
    public long x;
    public long y;
    public final Socket z;

    static {
        Http2Connection.Companion = new Companion(null);
        Settings settings0 = new Settings();
        settings0.set(7, 0xFFFF);
        settings0.set(5, 0x4000);
        Http2Connection.D = settings0;
    }

    public Http2Connection(@NotNull Builder http2Connection$Builder0) {
        Intrinsics.checkNotNullParameter(http2Connection$Builder0, "builder");
        super();
        boolean z = http2Connection$Builder0.getClient$okhttp();
        this.a = z;
        this.b = http2Connection$Builder0.getListener$okhttp();
        this.c = new LinkedHashMap();
        String s = http2Connection$Builder0.getConnectionName$okhttp();
        this.d = s;
        this.f = http2Connection$Builder0.getClient$okhttp() ? 3 : 2;
        TaskRunner taskRunner0 = http2Connection$Builder0.getTaskRunner$okhttp();
        this.h = taskRunner0;
        TaskQueue taskQueue0 = taskRunner0.newQueue();
        this.i = taskQueue0;
        this.j = taskRunner0.newQueue();
        this.k = taskRunner0.newQueue();
        this.l = http2Connection$Builder0.getPushObserver$okhttp();
        Settings settings0 = new Settings();
        if(http2Connection$Builder0.getClient$okhttp()) {
            settings0.set(7, 0x1000000);
        }
        this.t = settings0;
        this.u = Http2Connection.D;
        this.y = (long)Http2Connection.D.getInitialWindowSize();
        this.z = http2Connection$Builder0.getSocket$okhttp();
        this.A = new Http2Writer(http2Connection$Builder0.getSink$okhttp(), z);
        this.B = new ReaderRunnable(this, new Http2Reader(http2Connection$Builder0.getSource$okhttp(), z));
        this.C = new LinkedHashSet();
        if(http2Connection$Builder0.getPingIntervalMillis$okhttp() != 0) {
            long v = TimeUnit.MILLISECONDS.toNanos(((long)http2Connection$Builder0.getPingIntervalMillis$okhttp()));
            taskQueue0.schedule(new Task(this, v) {
                public final Http2Connection e;
                public final long f;

                {
                    this.e = http2Connection0;
                    this.f = v;
                    super(s, false, 2, null);
                }

                @Override  // okhttp3.internal.concurrent.Task
                public long runOnce() {
                    boolean z;
                    synchronized(this.e) {
                        if(Long.compare(Http2Connection.access$getIntervalPongsReceived$p(this.e), Http2Connection.access$getIntervalPingsSent$p(this.e)) < 0) {
                            z = true;
                        }
                        else {
                            Http2Connection.access$setIntervalPingsSent$p(this.e, Http2Connection.access$getIntervalPingsSent$p(this.e) + 1L);
                            z = false;
                        }
                    }
                    if(z) {
                        Http2Connection.access$failConnection(this.e, null);
                        return -1L;
                    }
                    this.e.writePing(false, 1, 0);
                    return this.f;
                }
            }, v);
        }
    }

    public final Http2Stream a(int v, List list0, boolean z) {
        Http2Writer http2Writer0 = this.A;
        __monitor_enter(http2Writer0);
        int v1 = FIN.finallyOpen$NT();
        synchronized(this) {
            if(this.f > 0x3FFFFFFF) {
                this.shutdown(ErrorCode.REFUSED_STREAM);
            }
            if(!this.g) {
                int v3 = this.f;
                this.f = v3 + 2;
                Http2Stream http2Stream0 = new Http2Stream(v3, this, !z, false, null);
                boolean z1 = !z || this.x >= this.y || http2Stream0.getWriteBytesTotal() >= http2Stream0.getWriteBytesMaximum();
                if(http2Stream0.isOpen()) {
                    this.c.put(v3, http2Stream0);
                }
                boolean z2 = false;
                if(v == 0) {
                    z2 = true;
                    this.A.headers(!z, v3, list0);
                }
                else if(!this.a) {
                    z2 = true;
                    this.A.pushPromise(v, v3, list0);
                }
                if(z2) {
                    FIN.finallyCodeBegin$NT(v1);
                    __monitor_exit(http2Writer0);
                    FIN.finallyCodeEnd$NT(v1);
                    if(z1) {
                        this.A.flush();
                    }
                    return http2Stream0;
                }
                FIN.finallyExec$NT(v1);
                throw new IllegalArgumentException("client streams shouldn\'t have associated stream IDs");
            }
        }
        throw new ConnectionShutdownException();
    }

    public static final void access$failConnection(Http2Connection http2Connection0, IOException iOException0) {
        http2Connection0.getClass();
        http2Connection0.close$okhttp(ErrorCode.PROTOCOL_ERROR, ErrorCode.PROTOCOL_ERROR, iOException0);
    }

    public static final long access$getIntervalPingsSent$p(Http2Connection http2Connection0) {
        return http2Connection0.m;
    }

    public static final void access$setIntervalPingsSent$p(Http2Connection http2Connection0, long v) {
        http2Connection0.m = v;
    }

    public final void awaitPong() throws InterruptedException {
        synchronized(this) {
            while(this.r < this.q) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                this.wait();
            }
        }
    }

    @Override
    public void close() {
        this.close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(@NotNull ErrorCode errorCode0, @NotNull ErrorCode errorCode1, @Nullable IOException iOException0) {
        Object[] arr_object;
        Intrinsics.checkNotNullParameter(errorCode0, "connectionCode");
        Intrinsics.checkNotNullParameter(errorCode1, "streamCode");
        if(Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-2257 MUST NOT hold lock on " + this);
        }
        try {
            this.shutdown(errorCode0);
        }
        catch(IOException unused_ex) {
        }
        synchronized(this) {
            if(this.c.isEmpty()) {
                arr_object = null;
            }
            else {
                arr_object = this.c.values().toArray(new Http2Stream[0]);
                this.c.clear();
            }
        }
        if(((Http2Stream[])arr_object) != null) {
            for(int v = 0; v < ((Http2Stream[])arr_object).length; ++v) {
                Http2Stream http2Stream0 = ((Http2Stream[])arr_object)[v];
                try {
                    http2Stream0.close(errorCode1, iOException0);
                }
                catch(IOException unused_ex) {
                }
            }
        }
        try {
            this.A.close();
        }
        catch(IOException unused_ex) {
        }
        try {
            this.z.close();
        }
        catch(IOException unused_ex) {
        }
        this.i.shutdown();
        this.j.shutdown();
        this.k.shutdown();
    }

    public final void flush() throws IOException {
        this.A.flush();
    }

    public final boolean getClient$okhttp() {
        return this.a;
    }

    @NotNull
    public final String getConnectionName$okhttp() {
        return this.d;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.e;
    }

    @NotNull
    public final Listener getListener$okhttp() {
        return this.b;
    }

    public final int getNextStreamId$okhttp() {
        return this.f;
    }

    @NotNull
    public final Settings getOkHttpSettings() {
        return this.t;
    }

    @NotNull
    public final Settings getPeerSettings() {
        return this.u;
    }

    public final long getReadBytesAcknowledged() {
        return this.w;
    }

    public final long getReadBytesTotal() {
        return this.v;
    }

    @NotNull
    public final ReaderRunnable getReaderRunnable() {
        return this.B;
    }

    @NotNull
    public final Socket getSocket$okhttp() {
        return this.z;
    }

    @Nullable
    public final Http2Stream getStream(int v) {
        synchronized(this) {
            return (Http2Stream)this.c.get(v);
        }
    }

    @NotNull
    public final Map getStreams$okhttp() {
        return this.c;
    }

    public final long getWriteBytesMaximum() {
        return this.y;
    }

    public final long getWriteBytesTotal() {
        return this.x;
    }

    @NotNull
    public final Http2Writer getWriter() {
        return this.A;
    }

    public final boolean isHealthy(long v) {
        synchronized(this) {
            if(this.g) {
                return false;
            }
            if(this.p < this.o && v >= this.s) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final Http2Stream newStream(@NotNull List list0, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(list0, "requestHeaders");
        return this.a(0, list0, z);
    }

    public final int openStreamCount() {
        synchronized(this) {
        }
        return this.c.size();
    }

    public final void pushDataLater$okhttp(int v, @NotNull BufferedSource bufferedSource0, int v1, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource0, "source");
        Buffer buffer0 = new Buffer();
        bufferedSource0.require(((long)v1));
        bufferedSource0.read(buffer0, ((long)v1));
        okhttp3.internal.http2.Http2Connection.pushDataLater..inlined.execute.default.1 http2Connection$pushDataLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                try {
                    boolean z = v.l.onData(buffer0, v1, z, this.i);
                    if(z) {
                        v.getWriter().rstStream(buffer0, ErrorCode.CANCEL);
                    }
                    if(z || this.i) {
                        synchronized(v) {
                            v.C.remove(buffer0);
                            return -1L;
                        }
                    }
                }
                catch(IOException unused_ex) {
                }
                return -1L;
            }
        };
        this.j.schedule(http2Connection$pushDataLater$$inlined$execute$default$10, 0L);
    }

    public final void pushHeadersLater$okhttp(int v, @NotNull List list0, boolean z) {
        Intrinsics.checkNotNullParameter(list0, "requestHeaders");
        okhttp3.internal.http2.Http2Connection.pushHeadersLater..inlined.execute.default.1 http2Connection$pushHeadersLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean z = v.l.onHeaders(list0, z, this.h);
                try {
                    if(z) {
                        v.getWriter().rstStream(list0, ErrorCode.CANCEL);
                    }
                    if(z || this.h) {
                        synchronized(v) {
                            v.C.remove(list0);
                            return -1L;
                        }
                    }
                }
                catch(IOException unused_ex) {
                }
                return -1L;
            }
        };
        this.j.schedule(http2Connection$pushHeadersLater$$inlined$execute$default$10, 0L);
    }

    public final void pushRequestLater$okhttp(int v, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "requestHeaders");
        synchronized(this) {
            if(this.C.contains(v)) {
                this.writeSynResetLater$okhttp(v, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.C.add(v);
        }
        okhttp3.internal.http2.Http2Connection.pushRequestLater..inlined.execute.default.1 http2Connection$pushRequestLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                if(v.l.onRequest(list0, this.g)) {
                    try {
                        v.getWriter().rstStream(list0, ErrorCode.CANCEL);
                        synchronized(v) {
                            v.C.remove(list0);
                            return -1L;
                        }
                    }
                    catch(IOException unused_ex) {
                    }
                }
                return -1L;
            }
        };
        this.j.schedule(http2Connection$pushRequestLater$$inlined$execute$default$10, 0L);
    }

    public final void pushResetLater$okhttp(int v, @NotNull ErrorCode errorCode0) {
        Intrinsics.checkNotNullParameter(errorCode0, "errorCode");
        okhttp3.internal.http2.Http2Connection.pushResetLater..inlined.execute.default.1 http2Connection$pushResetLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                v.l.onReset(errorCode0, this.g);
                synchronized(v) {
                    v.C.remove(errorCode0);
                    return -1L;
                }
            }
        };
        this.j.schedule(http2Connection$pushResetLater$$inlined$execute$default$10, 0L);
    }

    @NotNull
    public final Http2Stream pushStream(int v, @NotNull List list0, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(list0, "requestHeaders");
        if(this.a) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return this.a(v, list0, z);
    }

    public final boolean pushedStream$okhttp(int v) {
        return v != 0 && (v & 1) == 0;
    }

    @Nullable
    public final Http2Stream removeStream$okhttp(int v) {
        synchronized(this) {
            Http2Stream http2Stream0 = (Http2Stream)this.c.remove(v);
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            this.notifyAll();
            return http2Stream0;
        }
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized(this) {
            long v = this.o;
            if(this.p < v) {
                return;
            }
            this.o = v + 1L;
            this.s = System.nanoTime() + 1000000000L;
        }
        okhttp3.internal.http2.Http2Connection.sendDegradedPingLater..inlined.execute.default.1 http2Connection$sendDegradedPingLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                this.e.writePing(false, 2, 0);
                return -1L;
            }
        };
        this.i.schedule(http2Connection$sendDegradedPingLater$$inlined$execute$default$10, 0L);
    }

    public final void setLastGoodStreamId$okhttp(int v) {
        this.e = v;
    }

    public final void setNextStreamId$okhttp(int v) {
        this.f = v;
    }

    public final void setPeerSettings(@NotNull Settings settings0) {
        Intrinsics.checkNotNullParameter(settings0, "<set-?>");
        this.u = settings0;
    }

    public final void setSettings(@NotNull Settings settings0) throws IOException {
        Intrinsics.checkNotNullParameter(settings0, "settings");
        synchronized(this.A) {
            synchronized(this) {
                if(this.g) {
                    throw new ConnectionShutdownException();
                }
                this.t.merge(settings0);
            }
            this.A.settings(settings0);
        }
    }

    public final void shutdown(@NotNull ErrorCode errorCode0) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode0, "statusCode");
        synchronized(this.A) {
            IntRef ref$IntRef0 = new IntRef();
            synchronized(this) {
                if(this.g) {
                    return;
                }
                this.g = true;
                ref$IntRef0.element = this.e;
            }
            this.A.goAway(this.e, errorCode0, Util.EMPTY_BYTE_ARRAY);
        }
    }

    @JvmOverloads
    public final void start() throws IOException {
        Http2Connection.start$default(this, false, null, 3, null);
    }

    @JvmOverloads
    public final void start(boolean z) throws IOException {
        Http2Connection.start$default(this, z, null, 2, null);
    }

    @JvmOverloads
    public final void start(boolean z, @NotNull TaskRunner taskRunner0) throws IOException {
        Intrinsics.checkNotNullParameter(taskRunner0, "taskRunner");
        if(z) {
            Http2Writer http2Writer0 = this.A;
            http2Writer0.connectionPreface();
            http2Writer0.settings(this.t);
            int v = this.t.getInitialWindowSize();
            if(v != 0xFFFF) {
                http2Writer0.windowUpdate(0, ((long)(v - 0xFFFF)));
            }
        }
        taskRunner0.newQueue().schedule(new okhttp3.internal.concurrent.TaskQueue.execute.1(this.d, true, this.B), 0L);
    }

    public static void start$default(Http2Connection http2Connection0, boolean z, TaskRunner taskRunner0, int v, Object object0) throws IOException {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            taskRunner0 = TaskRunner.INSTANCE;
        }
        http2Connection0.start(z, taskRunner0);
    }

    public final void updateConnectionFlowControl$okhttp(long v) {
        synchronized(this) {
            long v2 = this.v + v;
            this.v = v2;
            long v3 = v2 - this.w;
            if(v3 >= ((long)(this.t.getInitialWindowSize() / 2))) {
                this.writeWindowUpdateLater$okhttp(0, v3);
                this.w += v3;
            }
        }
    }

    public final void writeData(int v, boolean z, @Nullable Buffer buffer0, long v1) throws IOException {
        long v4;
        long v3;
        if(Long.compare(v1, 0L) == 0) {
            this.A.data(z, v, buffer0, 0);
            return;
        }
        while(v1 > 0L) {
            synchronized(this) {
                try {
                    while(true) {
                        v3 = this.x;
                        v4 = this.y;
                        if(v3 < v4) {
                            break;
                        }
                        if(!this.c.containsKey(v)) {
                            throw new IOException("stream closed");
                        }
                        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                        this.wait();
                    }
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
            int v5 = Math.min(((int)Math.min(v1, v4 - v3)), this.A.maxDataLength());
            this.x += (long)v5;
            v1 -= (long)v5;
            this.A.data(z && v1 == 0L, v, buffer0, v5);
        }
    }

    public final void writeHeaders$okhttp(int v, boolean z, @NotNull List list0) throws IOException {
        Intrinsics.checkNotNullParameter(list0, "alternating");
        this.A.headers(z, v, list0);
    }

    public final void writePing() throws InterruptedException {
        synchronized(this) {
            ++this.q;
        }
        this.writePing(false, 3, 0x4F4B6F6B);
    }

    public final void writePing(boolean z, int v, int v1) {
        try {
            this.A.ping(z, v, v1);
        }
        catch(IOException iOException0) {
            this.close$okhttp(ErrorCode.PROTOCOL_ERROR, ErrorCode.PROTOCOL_ERROR, iOException0);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        this.writePing();
        this.awaitPong();
    }

    public final void writeSynReset$okhttp(int v, @NotNull ErrorCode errorCode0) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode0, "statusCode");
        this.A.rstStream(v, errorCode0);
    }

    public final void writeSynResetLater$okhttp(int v, @NotNull ErrorCode errorCode0) {
        Intrinsics.checkNotNullParameter(errorCode0, "errorCode");
        okhttp3.internal.http2.Http2Connection.writeSynResetLater..inlined.execute.default.1 http2Connection$writeSynResetLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                Http2Connection http2Connection0;
                try {
                    http2Connection0 = v;
                    http2Connection0.writeSynReset$okhttp(errorCode0, this.g);
                }
                catch(IOException iOException0) {
                    Http2Connection.access$failConnection(http2Connection0, iOException0);
                }
                return -1L;
            }
        };
        this.i.schedule(http2Connection$writeSynResetLater$$inlined$execute$default$10, 0L);
    }

    public final void writeWindowUpdateLater$okhttp(int v, long v1) {
        okhttp3.internal.http2.Http2Connection.writeWindowUpdateLater..inlined.execute.default.1 http2Connection$writeWindowUpdateLater$$inlined$execute$default$10 = new Task(true, this) {
            @Override  // okhttp3.internal.concurrent.Task
            public long runOnce() {
                Http2Connection http2Connection0;
                try {
                    http2Connection0 = v;
                    http2Connection0.getWriter().windowUpdate(v1, this.g);
                }
                catch(IOException iOException0) {
                    Http2Connection.access$failConnection(http2Connection0, iOException0);
                }
                return -1L;
            }
        };
        this.i.schedule(http2Connection$writeWindowUpdateLater$$inlined$execute$default$10, 0L);
    }
}

