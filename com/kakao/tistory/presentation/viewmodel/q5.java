package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

public final class q5 implements FlowCollector {
    public final SignUpViewModel a;
    public final String b;

    public q5(SignUpViewModel signUpViewModel0, String s) {
        this.a = signUpViewModel0;
        this.b = s;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        SignUpViewModel signUpViewModel0 = this.a;
        String s = this.b;
        if(((Result)object0) instanceof Success) {
            if(((Long)((Success)(((Result)object0))).getData()) != null) {
                CrashlyticsUtils.INSTANCE.setUserId(String.valueOf(((Success)(((Result)object0)))));
            }
            signUpViewModel0.a(new p5(signUpViewModel0, s));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            signUpViewModel0.isShowProgress().postValue(Boxing.boxBoolean(true));
            signUpViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
        }
        return Unit.INSTANCE;
    }
}

