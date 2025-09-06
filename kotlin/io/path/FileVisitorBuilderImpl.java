package kotlin.io.path;

import java.nio.file.FileVisitor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yd.c;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000E\u001A\u00020\r26\u0010\f\u001A2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0004H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJG\u0010\u0011\u001A\u00020\r26\u0010\f\u001A2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u000FJG\u0010\u0014\u001A\u00020\r26\u0010\f\u001A2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000B0\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u000FJI\u0010\u0015\u001A\u00020\r28\u0010\f\u001A4\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000B0\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u000FJ\u0013\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkotlin/io/path/FileVisitorBuilderImpl;", "Lkotlin/io/path/FileVisitorBuilder;", "<init>", "()V", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/ParameterName;", "name", "directory", "Ljava/nio/file/attribute/BasicFileAttributes;", "attributes", "Ljava/nio/file/FileVisitResult;", "function", "", "onPreVisitDirectory", "(Lkotlin/jvm/functions/Function2;)V", "file", "onVisitFile", "Ljava/io/IOException;", "exception", "onVisitFileFailed", "onPostVisitDirectory", "Ljava/nio/file/FileVisitor;", "build", "()Ljava/nio/file/FileVisitor;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@ExperimentalPathApi
public final class FileVisitorBuilderImpl implements FileVisitorBuilder {
    public Function2 a;
    public Function2 b;
    public Function2 c;
    public Function2 d;
    public boolean e;

    public final void a() {
        if(this.e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    public static void b(Object object0, String s) {
        if(object0 != null) {
            throw new IllegalStateException(s + " was already defined");
        }
    }

    @NotNull
    public final FileVisitor build() {
        this.a();
        this.e = true;
        return new c(this.a, this.b, this.c, this.d);
    }

    @Override  // kotlin.io.path.FileVisitorBuilder
    public void onPostVisitDirectory(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "function");
        this.a();
        FileVisitorBuilderImpl.b(this.d, "onPostVisitDirectory");
        this.d = function20;
    }

    @Override  // kotlin.io.path.FileVisitorBuilder
    public void onPreVisitDirectory(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "function");
        this.a();
        FileVisitorBuilderImpl.b(this.a, "onPreVisitDirectory");
        this.a = function20;
    }

    @Override  // kotlin.io.path.FileVisitorBuilder
    public void onVisitFile(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "function");
        this.a();
        FileVisitorBuilderImpl.b(this.b, "onVisitFile");
        this.b = function20;
    }

    @Override  // kotlin.io.path.FileVisitorBuilder
    public void onVisitFileFailed(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "function");
        this.a();
        FileVisitorBuilderImpl.b(this.c, "onVisitFileFailed");
        this.c = function20;
    }
}

