package com.kakao.tistory.presentation.screen.blog.setting;

import android.content.Context;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class f extends SuspendLambda implements Function2 {
    public int a;
    public final BlogSettingViewModel b;
    public final Function1 c;
    public final NavActions d;
    public final Context e;
    public final i f;
    public final h g;

    public f(BlogSettingViewModel blogSettingViewModel0, Function1 function10, NavActions navActions0, Context context0, i i0, h h0, Continuation continuation0) {
        this.b = blogSettingViewModel0;
        this.c = function10;
        this.d = navActions0;
        this.e = context0;
        this.f = i0;
        this.g = h0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new f(this.b, this.c, this.d, this.e, this.f, this.g, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                e e0 = new e(this.c, this.d, this.e, this.f, this.g, null);
                this.a = 1;
                return FlowKt.collectLatest(this.b.getEvent(), e0, this) == object1 ? object1 : Unit.INSTANCE;
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

