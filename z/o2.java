package z;

import androidx.compose.foundation.gestures.NestedScrollScope;
import androidx.compose.foundation.gestures.ScrollingLogic.doFlingAnimation.2.reverseScope.1;
import androidx.compose.foundation.gestures.ScrollingLogic;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.LongRef;
import qd.a;

public final class o2 extends SuspendLambda implements Function2 {
    public ScrollingLogic o;
    public LongRef p;
    public long q;
    public int r;
    public Object s;
    public final ScrollingLogic t;
    public final LongRef u;
    public final long v;

    public o2(ScrollingLogic scrollingLogic0, LongRef ref$LongRef0, long v, Continuation continuation0) {
        this.t = scrollingLogic0;
        this.u = ref$LongRef0;
        this.v = v;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new o2(this.t, this.u, this.v, continuation0);
        continuation1.s = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((o2)this.create(((NestedScrollScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ScrollingLogic scrollingLogic1;
        long v1;
        LongRef ref$LongRef1;
        ScrollingLogic scrollingLogic0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                scrollingLogic0 = this.t;
                ScrollingLogic.doFlingAnimation.2.reverseScope.1 scrollingLogic$doFlingAnimation$2$reverseScope$10 = new ScrollingLogic.doFlingAnimation.2.reverseScope.1(((NestedScrollScope)this.s), scrollingLogic0);
                LongRef ref$LongRef0 = this.u;
                long v = ref$LongRef0.element;
                float f = scrollingLogic0.reverseIfNeeded(ScrollingLogic.access$toFloat-TH1AsA0(scrollingLogic0, this.v));
                this.s = scrollingLogic0;
                this.o = scrollingLogic0;
                this.p = ref$LongRef0;
                this.q = v;
                this.r = 1;
                object0 = scrollingLogic0.c.performFling(scrollingLogic$doFlingAnimation$2$reverseScope$10, f, this);
                if(object0 == object1) {
                    return object1;
                }
                ref$LongRef1 = ref$LongRef0;
                v1 = v;
                scrollingLogic1 = scrollingLogic0;
                break;
            }
            case 1: {
                v1 = this.q;
                ref$LongRef1 = this.p;
                scrollingLogic0 = this.o;
                scrollingLogic1 = (ScrollingLogic)this.s;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ref$LongRef1.element = ScrollingLogic.access$update-QWom1Mo(scrollingLogic0, v1, scrollingLogic1.reverseIfNeeded(((Number)object0).floatValue()));
        return Unit.INSTANCE;
    }
}

