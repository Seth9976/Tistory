package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;
import okio.Buffer;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u001B\n\u0002\u0010\u000B\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001cB}\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001A\u00020\f\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0014\u001A\u00020\u0013\u0012\u0006\u0010\u0015\u001A\u00020\u0013\u0012\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u0005\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\t\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010\u0007\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b \u0010!J\u0011\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0007\u00A2\u0006\u0004\b\"\u0010#J\u001B\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00060%2\u0006\u0010$\u001A\u00020\u0006\u00A2\u0006\u0004\b\r\u0010&J%\u0010(\u001A\u0004\u0018\u00010\u00062\u0006\u0010$\u001A\u00020\u00062\n\b\u0002\u0010\'\u001A\u0004\u0018\u00010\u0006H\u0007\u00A2\u0006\u0004\b(\u0010)J\u000F\u0010\r\u001A\u00020\fH\u0007\u00A2\u0006\u0004\b*\u0010+J\r\u0010,\u001A\u00020\f\u00A2\u0006\u0004\b,\u0010+J\u0015\u0010.\u001A\u00020\u000E2\u0006\u0010-\u001A\u00020\u0013\u00A2\u0006\u0004\b.\u0010/J\u0011\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0007\u00A2\u0006\u0004\b0\u00101J\r\u00103\u001A\u000202\u00A2\u0006\u0004\b3\u00104J\u0011\u0010\u0010\u001A\u0004\u0018\u00010\u0000H\u0007\u00A2\u0006\u0004\b5\u00106J\u0011\u0010\u0011\u001A\u0004\u0018\u00010\u0000H\u0007\u00A2\u0006\u0004\b7\u00106J\u0011\u0010\u0012\u001A\u0004\u0018\u00010\u0000H\u0007\u00A2\u0006\u0004\b8\u00106J\u0013\u0010:\u001A\b\u0012\u0004\u0012\u0002090%\u00A2\u0006\u0004\b:\u0010;J\u000F\u0010?\u001A\u00020<H\u0007\u00A2\u0006\u0004\b=\u0010>J\u000F\u0010\u0014\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\b@\u0010AJ\u000F\u0010\u0015\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\bB\u0010AJ\u000F\u0010D\u001A\u00020CH\u0016\u00A2\u0006\u0004\bD\u0010EJ\u000F\u0010F\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\bF\u0010!R\u0017\u0010\u0003\u001A\u00020\u00028\u0007\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\b\u0003\u0010\u001BR\u0017\u0010\u0005\u001A\u00020\u00048\u0007\u00A2\u0006\f\n\u0004\bI\u0010J\u001A\u0004\b\u0005\u0010\u001DR\u0017\u0010\u0007\u001A\u00020\u00068\u0007\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\b\u0007\u0010!R\u0017\u0010\t\u001A\u00020\b8\u0007\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\b\t\u0010\u001FR\u0019\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0007\u00A2\u0006\f\n\u0004\bO\u0010P\u001A\u0004\b\u000B\u0010#R\u0017\u0010\r\u001A\u00020\f8\u0007\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\b\r\u0010+R\u0019\u0010\u000F\u001A\u0004\u0018\u00010\u000E8\u0007\u00A2\u0006\f\n\u0004\bS\u0010T\u001A\u0004\b\u000F\u00101R\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u00008\u0007\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\b\u0010\u00106R\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00008\u0007\u00A2\u0006\f\n\u0004\bW\u0010V\u001A\u0004\b\u0011\u00106R\u0019\u0010\u0012\u001A\u0004\u0018\u00010\u00008\u0007\u00A2\u0006\f\n\u0004\bX\u0010V\u001A\u0004\b\u0012\u00106R\u0017\u0010\u0014\u001A\u00020\u00138\u0007\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b\u0014\u0010AR\u0017\u0010\u0015\u001A\u00020\u00138\u0007\u00A2\u0006\f\n\u0004\b[\u0010Z\u001A\u0004\b\u0015\u0010AR\u001C\u0010\u0017\u001A\u0004\u0018\u00010\u00168\u0001X\u0080\u0004\u00A2\u0006\f\n\u0004\b\\\u0010]\u001A\u0004\b\u0017\u0010^R\u0011\u0010`\u001A\u00020_8F\u00A2\u0006\u0006\u001A\u0004\b`\u0010aR\u0011\u0010b\u001A\u00020_8F\u00A2\u0006\u0006\u001A\u0004\bb\u0010aR\u0011\u0010?\u001A\u00020<8G\u00A2\u0006\u0006\u001A\u0004\b?\u0010>\u00A8\u0006d"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", "protocol", "", "message", "", "code", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Headers;", "headers", "Lokhttp3/ResponseBody;", "body", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Lokhttp3/internal/connection/Exchange;", "exchange", "<init>", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;)V", "-deprecated_request", "()Lokhttp3/Request;", "-deprecated_protocol", "()Lokhttp3/Protocol;", "-deprecated_code", "()I", "-deprecated_message", "()Ljava/lang/String;", "-deprecated_handshake", "()Lokhttp3/Handshake;", "name", "", "(Ljava/lang/String;)Ljava/util/List;", "defaultValue", "header", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "-deprecated_headers", "()Lokhttp3/Headers;", "trailers", "byteCount", "peekBody", "(J)Lokhttp3/ResponseBody;", "-deprecated_body", "()Lokhttp3/ResponseBody;", "Lokhttp3/Response$Builder;", "newBuilder", "()Lokhttp3/Response$Builder;", "-deprecated_networkResponse", "()Lokhttp3/Response;", "-deprecated_cacheResponse", "-deprecated_priorResponse", "Lokhttp3/Challenge;", "challenges", "()Ljava/util/List;", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "-deprecated_sentRequestAtMillis", "()J", "-deprecated_receivedResponseAtMillis", "", "close", "()V", "toString", "a", "Lokhttp3/Request;", "b", "Lokhttp3/Protocol;", "c", "Ljava/lang/String;", "d", "I", "e", "Lokhttp3/Handshake;", "f", "Lokhttp3/Headers;", "g", "Lokhttp3/ResponseBody;", "h", "Lokhttp3/Response;", "i", "j", "k", "J", "l", "m", "Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/internal/connection/Exchange;", "", "isSuccessful", "()Z", "isRedirect", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
public final class Response implements Closeable {
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b&\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016\u00A2\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\b\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000E\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0011\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001A\u00020\u00002\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u00102\u0006\u0010\u0017\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001A\u001A\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u00102\u0006\u0010\u0017\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u0019J\u0017\u0010\u001B\u001A\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u0012J\u0017\u0010\u001D\u001A\u00020\u00002\u0006\u0010\u001D\u001A\u00020\u001CH\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0019\u0010 \u001A\u00020\u00002\b\u0010 \u001A\u0004\u0018\u00010\u001FH\u0016\u00A2\u0006\u0004\b \u0010!J\u0019\u0010\"\u001A\u00020\u00002\b\u0010\"\u001A\u0004\u0018\u00010\u0004H\u0016\u00A2\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001A\u00020\u00002\b\u0010$\u001A\u0004\u0018\u00010\u0004H\u0016\u00A2\u0006\u0004\b$\u0010#J\u0019\u0010%\u001A\u00020\u00002\b\u0010%\u001A\u0004\u0018\u00010\u0004H\u0016\u00A2\u0006\u0004\b%\u0010#J\u0017\u0010\'\u001A\u00020\u00002\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b\'\u0010(J\u0017\u0010)\u001A\u00020\u00002\u0006\u0010)\u001A\u00020&H\u0016\u00A2\u0006\u0004\b)\u0010(J\u0017\u0010/\u001A\u00020,2\u0006\u0010+\u001A\u00020*H\u0000\u00A2\u0006\u0004\b-\u0010.J\u000F\u00100\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b0\u00101R$\u0010\b\u001A\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b2\u00103\u001A\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b8\u00109\u001A\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u000E\u001A\u00020\r8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b>\u0010?\u001A\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u0011\u001A\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bD\u0010E\u001A\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u0014\u001A\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010\u001D\u001A\u00020P8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010 \u001A\u0004\u0018\u00010\u001F8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bW\u0010X\u001A\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010\"\u001A\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b]\u0010^\u001A\u0004\b_\u00101\"\u0004\b`\u0010\u0006R$\u0010$\u001A\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\ba\u0010^\u001A\u0004\bb\u00101\"\u0004\bc\u0010\u0006R$\u0010%\u001A\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bd\u0010^\u001A\u0004\be\u00101\"\u0004\bf\u0010\u0006R\"\u0010\'\u001A\u00020&8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bg\u0010h\u001A\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010)\u001A\u00020&8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bm\u0010h\u001A\u0004\bn\u0010j\"\u0004\bo\u0010lR$\u0010u\u001A\u0004\u0018\u00010*8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bp\u0010q\u001A\u0004\br\u0010s\"\u0004\bt\u0010.\u00A8\u0006v"}, d2 = {"Lokhttp3/Response$Builder;", "", "<init>", "()V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)Lokhttp3/Response$Builder;", "Lokhttp3/Protocol;", "protocol", "(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;", "", "code", "(I)Lokhttp3/Response$Builder;", "", "message", "(Ljava/lang/String;)Lokhttp3/Response$Builder;", "Lokhttp3/Handshake;", "handshake", "(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;", "name", "value", "header", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Response$Builder;", "Lokhttp3/ResponseBody;", "body", "(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;", "networkResponse", "(Lokhttp3/Response;)Lokhttp3/Response$Builder;", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "(J)Lokhttp3/Response$Builder;", "receivedResponseAtMillis", "Lokhttp3/internal/connection/Exchange;", "deferredTrailers", "", "initExchange$okhttp", "(Lokhttp3/internal/connection/Exchange;)V", "initExchange", "build", "()Lokhttp3/Response;", "a", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "b", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "c", "I", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "d", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "e", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "Lokhttp3/Headers$Builder;", "f", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "g", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "h", "Lokhttp3/Response;", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "i", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "j", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "k", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "l", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "m", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "exchange", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\nokhttp3/Response$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
    public static class Builder {
        public Request a;
        public Protocol b;
        public int c;
        public String d;
        public Handshake e;
        public okhttp3.Headers.Builder f;
        public ResponseBody g;
        public Response h;
        public Response i;
        public Response j;
        public long k;
        public long l;
        public Exchange m;

        public Builder() {
            this.c = -1;
            this.f = new okhttp3.Headers.Builder();
        }

        public Builder(@NotNull Response response0) {
            Intrinsics.checkNotNullParameter(response0, "response");
            super();
            this.c = -1;
            this.a = response0.request();
            this.b = response0.protocol();
            this.c = response0.code();
            this.d = response0.message();
            this.e = response0.handshake();
            this.f = response0.headers().newBuilder();
            this.g = response0.body();
            this.h = response0.networkResponse();
            this.i = response0.cacheResponse();
            this.j = response0.priorResponse();
            this.k = response0.sentRequestAtMillis();
            this.l = response0.receivedResponseAtMillis();
            this.m = response0.exchange();
        }

        public static void a(String s, Response response0) {
            if(response0 != null) {
                if(response0.body() != null) {
                    throw new IllegalArgumentException((s + ".body != null").toString());
                }
                if(response0.networkResponse() != null) {
                    throw new IllegalArgumentException((s + ".networkResponse != null").toString());
                }
                if(response0.cacheResponse() != null) {
                    throw new IllegalArgumentException((s + ".cacheResponse != null").toString());
                }
                if(response0.priorResponse() != null) {
                    throw new IllegalArgumentException((s + ".priorResponse != null").toString());
                }
            }
        }

        @NotNull
        public Builder addHeader(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "value");
            this.f.add(s, s1);
            return this;
        }

        @NotNull
        public Builder body(@Nullable ResponseBody responseBody0) {
            this.g = responseBody0;
            return this;
        }

        @NotNull
        public Response build() {
            int v = this.c;
            if(v < 0) {
                throw new IllegalStateException(("code < 0: " + this.c).toString());
            }
            Request request0 = this.a;
            if(request0 == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol0 = this.b;
            if(protocol0 == null) {
                throw new IllegalStateException("protocol == null");
            }
            String s = this.d;
            if(s == null) {
                throw new IllegalStateException("message == null");
            }
            return new Response(request0, protocol0, s, v, this.e, this.f.build(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }

        @NotNull
        public Builder cacheResponse(@Nullable Response response0) {
            Builder.a("cacheResponse", response0);
            this.i = response0;
            return this;
        }

        @NotNull
        public Builder code(int v) {
            this.c = v;
            return this;
        }

        @Nullable
        public final ResponseBody getBody$okhttp() {
            return this.g;
        }

        @Nullable
        public final Response getCacheResponse$okhttp() {
            return this.i;
        }

        public final int getCode$okhttp() {
            return this.c;
        }

        @Nullable
        public final Exchange getExchange$okhttp() {
            return this.m;
        }

        @Nullable
        public final Handshake getHandshake$okhttp() {
            return this.e;
        }

        @NotNull
        public final okhttp3.Headers.Builder getHeaders$okhttp() {
            return this.f;
        }

        @Nullable
        public final String getMessage$okhttp() {
            return this.d;
        }

        @Nullable
        public final Response getNetworkResponse$okhttp() {
            return this.h;
        }

        @Nullable
        public final Response getPriorResponse$okhttp() {
            return this.j;
        }

        @Nullable
        public final Protocol getProtocol$okhttp() {
            return this.b;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.l;
        }

        @Nullable
        public final Request getRequest$okhttp() {
            return this.a;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.k;
        }

        @NotNull
        public Builder handshake(@Nullable Handshake handshake0) {
            this.e = handshake0;
            return this;
        }

        @NotNull
        public Builder header(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "value");
            this.f.set(s, s1);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull Headers headers0) {
            Intrinsics.checkNotNullParameter(headers0, "headers");
            this.f = headers0.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(@NotNull Exchange exchange0) {
            Intrinsics.checkNotNullParameter(exchange0, "deferredTrailers");
            this.m = exchange0;
        }

        @NotNull
        public Builder message(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "message");
            this.d = s;
            return this;
        }

        @NotNull
        public Builder networkResponse(@Nullable Response response0) {
            Builder.a("networkResponse", response0);
            this.h = response0;
            return this;
        }

        @NotNull
        public Builder priorResponse(@Nullable Response response0) {
            if(response0 != null && response0.body() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            this.j = response0;
            return this;
        }

        @NotNull
        public Builder protocol(@NotNull Protocol protocol0) {
            Intrinsics.checkNotNullParameter(protocol0, "protocol");
            this.b = protocol0;
            return this;
        }

        @NotNull
        public Builder receivedResponseAtMillis(long v) {
            this.l = v;
            return this;
        }

        @NotNull
        public Builder removeHeader(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            this.f.removeAll(s);
            return this;
        }

        @NotNull
        public Builder request(@NotNull Request request0) {
            Intrinsics.checkNotNullParameter(request0, "request");
            this.a = request0;
            return this;
        }

        @NotNull
        public Builder sentRequestAtMillis(long v) {
            this.k = v;
            return this;
        }

        public final void setBody$okhttp(@Nullable ResponseBody responseBody0) {
            this.g = responseBody0;
        }

        public final void setCacheResponse$okhttp(@Nullable Response response0) {
            this.i = response0;
        }

        public final void setCode$okhttp(int v) {
            this.c = v;
        }

        public final void setExchange$okhttp(@Nullable Exchange exchange0) {
            this.m = exchange0;
        }

        public final void setHandshake$okhttp(@Nullable Handshake handshake0) {
            this.e = handshake0;
        }

        public final void setHeaders$okhttp(@NotNull okhttp3.Headers.Builder headers$Builder0) {
            Intrinsics.checkNotNullParameter(headers$Builder0, "<set-?>");
            this.f = headers$Builder0;
        }

        public final void setMessage$okhttp(@Nullable String s) {
            this.d = s;
        }

        public final void setNetworkResponse$okhttp(@Nullable Response response0) {
            this.h = response0;
        }

        public final void setPriorResponse$okhttp(@Nullable Response response0) {
            this.j = response0;
        }

        public final void setProtocol$okhttp(@Nullable Protocol protocol0) {
            this.b = protocol0;
        }

        public final void setReceivedResponseAtMillis$okhttp(long v) {
            this.l = v;
        }

        public final void setRequest$okhttp(@Nullable Request request0) {
            this.a = request0;
        }

        public final void setSentRequestAtMillis$okhttp(long v) {
            this.k = v;
        }
    }

    public final Request a;
    public final Protocol b;
    public final String c;
    public final int d;
    public final Handshake e;
    public final Headers f;
    public final ResponseBody g;
    public final Response h;
    public final Response i;
    public final Response j;
    public final long k;
    public final long l;
    public final Exchange m;
    public CacheControl n;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
    @JvmName(name = "-deprecated_body")
    @Nullable
    public final ResponseBody -deprecated_body() {
        return this.g;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}))
    @JvmName(name = "-deprecated_cacheControl")
    @NotNull
    public final CacheControl -deprecated_cacheControl() {
        return this.cacheControl();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheResponse", imports = {}))
    @JvmName(name = "-deprecated_cacheResponse")
    @Nullable
    public final Response -deprecated_cacheResponse() {
        return this.i;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "code", imports = {}))
    @JvmName(name = "-deprecated_code")
    public final int -deprecated_code() {
        return this.d;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "handshake", imports = {}))
    @JvmName(name = "-deprecated_handshake")
    @Nullable
    public final Handshake -deprecated_handshake() {
        return this.e;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
    @JvmName(name = "-deprecated_headers")
    @NotNull
    public final Headers -deprecated_headers() {
        return this.f;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "message", imports = {}))
    @JvmName(name = "-deprecated_message")
    @NotNull
    public final String -deprecated_message() {
        return this.c;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "networkResponse", imports = {}))
    @JvmName(name = "-deprecated_networkResponse")
    @Nullable
    public final Response -deprecated_networkResponse() {
        return this.h;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "priorResponse", imports = {}))
    @JvmName(name = "-deprecated_priorResponse")
    @Nullable
    public final Response -deprecated_priorResponse() {
        return this.j;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "protocol", imports = {}))
    @JvmName(name = "-deprecated_protocol")
    @NotNull
    public final Protocol -deprecated_protocol() {
        return this.b;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "receivedResponseAtMillis", imports = {}))
    @JvmName(name = "-deprecated_receivedResponseAtMillis")
    public final long -deprecated_receivedResponseAtMillis() {
        return this.l;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "request", imports = {}))
    @JvmName(name = "-deprecated_request")
    @NotNull
    public final Request -deprecated_request() {
        return this.a;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sentRequestAtMillis", imports = {}))
    @JvmName(name = "-deprecated_sentRequestAtMillis")
    public final long -deprecated_sentRequestAtMillis() {
        return this.k;
    }

    public Response(@NotNull Request request0, @NotNull Protocol protocol0, @NotNull String s, int v, @Nullable Handshake handshake0, @NotNull Headers headers0, @Nullable ResponseBody responseBody0, @Nullable Response response0, @Nullable Response response1, @Nullable Response response2, long v1, long v2, @Nullable Exchange exchange0) {
        Intrinsics.checkNotNullParameter(request0, "request");
        Intrinsics.checkNotNullParameter(protocol0, "protocol");
        Intrinsics.checkNotNullParameter(s, "message");
        Intrinsics.checkNotNullParameter(headers0, "headers");
        super();
        this.a = request0;
        this.b = protocol0;
        this.c = s;
        this.d = v;
        this.e = handshake0;
        this.f = headers0;
        this.g = responseBody0;
        this.h = response0;
        this.i = response1;
        this.j = response2;
        this.k = v1;
        this.l = v2;
        this.m = exchange0;
    }

    @JvmName(name = "body")
    @Nullable
    public final ResponseBody body() {
        return this.g;
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final CacheControl cacheControl() {
        CacheControl cacheControl0 = this.n;
        if(cacheControl0 == null) {
            cacheControl0 = CacheControl.Companion.parse(this.f);
            this.n = cacheControl0;
        }
        return cacheControl0;
    }

    @JvmName(name = "cacheResponse")
    @Nullable
    public final Response cacheResponse() {
        return this.i;
    }

    @NotNull
    public final List challenges() {
        switch(this.d) {
            case 401: {
                return HttpHeaders.parseChallenges(this.f, "WWW-Authenticate");
            }
            case 407: {
                return HttpHeaders.parseChallenges(this.f, "Proxy-Authenticate");
            }
            default: {
                return CollectionsKt__CollectionsKt.emptyList();
            }
        }
    }

    @Override
    public void close() {
        ResponseBody responseBody0 = this.g;
        if(responseBody0 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody0.close();
    }

    @JvmName(name = "code")
    public final int code() {
        return this.d;
    }

    @JvmName(name = "exchange")
    @Nullable
    public final Exchange exchange() {
        return this.m;
    }

    @JvmName(name = "handshake")
    @Nullable
    public final Handshake handshake() {
        return this.e;
    }

    @JvmOverloads
    @Nullable
    public final String header(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return Response.header$default(this, s, null, 2, null);
    }

    @JvmOverloads
    @Nullable
    public final String header(@NotNull String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "name");
        String s2 = this.f.get(s);
        return s2 == null ? s1 : s2;
    }

    public static String header$default(Response response0, String s, String s1, int v, Object object0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        return response0.header(s, s1);
    }

    @NotNull
    public final List headers(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return this.f.values(s);
    }

    @JvmName(name = "headers")
    @NotNull
    public final Headers headers() {
        return this.f;
    }

    public final boolean isRedirect() {
        return this.d == 307 || this.d == 308 || (this.d == 300 || this.d == 301 || this.d == 302 || this.d == 303);
    }

    public final boolean isSuccessful() {
        return 200 <= this.d && this.d < 300;
    }

    @JvmName(name = "message")
    @NotNull
    public final String message() {
        return this.c;
    }

    @JvmName(name = "networkResponse")
    @Nullable
    public final Response networkResponse() {
        return this.h;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @NotNull
    public final ResponseBody peekBody(long v) throws IOException {
        Intrinsics.checkNotNull(this.g);
        BufferedSource bufferedSource0 = this.g.source().peek();
        Buffer buffer0 = new Buffer();
        bufferedSource0.request(v);
        buffer0.write(bufferedSource0, Math.min(v, bufferedSource0.getBuffer().size()));
        MediaType mediaType0 = this.g.contentType();
        return ResponseBody.Companion.create(buffer0, mediaType0, buffer0.size());
    }

    @JvmName(name = "priorResponse")
    @Nullable
    public final Response priorResponse() {
        return this.j;
    }

    @JvmName(name = "protocol")
    @NotNull
    public final Protocol protocol() {
        return this.b;
    }

    @JvmName(name = "receivedResponseAtMillis")
    public final long receivedResponseAtMillis() {
        return this.l;
    }

    @JvmName(name = "request")
    @NotNull
    public final Request request() {
        return this.a;
    }

    @JvmName(name = "sentRequestAtMillis")
    public final long sentRequestAtMillis() {
        return this.k;
    }

    @Override
    @NotNull
    public String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.url() + '}';
    }

    @NotNull
    public final Headers trailers() throws IOException {
        Exchange exchange0 = this.m;
        if(exchange0 == null) {
            throw new IllegalStateException("trailers not available");
        }
        return exchange0.trailers();
    }
}

