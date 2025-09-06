package androidx.datastore.preferences.core;

import a4.b;
import a4.c;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Storage;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.okio.OkioStorage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import okio.FileSystem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001JU\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00030\r2\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\b\b\u0002\u0010\t\u001A\u00020\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u0007¢\u0006\u0004\b\u000E\u0010\u000FJU\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00030\u00102\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\b\b\u0002\u0010\t\u001A\u00020\bH\u0007¢\u0006\u0004\b\u000E\u0010\u0012JU\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00030\r2\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\b\b\u0002\u0010\t\u001A\u00020\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00130\nH\u0007¢\u0006\u0004\b\u0014\u0010\u000F¨\u0006\u0015"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStoreFactory;", "", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "Landroidx/datastore/preferences/core/Preferences;", "corruptionHandler", "", "Landroidx/datastore/core/DataMigration;", "migrations", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/DataStore;", "create", "(Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Storage;", "storage", "(Landroidx/datastore/core/Storage;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)Landroidx/datastore/core/DataStore;", "Lokio/Path;", "createWithPath", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PreferenceDataStoreFactory {
    @NotNull
    public static final PreferenceDataStoreFactory INSTANCE;

    static {
        PreferenceDataStoreFactory.INSTANCE = new PreferenceDataStoreFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@NotNull Storage storage0) {
        Intrinsics.checkNotNullParameter(storage0, "storage");
        return PreferenceDataStoreFactory.create$default(this, storage0, null, null, null, 14, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@NotNull Storage storage0, @Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0) {
        Intrinsics.checkNotNullParameter(storage0, "storage");
        return PreferenceDataStoreFactory.create$default(this, storage0, replaceFileCorruptionHandler0, null, null, 12, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@NotNull Storage storage0, @Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(storage0, "storage");
        Intrinsics.checkNotNullParameter(list0, "migrations");
        return PreferenceDataStoreFactory.create$default(this, storage0, replaceFileCorruptionHandler0, list0, null, 8, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@NotNull Storage storage0, @Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull List list0, @NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(storage0, "storage");
        Intrinsics.checkNotNullParameter(list0, "migrations");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(storage0, replaceFileCorruptionHandler0, list0, coroutineScope0));
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull List list0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(list0, "migrations");
        Intrinsics.checkNotNullParameter(function00, "produceFile");
        return PreferenceDataStoreFactory.create$default(this, replaceFileCorruptionHandler0, list0, null, function00, 4, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull List list0, @NotNull CoroutineScope coroutineScope0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(list0, "migrations");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        Intrinsics.checkNotNullParameter(function00, "produceFile");
        b b0 = new b(function00);
        return new PreferenceDataStore(this.create(new OkioStorage(FileSystem.SYSTEM, PreferencesSerializer.INSTANCE, null, b0, 4, null), replaceFileCorruptionHandler0, list0, coroutineScope0));
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "produceFile");
        return PreferenceDataStoreFactory.create$default(this, replaceFileCorruptionHandler0, null, null, function00, 6, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore create(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "produceFile");
        return PreferenceDataStoreFactory.create$default(this, null, null, null, function00, 7, null);
    }

    public static DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory0, Storage storage0, ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, List list0, CoroutineScope coroutineScope0, int v, Object object0) {
        if((v & 2) != 0) {
            replaceFileCorruptionHandler0 = null;
        }
        if((v & 4) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 8) != 0) {
            coroutineScope0 = CoroutineScopeKt.CoroutineScope(Actual_jvmKt.ioDispatcher().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        return preferenceDataStoreFactory0.create(storage0, replaceFileCorruptionHandler0, list0, coroutineScope0);
    }

    public static DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory0, ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, List list0, CoroutineScope coroutineScope0, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            replaceFileCorruptionHandler0 = null;
        }
        if((v & 2) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 4) != 0) {
            coroutineScope0 = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        return preferenceDataStoreFactory0.create(replaceFileCorruptionHandler0, list0, coroutineScope0, function00);
    }

    @JvmOverloads
    @NotNull
    public final DataStore createWithPath(@Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull List list0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(list0, "migrations");
        Intrinsics.checkNotNullParameter(function00, "produceFile");
        return PreferenceDataStoreFactory.createWithPath$default(this, replaceFileCorruptionHandler0, list0, null, function00, 4, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore createWithPath(@Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull List list0, @NotNull CoroutineScope coroutineScope0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(list0, "migrations");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        Intrinsics.checkNotNullParameter(function00, "produceFile");
        return this.create(replaceFileCorruptionHandler0, list0, coroutineScope0, new c(function00, 0));
    }

    @JvmOverloads
    @NotNull
    public final DataStore createWithPath(@Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "produceFile");
        return PreferenceDataStoreFactory.createWithPath$default(this, replaceFileCorruptionHandler0, null, null, function00, 6, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore createWithPath(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "produceFile");
        return PreferenceDataStoreFactory.createWithPath$default(this, null, null, null, function00, 7, null);
    }

    public static DataStore createWithPath$default(PreferenceDataStoreFactory preferenceDataStoreFactory0, ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, List list0, CoroutineScope coroutineScope0, Function0 function00, int v, Object object0) {
        if((v & 1) != 0) {
            replaceFileCorruptionHandler0 = null;
        }
        if((v & 2) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        if((v & 4) != 0) {
            coroutineScope0 = CoroutineScopeKt.CoroutineScope(Actual_jvmKt.ioDispatcher().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        return preferenceDataStoreFactory0.createWithPath(replaceFileCorruptionHandler0, list0, coroutineScope0, function00);
    }
}

