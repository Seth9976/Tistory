package androidx.datastore.preferences.core;

import a4.a;
import androidx.datastore.core.DataStore;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\r\u001A\u00020\u000221\u0010\f\u001A-\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000ER\u001A\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00020\u000F8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStore;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "delegate", "<init>", "(Landroidx/datastore/core/DataStore;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "transform", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "data", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PreferenceDataStore implements DataStore {
    public final DataStore a;

    public PreferenceDataStore(@NotNull DataStore dataStore0) {
        Intrinsics.checkNotNullParameter(dataStore0, "delegate");
        super();
        this.a = dataStore0;
    }

    @Override  // androidx.datastore.core.DataStore
    @NotNull
    public Flow getData() {
        return this.a.getData();
    }

    @Override  // androidx.datastore.core.DataStore
    @Nullable
    public Object updateData(@NotNull Function2 function20, @NotNull Continuation continuation0) {
        a a0 = new a(function20, null);
        return this.a.updateData(a0, continuation0);
    }
}

