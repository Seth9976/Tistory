package com.kakao.tistory.presentation.view.setting.notice;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function3 {
    public final SettingNoticeListActivity a;

    public p(SettingNoticeListActivity settingNoticeListActivity0) {
        this.a = settingNoticeListActivity0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((PaddingValues)object0), "padding");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((PaddingValues)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFE952DB3, v, -1, "com.kakao.tistory.presentation.view.setting.notice.SettingNoticeListActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SettingNoticeListActivity.kt:65)");
        }
        SettingNoticeListActivity settingNoticeListActivity0 = this.a;
        ((Composer)object1).startReplaceGroup(0xA86B6516);
        boolean z = ((Composer)object1).changed(settingNoticeListActivity0);
        o o0 = ((Composer)object1).rememberedValue();
        if(z || o0 == Composer.Companion.getEmpty()) {
            o0 = new o(settingNoticeListActivity0);
            ((Composer)object1).updateRememberedValue(o0);
        }
        ((Composer)object1).endReplaceGroup();
        SettingNoticeListActivity.access$SettingNoticeScreen(settingNoticeListActivity0, o0, PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), ((PaddingValues)object0)), null, ((Composer)object1), 0, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

