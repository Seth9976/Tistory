package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class k extends SuspendLambda implements Function2 {
    public final BlogSwitchType a;
    public final State b;

    public k(BlogSwitchType blogSwitchType0, State state0, Continuation continuation0) {
        this.a = blogSwitchType0;
        this.b = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k(this.a, this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new k(this.a, this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        BlogSwitchBottomSheetKt.access$BlogSwitchBottomSheet$lambda$0(this.b).getUpdateScreenInfo().invoke(this.a);
        return Unit.INSTANCE;
    }
}

