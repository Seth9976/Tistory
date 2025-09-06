package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R.string;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class bh extends Lambda implements Function2 {
    public final TextFieldColors A;
    public final TextFieldValue B;
    public final Function1 C;
    public final boolean D;
    public final boolean E;
    public final TextStyle F;
    public final KeyboardOptions G;
    public final KeyboardActions H;
    public final boolean I;
    public final int J;
    public final int K;
    public final VisualTransformation L;
    public final MutableInteractionSource M;
    public final Function2 N;
    public final Function2 O;
    public final Function2 P;
    public final Function2 Q;
    public final Function2 R;
    public final Function2 S;
    public final Shape T;
    public final Modifier w;
    public final Function2 x;
    public final Density y;
    public final boolean z;

    public bh(Modifier modifier0, Function2 function20, Density density0, boolean z, TextFieldColors textFieldColors0, TextFieldValue textFieldValue0, Function1 function10, boolean z1, boolean z2, TextStyle textStyle0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z3, int v, int v1, VisualTransformation visualTransformation0, MutableInteractionSource mutableInteractionSource0, Function2 function21, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Shape shape0) {
        this.w = modifier0;
        this.x = function20;
        this.y = density0;
        this.z = z;
        this.A = textFieldColors0;
        this.B = textFieldValue0;
        this.C = function10;
        this.D = z1;
        this.E = z2;
        this.F = textStyle0;
        this.G = keyboardOptions0;
        this.H = keyboardActions0;
        this.I = z3;
        this.J = v;
        this.K = v1;
        this.L = visualTransformation0;
        this.M = mutableInteractionSource0;
        this.N = function21;
        this.O = function22;
        this.P = function23;
        this.Q = function24;
        this.R = function25;
        this.S = function26;
        this.T = shape0;
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
            ComposerKt.traceEventStart(0x6D21A690, v, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:382)");
        }
        Modifier modifier0 = this.x == null ? Modifier.Companion : PaddingKt.padding-qDBjuR0$default(SemanticsModifierKt.semantics(Modifier.Companion, true, a5.U), 0.0f, this.y.toDp-GaN1DYA(0L), 0.0f, 0.0f, 13, null);
        Modifier modifier1 = this.w.then(modifier0);
        String s = Strings_androidKt.getString-2EP1pXo(string.default_error_message, ((Composer)object0), 0);
        Modifier modifier2 = SizeKt.defaultMinSize-VpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier1, this.z, s), 280.0f, 56.0f);
        SolidColor solidColor0 = new SolidColor(this.A.cursorColor-vNxB06k$material3_release(this.z), null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(-757328870, true, new ah(this.B, this.D, this.I, this.L, this.M, this.z, this.x, this.N, this.O, this.P, this.Q, this.R, this.S, this.A, this.T), ((Composer)object0), 54);
        BasicTextFieldKt.BasicTextField(this.B, this.C, modifier2, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, null, this.M, solidColor0, composableLambda0, ((Composer)object0), 0, 0x30000, 0x1000);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

