package kotlin.io;

import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import wd.f;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001A\u001B\u001CB\u001B\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000E\u001A\u00020\u00002\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000B¢\u0006\u0004\b\u000E\u0010\u000FJ!\u0010\u0011\u001A\u00020\u00002\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000B¢\u0006\u0004\b\u0011\u0010\u000FJ\'\u0010\u0014\u001A\u00020\u00002\u0018\u0010\r\u001A\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u0017\u001A\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001D"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "Lkotlin/io/FileWalkDirection;", "direction", "<init>", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/Function1;", "", "function", "onEnter", "(Lkotlin/jvm/functions/Function1;)Lkotlin/io/FileTreeWalk;", "", "onLeave", "Lkotlin/Function2;", "Ljava/io/IOException;", "onFail", "(Lkotlin/jvm/functions/Function2;)Lkotlin/io/FileTreeWalk;", "", "depth", "maxDepth", "(I)Lkotlin/io/FileTreeWalk;", "wd/b", "wd/f", "wd/g", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FileTreeWalk implements Sequence {
    public final File a;
    public final FileWalkDirection b;
    public final Function1 c;
    public final Function1 d;
    public final Function2 e;
    public final int f;

    public FileTreeWalk(@NotNull File file0, @NotNull FileWalkDirection fileWalkDirection0) {
        Intrinsics.checkNotNullParameter(file0, "start");
        Intrinsics.checkNotNullParameter(fileWalkDirection0, "direction");
        this(file0, fileWalkDirection0, null, null, null, 0x7FFFFFFF);
    }

    public FileTreeWalk(File file0, FileWalkDirection fileWalkDirection0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            fileWalkDirection0 = FileWalkDirection.TOP_DOWN;
        }
        this(file0, fileWalkDirection0);
    }

    public FileTreeWalk(File file0, FileWalkDirection fileWalkDirection0, Function1 function10, Function1 function11, Function2 function20, int v) {
        this.a = file0;
        this.b = fileWalkDirection0;
        this.c = function10;
        this.d = function11;
        this.e = function20;
        this.f = v;
    }

    @Override  // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return new f(this);
    }

    @NotNull
    public final FileTreeWalk maxDepth(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("depth must be positive, but was " + v + '.');
        }
        return new FileTreeWalk(this.a, this.b, this.c, this.d, this.e, v);
    }

    @NotNull
    public final FileTreeWalk onEnter(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        return new FileTreeWalk(this.a, this.b, function10, this.d, this.e, this.f);
    }

    @NotNull
    public final FileTreeWalk onFail(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "function");
        return new FileTreeWalk(this.a, this.b, this.c, this.d, function20, this.f);
    }

    @NotNull
    public final FileTreeWalk onLeave(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "function");
        return new FileTreeWalk(this.a, this.b, this.c, function10, this.e, this.f);
    }
}

