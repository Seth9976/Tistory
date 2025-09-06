package b4;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.documentfile.provider.DocumentFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public final class a extends DocumentFile {
    public File b;

    public a(a a0, File file0) {
        super(a0);
        this.b = file0;
    }

    public static boolean a(File file0) {
        File[] arr_file = file0.listFiles();
        boolean z = true;
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                if(file1.isDirectory()) {
                    z &= a.a(file1);
                }
                if(!file1.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file1);
                    z = false;
                }
            }
        }
        return z;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean canRead() {
        return this.b.canRead();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean canWrite() {
        return this.b.canWrite();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final DocumentFile createDirectory(String s) {
        File file0 = new File(this.b, s);
        return !file0.isDirectory() && !file0.mkdir() ? null : new a(this, file0);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final DocumentFile createFile(String s, String s1) {
        String s2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(s);
        if(s2 != null) {
            s1 = s1 + "." + s2;
        }
        File file0 = new File(this.b, s1);
        try {
            file0.createNewFile();
            return new a(this, file0);
        }
        catch(IOException iOException0) {
            Log.w("DocumentFile", "Failed to createFile: " + iOException0);
            return null;
        }
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean delete() {
        a.a(this.b);
        return this.b.delete();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean exists() {
        return this.b.exists();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final String getName() {
        return this.b.getName();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final String getType() {
        if(this.b.isDirectory()) {
            return null;
        }
        String s = this.b.getName();
        int v = s.lastIndexOf(46);
        if(v >= 0) {
            String s1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s.substring(v + 1).toLowerCase());
            return s1 == null ? "application/octet-stream" : s1;
        }
        return "application/octet-stream";
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final Uri getUri() {
        return Uri.fromFile(this.b);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean isDirectory() {
        return this.b.isDirectory();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean isFile() {
        return this.b.isFile();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean isVirtual() {
        return false;
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final long lastModified() {
        return this.b.lastModified();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final long length() {
        return this.b.length();
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final DocumentFile[] listFiles() {
        ArrayList arrayList0 = new ArrayList();
        File[] arr_file = this.b.listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                arrayList0.add(new a(this, arr_file[v]));
            }
        }
        return (DocumentFile[])arrayList0.toArray(new DocumentFile[arrayList0.size()]);
    }

    @Override  // androidx.documentfile.provider.DocumentFile
    public final boolean renameTo(String s) {
        File file0 = new File(this.b.getParentFile(), s);
        if(this.b.renameTo(file0)) {
            this.b = file0;
            return true;
        }
        return false;
    }
}

