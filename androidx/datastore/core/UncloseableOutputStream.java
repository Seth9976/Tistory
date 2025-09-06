package androidx.datastore.core;

import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\t\u0010\fJ\'\u0010\t\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/datastore/core/UncloseableOutputStream;", "Ljava/io/OutputStream;", "Ljava/io/FileOutputStream;", "fileOutputStream", "<init>", "(Ljava/io/FileOutputStream;)V", "", "b", "", "write", "(I)V", "", "([B)V", "bytes", "off", "len", "([BII)V", "close", "()V", "flush", "a", "Ljava/io/FileOutputStream;", "getFileOutputStream", "()Ljava/io/FileOutputStream;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class UncloseableOutputStream extends OutputStream {
    public final FileOutputStream a;

    public UncloseableOutputStream(@NotNull FileOutputStream fileOutputStream0) {
        Intrinsics.checkNotNullParameter(fileOutputStream0, "fileOutputStream");
        super();
        this.a = fileOutputStream0;
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
        this.a.flush();
    }

    @NotNull
    public final FileOutputStream getFileOutputStream() {
        return this.a;
    }

    @Override
    public void write(int v) {
        this.a.write(v);
    }

    @Override
    public void write(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "b");
        this.a.write(arr_b);
    }

    @Override
    public void write(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "bytes");
        this.a.write(arr_b, v, v1);
    }
}

