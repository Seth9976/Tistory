package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sg.a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0002\u001A\u0019B7\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0013\u001A\u00020\u00122\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000FH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001A\u00020\u00122\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001A\u0004\u0018\u00010\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001B"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "Ljava/lang/reflect/Method;", "putMethod", "getMethod", "removeMethod", "Ljava/lang/Class;", "clientProviderClass", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "afterHandshake", "(Ljavax/net/ssl/SSLSocket;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Companion", "sg/a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Jdk8WithJettyBootPlatform extends Platform {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;", "", "Lokhttp3/internal/platform/Platform;", "buildIfSupported", "()Lokhttp3/internal/platform/Platform;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Nullable
        public final Platform buildIfSupported() {
            Class class0;
            try {
                class0 = SSLSocket.class;
                Intrinsics.checkNotNullExpressionValue("0.9", "jvmVersion");
                if(Integer.parseInt("0.9") >= 9) {
                    return null;
                }
            }
            catch(NumberFormatException unused_ex) {
            }
            try {
                Class class1 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class class2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class class3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class class4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method0 = class1.getMethod("put", class0, class2);
                Method method1 = class1.getMethod("get", class0);
                Method method2 = class1.getMethod("remove", class0);
                Intrinsics.checkNotNullExpressionValue(method0, "putMethod");
                Intrinsics.checkNotNullExpressionValue(method1, "getMethod");
                Intrinsics.checkNotNullExpressionValue(method2, "removeMethod");
                Intrinsics.checkNotNullExpressionValue(class3, "clientProviderClass");
                Intrinsics.checkNotNullExpressionValue(class4, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(method0, method1, method2, class3, class4);
            }
            catch(ClassNotFoundException | NoSuchMethodException unused_ex) {
                return null;
            }
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class f;
    public final Class g;

    static {
        Jdk8WithJettyBootPlatform.Companion = new Companion(null);
    }

    public Jdk8WithJettyBootPlatform(@NotNull Method method0, @NotNull Method method1, @NotNull Method method2, @NotNull Class class0, @NotNull Class class1) {
        Intrinsics.checkNotNullParameter(method0, "putMethod");
        Intrinsics.checkNotNullParameter(method1, "getMethod");
        Intrinsics.checkNotNullParameter(method2, "removeMethod");
        Intrinsics.checkNotNullParameter(class0, "clientProviderClass");
        Intrinsics.checkNotNullParameter(class1, "serverProviderClass");
        super();
        this.c = method0;
        this.d = method1;
        this.e = method2;
        this.f = class0;
        this.g = class1;
    }

    @Override  // okhttp3.internal.platform.Platform
    public void afterHandshake(@NotNull SSLSocket sSLSocket0) {
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
        try {
            this.e.invoke(null, sSLSocket0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError("failed to remove ALPN", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new AssertionError("failed to remove ALPN", invocationTargetException0);
        }
    }

    @Override  // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket0, @Nullable String s, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
        Intrinsics.checkNotNullParameter(list0, "protocols");
        List list1 = Platform.Companion.alpnProtocolNames(list0);
        try {
            a a0 = new a(list1);
            Object[] arr_object = {sSLSocket0, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f, this.g}, a0)};
            this.c.invoke(null, arr_object);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new AssertionError("failed to set ALPN", invocationTargetException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError("failed to set ALPN", illegalAccessException0);
        }
    }

    @Override  // okhttp3.internal.platform.Platform
    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket sSLSocket0) {
        Intrinsics.checkNotNullParameter(sSLSocket0, "sslSocket");
        try {
            InvocationHandler invocationHandler0 = Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket0));
            Intrinsics.checkNotNull(invocationHandler0, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            boolean z = ((a)invocationHandler0).b;
            if(!z && ((a)invocationHandler0).c == null) {
                Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            return z ? null : ((a)invocationHandler0).c;
        }
        catch(InvocationTargetException invocationTargetException0) {
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new AssertionError("failed to get ALPN selected protocol", illegalAccessException0);
        }
        throw new AssertionError("failed to get ALPN selected protocol", invocationTargetException0);
    }
}

