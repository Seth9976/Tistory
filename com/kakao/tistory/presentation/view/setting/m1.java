package com.kakao.tistory.presentation.view.setting;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SwitchColors;
import androidx.compose.material.SwitchDefaults;
import androidx.compose.material.SwitchKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import com.kakao.tistory.presentation.R.color;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m1 extends Lambda implements Function3 {
    public final SettingPushItem a;
    public final boolean b;
    public final State c;

    public m1(SettingPushItem settingPushItem0, boolean z, State state0) {
        this.a = settingPushItem0;
        this.b = z;
        this.c = state0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$PushItemContainer");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((RowScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1170526043, v, -1, "com.kakao.tistory.presentation.view.setting.SettingPushActivity.PushItem.<anonymous> (SettingPushActivity.kt:217)");
        }
        String s = StringResources_androidKt.stringResource(this.a.getTitleString(), ((Composer)object1), 0);
        TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable).getH3();
        TextUnitKt.checkArithmetic--R2X_6o(5336832410L);
        TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, null, 7484316058L, null, null, 0L, 2, false, 1, 0, null, textStyle0, ((Composer)object1), 0, 0xC30, 0xD77E);
        SpacerKt.Spacer(RowScope.weight$default(((RowScope)object0), Modifier.Companion, 1.0f, false, 2, null), ((Composer)object1), 0);
        Modifier modifier0 = SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, k1.a);
        long v1 = ColorResources_androidKt.colorResource(color.gray1, ((Composer)object1), 0);
        long v2 = ColorResources_androidKt.colorResource(color.white, ((Composer)object1), 0);
        long v3 = ColorResources_androidKt.colorResource(color.gray7, ((Composer)object1), 0);
        long v4 = ColorResources_androidKt.colorResource(color.gray8, ((Composer)object1), 0);
        SwitchColors switchColors0 = SwitchDefaults.INSTANCE.colors-SQMK_m0(v1, v3, 0.0f, v2, v4, 0.0f, 0L, 0L, 0L, 0L, ((Composer)object1), 0, SwitchDefaults.$stable, 996);
        boolean z = this.b;
        ((Composer)object1).startReplaceGroup(0xADA040BE);
        boolean z1 = ((Composer)object1).changed(this.c);
        boolean z2 = ((Composer)object1).changed(this.a);
        SettingPushItem settingPushItem0 = this.a;
        State state0 = this.c;
        l1 l10 = ((Composer)object1).rememberedValue();
        if(z1 || z2 || l10 == Composer.Companion.getEmpty()) {
            l10 = new l1(settingPushItem0, state0);
            ((Composer)object1).updateRememberedValue(l10);
        }
        ((Composer)object1).endReplaceGroup();
        SwitchKt.Switch(z, l10, modifier0, false, null, switchColors0, ((Composer)object1), 0, 24);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

