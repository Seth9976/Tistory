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

public final class c3 extends SuspendLambda implements Function2 {
    public ProtectedEntryCheckViewModel a;
    public String b;
    public int c;
    public final ProtectedEntryCheckViewModel d;
    public final String e;
    public final String f;

    public c3(ProtectedEntryCheckViewModel protectedEntryCheckViewModel0, String s, String s1, Continuation continuation0) {
        this.d = protectedEntryCheckViewModel0;
        this.e = s;
        this.f = s1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c3(this.d, this.e, this.f, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c3)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        String s2;
        ProtectedEntryCheckViewModel protectedEntryCheckViewModel0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                String s = (String)this.d.getSlogan().getValue();
                if(s != null) {
                    protectedEntryCheckViewModel0 = this.d;
                    String s1 = this.f;
                    Intrinsics.checkNotNull(s1);
                    this.a = protectedEntryCheckViewModel0;
                    this.b = s1;
                    this.c = 1;
                    object0 = protectedEntryCheckViewModel0.g.postCheckProtectedPassword(this.e, s, s1, this);
                    if(object0 == object1) {
                        return object1;
                    }
                    s2 = s1;
                    goto label_20;
                }
                break;
            }
            case 1: {
                s2 = this.b;
                protectedEntryCheckViewModel0 = this.a;
                ResultKt.throwOnFailure(object0);
            label_20:
                if(((Result)object0) instanceof Success) {
                    if(((CheckModel)((Success)(((Result)object0))).getData()).getEnable()) {
                        Intrinsics.checkNotNull(s2);
                        protectedEntryCheckViewModel0.get_okCallback().setValue(new Event(s2));
                        return Unit.INSTANCE;
                    }
                    protectedEntryCheckViewModel0.updateErrorEnabled(true);
                    return Unit.INSTANCE;
                }
                if(((Result)object0) instanceof Fail) {
                    protectedEntryCheckViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
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

