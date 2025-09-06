package okhttp3.internal.authenticator;

import java.io.IOException;
import java.net.Authenticator.RequestorType;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy.Type;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000B\u001A\u0004\u0018\u00010\n2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "Lokhttp3/Dns;", "defaultDns", "<init>", "(Lokhttp3/Dns;)V", "Lokhttp3/Route;", "route", "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "authenticate", "(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class JavaNetAuthenticator implements Authenticator {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Proxy.Type.values().length];
            try {
                arr_v[Proxy.Type.DIRECT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final Dns a;

    public JavaNetAuthenticator() {
        this(null, 1, null);
    }

    public JavaNetAuthenticator(@NotNull Dns dns0) {
        Intrinsics.checkNotNullParameter(dns0, "defaultDns");
        super();
        this.a = dns0;
    }

    public JavaNetAuthenticator(Dns dns0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            dns0 = Dns.SYSTEM;
        }
        this(dns0);
    }

    public static InetAddress a(Proxy proxy0, HttpUrl httpUrl0, Dns dns0) {
        Proxy.Type proxy$Type0 = proxy0.type();
        if((proxy$Type0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[proxy$Type0.ordinal()]) == 1) {
            return (InetAddress)CollectionsKt___CollectionsKt.first(dns0.lookup(httpUrl0.host()));
        }
        SocketAddress socketAddress0 = proxy0.address();
        Intrinsics.checkNotNull(socketAddress0, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress inetAddress0 = ((InetSocketAddress)socketAddress0).getAddress();
        Intrinsics.checkNotNullExpressionValue(inetAddress0, "address() as InetSocketAddress).address");
        return inetAddress0;
    }

    @Override  // okhttp3.Authenticator
    @Nullable
    public Request authenticate(@Nullable Route route0, @NotNull Response response0) throws IOException {
        PasswordAuthentication passwordAuthentication0;
        Dns dns1;
        Proxy proxy0;
        Intrinsics.checkNotNullParameter(response0, "response");
        List list0 = response0.challenges();
        Request request0 = response0.request();
        HttpUrl httpUrl0 = request0.url();
        boolean z = response0.code() == 407;
        if(route0 == null) {
            proxy0 = Proxy.NO_PROXY;
        }
        else {
            proxy0 = route0.proxy();
            if(proxy0 == null) {
                proxy0 = Proxy.NO_PROXY;
            }
        }
        for(Object object0: list0) {
            Challenge challenge0 = (Challenge)object0;
            if(p.equals("Basic", challenge0.scheme(), true)) {
                if(route0 == null) {
                    dns1 = this.a;
                }
                else {
                    Address address0 = route0.address();
                    if(address0 != null) {
                        Dns dns0 = address0.dns();
                        if(dns0 != null) {
                            dns1 = dns0;
                        }
                    }
                }
                if(z) {
                    SocketAddress socketAddress0 = proxy0.address();
                    Intrinsics.checkNotNull(socketAddress0, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    String s = ((InetSocketAddress)socketAddress0).getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy0, "proxy");
                    passwordAuthentication0 = java.net.Authenticator.requestPasswordAuthentication(s, JavaNetAuthenticator.a(proxy0, httpUrl0, dns1), ((InetSocketAddress)socketAddress0).getPort(), httpUrl0.scheme(), challenge0.realm(), challenge0.scheme(), httpUrl0.url(), Authenticator.RequestorType.PROXY);
                }
                else {
                    Intrinsics.checkNotNullExpressionValue(proxy0, "proxy");
                    passwordAuthentication0 = java.net.Authenticator.requestPasswordAuthentication(httpUrl0.host(), JavaNetAuthenticator.a(proxy0, httpUrl0, dns1), httpUrl0.port(), httpUrl0.scheme(), challenge0.realm(), challenge0.scheme(), httpUrl0.url(), Authenticator.RequestorType.SERVER);
                }
                if(passwordAuthentication0 != null) {
                    String s1 = passwordAuthentication0.getUserName();
                    Intrinsics.checkNotNullExpressionValue(s1, "auth.userName");
                    char[] arr_c = passwordAuthentication0.getPassword();
                    Intrinsics.checkNotNullExpressionValue(arr_c, "auth.password");
                    String s2 = Credentials.basic(s1, new String(arr_c), challenge0.charset());
                    return request0.newBuilder().header((z ? "Proxy-Authorization" : "Authorization"), s2).build();
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }
}

