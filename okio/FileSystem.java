package okio;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import md.b;
import okio.internal.-FileSystem;
import okio.internal.ResourceFileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000F\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00A2\u0006\u0002\u0010\u0002J\u000E\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006J\u001A\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\bH&J\u0018\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0006H&J\u0010\u0010\r\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u0006H&J\u0018\u0010\u000F\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0006H\u0016J\u000E\u0010\u0010\u001A\u00020\n2\u0006\u0010\u0011\u001A\u00020\u0006J\u0018\u0010\u0010\u001A\u00020\n2\u0006\u0010\u0011\u001A\u00020\u00062\b\b\u0002\u0010\u0012\u001A\u00020\bJ\u000E\u0010\u0013\u001A\u00020\n2\u0006\u0010\u0011\u001A\u00020\u0006J\u001A\u0010\u0013\u001A\u00020\n2\u0006\u0010\u0011\u001A\u00020\u00062\b\b\u0002\u0010\u0012\u001A\u00020\bH&J\u0018\u0010\u0014\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0006H&J\u000E\u0010\u0015\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\u0006J\u001A\u0010\u0015\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\bH&J\u000E\u0010\u0016\u001A\u00020\n2\u0006\u0010\u0017\u001A\u00020\u0006J\u001A\u0010\u0016\u001A\u00020\n2\u0006\u0010\u0017\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\bH\u0016J\u000E\u0010\u0018\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\u0006J\u0016\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00060\u001A2\u0006\u0010\u0011\u001A\u00020\u0006H&J\u0018\u0010\u001B\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001A2\u0006\u0010\u0011\u001A\u00020\u0006H&J\u0014\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00060\u001D2\u0006\u0010\u0011\u001A\u00020\u0006J \u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00060\u001D2\u0006\u0010\u0011\u001A\u00020\u00062\b\b\u0002\u0010\u001E\u001A\u00020\bH\u0016J\u000E\u0010\u001F\u001A\u00020 2\u0006\u0010\u000E\u001A\u00020\u0006J\u0012\u0010!\u001A\u0004\u0018\u00010 2\u0006\u0010\u000E\u001A\u00020\u0006H&J\u0010\u0010\"\u001A\u00020#2\u0006\u0010\u0005\u001A\u00020\u0006H&J\u000E\u0010$\u001A\u00020#2\u0006\u0010\u0005\u001A\u00020\u0006J$\u0010$\u001A\u00020#2\u0006\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0012\u001A\u00020\b2\b\b\u0002\u0010\u0007\u001A\u00020\bH&J:\u0010%\u001A\u0002H&\"\u0004\b\u0000\u0010&2\u0006\u0010\u0005\u001A\u00020\u00062\u0017\u0010\'\u001A\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u0002H&0(\u00A2\u0006\u0002\b*H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010,J\u000E\u0010-\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006J\u001A\u0010-\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0012\u001A\u00020\bH&J\u0010\u0010\u000B\u001A\u00020.2\u0006\u0010\u0005\u001A\u00020\u0006H&JD\u0010/\u001A\u0002H&\"\u0004\b\u0000\u0010&2\u0006\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0012\u001A\u00020\b2\u0017\u00100\u001A\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002H&0(\u00A2\u0006\u0002\b*H\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u00065"}, d2 = {"Lokio/FileSystem;", "", "()V", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", "target", "canonicalize", "path", "copy", "createDirectories", "dir", "mustCreate", "createDirectory", "createSymlink", "delete", "deleteRecursively", "fileOrDirectory", "exists", "list", "", "listOrNull", "listRecursively", "Lkotlin/sequences/Sequence;", "followSymlinks", "metadata", "Lokio/FileMetadata;", "metadataOrNull", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "read", "T", "readerAction", "Lkotlin/Function1;", "Lokio/BufferedSource;", "Lkotlin/ExtensionFunctionType;", "-read", "(Lokio/Path;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "sink", "Lokio/Source;", "write", "writerAction", "Lokio/BufferedSink;", "-write", "(Lokio/Path;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,165:1\n52#2,21:166\n52#2,21:187\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n67#1:166,21\n81#1:187,21\n*E\n"})
public abstract class FileSystem {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0006\u001A\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000B\u001A\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lokio/FileSystem$Companion;", "", "Ljava/nio/file/FileSystem;", "Lokio/FileSystem;", "get", "(Ljava/nio/file/FileSystem;)Lokio/FileSystem;", "asOkioFileSystem", "RESOURCES", "Lokio/FileSystem;", "SYSTEM", "Lokio/Path;", "SYSTEM_TEMPORARY_DIRECTORY", "Lokio/Path;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmName(name = "get")
        @JvmStatic
        @NotNull
        public final FileSystem get(@NotNull java.nio.file.FileSystem fileSystem0) {
            Intrinsics.checkNotNullParameter(fileSystem0, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem0);
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final FileSystem RESOURCES;
    @JvmField
    @NotNull
    public static final FileSystem SYSTEM;
    @JvmField
    @NotNull
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    @JvmName(name = "-read")
    public final Object -read(@NotNull Path path0, @NotNull Function1 function10) throws IOException {
        Object object0;
        Intrinsics.checkNotNullParameter(path0, "file");
        Intrinsics.checkNotNullParameter(function10, "readerAction");
        BufferedSource bufferedSource0 = Okio.buffer(this.source(path0));
        Throwable throwable0 = null;
        try {
            object0 = function10.invoke(bufferedSource0);
        }
        catch(Throwable throwable1) {
            if(bufferedSource0 != null) {
                try {
                    bufferedSource0.close();
                }
                catch(Throwable throwable2) {
                    b.addSuppressed(throwable1, throwable2);
                }
            }
            throwable0 = throwable1;
            object0 = null;
            goto label_19;
        }
        if(bufferedSource0 != null) {
            try {
                bufferedSource0.close();
            }
            catch(Throwable throwable0) {
            }
        }
    label_19:
        if(throwable0 != null) {
            throw throwable0;
        }
        Intrinsics.checkNotNull(object0);
        return object0;
    }

    @JvmName(name = "-write")
    public final Object -write(@NotNull Path path0, boolean z, @NotNull Function1 function10) throws IOException {
        Object object0;
        Intrinsics.checkNotNullParameter(path0, "file");
        Intrinsics.checkNotNullParameter(function10, "writerAction");
        BufferedSink bufferedSink0 = Okio.buffer(this.sink(path0, z));
        Throwable throwable0 = null;
        try {
            object0 = function10.invoke(bufferedSink0);
        }
        catch(Throwable throwable1) {
            if(bufferedSink0 != null) {
                try {
                    bufferedSink0.close();
                }
                catch(Throwable throwable2) {
                    b.addSuppressed(throwable1, throwable2);
                }
            }
            throwable0 = throwable1;
            object0 = null;
            goto label_19;
        }
        if(bufferedSink0 != null) {
            try {
                bufferedSink0.close();
            }
            catch(Throwable throwable0) {
            }
        }
    label_19:
        if(throwable0 != null) {
            throw throwable0;
        }
        Intrinsics.checkNotNull(object0);
        return object0;
    }

    public static Object -write$default(FileSystem fileSystem0, Path path0, boolean z, Function1 function10, int v, Object object0) throws IOException {
        Object object1;
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if((v & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(path0, "file");
        Intrinsics.checkNotNullParameter(function10, "writerAction");
        BufferedSink bufferedSink0 = Okio.buffer(fileSystem0.sink(path0, z));
        Throwable throwable0 = null;
        try {
            object1 = function10.invoke(bufferedSink0);
        }
        catch(Throwable throwable1) {
            if(bufferedSink0 != null) {
                try {
                    bufferedSink0.close();
                }
                catch(Throwable throwable2) {
                    b.addSuppressed(throwable1, throwable2);
                }
            }
            object1 = null;
            throwable0 = throwable1;
            goto label_22;
        }
        if(bufferedSink0 != null) {
            try {
                bufferedSink0.close();
            }
            catch(Throwable throwable0) {
            }
        }
    label_22:
        if(throwable0 != null) {
            throw throwable0;
        }
        Intrinsics.checkNotNull(object1);
        return object1;
    }

    static {
        JvmSystemFileSystem jvmSystemFileSystem0;
        FileSystem.Companion = new Companion(null);
        try {
            jvmSystemFileSystem0 = new NioSystemFileSystem();
        }
        catch(ClassNotFoundException unused_ex) {
            jvmSystemFileSystem0 = new JvmSystemFileSystem();
        }
        FileSystem.SYSTEM = jvmSystemFileSystem0;
        Intrinsics.checkNotNullExpressionValue("/data/user/0/net.daum.android.tistoryapp/cache", "getProperty(...)");
        FileSystem.SYSTEM_TEMPORARY_DIRECTORY = okio.Path.Companion.get$default(Path.Companion, "/data/user/0/net.daum.android.tistoryapp/cache", false, 1, null);
        ClassLoader classLoader0 = ResourceFileSystem.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader0, "getClassLoader(...)");
        FileSystem.RESOURCES = new ResourceFileSystem(classLoader0, false, null, 4, null);
    }

    @NotNull
    public final Sink appendingSink(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "file");
        return this.appendingSink(path0, false);
    }

    @NotNull
    public abstract Sink appendingSink(@NotNull Path arg1, boolean arg2) throws IOException;

    public static Sink appendingSink$default(FileSystem fileSystem0, Path path0, boolean z, int v, Object object0) throws IOException {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if((v & 2) != 0) {
            z = false;
        }
        return fileSystem0.appendingSink(path0, z);
    }

    public abstract void atomicMove(@NotNull Path arg1, @NotNull Path arg2) throws IOException;

    @NotNull
    public abstract Path canonicalize(@NotNull Path arg1) throws IOException;

    public void copy(@NotNull Path path0, @NotNull Path path1) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "source");
        Intrinsics.checkNotNullParameter(path1, "target");
        -FileSystem.commonCopy(this, path0, path1);
    }

    public final void createDirectories(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "dir");
        this.createDirectories(path0, false);
    }

    public final void createDirectories(@NotNull Path path0, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "dir");
        -FileSystem.commonCreateDirectories(this, path0, z);
    }

    public static void createDirectories$default(FileSystem fileSystem0, Path path0, boolean z, int v, Object object0) throws IOException {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if((v & 2) != 0) {
            z = false;
        }
        fileSystem0.createDirectories(path0, z);
    }

    public final void createDirectory(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "dir");
        this.createDirectory(path0, false);
    }

    public abstract void createDirectory(@NotNull Path arg1, boolean arg2) throws IOException;

    public static void createDirectory$default(FileSystem fileSystem0, Path path0, boolean z, int v, Object object0) throws IOException {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if((v & 2) != 0) {
            z = false;
        }
        fileSystem0.createDirectory(path0, z);
    }

    public abstract void createSymlink(@NotNull Path arg1, @NotNull Path arg2) throws IOException;

    public final void delete(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "path");
        this.delete(path0, false);
    }

    public abstract void delete(@NotNull Path arg1, boolean arg2) throws IOException;

    public static void delete$default(FileSystem fileSystem0, Path path0, boolean z, int v, Object object0) throws IOException {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if((v & 2) != 0) {
            z = false;
        }
        fileSystem0.delete(path0, z);
    }

    public final void deleteRecursively(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "fileOrDirectory");
        this.deleteRecursively(path0, false);
    }

    public void deleteRecursively(@NotNull Path path0, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "fileOrDirectory");
        -FileSystem.commonDeleteRecursively(this, path0, z);
    }

    public static void deleteRecursively$default(FileSystem fileSystem0, Path path0, boolean z, int v, Object object0) throws IOException {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if((v & 2) != 0) {
            z = false;
        }
        fileSystem0.deleteRecursively(path0, z);
    }

    public final boolean exists(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "path");
        return -FileSystem.commonExists(this, path0);
    }

    @JvmName(name = "get")
    @JvmStatic
    @NotNull
    public static final FileSystem get(@NotNull java.nio.file.FileSystem fileSystem0) {
        return FileSystem.Companion.get(fileSystem0);
    }

    @NotNull
    public abstract List list(@NotNull Path arg1) throws IOException;

    @Nullable
    public abstract List listOrNull(@NotNull Path arg1);

    @NotNull
    public final Sequence listRecursively(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        return this.listRecursively(path0, false);
    }

    @NotNull
    public Sequence listRecursively(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        return -FileSystem.commonListRecursively(this, path0, z);
    }

    public static Sequence listRecursively$default(FileSystem fileSystem0, Path path0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if((v & 2) != 0) {
            z = false;
        }
        return fileSystem0.listRecursively(path0, z);
    }

    @NotNull
    public final FileMetadata metadata(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "path");
        return -FileSystem.commonMetadata(this, path0);
    }

    @Nullable
    public abstract FileMetadata metadataOrNull(@NotNull Path arg1) throws IOException;

    @NotNull
    public abstract FileHandle openReadOnly(@NotNull Path arg1) throws IOException;

    @NotNull
    public final FileHandle openReadWrite(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "file");
        return this.openReadWrite(path0, false, false);
    }

    @NotNull
    public abstract FileHandle openReadWrite(@NotNull Path arg1, boolean arg2, boolean arg3) throws IOException;

    public static FileHandle openReadWrite$default(FileSystem fileSystem0, Path path0, boolean z, boolean z1, int v, Object object0) throws IOException {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            z1 = false;
        }
        return fileSystem0.openReadWrite(path0, z, z1);
    }

    @NotNull
    public final Sink sink(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "file");
        return this.sink(path0, false);
    }

    @NotNull
    public abstract Sink sink(@NotNull Path arg1, boolean arg2) throws IOException;

    public static Sink sink$default(FileSystem fileSystem0, Path path0, boolean z, int v, Object object0) throws IOException {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if((v & 2) != 0) {
            z = false;
        }
        return fileSystem0.sink(path0, z);
    }

    @NotNull
    public abstract Source source(@NotNull Path arg1) throws IOException;
}

