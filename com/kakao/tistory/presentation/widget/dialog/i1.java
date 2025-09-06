package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.MutableState;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i1 extends Lambda implements Function0 {
    public final Function0 a;
    public final Function0 b;
    public final MutableState c;

    public i1(Function0 function00, Function0 function01, MutableState mutableState0) {
        this.a = function00;
        this.b = function01;
        this.c = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke();
        WelcomeDialogKt.access$WelcomeDialog$lambda$2(this.c, true);
        Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "welcome_dialogue", "blog_tip", null, null, null, null, null, null, null, null, 1020, null);
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, "가입하기", "홈", TiaraActionType.CLICK_WELCOME_DIALOG_TIP, null, click0, null, null, null, 0xE8, null);
        this.b.invoke();
        return Unit.INSTANCE;
    }
}

