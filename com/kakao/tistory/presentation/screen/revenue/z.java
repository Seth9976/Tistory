package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.screen.item.Vendor;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class z extends SuspendLambda implements Function2 {
    public final State a;

    public z(State state0, Continuation continuation0) {
        this.a = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new z(this.a, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new z(this.a, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        Vendor vendor0 = RevenueScreenKt.access$RevenueScreen$lambda$6(this.a).getSelectedVendor();
        if(vendor0 != null) {
            RevenueTiara.INSTANCE.trackPage(vendor0);
        }
        return Unit.INSTANCE;
    }
}

