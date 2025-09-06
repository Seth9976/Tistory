package okhttp3.internal.platform;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016J\u0010\u0010\u000B\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\nH\u0016J-\u0010\r\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u000E\u001A\u0004\u0018\u00010\u000F2\u0011\u0010\u0010\u001A\r\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u00130\u0011H\u0016J \u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u001AH\u0016J\u0006\u0010\u001B\u001A\u00020\u000FJ\u0012\u0010\u001C\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0012\u0010\u001D\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u001E\u001A\u00020\u000FH\u0016J\u0010\u0010\u001F\u001A\u00020 2\u0006\u0010\u000E\u001A\u00020\u000FH\u0016J&\u0010!\u001A\u00020\u00042\u0006\u0010\"\u001A\u00020\u000F2\b\b\u0002\u0010#\u001A\u00020\u001A2\n\b\u0002\u0010$\u001A\u0004\u0018\u00010%H\u0016J\u001A\u0010&\u001A\u00020\u00042\u0006\u0010\"\u001A\u00020\u000F2\b\u0010\'\u001A\u0004\u0018\u00010\u0001H\u0016J\b\u0010(\u001A\u00020)H\u0016J\u0010\u0010*\u001A\u00020+2\u0006\u0010\t\u001A\u00020\nH\u0016J\b\u0010,\u001A\u00020\nH\u0016J\b\u0010-\u001A\u00020\u000FH\u0016J\u0012\u0010\t\u001A\u0004\u0018\u00010\n2\u0006\u0010.\u001A\u00020+H\u0016¨\u00060"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "()V", "afterHandshake", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "buildTrustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "configureTlsExtensions", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "connectSocket", "socket", "Ljava/net/Socket;", "address", "Ljava/net/InetSocketAddress;", "connectTimeout", "", "getPrefix", "getSelectedProtocol", "getStackTraceForCloseable", "closer", "isCleartextTrafficPermitted", "", "log", "message", "level", "t", "", "logCloseableLeak", "stackTrace", "newSSLContext", "Ljavax/net/ssl/SSLContext;", "newSslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "platformTrustManager", "toString", "sslSocketFactory", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class Platform {
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u0010\u001A\u00020\u000F2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001A\u00020\u00128F¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001A\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001A\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001C\u0010\u001B\u001A\n \u001A*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001B\u0010\u001CR\u0016\u0010\u0005\u001A\u00020\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0005\u0010\u001D¨\u0006\u001E"}, d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "Lokhttp3/internal/platform/Platform;", "get", "()Lokhttp3/internal/platform/Platform;", "platform", "", "resetForTests", "(Lokhttp3/internal/platform/Platform;)V", "", "Lokhttp3/Protocol;", "protocols", "", "alpnProtocolNames", "(Ljava/util/List;)Ljava/util/List;", "", "concatLengthPrefixed", "(Ljava/util/List;)[B", "", "isAndroid", "()Z", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lokhttp3/internal/platform/Platform;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n766#2:287\n857#2,2:288\n1549#2:290\n1620#2,3:291\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n*L\n193#1:287\n193#1:288,2\n193#1:290\n193#1:291,3\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Platform a() {
            Platform platform0;
            if(this.isAndroid()) {
                AndroidLog.INSTANCE.enable();
                platform0 = Android10Platform.Companion.buildIfSupported();
                if(platform0 == null) {
                    platform0 = AndroidPlatform.Companion.buildIfSupported();
                    Intrinsics.checkNotNull(platform0);
                    return platform0;
                }
            }
            else if(Intrinsics.areEqual("Conscrypt", "SUN")) {
                platform0 = ConscryptPlatform.Companion.buildIfSupported();
                if(platform0 == null) {
                    goto label_10;
                }
            }
            else {
            label_10:
                if(Intrinsics.areEqual("BC", "SUN")) {
                    platform0 = BouncyCastlePlatform.Companion.buildIfSupported();
                    if(platform0 == null) {
                        goto label_13;
                    }
                }
                else {
                label_13:
                    if(Intrinsics.areEqual("OpenJSSE", "SUN")) {
                        platform0 = OpenJSSEPlatform.Companion.buildIfSupported();
                        if(platform0 == null) {
                            goto label_16;
                        }
                    }
                    else {
                    label_16:
                        platform0 = Jdk9Platform.Companion.buildIfSupported();
                        if(platform0 == null) {
                            platform0 = Jdk8WithJettyBootPlatform.Companion.buildIfSupported();
                            return platform0 == null ? new Platform() : platform0;
                        }
                    }
                }
            }
            return platform0;
        }

        public static final Platform access$findPlatform(Companion platform$Companion0) {
            return platform$Companion0.a();
        }

        @NotNull
        public final List alpnProtocolNames(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "protocols");
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                if(((Protocol)object0) != Protocol.HTTP_1_0) {
                    arrayList0.add(object0);
                }
            }
            List list1 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
            for(Object object1: arrayList0) {
                list1.add(((Protocol)object1).toString());
            }
            return list1;
        }

        @NotNull
        public final byte[] concatLengthPrefixed(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "protocols");
            Buffer buffer0 = new Buffer();
            for(Object object0: this.alpnProtocolNames(list0)) {
                buffer0.writeByte(((String)object0).length());
                buffer0.writeUtf8(((String)object0));
            }
            return new byte[0];
        }

        @JvmStatic
        @NotNull
        public final Platform get() {
            return Platform.a;
        }

        // 去混淆评级： 低(20)
        public final boolean isAndroid() {
            return Intrinsics.areEqual("Dalvik", "Dalvik");
        }

        public final void resetForTests(@NotNull Platform platform0) {
            Intrinsics.checkNotNullParameter(platform0, "platform");
            Platform.a = platform0;
        }

        public static void resetForTests$default(Companion platform$Companion0, Platform platform0, int v, Object object0) {
            if((v & 1) != 0) {
                platform0 = platform$Companion0.a();
            }
            platform$Companion0.resetForTests(platform0);
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int INFO = 4;
    public static final int WARN = 5;
    public static volatile Platform a;
    public static final Logger b;

    static {
        Companion platform$Companion0 = new Companion(null);
        Platform.Companion = platform$Companion0;
        Platform.a = Companion.access$findPlatform(platform$Companion0);
        Platform.b = Logger.getLogger("okhttp3.OkHttpClient");
    }

    public void afterHandshake(@NotNull SSLSocket sSLSocket0) {
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
    }

    @NotNull
    public CertificateChainCleaner buildCertificateChainCleaner(@NotNull X509TrustManager x509TrustManager0) {
        Intrinsics.checkNotNullParameter(x509TrustManager0, "trustManager");
        return new BasicCertificateChainCleaner(this.buildTrustRootIndex(x509TrustManager0));
    }

    @NotNull
    public TrustRootIndex buildTrustRootIndex(@NotNull X509TrustManager x509TrustManager0) {
        Intrinsics.checkNotNullParameter(x509TrustManager0, "trustManager");
        X509Certificate[] arr_x509Certificate = x509TrustManager0.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(arr_x509Certificate, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex(((X509Certificate[])Arrays.copyOf(arr_x509Certificate, arr_x509Certificate.length)));
    }

    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket0, @Nullable String s, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
        Intrinsics.checkNotNullParameter(list0, "protocols");
    }

    public void connectSocket(@NotNull Socket socket0, @NotNull InetSocketAddress inetSocketAddress0, int v) throws IOException {
        Intrinsics.checkNotNullParameter(socket0, "socket");
        Intrinsics.checkNotNullParameter(inetSocketAddress0, "address");
        socket0.connect(inetSocketAddress0, v);
    }

    @JvmStatic
    @NotNull
    public static final Platform get() {
        return Platform.Companion.get();
    }

    @NotNull
    public final String getPrefix() [...] // 潜在的解密器

    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sSLSocket0) {
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
        return null;
    }

    @Nullable
    public Object getStackTraceForCloseable(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "closer");
        return Platform.b.isLoggable(Level.FINE) ? new Throwable(s) : null;
    }

    public boolean isCleartextTrafficPermitted(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "hostname");
        return true;
    }

    public void log(@NotNull String s, int v, @Nullable Throwable throwable0) {
        Intrinsics.checkNotNullParameter(s, "message");
        Platform.b.log((v == 5 ? Level.WARNING : Level.INFO), s, throwable0);
    }

    public static void log$default(Platform platform0, String s, int v, Throwable throwable0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if((v1 & 2) != 0) {
            v = 4;
        }
        if((v1 & 4) != 0) {
            throwable0 = null;
        }
        platform0.log(s, v, throwable0);
    }

    public void logCloseableLeak(@NotNull String s, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(s, "message");
        if(object0 == null) {
            s = s + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        this.log(s, 5, ((Throwable)object0));
    }

    @NotNull
    public SSLContext newSSLContext() {
        SSLContext sSLContext0 = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext0, "getInstance(\"TLS\")");
        return sSLContext0;
    }

    @NotNull
    public SSLSocketFactory newSslSocketFactory(@NotNull X509TrustManager x509TrustManager0) {
        Intrinsics.checkNotNullParameter(x509TrustManager0, "trustManager");
        try {
            SSLContext sSLContext0 = this.newSSLContext();
            sSLContext0.init(null, new TrustManager[]{x509TrustManager0}, null);
            SSLSocketFactory sSLSocketFactory0 = sSLContext0.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(sSLSocketFactory0, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return sSLSocketFactory0;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new AssertionError("No System TLS: " + generalSecurityException0, generalSecurityException0);
        }
    }

    @NotNull
    public X509TrustManager platformTrustManager() {
        TrustManagerFactory trustManagerFactory0 = TrustManagerFactory.getInstance("PKIX");
        trustManagerFactory0.init(null);
        TrustManager[] arr_trustManager = trustManagerFactory0.getTrustManagers();
        Intrinsics.checkNotNull(arr_trustManager);
        if(arr_trustManager.length == 1) {
            TrustManager trustManager0 = arr_trustManager[0];
            if(trustManager0 instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager0, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager)trustManager0;
            }
        }
        Intrinsics.checkNotNullExpressionValue("[sun.security.ssl.X509TrustManagerImpl@7d30aaac]", "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: [sun.security.ssl.X509TrustManagerImpl@7d30aaac]");
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(s, "javaClass.simpleName");
        return s;
    }

    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sSLSocketFactory0) {
        Intrinsics.checkNotNullParameter(sSLSocketFactory0, "sslSocketFactory");
        try {
            Class class0 = Class.forName("sun.security.ssl.SSLContextImpl");
            Intrinsics.checkNotNullExpressionValue(class0, "sslContextClass");
            Object object0 = Util.readFieldOrNull(sSLSocketFactory0, class0, "context");
            return object0 == null ? null : ((X509TrustManager)Util.readFieldOrNull(object0, X509TrustManager.class, "trustManager"));
        }
        catch(ClassNotFoundException runtimeException0) {
            if(!Intrinsics.areEqual(runtimeException0.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                throw runtimeException0;
            }
        }
        catch(RuntimeException unused_ex) {
        }
        return null;
    }
}

