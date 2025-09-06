package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000E\b\u0016\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001A\u0004\b\u000E\u0010\fR\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "Ljava/io/File;", "file", "other", "", "reason", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V", "a", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "b", "getOther", "c", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class FileSystemException extends IOException {
    public final File a;
    public final File b;
    public final String c;

    public FileSystemException(@NotNull File file0, @Nullable File file1, @Nullable String s) {
        Intrinsics.checkNotNullParameter(file0, "file");
        super(ExceptionsKt.access$constructMessage(file0, file1, s));
        this.a = file0;
        this.b = file1;
        this.c = s;
    }

    public FileSystemException(File file0, File file1, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            file1 = null;
        }
        if((v & 4) != 0) {
            s = null;
        }
        this(file0, file1, s);
    }

    @NotNull
    public final File getFile() {
        return this.a;
    }

    @Nullable
    public final File getOther() {
        return this.b;
    }

    @Nullable
    public final String getReason() {
        return this.c;
    }
}

