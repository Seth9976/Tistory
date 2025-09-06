package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import okhttp3.Protocol;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001A\u00020\u0007H\u0016R\u0010\u0010\u0004\u001A\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001A\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000B"}, d2 = {"Lokhttp3/internal/http/StatusLine;", "", "protocol", "Lokhttp3/Protocol;", "code", "", "message", "", "(Lokhttp3/Protocol;ILjava/lang/String;)V", "toString", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class StatusLine {
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001A\u00020\u000B8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000E\u001A\u00020\u000B8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000E\u0010\rR\u0014\u0010\u000F\u001A\u00020\u000B8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000F\u0010\rR\u0014\u0010\u0010\u001A\u00020\u000B8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "Lokhttp3/Response;", "response", "Lokhttp3/internal/http/StatusLine;", "get", "(Lokhttp3/Response;)Lokhttp3/internal/http/StatusLine;", "", "statusLine", "parse", "(Ljava/lang/String;)Lokhttp3/internal/http/StatusLine;", "", "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final StatusLine get(@NotNull Response response0) {
            Intrinsics.checkNotNullParameter(response0, "response");
            return new StatusLine(response0.protocol(), response0.code(), response0.message());
        }

        @NotNull
        public final StatusLine parse(@NotNull String s) throws IOException {
            int v1;
            Protocol protocol0;
            int v = 9;
            Intrinsics.checkNotNullParameter(s, "statusLine");
            if(p.startsWith$default(s, "HTTP/1.", false, 2, null)) {
                if(s.length() < 9 || s.charAt(8) != 0x20) {
                    throw new ProtocolException("Unexpected status line: " + s);
                }
                switch(s.charAt(7) - 0x30) {
                    case 0: {
                        protocol0 = Protocol.HTTP_1_0;
                        break;
                    }
                    case 1: {
                        protocol0 = Protocol.HTTP_1_1;
                        break;
                    }
                    default: {
                        throw new ProtocolException("Unexpected status line: " + s);
                    }
                }
            }
            else {
                if(!p.startsWith$default(s, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + s);
                }
                protocol0 = Protocol.HTTP_1_0;
                v = 4;
            }
            if(s.length() < v + 3) {
                throw new ProtocolException("Unexpected status line: " + s);
            }
            try {
                String s1 = s.substring(v, v + 3);
                Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                v1 = Integer.parseInt(s1);
            }
            catch(NumberFormatException unused_ex) {
                throw new ProtocolException("Unexpected status line: " + s);
            }
            if(s.length() > v + 3) {
                if(s.charAt(v + 3) != 0x20) {
                    throw new ProtocolException("Unexpected status line: " + s);
                }
                String s2 = s.substring(v + 4);
                Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String).substring(startIndex)");
                return new StatusLine(protocol0, v1, s2);
            }
            return new StatusLine(protocol0, v1, "");
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    @JvmField
    public final int code;
    @JvmField
    @NotNull
    public final String message;
    @JvmField
    @NotNull
    public final Protocol protocol;

    static {
        StatusLine.Companion = new Companion(null);
    }

    public StatusLine(@NotNull Protocol protocol0, int v, @NotNull String s) {
        Intrinsics.checkNotNullParameter(protocol0, "protocol");
        Intrinsics.checkNotNullParameter(s, "message");
        super();
        this.protocol = protocol0;
        this.code = v;
        this.message = s;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.protocol == Protocol.HTTP_1_0) {
            stringBuilder0.append("HTTP/1.0");
        }
        else {
            stringBuilder0.append("HTTP/1.1");
        }
        stringBuilder0.append(' ');
        stringBuilder0.append(this.code);
        stringBuilder0.append(' ');
        stringBuilder0.append(this.message);
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

