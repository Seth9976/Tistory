package b5;

import androidx.sqlite.db.SupportSQLiteCompat.Api16Impl;
import androidx.sqlite.db.SupportSQLiteCompat.Api21Impl;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final FrameworkSQLiteOpenHelper w;

    public f(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper0) {
        this.w = frameworkSQLiteOpenHelper0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        e e0 = this.w.b == null || !this.w.d ? new e(this.w.a, this.w.b, new b(), this.w.c, this.w.e) : new e(this.w.a, new File(Api21Impl.getNoBackupFilesDir(this.w.a), this.w.b).getAbsolutePath(), new b(), this.w.c, this.w.e);
        Api16Impl.setWriteAheadLoggingEnabled(e0, this.w.g);
        return e0;
    }
}

