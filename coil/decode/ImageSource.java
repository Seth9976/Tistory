package coil.decode;

import coil.annotation.ExperimentalCoilApi;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0014J\u000F\u0010\u0003\u001A\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001A\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000F\u0010\u0007\u001A\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001A\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\bR\u001C\u0010\u000F\u001A\u0004\u0018\u00010\n8&X§\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000E\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\u0013\u001A\u00020\u00108&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcoil/decode/ImageSource;", "Ljava/io/Closeable;", "Lokio/BufferedSource;", "source", "()Lokio/BufferedSource;", "sourceOrNull", "Lokio/Path;", "file", "()Lokio/Path;", "fileOrNull", "Lcoil/decode/ImageSource$Metadata;", "getMetadata", "()Lcoil/decode/ImageSource$Metadata;", "getMetadata$annotations", "()V", "metadata", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "fileSystem", "Metadata", "Lcoil/decode/FileImageSource;", "Lcoil/decode/SourceImageSource;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class ImageSource implements Closeable {
    @ExperimentalCoilApi
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcoil/decode/ImageSource$Metadata;", "", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class coil.decode.ImageSource.Metadata {
    }

    public ImageSource(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public abstract Path file();

    @Nullable
    public abstract Path fileOrNull();

    @NotNull
    public abstract FileSystem getFileSystem();

    @Nullable
    public abstract coil.decode.ImageSource.Metadata getMetadata();

    @ExperimentalCoilApi
    public static void getMetadata$annotations() {
    }

    @NotNull
    public abstract BufferedSource source();

    @Nullable
    public abstract BufferedSource sourceOrNull();
}

