package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001A\u00020\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/room/SQLiteCopyOpenHelperFactory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "", "mCopyFromAssetPath", "Ljava/io/File;", "mCopyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "mCopyFromInputStream", "mDelegate", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;)V", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "configuration", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "create", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SQLiteCopyOpenHelperFactory implements Factory {
    public final String a;
    public final File b;
    public final Callable c;
    public final Factory d;

    public SQLiteCopyOpenHelperFactory(@Nullable String s, @Nullable File file0, @Nullable Callable callable0, @NotNull Factory supportSQLiteOpenHelper$Factory0) {
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Factory0, "mDelegate");
        super();
        this.a = s;
        this.b = file0;
        this.c = callable0;
        this.d = supportSQLiteOpenHelper$Factory0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Factory
    @NotNull
    public SupportSQLiteOpenHelper create(@NotNull Configuration supportSQLiteOpenHelper$Configuration0) {
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Configuration0, "configuration");
        SupportSQLiteOpenHelper supportSQLiteOpenHelper0 = this.d.create(supportSQLiteOpenHelper$Configuration0);
        return new SQLiteCopyOpenHelper(supportSQLiteOpenHelper$Configuration0.context, this.a, this.b, this.c, supportSQLiteOpenHelper$Configuration0.callback.version, supportSQLiteOpenHelper0);
    }
}

