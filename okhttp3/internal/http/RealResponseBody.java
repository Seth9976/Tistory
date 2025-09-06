package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\nJ\u0011\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u000E¨\u0006\u000F"}, d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "", "contentTypeString", "", "contentLength", "Lokio/BufferedSource;", "source", "<init>", "(Ljava/lang/String;JLokio/BufferedSource;)V", "()J", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "()Lokio/BufferedSource;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RealResponseBody extends ResponseBody {
    public final String b;
    public final long c;
    public final BufferedSource d;

    public RealResponseBody(@Nullable String s, long v, @NotNull BufferedSource bufferedSource0) {
        Intrinsics.checkNotNullParameter(bufferedSource0, "source");
        super();
        this.b = s;
        this.c = v;
        this.d = bufferedSource0;
    }

    @Override  // okhttp3.ResponseBody
    public long contentLength() {
        return this.c;
    }

    @Override  // okhttp3.ResponseBody
    @Nullable
    public MediaType contentType() {
        return this.b == null ? null : MediaType.Companion.parse(this.b);
    }

    @Override  // okhttp3.ResponseBody
    @NotNull
    public BufferedSource source() {
        return this.d;
    }
}

