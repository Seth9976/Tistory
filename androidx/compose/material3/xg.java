package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class xg extends Lambda implements Function3 {
    public final VisualTransformation A;
    public final MutableInteractionSource B;
    public final boolean C;
    public final Function2 D;
    public final Function2 E;
    public final Function2 F;
    public final Function2 G;
    public final Function2 H;
    public final Function2 I;
    public final Function2 J;
    public final Shape K;
    public final TextFieldColors L;
    public final int w;
    public final String x;
    public final boolean y;
    public final boolean z;

    public xg(String s, boolean z, boolean z1, VisualTransformation visualTransformation0, MutableInteractionSource mutableInteractionSource0, boolean z2, Function2 function20, Function2 function21, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, TextFieldColors textFieldColors0, Shape shape0) {
        this.w = 0;
        this.x = s;
        this.y = z;
        this.z = z1;
        this.A = visualTransformation0;
        this.B = mutableInteractionSource0;
        this.C = z2;
        this.D = function20;
        this.E = function21;
        this.F = function22;
        this.G = function23;
        this.H = function24;
        this.I = function25;
        this.J = function26;
        this.L = textFieldColors0;
        this.K = shape0;
        super(3);
    }

    public xg(String s, boolean z, boolean z1, VisualTransformation visualTransformation0, MutableInteractionSource mutableInteractionSource0, boolean z2, Function2 function20, Function2 function21, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Shape shape0, TextFieldColors textFieldColors0) {
        this.w = 1;
        this.x = s;
        this.y = z;
        this.z = z1;
        this.A = visualTransformation0;
        this.B = mutableInteractionSource0;
        this.C = z2;
        this.D = function20;
        this.E = function21;
        this.F = function22;
        this.G = function23;
        this.H = function24;
        this.I = function25;
        this.J = function26;
        this.K = shape0;
        this.L = textFieldColors0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            int v = ((Number)object2).intValue();
            if((v & 6) == 0) {
                v |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
            }
            if((v & 19) == 18 && ((Composer)object1).getSkipping()) {
                ((Composer)object1).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEED23C8D, v, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
            }
            TextFieldDefaults.INSTANCE.DecorationBox(this.x, ((Function2)object0), this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, null, null, ((Composer)object1), v << 3 & 0x70, 0x6000000, 0x30000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object2).intValue();
        if((v1 & 6) == 0) {
            v1 |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
        }
        if((v1 & 19) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x57E4C9CD, v1, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:241)");
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(2108828640, true, new wg(this.y, this.C, this.B, this.L, this.K, 0), ((Composer)object1), 54);
        OutlinedTextFieldDefaults.INSTANCE.DecorationBox(this.x, ((Function2)object0), this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.L, null, composableLambda0, ((Composer)object1), v1 << 3 & 0x70, 0xD80000, 0x8000);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

