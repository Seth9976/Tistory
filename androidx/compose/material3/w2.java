package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Shape;
import com.kakao.kandinsky.preview.PinchZoomImageKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class w2 extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final int C;
    public final int D;
    public final Object E;
    public final Object F;
    public final Function G;
    public final int w;
    public final Object x;
    public final Modifier y;
    public final boolean z;

    public w2(Modifier modifier0, Modifier modifier1, ImageBitmap imageBitmap0, String s, Function1 function10, Function1 function11, Function1 function12, boolean z, int v, int v1) {
        this.w = 2;
        this.y = modifier0;
        this.x = modifier1;
        this.A = imageBitmap0;
        this.E = s;
        this.F = function10;
        this.B = function11;
        this.G = function12;
        this.z = z;
        this.C = v;
        this.D = v1;
        super(2);
    }

    public w2(Function0 function00, Modifier modifier0, boolean z, Shape shape0, Object object0, Object object1, MutableInteractionSource mutableInteractionSource0, Function function0, int v, int v1, int v2) {
        this.w = v2;
        this.x = function00;
        this.y = modifier0;
        this.z = z;
        this.A = shape0;
        this.E = object0;
        this.F = object1;
        this.B = mutableInteractionSource0;
        this.G = function0;
        this.C = v;
        this.D = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                CardKt.ElevatedCard(((Function0)this.x), this.y, this.z, ((Shape)this.A), ((CardColors)this.E), ((CardElevation)this.F), ((MutableInteractionSource)this.B), ((Function3)this.G), ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                IconButtonKt.OutlinedIconButton(((Function0)this.x), this.y, this.z, ((Shape)this.A), ((IconButtonColors)this.E), ((BorderStroke)this.F), ((MutableInteractionSource)this.B), ((Function2)this.G), ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                PinchZoomImageKt.PinchZoomImage(this.y, ((Modifier)this.x), ((ImageBitmap)this.A), ((String)this.E), ((Function1)this.F), ((Function1)this.B), ((Function1)this.G), this.z, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
                return Unit.INSTANCE;
            }
        }
    }
}

