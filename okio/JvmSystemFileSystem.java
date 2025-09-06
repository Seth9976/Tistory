package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\t\u0010\nJ\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u000B\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f2\u0006\u0010\u000B\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0017\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\'\u0010\u0017\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0010\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001F\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u001F\u0010\u001F\u001A\u00020\u001C2\u0006\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u001F\u0010\u001EJ\u001F\u0010!\u001A\u00020 2\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b!\u0010\"J\u001F\u0010$\u001A\u00020 2\u0006\u0010\u001A\u001A\u00020\u00042\u0006\u0010#\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b$\u0010%J\u001F\u0010&\u001A\u00020 2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b&\u0010\"J\u001F\u0010\'\u001A\u00020 2\u0006\u0010\u001A\u001A\u00020\u00042\u0006\u0010#\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b\'\u0010%J\u000F\u0010)\u001A\u00020(H\u0016\u00A2\u0006\u0004\b)\u0010*\u00A8\u0006+"}, d2 = {"Lokio/JvmSystemFileSystem;", "Lokio/FileSystem;", "<init>", "()V", "Lokio/Path;", "path", "canonicalize", "(Lokio/Path;)Lokio/Path;", "Lokio/FileMetadata;", "metadataOrNull", "(Lokio/Path;)Lokio/FileMetadata;", "dir", "", "list", "(Lokio/Path;)Ljava/util/List;", "listOrNull", "file", "Lokio/FileHandle;", "openReadOnly", "(Lokio/Path;)Lokio/FileHandle;", "", "mustCreate", "mustExist", "openReadWrite", "(Lokio/Path;ZZ)Lokio/FileHandle;", "Lokio/Source;", "source", "(Lokio/Path;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Path;Z)Lokio/Sink;", "appendingSink", "", "createDirectory", "(Lokio/Path;Z)V", "target", "atomicMove", "(Lokio/Path;Lokio/Path;)V", "delete", "createSymlink", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n11400#2,3:159\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:159,3\n*E\n"})
public class JvmSystemFileSystem extends FileSystem {
    public static ArrayList a(Path path0, boolean z) {
        File file0 = path0.toFile();
        String[] arr_s = file0.list();
        if(arr_s == null) {
            if(z) {
                if(!file0.exists()) {
                    throw new FileNotFoundException("no such file: " + path0);
                }
                throw new IOException("failed to list " + path0);
            }
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            Intrinsics.checkNotNull(s);
            arrayList0.add(path0.resolve(s));
        }
        n.sort(arrayList0);
        return arrayList0;
    }

    @Override  // okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "file");
        if(z && !this.exists(path0)) {
            throw new IOException(path0 + " doesn\'t exist.");
        }
        return Okio.sink(path0.toFile(), true);
    }

    @Override  // okio.FileSystem
    public void atomicMove(@NotNull Path path0, @NotNull Path path1) {
        Intrinsics.checkNotNullParameter(path0, "source");
        Intrinsics.checkNotNullParameter(path1, "target");
        if(!path0.toFile().renameTo(path1.toFile())) {
            throw new IOException("failed to move " + path0 + " to " + path1);
        }
    }

    @Override  // okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "path");
        File file0 = path0.toFile().getCanonicalFile();
        if(!file0.exists()) {
            throw new FileNotFoundException("no such file");
        }
        Intrinsics.checkNotNull(file0);
        return Companion.get$default(Path.Companion, file0, false, 1, null);
    }

    @Override  // okio.FileSystem
    public void createDirectory(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        if(!path0.toFile().mkdir()) {
            FileMetadata fileMetadata0 = this.metadataOrNull(path0);
            if(fileMetadata0 == null || !fileMetadata0.isDirectory()) {
                throw new IOException("failed to create directory: " + path0);
            }
            if(z) {
                throw new IOException(path0 + " already exists.");
            }
        }
    }

    @Override  // okio.FileSystem
    public void createSymlink(@NotNull Path path0, @NotNull Path path1) {
        Intrinsics.checkNotNullParameter(path0, "source");
        Intrinsics.checkNotNullParameter(path1, "target");
        throw new IOException("unsupported");
    }

    @Override  // okio.FileSystem
    public void delete(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "path");
        if(Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file0 = path0.toFile();
        if(!file0.delete()) {
            if(file0.exists()) {
                throw new IOException("failed to delete " + path0);
            }
            if(z) {
                throw new FileNotFoundException("no such file: " + path0);
            }
        }
    }

    @Override  // okio.FileSystem
    @NotNull
    public List list(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        List list0 = JvmSystemFileSystem.a(path0, true);
        Intrinsics.checkNotNull(list0);
        return list0;
    }

    @Override  // okio.FileSystem
    @Nullable
    public List listOrNull(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        return JvmSystemFileSystem.a(path0, false);
    }

    @Override  // okio.FileSystem
    @Nullable
    public FileMetadata metadataOrNull(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "path");
        File file0 = path0.toFile();
        boolean z = file0.isFile();
        boolean z1 = file0.isDirectory();
        long v = file0.lastModified();
        long v1 = file0.length();
        return z || z1 || v != 0L || v1 != 0L || file0.exists() ? new FileMetadata(z, z1, null, v1, null, v, null, null, 0x80, null) : null;
    }

    @Override  // okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "file");
        return new JvmFileHandle(false, new RandomAccessFile(path0.toFile(), "r"));
    }

    @Override  // okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path path0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(path0, "file");
        if(z && z1) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if(z && this.exists(path0)) {
            throw new IOException(path0 + " already exists.");
        }
        if(z1 && !this.exists(path0)) {
            throw new IOException(path0 + " doesn\'t exist.");
        }
        return new JvmFileHandle(true, new RandomAccessFile(path0.toFile(), "rw"));
    }

    @Override  // okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "file");
        if(z && this.exists(path0)) {
            throw new IOException(path0 + " already exists.");
        }
        return Okio.sink$default(path0.toFile(), false, 1, null);
    }

    @Override  // okio.FileSystem
    @NotNull
    public Source source(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "file");
        return Okio.source(path0.toFile());
    }

    @Override
    @NotNull
    public String toString() {
        return "JvmSystemFileSystem";
    }
}

