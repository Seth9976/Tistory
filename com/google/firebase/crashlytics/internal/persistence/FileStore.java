package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lc.a;

public class FileStore {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;

    public FileStore(Context context0) {
        File file0 = context0.getFilesDir();
        this.a = file0;
        File file1 = new File(file0, (Build.VERSION.SDK_INT < 28 ? ".com.google.firebase.crashlytics.files.v1" : ".com.google.firebase.crashlytics.files.v2;" + a.e().replaceAll("[^a-zA-Z0-9.]", "_")));
        FileStore.b(file1);
        this.b = file1;
        File file2 = new File(file1, "open-sessions");
        FileStore.b(file2);
        this.c = file2;
        File file3 = new File(file1, "reports");
        FileStore.b(file3);
        this.d = file3;
        File file4 = new File(file1, "priority-reports");
        FileStore.b(file4);
        this.e = file4;
        File file5 = new File(file1, "native-reports");
        FileStore.b(file5);
        this.f = file5;
    }

    public static void a(File file0) {
        if(file0.exists() && FileStore.c(file0)) {
            Logger.getLogger().d("Deleted previous Crashlytics file system: " + file0.getPath());
        }
    }

    public static void b(File file0) {
        synchronized(FileStore.class) {
            if(file0.exists()) {
                if(file0.isDirectory()) {
                    return;
                }
                Logger.getLogger().d("Unexpected non-directory file: " + file0 + "; deleting file and creating new directory.");
                file0.delete();
            }
            if(!file0.mkdirs()) {
                Logger.getLogger().e("Could not create Crashlytics-specific directory: " + file0);
            }
        }
    }

    public static boolean c(File file0) {
        File[] arr_file = file0.listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                FileStore.c(arr_file[v]);
            }
        }
        return file0.delete();
    }

    public void cleanupPreviousFileSystems() {
        File file0 = this.a;
        FileStore.a(new File(file0, ".com.google.firebase.crashlytics"));
        FileStore.a(new File(file0, ".com.google.firebase.crashlytics-ndk"));
        if(Build.VERSION.SDK_INT >= 28) {
            FileStore.a(new File(file0, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    public static List d(Object[] arr_object) {
        return arr_object == null ? Collections.emptyList() : Arrays.asList(arr_object);
    }

    @VisibleForTesting
    public void deleteAllCrashlyticsFiles() {
        FileStore.c(this.b);
    }

    public boolean deleteSessionFiles(String s) {
        return FileStore.c(new File(this.c, s));
    }

    public List getAllOpenSessionIds() {
        return FileStore.d(this.c.list());
    }

    public File getCommonFile(String s) {
        return new File(this.b, s);
    }

    public List getCommonFiles(FilenameFilter filenameFilter0) {
        return FileStore.d(this.b.listFiles(filenameFilter0));
    }

    public File getNativeReport(String s) {
        return new File(this.f, s);
    }

    public List getNativeReports() {
        return FileStore.d(this.f.listFiles());
    }

    public File getNativeSessionDir(String s) {
        File file0 = new File(this.c, s);
        file0.mkdirs();
        File file1 = new File(file0, "native");
        file1.mkdirs();
        return file1;
    }

    public File getPriorityReport(String s) {
        return new File(this.e, s);
    }

    public List getPriorityReports() {
        return FileStore.d(this.e.listFiles());
    }

    public File getReport(String s) {
        return new File(this.d, s);
    }

    public List getReports() {
        return FileStore.d(this.d.listFiles());
    }

    public File getSessionFile(String s, String s1) {
        File file0 = new File(this.c, s);
        file0.mkdirs();
        return new File(file0, s1);
    }

    public List getSessionFiles(String s, FilenameFilter filenameFilter0) {
        File file0 = new File(this.c, s);
        file0.mkdirs();
        return FileStore.d(file0.listFiles(filenameFilter0));
    }
}

