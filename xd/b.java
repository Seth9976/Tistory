package xd;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.SinceKotlin;
import kotlin.io.encoding.Base64;
import kotlin.io.encoding.ExperimentalEncodingApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class b {
    @SinceKotlin(version = "1.8")
    @ExperimentalEncodingApi
    @NotNull
    public static final InputStream decodingWith(@NotNull InputStream inputStream0, @NotNull Base64 base640) {
        Intrinsics.checkNotNullParameter(inputStream0, "<this>");
        Intrinsics.checkNotNullParameter(base640, "base64");
        return new a(inputStream0, base640);
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalEncodingApi
    @NotNull
    public static final OutputStream encodingWith(@NotNull OutputStream outputStream0, @NotNull Base64 base640) {
        Intrinsics.checkNotNullParameter(outputStream0, "<this>");
        Intrinsics.checkNotNullParameter(base640, "base64");
        return new kotlin.io.encoding.a(outputStream0, base640);
    }
}

