package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class qo extends Lambda implements Function2 {
    public final Function1 A;
    public final boolean B;
    public final boolean C;
    public final TextStyle D;
    public final KeyboardOptions E;
    public final KeyboardActions F;
    public final boolean G;
    public final int H;
    public final int I;
    public final VisualTransformation J;
    public final MutableInteractionSource K;
    public final Function2 L;
    public final Function2 M;
    public final Function2 N;
    public final Function2 O;
    public final Function2 P;
    public final Function2 Q;
    public final Function2 R;
    public final Shape S;
    public final Modifier w;
    public final boolean x;
    public final TextFieldColors y;
    public final String z;

    public qo(Modifier modifier0, boolean z, TextFieldColors textFieldColors0, String s, Function1 function10, boolean z1, boolean z2, TextStyle textStyle0, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, boolean z3, int v, int v1, VisualTransformation visualTransformation0, MutableInteractionSource mutableInteractionSource0, Function2 function20, Function2 function21, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Shape shape0) {
        this.w = modifier0;
        this.x = z;
        this.y = textFieldColors0;
        this.z = s;
        this.A = function10;
        this.B = z1;
        this.C = z2;
        this.D = textStyle0;
        this.E = keyboardOptions0;
        this.F = keyboardActions0;
        this.G = z3;
        this.H = v;
        this.I = v1;
        this.J = visualTransformation0;
        this.K = mutableInteractionSource0;
        this.L = function20;
        this.M = function21;
        this.N = function22;
        this.O = function23;
        this.P = function24;
        this.Q = function25;
        this.R = function26;
        this.S = shape0;
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
            ComposerKt.traceEventStart(0x6ED05103, v, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
        }
        String s = Strings_androidKt.getString-2EP1pXo(string.default_error_message, ((Composer)object0), 0);
        Modifier modifier0 = SizeKt.defaultMinSize-VpY3zN4(TextFieldImplKt.defaultErrorSemantics(this.w, this.x, s), 280.0f, 56.0f);
        SolidColor solidColor0 = new SolidColor(this.y.cursorColor-vNxB06k$material3_release(this.x), null);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xEED23C8D, true, new xg(this.z, this.B, this.G, this.J, this.K, this.x, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.y), ((Composer)object0), 54);
        BasicTextFieldKt.BasicTextField(this.z, this.A, modifier0, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, null, this.K, solidColor0, composableLambda0, ((Composer)object0), 0, 0x30000, 0x1000);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

