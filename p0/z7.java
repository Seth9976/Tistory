package p0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material.SliderColors;
import androidx.compose.material.SliderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z7 extends Lambda implements Function2 {
    public final SliderColors A;
    public final boolean B;
    public final float C;
    public final int D;
    public final Object E;
    public final int w;
    public final Modifier x;
    public final float y;
    public final MutableInteractionSource z;

    public z7(BoxScope boxScope0, Modifier modifier0, float f, MutableInteractionSource mutableInteractionSource0, SliderColors sliderColors0, boolean z, float f1, int v) {
        this.w = 1;
        this.E = boxScope0;
        this.x = modifier0;
        this.y = f;
        this.z = mutableInteractionSource0;
        this.A = sliderColors0;
        this.B = z;
        this.C = f1;
        this.D = v;
        super(2);
    }

    public z7(boolean z, float f, List list0, SliderColors sliderColors0, float f1, MutableInteractionSource mutableInteractionSource0, Modifier modifier0, int v) {
        this.w = 0;
        this.B = z;
        this.y = f;
        this.E = list0;
        this.A = sliderColors0;
        this.C = f1;
        this.z = mutableInteractionSource0;
        this.x = modifier0;
        this.D = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            ((Number)object1).intValue();
            SliderKt.a(((BoxScope)this.E), this.x, this.y, this.z, this.A, this.B, this.C, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)));
            return Unit.INSTANCE;
        }
        ((Number)object1).intValue();
        SliderKt.access$SliderImpl(this.B, this.y, ((List)this.E), this.A, this.C, this.z, this.x, ((Composer)object0), (this.D | 1) & -920350135 | ((0x24924924 & (this.D | 1)) >> 1 | 306783378 & (this.D | 1)) | (306783378 & (this.D | 1)) << 1 & (0x24924924 & (this.D | 1)));
        return Unit.INSTANCE;
    }
}

