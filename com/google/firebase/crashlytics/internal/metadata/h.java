package com.google.firebase.crashlytics.internal.metadata;

import a7.b;
import b2.i;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

public final class h implements FileLogStore {
    public final File a;
    public g b;
    public static final Charset c;

    static {
        h.c = Charset.forName("UTF-8");
    }

    public h(File file0) {
        this.a = file0;
    }

    public final void a() {
        File file0 = this.a;
        if(this.b == null) {
            try {
                this.b = new g(file0);
            }
            catch(IOException iOException0) {
                Logger.getLogger().e("Could not open log file: " + file0, iOException0);
            }
        }
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public final void closeLogFile() {
        CommonUtils.closeOrLog(this.b, "There was a problem closing the Crashlytics log file.");
        this.b = null;
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public final void deleteLogFile() {
        this.closeLogFile();
        this.a.delete();
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public final byte[] getLogAsBytes() {
        i i0;
        if(this.a.exists()) {
            this.a();
            g g0 = this.b;
            if(g0 == null) {
                i0 = null;
            }
            else {
                int[] arr_v = {0};
                byte[] arr_b = new byte[g0.j()];
                try {
                    this.b.c(new b(14, arr_b, arr_v));
                }
                catch(IOException iOException0) {
                    Logger.getLogger().e("A problem occurred while reading the Crashlytics log file.", iOException0);
                }
                i0 = new i(arr_b, arr_v[0]);
            }
        }
        else {
            i0 = null;
        }
        if(i0 == null) {
            return null;
        }
        int v = i0.a;
        byte[] arr_b1 = new byte[v];
        System.arraycopy(((byte[])i0.b), 0, arr_b1, 0, v);
        return arr_b1;
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public final String getLogAsString() {
        byte[] arr_b = this.getLogAsBytes();
        return arr_b == null ? null : new String(arr_b, h.c);
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public final void writeToLog(long v, String s) {
        this.a();
        if(this.b != null) {
            if(s == null) {
                s = "null";
            }
            try {
                if(s.length() > 0x4000) {
                    s = "..." + s.substring(s.length() - 0x4000);
                }
                this.b.a(String.format(Locale.US, "%d %s%n", v, s.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(h.c));
                while(true) {
                    if(this.b.d() || this.b.j() <= 0x10000) {
                        return;
                    }
                    this.b.g();
                }
            }
            catch(IOException iOException0) {
            }
            Logger.getLogger().e("There was a problem writing to the Crashlytics log.", iOException0);
        }
    }
}

