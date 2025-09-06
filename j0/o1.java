package j0;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class o1 extends Lambda implements Function2 {
    public final int A;
    public final TextFieldScrollerPosition B;
    public final TextFieldValue C;
    public final VisualTransformation D;
    public final Modifier E;
    public final Modifier F;
    public final Modifier G;
    public final Modifier H;
    public final BringIntoViewRequester I;
    public final TextFieldSelectionManager J;
    public final boolean K;
    public final boolean L;
    public final Function1 M;
    public final OffsetMapping N;
    public final Density O;
    public final Function3 w;
    public final LegacyTextFieldState x;
    public final TextStyle y;
    public final int z;

    public o1(Function3 function30, LegacyTextFieldState legacyTextFieldState0, TextStyle textStyle0, int v, int v1, TextFieldScrollerPosition textFieldScrollerPosition0, TextFieldValue textFieldValue0, VisualTransformation visualTransformation0, Modifier modifier0, Modifier modifier1, Modifier modifier2, Modifier modifier3, BringIntoViewRequester bringIntoViewRequester0, TextFieldSelectionManager textFieldSelectionManager0, boolean z, boolean z1, Function1 function10, OffsetMapping offsetMapping0, Density density0) {
        this.w = function30;
        this.x = legacyTextFieldState0;
        this.y = textStyle0;
        this.z = v;
        this.A = v1;
        this.B = textFieldScrollerPosition0;
        this.C = textFieldValue0;
        this.D = visualTransformation0;
        this.E = modifier0;
        this.F = modifier1;
        this.G = modifier2;
        this.H = modifier3;
        this.I = bringIntoViewRequester0;
        this.J = textFieldSelectionManager0;
        this.K = z;
        this.L = z1;
        this.M = function10;
        this.N = offsetMapping0;
        this.O = density0;
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
            ComposerKt.traceEventStart(0xE9B00DE0, v, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(2032502107, true, new n1(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O), ((Composer)object0), 54);
        this.w.invoke(composableLambda0, ((Composer)object0), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

