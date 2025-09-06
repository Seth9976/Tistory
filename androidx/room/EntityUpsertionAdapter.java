package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001C\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000B\u001A\u00020\n2\u000E\u0010\u000E\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r¢\u0006\u0004\b\u000B\u0010\u000FJ\u001B\u0010\u000B\u001A\u00020\n2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u000B\u0010\u0011J\u0015\u0010\u0013\u001A\u00020\u00122\u0006\u0010\t\u001A\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001D\u0010\u0016\u001A\u00020\u00152\u000E\u0010\u000E\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001B\u0010\u0016\u001A\u00020\u00152\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0016\u0010\u0019J#\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00120\u001A2\u000E\u0010\u000E\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r¢\u0006\u0004\b\u001B\u0010\u001CJ!\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00120\u001A2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001B\u0010\u001DJ%\u0010\u001E\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r2\u000E\u0010\u000E\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r¢\u0006\u0004\b\u001E\u0010\u001FJ#\u0010\u001E\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001E\u0010 ¨\u0006!"}, d2 = {"Landroidx/room/EntityUpsertionAdapter;", "T", "", "Landroidx/room/EntityInsertionAdapter;", "insertionAdapter", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "updateAdapter", "<init>", "(Landroidx/room/EntityInsertionAdapter;Landroidx/room/EntityDeletionOrUpdateAdapter;)V", "entity", "", "upsert", "(Ljava/lang/Object;)V", "", "entities", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Iterable;)V", "", "upsertAndReturnId", "(Ljava/lang/Object;)J", "", "upsertAndReturnIdsArray", "([Ljava/lang/Object;)[J", "", "(Ljava/util/Collection;)[J", "", "upsertAndReturnIdsList", "([Ljava/lang/Object;)Ljava/util/List;", "(Ljava/util/Collection;)Ljava/util/List;", "upsertAndReturnIdsArrayBox", "([Ljava/lang/Object;)[Ljava/lang/Long;", "(Ljava/util/Collection;)[Ljava/lang/Long;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntityUpsertionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n13579#2,2:225\n13579#2,2:229\n1855#3,2:227\n1855#3,2:231\n*S KotlinDebug\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n*L\n78#1:225,2\n151#1:229,2\n89#1:227,2\n165#1:231,2\n*E\n"})
public final class EntityUpsertionAdapter {
    public final EntityInsertionAdapter a;
    public final EntityDeletionOrUpdateAdapter b;

    public EntityUpsertionAdapter(@NotNull EntityInsertionAdapter entityInsertionAdapter0, @NotNull EntityDeletionOrUpdateAdapter entityDeletionOrUpdateAdapter0) {
        Intrinsics.checkNotNullParameter(entityInsertionAdapter0, "insertionAdapter");
        Intrinsics.checkNotNullParameter(entityDeletionOrUpdateAdapter0, "updateAdapter");
        super();
        this.a = entityInsertionAdapter0;
        this.b = entityDeletionOrUpdateAdapter0;
    }

    public static void a(SQLiteConstraintException sQLiteConstraintException0) {
        String s = sQLiteConstraintException0.getMessage();
        if(s == null || !StringsKt__StringsKt.contains(s, "unique", true) && !StringsKt__StringsKt.contains$default(s, "2067", false, 2, null) && !StringsKt__StringsKt.contains$default(s, "1555", false, 2, null)) {
            throw sQLiteConstraintException0;
        }
    }

    public final void upsert(@NotNull Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "entities");
        for(Object object0: iterable0) {
            try {
                this.a.insert(object0);
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                EntityUpsertionAdapter.a(sQLiteConstraintException0);
                this.b.handle(object0);
            }
        }
    }

    public final void upsert(Object object0) {
        try {
            this.a.insert(object0);
        }
        catch(SQLiteConstraintException sQLiteConstraintException0) {
            EntityUpsertionAdapter.a(sQLiteConstraintException0);
            this.b.handle(object0);
        }
    }

    public final void upsert(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "entities");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            try {
                this.a.insert(object0);
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                EntityUpsertionAdapter.a(sQLiteConstraintException0);
                this.b.handle(object0);
            }
        }
    }

    public final long upsertAndReturnId(Object object0) {
        try {
            return this.a.insertAndReturnId(object0);
        }
        catch(SQLiteConstraintException sQLiteConstraintException0) {
            EntityUpsertionAdapter.a(sQLiteConstraintException0);
            this.b.handle(object0);
            return -1L;
        }
    }

    @NotNull
    public final long[] upsertAndReturnIdsArray(@NotNull Collection collection0) {
        long v2;
        Intrinsics.checkNotNullParameter(collection0, "entities");
        Iterator iterator0 = collection0.iterator();
        int v = collection0.size();
        long[] arr_v = new long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = iterator0.next();
            try {
                v2 = this.a.insertAndReturnId(object0);
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                EntityUpsertionAdapter.a(sQLiteConstraintException0);
                this.b.handle(object0);
                v2 = -1L;
            }
            arr_v[v1] = v2;
        }
        return arr_v;
    }

    @NotNull
    public final long[] upsertAndReturnIdsArray(@NotNull Object[] arr_object) {
        long v1;
        Intrinsics.checkNotNullParameter(arr_object, "entities");
        long[] arr_v = new long[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            try {
                v1 = this.a.insertAndReturnId(arr_object[v]);
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                EntityUpsertionAdapter.a(sQLiteConstraintException0);
                this.b.handle(arr_object[v]);
                v1 = -1L;
            }
            arr_v[v] = v1;
        }
        return arr_v;
    }

    @NotNull
    public final Long[] upsertAndReturnIdsArrayBox(@NotNull Collection collection0) {
        long v2;
        Intrinsics.checkNotNullParameter(collection0, "entities");
        Iterator iterator0 = collection0.iterator();
        int v = collection0.size();
        Long[] arr_long = new Long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = iterator0.next();
            try {
                v2 = this.a.insertAndReturnId(object0);
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                EntityUpsertionAdapter.a(sQLiteConstraintException0);
                this.b.handle(object0);
                v2 = -1L;
            }
            arr_long[v1] = v2;
        }
        return arr_long;
    }

    @NotNull
    public final Long[] upsertAndReturnIdsArrayBox(@NotNull Object[] arr_object) {
        long v1;
        Intrinsics.checkNotNullParameter(arr_object, "entities");
        Long[] arr_long = new Long[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            try {
                v1 = this.a.insertAndReturnId(arr_object[v]);
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                EntityUpsertionAdapter.a(sQLiteConstraintException0);
                this.b.handle(arr_object[v]);
                v1 = -1L;
            }
            arr_long[v] = v1;
        }
        return arr_long;
    }

    @NotNull
    public final List upsertAndReturnIdsList(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "entities");
        List list0 = k.createListBuilder();
        for(Object object0: collection0) {
            try {
                list0.add(this.a.insertAndReturnId(object0));
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                EntityUpsertionAdapter.a(sQLiteConstraintException0);
                this.b.handle(object0);
                list0.add(-1L);
            }
        }
        return k.build(list0);
    }

    @NotNull
    public final List upsertAndReturnIdsList(@NotNull Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "entities");
        List list0 = k.createListBuilder();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            try {
                list0.add(this.a.insertAndReturnId(object0));
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                EntityUpsertionAdapter.a(sQLiteConstraintException0);
                this.b.handle(object0);
                list0.add(-1L);
            }
        }
        return k.build(list0);
    }
}

