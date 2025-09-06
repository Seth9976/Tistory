package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/Migration_3_4;", "Landroidx/room/migration/Migration;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "migrate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Migration_3_4 extends Migration {
    @NotNull
    public static final Migration_3_4 INSTANCE;

    static {
        Migration_3_4.INSTANCE = new Migration_3_4(3, 4);  // 初始化器: Landroidx/room/migration/Migration;-><init>(II)V
    }

    @Override  // androidx.room.migration.Migration
    public void migrate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        supportSQLiteDatabase0.execSQL("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}

