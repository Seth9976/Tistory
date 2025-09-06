package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
import okio.Sink;
import okio.Source;

public final class a implements FileSystem {
    @Override  // okhttp3.internal.io.FileSystem
    public final Sink appendingSink(File file0) {
        Intrinsics.checkNotNullParameter(file0, "file");
        try {
            return Okio.appendingSink(file0);
        }
        catch(FileNotFoundException unused_ex) {
            file0.getParentFile().mkdirs();
            return Okio.appendingSink(file0);
        }
    }

    @Override  // okhttp3.internal.io.FileSystem
    public final void delete(File file0) {
        Intrinsics.checkNotNullParameter(file0, "file");
        if(!file0.delete() && file0.exists()) {
            throw new IOException("failed to delete " + file0);
        }
    }

    @Override  // okhttp3.internal.io.FileSystem
    public final void deleteContents(File file0) {
        Intrinsics.checkNotNullParameter(file0, "directory");
        File[] arr_file = file0.listFiles();
        if(arr_file == null) {
            throw new IOException("not a readable directory: " + file0);
        }
        for(int v = 0; v < arr_file.length; ++v) {
            File file1 = arr_file[v];
            if(file1.isDirectory()) {
                Intrinsics.checkNotNullExpressionValue(file1, "file");
                this.deleteContents(file1);
            }
            if(!file1.delete()) {
                throw new IOException("failed to delete " + file1);
            }
        }
    }

    @Override  // okhttp3.internal.io.FileSystem
    public final boolean exists(File file0) {
        Intrinsics.checkNotNullParameter(file0, "file");
        return file0.exists();
    }

    @Override  // okhttp3.internal.io.FileSystem
    public final void rename(File file0, File file1) {
        Intrinsics.checkNotNullParameter(file0, "from");
        Intrinsics.checkNotNullParameter(file1, "to");
        this.delete(file1);
        if(!file0.renameTo(file1)) {
            throw new IOException("failed to rename " + file0 + " to " + file1);
        }
    }

    @Override  // okhttp3.internal.io.FileSystem
    public final Sink sink(File file0) {
        Intrinsics.checkNotNullParameter(file0, "file");
        try {
            return Okio.sink$default(file0, false, 1, null);
        }
        catch(FileNotFoundException unused_ex) {
            file0.getParentFile().mkdirs();
            return Okio.sink$default(file0, false, 1, null);
        }
    }

    @Override  // okhttp3.internal.io.FileSystem
    public final long size(File file0) {
        Intrinsics.checkNotNullParameter(file0, "file");
        return file0.length();
    }

    @Override  // okhttp3.internal.io.FileSystem
    public final Source source(File file0) {
        Intrinsics.checkNotNullParameter(file0, "file");
        return Okio.source(file0);
    }

    @Override
    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}

