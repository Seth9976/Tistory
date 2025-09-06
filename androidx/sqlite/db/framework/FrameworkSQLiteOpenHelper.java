package androidx.sqlite.db.framework;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteCompat.Api16Impl;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import b5.e;
import b5.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001C2\u00020\u0001:\u0003\u001C\u001D\u001EB7\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\n\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\bH\u0017¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001A\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001A\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001B\u001A\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0018¨\u0006\u001F"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroid/content/Context;", "context", "", "name", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;ZZ)V", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "Companion", "b5/b", "b5/e", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$Companion;", "", "", "TAG", "Ljava/lang/String;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Context a;
    public final String b;
    public final Callback c;
    public final boolean d;
    public final boolean e;
    public final Lazy f;
    public boolean g;

    static {
        FrameworkSQLiteOpenHelper.Companion = new Companion(null);
    }

    @JvmOverloads
    public FrameworkSQLiteOpenHelper(@NotNull Context context0, @Nullable String s, @NotNull Callback supportSQLiteOpenHelper$Callback0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Callback0, "callback");
        this(context0, s, supportSQLiteOpenHelper$Callback0, false, false, 24, null);
    }

    @JvmOverloads
    public FrameworkSQLiteOpenHelper(@NotNull Context context0, @Nullable String s, @NotNull Callback supportSQLiteOpenHelper$Callback0, boolean z) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Callback0, "callback");
        this(context0, s, supportSQLiteOpenHelper$Callback0, z, false, 16, null);
    }

    @JvmOverloads
    public FrameworkSQLiteOpenHelper(@NotNull Context context0, @Nullable String s, @NotNull Callback supportSQLiteOpenHelper$Callback0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Callback0, "callback");
        super();
        this.a = context0;
        this.b = s;
        this.c = supportSQLiteOpenHelper$Callback0;
        this.d = z;
        this.e = z1;
        this.f = c.lazy(new f(this));
    }

    public FrameworkSQLiteOpenHelper(Context context0, String s, Callback supportSQLiteOpenHelper$Callback0, boolean z, boolean z1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(context0, s, supportSQLiteOpenHelper$Callback0, ((v & 8) == 0 ? z : false), ((v & 16) == 0 ? z1 : false));
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void close() {
        Lazy lazy0 = this.f;
        if(lazy0.isInitialized()) {
            ((e)lazy0.getValue()).close();
        }
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @Nullable
    public String getDatabaseName() {
        return this.b;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getReadableDatabase() {
        return ((e)this.f.getValue()).a(false);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @NotNull
    public SupportSQLiteDatabase getWritableDatabase() {
        return ((e)this.f.getValue()).a(true);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        Lazy lazy0 = this.f;
        if(lazy0.isInitialized()) {
            Api16Impl.setWriteAheadLoggingEnabled(((e)lazy0.getValue()), z);
        }
        this.g = z;
    }
}

