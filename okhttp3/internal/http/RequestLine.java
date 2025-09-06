package okhttp3.internal.http;

import java.net.Proxy.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/http/RequestLine;", "", "Lokhttp3/Request;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "get", "(Lokhttp3/Request;Ljava/net/Proxy$Type;)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "url", "requestPath", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RequestLine {
    @NotNull
    public static final RequestLine INSTANCE;

    static {
        RequestLine.INSTANCE = new RequestLine();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final String get(@NotNull Request request0, @NotNull Proxy.Type proxy$Type0) {
        Intrinsics.checkNotNullParameter(request0, "request");
        Intrinsics.checkNotNullParameter(proxy$Type0, "proxyType");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(request0.method());
        stringBuilder0.append(' ');
        RequestLine requestLine0 = RequestLine.INSTANCE;
        requestLine0.getClass();
        if(request0.isHttps() || proxy$Type0 != Proxy.Type.HTTP) {
            stringBuilder0.append(requestLine0.requestPath(request0.url()));
        }
        else {
            stringBuilder0.append(request0.url());
        }
        stringBuilder0.append(" HTTP/1.1");
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @NotNull
    public final String requestPath(@NotNull HttpUrl httpUrl0) {
        Intrinsics.checkNotNullParameter(httpUrl0, "url");
        String s = httpUrl0.encodedPath();
        String s1 = httpUrl0.encodedQuery();
        return s1 == null ? s : s + '?' + s1;
    }
}

