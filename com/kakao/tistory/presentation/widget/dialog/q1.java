package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.MutableState;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class q1 extends Lambda implements Function0 {
    public final Function0 a;
    public final MutableState b;

    public q1(Function0 function00, MutableState mutableState0) {
        this.a = function00;
        this.b = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke();
        if(!WelcomeDialogKt.access$WelcomeDialog$lambda$1(this.b)) {
            Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "welcome_dialogue", "close", null, null, null, null, null, null, null, null, 1020, null);
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "가입하기", "홈", TistoryTiaraActionType.CLICK_CLOSE, null, click0, null, null, null, 0xE8, null);
        }
        return Unit.INSTANCE;
    }
}

