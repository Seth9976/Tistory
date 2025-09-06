package p0;

import androidx.compose.material.BottomSheetScaffoldKt;
import androidx.compose.material.BottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.SubcomposeAsyncImageKt;
import coil.compose.SubcomposeAsyncImageScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class y1 extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final int w;
    public final float x;
    public final int y;
    public final int z;

    public y1(SubcomposeAsyncImageScope subcomposeAsyncImageScope0, Modifier modifier0, Painter painter0, String s, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, int v1) {
        this.w = 1;
        this.A = subcomposeAsyncImageScope0;
        this.B = modifier0;
        this.C = painter0;
        this.D = s;
        this.E = alignment0;
        this.F = contentScale0;
        this.x = f;
        this.G = colorFilter0;
        this.y = v;
        this.z = v1;
        super(2);
    }

    public y1(Function2 function20, Function3 function30, Function3 function31, Function2 function21, Function2 function22, float f, int v, Function0 function00, BottomSheetState bottomSheetState0, int v1) {
        this.w = 0;
        this.A = function20;
        this.D = function30;
        this.E = function31;
        this.B = function21;
        this.C = function22;
        this.x = f;
        this.y = v;
        this.F = function00;
        this.G = bottomSheetState0;
        this.z = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        if(this.w != 0) {
            SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(((SubcomposeAsyncImageScope)this.A), ((Modifier)this.B), ((Painter)this.C), ((String)this.D), ((Alignment)this.E), ((ContentScale)this.F), this.x, ((ColorFilter)this.G), ((Composer)object0), (this.y | 1) & -920350135 | ((0x24924924 & (this.y | 1)) >> 1 | 306783378 & (this.y | 1)) | (306783378 & (this.y | 1)) << 1 & (0x24924924 & (this.y | 1)), this.z);
            return Unit.INSTANCE;
        }
        BottomSheetScaffoldKt.access$BottomSheetScaffoldLayout-KCBPh4w(((Function2)this.A), ((Function3)this.D), ((Function3)this.E), ((Function2)this.B), ((Function2)this.C), this.x, this.y, ((Function0)this.F), ((BottomSheetState)this.G), ((Composer)object0), (this.z | 1) & -920350135 | ((0x24924924 & (this.z | 1)) >> 1 | 306783378 & (this.z | 1)) | (306783378 & (this.z | 1)) << 1 & (0x24924924 & (this.z | 1)));
        return Unit.INSTANCE;
    }
}

