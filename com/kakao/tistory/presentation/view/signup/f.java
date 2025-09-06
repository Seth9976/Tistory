package com.kakao.tistory.presentation.view.signup;

import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.view.signup.contract.SignUpEvent.Finish;
import com.kakao.tistory.presentation.view.signup.contract.SignUpEvent.GoAgreeTermsDetail;
import com.kakao.tistory.presentation.view.signup.contract.SignUpEvent.GoNotice;
import com.kakao.tistory.presentation.view.signup.contract.SignUpEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

public final class f implements FlowCollector {
    public final SignUpActivity a;

    public f(SignUpActivity signUpActivity0) {
        this.a = signUpActivity0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        if(Intrinsics.areEqual(((SignUpEvent)object0), Finish.INSTANCE)) {
            this.a.finish();
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(((SignUpEvent)object0), GoAgreeTermsDetail.INSTANCE)) {
            SignUpActivity.EventHandler.1.1.1.1 signUpActivity$EventHandler$1$1$1$10 = new SignUpActivity.EventHandler.1.1.1.1();
            TiaraUtils.trackPage$default(TiaraUtils.INSTANCE, signUpActivity$EventHandler$1$1$1$10, null, null, null, 14, null);
            String s = this.a.getString(string.link_tistory_contract);
            Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
            NavigatorExtensionKt.goToWebView(this.a, s, true, false, true, false);
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(((SignUpEvent)object0), GoNotice.INSTANCE)) {
            String s1 = this.a.getString(string.link_kakao_account_sign_up_guide);
            Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
            NavigatorExtensionKt.goToRedirect(this.a, s1, true);
        }
        return Unit.INSTANCE;
    }
}

