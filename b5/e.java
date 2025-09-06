package b5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.WhenMappings;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

public final class e extends SQLiteOpenHelper {
    public final Context a;
    public final b b;
    public final Callback c;
    public final boolean d;
    public boolean e;
    public final ProcessLock f;
    public boolean g;
    public static final FrameworkSQLiteOpenHelper.OpenHelper.Companion h;

    static {
        e.h = new FrameworkSQLiteOpenHelper.OpenHelper.Companion(null);
    }

    public e(Context context0, String s, b b0, Callback supportSQLiteOpenHelper$Callback0, boolean z) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(b0, "dbRef");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Callback0, "callback");
        c c0 = new c(supportSQLiteOpenHelper$Callback0, b0);
        super(context0, s, null, supportSQLiteOpenHelper$Callback0.version, c0);
        this.a = context0;
        this.b = b0;
        this.c = supportSQLiteOpenHelper$Callback0;
        this.d = z;
        if(s == null) {
            s = "929f4d7f-1b56-4c4f-9a2f-b1b9f82793ee";
            Intrinsics.checkNotNullExpressionValue("929f4d7f-1b56-4c4f-9a2f-b1b9f82793ee", "randomUUID().toString()");
        }
        this.f = new ProcessLock(s, context0.getCacheDir(), false);
    }

    public final SupportSQLiteDatabase a(boolean z) {
        SupportSQLiteDatabase supportSQLiteDatabase1;
        SupportSQLiteDatabase supportSQLiteDatabase0;
        SQLiteDatabase sQLiteDatabase0;
        ProcessLock processLock0;
        try {
            processLock0 = this.f;
            processLock0.lock(!this.g && this.getDatabaseName() != null);
            this.e = false;
            sQLiteDatabase0 = this.d(z);
            if(this.e) {
                this.close();
                supportSQLiteDatabase0 = this.a(z);
                goto label_7;
            }
            supportSQLiteDatabase1 = this.b(sQLiteDatabase0);
            goto label_14;
        }
        catch(Throwable throwable0) {
            processLock0.unlock();
            throw throwable0;
        }
    label_7:
        processLock0.unlock();
        return supportSQLiteDatabase0;
        try {
            supportSQLiteDatabase1 = this.b(sQLiteDatabase0);
        }
        catch(Throwable throwable0) {
            processLock0.unlock();
            throw throwable0;
        }
    label_14:
        processLock0.unlock();
        return supportSQLiteDatabase1;
    }

    public final FrameworkSQLiteDatabase b(SQLiteDatabase sQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase0, "sqLiteDatabase");
        return e.h.getWrappedDb(this.b, sQLiteDatabase0);
    }

    public final SQLiteDatabase c(boolean z) {
        SQLiteDatabase sQLiteDatabase0;
        if(z) {
            sQLiteDatabase0 = this.getWritableDatabase();
            Intrinsics.checkNotNullExpressionValue(sQLiteDatabase0, "{\n                super.…eDatabase()\n            }");
            return sQLiteDatabase0;
        }
        sQLiteDatabase0 = this.getReadableDatabase();
        Intrinsics.checkNotNullExpressionValue(sQLiteDatabase0, "{\n                super.…eDatabase()\n            }");
        return sQLiteDatabase0;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void close() {
        try {
            ProcessLock.lock$default(this.f, false, 1, null);
            super.close();
            this.b.a = null;
            this.g = false;
        }
        finally {
            this.f.unlock();
        }
    }

    public final SQLiteDatabase d(boolean z) {
        String s = this.getDatabaseName();
        Context context0 = this.a;
        if(s != null && !this.g) {
            File file0 = context0.getDatabasePath(s).getParentFile();
            if(file0 != null) {
                file0.mkdirs();
                if(!file0.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + file0);
                }
            }
        }
        try {
            return this.c(z);
        }
        catch(Throwable unused_ex) {
            super.close();
            try {
                Thread.sleep(500L);
            }
            catch(InterruptedException unused_ex) {
            }
            try {
                return this.c(z);
            }
            catch(Throwable throwable0) {
            }
        }
        super.close();
        if(throwable0 instanceof d) {
            int v = FrameworkSQLiteOpenHelper.OpenHelper.WhenMappings.$EnumSwitchMapping$0[((d)throwable0).a.ordinal()];
            Throwable throwable1 = ((d)throwable0).b;
            if(v == 1 || v == 2 || v == 3 || v == 4 || !(throwable1 instanceof SQLiteException)) {
                throw throwable1;
            }
        }
        else if(throwable0 instanceof SQLiteException && s != null && this.d) {
        }
        else {
            throw throwable0;
        }
        context0.deleteDatabase(s);
        try {
            return this.c(z);
        }
        catch(d d0) {
            throw d0.b;
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase0, "db");
        Callback supportSQLiteOpenHelper$Callback0 = this.c;
        if(!this.e) {
            int v = sQLiteDatabase0.getVersion();
            if(supportSQLiteOpenHelper$Callback0.version != v) {
                sQLiteDatabase0.setMaxSqlCacheSize(1);
            }
        }
        try {
            supportSQLiteOpenHelper$Callback0.onConfigure(this.b(sQLiteDatabase0));
        }
        catch(Throwable throwable0) {
            throw new d(FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CONFIGURE, throwable0);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase0, "sqLiteDatabase");
        try {
            FrameworkSQLiteDatabase frameworkSQLiteDatabase0 = this.b(sQLiteDatabase0);
            this.c.onCreate(frameworkSQLiteDatabase0);
        }
        catch(Throwable throwable0) {
            throw new d(FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CREATE, throwable0);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase0, "db");
        this.e = true;
        try {
            FrameworkSQLiteDatabase frameworkSQLiteDatabase0 = this.b(sQLiteDatabase0);
            this.c.onDowngrade(frameworkSQLiteDatabase0, v, v1);
        }
        catch(Throwable throwable0) {
            throw new d(FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_DOWNGRADE, throwable0);
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase0, "db");
        if(!this.e) {
            try {
                FrameworkSQLiteDatabase frameworkSQLiteDatabase0 = this.b(sQLiteDatabase0);
                this.c.onOpen(frameworkSQLiteDatabase0);
            }
            catch(Throwable throwable0) {
                throw new d(FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_OPEN, throwable0);
            }
        }
        this.g = true;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase0, "sqLiteDatabase");
        this.e = true;
        try {
            FrameworkSQLiteDatabase frameworkSQLiteDatabase0 = this.b(sQLiteDatabase0);
            this.c.onUpgrade(frameworkSQLiteDatabase0, v, v1);
        }
        catch(Throwable throwable0) {
            throw new d(FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_UPGRADE, throwable0);
        }
    }
}

