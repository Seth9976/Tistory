package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.h1;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J[\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0014\b\u0002\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00072\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000EJi\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F2\u0010\b\u0002\u0010\u0006\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0014\b\u0002\u0010\t\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007¢\u0006\u0004\b\r\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/datastore/core/MultiProcessDataStoreFactory;", "", "T", "Landroidx/datastore/core/Storage;", "storage", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", "", "Landroidx/datastore/core/DataMigration;", "migrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Landroidx/datastore/core/DataStore;", "create", "(Landroidx/datastore/core/Storage;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Serializer;", "serializer", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "(Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/DataStore;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MultiProcessDataStoreFactory {
    @NotNull
    public static final MultiProcessDataStoreFactory INSTANCE;

    static {
        MultiProcessDataStoreFactory.INSTANCE = new MultiProcessDataStoreFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@NotNull Serializer serializer0, @Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull List list0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(serializer0, "serializer");
        Intrinsics.checkNotNullParameter(list0, "migrations");
        Intrinsics.checkNotNullParameter(function00, "produceFile");
        return MultiProcessDataStoreFactory.create$default(this, serializer0, replaceFileCorruptionHandler0, list0, null, function00, 8, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@NotNull Serializer serializer0, @Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull List list0, @NotNull CoroutineScope coroutineScope0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(serializer0, "serializer");
        Intrinsics.checkNotNullParameter(list0, "migrations");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        Intrinsics.checkNotNullParameter(function00, "produceFile");
        FileStorage fileStorage0 = new FileStorage(serializer0, new h1(coroutineScope0, 20), function00);
        List list1 = k.listOf(DataMigrationInitializer.Companion.getInitializer(list0));
        if(replaceFileCorruptionHandler0 == null) {
            replaceFileCorruptionHandler0 = new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(fileStorage0, list1, replaceFileCorruptionHandler0, coroutineScope0);
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@NotNull Serializer serializer0, @Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(serializer0, "serializer");
        Intrinsics.checkNotNullParameter(function00, "produceFile");
        return MultiProcessDataStoreFactory.create$default(this, serializer0, replaceFileCorruptionHandler0, null, null, function00, 12, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@NotNull Serializer serializer0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(serializer0, "serializer");
        Intrinsics.checkNotNullParameter(function00, "produceFile");
        return MultiProcessDataStoreFactory.create$default(this, serializer0, null, null, null, function00, 14, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@NotNull Storage storage0) {
        Intrinsics.checkNotNullParameter(storage0, "storage");
        return MultiProcessDataStoreFactory.create$default(this, storage0, null, null, null, 14, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@NotNull Storage storage0, @Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0) {
        Intrinsics.checkNotNullParameter(storage0, "storage");
        return MultiProcessDataStoreFactory.create$default(this, storage0, replaceFileCorruptionHandler0, null, null, 12, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@NotNull Storage storage0, @Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(storage0, "storage");
        Intrinsics.checkNotNullParameter(list0, "migrations");
        return MultiProcessDataStoreFactory.create$default(this, storage0, replaceFileCorruptionHandler0, list0, null, 8, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@NotNull Storage storage0, @Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull List list0, @NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(storage0, "storage");
        Intrinsics.checkNotNullParameter(list0, "migrations");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        List list1 = k.listOf(DataMigrationInitializer.Companion.getInitializer(list0));
        if(replaceFileCorruptionHandler0 == null) {
            replaceFileCorruptionHandler0 = new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage0, list1, replaceFileCorruptionHandler0, coroutineScope0);
    }

    public static DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory0, Serializer serializer0, ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, List list0, CoroutineScope coroutineScope0, Function0 function00, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 8) != 0) {
            coroutineScope0 = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        return multiProcessDataStoreFactory0.create(serializer0, ((v & 2) == 0 ? replaceFileCorruptionHandler0 : null), list0, coroutineScope0, function00);
    }

    public static DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory0, Storage storage0, ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, List list0, CoroutineScope coroutineScope0, int v, Object object0) {
        if((v & 2) != 0) {
            replaceFileCorruptionHandler0 = null;
        }
        if((v & 4) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 8) != 0) {
            coroutineScope0 = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        return multiProcessDataStoreFactory0.create(storage0, replaceFileCorruptionHandler0, list0, coroutineScope0);
    }
}

