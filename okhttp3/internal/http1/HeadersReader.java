package okhttp3.internal.http1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers.Builder;
import okhttp3.Headers;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001A\u00020\t¢\u0006\u0004\b\n\u0010\u000BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "", "readLine", "()Ljava/lang/String;", "Lokhttp3/Headers;", "readHeaders", "()Lokhttp3/Headers;", "a", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class HeadersReader {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http1/HeadersReader$Companion;", "", "", "HEADER_LIMIT", "I", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final BufferedSource a;
    public long b;

    static {
        HeadersReader.Companion = new Companion(null);
    }

    public HeadersReader(@NotNull BufferedSource bufferedSource0) {
        Intrinsics.checkNotNullParameter(bufferedSource0, "source");
        super();
        this.a = bufferedSource0;
        this.b = 0x40000L;
    }

    @NotNull
    public final BufferedSource getSource() {
        return this.a;
    }

    @NotNull
    public final Headers readHeaders() {
        Builder headers$Builder0 = new Builder();
        while(true) {
            String s = this.readLine();
            if(s.length() == 0) {
                break;
            }
            headers$Builder0.addLenient$okhttp(s);
        }
        return headers$Builder0.build();
    }

    @NotNull
    public final String readLine() {
        String s = this.a.readUtf8LineStrict(this.b);
        this.b -= (long)s.length();
        return s;
    }
}

