package j0;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function2 {
    public final InputTransformation A;
    public final TextStyle B;
    public final KeyboardOptions C;
    public final KeyboardActionHandler D;
    public final TextFieldLineLimits E;
    public final Function2 F;
    public final MutableInteractionSource G;
    public final Brush H;
    public final CodepointTransformation I;
    public final OutputTransformation J;
    public final TextFieldDecorator K;
    public final ScrollState L;
    public final boolean M;
    public final int N;
    public final int O;
    public final int P;
    public final TextFieldState w;
    public final Modifier x;
    public final boolean y;
    public final boolean z;

    public b0(TextFieldState textFieldState0, Modifier modifier0, boolean z, boolean z1, InputTransformation inputTransformation0, TextStyle textStyle0, KeyboardOptions keyboardOptions0, KeyboardActionHandler keyboardActionHandler0, TextFieldLineLimits textFieldLineLimits0, Function2 function20, MutableInteractionSource mutableInteractionSource0, Brush brush0, CodepointTransformation codepointTransformation0, OutputTransformation outputTransformation0, TextFieldDecorator textFieldDecorator0, ScrollState scrollState0, boolean z2, int v, int v1, int v2) {
        this.w = textFieldState0;
        this.x = modifier0;
        this.y = z;
        this.z = z1;
        this.A = inputTransformation0;
        this.B = textStyle0;
        this.C = keyboardOptions0;
        this.D = keyboardActionHandler0;
        this.E = textFieldLineLimits0;
        this.F = function20;
        this.G = mutableInteractionSource0;
        this.H = brush0;
        this.I = codepointTransformation0;
        this.J = outputTransformation0;
        this.K = textFieldDecorator0;
        this.L = scrollState0;
        this.M = z2;
        this.N = v;
        this.O = v1;
        this.P = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BasicTextFieldKt.BasicTextField(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, ((Composer)object0), (this.N | 1) & -920350135 | ((0x24924924 & (this.N | 1)) >> 1 | 306783378 & (this.N | 1)) | (306783378 & (this.N | 1)) << 1 & (0x24924924 & (this.N | 1)), this.O & -920350135 | ((0x24924924 & this.O) >> 1 | 306783378 & this.O) | (306783378 & this.O) << 1 & (0x24924924 & this.O), this.P);
        return Unit.INSTANCE;
    }
}

