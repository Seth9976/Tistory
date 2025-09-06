package androidx.room;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\'\u0010\n\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\f\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"androidx/room/SQLiteCopyOpenHelper$createFrameworkOpenHelper$configuration$1", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "onCreate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "", "oldVersion", "newVersion", "onUpgrade", "(Landroidx/sqlite/db/SupportSQLiteDatabase;II)V", "onOpen", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SQLiteCopyOpenHelper.createFrameworkOpenHelper.configuration.1 extends Callback {
    public final int a;

    public SQLiteCopyOpenHelper.createFrameworkOpenHelper.configuration.1(int v, int v1) {
        this.a = v;
        super(v1);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public void onCreate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public void onOpen(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
        int v = this.a;
        if(v < 1) {
            supportSQLiteDatabase0.setVersion(v);
        }
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public void onUpgrade(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0, int v, int v1) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "db");
    }
}

