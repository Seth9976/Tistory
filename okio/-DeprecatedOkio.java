package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "changed in Okio 2.x")
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0007¢\u0006\u0004\b\t\u0010\u000EJ\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u000FH\u0007¢\u0006\u0004\b\u0007\u0010\u0011J+\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u00122\u0012\u0010\u0016\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0007¢\u0006\u0004\b\u0007\u0010\u0017J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0019\u001A\u00020\u0018H\u0007¢\u0006\u0004\b\u0007\u0010\u001AJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\u001BJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\u001D\u001A\u00020\u001CH\u0007¢\u0006\u0004\b\f\u0010\u001EJ+\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0013\u001A\u00020\u00122\u0012\u0010\u0016\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0007¢\u0006\u0004\b\f\u0010\u001FJ\u0017\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0019\u001A\u00020\u0018H\u0007¢\u0006\u0004\b\f\u0010 J\u000F\u0010!\u001A\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lokio/-DeprecatedOkio;", "", "Ljava/io/File;", "file", "Lokio/Sink;", "appendingSink", "(Ljava/io/File;)Lokio/Sink;", "sink", "Lokio/BufferedSink;", "buffer", "(Lokio/Sink;)Lokio/BufferedSink;", "Lokio/Source;", "source", "Lokio/BufferedSource;", "(Lokio/Source;)Lokio/BufferedSource;", "Ljava/io/OutputStream;", "outputStream", "(Ljava/io/OutputStream;)Lokio/Sink;", "Ljava/nio/file/Path;", "path", "", "Ljava/nio/file/OpenOption;", "options", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "Ljava/net/Socket;", "socket", "(Ljava/net/Socket;)Lokio/Sink;", "(Ljava/io/File;)Lokio/Source;", "Ljava/io/InputStream;", "inputStream", "(Ljava/io/InputStream;)Lokio/Source;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "(Ljava/net/Socket;)Lokio/Source;", "blackhole", "()Lokio/Sink;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class -DeprecatedOkio {
    @NotNull
    public static final -DeprecatedOkio INSTANCE;

    static {
        -DeprecatedOkio.INSTANCE = new -DeprecatedOkio();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    @NotNull
    public final Sink appendingSink(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "file");
        return Okio.appendingSink(file0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    @NotNull
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "sink.buffer()", imports = {"okio.buffer"}))
    @NotNull
    public final BufferedSink buffer(@NotNull Sink sink0) {
        Intrinsics.checkNotNullParameter(sink0, "sink");
        return Okio.buffer(sink0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "source.buffer()", imports = {"okio.buffer"}))
    @NotNull
    public final BufferedSource buffer(@NotNull Source source0) {
        Intrinsics.checkNotNullParameter(source0, "source");
        return Okio.buffer(source0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "file.sink()", imports = {"okio.sink"}))
    @NotNull
    public final Sink sink(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "file");
        return Okio.sink$default(file0, false, 1, null);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "outputStream.sink()", imports = {"okio.sink"}))
    @NotNull
    public final Sink sink(@NotNull OutputStream outputStream0) {
        Intrinsics.checkNotNullParameter(outputStream0, "outputStream");
        return Okio.sink(outputStream0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "socket.sink()", imports = {"okio.sink"}))
    @NotNull
    public final Sink sink(@NotNull Socket socket0) {
        Intrinsics.checkNotNullParameter(socket0, "socket");
        return Okio.sink(socket0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "path.sink(*options)", imports = {"okio.sink"}))
    @NotNull
    public final Sink sink(@NotNull Path path0, @NotNull OpenOption[] arr_openOption) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(arr_openOption, "options");
        return Okio.sink(path0, ((OpenOption[])Arrays.copyOf(arr_openOption, arr_openOption.length)));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "file.source()", imports = {"okio.source"}))
    @NotNull
    public final Source source(@NotNull File file0) {
        Intrinsics.checkNotNullParameter(file0, "file");
        return Okio.source(file0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "inputStream.source()", imports = {"okio.source"}))
    @NotNull
    public final Source source(@NotNull InputStream inputStream0) {
        Intrinsics.checkNotNullParameter(inputStream0, "inputStream");
        return Okio.source(inputStream0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "socket.source()", imports = {"okio.source"}))
    @NotNull
    public final Source source(@NotNull Socket socket0) {
        Intrinsics.checkNotNullParameter(socket0, "socket");
        return Okio.source(socket0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "path.source(*options)", imports = {"okio.source"}))
    @NotNull
    public final Source source(@NotNull Path path0, @NotNull OpenOption[] arr_openOption) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(arr_openOption, "options");
        return Okio.source(path0, ((OpenOption[])Arrays.copyOf(arr_openOption, arr_openOption.length)));
    }
}

