package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.lazy.LazyListState;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.CategoryGroup;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class q extends SuspendLambda implements Function2 {
    public int a;
    public final List b;
    public final LazyListState c;
    public final String d;

    public q(List list0, LazyListState lazyListState0, String s, Continuation continuation0) {
        this.b = list0;
        this.c = lazyListState0;
        this.d = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new q(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((q)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = this.d;
                int v = 0;
                Iterator iterator0 = this.b.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        v = -1;
                        break;
                    }
                    Object object2 = iterator0.next();
                    if(Intrinsics.areEqual(((CategoryGroup)object2).getId(), s)) {
                        break;
                    }
                    ++v;
                }
                this.a = 1;
                return LazyListState.animateScrollToItem$default(this.c, c.coerceAtLeast(v, 0), 0, this, 2, null) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

