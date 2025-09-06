package okhttp3.internal.http;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response.Builder;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u001C2\u00020\u0001:\u0001\u001CJ\b\u0010\u0006\u001A\u00020\u0007H&J\u0018\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rH&J\b\u0010\u000E\u001A\u00020\u0007H&J\b\u0010\u000F\u001A\u00020\u0007H&J\u0010\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0013H&J\u0012\u0010\u0014\u001A\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001A\u00020\u0017H&J\u0010\u0010\u0018\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\u0013H&J\b\u0010\u0019\u001A\u00020\u001AH&J\u0010\u0010\u001B\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u000BH&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u001D"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec;", "", "connection", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "cancel", "", "createRequestBody", "Lokio/Sink;", "request", "Lokhttp3/Request;", "contentLength", "", "finishRequest", "flushRequest", "openResponseBodySource", "Lokio/Source;", "response", "Lokhttp3/Response;", "readResponseHeaders", "Lokhttp3/Response$Builder;", "expectContinue", "", "reportedContentLength", "trailers", "Lokhttp3/Headers;", "writeRequestHeaders", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ExchangeCodec {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec$Companion;", "", "", "DISCARD_STREAM_TIMEOUT_MILLIS", "I", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    static {
        ExchangeCodec.Companion = Companion.a;
    }

    void cancel();

    @NotNull
    Sink createRequestBody(@NotNull Request arg1, long arg2) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    @NotNull
    RealConnection getConnection();

    @NotNull
    Source openResponseBodySource(@NotNull Response arg1) throws IOException;

    @Nullable
    Builder readResponseHeaders(boolean arg1) throws IOException;

    long reportedContentLength(@NotNull Response arg1) throws IOException;

    @NotNull
    Headers trailers() throws IOException;

    void writeRequestHeaders(@NotNull Request arg1) throws IOException;
}

