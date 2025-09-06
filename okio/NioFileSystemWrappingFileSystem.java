package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.collections.n;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;
import yd.o;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000B\u001A\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00060\u000E2\u0006\u0010\r\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000E2\u0006\u0010\r\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\'\u0010\u0019\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0018\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u0012\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001F\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u001F\u0010!\u001A\u00020\u001E2\u0006\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b!\u0010 J\u001F\u0010#\u001A\u00020\"2\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b#\u0010$J\u001F\u0010&\u001A\u00020\"2\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010%\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b&\u0010\'J\u001F\u0010(\u001A\u00020\"2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b(\u0010$J\u001F\u0010)\u001A\u00020\"2\u0006\u0010\u001C\u001A\u00020\u00062\u0006\u0010%\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b)\u0010\'J\u000F\u0010+\u001A\u00020*H\u0016\u00A2\u0006\u0004\b+\u0010,\u00A8\u0006-"}, d2 = {"Lokio/NioFileSystemWrappingFileSystem;", "Lokio/NioSystemFileSystem;", "Ljava/nio/file/FileSystem;", "nioFileSystem", "<init>", "(Ljava/nio/file/FileSystem;)V", "Lokio/Path;", "path", "canonicalize", "(Lokio/Path;)Lokio/Path;", "Lokio/FileMetadata;", "metadataOrNull", "(Lokio/Path;)Lokio/FileMetadata;", "dir", "", "list", "(Lokio/Path;)Ljava/util/List;", "listOrNull", "file", "Lokio/FileHandle;", "openReadOnly", "(Lokio/Path;)Lokio/FileHandle;", "", "mustCreate", "mustExist", "openReadWrite", "(Lokio/Path;ZZ)Lokio/FileHandle;", "Lokio/Source;", "source", "(Lokio/Path;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Path;Z)Lokio/Sink;", "appendingSink", "", "createDirectory", "(Lokio/Path;Z)V", "target", "atomicMove", "(Lokio/Path;Lokio/Path;)V", "delete", "createSymlink", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNioFileSystemWrappingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,192:1\n1620#2,3:193\n1#3:196\n37#4,2:197\n37#4,2:199\n37#4,2:201\n*S KotlinDebug\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n*L\n77#1:193,3\n104#1:197,2\n125#1:199,2\n138#1:201,2\n*E\n"})
public final class NioFileSystemWrappingFileSystem extends NioSystemFileSystem {
    public final FileSystem a;

    public NioFileSystemWrappingFileSystem(@NotNull FileSystem fileSystem0) {
        Intrinsics.checkNotNullParameter(fileSystem0, "nioFileSystem");
        super();
        this.a = fileSystem0;
    }

