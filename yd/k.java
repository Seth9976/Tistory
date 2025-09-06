package yd;

import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics.Kotlin;
import kotlin.jvm.internal.Intrinsics;

public final class k extends FunctionReferenceImpl implements Function2 {
    public final Function3 a;
    public final Path b;
    public final Path c;
    public final Function3 d;

    public k(Function3 function30, Path path0, Path path1, Function3 function31) {
        this.a = function30;
        this.b = path0;
        this.c = path1;
        this.d = function31;
        super(2, Kotlin.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Path)object0), "p0");
        Intrinsics.checkNotNullParameter(((BasicFileAttributes)object1), "p1");
        return n.access$copyToRecursively$copy(this.a, this.b, this.c, this.d, ((Path)object0), ((BasicFileAttributes)object1));
    }
}

