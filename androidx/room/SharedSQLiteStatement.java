package androidx.room;

import a2.b;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\'\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H$¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/room/SharedSQLiteStatement;", "", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "", "createQuery", "()Ljava/lang/String;", "", "assertNotMainThread", "()V", "Landroidx/sqlite/db/SupportSQLiteStatement;", "acquire", "()Landroidx/sqlite/db/SupportSQLiteStatement;", "statement", "release", "(Landroidx/sqlite/db/SupportSQLiteStatement;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class SharedSQLiteStatement {
    public final RoomDatabase b;
    public final AtomicBoolean c;
    public final Lazy d;

    public SharedSQLiteStatement(@NotNull RoomDatabase roomDatabase0) {
        Intrinsics.checkNotNullParameter(roomDatabase0, "database");
        super();
        this.b = roomDatabase0;
        this.c = new AtomicBoolean(false);
        this.d = c.lazy(new b(this, 21));
    }

    public static final SupportSQLiteStatement access$createNewStatement(SharedSQLiteStatement sharedSQLiteStatement0) {
        String s = sharedSQLiteStatement0.createQuery();
        return sharedSQLiteStatement0.b.compileStatement(s);
    }

    @NotNull
    public SupportSQLiteStatement acquire() {
        this.assertNotMainThread();
        if(this.c.compareAndSet(false, true)) {
            return (SupportSQLiteStatement)this.d.getValue();
        }
        String s = this.createQuery();
        return this.b.compileStatement(s);
    }

    public void assertNotMainThread() {
        this.b.assertNotMainThread();
    }

    @NotNull
    public abstract String createQuery();

    public void release(@NotNull SupportSQLiteStatement supportSQLiteStatement0) {
        Intrinsics.checkNotNullParameter(supportSQLiteStatement0, "statement");
        if(supportSQLiteStatement0 == ((SupportSQLiteStatement)this.d.getValue())) {
            this.c.set(false);
        }
    }
}

