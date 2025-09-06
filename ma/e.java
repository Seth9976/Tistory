package ma;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader;
import com.kakao.kandinsky.mosaic.ui.MosaicDecorationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final int w;
    public final MosaicAndBlurBitmapLoader x;
    public final Rect y;
    public final Matrix z;

    public e(MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0, Rect rect0, Matrix matrix0, int v) {
        this.w = v;
        this.x = mosaicAndBlurBitmapLoader0;
        this.y = rect0;
        this.z = matrix0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3CB030AB, v, -1, "com.kakao.kandinsky.mosaic.ui.MosaicContent.<anonymous> (MosaicDecoration.kt:97)");
            }
            MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0 = this.x;
            Bitmap bitmap0 = mosaicAndBlurBitmapLoader0.getBitmapExcludeSelected();
            if(bitmap0 == null) {
                bitmap0 = mosaicAndBlurBitmapLoader0.getFullBitmap();
            }
            if(bitmap0 != null) {
                MosaicDecorationKt.access$BitmapImage(AndroidImageBitmap_androidKt.asImageBitmap(bitmap0), 2.0f, this.y, this.z, ((Composer)object0), 0x1038, 0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object1).intValue();
        if((v1 & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x973180E9, v1, -1, "com.kakao.kandinsky.mosaic.ui.BlurDecoration.<anonymous> (MosaicDecoration.kt:152)");
        }
        MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader1 = this.x;
        Bitmap bitmap1 = mosaicAndBlurBitmapLoader1.getBitmapExcludeSelected();
        if(bitmap1 == null) {
            bitmap1 = mosaicAndBlurBitmapLoader1.getFullBitmap();
        }
        if(bitmap1 != null) {
            MosaicDecorationKt.access$BitmapImage(AndroidImageBitmap_androidKt.asImageBitmap(bitmap1), 2.0f, this.y, this.z, ((Composer)object0), 0x1038, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

