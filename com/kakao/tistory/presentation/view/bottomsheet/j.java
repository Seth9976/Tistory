package com.kakao.tistory.presentation.view.bottomsheet;

import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.widget.bottomsheet.BottomSheetValue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class j extends SuspendLambda implements Function2 {
    public int a;
    public final SwipeableState b;
    public final State c;

    public j(SwipeableState swipeableState0, State state0, Continuation continuation0) {
        this.b = swipeableState0;
        this.c = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j(this.b, this.c, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new j(this.b, this.c, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(BlogSwitchBottomSheetKt.access$BlogSwitchBottomSheetModal$lambda$1(this.c)) {
                    this.a = 1;
                    if(SwipeableState.animateTo$default(this.b, BottomSheetValue.Open, null, this, 2, null) == object1) {
                        return object1;
                    }
                }
                else {
                    Object object2 = this.b.getTargetValue();
                    BottomSheetValue bottomSheetValue0 = BottomSheetValue.Closed;
                    if(object2 != bottomSheetValue0) {
                        this.a = 2;
                        if(SwipeableState.animateTo$default(this.b, bottomSheetValue0, null, this, 2, null) == object1) {
                            return object1;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            case 1: 
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

