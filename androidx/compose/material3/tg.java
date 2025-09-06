package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class tg extends Lambda implements Function2 {
    public final Shape A;
    public final float B;
    public final float C;
    public final int D;
    public final int E;
    public final Object F;
    public final Object G;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final InteractionSource z;

    public tg(Object object0, boolean z, boolean z1, InteractionSource interactionSource0, Object object1, Shape shape0, float f, float f1, int v, int v1, int v2) {
        this.w = v2;
        this.F = object0;
        this.x = z;
        this.y = z1;
        this.z = interactionSource0;
        this.G = object1;
        this.A = shape0;
        this.B = f;
        this.C = f1;
        this.D = v;
        this.E = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            ((TextFieldDefaults)this.F).BorderBox-nbWgWpA(this.x, this.y, this.z, ((TextFieldColors)this.G), this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        ((OutlinedTextFieldDefaults)this.F).ContainerBox-nbWgWpA(this.x, this.y, this.z, ((androidx.compose.material3.TextFieldColors)this.G), this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
        return Unit.INSTANCE;
    }
}

