package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class bj extends Lambda implements Function2 {
    public final Function3 A;
    public final float B;
    public final float C;
    public final int D;
    public final int E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final int w;
    public final Modifier x;
    public final boolean y;
    public final Function2 z;

    public bj(SliderDefaults sliderDefaults0, Object object0, Modifier modifier0, boolean z, SliderColors sliderColors0, Function2 function20, Function3 function30, float f, float f1, int v, int v1, int v2) {
        this.w = v2;
        this.F = sliderDefaults0;
        this.G = object0;
        this.x = modifier0;
        this.y = z;
        this.H = sliderColors0;
        this.z = function20;
        this.A = function30;
        this.B = f;
        this.C = f1;
        this.D = v;
        this.E = v1;
        super(2);
    }

    public bj(Function2 function20, boolean z, Function1 function10, Modifier modifier0, Shape shape0, SearchBarColors searchBarColors0, float f, float f1, Function3 function30, int v, int v1) {
        this.w = 0;
        this.z = function20;
        this.y = z;
        this.F = function10;
        this.x = modifier0;
        this.G = shape0;
        this.H = searchBarColors0;
        this.B = f;
        this.C = f1;
        this.A = function30;
        this.D = v;
        this.E = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                SearchBar_androidKt.DockedSearchBar-EQC0FA8(this.z, this.y, ((Function1)this.F), this.x, ((Shape)this.G), ((SearchBarColors)this.H), this.B, this.C, this.A, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                ((SliderDefaults)this.F).Track-4EFweAY(((RangeSliderState)this.G), this.x, this.y, ((SliderColors)this.H), this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                ((SliderDefaults)this.F).Track-4EFweAY(((SliderState)this.G), this.x, this.y, ((SliderColors)this.H), this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)), this.E);
                return Unit.INSTANCE;
            }
        }
    }
}

