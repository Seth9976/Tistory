package com.kakao.tistory.presentation.viewmodel;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

public final class m7 extends SuspendLambda implements Function3 {
    public TopEntriesSortType a;
    public List b;

    public m7(Continuation continuation0) {
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        m7 m70 = new m7(((Continuation)object2));
        m70.a = (TopEntriesSortType)object0;
        m70.b = (List)object1;
        return m70.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        return CollectionsKt___CollectionsKt.sortedWith(this.b, new TopPostViewModel.topEntries.1.invokeSuspend..inlined.sortedByDescending.1(this.a));
    }
}

