package okhttp3;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000B¨\u0006\f"}, d2 = {"Lokhttp3/Protocol;", "", "", "toString", "()Ljava/lang/String;", "Companion", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public enum Protocol {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/Protocol$Companion;", "", "", "protocol", "Lokhttp3/Protocol;", "get", "(Ljava/lang/String;)Lokhttp3/Protocol;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final Protocol get(@NotNull String s) throws IOException {
            Intrinsics.checkNotNullParameter(s, "protocol");
            Protocol protocol0 = Protocol.HTTP_1_0;
            if(!Intrinsics.areEqual(s, "http/1.0")) {
                protocol0 = Protocol.HTTP_1_1;
                if(!Intrinsics.areEqual(s, "http/1.1")) {
                    protocol0 = Protocol.H2_PRIOR_KNOWLEDGE;
                    if(!Intrinsics.areEqual(s, "h2_prior_knowledge")) {
                        protocol0 = Protocol.HTTP_2;
                        if(!Intrinsics.areEqual(s, "h2")) {
                            protocol0 = Protocol.SPDY_3;
                            if(!Intrinsics.areEqual(s, "spdy/3.1")) {
                                protocol0 = Protocol.QUIC;
                                if(!Intrinsics.areEqual(s, "quic")) {
                                    throw new IOException("Unexpected protocol: " + s);
                                }
                            }
                        }
                    }
                }
            }
            return protocol0;
        }
    }

    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    @Deprecated(message = "OkHttp has dropped support for SPDY. Prefer {@link #HTTP_2}.")
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    @NotNull
    public static final Companion Companion;
    public final String a;

    static {
        Protocol.Companion = new Companion(null);
    }

    public Protocol(String s1) {
        this.a = s1;
    }

    public static final String access$getProtocol$p(Protocol protocol0) {
        return protocol0.a;
    }

    @JvmStatic
    @NotNull
    public static final Protocol get(@NotNull String s) throws IOException {
        return Protocol.Companion.get(s);
    }

    @Override
    @NotNull
    public String toString() {
        return this.a;
    }
}

