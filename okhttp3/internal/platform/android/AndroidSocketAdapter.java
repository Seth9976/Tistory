package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.p;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u000E\u0010\u0004\u001A\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u000B\u0010\fJ/\u0010\u0013\u001A\u00020\u00122\u0006\u0010\n\u001A\u00020\u00032\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000FH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001A\u0004\u0018\u00010\r2\u0006\u0010\n\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", "", "isSupported", "()Z", "sslSocket", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class AndroidSocketAdapter implements SocketAdapter {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", "", "", "packageName", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "factory", "(Ljava/lang/String;)Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "playProviderFactory", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "getPlayProviderFactory", "()Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final AndroidSocketAdapter access$build(Companion androidSocketAdapter$Companion0, Class class0) {
            androidSocketAdapter$Companion0.getClass();
            Class class1 = class0;
            while(class1 != null && !Intrinsics.areEqual(class1.getSimpleName(), "OpenSSLSocketImpl")) {
                class1 = class1.getSuperclass();
                if(class1 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + class0);
                }
                if(false) {
                    break;
                }
            }
            Intrinsics.checkNotNull(class1);
            return new AndroidSocketAdapter(class1);
        }

        @NotNull
        public final Factory factory(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "packageName");
            return new Factory() {
                public final String a;

                {
                    this.a = s;
                }

                @Override  // okhttp3.internal.platform.android.DeferredSocketAdapter$Factory
                @NotNull
                public SocketAdapter create(@NotNull SSLSocket sSLSocket0) {
                    Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
                    Class class0 = sSLSocket0.getClass();
                    return Companion.access$build(AndroidSocketAdapter.Companion, class0);
                }

                @Override  // okhttp3.internal.platform.android.DeferredSocketAdapter$Factory
                public boolean matchesSocket(@NotNull SSLSocket sSLSocket0) {
                    Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
                    String s = sSLSocket0.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(s, "sslSocket.javaClass.name");
                    StringBuilder stringBuilder0 = new StringBuilder();
                    return p.startsWith$default(s, a.b('.', this.a, stringBuilder0), false, 2, null);
                }
            };
        }

        @NotNull
        public final Factory getPlayProviderFactory() {
            return AndroidSocketAdapter.f;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;
    public static final Factory f;

    static {
        Companion androidSocketAdapter$Companion0 = new Companion(null);
        AndroidSocketAdapter.Companion = androidSocketAdapter$Companion0;
        AndroidSocketAdapter.f = androidSocketAdapter$Companion0.factory("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "sslSocketClass");
        super();
        this.a = class0;
        Method method0 = class0.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(method0, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.b = method0;
        this.c = class0.getMethod("setHostname", String.class);
        this.d = class0.getMethod("getAlpnSelectedProtocol", null);
        this.e = class0.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket0, @Nullable String s, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
        Intrinsics.checkNotNullParameter(list0, "protocols");
        if(this.matchesSocket(sSLSocket0)) {
            try {
                this.b.invoke(sSLSocket0, Boolean.TRUE);
                if(s != null) {
                    this.c.invoke(sSLSocket0, s);
                }
                Object[] arr_object = {Platform.Companion.concatLengthPrefixed(list0)};
                this.e.invoke(sSLSocket0, arr_object);
                return;
            }
            catch(IllegalAccessException illegalAccessException0) {
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new AssertionError(invocationTargetException0);
            }
            throw new AssertionError(illegalAccessException0);
        }
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sSLSocket0) {
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
        if(!this.matchesSocket(sSLSocket0)) {
            return null;
        }
        try {
            byte[] arr_b = (byte[])this.d.invoke(sSLSocket0, null);
            return arr_b == null ? null : new String(arr_b, Charsets.UTF_8);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError(illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if(!(throwable0 instanceof NullPointerException) || !Intrinsics.areEqual(((NullPointerException)throwable0).getMessage(), "ssl == null")) {
                throw new AssertionError(invocationTargetException0);
            }
            return null;
        }
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return AndroidPlatform.Companion.isSupported();
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(@NotNull SSLSocket sSLSocket0) {
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
        return this.a.isInstance(sSLSocket0);
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(@NotNull SSLSocketFactory sSLSocketFactory0) {
        return DefaultImpls.matchesSocketFactory(this, sSLSocketFactory0);
    }

    @Override  // okhttp3.internal.platform.android.SocketAdapter
    @Nullable
    public X509TrustManager trustManager(@NotNull SSLSocketFactory sSLSocketFactory0) {
        return DefaultImpls.trustManager(this, sSLSocketFactory0);
    }
}

