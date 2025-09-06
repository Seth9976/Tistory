package androidx.datastore.core;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;

public final class g extends Lambda implements Function2 {
    public static final g w;

    static {
        g.w = new g(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Throwable throwable0 = (Throwable)object1;
        Intrinsics.checkNotNullParameter(((Update)object0), "msg");
        CompletableDeferred completableDeferred0 = ((Update)object0).getAck();
        if(throwable0 == null) {
            throwable0 = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        completableDeferred0.completeExceptionally(throwable0);
        return Unit.INSTANCE;
    }
}

