package com.kakao.tistory.presentation.view.setting;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\r\u0010\u0000\u001A\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"rememberSettingAppState", "Lcom/kakao/tistory/presentation/view/setting/SettingAppState;", "(Landroidx/compose/runtime/Composer;I)Lcom/kakao/tistory/presentation/view/setting/SettingAppState;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSettingAppState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingAppState.kt\ncom/kakao/tistory/presentation/view/setting/SettingAppStateKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,30:1\n77#2:31\n1223#3,6:32\n*S KotlinDebug\n*F\n+ 1 SettingAppState.kt\ncom/kakao/tistory/presentation/view/setting/SettingAppStateKt\n*L\n14#1:31\n15#1:32,6\n*E\n"})
public final class SettingAppStateKt {
    @Composable
    @NotNull
    public static final SettingAppState rememberSettingAppState(@Nullable Composer composer0, int v) {
        composer0.startReplaceGroup(-819005480);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-819005480, v, -1, "com.kakao.tistory.presentation.view.setting.rememberSettingAppState (SettingAppState.kt:12)");
        }
        Context context0 = (Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer0.startReplaceGroup(0x6637400B);
        SettingAppState settingAppState0 = composer0.rememberedValue();
        if(settingAppState0 == Composer.Companion.getEmpty()) {
            settingAppState0 = new SettingAppState(context0, null, 2, null);
            composer0.updateRememberedValue(settingAppState0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return settingAppState0;
    }
}

