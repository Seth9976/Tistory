package com.kakao.tistory.presentation.view.setting.notice;

import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function2 {
    public final SnackbarHostState a;

    public n(SnackbarHostState snackbarHostState0) {
        this.a = snackbarHostState0;
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
            ComposerKt.traceEventStart(0xA92F3E2A, v, -1, "com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SettingNoticeListActivity.kt:63)");
        }
        SnackbarHostKt.SnackbarHost(this.a, null, null, ((Composer)object0), 6, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

