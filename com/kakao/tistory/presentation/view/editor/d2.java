package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.SwitchColors;
import androidx.compose.material.SwitchDefaults;
import androidx.compose.material.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d2 extends Lambda implements Function3 {
    public final EditorSettingFragment a;
    public final State b;

    public d2(EditorSettingFragment editorSettingFragment0, State state0) {
        this.a = editorSettingFragment0;
        this.b = state0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$ItemContainer");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((RowScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1445487404, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.CommentPermitContainer.<anonymous> (EditorSettingFragment.kt:689)");
        }
        EditorSettingFragment.access$TitleText(this.a, string.label_editor_setting_comment_permit, ((Composer)object1), 0x40);
        SpacerKt.Spacer(RowScope.weight$default(((RowScope)object0), Modifier.Companion, 1.0f, false, 2, null), ((Composer)object1), 0);
        long v1 = ColorResources_androidKt.colorResource(color.gray1, ((Composer)object1), 0);
        long v2 = ColorResources_androidKt.colorResource(color.white, ((Composer)object1), 0);
        long v3 = ColorResources_androidKt.colorResource(color.gray7, ((Composer)object1), 0);
        long v4 = ColorResources_androidKt.colorResource(color.gray8, ((Composer)object1), 0);
        SwitchColors switchColors0 = SwitchDefaults.INSTANCE.colors-SQMK_m0(v1, v3, 0.0f, v2, v4, 0.0f, 0L, 0L, 0L, 0L, ((Composer)object1), 0, SwitchDefaults.$stable, 996);
        Boolean boolean0 = EditorSettingFragment.access$CommentPermitContainer$lambda$39(this.b);
        Intrinsics.checkNotNull(boolean0);
        SwitchKt.Switch(boolean0.booleanValue(), new c2(this.a, this.b), null, false, null, switchColors0, ((Composer)object1), 0, 28);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

