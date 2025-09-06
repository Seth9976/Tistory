package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class p5 extends SuspendLambda implements Function2 {
    public final FocusRequester a;
    public final SoftwareKeyboardController b;
    public final MutableState c;

    public p5(FocusRequester focusRequester0, SoftwareKeyboardController softwareKeyboardController0, MutableState mutableState0, Continuation continuation0) {
        this.a = focusRequester0;
        this.b = softwareKeyboardController0;
        this.c = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new p5(this.a, this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((p5)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(EditorTagFragment.access$TagList$lambda$1(this.c) == null) {
            this.a.freeFocus();
            SoftwareKeyboardController softwareKeyboardController1 = this.b;
            if(softwareKeyboardController1 != null) {
                softwareKeyboardController1.hide();
            }
        }
        else {
            this.a.requestFocus();
            SoftwareKeyboardController softwareKeyboardController0 = this.b;
            if(softwareKeyboardController0 != null) {
                softwareKeyboardController0.show();
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}

