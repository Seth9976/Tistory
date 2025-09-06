package j0;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.HeightInLinesModifierKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldScrollKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.TextFieldSizeKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import d0.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n1 extends Lambda implements Function2 {
    public final TextFieldScrollerPosition A;
    public final TextFieldValue B;
    public final VisualTransformation C;
    public final Modifier D;
    public final Modifier E;
    public final Modifier F;
    public final Modifier G;
    public final BringIntoViewRequester H;
    public final TextFieldSelectionManager I;
    public final boolean J;
    public final boolean K;
    public final Function1 L;
    public final OffsetMapping M;
    public final Density N;
    public final LegacyTextFieldState w;
    public final TextStyle x;
    public final int y;
    public final int z;

    public n1(LegacyTextFieldState legacyTextFieldState0, TextStyle textStyle0, int v, int v1, TextFieldScrollerPosition textFieldScrollerPosition0, TextFieldValue textFieldValue0, VisualTransformation visualTransformation0, Modifier modifier0, Modifier modifier1, Modifier modifier2, Modifier modifier3, BringIntoViewRequester bringIntoViewRequester0, TextFieldSelectionManager textFieldSelectionManager0, boolean z, boolean z1, Function1 function10, OffsetMapping offsetMapping0, Density density0) {
        this.w = legacyTextFieldState0;
        this.x = textStyle0;
        this.y = v;
        this.z = v1;
        this.A = textFieldScrollerPosition0;
        this.B = textFieldValue0;
        this.C = visualTransformation0;
        this.D = modifier0;
        this.E = modifier1;
        this.F = modifier2;
        this.G = modifier3;
        this.H = bringIntoViewRequester0;
        this.I = textFieldSelectionManager0;
        this.J = z;
        this.K = z1;
        this.L = function10;
        this.M = offsetMapping0;
        this.N = density0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2032502107, v, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
        }
        LegacyTextFieldState legacyTextFieldState0 = this.w;
        float f = legacyTextFieldState0.getMinHeightForSingleLineField-D9Ej5fM();
        Modifier modifier0 = SizeKt.heightIn-VpY3zN4$default(Modifier.Companion, f, 0.0f, 2, null);
        TextStyle textStyle0 = this.x;
        Modifier modifier1 = HeightInLinesModifierKt.heightInLines(modifier0, textStyle0, this.y, this.z);
        boolean z = ((Composer)object0).changedInstance(legacyTextFieldState0);
        s s0 = ((Composer)object0).rememberedValue();
        if(z || s0 == Composer.Companion.getEmpty()) {
            s0 = new s(legacyTextFieldState0, 25);
            ((Composer)object0).updateRememberedValue(s0);
        }
        SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(modifier1, this.A, this.B, this.C, s0).then(this.D).then(this.E), textStyle0).then(this.F).then(this.G), this.H), ComposableLambdaKt.rememberComposableLambda(0xEA5A8151, true, new m1(this.I, this.w, this.J, this.K, this.L, this.B, this.M, this.N, this.z), ((Composer)object0), 54), ((Composer)object0), 0x30, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

