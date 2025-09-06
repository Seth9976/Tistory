package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.R.string;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public static final m a;

    static {
        m.a = new m();
    }

    public m() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEF88AB8A, v, -1, "com.kakao.tistory.presentation.widget.dialog.ComposableSingletons$TistoryComposeDialogKt.lambda-1.<anonymous> (TistoryComposeDialog.kt:312)");
        }
        TistoryComposeDialogKt.access$DialogView("차단된 IP입니다", "차단된 IP에서는 로그인이 제한됩니다. \n고객센터로 문의해주시기 바랍니다.\nIP : 172.26.114.55", string.label_dialog_cancel, null, false, l.a, ((Composer)object0), 0x30036, 24);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

