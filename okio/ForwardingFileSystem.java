package okio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.h1;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0003\u0010\u0004J\'\u0010\n\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001F\u0010\f\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000E\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001D\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\u0013\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001F\u0010\u0017\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00142\u0006\u0010\u0013\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0016J%\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00050\u001A2\u0006\u0010\u0013\u001A\u00020\u00052\u0006\u0010\u0019\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u001D\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\'\u0010#\u001A\u00020\u001E2\u0006\u0010\u001D\u001A\u00020\u00052\u0006\u0010!\u001A\u00020\u00182\u0006\u0010\"\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b#\u0010$J\u0017\u0010&\u001A\u00020%2\u0006\u0010\u001D\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b&\u0010\'J\u001F\u0010)\u001A\u00020(2\u0006\u0010\u001D\u001A\u00020\u00052\u0006\u0010!\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b)\u0010*J\u001F\u0010+\u001A\u00020(2\u0006\u0010\u001D\u001A\u00020\u00052\u0006\u0010\"\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b+\u0010*J\u001F\u0010-\u001A\u00020,2\u0006\u0010\u0013\u001A\u00020\u00052\u0006\u0010!\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b-\u0010.J\u001F\u00100\u001A\u00020,2\u0006\u0010&\u001A\u00020\u00052\u0006\u0010/\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b0\u00101J\u001F\u00102\u001A\u00020,2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\"\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b2\u0010.J\u001F\u00103\u001A\u00020,2\u0006\u0010&\u001A\u00020\u00052\u0006\u0010/\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b3\u00101J\u000F\u00104\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b4\u00105R\u0017\u0010\u0002\u001A\u00020\u00018\u0007\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b\u0002\u00108\u00A8\u00069"}, d2 = {"Lokio/ForwardingFileSystem;", "Lokio/FileSystem;", "delegate", "<init>", "(Lokio/FileSystem;)V", "Lokio/Path;", "path", "", "functionName", "parameterName", "onPathParameter", "(Lokio/Path;Ljava/lang/String;Ljava/lang/String;)Lokio/Path;", "onPathResult", "(Lokio/Path;Ljava/lang/String;)Lokio/Path;", "canonicalize", "(Lokio/Path;)Lokio/Path;", "Lokio/FileMetadata;", "metadataOrNull", "(Lokio/Path;)Lokio/FileMetadata;", "dir", "", "list", "(Lokio/Path;)Ljava/util/List;", "listOrNull", "", "followSymlinks", "Lkotlin/sequences/Sequence;", "listRecursively", "(Lokio/Path;Z)Lkotlin/sequences/Sequence;", "file", "Lokio/FileHandle;", "openReadOnly", "(Lokio/Path;)Lokio/FileHandle;", "mustCreate", "mustExist", "openReadWrite", "(Lokio/Path;ZZ)Lokio/FileHandle;", "Lokio/Source;", "source", "(Lokio/Path;)Lokio/Source;", "Lokio/Sink;", "sink", "(Lokio/Path;Z)Lokio/Sink;", "appendingSink", "", "createDirectory", "(Lokio/Path;Z)V", "target", "atomicMove", "(Lokio/Path;Lokio/Path;)V", "delete", "createSymlink", "toString", "()Ljava/lang/String;", "a", "Lokio/FileSystem;", "()Lokio/FileSystem;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1620#2,3:244\n1620#2,3:247\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n166#1:244,3\n174#1:247,3\n*E\n"})
public abstract class ForwardingFileSystem extends FileSystem {
    public final FileSystem a;

    public ForwardingFileSystem(@NotNull FileSystem fileSystem0) {
        Intrinsics.checkNotNullParameter(fileSystem0, "delegate");
        super();
        this.a = fileSystem0;
    }

