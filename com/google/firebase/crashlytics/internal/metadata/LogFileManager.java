package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.persistence.FileStore;

public class LogFileManager {
    public final FileStore a;
    public FileLogStore b;
    public static final b c;

    static {
        LogFileManager.c = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public LogFileManager(FileStore fileStore0) {
        this.a = fileStore0;
        this.b = LogFileManager.c;
    }

    public LogFileManager(FileStore fileStore0, String s) {
        this(fileStore0);
        this.setCurrentSession(s);
    }

    public void clearLog() {
        this.b.deleteLogFile();
    }

    public byte[] getBytesForLog() {
        return this.b.getLogAsBytes();
    }

    @Nullable
    public String getLogString() {
        return this.b.getLogAsString();
    }

    public final void setCurrentSession(String s) {
        this.b.closeLogFile();
        this.b = LogFileManager.c;
        if(s == null) {
            return;
        }
        this.b = new h(this.a.getSessionFile(s, "userlog"));
    }

    public void writeToLog(long v, String s) {
        this.b.writeToLog(v, s);
    }
}

