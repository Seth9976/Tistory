package j0;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.material3.z5;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class v2 extends Lambda implements Function3 {
    public final Brush w;
    public final LegacyTextFieldState x;
    public final TextFieldValue y;
    public final OffsetMapping z;

    public v2(Brush brush0, LegacyTextFieldState legacyTextFieldState0, TextFieldValue textFieldValue0, OffsetMapping offsetMapping0) {
        this.w = brush0;
        this.x = legacyTextFieldState0;
        this.y = textFieldValue0;
        this.z = offsetMapping0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier0;
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        composer0.startReplaceGroup(0xFAF68513);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFAF68513, v, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
        }
        CursorAnimationState cursorAnimationState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(cursorAnimationState0 == composer$Companion0.getEmpty()) {
            cursorAnimationState0 = new CursorAnimationState();
            composer0.updateRememberedValue(cursorAnimationState0);
        }
        Brush brush0 = this.w;
        boolean z = !(brush0 instanceof SolidColor) || ((SolidColor)brush0).getValue-0d7_KjU() != 16L;
        if(((WindowInfo)composer0.consume(CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused()) {
            LegacyTextFieldState legacyTextFieldState0 = this.x;
            if(legacyTextFieldState0.getHasFocus()) {
                TextFieldValue textFieldValue0 = this.y;
                if(TextRange.getCollapsed-impl(textFieldValue0.getSelection-d9O1mEE()) && z) {
                    composer0.startReplaceGroup(0x302DFC9D);
                    AnnotatedString annotatedString0 = textFieldValue0.getAnnotatedString();
                    TextRange textRange0 = TextRange.box-impl(textFieldValue0.getSelection-d9O1mEE());
                    boolean z1 = composer0.changedInstance(cursorAnimationState0);
                    u2 u20 = composer0.rememberedValue();
                    if(z1 || u20 == composer$Companion0.getEmpty()) {
                        u20 = new u2(cursorAnimationState0, null);
                        composer0.updateRememberedValue(u20);
                    }
                    EffectsKt.LaunchedEffect(annotatedString0, textRange0, u20, composer0, 0);
                    boolean z2 = composer0.changedInstance(cursorAnimationState0);
                    boolean z3 = composer0.changedInstance(this.z);
                    boolean z4 = composer0.changed(textFieldValue0);
                    boolean z5 = composer0.changedInstance(legacyTextFieldState0);
                    boolean z6 = composer0.changed(brush0);
                    z5 z50 = composer0.rememberedValue();
                    if((z6 | (z2 | z3 | z4 | z5)) != 0 || z50 == composer$Companion0.getEmpty()) {
                        z50 = new z5(cursorAnimationState0, this.z, this.y, this.x, this.w, 2);
                        composer0.updateRememberedValue(z50);
                    }
                    modifier0 = DrawModifierKt.drawWithContent(((Modifier)object0), z50);
                    composer0.endReplaceGroup();
                    goto label_41;
                }
            }
            goto label_38;
        }
        else {
        label_38:
            composer0.startReplaceGroup(0x3040856E);
            composer0.endReplaceGroup();
            modifier0 = Modifier.Companion;
        }
    label_41:
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return modifier0;
    }
}

