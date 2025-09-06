package okhttp3;

import kotlin.Metadata;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\b\u0010\u0002\u001A\u00020\u0003H&J\u001A\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\b\u0010\b\u001A\u0004\u0018\u00010\tH&J\b\u0010\n\u001A\u00020\u000BH&J\b\u0010\f\u001A\u00020\rH&J\u0010\u0010\u000E\u001A\u00020\u00052\u0006\u0010\u000F\u001A\u00020\tH&J\u0010\u0010\u000E\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00020\u0011H&¨\u0006\u0013"}, d2 = {"Lokhttp3/WebSocket;", "", "cancel", "", "close", "", "code", "", "reason", "", "queueSize", "", "request", "Lokhttp3/Request;", "send", "text", "bytes", "Lokio/ByteString;", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface WebSocket {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H&¨\u0006\b"}, d2 = {"Lokhttp3/WebSocket$Factory;", "", "newWebSocket", "Lokhttp3/WebSocket;", "request", "Lokhttp3/Request;", "listener", "Lokhttp3/WebSocketListener;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Factory {
        @NotNull
        WebSocket newWebSocket(@NotNull Request arg1, @NotNull WebSocketListener arg2);
    }

    void cancel();

    boolean close(int arg1, @Nullable String arg2);

    long queueSize();

    @NotNull
    Request request();

    boolean send(@NotNull String arg1);

    boolean send(@NotNull ByteString arg1);
}

