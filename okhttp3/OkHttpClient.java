package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform.Companion;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00E8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\'\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00A9\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u00AA\u0001\u00A9\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016\u00A2\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u0011\u001A\u00020\u00102\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0018\u001A\u00020\u0015H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u001C\u001A\u00020\u0019H\u0007\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0015\u0010!\u001A\b\u0012\u0004\u0012\u00020\u001E0\u001DH\u0007\u00A2\u0006\u0004\b\u001F\u0010 J\u0015\u0010#\u001A\b\u0012\u0004\u0012\u00020\u001E0\u001DH\u0007\u00A2\u0006\u0004\b\"\u0010 J\u000F\u0010\'\u001A\u00020$H\u0007\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010+\u001A\u00020(H\u0007\u00A2\u0006\u0004\b)\u0010*J\u000F\u0010/\u001A\u00020,H\u0007\u00A2\u0006\u0004\b-\u0010.J\u000F\u00101\u001A\u00020(H\u0007\u00A2\u0006\u0004\b0\u0010*J\u000F\u00103\u001A\u00020(H\u0007\u00A2\u0006\u0004\b2\u0010*J\u000F\u00107\u001A\u000204H\u0007\u00A2\u0006\u0004\b5\u00106J\u0011\u0010;\u001A\u0004\u0018\u000108H\u0007\u00A2\u0006\u0004\b9\u0010:J\u000F\u0010?\u001A\u00020<H\u0007\u00A2\u0006\u0004\b=\u0010>J\u0011\u0010C\u001A\u0004\u0018\u00010@H\u0007\u00A2\u0006\u0004\bA\u0010BJ\u000F\u0010G\u001A\u00020DH\u0007\u00A2\u0006\u0004\bE\u0010FJ\u000F\u0010I\u001A\u00020,H\u0007\u00A2\u0006\u0004\bH\u0010.J\u000F\u0010M\u001A\u00020JH\u0007\u00A2\u0006\u0004\bK\u0010LJ\u000F\u0010Q\u001A\u00020NH\u0007\u00A2\u0006\u0004\bO\u0010PJ\u0015\u0010T\u001A\b\u0012\u0004\u0012\u00020R0\u001DH\u0007\u00A2\u0006\u0004\bS\u0010 J\u0015\u0010W\u001A\b\u0012\u0004\u0012\u00020U0\u001DH\u0007\u00A2\u0006\u0004\bV\u0010 J\u000F\u0010[\u001A\u00020XH\u0007\u00A2\u0006\u0004\bY\u0010ZJ\u000F\u0010_\u001A\u00020\\H\u0007\u00A2\u0006\u0004\b]\u0010^J\u000F\u0010c\u001A\u00020`H\u0007\u00A2\u0006\u0004\ba\u0010bJ\u000F\u0010e\u001A\u00020`H\u0007\u00A2\u0006\u0004\bd\u0010bJ\u000F\u0010g\u001A\u00020`H\u0007\u00A2\u0006\u0004\bf\u0010bJ\u000F\u0010i\u001A\u00020`H\u0007\u00A2\u0006\u0004\bh\u0010bJ\u000F\u0010k\u001A\u00020`H\u0007\u00A2\u0006\u0004\bj\u0010bR\u0017\u0010\u0018\u001A\u00020\u00158G\u00A2\u0006\f\n\u0004\bl\u0010m\u001A\u0004\b\u0018\u0010\u0017R\u0017\u0010\u001C\u001A\u00020\u00198G\u00A2\u0006\f\n\u0004\bn\u0010o\u001A\u0004\b\u001C\u0010\u001BR\u001D\u0010!\u001A\b\u0012\u0004\u0012\u00020\u001E0\u001D8G\u00A2\u0006\f\n\u0004\bp\u0010q\u001A\u0004\b!\u0010 R\u001D\u0010#\u001A\b\u0012\u0004\u0012\u00020\u001E0\u001D8G\u00A2\u0006\f\n\u0004\br\u0010q\u001A\u0004\b#\u0010 R\u0017\u0010\'\u001A\u00020$8G\u00A2\u0006\f\n\u0004\bs\u0010t\u001A\u0004\b\'\u0010&R\u0017\u0010+\u001A\u00020(8G\u00A2\u0006\f\n\u0004\bu\u0010v\u001A\u0004\b+\u0010*R\u0017\u0010/\u001A\u00020,8G\u00A2\u0006\f\n\u0004\bw\u0010x\u001A\u0004\b/\u0010.R\u0017\u00101\u001A\u00020(8G\u00A2\u0006\f\n\u0004\by\u0010v\u001A\u0004\b1\u0010*R\u0017\u00103\u001A\u00020(8G\u00A2\u0006\f\n\u0004\bz\u0010v\u001A\u0004\b3\u0010*R\u0017\u00107\u001A\u0002048G\u00A2\u0006\f\n\u0004\b{\u0010|\u001A\u0004\b7\u00106R\u0019\u0010;\u001A\u0004\u0018\u0001088G\u00A2\u0006\f\n\u0004\b}\u0010~\u001A\u0004\b;\u0010:R\u0018\u0010?\u001A\u00020<8G\u00A2\u0006\r\n\u0005\b\u007F\u0010\u0080\u0001\u001A\u0004\b?\u0010>R\u001B\u0010C\u001A\u0004\u0018\u00010@8G\u00A2\u0006\u000E\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001A\u0004\bC\u0010BR\u0019\u0010G\u001A\u00020D8G\u00A2\u0006\u000E\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001A\u0004\bG\u0010FR\u0018\u0010I\u001A\u00020,8G\u00A2\u0006\r\n\u0005\b\u0085\u0001\u0010x\u001A\u0004\bI\u0010.R\u0019\u0010M\u001A\u00020J8G\u00A2\u0006\u000E\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001A\u0004\bM\u0010LR\u001F\u0010\u008B\u0001\u001A\u0005\u0018\u00010\u0088\u00018G\u00A2\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008A\u0001\u001A\u0006\b\u008B\u0001\u0010\u008C\u0001R\u001E\u0010T\u001A\b\u0012\u0004\u0012\u00020R0\u001D8G\u00A2\u0006\r\n\u0005\b\u008D\u0001\u0010q\u001A\u0004\bT\u0010 R\u001E\u0010W\u001A\b\u0012\u0004\u0012\u00020U0\u001D8G\u00A2\u0006\r\n\u0005\b\u008E\u0001\u0010q\u001A\u0004\bW\u0010 R\u0019\u0010[\u001A\u00020X8G\u00A2\u0006\u000E\n\u0006\b\u008F\u0001\u0010\u0090\u0001\u001A\u0004\b[\u0010ZR\u0019\u0010_\u001A\u00020\\8G\u00A2\u0006\u000E\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001A\u0004\b_\u0010^R\u001F\u0010\u0096\u0001\u001A\u0005\u0018\u00010\u0093\u00018G\u00A2\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001A\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010c\u001A\u00020`8G\u00A2\u0006\u000E\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001A\u0004\bc\u0010bR\u0019\u0010e\u001A\u00020`8G\u00A2\u0006\u000E\n\u0006\b\u009A\u0001\u0010\u0099\u0001\u001A\u0004\be\u0010bR\u0019\u0010g\u001A\u00020`8G\u00A2\u0006\u000E\n\u0006\b\u009B\u0001\u0010\u0099\u0001\u001A\u0004\bg\u0010bR\u0019\u0010i\u001A\u00020`8G\u00A2\u0006\u000E\n\u0006\b\u009C\u0001\u0010\u0099\u0001\u001A\u0004\bi\u0010bR\u0019\u0010k\u001A\u00020`8G\u00A2\u0006\u000E\n\u0006\b\u009D\u0001\u0010\u0099\u0001\u001A\u0004\bk\u0010bR\u001D\u0010\u00A1\u0001\u001A\u00030\u009E\u00018G\u00A2\u0006\u0010\n\u0006\b\u009F\u0001\u0010\u00A0\u0001\u001A\u0006\b\u00A1\u0001\u0010\u00A2\u0001R\u001D\u0010\u00A8\u0001\u001A\u00030\u00A3\u00018\u0006\u00A2\u0006\u0010\n\u0006\b\u00A4\u0001\u0010\u00A5\u0001\u001A\u0006\b\u00A6\u0001\u0010\u00A7\u0001R\u0011\u0010Q\u001A\u00020N8G\u00A2\u0006\u0006\u001A\u0004\bQ\u0010P\u00A8\u0006\u00AB\u0001"}, d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "Lokhttp3/OkHttpClient$Builder;", "builder", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "()V", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "newCall", "(Lokhttp3/Request;)Lokhttp3/Call;", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocket;", "newWebSocket", "(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;", "newBuilder", "()Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dispatcher;", "-deprecated_dispatcher", "()Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/ConnectionPool;", "-deprecated_connectionPool", "()Lokhttp3/ConnectionPool;", "connectionPool", "", "Lokhttp3/Interceptor;", "-deprecated_interceptors", "()Ljava/util/List;", "interceptors", "-deprecated_networkInterceptors", "networkInterceptors", "Lokhttp3/EventListener$Factory;", "-deprecated_eventListenerFactory", "()Lokhttp3/EventListener$Factory;", "eventListenerFactory", "", "-deprecated_retryOnConnectionFailure", "()Z", "retryOnConnectionFailure", "Lokhttp3/Authenticator;", "-deprecated_authenticator", "()Lokhttp3/Authenticator;", "authenticator", "-deprecated_followRedirects", "followRedirects", "-deprecated_followSslRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "-deprecated_cookieJar", "()Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/Cache;", "-deprecated_cache", "()Lokhttp3/Cache;", "cache", "Lokhttp3/Dns;", "-deprecated_dns", "()Lokhttp3/Dns;", "dns", "Ljava/net/Proxy;", "-deprecated_proxy", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "proxySelector", "-deprecated_proxyAuthenticator", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Lokhttp3/ConnectionSpec;", "-deprecated_connectionSpecs", "connectionSpecs", "Lokhttp3/Protocol;", "-deprecated_protocols", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "certificatePinner", "", "-deprecated_callTimeoutMillis", "()I", "callTimeoutMillis", "-deprecated_connectTimeoutMillis", "connectTimeoutMillis", "-deprecated_readTimeoutMillis", "readTimeoutMillis", "-deprecated_writeTimeoutMillis", "writeTimeoutMillis", "-deprecated_pingIntervalMillis", "pingIntervalMillis", "a", "Lokhttp3/Dispatcher;", "b", "Lokhttp3/ConnectionPool;", "c", "Ljava/util/List;", "d", "e", "Lokhttp3/EventListener$Factory;", "f", "Z", "g", "Lokhttp3/Authenticator;", "h", "i", "j", "Lokhttp3/CookieJar;", "k", "Lokhttp3/Cache;", "l", "Lokhttp3/Dns;", "m", "Ljava/net/Proxy;", "n", "Ljava/net/ProxySelector;", "o", "p", "Ljavax/net/SocketFactory;", "Ljavax/net/ssl/X509TrustManager;", "r", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "()Ljavax/net/ssl/X509TrustManager;", "s", "t", "u", "Ljavax/net/ssl/HostnameVerifier;", "v", "Lokhttp3/CertificatePinner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "w", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "x", "I", "y", "z", "A", "B", "", "C", "J", "minWebSocketMessageToCompress", "()J", "Lokhttp3/internal/connection/RouteDatabase;", "D", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase", "()Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n2624#2,3:1080\n2624#2,3:1083\n1#3:1086\n*S KotlinDebug\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n*L\n225#1:1080,3\n255#1:1083,3\n*E\n"})
public class OkHttpClient implements Cloneable, Factory, okhttp3.WebSocket.Factory {
    @Metadata(d1 = {"\u0000\u00F8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b}\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\b\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000B\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0012\u001A\u00020\u00002#\b\u0004\u0010\u001A\u001A\u001D\u0012\u0013\u0012\u00110\u0015\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0014H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0013\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u000E0\r\u00A2\u0006\u0004\b\u001D\u0010\u0010J\u0015\u0010\u001E\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u000E\u00A2\u0006\u0004\b\u001E\u0010\u0013J8\u0010\u001E\u001A\u00020\u00002#\b\u0004\u0010\u001A\u001A\u001D\u0012\u0013\u0012\u00110\u0015\u00A2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0014H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010\u001CJ\u0015\u0010!\u001A\u00020\u00002\u0006\u0010!\u001A\u00020 \u00A2\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001A\u00020\u00002\u0006\u0010$\u001A\u00020#\u00A2\u0006\u0004\b$\u0010%J\u0015\u0010\'\u001A\u00020\u00002\u0006\u0010\'\u001A\u00020&\u00A2\u0006\u0004\b\'\u0010(J\u0015\u0010*\u001A\u00020\u00002\u0006\u0010*\u001A\u00020)\u00A2\u0006\u0004\b*\u0010+J\u0015\u0010,\u001A\u00020\u00002\u0006\u0010,\u001A\u00020&\u00A2\u0006\u0004\b,\u0010(J\u0015\u0010.\u001A\u00020\u00002\u0006\u0010-\u001A\u00020&\u00A2\u0006\u0004\b.\u0010(J\u0015\u00100\u001A\u00020\u00002\u0006\u00100\u001A\u00020/\u00A2\u0006\u0004\b0\u00101J\u0017\u00103\u001A\u00020\u00002\b\u00103\u001A\u0004\u0018\u000102\u00A2\u0006\u0004\b3\u00104J\u0015\u00106\u001A\u00020\u00002\u0006\u00106\u001A\u000205\u00A2\u0006\u0004\b6\u00107J\u0017\u00109\u001A\u00020\u00002\b\u00109\u001A\u0004\u0018\u000108\u00A2\u0006\u0004\b9\u0010:J\u0015\u0010<\u001A\u00020\u00002\u0006\u0010<\u001A\u00020;\u00A2\u0006\u0004\b<\u0010=J\u0015\u0010>\u001A\u00020\u00002\u0006\u0010>\u001A\u00020)\u00A2\u0006\u0004\b>\u0010+J\u0015\u0010@\u001A\u00020\u00002\u0006\u0010@\u001A\u00020?\u00A2\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001A\u00020\u00002\u0006\u0010C\u001A\u00020BH\u0007\u00A2\u0006\u0004\bC\u0010DJ\u001D\u0010C\u001A\u00020\u00002\u0006\u0010C\u001A\u00020B2\u0006\u0010F\u001A\u00020E\u00A2\u0006\u0004\bC\u0010GJ\u001B\u0010J\u001A\u00020\u00002\f\u0010J\u001A\b\u0012\u0004\u0012\u00020I0H\u00A2\u0006\u0004\bJ\u0010KJ\u001B\u0010M\u001A\u00020\u00002\f\u0010M\u001A\b\u0012\u0004\u0012\u00020L0H\u00A2\u0006\u0004\bM\u0010KJ\u0015\u0010O\u001A\u00020\u00002\u0006\u0010O\u001A\u00020N\u00A2\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001A\u00020\u00002\u0006\u0010R\u001A\u00020Q\u00A2\u0006\u0004\bR\u0010SJ\u001D\u0010X\u001A\u00020\u00002\u0006\u0010U\u001A\u00020T2\u0006\u0010W\u001A\u00020V\u00A2\u0006\u0004\bX\u0010YJ\u0017\u0010X\u001A\u00020\u00002\u0006\u0010[\u001A\u00020ZH\u0007\u00A2\u0006\u0004\bX\u0010\\J\u001D\u0010]\u001A\u00020\u00002\u0006\u0010U\u001A\u00020T2\u0006\u0010W\u001A\u00020V\u00A2\u0006\u0004\b]\u0010YJ\u0017\u0010]\u001A\u00020\u00002\u0006\u0010[\u001A\u00020ZH\u0007\u00A2\u0006\u0004\b]\u0010\\J\u001D\u0010^\u001A\u00020\u00002\u0006\u0010U\u001A\u00020T2\u0006\u0010W\u001A\u00020V\u00A2\u0006\u0004\b^\u0010YJ\u0017\u0010^\u001A\u00020\u00002\u0006\u0010[\u001A\u00020ZH\u0007\u00A2\u0006\u0004\b^\u0010\\J\u001D\u0010_\u001A\u00020\u00002\u0006\u0010U\u001A\u00020T2\u0006\u0010W\u001A\u00020V\u00A2\u0006\u0004\b_\u0010YJ\u0017\u0010_\u001A\u00020\u00002\u0006\u0010[\u001A\u00020ZH\u0007\u00A2\u0006\u0004\b_\u0010\\J\u001D\u0010a\u001A\u00020\u00002\u0006\u0010`\u001A\u00020T2\u0006\u0010W\u001A\u00020V\u00A2\u0006\u0004\ba\u0010YJ\u0017\u0010a\u001A\u00020\u00002\u0006\u0010[\u001A\u00020ZH\u0007\u00A2\u0006\u0004\ba\u0010\\J\u0015\u0010c\u001A\u00020\u00002\u0006\u0010b\u001A\u00020T\u00A2\u0006\u0004\bc\u0010dJ\r\u0010e\u001A\u00020\u0004\u00A2\u0006\u0004\be\u0010fR\"\u0010\b\u001A\u00020\u00078\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bg\u0010h\u001A\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010\u000B\u001A\u00020\n8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bm\u0010n\u001A\u0004\bo\u0010p\"\u0004\bq\u0010rR \u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bs\u0010t\u001A\u0004\bu\u0010\u0010R \u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u000E0\r8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bv\u0010t\u001A\u0004\bw\u0010\u0010R\"\u0010$\u001A\u00020#8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bx\u0010y\u001A\u0004\bz\u0010{\"\u0004\b|\u0010}R&\u0010\'\u001A\u00020&8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0016\n\u0004\b~\u0010\u007F\u001A\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R(\u0010*\u001A\u00020)8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001A\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\'\u0010,\u001A\u00020&8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0005\b\u008A\u0001\u0010\u007F\u001A\u0006\b\u008B\u0001\u0010\u0081\u0001\"\u0006\b\u008C\u0001\u0010\u0083\u0001R\'\u0010.\u001A\u00020&8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0017\n\u0005\b\u008D\u0001\u0010\u007F\u001A\u0006\b\u008E\u0001\u0010\u0081\u0001\"\u0006\b\u008F\u0001\u0010\u0083\u0001R(\u00100\u001A\u00020/8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001A\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u00103\u001A\u0004\u0018\u0001028\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001A\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009A\u0001\u0010\u009B\u0001R(\u00106\u001A\u0002058\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u009C\u0001\u0010\u009D\u0001\u001A\u0006\b\u009E\u0001\u0010\u009F\u0001\"\u0006\b\u00A0\u0001\u0010\u00A1\u0001R*\u00109\u001A\u0004\u0018\u0001088\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00A2\u0001\u0010\u00A3\u0001\u001A\u0006\b\u00A4\u0001\u0010\u00A5\u0001\"\u0006\b\u00A6\u0001\u0010\u00A7\u0001R*\u0010<\u001A\u0004\u0018\u00010;8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00A8\u0001\u0010\u00A9\u0001\u001A\u0006\b\u00AA\u0001\u0010\u00AB\u0001\"\u0006\b\u00AC\u0001\u0010\u00AD\u0001R(\u0010>\u001A\u00020)8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00AE\u0001\u0010\u0085\u0001\u001A\u0006\b\u00AF\u0001\u0010\u0087\u0001\"\u0006\b\u00B0\u0001\u0010\u0089\u0001R(\u0010@\u001A\u00020?8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00B1\u0001\u0010\u00B2\u0001\u001A\u0006\b\u00B3\u0001\u0010\u00B4\u0001\"\u0006\b\u00B5\u0001\u0010\u00B6\u0001R+\u0010\u00BD\u0001\u001A\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00B7\u0001\u0010\u00B8\u0001\u001A\u0006\b\u00B9\u0001\u0010\u00BA\u0001\"\u0006\b\u00BB\u0001\u0010\u00BC\u0001R+\u0010\u00C4\u0001\u001A\u0004\u0018\u00010E8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00BE\u0001\u0010\u00BF\u0001\u001A\u0006\b\u00C0\u0001\u0010\u00C1\u0001\"\u0006\b\u00C2\u0001\u0010\u00C3\u0001R,\u0010J\u001A\b\u0012\u0004\u0012\u00020I0H8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0016\n\u0005\b\u00C5\u0001\u0010t\u001A\u0005\b\u00C6\u0001\u0010\u0010\"\u0006\b\u00C7\u0001\u0010\u00C8\u0001R,\u0010M\u001A\b\u0012\u0004\u0012\u00020L0H8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0016\n\u0005\b\u00C9\u0001\u0010t\u001A\u0005\b\u00CA\u0001\u0010\u0010\"\u0006\b\u00CB\u0001\u0010\u00C8\u0001R(\u0010O\u001A\u00020N8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00CC\u0001\u0010\u00CD\u0001\u001A\u0006\b\u00CE\u0001\u0010\u00CF\u0001\"\u0006\b\u00D0\u0001\u0010\u00D1\u0001R(\u0010R\u001A\u00020Q8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00D2\u0001\u0010\u00D3\u0001\u001A\u0006\b\u00D4\u0001\u0010\u00D5\u0001\"\u0006\b\u00D6\u0001\u0010\u00D7\u0001R,\u0010\u00DF\u0001\u001A\u0005\u0018\u00010\u00D8\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00D9\u0001\u0010\u00DA\u0001\u001A\u0006\b\u00DB\u0001\u0010\u00DC\u0001\"\u0006\b\u00DD\u0001\u0010\u00DE\u0001R)\u0010X\u001A\u00030\u00E0\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00E1\u0001\u0010\u00E2\u0001\u001A\u0006\b\u00E3\u0001\u0010\u00E4\u0001\"\u0006\b\u00E5\u0001\u0010\u00E6\u0001R)\u0010]\u001A\u00030\u00E0\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00E7\u0001\u0010\u00E2\u0001\u001A\u0006\b\u00E8\u0001\u0010\u00E4\u0001\"\u0006\b\u00E9\u0001\u0010\u00E6\u0001R)\u0010^\u001A\u00030\u00E0\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00EA\u0001\u0010\u00E2\u0001\u001A\u0006\b\u00EB\u0001\u0010\u00E4\u0001\"\u0006\b\u00EC\u0001\u0010\u00E6\u0001R)\u0010_\u001A\u00030\u00E0\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00ED\u0001\u0010\u00E2\u0001\u001A\u0006\b\u00EE\u0001\u0010\u00E4\u0001\"\u0006\b\u00EF\u0001\u0010\u00E6\u0001R)\u0010a\u001A\u00030\u00E0\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00F0\u0001\u0010\u00E2\u0001\u001A\u0006\b\u00F1\u0001\u0010\u00E4\u0001\"\u0006\b\u00F2\u0001\u0010\u00E6\u0001R(\u0010c\u001A\u00020T8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00F3\u0001\u0010\u00F4\u0001\u001A\u0006\b\u00F5\u0001\u0010\u00F6\u0001\"\u0006\b\u00F7\u0001\u0010\u00F8\u0001R,\u0010\u0080\u0002\u001A\u0005\u0018\u00010\u00F9\u00018\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u00FA\u0001\u0010\u00FB\u0001\u001A\u0006\b\u00FC\u0001\u0010\u00FD\u0001\"\u0006\b\u00FE\u0001\u0010\u00FF\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006\u0081\u0002"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Dispatcher;", "dispatcher", "(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/ConnectionPool;", "connectionPool", "(Lokhttp3/ConnectionPool;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Interceptor;", "interceptors", "()Ljava/util/List;", "interceptor", "addInterceptor", "(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lkotlin/ParameterName;", "name", "chain", "Lokhttp3/Response;", "block", "-addInterceptor", "(Lkotlin/jvm/functions/Function1;)Lokhttp3/OkHttpClient$Builder;", "networkInterceptors", "addNetworkInterceptor", "-addNetworkInterceptor", "Lokhttp3/EventListener;", "eventListener", "(Lokhttp3/EventListener;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/EventListener$Factory;", "eventListenerFactory", "(Lokhttp3/EventListener$Factory;)Lokhttp3/OkHttpClient$Builder;", "", "retryOnConnectionFailure", "(Z)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Authenticator;", "authenticator", "(Lokhttp3/Authenticator;)Lokhttp3/OkHttpClient$Builder;", "followRedirects", "followProtocolRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "cookieJar", "(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Cache;", "cache", "(Lokhttp3/Cache;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dns;", "dns", "(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;", "Ljava/net/Proxy;", "proxy", "(Ljava/net/Proxy;)Lokhttp3/OkHttpClient$Builder;", "Ljava/net/ProxySelector;", "proxySelector", "(Ljava/net/ProxySelector;)Lokhttp3/OkHttpClient$Builder;", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "socketFactory", "(Ljavax/net/SocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Protocol;", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/CertificatePinner;", "certificatePinner", "(Lokhttp3/CertificatePinner;)Lokhttp3/OkHttpClient$Builder;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "callTimeout", "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;", "Ljava/time/Duration;", "duration", "(Ljava/time/Duration;)Lokhttp3/OkHttpClient$Builder;", "connectTimeout", "readTimeout", "writeTimeout", "interval", "pingInterval", "bytes", "minWebSocketMessageToCompress", "(J)Lokhttp3/OkHttpClient$Builder;", "build", "()Lokhttp3/OkHttpClient;", "a", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "b", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "c", "Ljava/util/List;", "getInterceptors$okhttp", "d", "getNetworkInterceptors$okhttp", "e", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "f", "Z", "getRetryOnConnectionFailure$okhttp", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "g", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "h", "getFollowRedirects$okhttp", "setFollowRedirects$okhttp", "i", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "j", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "k", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "l", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "m", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "n", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "o", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "p", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "q", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "r", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "s", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "t", "getProtocols$okhttp", "setProtocols$okhttp", "u", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "v", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "w", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "certificateChainCleaner", "", "x", "I", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "y", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "z", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "A", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "B", "getPingInterval$okhttp", "setPingInterval$okhttp", "C", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "Lokhttp3/internal/connection/RouteDatabase;", "D", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "routeDatabase", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n1#2:1080\n*E\n"})
    public static final class Builder {
        public int A;
        public int B;
        public long C;
        public RouteDatabase D;
        public Dispatcher a;
        public ConnectionPool b;
        public final ArrayList c;
        public final ArrayList d;
        public okhttp3.EventListener.Factory e;
        public boolean f;
        public Authenticator g;
        public boolean h;
        public boolean i;
        public CookieJar j;
        public Cache k;
        public Dns l;
        public Proxy m;
        public ProxySelector n;
        public Authenticator o;
        public SocketFactory p;
        public SSLSocketFactory q;
        public X509TrustManager r;
        public List s;
        public List t;
        public HostnameVerifier u;
        public CertificatePinner v;
        public CertificateChainCleaner w;
        public int x;
        public int y;
        public int z;

        @JvmName(name = "-addInterceptor")
        @NotNull
        public final Builder -addInterceptor(@NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "block");
            return this.addInterceptor(new Interceptor() {
                @Override  // okhttp3.Interceptor
                @NotNull
                public final Response intercept(@NotNull Chain interceptor$Chain0) {
                    Intrinsics.checkNotNullParameter(interceptor$Chain0, "chain");
                    return (Response)this.a.invoke(interceptor$Chain0);
                }
            });
        }

        @JvmName(name = "-addNetworkInterceptor")
        @NotNull
        public final Builder -addNetworkInterceptor(@NotNull Function1 function10) {
            Intrinsics.checkNotNullParameter(function10, "block");
            return this.addNetworkInterceptor(new Interceptor() {
                @Override  // okhttp3.Interceptor
                @NotNull
                public final Response intercept(@NotNull Chain interceptor$Chain0) {
                    Intrinsics.checkNotNullParameter(interceptor$Chain0, "chain");
                    return (Response)this.a.invoke(interceptor$Chain0);
                }
            });
        }

        public Builder() {
            this.a = new Dispatcher();
            this.b = new ConnectionPool();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = Util.asFactory(EventListener.NONE);
            this.f = true;
            this.g = Authenticator.NONE;
            this.h = true;
            this.i = true;
            this.j = CookieJar.NO_COOKIES;
            this.l = Dns.SYSTEM;
            this.o = Authenticator.NONE;
            SocketFactory socketFactory0 = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory0, "getDefault()");
            this.p = socketFactory0;
            this.s = OkHttpClient.Companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.t = OkHttpClient.Companion.getDEFAULT_PROTOCOLS$okhttp();
            this.u = OkHostnameVerifier.INSTANCE;
            this.v = CertificatePinner.DEFAULT;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.C = 0x400L;
        }

        public Builder(@NotNull OkHttpClient okHttpClient0) {
            Intrinsics.checkNotNullParameter(okHttpClient0, "okHttpClient");
            this();
            this.a = okHttpClient0.dispatcher();
            this.b = okHttpClient0.connectionPool();
            o.addAll(this.c, okHttpClient0.interceptors());
            o.addAll(this.d, okHttpClient0.networkInterceptors());
            this.e = okHttpClient0.eventListenerFactory();
            this.f = okHttpClient0.retryOnConnectionFailure();
            this.g = okHttpClient0.authenticator();
            this.h = okHttpClient0.followRedirects();
            this.i = okHttpClient0.followSslRedirects();
            this.j = okHttpClient0.cookieJar();
            this.k = okHttpClient0.cache();
            this.l = okHttpClient0.dns();
            this.m = okHttpClient0.proxy();
            this.n = okHttpClient0.proxySelector();
            this.o = okHttpClient0.proxyAuthenticator();
            this.p = okHttpClient0.socketFactory();
            this.q = okHttpClient0.q;
            this.r = okHttpClient0.x509TrustManager();
            this.s = okHttpClient0.connectionSpecs();
            this.t = okHttpClient0.protocols();
            this.u = okHttpClient0.hostnameVerifier();
            this.v = okHttpClient0.certificatePinner();
            this.w = okHttpClient0.certificateChainCleaner();
            this.x = okHttpClient0.callTimeoutMillis();
            this.y = okHttpClient0.connectTimeoutMillis();
            this.z = okHttpClient0.readTimeoutMillis();
            this.A = okHttpClient0.writeTimeoutMillis();
            this.B = okHttpClient0.pingIntervalMillis();
            this.C = okHttpClient0.minWebSocketMessageToCompress();
            this.D = okHttpClient0.getRouteDatabase();
        }

        @NotNull
        public final Builder addInterceptor(@NotNull Interceptor interceptor0) {
            Intrinsics.checkNotNullParameter(interceptor0, "interceptor");
            this.c.add(interceptor0);
            return this;
        }

        @NotNull
        public final Builder addNetworkInterceptor(@NotNull Interceptor interceptor0) {
            Intrinsics.checkNotNullParameter(interceptor0, "interceptor");
            this.d.add(interceptor0);
            return this;
        }

        @NotNull
        public final Builder authenticator(@NotNull Authenticator authenticator0) {
            Intrinsics.checkNotNullParameter(authenticator0, "authenticator");
            this.g = authenticator0;
            return this;
        }

        @NotNull
        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        @NotNull
        public final Builder cache(@Nullable Cache cache0) {
            this.k = cache0;
            return this;
        }

        @NotNull
        public final Builder callTimeout(long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "unit");
            this.x = Util.checkDuration("timeout", v, timeUnit0);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder callTimeout(@NotNull Duration duration0) {
            Intrinsics.checkNotNullParameter(duration0, "duration");
            this.callTimeout(duration0.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder certificatePinner(@NotNull CertificatePinner certificatePinner0) {
            Intrinsics.checkNotNullParameter(certificatePinner0, "certificatePinner");
            if(!Intrinsics.areEqual(certificatePinner0, this.v)) {
                this.D = null;
            }
            this.v = certificatePinner0;
            return this;
        }

        @NotNull
        public final Builder connectTimeout(long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "unit");
            this.y = Util.checkDuration("timeout", v, timeUnit0);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder connectTimeout(@NotNull Duration duration0) {
            Intrinsics.checkNotNullParameter(duration0, "duration");
            this.connectTimeout(duration0.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder connectionPool(@NotNull ConnectionPool connectionPool0) {
            Intrinsics.checkNotNullParameter(connectionPool0, "connectionPool");
            this.b = connectionPool0;
            return this;
        }

        @NotNull
        public final Builder connectionSpecs(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "connectionSpecs");
            if(!Intrinsics.areEqual(list0, this.s)) {
                this.D = null;
            }
            this.s = Util.toImmutableList(list0);
            return this;
        }

        @NotNull
        public final Builder cookieJar(@NotNull CookieJar cookieJar0) {
            Intrinsics.checkNotNullParameter(cookieJar0, "cookieJar");
            this.j = cookieJar0;
            return this;
        }

        @NotNull
        public final Builder dispatcher(@NotNull Dispatcher dispatcher0) {
            Intrinsics.checkNotNullParameter(dispatcher0, "dispatcher");
            this.a = dispatcher0;
            return this;
        }

        @NotNull
        public final Builder dns(@NotNull Dns dns0) {
            Intrinsics.checkNotNullParameter(dns0, "dns");
            if(!Intrinsics.areEqual(dns0, this.l)) {
                this.D = null;
            }
            this.l = dns0;
            return this;
        }

        @NotNull
        public final Builder eventListener(@NotNull EventListener eventListener0) {
            Intrinsics.checkNotNullParameter(eventListener0, "eventListener");
            this.e = Util.asFactory(eventListener0);
            return this;
        }

        @NotNull
        public final Builder eventListenerFactory(@NotNull okhttp3.EventListener.Factory eventListener$Factory0) {
            Intrinsics.checkNotNullParameter(eventListener$Factory0, "eventListenerFactory");
            this.e = eventListener$Factory0;
            return this;
        }

        @NotNull
        public final Builder followRedirects(boolean z) {
            this.h = z;
            return this;
        }

        @NotNull
        public final Builder followSslRedirects(boolean z) {
            this.i = z;
            return this;
        }

        @NotNull
        public final Authenticator getAuthenticator$okhttp() {
            return this.g;
        }

        @Nullable
        public final Cache getCache$okhttp() {
            return this.k;
        }

        public final int getCallTimeout$okhttp() {
            return this.x;
        }

        @Nullable
        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.w;
        }

        @NotNull
        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.v;
        }

        public final int getConnectTimeout$okhttp() {
            return this.y;
        }

        @NotNull
        public final ConnectionPool getConnectionPool$okhttp() {
            return this.b;
        }

        @NotNull
        public final List getConnectionSpecs$okhttp() {
            return this.s;
        }

        @NotNull
        public final CookieJar getCookieJar$okhttp() {
            return this.j;
        }

        @NotNull
        public final Dispatcher getDispatcher$okhttp() {
            return this.a;
        }

        @NotNull
        public final Dns getDns$okhttp() {
            return this.l;
        }

        @NotNull
        public final okhttp3.EventListener.Factory getEventListenerFactory$okhttp() {
            return this.e;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.h;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.i;
        }

        @NotNull
        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.u;
        }

        @NotNull
        public final List getInterceptors$okhttp() {
            return this.c;
        }

        public final long getMinWebSocketMessageToCompress$okhttp() {
            return this.C;
        }

        @NotNull
        public final List getNetworkInterceptors$okhttp() {
            return this.d;
        }

        public final int getPingInterval$okhttp() {
            return this.B;
        }

        @NotNull
        public final List getProtocols$okhttp() {
            return this.t;
        }

        @Nullable
        public final Proxy getProxy$okhttp() {
            return this.m;
        }

        @NotNull
        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.o;
        }

        @Nullable
        public final ProxySelector getProxySelector$okhttp() {
            return this.n;
        }

        public final int getReadTimeout$okhttp() {
            return this.z;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.f;
        }

        @Nullable
        public final RouteDatabase getRouteDatabase$okhttp() {
            return this.D;
        }

        @NotNull
        public final SocketFactory getSocketFactory$okhttp() {
            return this.p;
        }

        @Nullable
        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.q;
        }

        public final int getWriteTimeout$okhttp() {
            return this.A;
        }

        @Nullable
        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.r;
        }

        @NotNull
        public final Builder hostnameVerifier(@NotNull HostnameVerifier hostnameVerifier0) {
            Intrinsics.checkNotNullParameter(hostnameVerifier0, "hostnameVerifier");
            if(!Intrinsics.areEqual(hostnameVerifier0, this.u)) {
                this.D = null;
            }
            this.u = hostnameVerifier0;
            return this;
        }

        @NotNull
        public final List interceptors() {
            return this.c;
        }

        @NotNull
        public final Builder minWebSocketMessageToCompress(long v) {
            if(v < 0L) {
                throw new IllegalArgumentException(q.n(v, "minWebSocketMessageToCompress must be positive: ").toString());
            }
            this.C = v;
            return this;
        }

        @NotNull
        public final List networkInterceptors() {
            return this.d;
        }

        @NotNull
        public final Builder pingInterval(long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "unit");
            this.B = Util.checkDuration("interval", v, timeUnit0);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder pingInterval(@NotNull Duration duration0) {
            Intrinsics.checkNotNullParameter(duration0, "duration");
            this.pingInterval(duration0.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder protocols(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "protocols");
            List list1 = CollectionsKt___CollectionsKt.toMutableList(list0);
            Protocol protocol0 = Protocol.H2_PRIOR_KNOWLEDGE;
            if(!list1.contains(protocol0) && !list1.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + list1).toString());
            }
            if(list1.contains(protocol0) && list1.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + list1).toString());
            }
            if(list1.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + list1).toString());
            }
            Intrinsics.checkNotNull(list1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if(list1.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            list1.remove(Protocol.SPDY_3);
            if(!Intrinsics.areEqual(list1, this.t)) {
                this.D = null;
            }
            List list2 = Collections.unmodifiableList(list1);
            Intrinsics.checkNotNullExpressionValue(list2, "unmodifiableList(protocolsCopy)");
            this.t = list2;
            return this;
        }

        @NotNull
        public final Builder proxy(@Nullable Proxy proxy0) {
            if(!Intrinsics.areEqual(proxy0, this.m)) {
                this.D = null;
            }
            this.m = proxy0;
            return this;
        }

        @NotNull
        public final Builder proxyAuthenticator(@NotNull Authenticator authenticator0) {
            Intrinsics.checkNotNullParameter(authenticator0, "proxyAuthenticator");
            if(!Intrinsics.areEqual(authenticator0, this.o)) {
                this.D = null;
            }
            this.o = authenticator0;
            return this;
        }

        @NotNull
        public final Builder proxySelector(@NotNull ProxySelector proxySelector0) {
            Intrinsics.checkNotNullParameter(proxySelector0, "proxySelector");
            if(!Intrinsics.areEqual(proxySelector0, this.n)) {
                this.D = null;
            }
            this.n = proxySelector0;
            return this;
        }

        @NotNull
        public final Builder readTimeout(long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "unit");
            this.z = Util.checkDuration("timeout", v, timeUnit0);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder readTimeout(@NotNull Duration duration0) {
            Intrinsics.checkNotNullParameter(duration0, "duration");
            this.readTimeout(duration0.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @NotNull
        public final Builder retryOnConnectionFailure(boolean z) {
            this.f = z;
            return this;
        }

        public final void setAuthenticator$okhttp(@NotNull Authenticator authenticator0) {
            Intrinsics.checkNotNullParameter(authenticator0, "<set-?>");
            this.g = authenticator0;
        }

        public final void setCache$okhttp(@Nullable Cache cache0) {
            this.k = cache0;
        }

        public final void setCallTimeout$okhttp(int v) {
            this.x = v;
        }

        public final void setCertificateChainCleaner$okhttp(@Nullable CertificateChainCleaner certificateChainCleaner0) {
            this.w = certificateChainCleaner0;
        }

        public final void setCertificatePinner$okhttp(@NotNull CertificatePinner certificatePinner0) {
            Intrinsics.checkNotNullParameter(certificatePinner0, "<set-?>");
            this.v = certificatePinner0;
        }

        public final void setConnectTimeout$okhttp(int v) {
            this.y = v;
        }

        public final void setConnectionPool$okhttp(@NotNull ConnectionPool connectionPool0) {
            Intrinsics.checkNotNullParameter(connectionPool0, "<set-?>");
            this.b = connectionPool0;
        }

        public final void setConnectionSpecs$okhttp(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "<set-?>");
            this.s = list0;
        }

        public final void setCookieJar$okhttp(@NotNull CookieJar cookieJar0) {
            Intrinsics.checkNotNullParameter(cookieJar0, "<set-?>");
            this.j = cookieJar0;
        }

        public final void setDispatcher$okhttp(@NotNull Dispatcher dispatcher0) {
            Intrinsics.checkNotNullParameter(dispatcher0, "<set-?>");
            this.a = dispatcher0;
        }

        public final void setDns$okhttp(@NotNull Dns dns0) {
            Intrinsics.checkNotNullParameter(dns0, "<set-?>");
            this.l = dns0;
        }

        public final void setEventListenerFactory$okhttp(@NotNull okhttp3.EventListener.Factory eventListener$Factory0) {
            Intrinsics.checkNotNullParameter(eventListener$Factory0, "<set-?>");
            this.e = eventListener$Factory0;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.h = z;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.i = z;
        }

        public final void setHostnameVerifier$okhttp(@NotNull HostnameVerifier hostnameVerifier0) {
            Intrinsics.checkNotNullParameter(hostnameVerifier0, "<set-?>");
            this.u = hostnameVerifier0;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long v) {
            this.C = v;
        }

        public final void setPingInterval$okhttp(int v) {
            this.B = v;
        }

        public final void setProtocols$okhttp(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "<set-?>");
            this.t = list0;
        }

        public final void setProxy$okhttp(@Nullable Proxy proxy0) {
            this.m = proxy0;
        }

        public final void setProxyAuthenticator$okhttp(@NotNull Authenticator authenticator0) {
            Intrinsics.checkNotNullParameter(authenticator0, "<set-?>");
            this.o = authenticator0;
        }

        public final void setProxySelector$okhttp(@Nullable ProxySelector proxySelector0) {
            this.n = proxySelector0;
        }

        public final void setReadTimeout$okhttp(int v) {
            this.z = v;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.f = z;
        }

        public final void setRouteDatabase$okhttp(@Nullable RouteDatabase routeDatabase0) {
            this.D = routeDatabase0;
        }

        public final void setSocketFactory$okhttp(@NotNull SocketFactory socketFactory0) {
            Intrinsics.checkNotNullParameter(socketFactory0, "<set-?>");
            this.p = socketFactory0;
        }

        public final void setSslSocketFactoryOrNull$okhttp(@Nullable SSLSocketFactory sSLSocketFactory0) {
            this.q = sSLSocketFactory0;
        }

        public final void setWriteTimeout$okhttp(int v) {
            this.A = v;
        }

        public final void setX509TrustManagerOrNull$okhttp(@Nullable X509TrustManager x509TrustManager0) {
            this.r = x509TrustManager0;
        }

        @NotNull
        public final Builder socketFactory(@NotNull SocketFactory socketFactory0) {
            Intrinsics.checkNotNullParameter(socketFactory0, "socketFactory");
            if(socketFactory0 instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if(!Intrinsics.areEqual(socketFactory0, this.p)) {
                this.D = null;
            }
            this.p = socketFactory0;
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        @NotNull
        public final Builder sslSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory0) {
            Intrinsics.checkNotNullParameter(sSLSocketFactory0, "sslSocketFactory");
            if(!Intrinsics.areEqual(sSLSocketFactory0, this.q)) {
                this.D = null;
            }
            this.q = sSLSocketFactory0;
            Companion platform$Companion0 = Platform.Companion;
            X509TrustManager x509TrustManager0 = platform$Companion0.get().trustManager(sSLSocketFactory0);
            if(x509TrustManager0 == null) {
                throw new IllegalStateException("Unable to extract the trust manager on " + platform$Companion0.get() + ", sslSocketFactory is " + sSLSocketFactory0.getClass());
            }
            this.r = x509TrustManager0;
            Platform platform0 = platform$Companion0.get();
            X509TrustManager x509TrustManager1 = this.r;
            Intrinsics.checkNotNull(x509TrustManager1);
            this.w = platform0.buildCertificateChainCleaner(x509TrustManager1);
            return this;
        }

        @NotNull
        public final Builder sslSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory0, @NotNull X509TrustManager x509TrustManager0) {
            Intrinsics.checkNotNullParameter(sSLSocketFactory0, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(x509TrustManager0, "trustManager");
            if(!Intrinsics.areEqual(sSLSocketFactory0, this.q) || !Intrinsics.areEqual(x509TrustManager0, this.r)) {
                this.D = null;
            }
            this.q = sSLSocketFactory0;
            this.w = CertificateChainCleaner.Companion.get(x509TrustManager0);
            this.r = x509TrustManager0;
            return this;
        }

        @NotNull
        public final Builder writeTimeout(long v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "unit");
            this.A = Util.checkDuration("timeout", v, timeUnit0);
            return this;
        }

        @IgnoreJRERequirement
        @NotNull
        public final Builder writeTimeout(@NotNull Duration duration0) {
            Intrinsics.checkNotNullParameter(duration0, "duration");
            this.writeTimeout(duration0.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R \u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001A\u0004\b\n\u0010\u0007¨\u0006\u000B"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "", "Lokhttp3/Protocol;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "getDEFAULT_PROTOCOLS$okhttp", "()Ljava/util/List;", "Lokhttp3/ConnectionSpec;", "DEFAULT_CONNECTION_SPECS", "getDEFAULT_CONNECTION_SPECS$okhttp", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class okhttp3.OkHttpClient.Companion {
        public okhttp3.OkHttpClient.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final List getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.F;
        }

        @NotNull
        public final List getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.E;
        }
    }

    public final int A;
    public final int B;
    public final long C;
    @NotNull
    public static final okhttp3.OkHttpClient.Companion Companion;
    public final RouteDatabase D;
    public static final List E;
    public static final List F;
    public final Dispatcher a;
    public final ConnectionPool b;
    public final List c;
    public final List d;
    public final okhttp3.EventListener.Factory e;
    public final boolean f;
    public final Authenticator g;
    public final boolean h;
    public final boolean i;
    public final CookieJar j;
    public final Cache k;
    public final Dns l;
    public final Proxy m;
    public final ProxySelector n;
    public final Authenticator o;
    public final SocketFactory p;
    public final SSLSocketFactory q;
    public final X509TrustManager r;
    public final List s;
    public final List t;
    public final HostnameVerifier u;
    public final CertificatePinner v;
    public final CertificateChainCleaner w;
    public final int x;
    public final int y;
    public final int z;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "authenticator", imports = {}))
    @JvmName(name = "-deprecated_authenticator")
    @NotNull
    public final Authenticator -deprecated_authenticator() {
        return this.g;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cache", imports = {}))
    @JvmName(name = "-deprecated_cache")
    @Nullable
    public final Cache -deprecated_cache() {
        return this.k;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "callTimeoutMillis", imports = {}))
    @JvmName(name = "-deprecated_callTimeoutMillis")
    public final int -deprecated_callTimeoutMillis() {
        return this.x;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "certificatePinner", imports = {}))
    @JvmName(name = "-deprecated_certificatePinner")
    @NotNull
    public final CertificatePinner -deprecated_certificatePinner() {
        return this.v;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectTimeoutMillis", imports = {}))
    @JvmName(name = "-deprecated_connectTimeoutMillis")
    public final int -deprecated_connectTimeoutMillis() {
        return this.y;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionPool", imports = {}))
    @JvmName(name = "-deprecated_connectionPool")
    @NotNull
    public final ConnectionPool -deprecated_connectionPool() {
        return this.b;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionSpecs", imports = {}))
    @JvmName(name = "-deprecated_connectionSpecs")
    @NotNull
    public final List -deprecated_connectionSpecs() {
        return this.s;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cookieJar", imports = {}))
    @JvmName(name = "-deprecated_cookieJar")
    @NotNull
    public final CookieJar -deprecated_cookieJar() {
        return this.j;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dispatcher", imports = {}))
    @JvmName(name = "-deprecated_dispatcher")
    @NotNull
    public final Dispatcher -deprecated_dispatcher() {
        return this.a;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dns", imports = {}))
    @JvmName(name = "-deprecated_dns")
    @NotNull
    public final Dns -deprecated_dns() {
        return this.l;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "eventListenerFactory", imports = {}))
    @JvmName(name = "-deprecated_eventListenerFactory")
    @NotNull
    public final okhttp3.EventListener.Factory -deprecated_eventListenerFactory() {
        return this.e;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "followRedirects", imports = {}))
    @JvmName(name = "-deprecated_followRedirects")
    public final boolean -deprecated_followRedirects() {
        return this.h;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "followSslRedirects", imports = {}))
    @JvmName(name = "-deprecated_followSslRedirects")
    public final boolean -deprecated_followSslRedirects() {
        return this.i;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostnameVerifier", imports = {}))
    @JvmName(name = "-deprecated_hostnameVerifier")
    @NotNull
    public final HostnameVerifier -deprecated_hostnameVerifier() {
        return this.u;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "interceptors", imports = {}))
    @JvmName(name = "-deprecated_interceptors")
    @NotNull
    public final List -deprecated_interceptors() {
        return this.c;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "networkInterceptors", imports = {}))
    @JvmName(name = "-deprecated_networkInterceptors")
    @NotNull
    public final List -deprecated_networkInterceptors() {
        return this.d;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pingIntervalMillis", imports = {}))
    @JvmName(name = "-deprecated_pingIntervalMillis")
    public final int -deprecated_pingIntervalMillis() {
        return this.B;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "protocols", imports = {}))
    @JvmName(name = "-deprecated_protocols")
    @NotNull
    public final List -deprecated_protocols() {
        return this.t;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @JvmName(name = "-deprecated_proxy")
    @Nullable
    public final Proxy -deprecated_proxy() {
        return this.m;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    @JvmName(name = "-deprecated_proxyAuthenticator")
    @NotNull
    public final Authenticator -deprecated_proxyAuthenticator() {
        return this.o;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxySelector", imports = {}))
    @JvmName(name = "-deprecated_proxySelector")
    @NotNull
    public final ProxySelector -deprecated_proxySelector() {
        return this.n;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "readTimeoutMillis", imports = {}))
    @JvmName(name = "-deprecated_readTimeoutMillis")
    public final int -deprecated_readTimeoutMillis() {
        return this.z;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "retryOnConnectionFailure", imports = {}))
    @JvmName(name = "-deprecated_retryOnConnectionFailure")
    public final boolean -deprecated_retryOnConnectionFailure() {
        return this.f;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "socketFactory", imports = {}))
    @JvmName(name = "-deprecated_socketFactory")
    @NotNull
    public final SocketFactory -deprecated_socketFactory() {
        return this.p;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sslSocketFactory", imports = {}))
    @JvmName(name = "-deprecated_sslSocketFactory")
    @NotNull
    public final SSLSocketFactory -deprecated_sslSocketFactory() {
        return this.sslSocketFactory();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "writeTimeoutMillis", imports = {}))
    @JvmName(name = "-deprecated_writeTimeoutMillis")
    public final int -deprecated_writeTimeoutMillis() {
        return this.A;
    }

    static {
        OkHttpClient.Companion = new okhttp3.OkHttpClient.Companion(null);
        OkHttpClient.E = Util.immutableListOf(new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});
        OkHttpClient.F = Util.immutableListOf(new ConnectionSpec[]{ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT});
    }

    public OkHttpClient() {
        this(new Builder());
    }

    public OkHttpClient(@NotNull Builder okHttpClient$Builder0) {
        Intrinsics.checkNotNullParameter(okHttpClient$Builder0, "builder");
        ProxySelector proxySelector0;
        super();
        this.a = okHttpClient$Builder0.getDispatcher$okhttp();
        this.b = okHttpClient$Builder0.getConnectionPool$okhttp();
        this.c = Util.toImmutableList(okHttpClient$Builder0.getInterceptors$okhttp());
        this.d = Util.toImmutableList(okHttpClient$Builder0.getNetworkInterceptors$okhttp());
        this.e = okHttpClient$Builder0.getEventListenerFactory$okhttp();
        this.f = okHttpClient$Builder0.getRetryOnConnectionFailure$okhttp();
        this.g = okHttpClient$Builder0.getAuthenticator$okhttp();
        this.h = okHttpClient$Builder0.getFollowRedirects$okhttp();
        this.i = okHttpClient$Builder0.getFollowSslRedirects$okhttp();
        this.j = okHttpClient$Builder0.getCookieJar$okhttp();
        this.k = okHttpClient$Builder0.getCache$okhttp();
        this.l = okHttpClient$Builder0.getDns$okhttp();
        this.m = okHttpClient$Builder0.getProxy$okhttp();
        if(okHttpClient$Builder0.getProxy$okhttp() == null) {
            proxySelector0 = okHttpClient$Builder0.getProxySelector$okhttp() == null ? ProxySelector.getDefault() : okHttpClient$Builder0.getProxySelector$okhttp();
            if(proxySelector0 == null) {
                proxySelector0 = NullProxySelector.INSTANCE;
            }
        }
        else {
            proxySelector0 = NullProxySelector.INSTANCE;
        }
        this.n = proxySelector0;
        this.o = okHttpClient$Builder0.getProxyAuthenticator$okhttp();
        this.p = okHttpClient$Builder0.getSocketFactory$okhttp();
        List list0 = okHttpClient$Builder0.getConnectionSpecs$okhttp();
        this.s = list0;
        this.t = okHttpClient$Builder0.getProtocols$okhttp();
        this.u = okHttpClient$Builder0.getHostnameVerifier$okhttp();
        this.x = okHttpClient$Builder0.getCallTimeout$okhttp();
        this.y = okHttpClient$Builder0.getConnectTimeout$okhttp();
        this.z = okHttpClient$Builder0.getReadTimeout$okhttp();
        this.A = okHttpClient$Builder0.getWriteTimeout$okhttp();
        this.B = okHttpClient$Builder0.getPingInterval$okhttp();
        this.C = okHttpClient$Builder0.getMinWebSocketMessageToCompress$okhttp();
        this.D = okHttpClient$Builder0.getRouteDatabase$okhttp() == null ? new RouteDatabase() : okHttpClient$Builder0.getRouteDatabase$okhttp();
        if(list0 instanceof Collection && list0.isEmpty()) {
        label_62:
            this.q = null;
            this.w = null;
            this.r = null;
            this.v = CertificatePinner.DEFAULT;
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    goto label_62;
                }
                Object object0 = iterator0.next();
                if(((ConnectionSpec)object0).isTls()) {
                    if(okHttpClient$Builder0.getSslSocketFactoryOrNull$okhttp() == null) {
                        X509TrustManager x509TrustManager1 = Platform.Companion.get().platformTrustManager();
                        this.r = x509TrustManager1;
                        Platform platform0 = Platform.Companion.get();
                        Intrinsics.checkNotNull(x509TrustManager1);
                        this.q = platform0.newSslSocketFactory(x509TrustManager1);
                        Intrinsics.checkNotNull(x509TrustManager1);
                        CertificateChainCleaner certificateChainCleaner1 = CertificateChainCleaner.Companion.get(x509TrustManager1);
                        this.w = certificateChainCleaner1;
                        Intrinsics.checkNotNull(certificateChainCleaner1);
                        this.v = okHttpClient$Builder0.getCertificatePinner$okhttp().withCertificateChainCleaner$okhttp(certificateChainCleaner1);
                    }
                    else {
                        this.q = okHttpClient$Builder0.getSslSocketFactoryOrNull$okhttp();
                        CertificateChainCleaner certificateChainCleaner0 = okHttpClient$Builder0.getCertificateChainCleaner$okhttp();
                        Intrinsics.checkNotNull(certificateChainCleaner0);
                        this.w = certificateChainCleaner0;
                        X509TrustManager x509TrustManager0 = okHttpClient$Builder0.getX509TrustManagerOrNull$okhttp();
                        Intrinsics.checkNotNull(x509TrustManager0);
                        this.r = x509TrustManager0;
                        Intrinsics.checkNotNull(certificateChainCleaner0);
                        this.v = okHttpClient$Builder0.getCertificatePinner$okhttp().withCertificateChainCleaner$okhttp(certificateChainCleaner0);
                    }
                    break;
                }
            }
        }
        List list1 = this.c;
        Intrinsics.checkNotNull(list1, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if(list1.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list1).toString());
        }
        List list2 = this.d;
        Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if(list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        Iterable iterable0 = this.s;
        X509TrustManager x509TrustManager2 = this.r;
        CertificateChainCleaner certificateChainCleaner2 = this.w;
        SSLSocketFactory sSLSocketFactory0 = this.q;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object1: iterable0) {
                if(!((ConnectionSpec)object1).isTls()) {
                    continue;
                }
                if(sSLSocketFactory0 == null) {
                    throw new IllegalStateException("sslSocketFactory == null");
                }
                if(certificateChainCleaner2 == null) {
                    throw new IllegalStateException("certificateChainCleaner == null");
                }
                if(x509TrustManager2 == null) {
                    throw new IllegalStateException("x509TrustManager == null");
                }
                return;
            }
        }
        if(sSLSocketFactory0 != null || certificateChainCleaner2 != null || x509TrustManager2 != null || !Intrinsics.areEqual(this.v, CertificatePinner.DEFAULT)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @JvmName(name = "authenticator")
    @NotNull
    public final Authenticator authenticator() {
        return this.g;
    }

    @JvmName(name = "cache")
    @Nullable
    public final Cache cache() {
        return this.k;
    }

    @JvmName(name = "callTimeoutMillis")
    public final int callTimeoutMillis() {
        return this.x;
    }

    @JvmName(name = "certificateChainCleaner")
    @Nullable
    public final CertificateChainCleaner certificateChainCleaner() {
        return this.w;
    }

    @JvmName(name = "certificatePinner")
    @NotNull
    public final CertificatePinner certificatePinner() {
        return this.v;
    }

    @Override
    @NotNull
    public Object clone() {
        return super.clone();
    }

    @JvmName(name = "connectTimeoutMillis")
    public final int connectTimeoutMillis() {
        return this.y;
    }

    @JvmName(name = "connectionPool")
    @NotNull
    public final ConnectionPool connectionPool() {
        return this.b;
    }

    @JvmName(name = "connectionSpecs")
    @NotNull
    public final List connectionSpecs() {
        return this.s;
    }

    @JvmName(name = "cookieJar")
    @NotNull
    public final CookieJar cookieJar() {
        return this.j;
    }

    @JvmName(name = "dispatcher")
    @NotNull
    public final Dispatcher dispatcher() {
        return this.a;
    }

    @JvmName(name = "dns")
    @NotNull
    public final Dns dns() {
        return this.l;
    }

    @JvmName(name = "eventListenerFactory")
    @NotNull
    public final okhttp3.EventListener.Factory eventListenerFactory() {
        return this.e;
    }

    @JvmName(name = "followRedirects")
    public final boolean followRedirects() {
        return this.h;
    }

    @JvmName(name = "followSslRedirects")
    public final boolean followSslRedirects() {
        return this.i;
    }

    @NotNull
    public final RouteDatabase getRouteDatabase() {
        return this.D;
    }

    @JvmName(name = "hostnameVerifier")
    @NotNull
    public final HostnameVerifier hostnameVerifier() {
        return this.u;
    }

    @JvmName(name = "interceptors")
    @NotNull
    public final List interceptors() {
        return this.c;
    }

    @JvmName(name = "minWebSocketMessageToCompress")
    public final long minWebSocketMessageToCompress() {
        return this.C;
    }

    @JvmName(name = "networkInterceptors")
    @NotNull
    public final List networkInterceptors() {
        return this.d;
    }

    @NotNull
    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override  // okhttp3.Call$Factory
    @NotNull
    public Call newCall(@NotNull Request request0) {
        Intrinsics.checkNotNullParameter(request0, "request");
        return new RealCall(this, request0, false);
    }

    @Override  // okhttp3.WebSocket$Factory
    @NotNull
    public WebSocket newWebSocket(@NotNull Request request0, @NotNull WebSocketListener webSocketListener0) {
        Intrinsics.checkNotNullParameter(request0, "request");
        Intrinsics.checkNotNullParameter(webSocketListener0, "listener");
        Random random0 = new Random();
        WebSocket webSocket0 = new RealWebSocket(TaskRunner.INSTANCE, request0, webSocketListener0, random0, ((long)this.B), null, this.C);
        ((RealWebSocket)webSocket0).connect(this);
        return webSocket0;
    }

    @JvmName(name = "pingIntervalMillis")
    public final int pingIntervalMillis() {
        return this.B;
    }

    @JvmName(name = "protocols")
    @NotNull
    public final List protocols() {
        return this.t;
    }

    @JvmName(name = "proxy")
    @Nullable
    public final Proxy proxy() {
        return this.m;
    }

    @JvmName(name = "proxyAuthenticator")
    @NotNull
    public final Authenticator proxyAuthenticator() {
        return this.o;
    }

    @JvmName(name = "proxySelector")
    @NotNull
    public final ProxySelector proxySelector() {
        return this.n;
    }

    @JvmName(name = "readTimeoutMillis")
    public final int readTimeoutMillis() {
        return this.z;
    }

    @JvmName(name = "retryOnConnectionFailure")
    public final boolean retryOnConnectionFailure() {
        return this.f;
    }

    @JvmName(name = "socketFactory")
    @NotNull
    public final SocketFactory socketFactory() {
        return this.p;
    }

    @JvmName(name = "sslSocketFactory")
    @NotNull
    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory0 = this.q;
        if(sSLSocketFactory0 == null) {
            throw new IllegalStateException("CLEARTEXT-only client");
        }
        return sSLSocketFactory0;
    }

    @JvmName(name = "writeTimeoutMillis")
    public final int writeTimeoutMillis() {
        return this.A;
    }

    @JvmName(name = "x509TrustManager")
    @Nullable
    public final X509TrustManager x509TrustManager() {
        return this.r;
    }
}

