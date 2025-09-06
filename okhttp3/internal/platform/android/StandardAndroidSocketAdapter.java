package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B3\u0012\u000E\u0010\u0004\u001A\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002\u0012\u000E\u0010\u0006\u001A\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0002\u0012\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\n\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/platform/android/StandardAndroidSocketAdapter;", "Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryClass", "paramClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "sslSocketFactory", "", "matchesSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)Z", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/platform/android/StandardAndroidSocketAdapter$Companion;", "", "", "packageName", "Lokhttp3/internal/platform/android/SocketAdapter;", "buildIfSupported", "(Ljava/lang/String;)Lokhttp3/internal/platform/android/SocketAdapter;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final SocketAdapter buildIfSupported(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "packageName");
            try {
                Class class0 = Class.forName((s + ".OpenSSLSocketImpl"));
                Intrinsics.checkNotNull(class0, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class class1 = Class.forName((s + ".OpenSSLSocketFactoryImpl"));
                Intrinsics.checkNotNull(class1, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class class2 = Class.forName((s + ".SSLParametersImpl"));
                Intrinsics.checkNotNullExpressionValue(class2, "paramsClass");
                return new StandardAndroidSocketAdapter(class0, class1, class2);
            }
            catch(Exception exception0) {
                Platform.Companion.get().log("unable to load android socket classes", 5, exception0);
                return null;
            }
        }

        public static SocketAdapter buildIfSupported$default(Companion standardAndroidSocketAdapter$Companion0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = "com.android.org.conscrypt";
            }
            return standardAndroidSocketAdapter$Companion0.buildIfSupported(s);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Class g;
    public final Class h;

    static {
        StandardAndroidSocketAdapter.Companion = new Companion(null);
    }

    public StandardAndroidSocketAdapter(@NotNull Class class0, @NotNull Class class1, @NotNull Class class2) {
        Intrinsics.checkNotNullParameter(class0, "sslSocketClass");
        Intrinsics.checkNotNullParameter(class1, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(class2, "paramClass");
        super(class0);
        this.g = class1;
        this.h = class2;
    }

    @Override  // okhttp3.internal.platform.android.AndroidSocketAdapter
    public boolean matchesSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory0) {
        Intrinsics.checkNotNullParameter(sSLSocketFactory0, "sslSocketFactory");
        return this.g.isInstance(sSLSocketFactory0);
    }

    @Override  // okhttp3.internal.platform.android.AndroidSocketAdapter
    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sSLSocketFactory0) {
        Intrinsics.checkNotNullParameter(sSLSocketFactory0, "sslSocketFactory");
        Object object0 = Util.readFieldOrNull(sSLSocketFactory0, this.h, "sslParameters");
        Intrinsics.checkNotNull(object0);
        X509TrustManager x509TrustManager0 = (X509TrustManager)Util.readFieldOrNull(object0, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager0 == null ? ((X509TrustManager)Util.readFieldOrNull(object0, X509TrustManager.class, "trustManager")) : x509TrustManager0;
    }
}

