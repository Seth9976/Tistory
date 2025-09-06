package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelperFactory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "delegate", "Landroidx/room/AutoCloser;", "autoCloser", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/AutoCloser;)V", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "configuration", "Landroidx/room/AutoClosingRoomOpenHelper;", "create", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Landroidx/room/AutoClosingRoomOpenHelper;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AutoClosingRoomOpenHelperFactory implements Factory {
    public final Factory a;
    public final AutoCloser b;

    public AutoClosingRoomOpenHelperFactory(@NotNull Factory supportSQLiteOpenHelper$Factory0, @NotNull AutoCloser autoCloser0) {
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Factory0, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser0, "autoCloser");
        super();
        this.a = supportSQLiteOpenHelper$Factory0;
        this.b = autoCloser0;
    }

    @NotNull
    public AutoClosingRoomOpenHelper create(@NotNull Configuration supportSQLiteOpenHelper$Configuration0) {
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Configuration0, "configuration");
        return new AutoClosingRoomOpenHelper(this.a.create(supportSQLiteOpenHelper$Configuration0), this.b);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Factory
    public SupportSQLiteOpenHelper create(Configuration supportSQLiteOpenHelper$Configuration0) {
        return this.create(supportSQLiteOpenHelper$Configuration0);
    }
}

