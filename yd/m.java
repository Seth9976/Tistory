package yd;

import java.nio.file.Path;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics.Kotlin;
import kotlin.jvm.internal.Intrinsics;

public final class m extends FunctionReferenceImpl implements Function2 {
    public final Function3 a;
    public final Path b;
    public final Path c;

    public m(Function3 function30, Path path0, Path path1) {
        this.a = function30;
        this.b = path0;
        this.c = path1;
        super(2, Kotlin.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Path)object0), "p0");
        Intrinsics.checkNotNullParameter(((Exception)object1), "p1");
        return n.a(this.a, this.b, this.c, ((Path)object0), ((Exception)object1));
    }
}

