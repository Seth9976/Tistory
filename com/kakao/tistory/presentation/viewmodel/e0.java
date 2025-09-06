package com.kakao.tistory.presentation.viewmodel;

import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public final class e0 extends SuspendLambda implements Function3 {
    public List a;
    public List b;

    public e0(Continuation continuation0) {
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        e0 e00 = new e0(((Continuation)object2));
        e00.a = (List)object0;
        e00.b = (List)object1;
        return e00.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        int v;
        ResultKt.throwOnFailure(object0);
        List list0 = this.a;
        List list1 = this.b;
        Intrinsics.checkNotNull(list0);
        boolean z = false;
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            v = 0;
            for(Object object1: list0) {
                if(!list1.contains(((String)object1))) {
                    ++v;
                    if(v < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        else {
            v = 0;
        }
        if(v < 10) {
            z = true;
        }
        return Boxing.boxBoolean(z);
    }
}

