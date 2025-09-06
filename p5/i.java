package p5;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImagePainter;
import coil.compose.ConstraintsSizeResolver;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function3 {
    public final Alignment A;
    public final ContentScale B;
    public final float C;
    public final ColorFilter D;
    public final boolean E;
    public final ConstraintsSizeResolver w;
    public final Function3 x;
    public final AsyncImagePainter y;
    public final String z;

    public i(ConstraintsSizeResolver constraintsSizeResolver0, Function3 function30, AsyncImagePainter asyncImagePainter0, String s, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, boolean z) {
        this.w = constraintsSizeResolver0;
        this.x = function30;
        this.y = asyncImagePainter0;
        this.z = s;
        this.A = alignment0;
        this.B = contentScale0;
        this.C = f;
        this.D = colorFilter0;
        this.E = z;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2C9CE014, v, -1, "coil.compose.SubcomposeAsyncImage.<anonymous> (SubcomposeAsyncImage.kt:274)");
        }
        long v1 = ((BoxWithConstraintsScope)object0).getConstraints-msEJaDk();
        this.w.setConstraints-BRTryo0(v1);
        h h0 = new h(((BoxWithConstraintsScope)object0), this.y, this.z, this.A, this.B, this.C, this.D, this.E);
        this.x.invoke(h0, ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

