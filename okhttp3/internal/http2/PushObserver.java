package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J(\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\u0003H&J&\u0010\n\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001A\u00020\u0003H&J\u001E\u0010\u000E\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0012\u001A\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/http2/PushObserver;", "", "onData", "", "streamId", "", "source", "Lokio/BufferedSource;", "byteCount", "last", "onHeaders", "responseHeaders", "", "Lokhttp3/internal/http2/Header;", "onRequest", "requestHeaders", "onReset", "", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PushObserver {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/PushObserver$Companion;", "", "Lokhttp3/internal/http2/PushObserver;", "CANCEL", "Lokhttp3/internal/http2/PushObserver;", "okhttp3/internal/http2/a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @JvmField
    @NotNull
    public static final PushObserver CANCEL;
    @NotNull
    public static final Companion Companion;

    static {
        PushObserver.Companion = Companion.a;
        PushObserver.CANCEL = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    boolean onData(int arg1, @NotNull BufferedSource arg2, int arg3, boolean arg4) throws IOException;

    boolean onHeaders(int arg1, @NotNull List arg2, boolean arg3);

    boolean onRequest(int arg1, @NotNull List arg2);

    void onReset(int arg1, @NotNull ErrorCode arg2);
}

