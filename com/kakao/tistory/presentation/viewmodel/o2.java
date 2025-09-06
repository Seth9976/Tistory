package com.kakao.tistory.presentation.viewmodel;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.tistory.domain.entity.common.RegulationErrorModel;
import com.kakao.tistory.domain.entity.common.RegulationLink;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

public final class o2 implements FlowCollector {
    public final KakaoLoginViewModel a;
    public final OAuthToken b;

    public o2(KakaoLoginViewModel kakaoLoginViewModel0, OAuthToken oAuthToken0) {
        this.a = kakaoLoginViewModel0;
        this.b = oAuthToken0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        KakaoLoginViewModel kakaoLoginViewModel0 = this.a;
        OAuthToken oAuthToken0 = this.b;
        if(((Result)object0) instanceof Success) {
            if(((Long)((Success)(((Result)object0))).getData()) != null) {
                CrashlyticsUtils.INSTANCE.setUserId(String.valueOf(((Result)object0)));
            }
            kakaoLoginViewModel0.a(new n2(kakaoLoginViewModel0));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            kakaoLoginViewModel0.isShowProgress().postValue(Boxing.boxBoolean(false));
            if(Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "UNREGISTERED_KAKAO_ACCOUNT")) {
                KakaoLoginViewModel.access$getKakaoEmail(kakaoLoginViewModel0, oAuthToken0);
                return Unit.INSTANCE;
            }
            if(Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "CAN_NOT_AUTHENTICATE")) {
                ErrorModel errorModel0 = ((Fail)(((Result)object0))).getErrorModel();
                Unit unit0 = null;
                RegulationErrorModel regulationErrorModel0 = errorModel0 instanceof RegulationErrorModel ? ((RegulationErrorModel)errorModel0) : null;
                if(regulationErrorModel0 != null) {
                    RegulationLink regulationLink0 = regulationErrorModel0.getData();
                    if(regulationLink0 != null) {
                        kakaoLoginViewModel0.q.setValue(new Event(regulationLink0));
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

