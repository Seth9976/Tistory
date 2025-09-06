package com.kakao.tistory.presentation.view.editor;

import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class c6 extends SuspendLambda implements Function2 {
    public int a;
    public final EditorViewModel b;
    public final EditorTagFragment c;

    public c6(EditorViewModel editorViewModel0, EditorTagFragment editorTagFragment0, Continuation continuation0) {
        this.b = editorViewModel0;
        this.c = editorTagFragment0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c6(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new c6(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                EditorTagFragment.initViewModel.1.3.1.invokeSuspend..inlined.map.1 editorTagFragment$initViewModel$1$3$1$invokeSuspend$$inlined$map$10 = new EditorTagFragment.initViewModel.1.3.1.invokeSuspend..inlined.map.1(this.b.getChallenge());
                b6 b60 = new b6(this.c, null);
                this.a = 1;
                return FlowKt.collectLatest(editorTagFragment$initViewModel$1$3$1$invokeSuspend$$inlined$map$10, b60, this) == object1 ? object1 : Unit.INSTANCE;
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

