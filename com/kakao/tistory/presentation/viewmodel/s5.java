package com.kakao.tistory.presentation.viewmodel;

import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.presentation.view.signup.contract.SignUpEvent.Finish;
import com.kakao.tistory.presentation.view.signup.contract.SignUpUiState;
import com.kakao.tistory.presentation.view.signup.contract.SignUpVerificationState;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class s5 extends SuspendLambda implements Function2 {
    public SignUpViewModel a;
    public String b;
    public int c;
    public final SignUpViewModel d;

    public s5(SignUpViewModel signUpViewModel0, Continuation continuation0) {
        this.d = signUpViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new s5(this.d, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new s5(this.d, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        String s1;
        SignUpViewModel signUpViewModel0;
        Unit unit0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.c) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                OAuthToken oAuthToken0 = this.d.getToken();
                if(oAuthToken0 == null) {
                    unit0 = null;
                }
                else {
                    signUpViewModel0 = this.d;
                    if(((SignUpUiState)signUpViewModel0.getUiState().getValue()).getBlogName().getInputState() == SignUpVerificationState.VERIFIED) {
                        String s = ((SignUpUiState)signUpViewModel0.getUiState().getValue()).getBlogName().getText().getText();
                        boolean z = ((SignUpUiState)signUpViewModel0.getUiState().getValue()).isAgreedTalkChannel();
                        this.a = signUpViewModel0;
                        this.b = s;
                        this.c = 1;
                        object0 = signUpViewModel0.m.invoke(oAuthToken0.getAccessToken(), s, z, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        s1 = s;
                        goto label_23;
                    }
                    unit0 = Unit.INSTANCE;
                    break;
                }
                break;
            }
            case 1: {
                s1 = this.b;
                signUpViewModel0 = this.a;
                ResultKt.throwOnFailure(object0);
            label_23:
                signUpViewModel0.isShowProgress().postValue(Boxing.boxBoolean(false));
                if(((Result)object0) instanceof Success) {
                    SignUpViewModel.access$postLoginByKakao(signUpViewModel0, s1);
                }
                else if(((Result)object0) instanceof Fail) {
                    String s2 = ((Fail)(((Result)object0))).getErrorModel().getMessage();
                    if(s2 != null) {
                        SignUpViewModel.signUp.1.1.2.1.1 signUpViewModel$signUp$1$1$2$1$10 = new SignUpViewModel.signUp.1.1.2.1.1();
                        Map map0 = w.mapOf(TuplesKt.to("error_type", s2));
                        TiaraUtils.trackPage$default(TiaraUtils.INSTANCE, signUpViewModel$signUp$1$1$2$1$10, null, map0, null, 10, null);
                    }
                    signUpViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
                }
                unit0 = Unit.INSTANCE;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(unit0 == null) {
            this.d.sendEvent(Finish.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}

