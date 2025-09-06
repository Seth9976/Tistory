package okhttp3;

import androidx.room.a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J)\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/Credentials;", "", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", "basic", "(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Credentials {
    @NotNull
    public static final Credentials INSTANCE;

    static {
        Credentials.INSTANCE = new Credentials();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final String basic(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "username");
        Intrinsics.checkNotNullParameter(s1, "password");
        return Credentials.basic$default(s, s1, null, 4, null);
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final String basic(@NotNull String s, @NotNull String s1, @NotNull Charset charset0) {
        Intrinsics.checkNotNullParameter(s, "username");
        Intrinsics.checkNotNullParameter(s1, "password");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        return a.j("Basic ", ByteString.Companion.encodeString(s + ':' + s1, charset0).base64());
    }

    public static String basic$default(String s, String s1, Charset charset0, int v, Object object0) {
        if((v & 4) != 0) {
            charset0 = StandardCharsets.ISO_8859_1;
            Intrinsics.checkNotNullExpressionValue(charset0, "ISO_8859_1");
        }
        return Credentials.basic(s, s1, charset0);
    }
}

