package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.State;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class g0 extends SuspendLambda implements Function2 {
    public final SoftwareKeyboardController a;
    public final State b;

    public g0(SoftwareKeyboardController softwareKeyboardController0, State state0, Continuation continuation0) {
        this.a = softwareKeyboardController0;
        this.b = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g0(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new g0(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(SearchKeywordFragmentKt.access$KeyboardHideHandler$lambda$5(this.b)) {
            SoftwareKeyboardController softwareKeyboardController0 = this.a;
            if(softwareKeyboardController0 != null) {
                softwareKeyboardController0.hide();
            }
        }
        return Unit.INSTANCE;
    }
}

