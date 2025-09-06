package com.kakao.tistory.presentation.screen.blogswitch;

import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchEvent.Dismiss;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchEvent.GoMy;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchEvent.GoSetting;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class m extends SuspendLambda implements Function2 {
    public Object a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;

    public m(Function0 function00, Function0 function01, Function0 function02, Continuation continuation0) {
        this.b = function00;
        this.c = function01;
        this.d = function02;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new m(this.b, this.c, this.d, continuation0);
        continuation1.a = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m)this.create(((BlogSwitchEvent)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        BlogSwitchEvent blogSwitchEvent0 = (BlogSwitchEvent)this.a;
        if(Intrinsics.areEqual(blogSwitchEvent0, Dismiss.INSTANCE)) {
            this.b.invoke();
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(blogSwitchEvent0, GoSetting.INSTANCE)) {
            this.c.invoke();
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(blogSwitchEvent0, GoMy.INSTANCE)) {
            this.d.invoke();
        }
        return Unit.INSTANCE;
    }
}

