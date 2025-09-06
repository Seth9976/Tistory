package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.SwitchColors;
import androidx.compose.material.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d3 extends Lambda implements Function2 {
    public final Object A;
    public final int B;
    public final int C;
    public final Object D;
    public final Object E;
    public final int w;
    public final boolean x;
    public final Object y;
    public final boolean z;

    public d3(TextFieldDefaults textFieldDefaults0, boolean z, boolean z1, InteractionSource interactionSource0, TextFieldColors textFieldColors0, Shape shape0, int v, int v1) {
        this.w = 2;
        this.D = textFieldDefaults0;
        this.x = z;
        this.z = z1;
        this.y = interactionSource0;
        this.E = textFieldColors0;
        this.A = shape0;
        this.B = v;
        this.C = v1;
        super(2);
    }

    public d3(boolean z, Function function0, Modifier modifier0, boolean z1, MutableInteractionSource mutableInteractionSource0, Object object0, int v, int v1, int v2) {
        this.w = v2;
        this.x = z;
        this.D = function0;
        this.y = modifier0;
        this.z = z1;
        this.A = mutableInteractionSource0;
        this.E = object0;
        this.B = v;
        this.C = v1;
        super(2);
    }

    public d3(boolean z, Function function0, Modifier modifier0, boolean z1, Object object0, MutableInteractionSource mutableInteractionSource0, int v, int v1, int v2) {
        this.w = v2;
        this.x = z;
        this.D = function0;
        this.y = modifier0;
        this.z = z1;
        this.E = object0;
        this.A = mutableInteractionSource0;
        this.B = v;
        this.C = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                CheckboxKt.Checkbox(this.x, ((Function1)this.D), ((Modifier)this.y), this.z, ((CheckboxColors)this.E), ((MutableInteractionSource)this.A), ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                RadioButtonKt.RadioButton(this.x, ((Function0)this.D), ((Modifier)this.y), this.z, ((RadioButtonColors)this.E), ((MutableInteractionSource)this.A), ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                ((TextFieldDefaults)this.D).ContainerBox(this.x, this.z, ((InteractionSource)this.y), ((TextFieldColors)this.E), ((Shape)this.A), ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                androidx.compose.material.CheckboxKt.Checkbox(this.x, ((Function1)this.D), ((Modifier)this.y), this.z, ((MutableInteractionSource)this.A), ((androidx.compose.material.CheckboxColors)this.E), ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
                return Unit.INSTANCE;
            }
            case 4: {
                ((Number)object1).intValue();
                IconButtonKt.IconToggleButton(this.x, ((Function1)this.D), ((Modifier)this.y), this.z, ((MutableInteractionSource)this.A), ((Function2)this.E), ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
                return Unit.INSTANCE;
            }
            case 5: {
                ((Number)object1).intValue();
                androidx.compose.material.RadioButtonKt.RadioButton(this.x, ((Function0)this.D), ((Modifier)this.y), this.z, ((MutableInteractionSource)this.A), ((androidx.compose.material.RadioButtonColors)this.E), ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                SwitchKt.Switch(this.x, ((Function1)this.D), ((Modifier)this.y), this.z, ((MutableInteractionSource)this.A), ((SwitchColors)this.E), ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
                return Unit.INSTANCE;
            }
        }
    }
}

