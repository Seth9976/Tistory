package com.kakao.tistory.presentation.view.setting.notice;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.view.setting.SettingAppState;
import com.kakao.tistory.presentation.view.setting.SettingAppStateKt;
import com.kakao.tistory.presentation.widget.common.OfflineSnackbarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function2 {
    public final SettingNoticeListActivity a;

    public q(SettingNoticeListActivity settingNoticeListActivity0) {
        this.a = settingNoticeListActivity0;
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
            ComposerKt.traceEventStart(0x3130D4E4, v, -1, "com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListActivity.onCreate.<anonymous>.<anonymous> (SettingNoticeListActivity.kt:54)");
        }
        SettingAppState settingAppState0 = SettingAppStateKt.rememberSettingAppState(((Composer)object0), 0);
        ((Composer)object0).startReplaceGroup(-1674099793);
        SnackbarHostState snackbarHostState0 = ((Composer)object0).rememberedValue();
        if(snackbarHostState0 == Composer.Companion.getEmpty()) {
            snackbarHostState0 = new SnackbarHostState();
            ((Composer)object0).updateRememberedValue(snackbarHostState0);
        }
        ((Composer)object0).endReplaceGroup();
        State state0 = LiveDataAdapterKt.observeAsState(settingAppState0.getNetworkChecker(), Boolean.TRUE, ((Composer)object0), 56);
        ScaffoldKt.Scaffold-TvnljyQ(WindowInsetsPadding_androidKt.safeDrawingPadding(Modifier.Companion), null, null, ComposableLambdaKt.rememberComposableLambda(0xA92F3E2A, true, new n(snackbarHostState0), ((Composer)object0), 54), null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(0xFE952DB3, true, new p(this.a), ((Composer)object0), 54), ((Composer)object0), 0x30D80C00, 310);
        OfflineSnackbarKt.OfflineSnackbar(((Boolean)state0.getValue()).booleanValue(), snackbarHostState0, ((Composer)object0), 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

