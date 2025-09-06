package j0;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function2 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final TransformedTextFieldState D;
    public final TextFieldSelectionState E;
    public final Brush F;
    public final boolean G;
    public final boolean H;
    public final ScrollState I;
    public final Orientation J;
    public final boolean K;
    public final Function2 L;
    public final TextFieldDecorator w;
    public final TextFieldLineLimits x;
    public final TextLayoutState y;
    public final TextStyle z;

    public a0(TextFieldDecorator textFieldDecorator0, TextFieldLineLimits textFieldLineLimits0, TextLayoutState textLayoutState0, TextStyle textStyle0, boolean z, boolean z1, boolean z2, TransformedTextFieldState transformedTextFieldState0, TextFieldSelectionState textFieldSelectionState0, Brush brush0, boolean z3, boolean z4, ScrollState scrollState0, Orientation orientation0, boolean z5, Function2 function20) {
        this.w = textFieldDecorator0;
        this.x = textFieldLineLimits0;
        this.y = textLayoutState0;
        this.z = textStyle0;
        this.A = z;
        this.B = z1;
        this.C = z2;
        this.D = transformedTextFieldState0;
        this.E = textFieldSelectionState0;
        this.F = brush0;
        this.G = z3;
        this.H = z4;
        this.I = scrollState0;
        this.J = orientation0;
        this.K = z5;
        this.L = function20;
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
            ComposerKt.traceEventStart(0xD7DF2601, v, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
        }
        (this.w == null ? d0.a : this.w).Decoration(ComposableLambdaKt.rememberComposableLambda(0x755F253E, true, new z(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L), ((Composer)object0), 54), ((Composer)object0), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

