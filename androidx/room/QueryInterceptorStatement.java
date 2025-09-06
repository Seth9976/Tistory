package androidx.room;

import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000B\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\rJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0016\u001A\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001A\u00020\u000B2\u0006\u0010\u0018\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u001F\u0010\u001C\u001A\u00020\u000B2\u0006\u0010\u0018\u001A\u00020\u000F2\u0006\u0010\u001B\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u001F\u0010\u001F\u001A\u00020\u000B2\u0006\u0010\u0018\u001A\u00020\u000F2\u0006\u0010\u001B\u001A\u00020\u001EH\u0016¢\u0006\u0004\b\u001F\u0010 J\u001F\u0010!\u001A\u00020\u000B2\u0006\u0010\u0018\u001A\u00020\u000F2\u0006\u0010\u001B\u001A\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u001F\u0010$\u001A\u00020\u000B2\u0006\u0010\u0018\u001A\u00020\u000F2\u0006\u0010\u001B\u001A\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000F\u0010&\u001A\u00020\u000BH\u0016¢\u0006\u0004\b&\u0010\r¨\u0006\'"}, d2 = {"Landroidx/room/QueryInterceptorStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "delegate", "", "sqlStatement", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/String;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V", "", "close", "()V", "execute", "", "executeUpdateDelete", "()I", "", "executeInsert", "()J", "simpleQueryForLong", "simpleQueryForString", "()Ljava/lang/String;", "index", "bindNull", "(I)V", "value", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "clearBindings", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    public final SupportSQLiteStatement a;
    public final String b;
    public final Executor c;
    public final QueryCallback d;
    public final ArrayList e;

    public QueryInterceptorStatement(@NotNull SupportSQLiteStatement supportSQLiteStatement0, @NotNull String s, @NotNull Executor executor0, @NotNull QueryCallback roomDatabase$QueryCallback0) {
        Intrinsics.checkNotNullParameter(supportSQLiteStatement0, "delegate");
        Intrinsics.checkNotNullParameter(s, "sqlStatement");
        Intrinsics.checkNotNullParameter(executor0, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(roomDatabase$QueryCallback0, "queryCallback");
        super();
        this.a = supportSQLiteStatement0;
        this.b = s;
        this.c = executor0;
        this.d = roomDatabase$QueryCallback0;
        this.e = new ArrayList();
    }

    public final void a(int v, Object object0) {
        ArrayList arrayList0 = this.e;
        if(v - 1 >= arrayList0.size()) {
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v - 1 - v1 + 1; ++v2) {
                arrayList0.add(null);
            }
        }
        arrayList0.set(v - 1, object0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int v, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "value");
        this.a(v, arr_b);
        this.a.bindBlob(v, arr_b);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int v, double f) {
        this.a(v, f);
        this.a.bindDouble(v, f);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int v, long v1) {
        this.a(v, v1);
        this.a.bindLong(v, v1);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int v) {
        this.a(v, null);
        this.a.bindNull(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int v, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.a(v, s);
        this.a.bindString(v, s);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.e.clear();
        this.a.clearBindings();
    }

    @Override
    public void close() {
        this.a.close();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        x0 x00 = new x0(this, 3);
        this.c.execute(x00);
        this.a.execute();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        x0 x00 = new x0(this, 1);
        this.c.execute(x00);
        return this.a.executeInsert();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        x0 x00 = new x0(this, 4);
        this.c.execute(x00);
        return this.a.executeUpdateDelete();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        x0 x00 = new x0(this, 0);
        this.c.execute(x00);
        return this.a.simpleQueryForLong();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    @Nullable
    public String simpleQueryForString() {
        x0 x00 = new x0(this, 2);
        this.c.execute(x00);
        return this.a.simpleQueryForString();
    }
}

