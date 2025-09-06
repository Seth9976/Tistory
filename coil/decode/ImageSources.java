package coil.decode;

import ac.b;
import android.content.Context;
import coil.annotation.ExperimentalCoilApi;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o0.e;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u001D\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0007¢\u0006\u0002\b\u0006\u001A)\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\b\u0006\u001A\u001D\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\nH\u0007¢\u0006\u0002\b\u0006\u001A)\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\n2\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\b\u0006\u001A7\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\b\u0006\u001AC\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\b\u0006¨\u0006\u0013"}, d2 = {"ImageSource", "Lcoil/decode/ImageSource;", "source", "Lokio/BufferedSource;", "context", "Landroid/content/Context;", "create", "metadata", "Lcoil/decode/ImageSource$Metadata;", "cacheDirectory", "Ljava/io/File;", "file", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "diskCacheKey", "", "closeable", "Ljava/io/Closeable;", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "ImageSources")
public final class ImageSources {
    @JvmName(name = "create")
    @NotNull
    public static final ImageSource create(@NotNull BufferedSource bufferedSource0, @NotNull Context context0) {
        return new SourceImageSource(bufferedSource0, new b(context0, 3), null);
    }

    @ExperimentalCoilApi
    @JvmName(name = "create")
    @NotNull
    public static final ImageSource create(@NotNull BufferedSource bufferedSource0, @NotNull Context context0, @Nullable coil.decode.ImageSource.Metadata imageSource$Metadata0) {
        return new SourceImageSource(bufferedSource0, new a(context0), imageSource$Metadata0);
    }

    @JvmName(name = "create")
    @NotNull
    public static final ImageSource create(@NotNull BufferedSource bufferedSource0, @NotNull File file0) {
        return new SourceImageSource(bufferedSource0, new e(file0, 13), null);
    }

    @ExperimentalCoilApi
    @JvmName(name = "create")
    @NotNull
    public static final ImageSource create(@NotNull BufferedSource bufferedSource0, @NotNull File file0, @Nullable coil.decode.ImageSource.Metadata imageSource$Metadata0) {
        return new SourceImageSource(bufferedSource0, new coil.decode.b(file0), imageSource$Metadata0);
    }

    @JvmName(name = "create")
    @NotNull
    public static final ImageSource create(@NotNull Path path0, @NotNull FileSystem fileSystem0, @Nullable String s, @Nullable Closeable closeable0) {
        return new FileImageSource(path0, fileSystem0, s, closeable0, null);
    }

    @ExperimentalCoilApi
    @JvmName(name = "create")
    @NotNull
    public static final ImageSource create(@NotNull Path path0, @NotNull FileSystem fileSystem0, @Nullable String s, @Nullable Closeable closeable0, @Nullable coil.decode.ImageSource.Metadata imageSource$Metadata0) {
        return new FileImageSource(path0, fileSystem0, s, closeable0, imageSource$Metadata0);
    }

    public static ImageSource create$default(BufferedSource bufferedSource0, Context context0, coil.decode.ImageSource.Metadata imageSource$Metadata0, int v, Object object0) {
        if((v & 4) != 0) {
            imageSource$Metadata0 = null;
        }
        return ImageSources.create(bufferedSource0, context0, imageSource$Metadata0);
    }

    public static ImageSource create$default(BufferedSource bufferedSource0, File file0, coil.decode.ImageSource.Metadata imageSource$Metadata0, int v, Object object0) {
        if((v & 4) != 0) {
            imageSource$Metadata0 = null;
        }
        return ImageSources.create(bufferedSource0, file0, imageSource$Metadata0);
    }

    public static ImageSource create$default(Path path0, FileSystem fileSystem0, String s, Closeable closeable0, int v, Object object0) {
        if((v & 2) != 0) {
            fileSystem0 = FileSystem.SYSTEM;
        }
        if((v & 4) != 0) {
            s = null;
        }
        if((v & 8) != 0) {
            closeable0 = null;
        }
        return ImageSources.create(path0, fileSystem0, s, closeable0);
    }

    public static ImageSource create$default(Path path0, FileSystem fileSystem0, String s, Closeable closeable0, coil.decode.ImageSource.Metadata imageSource$Metadata0, int v, Object object0) {
        if((v & 2) != 0) {
            fileSystem0 = FileSystem.SYSTEM;
        }
        if((v & 4) != 0) {
            s = null;
        }
        if((v & 8) != 0) {
            closeable0 = null;
        }
        if((v & 16) != 0) {
            imageSource$Metadata0 = null;
        }
        return ImageSources.create(path0, fileSystem0, s, closeable0, imageSource$Metadata0);
    }
}

