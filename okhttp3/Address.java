package okhttp3;

import a5.b;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000B\n\u0002\b \u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\u001A\u001A\u00020\u0019\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010 \u001A\u00020\u001DH\u0007\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010\u0007\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b!\u0010\"J\u000F\u0010\t\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b#\u0010$J\u000F\u0010\u0011\u001A\u00020\u0010H\u0007\u00A2\u0006\u0004\b%\u0010&J\u0015\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007\u00A2\u0006\u0004\b\'\u0010(J\u0015\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0007\u00A2\u0006\u0004\b)\u0010(J\u000F\u0010\u001A\u001A\u00020\u0019H\u0007\u00A2\u0006\u0004\b*\u0010+J\u0011\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0007\u00A2\u0006\u0004\b,\u0010-J\u0011\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0007\u00A2\u0006\u0004\b.\u0010/J\u0011\u0010\r\u001A\u0004\u0018\u00010\fH\u0007\u00A2\u0006\u0004\b0\u00101J\u0011\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0007\u00A2\u0006\u0004\b2\u00103J\u001A\u00106\u001A\u0002052\b\u00104\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b6\u00107J\u000F\u00108\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b8\u00109J\u0017\u0010=\u001A\u0002052\u0006\u0010:\u001A\u00020\u0000H\u0000\u00A2\u0006\u0004\b;\u0010<J\u000F\u0010>\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b>\u0010?R\u0017\u0010\u0007\u001A\u00020\u00068\u0007\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\b\u0007\u0010\"R\u0017\u0010\t\u001A\u00020\b8\u0007\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\b\t\u0010$R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0007\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\b\u000B\u0010/R\u0019\u0010\r\u001A\u0004\u0018\u00010\f8\u0007\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\b\r\u00101R\u0019\u0010\u000F\u001A\u0004\u0018\u00010\u000E8\u0007\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\b\u000F\u00103R\u0017\u0010\u0011\u001A\u00020\u00108\u0007\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\b\u0011\u0010&R\u0019\u0010\u0013\u001A\u0004\u0018\u00010\u00128\u0007\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\b\u0013\u0010-R\u0017\u0010\u001A\u001A\u00020\u00198\u0007\u00A2\u0006\f\n\u0004\bN\u0010O\u001A\u0004\b\u001A\u0010+R\u0017\u0010 \u001A\u00020\u001D8G\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\b \u0010\u001FR\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u00148G\u00A2\u0006\f\n\u0004\bR\u0010S\u001A\u0004\b\u0016\u0010(R\u001D\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00170\u00148G\u00A2\u0006\f\n\u0004\bT\u0010S\u001A\u0004\b\u0018\u0010(\u00A8\u0006U"}, d2 = {"Lokhttp3/Address;", "", "", "uriHost", "", "uriPort", "Lokhttp3/Dns;", "dns", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "certificatePinner", "Lokhttp3/Authenticator;", "proxyAuthenticator", "Ljava/net/Proxy;", "proxy", "", "Lokhttp3/Protocol;", "protocols", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "Ljava/net/ProxySelector;", "proxySelector", "<init>", "(Ljava/lang/String;ILokhttp3/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/Authenticator;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "Lokhttp3/HttpUrl;", "-deprecated_url", "()Lokhttp3/HttpUrl;", "url", "-deprecated_dns", "()Lokhttp3/Dns;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "-deprecated_proxyAuthenticator", "()Lokhttp3/Authenticator;", "-deprecated_protocols", "()Ljava/util/List;", "-deprecated_connectionSpecs", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "-deprecated_proxy", "()Ljava/net/Proxy;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "that", "equalsNonHost$okhttp", "(Lokhttp3/Address;)Z", "equalsNonHost", "toString", "()Ljava/lang/String;", "a", "Lokhttp3/Dns;", "b", "Ljavax/net/SocketFactory;", "c", "Ljavax/net/ssl/SSLSocketFactory;", "d", "Ljavax/net/ssl/HostnameVerifier;", "e", "Lokhttp3/CertificatePinner;", "f", "Lokhttp3/Authenticator;", "g", "Ljava/net/Proxy;", "h", "Ljava/net/ProxySelector;", "i", "Lokhttp3/HttpUrl;", "j", "Ljava/util/List;", "k", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Address {
    public final Dns a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final CertificatePinner e;
    public final Authenticator f;
    public final Proxy g;
    public final ProxySelector h;
    public final HttpUrl i;
    public final List j;
    public final List k;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "certificatePinner", imports = {}))
    @JvmName(name = "-deprecated_certificatePinner")
    @Nullable
    public final CertificatePinner -deprecated_certificatePinner() {
        return this.e;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "connectionSpecs", imports = {}))
    @JvmName(name = "-deprecated_connectionSpecs")
    @NotNull
    public final List -deprecated_connectionSpecs() {
        return this.k;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "dns", imports = {}))
    @JvmName(name = "-deprecated_dns")
    @NotNull
    public final Dns -deprecated_dns() {
        return this.a;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hostnameVerifier", imports = {}))
    @JvmName(name = "-deprecated_hostnameVerifier")
    @Nullable
    public final HostnameVerifier -deprecated_hostnameVerifier() {
        return this.d;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "protocols", imports = {}))
    @JvmName(name = "-deprecated_protocols")
    @NotNull
    public final List -deprecated_protocols() {
        return this.j;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @JvmName(name = "-deprecated_proxy")
    @Nullable
    public final Proxy -deprecated_proxy() {
        return this.g;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxyAuthenticator", imports = {}))
    @JvmName(name = "-deprecated_proxyAuthenticator")
    @NotNull
    public final Authenticator -deprecated_proxyAuthenticator() {
        return this.f;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxySelector", imports = {}))
    @JvmName(name = "-deprecated_proxySelector")
    @NotNull
    public final ProxySelector -deprecated_proxySelector() {
        return this.h;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "socketFactory", imports = {}))
    @JvmName(name = "-deprecated_socketFactory")
    @NotNull
    public final SocketFactory -deprecated_socketFactory() {
        return this.b;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sslSocketFactory", imports = {}))
    @JvmName(name = "-deprecated_sslSocketFactory")
    @Nullable
    public final SSLSocketFactory -deprecated_sslSocketFactory() {
        return this.c;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    @JvmName(name = "-deprecated_url")
    @NotNull
    public final HttpUrl -deprecated_url() {
        return this.i;
    }

    public Address(@NotNull String s, int v, @NotNull Dns dns0, @NotNull SocketFactory socketFactory0, @Nullable SSLSocketFactory sSLSocketFactory0, @Nullable HostnameVerifier hostnameVerifier0, @Nullable CertificatePinner certificatePinner0, @NotNull Authenticator authenticator0, @Nullable Proxy proxy0, @NotNull List list0, @NotNull List list1, @NotNull ProxySelector proxySelector0) {
        Intrinsics.checkNotNullParameter(s, "uriHost");
        Intrinsics.checkNotNullParameter(dns0, "dns");
        Intrinsics.checkNotNullParameter(socketFactory0, "socketFactory");
        Intrinsics.checkNotNullParameter(authenticator0, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(list0, "protocols");
        Intrinsics.checkNotNullParameter(list1, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector0, "proxySelector");
        super();
        this.a = dns0;
        this.b = socketFactory0;
        this.c = sSLSocketFactory0;
        this.d = hostnameVerifier0;
        this.e = certificatePinner0;
        this.f = authenticator0;
        this.g = proxy0;
        this.h = proxySelector0;
        this.i = new Builder().scheme((sSLSocketFactory0 == null ? "http" : "https")).host(s).port(v).build();
        this.j = Util.toImmutableList(list0);
        this.k = Util.toImmutableList(list1);
    }

    @JvmName(name = "certificatePinner")
    @Nullable
    public final CertificatePinner certificatePinner() {
        return this.e;
    }

    @JvmName(name = "connectionSpecs")
    @NotNull
    public final List connectionSpecs() {
        return this.k;
    }

    @JvmName(name = "dns")
    @NotNull
    public final Dns dns() {
        return this.a;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof Address && Intrinsics.areEqual(this.i, ((Address)object0).i) && this.equalsNonHost$okhttp(((Address)object0));
    }

    // 去混淆评级： 低(45)
    public final boolean equalsNonHost$okhttp(@NotNull Address address0) {
        Intrinsics.checkNotNullParameter(address0, "that");
        return Intrinsics.areEqual(this.a, address0.a) && Intrinsics.areEqual(this.f, address0.f) && Intrinsics.areEqual(this.j, address0.j) && Intrinsics.areEqual(this.k, address0.k) && Intrinsics.areEqual(this.h, address0.h) && Intrinsics.areEqual(this.g, address0.g) && Intrinsics.areEqual(this.c, address0.c) && Intrinsics.areEqual(this.d, address0.d) && Intrinsics.areEqual(this.e, address0.e) && this.i.port() == address0.i.port();
    }

    @Override
    public int hashCode() {
        int v = Objects.hashCode(this.g);
        int v1 = Objects.hashCode(this.c);
        int v2 = Objects.hashCode(this.d);
        return Objects.hashCode(this.e) + (v2 + (v1 + (v + (this.h.hashCode() + b.c(this.k, b.c(this.j, (this.f.hashCode() + (this.a.hashCode() + (this.i.hashCode() + 0x20F) * 0x1F) * 0x1F) * 0x1F, 0x1F), 0x1F)) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }

    @JvmName(name = "hostnameVerifier")
    @Nullable
    public final HostnameVerifier hostnameVerifier() {
        return this.d;
    }

    @JvmName(name = "protocols")
    @NotNull
    public final List protocols() {
        return this.j;
    }

    @JvmName(name = "proxy")
    @Nullable
    public final Proxy proxy() {
        return this.g;
    }

    @JvmName(name = "proxyAuthenticator")
    @NotNull
    public final Authenticator proxyAuthenticator() {
        return this.f;
    }

    @JvmName(name = "proxySelector")
    @NotNull
    public final ProxySelector proxySelector() {
        return this.h;
    }

    @JvmName(name = "socketFactory")
    @NotNull
    public final SocketFactory socketFactory() {
        return this.b;
    }

    @JvmName(name = "sslSocketFactory")
    @Nullable
    public final SSLSocketFactory sslSocketFactory() {
        return this.c;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Address{");
        stringBuilder0.append(this.i.host());
        stringBuilder0.append(':');
        stringBuilder0.append(this.i.port());
        stringBuilder0.append(", ");
        return this.g == null ? a.b('}', "proxySelector=" + this.h, stringBuilder0) : a.b('}', "proxy=" + this.g, stringBuilder0);
    }

    @JvmName(name = "url")
    @NotNull
    public final HttpUrl url() {
        return this.i;
    }
}

