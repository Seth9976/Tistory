package yd;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.io.path.ExperimentalPathApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

public abstract class h {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final void appendText(@NotNull Path path0, @NotNull CharSequence charSequence0, @NotNull Charset charset0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        OutputStream outputStream0 = Files.newOutputStream(path0, new OpenOption[]{StandardOpenOption.APPEND});
        Intrinsics.checkNotNullExpressionValue(outputStream0, "newOutputStream(...)");
        OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(outputStream0, charset0);
        try {
            outputStreamWriter0.append(charSequence0);
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(outputStreamWriter0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(outputStreamWriter0, null);
    }

    public static void appendText$default(Path path0, CharSequence charSequence0, Charset charset0, int v, Object object0) throws IOException {
        if((v & 2) != 0) {
            charset0 = Charsets.UTF_8;
        }
        h.appendText(path0, charSequence0, charset0);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @NotNull
    public static final String readText(@NotNull Path path0, @NotNull Charset charset0) throws IOException {
        String s;
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        InputStreamReader inputStreamReader0 = new InputStreamReader(Files.newInputStream(path0, ((OpenOption[])Arrays.copyOf(new OpenOption[0], 0))), charset0);
        try {
            s = TextStreamsKt.readText(inputStreamReader0);
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(inputStreamReader0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(inputStreamReader0, null);
        return s;
    }

    public static String readText$default(Path path0, Charset charset0, int v, Object object0) throws IOException {
        if((v & 1) != 0) {
            charset0 = Charsets.UTF_8;
        }
        return h.readText(path0, charset0);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final void writeText(@NotNull Path path0, @NotNull CharSequence charSequence0, @NotNull Charset charset0, @NotNull OpenOption[] arr_openOption) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        Intrinsics.checkNotNullParameter(charset0, "charset");
        Intrinsics.checkNotNullParameter(arr_openOption, "options");
        OutputStream outputStream0 = Files.newOutputStream(path0, ((OpenOption[])Arrays.copyOf(arr_openOption, arr_openOption.length)));
        Intrinsics.checkNotNullExpressionValue(outputStream0, "newOutputStream(...)");
        OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(outputStream0, charset0);
        try {
            outputStreamWriter0.append(charSequence0);
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(outputStreamWriter0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(outputStreamWriter0, null);
    }

    public static void writeText$default(Path path0, CharSequence charSequence0, Charset charset0, OpenOption[] arr_openOption, int v, Object object0) throws IOException {
        if((v & 2) != 0) {
            charset0 = Charsets.UTF_8;
        }
        h.writeText(path0, charSequence0, charset0, arr_openOption);
    }
}