    @Override  // okio.JvmSystemFileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "file");
        List list0 = k.createListBuilder();
        list0.add(StandardOpenOption.APPEND);
        if(!z) {
            list0.add(StandardOpenOption.CREATE);
        }
        List list1 = k.build(list0);
        java.nio.file.Path path1 = this.d(path0);
        StandardOpenOption[] arr_standardOpenOption = (StandardOpenOption[])list1.toArray(new StandardOpenOption[0]);
        OpenOption[] arr_openOption = (OpenOption[])Arrays.copyOf(arr_standardOpenOption, arr_standardOpenOption.length);
        OutputStream outputStream0 = Files.newOutputStream(path1, ((OpenOption[])Arrays.copyOf(arr_openOption, arr_openOption.length)));
        Intrinsics.checkNotNullExpressionValue(outputStream0, "newOutputStream(...)");
        return Okio.sink(outputStream0);
    }

    @Override  // okio.NioSystemFileSystem
    public void atomicMove(@NotNull Path path0, @NotNull Path path1) {
        Intrinsics.checkNotNullParameter(path0, "source");
        Intrinsics.checkNotNullParameter(path1, "target");
        try {
            Intrinsics.checkNotNullExpressionValue(Files.move(this.d(path0), this.d(path1), ((CopyOption[])Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2))), "move(...)");
        }
        catch(NoSuchFileException noSuchFileException0) {
            throw new FileNotFoundException(noSuchFileException0.getMessage());
        }
        catch(UnsupportedOperationException unused_ex) {
            throw new IOException("atomic move not supported");
        }
    }

    public final ArrayList c(Path path0, boolean z) {
        java.nio.file.Path path1 = this.d(path0);
        try {
            List list0 = o.listDirectoryEntries$default(path1, null, 1, null);
        }
        catch(Exception unused_ex) {
            if(z) {
                if(Files.exists(path1, ((LinkOption[])Arrays.copyOf(new LinkOption[0], 0)))) {
                    throw new IOException("failed to list " + path0);
                }
                throw new FileNotFoundException("no such file: " + path0);
            }
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(Companion.get$default(Path.Companion, ((java.nio.file.Path)object0), false, 1, null));
        }
        n.sort(arrayList0);
        return arrayList0;
    }

    @Override  // okio.JvmSystemFileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "path");
        try {
            java.nio.file.Path path1 = this.d(path0).toRealPath(new LinkOption[0]);
            Intrinsics.checkNotNullExpressionValue(path1, "toRealPath(...)");
            return Companion.get$default(Path.Companion, path1, false, 1, null);
        }
        catch(NoSuchFileException unused_ex) {
            throw new FileNotFoundException("no such file: " + path0);
        }
    }

    @Override  // okio.JvmSystemFileSystem
    public void createDirectory(@NotNull Path path0, boolean z) {
        boolean z1 = true;
        Intrinsics.checkNotNullParameter(path0, "dir");
        FileMetadata fileMetadata0 = this.metadataOrNull(path0);
        if(fileMetadata0 == null || !fileMetadata0.isDirectory()) {
            z1 = false;
        }
        else if(z) {
            throw new IOException(path0 + " already exists.");
        }
        try {
            Intrinsics.checkNotNullExpressionValue(Files.createDirectory(this.d(path0), ((FileAttribute[])Arrays.copyOf(new FileAttribute[0], 0))), "createDirectory(...)");
        }
        catch(IOException iOException0) {
            if(!z1) {
                throw new IOException("failed to create directory: " + path0, iOException0);
            }
        }
    }

    @Override  // okio.NioSystemFileSystem
    public void createSymlink(@NotNull Path path0, @NotNull Path path1) {
        Intrinsics.checkNotNullParameter(path0, "source");
        Intrinsics.checkNotNullParameter(path1, "target");
        Intrinsics.checkNotNullExpressionValue(Files.createSymbolicLink(this.d(path0), this.d(path1), ((FileAttribute[])Arrays.copyOf(new FileAttribute[0], 0))), "createSymbolicLink(...)");
    }

    public final java.nio.file.Path d(Path path0) {
        java.nio.file.Path path1 = this.a.getPath(path0.toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path1, "getPath(...)");
        return path1;
    }

    @Override  // okio.JvmSystemFileSystem
    public void delete(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "path");
        if(Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        java.nio.file.Path path1 = this.d(path0);
        try {
            Files.delete(path1);
        }
        catch(NoSuchFileException unused_ex) {
            if(z) {
                throw new FileNotFoundException("no such file: " + path0);
            }
        }
        catch(IOException unused_ex) {
            if(Files.exists(path1, ((LinkOption[])Arrays.copyOf(new LinkOption[0], 0)))) {
                throw new IOException("failed to delete " + path0);
            }
        }
    }

    @Override  // okio.JvmSystemFileSystem
    @NotNull
    public List list(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        List list0 = this.c(path0, true);
        Intrinsics.checkNotNull(list0);
        return list0;
    }

    @Override  // okio.JvmSystemFileSystem
    @Nullable
    public List listOrNull(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        return this.c(path0, false);
    }

    @Override  // okio.NioSystemFileSystem
    @Nullable
    public FileMetadata metadataOrNull(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "path");
        return this.metadataOrNull(this.d(path0));
    }

    @Override  // okio.JvmSystemFileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path path0) {
        FileChannel fileChannel0;
        Intrinsics.checkNotNullParameter(path0, "file");
        try {
            fileChannel0 = FileChannel.open(this.d(path0), new OpenOption[]{StandardOpenOption.READ});
        }
        catch(NoSuchFileException unused_ex) {
            throw new FileNotFoundException("no such file: " + path0);
        }
        Intrinsics.checkNotNull(fileChannel0);
        return new NioFileSystemFileHandle(false, fileChannel0);
    }

    @Override  // okio.JvmSystemFileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path path0, boolean z, boolean z1) {
        FileChannel fileChannel0;
        Intrinsics.checkNotNullParameter(path0, "file");
        if(z && z1) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        List list0 = k.createListBuilder();
        list0.add(StandardOpenOption.READ);
        list0.add(StandardOpenOption.WRITE);
        if(z) {
            list0.add(StandardOpenOption.CREATE_NEW);
        }
        else if(!z1) {
            list0.add(StandardOpenOption.CREATE);
        }
        List list1 = k.build(list0);
        try {
            java.nio.file.Path path1 = this.d(path0);
            StandardOpenOption[] arr_standardOpenOption = (StandardOpenOption[])list1.toArray(new StandardOpenOption[0]);
            fileChannel0 = FileChannel.open(path1, ((OpenOption[])Arrays.copyOf(arr_standardOpenOption, arr_standardOpenOption.length)));
        }
        catch(NoSuchFileException unused_ex) {
            throw new FileNotFoundException("no such file: " + path0);
        }
        Intrinsics.checkNotNull(fileChannel0);
        return new NioFileSystemFileHandle(true, fileChannel0);
    }

    @Override  // okio.JvmSystemFileSystem
    @NotNull
    public Sink sink(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "file");
        List list0 = k.createListBuilder();
        if(z) {
            list0.add(StandardOpenOption.CREATE_NEW);
        }
        List list1 = k.build(list0);
        try {
            java.nio.file.Path path1 = this.d(path0);
            StandardOpenOption[] arr_standardOpenOption = (StandardOpenOption[])list1.toArray(new StandardOpenOption[0]);
            OpenOption[] arr_openOption = (OpenOption[])Arrays.copyOf(arr_standardOpenOption, arr_standardOpenOption.length);
            OutputStream outputStream0 = Files.newOutputStream(path1, ((OpenOption[])Arrays.copyOf(arr_openOption, arr_openOption.length)));
            Intrinsics.checkNotNullExpressionValue(outputStream0, "newOutputStream(...)");
            return Okio.sink(outputStream0);
        }
        catch(NoSuchFileException unused_ex) {
            throw new FileNotFoundException("no such file: " + path0);
        }
    }

    @Override  // okio.JvmSystemFileSystem
    @NotNull
    public Source source(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "file");
        try {
            InputStream inputStream0 = Files.newInputStream(this.d(path0), ((OpenOption[])Arrays.copyOf(new OpenOption[0], 0)));
            Intrinsics.checkNotNullExpressionValue(inputStream0, "newInputStream(...)");
            return Okio.source(inputStream0);
        }
        catch(NoSuchFileException unused_ex) {
            throw new FileNotFoundException(a.q(path0, "no such file: "));
        }
    }

    @Override  // okio.NioSystemFileSystem
    @NotNull
    public String toString() {
        String s = Reflection.getOrCreateKotlinClass(this.a.getClass()).getSimpleName();
        Intrinsics.checkNotNull(s);
        return s;
    }
}

