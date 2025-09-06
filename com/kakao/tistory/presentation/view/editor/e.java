package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.SwipeableState;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.kakao.tistory.presentation.widget.bottomsheet.BottomSheetValue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class e extends SuspendLambda implements Function2 {
    public int a;
    public final Boolean b;
    public final SwipeableState c;
    public final SoftwareKeyboardController d;
    public final LazyListState e;

    public e(Boolean boolean0, SwipeableState swipeableState0, SoftwareKeyboardController softwareKeyboardController0, LazyListState lazyListState0, Continuation continuation0) {
        this.b = boolean0;
        this.c = swipeableState0;
        this.d = softwareKeyboardController0;
        this.e = lazyListState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new e(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Boolean boolean0 = this.b;
                if(Intrinsics.areEqual(boolean0, Boxing.boxBoolean(true))) {
                    if(this.c.getTargetValue() != BottomSheetValue.Open) {
                        SoftwareKeyboardController softwareKeyboardController0 = this.d;
                        if(softwareKeyboardController0 != null) {
                            softwareKeyboardController0.hide();
                        }
                        this.a = 1;
                        if(LazyListState.scrollToItem$default(this.e, 0, 0, this, 2, null) != object1) {
                            goto label_23;
                        }
                        return object1;
                    }
                }
                else if(Intrinsics.areEqual(boolean0, Boxing.boxBoolean(false))) {
                    Object object2 = this.c.getTargetValue();
                    BottomSheetValue bottomSheetValue0 = BottomSheetValue.Closed;
                    if(object2 != bottomSheetValue0) {
                        this.a = 3;
                        if(SwipeableState.animateTo$default(this.c, bottomSheetValue0, null, this, 2, null) == object1) {
                            return object1;
                        }
                    }
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
            label_23:
                this.a = 2;
                if(SwipeableState.animateTo$default(this.c, BottomSheetValue.Open, null, this, 2, null) == object1) {
                    return object1;
                }
                break;
            }
            case 2: 
            case 3: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

