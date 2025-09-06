package okhttp3.internal.platform;

import android.os.Build.VERSION;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\'\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u001A\u001A\u00020\n2\u0006\u0010\u0013\u001A\u00020\u00122\b\u0010\u0015\u001A\u0004\u0018\u00010\u00142\u0011\u0010\u0019\u001A\r\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u00180\u0016H\u0016¢\u0006\u0004\b\u001A\u0010\u001BJ\u0019\u0010\u001C\u001A\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u0019\u0010 \u001A\u0004\u0018\u00010\u001F2\u0006\u0010\u001E\u001A\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J!\u0010$\u001A\u00020\n2\u0006\u0010\"\u001A\u00020\u00142\b\u0010#\u001A\u0004\u0018\u00010\u001FH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010\'\u001A\u00020&2\u0006\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\'\u0010(J\u0017\u0010*\u001A\u00020)2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001A\u00020,2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b-\u0010.¨\u00061"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "", "connectSocket", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "closer", "", "getStackTraceForCloseable", "(Ljava/lang/String;)Ljava/lang/Object;", "message", "stackTrace", "logCloseableLeak", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "isCleartextTrafficPermitted", "(Ljava/lang/String;)Z", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;", "Companion", "CustomTrustRootIndex", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n766#2:164\n857#2,2:165\n1#3:167\n*S KotlinDebug\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n*L\n52#1:164\n52#1:165,2\n*E\n"})
@SuppressSignatureCheck
public final class AndroidPlatform extends Platform {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "Lokhttp3/internal/platform/Platform;", "buildIfSupported", "()Lokhttp3/internal/platform/Platform;", "", "isSupported", "Z", "()Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final Platform buildIfSupported() {
            return this.isSupported() ? new AndroidPlatform() : null;
        }

        public final boolean isSupported() {
            return AndroidPlatform.e;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001A\u0004\u0018\u00010\b2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "Ljava/security/cert/X509Certificate;", "cert", "findByIssuerAndSignature", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", "copy", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class CustomTrustRootIndex implements TrustRootIndex {
        public final X509TrustManager a;
        public final Method b;

        public CustomTrustRootIndex(@NotNull X509TrustManager x509TrustManager0, @NotNull Method method0) {
            Intrinsics.checkNotNullParameter(x509TrustManager0, "trustManager");
            Intrinsics.checkNotNullParameter(method0, "findByIssuerAndSignatureMethod");
            super();
            this.a = x509TrustManager0;
            this.b = method0;
        }

        @NotNull
        public final CustomTrustRootIndex copy(@NotNull X509TrustManager x509TrustManager0, @NotNull Method method0) {
            Intrinsics.checkNotNullParameter(x509TrustManager0, "trustManager");
            Intrinsics.checkNotNullParameter(method0, "findByIssuerAndSignatureMethod");
            return new CustomTrustRootIndex(x509TrustManager0, method0);
        }

        public static CustomTrustRootIndex copy$default(CustomTrustRootIndex androidPlatform$CustomTrustRootIndex0, X509TrustManager x509TrustManager0, Method method0, int v, Object object0) {
            if((v & 1) != 0) {
                x509TrustManager0 = androidPlatform$CustomTrustRootIndex0.a;
            }
            if((v & 2) != 0) {
                method0 = androidPlatform$CustomTrustRootIndex0.b;
            }
            return androidPlatform$CustomTrustRootIndex0.copy(x509TrustManager0, method0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CustomTrustRootIndex)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((CustomTrustRootIndex)object0).a) ? Intrinsics.areEqual(this.b, ((CustomTrustRootIndex)object0).b) : false;
        }

        @Override  // okhttp3.internal.tls.TrustRootIndex
        @Nullable
        public X509Certificate findByIssuerAndSignature(@NotNull X509Certificate x509Certificate0) {
            X509Certificate x509Certificate1;
            Intrinsics.checkNotNullParameter(x509Certificate0, "cert");
            try {
                Object object0 = this.b.invoke(this.a, x509Certificate0);
                Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                x509Certificate1 = null;
                return ((TrustAnchor)object0).getTrustedCert();
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new AssertionError("unable to get issues and signature", illegalAccessException0);
            }
            catch(InvocationTargetException unused_ex) {
                return x509Certificate1;
            }
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
        }
    }

    @NotNull
    public static final Companion Companion;
    public final ArrayList c;
    public final CloseGuard d;
    public static final boolean e;

    static {
        AndroidPlatform.Companion = new Companion(null);
        AndroidPlatform.e = Platform.Companion.isAndroid() && Build.VERSION.SDK_INT < 30;
    }

    public AndroidPlatform() {
        Iterable iterable0 = CollectionsKt__CollectionsKt.listOfNotNull(new SocketAdapter[]{okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion.buildIfSupported$default(StandardAndroidSocketAdapter.Companion, null, 1, null), new DeferredSocketAdapter(AndroidSocketAdapter.Companion.getPlayProviderFactory()), new DeferredSocketAdapter(ConscryptSocketAdapter.Companion.getFactory()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.Companion.getFactory())});
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(((SocketAdapter)object0).isSupported()) {
                arrayList0.add(object0);
            }
        }
        this.c = arrayList0;
        this.d = CloseGuard.Companion.get();
    }

    @Override  // okhttp3.internal.platform.Platform
    @NotNull
    public CertificateChainCleaner buildCertificateChainCleaner(@NotNull X509TrustManager x509TrustManager0) {
        Intrinsics.checkNotNullParameter(x509TrustManager0, "trustManager");
        CertificateChainCleaner certificateChainCleaner0 = AndroidCertificateChainCleaner.Companion.buildIfSupported(x509TrustManager0);
        return certificateChainCleaner0 == null ? super.buildCertificateChainCleaner(x509TrustManager0) : certificateChainCleaner0;
    }

    @Override  // okhttp3.internal.platform.Platform
    @NotNull
    public TrustRootIndex buildTrustRootIndex(@NotNull X509TrustManager x509TrustManager0) {
        Intrinsics.checkNotNullParameter(x509TrustManager0, "trustManager");
        try {
            Method method0 = x509TrustManager0.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method0.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method0, "method");
            return new CustomTrustRootIndex(x509TrustManager0, method0);
        }
        catch(NoSuchMethodException unused_ex) {
            return super.buildTrustRootIndex(x509TrustManager0);
        }
    }

    @Override  // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket0, @Nullable String s, @NotNull List list0) {
        Object object0 = null;
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
        Intrinsics.checkNotNullParameter(list0, "protocols");
        for(Object object1: this.c) {
            if(((SocketAdapter)object1).matchesSocket(sSLSocket0)) {
                object0 = object1;
                break;
            }
        }
        if(((SocketAdapter)object0) != null) {
            ((SocketAdapter)object0).configureTlsExtensions(sSLSocket0, s, list0);
        }
    }

    @Override  // okhttp3.internal.platform.Platform
    public void connectSocket(@NotNull Socket socket0, @NotNull InetSocketAddress inetSocketAddress0, int v) throws IOException {
        Intrinsics.checkNotNullParameter(socket0, "socket");
        Intrinsics.checkNotNullParameter(inetSocketAddress0, "address");
        try {
            socket0.connect(inetSocketAddress0, v);
            return;
        }
        catch(ClassCastException classCastException0) {
            if(Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", classCastException0);
            }
            throw classCastException0;
        }
    }

    @Override  // okhttp3.internal.platform.Platform
    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sSLSocket0) {
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
        for(Object object0: this.c) {
            if(((SocketAdapter)object0).matchesSocket(sSLSocket0)) {
                return ((SocketAdapter)object0) == null ? null : ((SocketAdapter)object0).getSelectedProtocol(sSLSocket0);
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // okhttp3.internal.platform.Platform
    @Nullable
    public Object getStackTraceForCloseable(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "closer");
        return this.d.createAndOpen(s);
    }

    @Override  // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(s);
    }

    @Override  // okhttp3.internal.platform.Platform
    public void logCloseableLeak(@NotNull String s, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(s, "message");
        if(!this.d.warnIfOpen(object0)) {
            Platform.log$default(this, s, 5, null, 4, null);
        }
    }

    @Override  // okhttp3.internal.platform.Platform
    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sSLSocketFactory0) {
        Intrinsics.checkNotNullParameter(sSLSocketFactory0, "sslSocketFactory");
        for(Object object0: this.c) {
            if(((SocketAdapter)object0).matchesSocketFactory(sSLSocketFactory0)) {
                return ((SocketAdapter)object0) == null ? null : ((SocketAdapter)object0).trustManager(sSLSocketFactory0);
            }
            if(false) {
                break;
            }
        }
        return null;
    }
}

