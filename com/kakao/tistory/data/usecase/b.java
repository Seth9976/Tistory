package com.kakao.tistory.data.usecase;

import com.kakao.tistory.domain.entity.Account;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class b extends SuspendLambda implements Function2 {
    public int a;
    public Object b;
    public final List c;
    public final LoginByKakaoUseCase d;
    public final String e;
    public final long f;
    public final String g;
    public final long h;

    public b(List list0, LoginByKakaoUseCase loginByKakaoUseCase0, String s, long v, String s1, long v1, Continuation continuation0) {
        this.c = list0;
        this.d = loginByKakaoUseCase0;
        this.e = s;
        this.f = v;
        this.g = s1;
        this.h = v1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new b(this.c, this.d, this.e, this.f, this.g, this.h, continuation0);
        continuation1.b = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((FlowCollector)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object3;
        FlowCollector flowCollector0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                flowCollector0 = (FlowCollector)this.b;
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                List list0 = this.c;
                if(list0 != null) {
                    for(Object object2: list0) {
                        ref$ObjectRef0.element = ref$ObjectRef0.element + ((String)object2) + " ";
                    }
                }
                String s = (String)ref$ObjectRef0.element;
                String s1 = s == null ? null : StringsKt__StringsKt.trim(s).toString();
                this.b = flowCollector0;
                this.a = 1;
                object3 = this.d.a.postLoginByKakao(this.e, this.f, this.g, this.h, s1, this);
                if(object3 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                FlowCollector flowCollector1 = (FlowCollector)this.b;
                ResultKt.throwOnFailure(object0);
                flowCollector0 = flowCollector1;
                object3 = object0;
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
        LoginByKakaoUseCase loginByKakaoUseCase0 = this.d;
        String s2 = this.e;
        if(((Result)object3) instanceof Success) {
            loginByKakaoUseCase0.a.setKakaoAccessToken(s2);
            User user0 = ((Account)((Success)(((Result)object3))).getData()).getUser();
            Success result$Success0 = new Success((user0 == null ? null : user0.getId()));
            this.b = null;
            this.a = 2;
            if(flowCollector0.emit(result$Success0, this) == object1) {
                return object1;
            }
        }
        else if(((Result)object3) instanceof Fail) {
            Fail result$Fail0 = new Fail(((Fail)(((Result)object3))).getErrorModel());
            this.b = null;
            this.a = 3;
            if(flowCollector0.emit(result$Fail0, this) == object1) {
                return object1;
            }
        }
        return Unit.INSTANCE;
    }
}

