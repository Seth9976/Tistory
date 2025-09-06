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
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function2 {
    public final InputTransformation A;
    public final TextStyle B;
    public final KeyboardOptions C;
    public final KeyboardActionHandler D;
    public final TextFieldLineLimits E;
    public final Function2 F;
    public final MutableInteractionSource G;
    public final Brush H;
    public final OutputTransformation I;
    public final TextFieldDecorator J;
    public final ScrollState K;
    public final int L;
    public final int M;
    public final int N;
    public final TextFieldState w;
    public final Modifier x;
    public final boolean y;
    public final boolean z;

    public w(TextFieldState textFieldState0, Modifier modifier0, boolean z, boolean z1, InputTransformation inputTransformation0, TextStyle textStyle0, KeyboardOptions keyboardOptions0, KeyboardActionHandler keyboardActionHandler0, TextFieldLineLimits textFieldLineLimits0, Function2 function20, MutableInteractionSource mutableInteractionSource0, Brush brush0, OutputTransformation outputTransformation0, TextFieldDecorator textFieldDecorator0, ScrollState scrollState0, int v, int v1, int v2) {
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
        this.I = outputTransformation0;
        this.J = textFieldDecorator0;
        this.K = scrollState0;
        this.L = v;
        this.M = v1;
        this.N = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BasicTextFieldKt.BasicTextField(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, ((Composer)object0), (this.L | 1) & -920350135 | ((0x24924924 & (this.L | 1)) >> 1 | 306783378 & (this.L | 1)) | (306783378 & (this.L | 1)) << 1 & (0x24924924 & (this.L | 1)), this.M & -920350135 | ((0x24924924 & this.M) >> 1 | 306783378 & this.M) | (306783378 & this.M) << 1 & (0x24924924 & this.M), this.N);
        return Unit.INSTANCE;
    }
}

