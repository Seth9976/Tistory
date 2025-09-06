package f0;

import aa.o;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.pager.PagerState;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import qd.a;

public final class j0 implements FlingBehavior {
    public final TargetedFlingBehavior a;
    public final PagerState b;

    public j0(TargetedFlingBehavior targetedFlingBehavior0, PagerState pagerState0) {
        this.a = targetedFlingBehavior0;
        this.b = pagerState0;
    }

    @Override  // androidx.compose.foundation.gestures.FlingBehavior
    public final Object performFling(ScrollScope scrollScope0, float f, Continuation continuation0) {
        i0 i00;
        if(continuation0 instanceof i0) {
            i00 = (i0)continuation0;
            int v = i00.q;
            if((v & 0x80000000) == 0) {
                i00 = new i0(this, continuation0);
            }
            else {
                i00.q = v ^ 0x80000000;
            }
        }
        else {
            i00 = new i0(this, continuation0);
        }
        Object object0 = i00.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(i00.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                o o0 = new o(24, this, scrollScope0);
                i00.q = 1;
                object0 = this.a.performFling(scrollScope0, f, o0, i00);
                return object0 == object1 ? object1 : Boxing.boxFloat(((Number)object0).floatValue());
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Boxing.boxFloat(((Number)object0).floatValue());
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

