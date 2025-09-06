package androidx.datastore;

import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v3.a;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001Ar\u0010\u0000\u001A\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u0001\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001A\u00020\u00062\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u0002H\u00040\b2\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\n2 \b\u0002\u0010\u000B\u001A\u001A\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000E0\r0\f2\b\b\u0002\u0010\u000F\u001A\u00020\u0010¨\u0006\u0011"}, d2 = {"dataStore", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "T", "fileName", "", "serializer", "Landroidx/datastore/core/Serializer;", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "produceMigrations", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "datastore_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "DataStoreDelegateKt")
public final class DataStoreDelegateKt {
    @NotNull
    public static final ReadOnlyProperty dataStore(@NotNull String s, @NotNull Serializer serializer0, @Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull Function1 function10, @NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(s, "fileName");
        Intrinsics.checkNotNullParameter(serializer0, "serializer");
        Intrinsics.checkNotNullParameter(function10, "produceMigrations");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        return new DataStoreSingletonDelegate(s, new OkioSerializerWrapper(serializer0), replaceFileCorruptionHandler0, function10, coroutineScope0);
    }

    public static ReadOnlyProperty dataStore$default(String s, Serializer serializer0, ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, Function1 function10, CoroutineScope coroutineScope0, int v, Object object0) {
        if((v & 4) != 0) {
            replaceFileCorruptionHandler0 = null;
        }
        if((v & 8) != 0) {
            function10 = a.w;
        }
        if((v & 16) != 0) {
            coroutineScope0 = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        return DataStoreDelegateKt.dataStore(s, serializer0, replaceFileCorruptionHandler0, function10, coroutineScope0);
    }
}

