package androidx.work.impl;

import androidx.room.RoomDatabase.Callback;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.Clock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/work/impl/CleanupCallback;", "Landroidx/room/RoomDatabase$Callback;", "Landroidx/work/Clock;", "clock", "<init>", "(Landroidx/work/Clock;)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "onOpen", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "a", "Landroidx/work/Clock;", "getClock", "()Landroidx/work/Clock;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CleanupCallback extends Callback {
    public final Clock a;

    public CleanupCallback(@NotNull Clock clock0) {
        Intrinsics.checkNotNullParameter(clock0, "clock");
        super();
        this.a = clock0;
    }

    @NotNull
    public final Clock getClock() {
        return this.a;
    }

    @Override  // androidx.room.RoomDatabase$Callback
    public void onOpen(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        super.onOpen(supportSQLiteDatabase0);
        supportSQLiteDatabase0.beginTransaction();
        try {
            supportSQLiteDatabase0.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (this.a.currentTimeMillis() - WorkDatabaseKt.PRUNE_THRESHOLD_MILLIS) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            supportSQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            supportSQLiteDatabase0.endTransaction();
        }
    }
}

