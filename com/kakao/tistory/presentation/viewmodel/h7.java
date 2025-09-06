package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.Account;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class h7 extends SuspendLambda implements Function2 {
    public int a;
    public final TistoryLoginViewModel b;
    public final String c;
    public final String d;

    public h7(TistoryLoginViewModel tistoryLoginViewModel0, String s, String s1, Continuation continuation0) {
        this.b = tistoryLoginViewModel0;
        this.c = s;
        this.d = s1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new h7(this.b, this.c, this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((h7)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.g.invoke(this.c, this.d, this);
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
        TistoryLoginViewModel tistoryLoginViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            User user0 = ((Account)((Success)(((Result)object0))).getData()).getUser();
            if(user0 != null) {
                Long long0 = user0.getId();
                if(long0 != null) {
                    CrashlyticsUtils.INSTANCE.setUserId(String.valueOf(long0.longValue()));
                }
            }
            tistoryLoginViewModel0.a(new g7(tistoryLoginViewModel0));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            tistoryLoginViewModel0.isShowProgress().postValue(Boxing.boxBoolean(false));
            tistoryLoginViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

