package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy.Type;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "Lokhttp3/Address;", "address", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/Call;", "call", "Lokhttp3/EventListener;", "eventListener", "<init>", "(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/Call;Lokhttp3/EventListener;)V", "", "hasNext", "()Z", "Lokhttp3/internal/connection/RouteSelector$Selection;", "next", "()Lokhttp3/internal/connection/RouteSelector$Selection;", "Companion", "Selection", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RouteSelector {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0015\u0010\u0006\u001A\u00020\u0003*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "Ljava/net/InetSocketAddress;", "", "getSocketHost", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final String getSocketHost(@NotNull InetSocketAddress inetSocketAddress0) {
            Intrinsics.checkNotNullParameter(inetSocketAddress0, "<this>");
            InetAddress inetAddress0 = inetSocketAddress0.getAddress();
            if(inetAddress0 == null) {
                String s = inetSocketAddress0.getHostName();
                Intrinsics.checkNotNullExpressionValue(s, "hostName");
                return s;
            }
            String s1 = inetAddress0.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(s1, "address.hostAddress");
            return s1;
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001A\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000BR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "", "Lokhttp3/Route;", "routes", "<init>", "(Ljava/util/List;)V", "", "hasNext", "()Z", "next", "()Lokhttp3/Route;", "a", "Ljava/util/List;", "getRoutes", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Selection {
        public final List a;
        public int b;

        public Selection(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "routes");
            super();
            this.a = list0;
        }

        @NotNull
        public final List getRoutes() {
            return this.a;
        }

        public final boolean hasNext() {
            return this.b < this.a.size();
        }

        @NotNull
        public final Route next() {
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int v = this.b;
            this.b = v + 1;
            return (Route)this.a.get(v);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Address a;
    public final RouteDatabase b;
    public final Call c;
    public final EventListener d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h;

    static {
        RouteSelector.Companion = new Companion(null);
    }

    public RouteSelector(@NotNull Address address0, @NotNull RouteDatabase routeDatabase0, @NotNull Call call0, @NotNull EventListener eventListener0) {
        Intrinsics.checkNotNullParameter(address0, "address");
        List list0;
        Intrinsics.checkNotNullParameter(routeDatabase0, "routeDatabase");
        Intrinsics.checkNotNullParameter(call0, "call");
        Intrinsics.checkNotNullParameter(eventListener0, "eventListener");
        super();
        this.a = address0;
        this.b = routeDatabase0;
        this.c = call0;
        this.d = eventListener0;
        this.e = CollectionsKt__CollectionsKt.emptyList();
        this.g = CollectionsKt__CollectionsKt.emptyList();
        this.h = new ArrayList();
        HttpUrl httpUrl0 = address0.url();
        Proxy proxy0 = address0.proxy();
        eventListener0.proxySelectStart(call0, httpUrl0);
        if(proxy0 == null) {
            URI uRI0 = httpUrl0.uri();
            if(uRI0.getHost() == null) {
                list0 = Util.immutableListOf(new Proxy[]{Proxy.NO_PROXY});
            }
            else {
                List list1 = address0.proxySelector().select(uRI0);
                if(list1 == null || list1.isEmpty()) {
                    list0 = Util.immutableListOf(new Proxy[]{Proxy.NO_PROXY});
                }
                else {
                    Intrinsics.checkNotNullExpressionValue(list1, "proxiesOrNull");
                    list0 = Util.toImmutableList(list1);
                }
            }
        }
        else {
            list0 = k.listOf(proxy0);
        }
        this.e = list0;
        this.f = 0;
        eventListener0.proxySelectEnd(call0, httpUrl0, list0);
    }

    // 去混淆评级： 低(20)
    public final boolean hasNext() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }

    @NotNull
    public final Selection next() throws IOException {
        List list0;
        int v1;
        String s;
        ArrayList arrayList1;
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList0 = new ArrayList();
        do {
            boolean z = false;
            arrayList1 = this.h;
            if(this.f >= this.e.size()) {
                break;
            }
            if(this.f < this.e.size()) {
                z = true;
            }
            Address address0 = this.a;
            if(!z) {
                throw new SocketException("No route to " + address0.url().host() + "; exhausted proxy configurations: " + this.e);
            }
            int v = this.f;
            this.f = v + 1;
            Proxy proxy0 = (Proxy)this.e.get(v);
            ArrayList arrayList2 = new ArrayList();
            this.g = arrayList2;
            if(proxy0.type() == Proxy.Type.DIRECT || proxy0.type() == Proxy.Type.SOCKS) {
                s = address0.url().host();
                v1 = address0.url().port();
            }
            else {
                SocketAddress socketAddress0 = proxy0.address();
                if(!(socketAddress0 instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddress0.getClass()).toString());
                }
                Intrinsics.checkNotNullExpressionValue(socketAddress0, "proxyAddress");
                s = RouteSelector.Companion.getSocketHost(((InetSocketAddress)socketAddress0));
                v1 = ((InetSocketAddress)socketAddress0).getPort();
            }
            if(1 > v1 || v1 >= 0x10000) {
                throw new SocketException("No route to " + s + ':' + v1 + "; port is out of range");
            }
            if(proxy0.type() == Proxy.Type.SOCKS) {
                arrayList2.add(InetSocketAddress.createUnresolved(s, v1));
            }
            else {
                if(Util.canParseAsIpAddress(s)) {
                    list0 = k.listOf(InetAddress.getByName(s));
                }
                else {
                    EventListener eventListener0 = this.d;
                    Call call0 = this.c;
                    eventListener0.dnsStart(call0, s);
                    List list1 = address0.dns().lookup(s);
                    if(list1.isEmpty()) {
                        throw new UnknownHostException(address0.dns() + " returned no addresses for " + s);
                    }
                    eventListener0.dnsEnd(call0, s, list1);
                    list0 = list1;
                }
                for(Object object0: list0) {
                    arrayList2.add(new InetSocketAddress(((InetAddress)object0), v1));
                }
            }
            for(Object object1: this.g) {
                Route route0 = new Route(address0, proxy0, ((InetSocketAddress)object1));
                if(this.b.shouldPostpone(route0)) {
                    arrayList1.add(route0);
                }
                else {
                    arrayList0.add(route0);
                }
            }
        }
        while(arrayList0.isEmpty());
        if(arrayList0.isEmpty()) {
            o.addAll(arrayList0, arrayList1);
            arrayList1.clear();
        }
        return new Selection(arrayList0);
    }
}

