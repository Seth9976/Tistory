package e4;

import android.system.ErrnoException;
import android.system.Os;
import androidx.annotation.DoNotInline;
import java.io.FileDescriptor;

public abstract class h {
    @DoNotInline
    public static void a(FileDescriptor fileDescriptor0) throws ErrnoException {
        Os.close(fileDescriptor0);
    }

    @DoNotInline
    public static FileDescriptor b(FileDescriptor fileDescriptor0) throws ErrnoException {
        return Os.dup(fileDescriptor0);
    }

    @DoNotInline
    public static long c(FileDescriptor fileDescriptor0, long v, int v1) throws ErrnoException {
        return Os.lseek(fileDescriptor0, v, v1);
    }
}

