package androidx.room;

import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0001\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0018\u0010\u000F\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\rH\u0097\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0003\u001A\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001A\u0004\u0018\u00010\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001C\u001A\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001BR\u0014\u0010\u001E\u001A\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001B¨\u0006\u001F"}, d2 = {"Landroidx/room/QueryInterceptorOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "delegate", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V", "", "close", "()V", "", "enabled", "setWriteAheadLoggingEnabled", "(Z)V", "a", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class QueryInterceptorOpenHelper implements DelegatingOpenHelper, SupportSQLiteOpenHelper {
    public final SupportSQLiteOpenHelper a;
    public final Executor b;
    public final QueryCallback c;

    public QueryInterceptorOpenHelper(@NotNull SupportSQLiteOpenHelper supportSQLiteOpenHelper0, @NotNull Executor executor0, @NotNull QueryCallback roomDatabase$QueryCallback0) {
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper0, "delegate");
        Intrinsics.checkNotNullParameter(executor0, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(roomDatabase$QueryCallback0, "queryCallback");
        super();
        this.a = supportSQLiteOpenHelper0;
        this.b = executor0;
        this.c = roomDatabase$QueryCallback0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void close() {
        this.a.close();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    public String getDatabaseName() {
        return this.a.getDatabaseName();
    }

    @Override  // androidx.room.DelegatingOpenHelper
    @NotNull
    public SupportSQLiteOpenHelper getDelegate() {
        return this.a;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getReadableDatabase() {
        return new QueryInterceptorDatabase(this.getDelegate().getReadableDatabase(), this.b, this.c);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getWritableDatabase() {
        return new QueryInterceptorDatabase(this.getDelegate().getWritableDatabase(), this.b, this.c);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }
}