    @Override  // okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path path0, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "file");
        Path path1 = this.onPathParameter(path0, "appendingSink", "file");
        return this.a.appendingSink(path1, z);
    }

    @Override  // okio.FileSystem
    public void atomicMove(@NotNull Path path0, @NotNull Path path1) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "source");
        Intrinsics.checkNotNullParameter(path1, "target");
        Path path2 = this.onPathParameter(path0, "atomicMove", "source");
        Path path3 = this.onPathParameter(path1, "atomicMove", "target");
        this.a.atomicMove(path2, path3);
    }

    @Override  // okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "path");
        Path path1 = this.onPathParameter(path0, "canonicalize", "path");
        return this.onPathResult(this.a.canonicalize(path1), "canonicalize");
    }

    @Override  // okio.FileSystem
    public void createDirectory(@NotNull Path path0, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "dir");
        Path path1 = this.onPathParameter(path0, "createDirectory", "dir");
        this.a.createDirectory(path1, z);
    }

    @Override  // okio.FileSystem
    public void createSymlink(@NotNull Path path0, @NotNull Path path1) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "source");
        Intrinsics.checkNotNullParameter(path1, "target");
        Path path2 = this.onPathParameter(path0, "createSymlink", "source");
        Path path3 = this.onPathParameter(path1, "createSymlink", "target");
        this.a.createSymlink(path2, path3);
    }

    @JvmName(name = "delegate")
    @NotNull
    public final FileSystem delegate() {
        return this.a;
    }

    @Override  // okio.FileSystem
    public void delete(@NotNull Path path0, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "path");
        Path path1 = this.onPathParameter(path0, "delete", "path");
        this.a.delete(path1, z);
    }

    @Override  // okio.FileSystem
    @NotNull
    public List list(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "dir");
        Path path1 = this.onPathParameter(path0, "list", "dir");
        Iterable iterable0 = this.a.list(path1);
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            list0.add(this.onPathResult(((Path)object0), "list"));
        }
        n.sort(list0);
        return list0;
    }

    @Override  // okio.FileSystem
    @Nullable
    public List listOrNull(@NotNull Path path0) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        Path path1 = this.onPathParameter(path0, "listOrNull", "dir");
        List list0 = this.a.listOrNull(path1);
        if(list0 == null) {
            return null;
        }
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(this.onPathResult(((Path)object0), "listOrNull"));
        }
        n.sort(list1);
        return list1;
    }

    @Override  // okio.FileSystem
    @NotNull
    public Sequence listRecursively(@NotNull Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "dir");
        Path path1 = this.onPathParameter(path0, "listRecursively", "dir");
        return SequencesKt___SequencesKt.map(this.a.listRecursively(path1, z), new h1(this, 17));
    }

    @Override  // okio.FileSystem
    @Nullable
    public FileMetadata metadataOrNull(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "path");
        Path path1 = this.onPathParameter(path0, "metadataOrNull", "path");
        FileMetadata fileMetadata0 = this.a.metadataOrNull(path1);
        if(fileMetadata0 == null) {
            return null;
        }
        return fileMetadata0.getSymlinkTarget() == null ? fileMetadata0 : FileMetadata.copy$default(fileMetadata0, false, false, this.onPathResult(fileMetadata0.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 0xFB, null);
    }

    @NotNull
    public Path onPathParameter(@NotNull Path path0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(s, "functionName");
        Intrinsics.checkNotNullParameter(s1, "parameterName");
        return path0;
    }

    @NotNull
    public Path onPathResult(@NotNull Path path0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(s, "functionName");
        return path0;
    }

    @Override  // okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "file");
        Path path1 = this.onPathParameter(path0, "openReadOnly", "file");
        return this.a.openReadOnly(path1);
    }

    @Override  // okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path path0, boolean z, boolean z1) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "file");
        Path path1 = this.onPathParameter(path0, "openReadWrite", "file");
        return this.a.openReadWrite(path1, z, z1);
    }

    @Override  // okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path path0, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "file");
        Path path1 = this.onPathParameter(path0, "sink", "file");
        return this.a.sink(path1, z);
    }

    @Override  // okio.FileSystem
    @NotNull
    public Source source(@NotNull Path path0) throws IOException {
        Intrinsics.checkNotNullParameter(path0, "file");
        Path path1 = this.onPathParameter(path0, "source", "file");
        return this.a.source(path1);
    }

    @Override
    @NotNull
    public String toString() {
        return Reflection.getOrCreateKotlinClass(this.getClass()).getSimpleName() + '(' + this.a + ')';
    }
}

