package com.kakao.tistory.presentation.viewmodel;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import qd.a;

public final class j1 extends SuspendLambda implements Function2 {
    public int a;
    public Object b;
    public final EditorViewModel c;

    public j1(EditorViewModel editorViewModel0, Continuation continuation0) {
        this.c = editorViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new j1(this.c, continuation0);
        continuation1.b = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        j1 j10 = new j1(this.c, ((Continuation)object1));
        j10.b = (CoroutineScope)object0;
        return j10.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        CoroutineScope coroutineScope0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                coroutineScope0 = (CoroutineScope)this.b;
                goto label_11;
            }
            case 1: {
                coroutineScope0 = (CoroutineScope)this.b;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            CoroutineScopeKt.ensureActive(coroutineScope0);
            if(!this.c.D0) {
                EditorViewModel.access$saveCurrentPost(this.c);
            }
        label_11:
            this.b = coroutineScope0;
            this.a = 1;
        }
        while(DelayKt.delay(30000L, this) != object1);
        return object1;
    }
}

