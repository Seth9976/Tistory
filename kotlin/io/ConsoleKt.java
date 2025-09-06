package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000E\n\u0002\b\u0005\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A\u0011\u0010\u0003\u001A\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001A\u000F\u0010\u0004\u001A\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0002¨\u0006\u0005"}, d2 = {"", "readln", "()Ljava/lang/String;", "readlnOrNull", "readLine", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "ConsoleKt")
public final class ConsoleKt {
    @Nullable
    public static final String readLine() {
        InputStream inputStream0 = System.in;
        Intrinsics.checkNotNullExpressionValue(inputStream0, "in");
        Charset charset0 = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charset0, "defaultCharset(...)");
        return LineReader.INSTANCE.readLine(inputStream0, charset0);
    }

    @SinceKotlin(version = "1.6")
    @NotNull
    public static final String readln() {
        String s = ConsoleKt.readlnOrNull();
        if(s == null) {
            throw new ReadAfterEOFException("EOF has already been reached");
        }
        return s;
    }

    @SinceKotlin(version = "1.6")
    @Nullable
    public static final String readlnOrNull() {
        return ConsoleKt.readLine();
    }
}

