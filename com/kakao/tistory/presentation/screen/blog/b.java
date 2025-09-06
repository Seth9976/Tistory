package com.kakao.tistory.presentation.screen.blog;

import android.content.Context;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class b extends SuspendLambda implements Function2 {
    public int a;
    public final BlogViewModel b;
    public final NavActions c;
    public final Context d;

    public b(BlogViewModel blogViewModel0, NavActions navActions0, Context context0, Continuation continuation0) {
        this.b = blogViewModel0;
        this.c = navActions0;
        this.d = context0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                com.kakao.tistory.presentation.screen.blog.a a0 = new com.kakao.tistory.presentation.screen.blog.a(this.c, this.d, null);
                this.a = 1;
                return FlowKt.collectLatest(this.b.getEvent(), a0, this) == object1 ? object1 : Unit.INSTANCE;
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

