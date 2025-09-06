package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001A\u00020\u00072\b\u0010\b\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001A\u00020\nH\u0016J\b\u0010\u000B\u001A\u00020\u0003H\u0016R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001A\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/room/util/ViewInfo;", "", "name", "", "sql", "(Ljava/lang/String;Ljava/lang/String;)V", "equals", "", "other", "hashCode", "", "toString", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ViewInfo {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/room/util/ViewInfo$Companion;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "viewName", "Landroidx/room/util/ViewInfo;", "read", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)Landroidx/room/util/ViewInfo;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nViewInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInfo.kt\nandroidx/room/util/ViewInfo$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,83:1\n145#2,7:84\n*S KotlinDebug\n*F\n+ 1 ViewInfo.kt\nandroidx/room/util/ViewInfo$Companion\n*L\n73#1:84,7\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final ViewInfo read(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0, @NotNull String s) {
            ViewInfo viewInfo0;
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase0, "database");
            Intrinsics.checkNotNullParameter(s, "viewName");
            Cursor cursor0 = supportSQLiteDatabase0.query("SELECT name, sql FROM sqlite_master WHERE type = \'view\' AND name = \'" + s + '\'');
            try {
                if(cursor0.moveToFirst()) {
                    String s1 = cursor0.getString(0);
                    Intrinsics.checkNotNullExpressionValue(s1, "cursor.getString(0)");
                    viewInfo0 = new ViewInfo(s1, cursor0.getString(1));
                }
                else {
                    viewInfo0 = new ViewInfo(s, null);
                }
                goto label_15;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                CloseableKt.closeFinally(cursor0, throwable0);
                throw throwable1;
            }
        label_15:
            CloseableKt.closeFinally(cursor0, null);
            return viewInfo0;
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public final String name;
    @JvmField
    @Nullable
    public final String sql;

    static {
        ViewInfo.Companion = new Companion(null);
    }

    public ViewInfo(@NotNull String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "name");
        super();
        this.name = s;
        this.sql = s1;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ViewInfo)) {
            return false;
        }
        if(Intrinsics.areEqual(this.name, ((ViewInfo)object0).name)) {
            String s = ((ViewInfo)object0).sql;
            return this.sql == null ? s == null : Intrinsics.areEqual(this.sql, s);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.name.hashCode();
        return this.sql == null ? v * 0x1F : v * 0x1F + this.sql.hashCode();
    }

    @JvmStatic
    @NotNull
    public static final ViewInfo read(@NotNull SupportSQLiteDatabase supportSQLiteDatabase0, @NotNull String s) {
        return ViewInfo.Companion.read(supportSQLiteDatabase0, s);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ViewInfo{name=\'");
        stringBuilder0.append(this.name);
        stringBuilder0.append("\', sql=\'");
        return a.o(stringBuilder0, this.sql, "\'}");
    }
}

