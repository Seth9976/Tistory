package com.kakao.tistory.presentation.view.login;

import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedString;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function1 {
    public final boolean a;
    public final AnnotatedString b;
    public final String c;
    public final TistroyLoginActivity d;
    public final FocusManager e;

    public r0(boolean z, AnnotatedString annotatedString0, ColumnScopeInstance columnScopeInstance0, String s, TistroyLoginActivity tistroyLoginActivity0, FocusManager focusManager0) {
        this.a = z;
        this.b = annotatedString0;
        this.c = s;
        this.d = tistroyLoginActivity0;
        this.e = focusManager0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Unit unit0;
        int v = ((Number)object0).intValue();
        int v1 = this.a ? 0 : v;
        if(this.a) {
            v = this.b.length();
        }
        if(((Range)CollectionsKt___CollectionsKt.firstOrNull(this.b.getStringAnnotations("redirection", v1, v))) == null) {
            unit0 = null;
        }
        else {
            Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "more_info", null, null, this.c, null, null, null, null, null, null, 0x3F6, null);
            TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, "로그인", "올드계정로그인", TiaraActionType.CLICK_SEE_DETAIL, null, click0, null, null, null, 0xE8, null);
            NavigatorExtensionKt.goToWebView$default(this.d, this.c, true, false, false, false, 8, null);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            FocusManager.clearFocus$default(this.e, false, 1, null);
        }
        return Unit.INSTANCE;
    }
}

