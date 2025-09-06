package com.kakao.tistory.presentation.view.entry.widget;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class e extends SuspendLambda implements Function2 {
    public int a;
    public Object b;

    public e(Continuation continuation0) {
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new e(continuation0);
        continuation1.b = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        e e0 = new e(((Continuation)object1));
        e0.b = (FlowCollector)object0;
        return e0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                FlowCollector flowCollector0 = (FlowCollector)this.b;
                ChallengeSuccessDialogKt.ChallengeSuccessDialogPreview.1.1 challengeSuccessDialogKt$ChallengeSuccessDialogPreview$1$10 = new ChallengeSuccessDialogKt.ChallengeSuccessDialogPreview.1.1();
                this.a = 1;
                return flowCollector0.emit(challengeSuccessDialogKt$ChallengeSuccessDialogPreview$1$10, this) == object1 ? object1 : Unit.INSTANCE;
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

