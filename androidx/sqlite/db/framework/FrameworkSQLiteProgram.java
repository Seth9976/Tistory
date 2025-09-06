package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.SupportSQLiteProgram;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001F\u0010\r\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0013\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001F\u0010\u0016\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001A\u001A\u00020\bH\u0016¢\u0006\u0004\b\u001A\u0010\u0019¨\u0006\u001B"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "", "index", "", "bindNull", "(I)V", "", "value", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "clearBindings", "()V", "close", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class FrameworkSQLiteProgram implements SupportSQLiteProgram {
    public final SQLiteProgram a;

    public FrameworkSQLiteProgram(@NotNull SQLiteProgram sQLiteProgram0) {
        Intrinsics.checkNotNullParameter(sQLiteProgram0, "delegate");
        super();
        this.a = sQLiteProgram0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int v, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "value");
        this.a.bindBlob(v, arr_b);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int v, double f) {
        this.a.bindDouble(v, f);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int v, long v1) {
        this.a.bindLong(v, v1);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int v) {
        this.a.bindNull(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int v, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.a.bindString(v, s);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.a.clearBindings();
    }

    @Override
    public void close() {
        this.a.close();
    }
}

