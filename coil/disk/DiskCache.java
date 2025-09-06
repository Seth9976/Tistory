package coil.disk;

import android.os.StatFs;
import androidx.annotation.FloatRange;
import coil.annotation.ExperimentalCoilApi;
import java.io.Closeable;
import java.io.File;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okio.FileSystem;
import okio.Path.Companion;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003!\"#J\b\u0010\u0015\u001A\u00020\u0016H\'J\u0012\u0010\u0017\u001A\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001A\u00020\u001AH\'J\u0013\u0010\u001B\u001A\u0004\u0018\u00010\u001C2\u0006\u0010\u0019\u001A\u00020\u001AH§\u0002J\u0012\u0010\u001D\u001A\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001A\u00020\u001AH\'J\u0012\u0010\u001E\u001A\u0004\u0018\u00010\u001C2\u0006\u0010\u0019\u001A\u00020\u001AH\'J\u0010\u0010\u001F\u001A\u00020 2\u0006\u0010\u0019\u001A\u00020\u001AH\'R\u001A\u0010\u0002\u001A\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u001A\u0010\b\u001A\u00020\t8&X§\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0005\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\r\u001A\u00020\u000E8&X§\u0004¢\u0006\f\u0012\u0004\b\u000F\u0010\u0005\u001A\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0012\u001A\u00020\u000E8&X§\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0005\u001A\u0004\b\u0014\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Lcoil/disk/DiskCache;", "", "directory", "Lokio/Path;", "getDirectory$annotations", "()V", "getDirectory", "()Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "getFileSystem$annotations", "getFileSystem", "()Lokio/FileSystem;", "maxSize", "", "getMaxSize$annotations", "getMaxSize", "()J", "size", "getSize$annotations", "getSize", "clear", "", "edit", "Lcoil/disk/DiskCache$Editor;", "key", "", "get", "Lcoil/disk/DiskCache$Snapshot;", "openEditor", "openSnapshot", "remove", "", "Builder", "Editor", "Snapshot", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface DiskCache {
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u0015\u0010\n\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u000E\u001A\u00020\u00002\b\b\u0001\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u0017\u001A\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001B\u001A\u00020\u001A¢\u0006\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Lcoil/disk/DiskCache$Builder;", "", "<init>", "()V", "Ljava/io/File;", "directory", "(Ljava/io/File;)Lcoil/disk/DiskCache$Builder;", "Lokio/Path;", "(Lokio/Path;)Lcoil/disk/DiskCache$Builder;", "Lokio/FileSystem;", "fileSystem", "(Lokio/FileSystem;)Lcoil/disk/DiskCache$Builder;", "", "percent", "maxSizePercent", "(D)Lcoil/disk/DiskCache$Builder;", "", "size", "minimumMaxSizeBytes", "(J)Lcoil/disk/DiskCache$Builder;", "maximumMaxSizeBytes", "maxSizeBytes", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "cleanupDispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)Lcoil/disk/DiskCache$Builder;", "Lcoil/disk/DiskCache;", "build", "()Lcoil/disk/DiskCache;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskCache.kt\ncoil/disk/DiskCache$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
    public static final class Builder {
        public Path a;
        public FileSystem b;
        public double c;
        public long d;
        public long e;
        public long f;
        public CoroutineDispatcher g;

        public Builder() {
            this.b = FileSystem.SYSTEM;
            this.c = 0.02;
            this.d = 0xA00000L;
            this.e = 0xFA00000L;
            this.g = Dispatchers.getIO();
        }

        @NotNull
        public final DiskCache build() {
            Path path0 = this.a;
            if(path0 == null) {
                throw new IllegalStateException("directory == null");
            }
            if(this.c > 0.0) {
                try {
                    File file0 = path0.toFile();
                    file0.mkdir();
                    StatFs statFs0 = new StatFs(file0.getAbsolutePath());
                    return new RealDiskCache(c.coerceIn(((long)(this.c * ((double)statFs0.getBlockCountLong()) * ((double)statFs0.getBlockSizeLong()))), this.d, this.e), path0, this.b, this.g);
                }
                catch(Exception unused_ex) {
                    return new RealDiskCache(this.d, path0, this.b, this.g);
                }
            }
            return new RealDiskCache(this.f, path0, this.b, this.g);
        }

        @NotNull
        public final Builder cleanupDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            this.g = coroutineDispatcher0;
            return this;
        }

        @NotNull
        public final Builder directory(@NotNull File file0) {
            return this.directory(Companion.get$default(Path.Companion, file0, false, 1, null));
        }

        @NotNull
        public final Builder directory(@NotNull Path path0) {
            this.a = path0;
            return this;
        }

        @NotNull
        public final Builder fileSystem(@NotNull FileSystem fileSystem0) {
            this.b = fileSystem0;
            return this;
        }

        @NotNull
        public final Builder maxSizeBytes(long v) {
            if(v <= 0L) {
                throw new IllegalArgumentException("size must be > 0.");
            }
            this.c = 0.0;
            this.f = v;
            return this;
        }

        @NotNull
        public final Builder maxSizePercent(@FloatRange(from = 0.0, to = 1.0) double f) {
            if(0.0 > f || f > 1.0) {
                throw new IllegalArgumentException("size must be in the range [0.0, 1.0].");
            }
            this.f = 0L;
            this.c = f;
            return this;
        }

        @NotNull
        public final Builder maximumMaxSizeBytes(long v) {
            if(v <= 0L) {
                throw new IllegalArgumentException("size must be > 0.");
            }
            this.e = v;
            return this;
        }

        @NotNull
        public final Builder minimumMaxSizeBytes(long v) {
            if(v <= 0L) {
                throw new IllegalArgumentException("size must be > 0.");
            }
            this.d = v;
            return this;
        }
    }

    @ExperimentalCoilApi
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\b\u001A\u00020\tH&J\b\u0010\n\u001A\u00020\tH&J\n\u0010\u000B\u001A\u0004\u0018\u00010\fH\'J\n\u0010\r\u001A\u0004\u0018\u00010\fH&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0001"}, d2 = {"Lcoil/disk/DiskCache$Editor;", "", "data", "Lokio/Path;", "getData", "()Lokio/Path;", "metadata", "getMetadata", "abort", "", "commit", "commitAndGet", "Lcoil/disk/DiskCache$Snapshot;", "commitAndOpenSnapshot", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface Editor {
        void abort();

        void commit();

        @Deprecated(message = "Renamed to \'commitAndOpenSnapshot\'.", replaceWith = @ReplaceWith(expression = "commitAndOpenSnapshot()", imports = {}))
        @Nullable
        Snapshot commitAndGet();

        @Nullable
        Snapshot commitAndOpenSnapshot();

        @NotNull
        Path getData();

        @NotNull
        Path getMetadata();
    }

    @ExperimentalCoilApi
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\t\u001A\u00020\nH&J\n\u0010\u000B\u001A\u0004\u0018\u00010\fH\'J\n\u0010\r\u001A\u0004\u0018\u00010\fH&R\u0012\u0010\u0003\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0001"}, d2 = {"Lcoil/disk/DiskCache$Snapshot;", "Ljava/io/Closeable;", "Lokio/Closeable;", "data", "Lokio/Path;", "getData", "()Lokio/Path;", "metadata", "getMetadata", "close", "", "closeAndEdit", "Lcoil/disk/DiskCache$Editor;", "closeAndOpenEditor", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface Snapshot extends Closeable {
        @Override
        void close();

        @Deprecated(message = "Renamed to \'closeAndOpenEditor\'.", replaceWith = @ReplaceWith(expression = "closeAndOpenEditor()", imports = {}))
        @Nullable
        Editor closeAndEdit();

        @Nullable
        Editor closeAndOpenEditor();

        @NotNull
        Path getData();

        @NotNull
        Path getMetadata();
    }

    @ExperimentalCoilApi
    void clear();

    @ExperimentalCoilApi
    @Deprecated(message = "Renamed to \'openEditor\'.", replaceWith = @ReplaceWith(expression = "openEditor(key)", imports = {}))
    @Nullable
    Editor edit(@NotNull String arg1);

    @ExperimentalCoilApi
    @Deprecated(message = "Renamed to \'openSnapshot\'.", replaceWith = @ReplaceWith(expression = "openSnapshot(key)", imports = {}))
    @Nullable
    Snapshot get(@NotNull String arg1);

    @NotNull
    Path getDirectory();

    @ExperimentalCoilApi
    static void getDirectory$annotations() {
    }

    @NotNull
    FileSystem getFileSystem();

    @ExperimentalCoilApi
    static void getFileSystem$annotations() {
    }

    long getMaxSize();

    @ExperimentalCoilApi
    static void getMaxSize$annotations() {
    }

    long getSize();

    @ExperimentalCoilApi
    static void getSize$annotations() {
    }

    @ExperimentalCoilApi
    @Nullable
    Editor openEditor(@NotNull String arg1);

    @ExperimentalCoilApi
    @Nullable
    Snapshot openSnapshot(@NotNull String arg1);

    @ExperimentalCoilApi
    boolean remove(@NotNull String arg1);
}

