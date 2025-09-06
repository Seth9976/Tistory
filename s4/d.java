package s4;

import android.os.Handler;
import androidx.paging.AsyncPagingDataDiffer;
import androidx.paging.CombinedLoadStates;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final AsyncPagingDataDiffer w;

    public d(AsyncPagingDataDiffer asyncPagingDataDiffer0) {
        this.w = asyncPagingDataDiffer0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CombinedLoadStates)object0), "loadState");
        AsyncPagingDataDiffer asyncPagingDataDiffer0 = this.w;
        if(!((Boolean)asyncPagingDataDiffer0.getInGetItem$paging_runtime_release().getValue()).booleanValue()) {
            for(Object object1: asyncPagingDataDiffer0.k) {
                ((Function1)object1).invoke(((CombinedLoadStates)object0));
            }
            return Unit.INSTANCE;
        }
        Handler handler0 = AsyncPagingDataDiffer.access$getLoadStateListenerHandler(asyncPagingDataDiffer0);
        handler0.removeCallbacks(asyncPagingDataDiffer0.n);
        asyncPagingDataDiffer0.n.getLoadState().set(((CombinedLoadStates)object0));
        handler0.post(asyncPagingDataDiffer0.n);
        return Unit.INSTANCE;
    }
}

