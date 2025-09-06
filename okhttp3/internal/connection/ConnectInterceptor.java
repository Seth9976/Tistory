package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/connection/ConnectInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ConnectInterceptor implements Interceptor {
    @NotNull
    public static final ConnectInterceptor INSTANCE;

    static {
        ConnectInterceptor.INSTANCE = new ConnectInterceptor();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Chain interceptor$Chain0) throws IOException {
        Intrinsics.checkNotNullParameter(interceptor$Chain0, "chain");
        return RealInterceptorChain.copy$okhttp$default(((RealInterceptorChain)interceptor$Chain0), 0, ((RealInterceptorChain)interceptor$Chain0).getCall$okhttp().initExchange$okhttp(((RealInterceptorChain)interceptor$Chain0)), null, 0, 0, 0, 61, null).proceed(((RealInterceptorChain)interceptor$Chain0).getRequest$okhttp());
    }
}

