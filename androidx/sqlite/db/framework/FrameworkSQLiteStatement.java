package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000FJ\u0011\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteStatement;", "Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", "", "execute", "()V", "", "executeUpdateDelete", "()I", "", "executeInsert", "()J", "simpleQueryForLong", "", "simpleQueryForString", "()Ljava/lang/String;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FrameworkSQLiteStatement extends FrameworkSQLiteProgram implements SupportSQLiteStatement {
    public final SQLiteStatement b;

    public FrameworkSQLiteStatement(@NotNull SQLiteStatement sQLiteStatement0) {
        Intrinsics.checkNotNullParameter(sQLiteStatement0, "delegate");
        super(sQLiteStatement0);
        this.b = sQLiteStatement0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        this.b.execute();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        return this.b.executeInsert();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        return this.b.executeUpdateDelete();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        return this.b.simpleQueryForLong();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    @Nullable
    public String simpleQueryForString() {
        return this.b.simpleQueryForString();
    }
}

