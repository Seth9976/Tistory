package androidx.core.util;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AtomicFile {
    public final File a;
    public final File b;
    public final File c;

    public AtomicFile(@NonNull File file0) {
        this.a = file0;
        this.b = new File(file0.getPath() + ".new");
        this.c = new File(file0.getPath() + ".bak");
    }

    public static void a(File file0, File file1) {
        if(file1.isDirectory() && !file1.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file1);
        }
        if(!file0.renameTo(file1)) {
            Log.e("AtomicFile", "Failed to rename " + file0 + " to " + file1);
        }
    }

    public void delete() {
        this.a.delete();
        this.b.delete();
        this.c.delete();
    }

    public void failWrite(@Nullable FileOutputStream fileOutputStream0) {
        if(fileOutputStream0 == null) {
            return;
        }
        try {
            boolean z = false;
            fileOutputStream0.getFD().sync();
            z = true;
        }
        catch(IOException unused_ex) {
        }
        if(!z) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream0.close();
        }
        catch(IOException iOException0) {
            Log.e("AtomicFile", "Failed to close file output stream", iOException0);
        }
        File file0 = this.b;
        if(!file0.delete()) {
            Log.e("AtomicFile", "Failed to delete new file " + file0);
        }
    }

    public void finishWrite(@Nullable FileOutputStream fileOutputStream0) {
        if(fileOutputStream0 == null) {
            return;
        }
        try {
            boolean z = false;
            fileOutputStream0.getFD().sync();
            z = true;
        }
        catch(IOException unused_ex) {
        }
        if(!z) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream0.close();
        }
        catch(IOException iOException0) {
            Log.e("AtomicFile", "Failed to close file output stream", iOException0);
        }
        AtomicFile.a(this.b, this.a);
    }

    @NonNull
    public File getBaseFile() {
        return this.a;
    }

    @NonNull
    public FileInputStream openRead() throws FileNotFoundException {
        File file0 = this.c;
        boolean z = file0.exists();
        File file1 = this.a;
        if(z) {
            AtomicFile.a(file0, file1);
        }
        File file2 = this.b;
        if(file2.exists() && file1.exists() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete outdated new file " + file2);
        }
        return new FileInputStream(file1);
    }

    @NonNull
    public byte[] readFully() throws IOException {
        try(FileInputStream fileInputStream0 = this.openRead()) {
            byte[] arr_b = new byte[fileInputStream0.available()];
            int v = 0;
            int v1;
            while((v1 = fileInputStream0.read(arr_b, v, arr_b.length - v)) > 0) {
                v += v1;
                int v2 = fileInputStream0.available();
                if(v2 <= arr_b.length - v) {
                    continue;
                }
                byte[] arr_b1 = new byte[v2 + v];
                System.arraycopy(arr_b, 0, arr_b1, 0, v);
                arr_b = arr_b1;
            }
            return arr_b;
        }
    }

    @NonNull
    public FileOutputStream startWrite() throws IOException {
        File file0 = this.b;
        File file1 = this.c;
        if(file1.exists()) {
            AtomicFile.a(file1, this.a);
        }
        try {
            return new FileOutputStream(file0);
        }
        catch(FileNotFoundException unused_ex) {
            if(file0.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(file0);
                }
                catch(FileNotFoundException fileNotFoundException0) {
                    throw new IOException("Failed to create new file " + file0, fileNotFoundException0);
                }
            }
            throw new IOException("Failed to create directory for " + file0);
        }
    }
}

