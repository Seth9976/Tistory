package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0000\u0018\u0000 B2\u00020\u0001:\u0001BB\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000EJ\'\u0010\u0013\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u000F2\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001A\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001A\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001A\u00020\f¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001C\u001A\u00020\f2\u0006\u0010\u001B\u001A\u00020\u001A¢\u0006\u0004\b\u001C\u0010\u001DR\"\u0010\u000B\u001A\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000B\u0010\u001E\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\u000ER$\u0010\'\u001A\u0004\u0018\u00010\u001A8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\u001DR\"\u0010/\u001A\u00020(8\u0000@\u0000X\u0081\u000E¢\u0006\u0012\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001A\u00020\u00028\u0000@\u0000X\u0081\u000E¢\u0006\u0012\n\u0004\b0\u00101\u001A\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010<\u001A\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000E¢\u0006\u0012\n\u0004\b7\u00108\u001A\u0004\b9\u0010\u0016\"\u0004\b:\u0010;R\u0011\u0010>\u001A\u00020=8F¢\u0006\u0006\u001A\u0004\b>\u0010?R\u0014\u0010A\u001A\u00020(8AX\u0080\u0004¢\u0006\u0006\u001A\u0004\b@\u0010,¨\u0006C"}, d2 = {"Landroidx/room/AutoCloser;", "", "", "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Ljava/util/concurrent/Executor;", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "delegateOpenHelper", "", "init", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "V", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "block", "executeRefCountingFunction", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "incrementCountAndEnsureDbIsOpen", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "decrementCountAndScheduleClose", "()V", "closeDatabaseIfOpen", "Ljava/lang/Runnable;", "onAutoClose", "setAutoCloseCallback", "(Ljava/lang/Runnable;)V", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegateOpenHelper", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "setDelegateOpenHelper", "b", "Ljava/lang/Runnable;", "getOnAutoCloseCallback$room_runtime_release", "()Ljava/lang/Runnable;", "setOnAutoCloseCallback$room_runtime_release", "onAutoCloseCallback", "", "f", "I", "getRefCount$room_runtime_release", "()I", "setRefCount$room_runtime_release", "(I)V", "refCount", "g", "J", "getLastDecrementRefCountTimeStamp$room_runtime_release", "()J", "setLastDecrementRefCountTimeStamp$room_runtime_release", "(J)V", "lastDecrementRefCountTimeStamp", "h", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getDelegateDatabase$room_runtime_release", "setDelegateDatabase$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "delegateDatabase", "", "isActive", "()Z", "getRefCountForTest$room_runtime_release", "refCountForTest", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAutoCloser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCloser.kt\nandroidx/room/AutoCloser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
public final class AutoCloser {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/AutoCloser$Companion;", "", "", "autoCloseBug", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public final Handler a;
    @NotNull
    public static final String autoCloseBug = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";
    public Runnable b;
    public final Object c;
    public final long d;
    public SupportSQLiteOpenHelper delegateOpenHelper;
    public final Executor e;
    public int f;
    public long g;
    public SupportSQLiteDatabase h;
    public boolean i;
    public final h j;
    public final h k;

    static {
        AutoCloser.Companion = new Companion(null);
    }

    public AutoCloser(long v, @NotNull TimeUnit timeUnit0, @NotNull Executor executor0) {
        Intrinsics.checkNotNullParameter(timeUnit0, "autoCloseTimeUnit");
        Intrinsics.checkNotNullParameter(executor0, "autoCloseExecutor");
        super();
        this.a = new Handler(Looper.getMainLooper());
        this.c = new Object();
        this.d = timeUnit0.toMillis(v);
        this.e = executor0;
        this.g = SystemClock.uptimeMillis();
        this.j = new h(this, 0);
        this.k = new h(this, 1);
    }

    public final void closeDatabaseIfOpen() throws IOException {
        synchronized(this.c) {
            this.i = true;
            SupportSQLiteDatabase supportSQLiteDatabase0 = this.h;
            if(supportSQLiteDatabase0 != null) {
                supportSQLiteDatabase0.close();
            }
            this.h = null;
        }
    }

    public final void decrementCountAndScheduleClose() {
        synchronized(this.c) {
            int v1 = this.f;
            if(v1 > 0) {
                this.f = v1 - 1;
                if(v1 - 1 == 0) {
                    if(this.h == null) {
                        return;
                    }
                    this.a.postDelayed(this.j, this.d);
                }
                return;
            }
        }
        throw new IllegalStateException("ref count is 0 or lower but we\'re supposed to decrement");
    }

    public final Object executeRefCountingFunction(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        try {
            return function10.invoke(this.incrementCountAndEnsureDbIsOpen());
        }
        finally {
            this.decrementCountAndScheduleClose();
        }
    }

    @Nullable
    public final SupportSQLiteDatabase getDelegateDatabase$room_runtime_release() {
        return this.h;
    }

    @NotNull
    public final SupportSQLiteOpenHelper getDelegateOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper0 = this.delegateOpenHelper;
        if(supportSQLiteOpenHelper0 != null) {
            return supportSQLiteOpenHelper0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateOpenHelper");
        return null;
    }

    public final long getLastDecrementRefCountTimeStamp$room_runtime_release() {
        return this.g;
    }

    @Nullable
    public final Runnable getOnAutoCloseCallback$room_runtime_release() {
        return this.b;
    }

    public final int getRefCount$room_runtime_release() {
        return this.f;
    }

    @VisibleForTesting
    public final int getRefCountForTest$room_runtime_release() {
        synchronized(this.c) {
        }
        return this.f;
    }

    @NotNull
    public final SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
        synchronized(this.c) {
            this.a.removeCallbacks(this.j);
            ++this.f;
            if(!this.i) {
                SupportSQLiteDatabase supportSQLiteDatabase0 = this.h;
                if(supportSQLiteDatabase0 != null && supportSQLiteDatabase0.isOpen()) {
                    return supportSQLiteDatabase0;
                }
                SupportSQLiteDatabase supportSQLiteDatabase1 = this.getDelegateOpenHelper().getWritableDatabase();
                this.h = supportSQLiteDatabase1;
                return supportSQLiteDatabase1;
            }
        }
        throw new IllegalStateException("Attempting to open already closed database.");
    }

    public final void init(@NotNull SupportSQLiteOpenHelper supportSQLiteOpenHelper0) {
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper0, "delegateOpenHelper");
        this.setDelegateOpenHelper(supportSQLiteOpenHelper0);
    }

    public final boolean isActive() {
        return !this.i;
    }

    public final void setAutoCloseCallback(@NotNull Runnable runnable0) {
        Intrinsics.checkNotNullParameter(runnable0, "onAutoClose");
        this.b = runnable0;
    }

    public final void setDelegateDatabase$room_runtime_release(@Nullable SupportSQLiteDatabase supportSQLiteDatabase0) {
        this.h = supportSQLiteDatabase0;
    }

    public final void setDelegateOpenHelper(@NotNull SupportSQLiteOpenHelper supportSQLiteOpenHelper0) {
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper0, "<set-?>");
        this.delegateOpenHelper = supportSQLiteOpenHelper0;
    }

    public final void setLastDecrementRefCountTimeStamp$room_runtime_release(long v) {
        this.g = v;
    }

    public final void setOnAutoCloseCallback$room_runtime_release(@Nullable Runnable runnable0) {
        this.b = runnable0;
    }

    public final void setRefCount$room_runtime_release(int v) {
        this.f = v;
    }
}

