package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001A\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001A\u00020\u000BH\u0017¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Landroid/net/http/X509TrustManagerExtensions;", "x509TrustManagerExtensions", "<init>", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "clean", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidCertificateChainCleaner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n37#2,2:75\n1#3:77\n*S KotlinDebug\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n*L\n43#1:75,2\n*E\n"})
@SuppressSignatureCheck
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner$Companion;", "", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "buildIfSupported", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @SuppressSignatureCheck
        @Nullable
        public final AndroidCertificateChainCleaner buildIfSupported(@NotNull X509TrustManager x509TrustManager0) {
            X509TrustManagerExtensions x509TrustManagerExtensions0;
            Intrinsics.checkNotNullParameter(x509TrustManager0, "trustManager");
            try {
                x509TrustManagerExtensions0 = null;
                x509TrustManagerExtensions0 = new X509TrustManagerExtensions(x509TrustManager0);
            }
            catch(IllegalArgumentException unused_ex) {
            }
            return x509TrustManagerExtensions0 == null ? null : new AndroidCertificateChainCleaner(x509TrustManager0, x509TrustManagerExtensions0);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final X509TrustManager a;
    public final X509TrustManagerExtensions b;

    static {
        AndroidCertificateChainCleaner.Companion = new Companion(null);
    }

    public AndroidCertificateChainCleaner(@NotNull X509TrustManager x509TrustManager0, @NotNull X509TrustManagerExtensions x509TrustManagerExtensions0) {
        Intrinsics.checkNotNullParameter(x509TrustManager0, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions0, "x509TrustManagerExtensions");
        super();
        this.a = x509TrustManager0;
        this.b = x509TrustManagerExtensions0;
    }

    @Override  // okhttp3.internal.tls.CertificateChainCleaner
    @SuppressSignatureCheck
    @NotNull
    public List clean(@NotNull List list0, @NotNull String s) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(list0, "chain");
        Intrinsics.checkNotNullParameter(s, "hostname");
        X509Certificate[] arr_x509Certificate = (X509Certificate[])list0.toArray(new X509Certificate[0]);
        try {
            List list1 = this.b.checkServerTrusted(arr_x509Certificate, "RSA", s);
            Intrinsics.checkNotNullExpressionValue(list1, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return list1;
        }
        catch(CertificateException certificateException0) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException0 = new SSLPeerUnverifiedException(certificateException0.getMessage());
            sSLPeerUnverifiedException0.initCause(certificateException0);
            throw sSLPeerUnverifiedException0;
        }
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof AndroidCertificateChainCleaner && ((AndroidCertificateChainCleaner)object0).a == this.a;
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this.a);
    }
}

