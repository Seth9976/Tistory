package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class n2 extends Lambda implements Function2 {
    public final Shape A;
    public final ButtonColors B;
    public final ButtonElevation C;
    public final BorderStroke D;
    public final PaddingValues E;
    public final MutableInteractionSource F;
    public final Function3 G;
    public final int H;
    public final int I;
    public final int w;
    public final Function0 x;
    public final Modifier y;
    public final boolean z;

    public n2(Function0 function00, Modifier modifier0, boolean z, Shape shape0, ButtonColors buttonColors0, ButtonElevation buttonElevation0, BorderStroke borderStroke0, PaddingValues paddingValues0, MutableInteractionSource mutableInteractionSource0, Function3 function30, int v, int v1, int v2) {
        this.w = v2;
        this.x = function00;
        this.y = modifier0;
        this.z = z;
        this.A = shape0;
        this.B = buttonColors0;
        this.C = buttonElevation0;
        this.D = borderStroke0;
        this.E = paddingValues0;
        this.F = mutableInteractionSource0;
        this.G = function30;
        this.H = v;
        this.I = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ButtonKt.Button(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                ButtonKt.ElevatedButton(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I);
                return Unit.INSTANCE;
            }
            case 2: {
                ((Number)object1).intValue();
                ButtonKt.FilledTonalButton(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I);
                return Unit.INSTANCE;
            }
            case 3: {
                ((Number)object1).intValue();
                ButtonKt.OutlinedButton(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ButtonKt.TextButton(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I);
                return Unit.INSTANCE;
            }
        }
    }
}

