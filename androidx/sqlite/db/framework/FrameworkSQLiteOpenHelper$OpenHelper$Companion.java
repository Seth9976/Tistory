package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteDatabase;
import b5.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion", "", "Lb5/b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "getWrappedDb", "(Lb5/b;Landroid/database/sqlite/SQLiteDatabase;)Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFrameworkSQLiteOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteOpenHelper.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
public final class FrameworkSQLiteOpenHelper.OpenHelper.Companion {
    public FrameworkSQLiteOpenHelper.OpenHelper.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public final FrameworkSQLiteDatabase getWrappedDb(@NotNull b b0, @NotNull SQLiteDatabase sQLiteDatabase0) {
        Intrinsics.checkNotNullParameter(b0, "refHolder");
        Intrinsics.checkNotNullParameter(sQLiteDatabase0, "sqLiteDatabase");
        FrameworkSQLiteDatabase frameworkSQLiteDatabase0 = b0.a;
        if(frameworkSQLiteDatabase0 == null || !frameworkSQLiteDatabase0.isDelegate(sQLiteDatabase0)) {
            frameworkSQLiteDatabase0 = new FrameworkSQLiteDatabase(sQLiteDatabase0);
            b0.a = frameworkSQLiteDatabase0;
        }
        return frameworkSQLiteDatabase0;
    }
}

