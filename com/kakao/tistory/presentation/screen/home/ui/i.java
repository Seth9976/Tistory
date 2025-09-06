package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class i extends SuspendLambda implements Function2 {
    public int a;
    public final State b;
    public final List c;
    public final SnapshotStateList d;
    public final SnapshotStateList e;
    public final Function1 f;

    public i(State state0, List list0, SnapshotStateList snapshotStateList0, SnapshotStateList snapshotStateList1, Function1 function10, Continuation continuation0) {
        this.b = state0;
        this.c = list0;
        this.d = snapshotStateList0;
        this.e = snapshotStateList1;
        this.f = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i(this.b, this.c, this.d, this.e, this.f, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Flow flow0 = FlowKt.distinctUntilChanged(new HomeSlotArrangedKt.homeSlotArranged.1.invokeSuspend..inlined.mapNotNull.1(SnapshotStateKt.snapshotFlow(new g(this.b)), this.c, this.d, this.e));
                h h0 = new h(this.f);
                this.a = 1;
                return flow0.collect(h0, this) == object1 ? object1 : Unit.INSTANCE;
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

