package coil.decode;

import coil.util.-Utils;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0011\u0010\u0011\u001A\u0004\u0018\u00010\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u0012R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u001C\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcoil/decode/FileImageSource;", "Lcoil/decode/ImageSource;", "Lokio/Path;", "file", "Lokio/FileSystem;", "fileSystem", "", "diskCacheKey", "Ljava/io/Closeable;", "closeable", "Lcoil/decode/ImageSource$Metadata;", "metadata", "<init>", "(Lokio/Path;Lokio/FileSystem;Ljava/lang/String;Ljava/io/Closeable;Lcoil/decode/ImageSource$Metadata;)V", "Lokio/BufferedSource;", "source", "()Lokio/BufferedSource;", "sourceOrNull", "()Lokio/Path;", "fileOrNull", "", "close", "()V", "a", "Lokio/Path;", "getFile$coil_base_release", "b", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "c", "Ljava/lang/String;", "getDiskCacheKey$coil_base_release", "()Ljava/lang/String;", "e", "Lcoil/decode/ImageSource$Metadata;", "getMetadata", "()Lcoil/decode/ImageSource$Metadata;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSource.kt\ncoil/decode/FileImageSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
public final class FileImageSource extends ImageSource {
    public final Path a;
    public final FileSystem b;
    public final String c;
    public final Closeable d;
    public final coil.decode.ImageSource.Metadata e;
    public boolean f;
    public BufferedSource g;

    public FileImageSource(@NotNull Path path0, @NotNull FileSystem fileSystem0, @Nullable String s, @Nullable Closeable closeable0, @Nullable coil.decode.ImageSource.Metadata imageSource$Metadata0) {
        super(null);
        this.a = path0;
        this.b = fileSystem0;
        this.c = s;
        this.d = closeable0;
        this.e = imageSource$Metadata0;
    }

    @Override
    public void close() {
        synchronized(this) {
            this.f = true;
            BufferedSource bufferedSource0 = this.g;
            if(bufferedSource0 != null) {
                -Utils.closeQuietly(bufferedSource0);
            }
            Closeable closeable0 = this.d;
            if(closeable0 != null) {
                -Utils.closeQuietly(closeable0);
            }
        }
    }

    @Override  // coil.decode.ImageSource
    @NotNull
    public Path file() {
        synchronized(this) {
            if(!this.f) {
                return this.a;
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override  // coil.decode.ImageSource
    @NotNull
    public Path fileOrNull() {
        return this.file();
    }

    @Nullable
    public final String getDiskCacheKey$coil_base_release() {
        return this.c;
    }

    @NotNull
    public final Path getFile$coil_base_release() {
        return this.a;
    }

    @Override  // coil.decode.ImageSource
    @NotNull
    public FileSystem getFileSystem() {
        return this.b;
    }

    @Override  // coil.decode.ImageSource
    @Nullable
    public coil.decode.ImageSource.Metadata getMetadata() {
        return this.e;
    }

    @Override  // coil.decode.ImageSource
    @NotNull
    public BufferedSource source() {
        synchronized(this) {
            if(!this.f) {
                BufferedSource bufferedSource0 = this.g;
                if(bufferedSource0 != null) {
                    return bufferedSource0;
                }
                BufferedSource bufferedSource1 = Okio.buffer(this.getFileSystem().source(this.a));
                this.g = bufferedSource1;
                return bufferedSource1;
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override  // coil.decode.ImageSource
    @Nullable
    public BufferedSource sourceOrNull() {
        synchronized(this) {
            if(!this.f) {
                return this.g;
            }
        }
        throw new IllegalStateException("closed");
    }
}

