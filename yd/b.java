package yd;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Set;
import kotlin.collections.ArrayDeque;
import kotlin.io.path.LinkFollowing;
import kotlin.jvm.internal.Intrinsics;

public final class b extends SimpleFileVisitor {
    public final boolean a;
    public d b;
    public ArrayDeque c;

    public b(boolean z) {
        this.a = z;
        this.c = new ArrayDeque();
    }

    public final ArrayDeque a(d d0) {
        Intrinsics.checkNotNullParameter(d0, "directoryNode");
        this.b = d0;
        Set set0 = LinkFollowing.INSTANCE.toVisitOptions(this.a);
        Files.walkFileTree(d0.a, set0, 1, this);
        this.c.removeFirst();
        ArrayDeque arrayDeque0 = this.c;
        this.c = new ArrayDeque();
        return arrayDeque0;
    }

    @Override
    public final FileVisitResult preVisitDirectory(Object object0, BasicFileAttributes basicFileAttributes0) {
        Intrinsics.checkNotNullParameter(((Path)object0), "dir");
        Intrinsics.checkNotNullParameter(basicFileAttributes0, "attrs");
        d d0 = new d(((Path)object0), basicFileAttributes0.fileKey(), this.b);
        this.c.add(d0);
        FileVisitResult fileVisitResult0 = super.preVisitDirectory(((Path)object0), basicFileAttributes0);
        Intrinsics.checkNotNullExpressionValue(fileVisitResult0, "preVisitDirectory(...)");
        return fileVisitResult0;
    }

    @Override
    public final FileVisitResult visitFile(Object object0, BasicFileAttributes basicFileAttributes0) {
        Intrinsics.checkNotNullParameter(((Path)object0), "file");
        Intrinsics.checkNotNullParameter(basicFileAttributes0, "attrs");
        d d0 = new d(((Path)object0), null, this.b);
        this.c.add(d0);
        FileVisitResult fileVisitResult0 = super.visitFile(((Path)object0), basicFileAttributes0);
        Intrinsics.checkNotNullExpressionValue(fileVisitResult0, "visitFile(...)");
        return fileVisitResult0;
    }
}

