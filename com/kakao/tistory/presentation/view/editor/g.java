package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.SwipeableState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.lifecycle.LifecycleOwner;
import com.kakao.tistory.presentation.viewmodel.DraftViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class g extends SuspendLambda implements Function2 {
    public final DraftViewModel a;
    public final LifecycleOwner b;
    public final CoroutineScope c;
    public final SwipeableState d;
    public final SoftwareKeyboardController e;
    public final LazyListState f;

    public g(DraftViewModel draftViewModel0, LifecycleOwner lifecycleOwner0, CoroutineScope coroutineScope0, SwipeableState swipeableState0, SoftwareKeyboardController softwareKeyboardController0, LazyListState lazyListState0, Continuation continuation0) {
        this.a = draftViewModel0;
        this.b = lifecycleOwner0;
        this.c = coroutineScope0;
        this.d = swipeableState0;
        this.e = softwareKeyboardController0;
        this.f = lazyListState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g(this.a, this.b, this.c, this.d, this.e, this.f, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        y y0 = new y(new f(this.c, this.d, this.e, this.f));
        this.a.getShowDraftBottomSheet().observe(this.b, y0);
        return Unit.INSTANCE;
    }
}

