package com.kakao.tistory.presentation.viewmodel;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.tistory.domain.entity.common.MemberErrorModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.extension.Event;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

public final class j2 implements FlowCollector {
    public final KakaoLoginViewModel a;
    public final OAuthToken b;
    public final String c;

    public j2(KakaoLoginViewModel kakaoLoginViewModel0, OAuthToken oAuthToken0, String s) {
        this.a = kakaoLoginViewModel0;
        this.b = oAuthToken0;
        this.c = s;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        KakaoLoginViewModel kakaoLoginViewModel0 = this.a;
        OAuthToken oAuthToken0 = this.b;
        String s = this.c;
        if(((Result)object0) instanceof Success) {
            kakaoLoginViewModel0.m.postValue(new Event(TuplesKt.to(oAuthToken0, s)));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            if(Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "KAKAO_USER_EMAIL_DUPLICATED")) {
                ErrorModel errorModel0 = ((Fail)(((Result)object0))).getErrorModel();
                Unit unit0 = null;
                MemberErrorModel memberErrorModel0 = errorModel0 instanceof MemberErrorModel ? ((MemberErrorModel)errorModel0) : null;
                if(memberErrorModel0 != null) {
                    List list0 = memberErrorModel0.getEmails();
                    if(list0 != null) {
                        kakaoLoginViewModel0.n.postValue(new Event(list0));
                        unit0 = Unit.INSTANCE;
                    }
                }
                if(unit0 == null) {
                    kakaoLoginViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
                    return Unit.INSTANCE;
                }
            }
            else {
                kakaoLoginViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
            }
        }
        return Unit.INSTANCE;
    }
}

