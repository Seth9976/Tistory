package okhttp3;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bJ\u000F\u0010\u0005\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001A\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\u0005\u0010\u0004j\u0002\b\tj\u0002\b\nj\u0002\b\u000Bj\u0002\b\fj\u0002\b\r¨\u0006\u000E"}, d2 = {"Lokhttp3/TlsVersion;", "", "", "-deprecated_javaName", "()Ljava/lang/String;", "javaName", "a", "Ljava/lang/String;", "Companion", "TLS_1_3", "TLS_1_2", "TLS_1_1", "TLS_1_0", "SSL_3_0", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public enum TlsVersion {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/TlsVersion$Companion;", "", "", "javaName", "Lokhttp3/TlsVersion;", "forJavaName", "(Ljava/lang/String;)Lokhttp3/TlsVersion;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final TlsVersion forJavaName(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "javaName");
            switch(s) {
                case "SSLv3": {
                    return TlsVersion.SSL_3_0;
                }
                case "TLSv1": {
                    return TlsVersion.TLS_1_0;
                }
                case "TLSv1.1": {
                    return TlsVersion.TLS_1_1;
                }
                case "TLSv1.2": {
                    return TlsVersion.TLS_1_2;
                }
                case "TLSv1.3": {
                    return TlsVersion.TLS_1_3;
                }
                default: {
                    throw new IllegalArgumentException("Unexpected TLS version: " + s);
                }
            }
        }
    }

    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    @NotNull
    public static final Companion Companion;
    public final String a;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "javaName", imports = {}))
    @JvmName(name = "-deprecated_javaName")
    @NotNull
    public final String -deprecated_javaName() {
        return this.a;
    }

    static {
        TlsVersion.Companion = new Companion(null);
    }

    public TlsVersion(String s1) {
        this.a = s1;
    }

    @JvmStatic
    @NotNull
    public static final TlsVersion forJavaName(@NotNull String s) {
        return TlsVersion.Companion.forJavaName(s);
    }

    @JvmName(name = "javaName")
    @NotNull
    public final String javaName() {
        return this.a;
    }
}

