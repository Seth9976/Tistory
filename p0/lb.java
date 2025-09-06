package p0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class lb extends Lambda implements Function3 {
    public final MutableInteractionSource A;
    public final boolean B;
    public final Function2 C;
    public final Function2 D;
    public final Function2 E;
    public final Function2 F;
    public final TextFieldColors G;
    public final Object H;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final VisualTransformation z;

    public lb(Object object0, boolean z, boolean z1, VisualTransformation visualTransformation0, MutableInteractionSource mutableInteractionSource0, boolean z2, Function2 function20, Function2 function21, Function2 function22, Function2 function23, TextFieldColors textFieldColors0, int v) {
        this.w = v;
        this.H = object0;
        this.x = z;
        this.y = z1;
        this.z = visualTransformation0;
        this.A = mutableInteractionSource0;
        this.B = z2;
        this.C = function20;
        this.D = function21;
        this.E = function22;
        this.F = function23;
        this.G = textFieldColors0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            int v = ((Number)object2).intValue();
            if((v & 14) == 0) {
                v |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
            }
            if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
                ((Composer)object1).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-126640971, v, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:403)");
            }
            String s = ((TextFieldValue)this.H).getText();
            TextFieldDefaults.INSTANCE.TextFieldDecorationBox(s, ((Function2)object0), this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, null, ((Composer)object1), v << 3 & 0x70, 0xC00, 0x1000);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object2).intValue();
        if((v1 & 14) == 0) {
            v1 |= (((Composer)object1).changedInstance(((Function2)object0)) ? 4 : 2);
        }
        if((v1 & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3AFFAC62, v1, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:214)");
        }
        TextFieldDefaults.INSTANCE.TextFieldDecorationBox(((String)this.H), ((Function2)object0), this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, null, ((Composer)object1), v1 << 3 & 0x70, 0xC00, 0x1000);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

