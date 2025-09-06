package com.kakao.tistory.presentation.view.signup;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedString;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.view.signup.contract.SignUpUiState;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public final AnnotatedString a;
    public final String b;
    public final Context c;
    public final SignUpUiState d;

    public o(AnnotatedString annotatedString0, ColumnScopeInstance columnScopeInstance0, String s, Context context0, SignUpUiState signUpUiState0) {
        this.a = annotatedString0;
        this.b = s;
        this.c = context0;
        this.d = signUpUiState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Unit unit0;
        int v = ((Number)object0).intValue();
        if(((Range)CollectionsKt___CollectionsKt.firstOrNull(this.a.getStringAnnotations("talkChannelTag", v, v))) == null) {
            unit0 = null;
        }
        else {
            Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "storypf_channel", null, null, this.b, null, null, null, null, null, null, 0x3F6, null);
            TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, "가입하기", "가입하기", TiaraActionType.CLICK_GO_TO_SIGN_UP_TALK_CHANEL, null, click0, null, null, null, 0xE8, null);
            NavigatorExtensionKt.goToWebView$default(this.c, this.b, true, false, false, false, 12, null);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            this.d.getOnClickAgreeTalkChannel().invoke();
        }
        return Unit.INSTANCE;
    }
}

