package okhttp3.internal.proxy;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\r\u001A\u00020\f2\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\u0010\t\u001A\u0004\u0018\u00010\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lokhttp3/internal/proxy/NullProxySelector;", "Ljava/net/ProxySelector;", "Ljava/net/URI;", "uri", "", "Ljava/net/Proxy;", "select", "(Ljava/net/URI;)Ljava/util/List;", "Ljava/net/SocketAddress;", "sa", "Ljava/io/IOException;", "ioe", "", "connectFailed", "(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNullProxySelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NullProxySelector.kt\nokhttp3/internal/proxy/NullProxySelector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class NullProxySelector extends ProxySelector {
    @NotNull
    public static final NullProxySelector INSTANCE;

    static {
        NullProxySelector.INSTANCE = new NullProxySelector();  // 初始化器: Ljava/net/ProxySelector;-><init>()V
    }

    @Override
    public void connectFailed(@Nullable URI uRI0, @Nullable SocketAddress socketAddress0, @Nullable IOException iOException0) {
    }

    @Override
    @NotNull
    public List select(@Nullable URI uRI0) {
        if(uRI0 == null) {
            throw new IllegalArgumentException("uri must not be null");
        }
        return k.listOf(Proxy.NO_PROXY);
    }
}

