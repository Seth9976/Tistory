package o6;

import com.google.accompanist.pager.PagerState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class f implements FlowCollector {
    public final int a;
    public final PagerState b;

    public f(PagerState pagerState0, int v) {
        this.a = v;
        this.b = pagerState0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        if(this.a != 0) {
            Integer integer0 = (Integer)object0;
            this.b.updateCurrentPageBasedOnLazyListState$pager_release();
            return Unit.INSTANCE;
        }
        ((Boolean)object0).booleanValue();
        this.b.onScrollFinished$pager_release();
        return Unit.INSTANCE;
    }
}

