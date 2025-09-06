package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.CheckModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class d3 extends SuspendLambda implements Function2 {
    public int a;
    public final ProtectedEntryCheckViewModel b;
    public final String c;
    public final long d;
    public final String e;

    public d3(ProtectedEntryCheckViewModel protectedEntryCheckViewModel0, String s, long v, String s1, Continuation continuation0) {
        this.b = protectedEntryCheckViewModel0;
        this.c = s;
        this.d = v;
        this.e = s1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d3(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d3)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Intrinsics.checkNotNullExpressionValue(this.e, "$guestPassword");
                this.a = 1;
                object0 = this.b.g.postCheckProtectedPassword(this.c, this.d, this.e, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ProtectedEntryCheckViewModel protectedEntryCheckViewModel0 = this.b;
        String s = this.e;
        if(((Result)object0) instanceof Success) {
            if(((CheckModel)((Success)(((Result)object0))).getData()).getEnable()) {
                Intrinsics.checkNotNull(s);
                protectedEntryCheckViewModel0.get_okCallback().setValue(new Event(s));
                return Unit.INSTANCE;
            }
            protectedEntryCheckViewModel0.updateErrorEnabled(true);
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            protectedEntryCheckViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

