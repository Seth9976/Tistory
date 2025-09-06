package ma;

import android.graphics.Matrix;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.decoration.DecorationRect;
import com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader;
import com.kakao.kandinsky.mosaic.ui.MosaicDecorationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final int C;
    public final Object D;
    public final int w;
    public final Object x;
    public final long y;
    public final Object z;

    public f(Absolute decoration$Absolute0, MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0, long v, Rect rect0, Matrix matrix0, DecorationRect decorationRect0, int v1, int v2) {
        this.w = v2;
        this.D = decoration$Absolute0;
        this.x = mosaicAndBlurBitmapLoader0;
        this.y = v;
        this.z = rect0;
        this.A = matrix0;
        this.B = decorationRect0;
        this.C = v1;
        super(2);
    }

    public f(Function0 function00, ComposeViewAdapter composeViewAdapter0, String s, String s1, Class class0, int v, long v1) {
        this.w = 2;
        this.D = function00;
        this.x = composeViewAdapter0;
        this.z = s;
        this.A = s1;
        this.B = class0;
        this.C = v;
        this.y = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                MosaicDecorationKt.access$BlurDecoration-bHb6B40(((Blur)this.D), ((MosaicAndBlurBitmapLoader)this.x), this.y, ((Rect)this.z), ((Matrix)this.A), ((DecorationRect)this.B), ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)));
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                MosaicDecorationKt.access$MosaicContent-bHb6B40(((Mosaic)this.D), ((MosaicAndBlurBitmapLoader)this.x), this.y, ((Rect)this.z), ((Matrix)this.A), ((DecorationRect)this.B), ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)));
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x8608C70E, v, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous> (ComposeViewAdapter.android.kt:494)");
                }
                EffectsKt.SideEffect(((Function0)this.D), ((Composer)object0), 0);
                ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(320194433, true, new i(((String)this.z), ((String)this.A), ((Class)this.B), this.C, ((ComposeViewAdapter)this.x), this.y), ((Composer)object0), 54);
                ComposeViewAdapter.access$WrapPreview(((ComposeViewAdapter)this.x), composableLambda0, ((Composer)object0), 6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

