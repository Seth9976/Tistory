package androidx.room;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001C\n\u0000\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001D\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00028\u0000H$¢\u0006\u0002\u0010\u000BJ\b\u0010\f\u001A\u00020\rH$J\u0013\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\n\u001A\u00028\u0000¢\u0006\u0002\u0010\u0010J\u001B\u0010\u0011\u001A\u00020\u000F2\u000E\u0010\u0012\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0013¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0011\u001A\u00020\u000F2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015¨\u0006\u0016"}, d2 = {"Landroidx/room/EntityDeletionOrUpdateAdapter;", "T", "Landroidx/room/SharedSQLiteStatement;", "database", "Landroidx/room/RoomDatabase;", "(Landroidx/room/RoomDatabase;)V", "bind", "", "statement", "Landroidx/sqlite/db/SupportSQLiteStatement;", "entity", "(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/Object;)V", "createQuery", "", "handle", "", "(Ljava/lang/Object;)I", "handleMultiple", "entities", "", "([Ljava/lang/Object;)I", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntityDeletionOrUpdateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityDeletionOrUpdateAdapter.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,107:1\n1855#2,2:108\n13579#3,2:110\n*S KotlinDebug\n*F\n+ 1 EntityDeletionOrUpdateAdapter.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n*L\n77#1:108,2\n97#1:110,2\n*E\n"})
public abstract class EntityDeletionOrUpdateAdapter extends SharedSQLiteStatement {
    public EntityDeletionOrUpdateAdapter(@NotNull RoomDatabase roomDatabase0) {
        Intrinsics.checkNotNullParameter(roomDatabase0, "database");
        super(roomDatabase0);
    }

    public abstract void bind(@NotNull SupportSQLiteStatement arg1, Object arg2);

    @Override  // androidx.room.SharedSQLiteStatement
    @NotNull
    public abstract String createQuery();

    public final int handle(Object object0) {
        SupportSQLiteStatement supportSQLiteStatement0 = this.acquire();
        try {
            this.bind(supportSQLiteStatement0, object0);
            return supportSQLiteStatement0.executeUpdateDelete();
        }
        finally {
            this.release(supportSQLiteStatement0);
        }
    }

    public final int handleMultiple(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "entities");
        SupportSQLiteStatement supportSQLiteStatement0 = this.acquire();
        try {
            int v1 = 0;
            for(Object object0: iterable0) {
                this.bind(supportSQLiteStatement0, object0);
                v1 += supportSQLiteStatement0.executeUpdateDelete();
            }
            return v1;
        }
        finally {
            this.release(supportSQLiteStatement0);
        }
    }

    public final int handleMultiple(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "entities");
        SupportSQLiteStatement supportSQLiteStatement0 = this.acquire();
        try {
            int v2 = 0;
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                this.bind(supportSQLiteStatement0, arr_object[v1]);
                v2 += supportSQLiteStatement0.executeUpdateDelete();
            }
            return v2;
        }
        finally {
            this.release(supportSQLiteStatement0);
        }
    }
}

