package yd;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class c extends SimpleFileVisitor {
    public final Function2 a;
    public final Function2 b;
    public final Function2 c;
    public final Function2 d;

    public c(Function2 function20, Function2 function21, Function2 function22, Function2 function23) {
        this.a = function20;
        this.b = function21;
        this.c = function22;
        this.d = function23;
    }

    @Override
    public final FileVisitResult postVisitDirectory(Object object0, IOException iOException0) {
        FileVisitResult fileVisitResult0;
        Intrinsics.checkNotNullParameter(((Path)object0), "dir");
        Function2 function20 = this.d;
        if(function20 == null) {
            fileVisitResult0 = super.postVisitDirectory(((Path)object0), iOException0);
            Intrinsics.checkNotNullExpressionValue(fileVisitResult0, "postVisitDirectory(...)");
        }
        else {
            fileVisitResult0 = (FileVisitResult)function20.invoke(((Path)object0), iOException0);
            if(fileVisitResult0 == null) {
                fileVisitResult0 = super.postVisitDirectory(((Path)object0), iOException0);
                Intrinsics.checkNotNullExpressionValue(fileVisitResult0, "postVisitDirectory(...)");
                return fileVisitResult0;
            }
        }
        return fileVisitResult0;
    }

    @Override
    public final FileVisitResult preVisitDirectory(Object object0, BasicFileAttributes basicFileAttributes0) {
        FileVisitResult fileVisitResult0;
        Intrinsics.checkNotNullParameter(((Path)object0), "dir");
        Intrinsics.checkNotNullParameter(basicFileAttributes0, "attrs");
        Function2 function20 = this.a;
        if(function20 == null) {
            fileVisitResult0 = super.preVisitDirectory(((Path)object0), basicFileAttributes0);
            Intrinsics.checkNotNullExpressionValue(fileVisitResult0, "preVisitDirectory(...)");
        }
        else {
            fileVisitResult0 = (FileVisitResult)function20.invoke(((Path)object0), basicFileAttributes0);
            if(fileVisitResult0 == null) {
                fileVisitResult0 = super.preVisitDirectory(((Path)object0), basicFileAttributes0);
                Intrinsics.checkNotNullExpressionValue(fileVisitResult0, "preVisitDirectory(...)");
                return fileVisitResult0;
            }
        }
        return fileVisitResult0;
    }

    @Override
    public final FileVisitResult visitFile(Object object0, BasicFileAttributes basicFileAttributes0) {
        FileVisitResult fileVisitResult0;
        Intrinsics.checkNotNullParameter(((Path)object0), "file");
        Intrinsics.checkNotNullParameter(basicFileAttributes0, "attrs");
        Function2 function20 = this.b;
        if(function20 == null) {
            fileVisitResult0 = super.visitFile(((Path)object0), basicFileAttributes0);
            Intrinsics.checkNotNullExpressionValue(fileVisitResult0, "visitFile(...)");
        }
        else {
            fileVisitResult0 = (FileVisitResult)function20.invoke(((Path)object0), basicFileAttributes0);
            if(fileVisitResult0 == null) {
                fileVisitResult0 = super.visitFile(((Path)object0), basicFileAttributes0);
                Intrinsics.checkNotNullExpressionValue(fileVisitResult0, "visitFile(...)");
                return fileVisitResult0;
            }
        }
        return fileVisitResult0;
    }

    @Override
    public final FileVisitResult visitFileFailed(Object object0, IOException iOException0) {
        FileVisitResult fileVisitResult0;
        Intrinsics.checkNotNullParameter(((Path)object0), "file");
        Intrinsics.checkNotNullParameter(iOException0, "exc");
        Function2 function20 = this.c;
        if(function20 == null) {
            fileVisitResult0 = super.visitFileFailed(((Path)object0), iOException0);
            Intrinsics.checkNotNullExpressionValue(fileVisitResult0, "visitFileFailed(...)");
        }
        else {
            fileVisitResult0 = (FileVisitResult)function20.invoke(((Path)object0), iOException0);
            if(fileVisitResult0 == null) {
                fileVisitResult0 = super.visitFileFailed(((Path)object0), iOException0);
                Intrinsics.checkNotNullExpressionValue(fileVisitResult0, "visitFileFailed(...)");
                return fileVisitResult0;
            }
        }
        return fileVisitResult0;
    }
}

