package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class y0 extends SuspendLambda implements Function2 {
    public final EditorViewModel a;
    public final String b;

    public y0(EditorViewModel editorViewModel0, String s, Continuation continuation0) {
        this.a = editorViewModel0;
        this.b = s;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new y0(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new y0(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.a.loadKeditor(this.b);
        this.a.O.setValue(new Event(Unit.INSTANCE));
        this.a.isCompleteLoad().postValue(Boxing.boxBoolean(true));
        this.a.isShowProgress().postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}

