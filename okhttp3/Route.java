package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy.Type;
import java.net.Proxy;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0014\u001A\u00020\u00102\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0003\u001A\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u0003\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b\u0005\u0010\rR\u0017\u0010\u0007\u001A\u00020\u00068\u0007¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\u0007\u0010\u000F¨\u0006\""}, d2 = {"Lokhttp3/Route;", "", "Lokhttp3/Address;", "address", "Ljava/net/Proxy;", "proxy", "Ljava/net/InetSocketAddress;", "socketAddress", "<init>", "(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "-deprecated_address", "()Lokhttp3/Address;", "-deprecated_proxy", "()Ljava/net/Proxy;", "-deprecated_socketAddress", "()Ljava/net/InetSocketAddress;", "", "requiresTunnel", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lokhttp3/Address;", "b", "Ljava/net/Proxy;", "c", "Ljava/net/InetSocketAddress;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Route {
    public final Address a;
    public final Proxy b;
    public final InetSocketAddress c;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "address", imports = {}))
    @JvmName(name = "-deprecated_address")
    @NotNull
    public final Address -deprecated_address() {
        return this.a;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @JvmName(name = "-deprecated_proxy")
    @NotNull
    public final Proxy -deprecated_proxy() {
        return this.b;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "socketAddress", imports = {}))
    @JvmName(name = "-deprecated_socketAddress")
    @NotNull
    public final InetSocketAddress -deprecated_socketAddress() {
        return this.c;
    }

    public Route(@NotNull Address address0, @NotNull Proxy proxy0, @NotNull InetSocketAddress inetSocketAddress0) {
        Intrinsics.checkNotNullParameter(address0, "address");
        Intrinsics.checkNotNullParameter(proxy0, "proxy");
        Intrinsics.checkNotNullParameter(inetSocketAddress0, "socketAddress");
        super();
        this.a = address0;
        this.b = proxy0;
        this.c = inetSocketAddress0;
    }

    @JvmName(name = "address")
    @NotNull
    public final Address address() {
        return this.a;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof Route && Intrinsics.areEqual(((Route)object0).a, this.a) && Intrinsics.areEqual(((Route)object0).b, this.b) && Intrinsics.areEqual(((Route)object0).c, this.c);
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + (this.a.hashCode() + 0x20F) * 0x1F) * 0x1F;
    }

    @JvmName(name = "proxy")
    @NotNull
    public final Proxy proxy() {
        return this.b;
    }

    public final boolean requiresTunnel() {
        return this.a.sslSocketFactory() != null && this.b.type() == Proxy.Type.HTTP;
    }

    @JvmName(name = "socketAddress")
    @NotNull
    public final InetSocketAddress socketAddress() {
        return this.c;
    }

    @Override
    @NotNull
    public String toString() {
        return "Route{" + this.c + '}';
    }
}

