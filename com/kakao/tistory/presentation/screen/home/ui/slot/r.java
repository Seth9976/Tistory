package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class r extends SuspendLambda implements Function2 {
    public final CoroutineScope a;
    public final List b;
    public final LazyListState c;
    public final String d;

    public r(CoroutineScope coroutineScope0, List list0, LazyListState lazyListState0, String s, Continuation continuation0) {
        this.a = coroutineScope0;
        this.b = list0;
        this.c = lazyListState0;
        this.d = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new r(this.a, this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((r)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        q q0 = new q(this.b, this.c, this.d, null);
        BuildersKt.launch$default(this.a, null, null, q0, 3, null);
        return Unit.INSTANCE;
    }
}

