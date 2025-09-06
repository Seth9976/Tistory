package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q2 extends Lambda implements Function3 {
    public final EditorSettingFragment a;
    public final EditorViewModel b;
    public final State c;

    public q2(EditorSettingFragment editorSettingFragment0, EditorViewModel editorViewModel0, State state0) {
        this.a = editorSettingFragment0;
        this.b = editorViewModel0;
        this.c = state0;
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
            ComposerKt.traceEventStart(0xB111D5A0, v, -1, "com.kakao.tistory.presentation.view.editor.EditorSettingFragment.PasswordContainer.<anonymous> (EditorSettingFragment.kt:510)");
        }
        EditorSettingFragment.access$TitleText(this.a, string.label_editor_setting_password, ((Composer)object1), 0x40);
        Companion modifier$Companion0 = Modifier.Companion;
        SpacerKt.Spacer(RowScope.weight$default(((RowScope)object0), modifier$Companion0, 1.0f, false, 2, null), ((Composer)object1), 0);
        Modifier modifier0 = ModifierKt.noRippleClickable(SizeKt.width-3ABfNKs(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 6.0f, 0.0f, 11, null), 113.0f), new o2(this.b));
        String s = EditorSettingFragment.access$PasswordContainer$lambda$31(this.c);
        if(s == null) {
            s = "";
        }
        long v1 = ColorResources_androidKt.colorResource(color.gray2, ((Composer)object1), 0);
        androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0 = FontWeight.Companion;
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier0, v1, 0x141600000L, null, fontWeight$Companion0.getNormal(), TypeKt.getTFont(), 0L, null, TextAlign.box-impl(6), 0L, 2, false, false, 1, 0, null, null, ((Composer)object1), 0x1B0C00, 0x6030, 0x3B590);
        ((Composer)object1).startReplaceGroup(0xF0A5D56B);
        MutableInteractionSource mutableInteractionSource0 = ((Composer)object1).rememberedValue();
        if(mutableInteractionSource0 == Composer.Companion.getEmpty()) {
            mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
            ((Composer)object1).updateRememberedValue(mutableInteractionSource0);
        }
        ((Composer)object1).endReplaceGroup();
        int v2 = ((Boolean)PressInteractionKt.collectIsPressedAsState(mutableInteractionSource0, ((Composer)object1), 6).getValue()).booleanValue() ? color.color_bbbbbb : color.gray1;
        Modifier modifier1 = ClickableKt.clickable-O2vRcR0$default(modifier$Companion0, mutableInteractionSource0, null, false, null, null, new p2(this.b), 28, null);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_editor_setting_password_copy, ((Composer)object1), 0), modifier1, ColorResources_androidKt.colorResource(v2, ((Composer)object1), 0), 0x141500000L, null, fontWeight$Companion0.getSemiBold(), TypeKt.getTFont(), 0L, null, null, 0L, 2, false, false, 0, 0, null, null, ((Composer)object1), 0x1B0C00, 0x30, 0x3F790);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

