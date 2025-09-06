package androidx.work.impl;

import android.content.Context;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.utils.IdGeneratorKt;
import androidx.work.impl.utils.PreferenceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/work/impl/WorkMigration9To10;", "Landroidx/room/migration/Migration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "migrate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WorkMigration9To10 extends Migration {
    public final Context a;

    public WorkMigration9To10(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(9, 10);
        this.a = context0;
    }

    @Override  // androidx.room.migration.Migration
    public void migrate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        supportSQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        PreferenceUtils.migrateLegacyPreferences(this.a, supportSQLiteDatabase0);
        IdGeneratorKt.migrateLegacyIdGenerator(this.a, supportSQLiteDatabase0);
    }
}

