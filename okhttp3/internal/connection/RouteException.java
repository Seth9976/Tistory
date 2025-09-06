package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import md.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0004\b\t\u0010\u0006R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR$\u0010\u0011\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\u00038\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u000F\u0010\u000B\u001A\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "firstConnectException", "<init>", "(Ljava/io/IOException;)V", "e", "", "addConnectException", "a", "Ljava/io/IOException;", "getFirstConnectException", "()Ljava/io/IOException;", "<set-?>", "b", "getLastConnectException", "lastConnectException", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RouteException extends RuntimeException {
    public final IOException a;
    public IOException b;

    public RouteException(@NotNull IOException iOException0) {
        Intrinsics.checkNotNullParameter(iOException0, "firstConnectException");
        super(iOException0);
        this.a = iOException0;
        this.b = iOException0;
    }

    public final void addConnectException(@NotNull IOException iOException0) {
        Intrinsics.checkNotNullParameter(iOException0, "e");
        b.addSuppressed(this.a, iOException0);
        this.b = iOException0;
    }

    @NotNull
    public final IOException getFirstConnectException() {
        return this.a;
    }

    @NotNull
    public final IOException getLastConnectException() {
        return this.b;
    }
}

