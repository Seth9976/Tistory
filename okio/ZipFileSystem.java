package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.b;
import okio.internal.FixedLengthSource;
import okio.internal.ZipEntry;
import okio.internal.ZipFilesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B7\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0001\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\r\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\f\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\'\u0010\u0019\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0018\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001D\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00020\u001C2\u0006\u0010\u001B\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u001F\u0010\u001F\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001C2\u0006\u0010\u001B\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u001F\u0010\u001EJ\u0017\u0010!\u001A\u00020 2\u0006\u0010\u0012\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b!\u0010\"J\u001F\u0010$\u001A\u00020#2\u0006\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b$\u0010%J\u001F\u0010&\u001A\u00020#2\u0006\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u0018\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b&\u0010%J\u001F\u0010(\u001A\u00020\'2\u0006\u0010\u001B\u001A\u00020\u00022\u0006\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b(\u0010)J\u001F\u0010+\u001A\u00020\'2\u0006\u0010!\u001A\u00020\u00022\u0006\u0010*\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b+\u0010,J\u001F\u0010-\u001A\u00020\'2\u0006\u0010\f\u001A\u00020\u00022\u0006\u0010\u0018\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b-\u0010)J\u001F\u0010.\u001A\u00020\'2\u0006\u0010!\u001A\u00020\u00022\u0006\u0010*\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b.\u0010,\u00A8\u0006/"}, d2 = {"Lokio/ZipFileSystem;", "Lokio/FileSystem;", "Lokio/Path;", "zipPath", "fileSystem", "", "Lokio/internal/ZipEntry;", "entries", "", "comment", "<init>", "(Lokio/Path;Lokio/FileSystem;Ljava/util/Map;Ljava/lang/String;)V", "path", "canonicalize", "(Lokio/Path;)Lokio/Path;", "Lokio/FileMetadata;", "metadataOrNull", "(Lokio/Path;)Lokio/FileMetadata;", "file", "Lokio/FileHandle;", "openReadOnly", "(Lokio/Path;)Lokio/FileHandle;", "", "mustCreate", "mustExist", "openReadWrite", "(Lokio/Path;ZZ)Lokio/FileHandle;", "dir", "", "list", "(Lokio/Path;)Ljava/util/List;", "listOrNull", "Lokio/Source;", "source", "(Lokio/Path;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Path;Z)Lokio/Sink;", "appendingSink", "", "createDirectory", "(Lokio/Path;Z)V", "target", "atomicMove", "(Lokio/Path;Lokio/Path;)V", "delete", "createSymlink", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,175:1\n52#2,5:176\n52#2,21:181\n60#2,10:202\n57#2,2:212\n71#2,2:214\n52#2,21:216\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n102#1:176,5\n103#1:181,21\n102#1:202,10\n102#1:212,2\n102#1:214,2\n132#1:216,21\n*E\n"})
public final class ZipFileSystem extends FileSystem {
    public final Path a;
    public final FileSystem b;
    public final Map c;
    public static final Path d;

    static {
        ZipFileSystem.d = Companion.get$default(Path.Companion, "/", false, 1, null);
    }

    public ZipFileSystem(@NotNull Path path0, @NotNull FileSystem fileSystem0, @NotNull Map map0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(path0, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem0, "fileSystem");
        Intrinsics.checkNotNullParameter(map0, "entries");
        super();
        this.a = path0;
        this.b = fileSystem0;
        this.c = map0;
    }

    public final List a(Path path0, boolean z) {
        Path path1 = ZipFileSystem.d.resolve(path0, true);
        ZipEntry zipEntry0 = (ZipEntry)this.c.get(path1);
        if(zipEntry0 == null) {
            if(z) {
                throw new IOException("not a directory: " + path0);
            }
            return null;
        }
        return CollectionsKt___CollectionsKt.toList(zipEntry0.getChildren());
    }

    public static final Path access$getROOT$cp() {
        return ZipFileSystem.d;
    }

