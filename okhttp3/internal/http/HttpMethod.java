package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\n\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000B"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "", "method", "", "requiresRequestBody", "(Ljava/lang/String;)Z", "permitsRequestBody", "invalidatesCache", "redirectsWithBody", "redirectsToGet", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class HttpMethod {
    @NotNull
    public static final HttpMethod INSTANCE;

    static {
        HttpMethod.INSTANCE = new HttpMethod();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    // 去混淆评级： 低(25)
    public final boolean invalidatesCache(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "method");
        return Intrinsics.areEqual(s, "POST") || Intrinsics.areEqual(s, "PATCH") || Intrinsics.areEqual(s, "PUT") || Intrinsics.areEqual(s, "DELETE") || Intrinsics.areEqual(s, "MOVE");
    }

    @JvmStatic
    public static final boolean permitsRequestBody(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "method");
        return !Intrinsics.areEqual(s, "GET") && !Intrinsics.areEqual(s, "HEAD");
    }

    public final boolean redirectsToGet(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "method");
        return !Intrinsics.areEqual(s, "PROPFIND");
    }

    public final boolean redirectsWithBody(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "method");
        return Intrinsics.areEqual(s, "PROPFIND");
    }

    // 去混淆评级： 低(25)
    @JvmStatic
    public static final boolean requiresRequestBody(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "method");
        return Intrinsics.areEqual(s, "POST") || Intrinsics.areEqual(s, "PUT") || Intrinsics.areEqual(s, "PATCH") || Intrinsics.areEqual(s, "PROPPATCH") || Intrinsics.areEqual(s, "REPORT");
    }
}

