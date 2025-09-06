package coil.disk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import okio.ByteString;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000 *2\u00020\u0001:\u0003*+,B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u0019\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0011\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\r\u001A\u00020\fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0013\u001A\u0004\u0018\u00010\u00122\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001A\u0004\u0018\u00010\u00122\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001A\u00020\u00162\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u001A\u0010\u001BR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R\u001A\u0010\u0007\u001A\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u0014\u0010)\u001A\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b(\u0010\u001F¨\u0006-"}, d2 = {"Lcoil/disk/RealDiskCache;", "Lcoil/disk/DiskCache;", "", "maxSize", "Lokio/Path;", "directory", "Lokio/FileSystem;", "fileSystem", "Lkotlinx/coroutines/CoroutineDispatcher;", "cleanupDispatcher", "<init>", "(JLokio/Path;Lokio/FileSystem;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "key", "Lcoil/disk/DiskCache$Snapshot;", "openSnapshot", "(Ljava/lang/String;)Lcoil/disk/DiskCache$Snapshot;", "get", "Lcoil/disk/DiskCache$Editor;", "openEditor", "(Ljava/lang/String;)Lcoil/disk/DiskCache$Editor;", "edit", "", "remove", "(Ljava/lang/String;)Z", "", "clear", "()V", "a", "J", "getMaxSize", "()J", "b", "Lokio/Path;", "getDirectory", "()Lokio/Path;", "c", "Lokio/FileSystem;", "getFileSystem", "()Lokio/FileSystem;", "getSize", "size", "Companion", "coil/disk/a", "coil/disk/b", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRealDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealDiskCache.kt\ncoil/disk/RealDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
public final class RealDiskCache implements DiskCache {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcoil/disk/RealDiskCache$Companion;", "", "", "ENTRY_DATA", "I", "ENTRY_METADATA", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public final Path b;
    public final FileSystem c;
    public final DiskLruCache d;

    static {
        RealDiskCache.Companion = new Companion(null);
    }

    public RealDiskCache(long v, @NotNull Path path0, @NotNull FileSystem fileSystem0, @NotNull CoroutineDispatcher coroutineDispatcher0) {
        this.a = v;
        this.b = path0;
        this.c = fileSystem0;
        this.d = new DiskLruCache(this.getFileSystem(), this.getDirectory(), coroutineDispatcher0, this.getMaxSize(), 1, 2);
    }

    @Override  // coil.disk.DiskCache
    public void clear() {
        this.d.evictAll();
    }

    @Override  // coil.disk.DiskCache
    @Nullable
    public Editor edit(@NotNull String s) {
        return this.openEditor(s);
    }

    @Override  // coil.disk.DiskCache
    @Nullable
    public Snapshot get(@NotNull String s) {
        return this.openSnapshot(s);
    }

    @Override  // coil.disk.DiskCache
    @NotNull
    public Path getDirectory() {
        return this.b;
    }

    @Override  // coil.disk.DiskCache
    @NotNull
    public FileSystem getFileSystem() {
        return this.c;
    }

    @Override  // coil.disk.DiskCache
    public long getMaxSize() {
        return this.a;
    }

    @Override  // coil.disk.DiskCache
    public long getSize() {
        return this.d.size();
    }

    @Override  // coil.disk.DiskCache
    @Nullable
    public Editor openEditor(@NotNull String s) {
        String s1 = ByteString.Companion.encodeUtf8(s).sha256().hex();
        coil.disk.DiskLruCache.Editor diskLruCache$Editor0 = this.d.edit(s1);
        return diskLruCache$Editor0 != null ? new a(diskLruCache$Editor0) : null;
    }

    @Override  // coil.disk.DiskCache
    @Nullable
    public Snapshot openSnapshot(@NotNull String s) {
        String s1 = ByteString.Companion.encodeUtf8(s).sha256().hex();
        coil.disk.DiskLruCache.Snapshot diskLruCache$Snapshot0 = this.d.get(s1);
        return diskLruCache$Snapshot0 != null ? new b(diskLruCache$Snapshot0) : null;
    }

    @Override  // coil.disk.DiskCache
    public boolean remove(@NotNull String s) {
        String s1 = ByteString.Companion.encodeUtf8(s).sha256().hex();
        return this.d.remove(s1);
    }
}