    @Override  // okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override  // okio.FileSystem
    public void atomicMove(@NotNull Path path0, @NotNull Path path1) {
        Intrinsics.checkNotNullParameter(path0, "source");
        Intrinsics.checkNotNullParameter(path1, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override  // okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Path path1 = ZipFileSystem.d.resolve(path0, true);
        if(!this.c.containsKey(path1)) {
            throw new FileNotFoundException(String.valueOf(path0));
        }
        return path1;
    }

    @Override  // okio.FileSystem
    public void createDirectory(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override  // okio.FileSystem
    public void createSymlink(@NotNull Path path0, @NotNull Path path1) {
        Intrinsics.checkNotNullParameter(path0, "source");
        Intrinsics.checkNotNullParameter(path1, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override  // okio.FileSystem
    public void delete(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override  // okio.FileSystem
    @NotNull
    public List list(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        List list0 = this.a(path0, true);
        Intrinsics.checkNotNull(list0);
        return list0;
    }

    @Override  // okio.FileSystem
    @Nullable
    public List listOrNull(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        return this.a(path0, false);
    }

    @Override  // okio.FileSystem
    @Nullable
    public FileMetadata metadataOrNull(@NotNull Path path0) {
        Throwable throwable4;
        FileMetadata fileMetadata1;
        BufferedSource bufferedSource0;
        Intrinsics.checkNotNullParameter(path0, "path");
        Path path1 = ZipFileSystem.d.resolve(path0, true);
        ZipEntry zipEntry0 = (ZipEntry)this.c.get(path1);
        Throwable throwable0 = null;
        if(zipEntry0 == null) {
            return null;
        }
        FileMetadata fileMetadata0 = new FileMetadata(!zipEntry0.isDirectory(), zipEntry0.isDirectory(), null, (zipEntry0.isDirectory() ? null : zipEntry0.getSize()), null, zipEntry0.getLastModifiedAtMillis(), null, null, 0x80, null);
        if(zipEntry0.getOffset() == -1L) {
            return fileMetadata0;
        }
        FileHandle fileHandle0 = this.b.openReadOnly(this.a);
        try {
            bufferedSource0 = Okio.buffer(fileHandle0.source(zipEntry0.getOffset()));
        }
        catch(Throwable throwable1) {
            goto label_33;
        }
        try {
            fileMetadata1 = ZipFilesKt.readLocalHeader(bufferedSource0, fileMetadata0);
        }
        catch(Throwable throwable2) {
            if(bufferedSource0 != null) {
                try {
                    bufferedSource0.close();
                }
                catch(Throwable throwable3) {
                    try {
                        b.addSuppressed(throwable2, throwable3);
                        throwable4 = throwable2;
                        fileMetadata1 = null;
                        goto label_28;
                    }
                    catch(Throwable throwable1) {
                        goto label_33;
                    }
                }
            }
            throwable4 = throwable2;
            fileMetadata1 = null;
            goto label_28;
        }
        if(bufferedSource0 != null) {
            try {
                bufferedSource0.close();
            }
            catch(Throwable throwable4) {
                goto label_28;
            }
        }
        throwable4 = null;
        try {
        label_28:
            if(throwable4 != null) {
                throw throwable4;
            }
            Intrinsics.checkNotNull(fileMetadata1);
            goto label_41;
        label_33:
            if(fileHandle0 != null) {
                goto label_34;
            }
            fileMetadata1 = null;
            throwable0 = throwable1;
            goto label_44;
        }
        catch(Throwable throwable1) {
            goto label_33;
        }
        try {
        label_34:
            fileHandle0.close();
        }
        catch(Throwable throwable5) {
            b.addSuppressed(throwable1, throwable5);
        }
        fileMetadata1 = null;
        throwable0 = throwable1;
        goto label_44;
        try {
        label_41:
            fileHandle0.close();
        }
        catch(Throwable throwable0) {
        }
    label_44:
        if(throwable0 != null) {
            throw throwable0;
        }
        Intrinsics.checkNotNull(fileMetadata1);
        return fileMetadata1;
    }

    @Override  // okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override  // okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path path0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(path0, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override  // okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override  // okio.FileSystem
    @NotNull
    public Source source(@NotNull Path path0) throws IOException {
        BufferedSource bufferedSource0;
        Intrinsics.checkNotNullParameter(path0, "file");
        Path path1 = ZipFileSystem.d.resolve(path0, true);
        ZipEntry zipEntry0 = (ZipEntry)this.c.get(path1);
        if(zipEntry0 == null) {
            throw new FileNotFoundException("no such file: " + path0);
        }
        FileHandle fileHandle0 = this.b.openReadOnly(this.a);
        Throwable throwable0 = null;
        try {
            bufferedSource0 = Okio.buffer(fileHandle0.source(zipEntry0.getOffset()));
        }
        catch(Throwable throwable1) {
            if(fileHandle0 != null) {
                try {
                    fileHandle0.close();
                }
                catch(Throwable throwable2) {
                    b.addSuppressed(throwable1, throwable2);
                }
            }
            bufferedSource0 = null;
            throwable0 = throwable1;
            goto label_20;
        }
        try {
            fileHandle0.close();
        }
        catch(Throwable throwable0) {
        }
    label_20:
        if(throwable0 != null) {
            throw throwable0;
        }
        Intrinsics.checkNotNull(bufferedSource0);
        ZipFilesKt.skipLocalHeader(bufferedSource0);
        return zipEntry0.getCompressionMethod() == 0 ? new FixedLengthSource(bufferedSource0, zipEntry0.getSize(), true) : new FixedLengthSource(new InflaterSource(new FixedLengthSource(bufferedSource0, zipEntry0.getCompressedSize(), true), new Inflater(true)), zipEntry0.getSize(), false);
    }
}

