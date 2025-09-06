package com.kakao.tistory.presentation.view.login;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel.LoginNavigator.Guide;
import com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel.LoginNavigator.Main;
import com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel.LoginNavigator.OldAccountDeprecatedDialog;
import com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel.LoginNavigator.OldAccountForceTransferDialog;
import com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel.LoginNavigator.TistoryLogin;
import com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel.LoginNavigator;
import com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel;
import com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel.GuideType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public final KakaoLoginActivity a;
    public final KakaoLoginViewModel b;

    public t(KakaoLoginActivity kakaoLoginActivity0, KakaoLoginViewModel kakaoLoginViewModel0) {
        this.a = kakaoLoginActivity0;
        this.b = kakaoLoginViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LoginNavigator)object0), "it");
        if(((LoginNavigator)object0) instanceof TistoryLogin) {
            boolean z = ((TistoryLogin)(((LoginNavigator)object0))).getForceTransfer();
            String s = ((TistoryLogin)(((LoginNavigator)object0))).getRedirectUrl();
            NavigatorExtensionKt.goToTistoryLogin(this.a, z, s);
            return Unit.INSTANCE;
        }
        if(((LoginNavigator)object0) instanceof Main) {
            String s1 = ((Main)(((LoginNavigator)object0))).getRedirectUrl();
            NavigatorExtensionKt.goToMain$default(this.a, s1, null, null, 6, null);
            this.a.finish();
            return Unit.INSTANCE;
        }
        if(((LoginNavigator)object0) instanceof Guide) {
            GuideType tistoryGuideViewModel$GuideType0 = ((Guide)(((LoginNavigator)object0))).getGuideType();
            NavigatorExtensionKt.goToGuide$default(this.a, tistoryGuideViewModel$GuideType0, null, 2, null);
            return Unit.INSTANCE;
        }
        if(((LoginNavigator)object0) instanceof OldAccountDeprecatedDialog) {
            String s2 = ((OldAccountDeprecatedDialog)(((LoginNavigator)object0))).getTitle();
            r r0 = new r(this.b);
            TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s2, ((OldAccountDeprecatedDialog)(((LoginNavigator)object0))).getMessage(), false, null, r0, null, 88, null);
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(((LoginNavigator)object0), OldAccountForceTransferDialog.INSTANCE)) {
            String s3 = this.a.getString(string.label_kakao_force_transfer_title);
            Intrinsics.checkNotNullExpressionValue(s3, "getString(...)");
            String s4 = this.a.getString(string.label_kakao_force_transfer_message);
            s s5 = new s(this.b);
            TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, s3, s4, false, null, s5, null, 88, null);
        }
        return Unit.INSTANCE;
    }
}

