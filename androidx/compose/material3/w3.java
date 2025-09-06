package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonElevation;
import androidx.compose.material.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class w3 extends Lambda implements Function2 {
    public final boolean A;
    public final Object B;
    public final Shape C;
    public final Object D;
    public final Object E;
    public final BorderStroke F;
    public final MutableInteractionSource G;
    public final int H;
    public final int I;
    public final int w;
    public final Function0 x;
    public final Object y;
    public final Modifier z;

    public w3(Function0 function00, Modifier modifier0, boolean z, MutableInteractionSource mutableInteractionSource0, ButtonElevation buttonElevation0, Shape shape0, BorderStroke borderStroke0, ButtonColors buttonColors0, PaddingValues paddingValues0, Function3 function30, int v, int v1) {
        this.w = 2;
        this.x = function00;
        this.z = modifier0;
        this.A = z;
        this.G = mutableInteractionSource0;
        this.y = buttonElevation0;
        this.C = shape0;
        this.F = borderStroke0;
        this.B = buttonColors0;
        this.D = paddingValues0;
        this.E = function30;
        this.H = v;
        this.I = v1;
        super(2);
    }

    public w3(Function0 function00, Function2 function20, Modifier modifier0, boolean z, Function2 function21, Shape shape0, ChipColors chipColors0, ChipElevation chipElevation0, BorderStroke borderStroke0, MutableInteractionSource mutableInteractionSource0, int v, int v1, int v2) {
        this.w = v2;
        this.x = function00;
        this.y = function20;
        this.z = modifier0;
        this.A = z;
        this.B = function21;
        this.C = shape0;
        this.D = chipColors0;
        this.E = chipElevation0;
        this.F = borderStroke0;
        this.G = mutableInteractionSource0;
        this.H = v;
        this.I = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                ChipKt.ElevatedSuggestionChip(this.x, ((Function2)this.y), this.z, this.A, ((Function2)this.B), this.C, ((ChipColors)this.D), ((ChipElevation)this.E), this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                ChipKt.SuggestionChip(this.x, ((Function2)this.y), this.z, this.A, ((Function2)this.B), this.C, ((ChipColors)this.D), ((ChipElevation)this.E), this.F, this.G, ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ButtonKt.Button(this.x, this.z, this.A, this.G, ((ButtonElevation)this.y), this.C, this.F, ((ButtonColors)this.B), ((PaddingValues)this.D), ((Function3)this.E), ((Composer)object0), (this.H | 1) & -920350135 | ((0x24924924 & (this.H | 1)) >> 1 | 306783378 & (this.H | 1)) | (306783378 & (this.H | 1)) << 1 & (0x24924924 & (this.H | 1)), this.I);
                return Unit.INSTANCE;
            }
        }
    }
}

