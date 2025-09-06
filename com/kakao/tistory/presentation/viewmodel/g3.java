package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class g3 extends SuspendLambda implements Function2 {
    public PushViewModel a;
    public int b;
    public final PushViewModel c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final String l;

    public g3(PushViewModel pushViewModel0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String s, String s1, Continuation continuation0) {
        this.c = pushViewModel0;
        this.d = z;
        this.e = z1;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = s;
        this.l = s1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new g3(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g3)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object2;
        PushViewModel pushViewModel0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.b) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = this.c.h.getFcmToken();
                if(s != null) {
                    pushViewModel0 = this.c;
                    this.a = pushViewModel0;
                    this.b = 1;
                    object2 = pushViewModel0.g.putPushSetting(s, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this);
                    if(object2 == object1) {
                        return object1;
                    }
                    goto label_16;
                }
                break;
            }
            case 1: {
                PushViewModel pushViewModel1 = this.a;
                ResultKt.throwOnFailure(object0);
                pushViewModel0 = pushViewModel1;
                object2 = object0;
            label_16:
                if(!(((Result)object2) instanceof Success) && ((Result)object2) instanceof Fail) {
                    pushViewModel0.showErrorDialog(((Fail)(((Result)object2))).getErrorModel());
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

