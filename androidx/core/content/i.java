package androidx.core.content;

import android.net.Uri.Builder;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public final class i implements PathStrategy {
    public final String a;
    public final HashMap b;

    public i(String s) {
        this.b = new HashMap();
        this.a = s;
    }

    public static boolean a(String s, String s1) {
        String s2 = FileProvider.a(s);
        String s3 = FileProvider.a(s1);
        return s2.equals(s3) || s2.startsWith(s3 + '/');
    }

    @Override  // androidx.core.content.FileProvider$PathStrategy
    public final File getFileForUri(Uri uri0) {
        File file2;
        String s = uri0.getEncodedPath();
        int v = s.indexOf(0x2F, 1);
        String s1 = Uri.decode(s.substring(1, v));
        String s2 = Uri.decode(s.substring(v + 1));
        File file0 = (File)this.b.get(s1);
        if(file0 == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri0);
        }
        File file1 = new File(file0, s2);
        try {
            file2 = file1.getCanonicalFile();
        }
        catch(IOException unused_ex) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file1);
        }
        if(!i.a(file2.getPath(), file0.getPath())) {
            throw new SecurityException("Resolved path jumped beyond configured root");
        }
        return file2;
    }

    @Override  // androidx.core.content.FileProvider$PathStrategy
    public final Uri getUriForFile(File file0) {
        String s;
        try {
            s = file0.getCanonicalPath();
        }
        catch(IOException unused_ex) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file0);
        }
        Map.Entry map$Entry0 = null;
        for(Object object0: this.b.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object0;
            String s1 = ((File)map$Entry1.getValue()).getPath();
            if(i.a(s, s1) && (map$Entry0 == null || s1.length() > ((File)map$Entry0.getValue()).getPath().length())) {
                map$Entry0 = map$Entry1;
            }
        }
        if(map$Entry0 == null) {
            throw new IllegalArgumentException("Failed to find configured root that contains " + s);
        }
        String s2 = ((File)map$Entry0.getValue()).getPath();
        return s2.endsWith("/") ? new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode(((String)map$Entry0.getKey())) + '/' + Uri.encode(s.substring(s2.length()), "/")).build() : new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode(((String)map$Entry0.getKey())) + '/' + Uri.encode(s.substring(s2.length() + 1), "/")).build();
    }
}

