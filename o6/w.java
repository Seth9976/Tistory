package o6;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import com.google.accompanist.pager.PagerState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class w extends SuspendLambda implements Function2 {
    public Object o;
    public final LazyListItemInfo p;
    public final PagerState q;
    public final float r;

    public w(LazyListItemInfo lazyListItemInfo0, PagerState pagerState0, float f, Continuation continuation0) {
        this.p = lazyListItemInfo0;
        this.q = pagerState0;
        this.r = f;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new w(this.p, this.q, this.r, continuation0);
        continuation1.o = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((w)this.create(((ScrollScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        ScrollScope scrollScope0 = (ScrollScope)this.o;
        int v = this.p.getSize();
        scrollScope0.scrollBy(((float)(this.q.getItemSpacing$pager_release() + v)) * this.r);
        return Unit.INSTANCE;
    }
}

