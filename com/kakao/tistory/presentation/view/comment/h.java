package com.kakao.tistory.presentation.view.comment;

import androidx.compose.material.ModalBottomSheetState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class h extends SuspendLambda implements Function2 {
    public final CoroutineScope a;
    public final ModalBottomSheetState b;

    public h(CoroutineScope coroutineScope0, ModalBottomSheetState modalBottomSheetState0, Continuation continuation0) {
        this.a = coroutineScope0;
        this.b = modalBottomSheetState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new h(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new h(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        g g0 = new g(this.b, null);
        BuildersKt.launch$default(this.a, null, null, g0, 3, null);
        return Unit.INSTANCE;
    }
}

