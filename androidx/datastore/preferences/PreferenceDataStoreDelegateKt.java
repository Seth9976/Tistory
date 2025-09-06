package androidx.datastore.preferences;

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
import z3.a;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A^\u0010\u0000\u001A\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001A\u00020\u00062\u0010\b\u0002\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2 \b\u0002\u0010\t\u001A\u001A\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u000B0\n2\b\b\u0002\u0010\r\u001A\u00020\u000E¨\u0006\u000F"}, d2 = {"preferencesDataStore", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "name", "", "corruptionHandler", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "produceMigrations", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "datastore-preferences_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "PreferenceDataStoreDelegateKt")
public final class PreferenceDataStoreDelegateKt {
    @NotNull
    public static final ReadOnlyProperty preferencesDataStore(@NotNull String s, @Nullable ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @NotNull Function1 function10, @NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function10, "produceMigrations");
        Intrinsics.checkNotNullParameter(coroutineScope0, "scope");
        return new PreferenceDataStoreSingletonDelegate(s, replaceFileCorruptionHandler0, function10, coroutineScope0);
    }

    public static ReadOnlyProperty preferencesDataStore$default(String s, ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, Function1 function10, CoroutineScope coroutineScope0, int v, Object object0) {
        if((v & 2) != 0) {
            replaceFileCorruptionHandler0 = null;
        }
        if((v & 4) != 0) {
            function10 = a.w;
        }
        if((v & 8) != 0) {
            coroutineScope0 = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default(null, 1, null)));
        }
        return PreferenceDataStoreDelegateKt.preferencesDataStore(s, replaceFileCorruptionHandler0, function10, coroutineScope0);
    }
}

