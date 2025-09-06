package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001A\u00028\u00002\u0006\u0010\b\u001A\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "T", "Landroidx/datastore/core/CorruptionHandler;", "Lkotlin/Function1;", "Landroidx/datastore/core/CorruptionException;", "produceNewData", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ex", "handleCorruption", "(Landroidx/datastore/core/CorruptionException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ReplaceFileCorruptionHandler implements CorruptionHandler {
    public final Function1 a;

    public ReplaceFileCorruptionHandler(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "produceNewData");
        super();
        this.a = function10;
    }

    @Override  // androidx.datastore.core.CorruptionHandler
    @Nullable
    public Object handleCorruption(@NotNull CorruptionException corruptionException0, @NotNull Continuation continuation0) throws IOException {
        return this.a.invoke(corruptionException0);
    }
}

