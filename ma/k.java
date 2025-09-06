package ma;

import aa.c0;
import android.graphics.Matrix;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.decoration.ControlKt;
import com.kakao.kandinsky.decoration.DecorationRect;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader;
import com.kakao.kandinsky.mosaic.ui.ComposableSingletons.MosaicDecorationKt;
import com.kakao.kandinsky.mosaic.ui.MosaicDecorationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function5 {
    public final Matrix A;
    public final DecorationStatus w;
    public final Absolute x;
    public final MosaicAndBlurBitmapLoader y;
    public final Rect z;

    public k(DecorationStatus decorationStatus0, Absolute decoration$Absolute0, MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0, Rect rect0, Matrix matrix0) {
        this.w = decorationStatus0;
        this.x = decoration$Absolute0;
        this.y = mosaicAndBlurBitmapLoader0;
        this.z = rect0;
        this.A = matrix0;
        super(5);
    }

    @Override  // kotlin.jvm.functions.Function5
    public final Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4) {
        int v3;
        DecorationStatus decorationStatus3;
        DecorationStatus decorationStatus2;
        long v = ((Size)object1).unbox-impl();
        Composer composer0 = (Composer)object3;
        int v1 = ((Number)object4).intValue();
        Intrinsics.checkNotNullParameter(((Modifier)object0), "modifier");
        Intrinsics.checkNotNullParameter(((DecorationRect)object2), "decorationRect");
        int v2 = (v1 & 14) == 0 ? (composer0.changed(((Modifier)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer0.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer0.changed(((DecorationRect)object2)) ? 0x100 : 0x80);
        }
        if((v2 & 5851) == 1170 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC84AB4EA, v2, -1, "com.kakao.kandinsky.mosaic.ui.MosaicDecoration.<anonymous> (MosaicDecoration.kt:46)");
        }
        composer0.startReplaceGroup(105356196);
        DecorationStatus decorationStatus0 = DecorationStatus.Selected;
        DecorationStatus decorationStatus1 = this.w;
        if(decorationStatus1 == decorationStatus0) {
            Absolute decoration$Absolute0 = this.x;
            if(decoration$Absolute0 instanceof Mosaic) {
                composer0.startReplaceGroup(0x6479C07);
                decorationStatus2 = decorationStatus1;
                decorationStatus3 = decorationStatus0;
                v3 = v2;
                MosaicDecorationKt.access$MosaicContent-bHb6B40(((Mosaic)decoration$Absolute0), this.y, v, this.z, this.A, ((DecorationRect)object2), composer0, v2 << 3 & 0x380 | 0x8000 | 0x70000 & v2 << 9);
            }
            else {
                decorationStatus2 = decorationStatus1;
                decorationStatus3 = decorationStatus0;
                v3 = v2;
                if(decoration$Absolute0 instanceof Blur) {
                    composer0.startReplaceGroup(105356664);
                    MosaicDecorationKt.access$BlurDecoration-bHb6B40(((Blur)decoration$Absolute0), this.y, v, this.z, this.A, ((DecorationRect)object2), composer0, v3 << 3 & 0x380 | 0x8000 | 0x70000 & v3 << 9);
                }
                else {
                    composer0.startReplaceGroup(105356984);
                }
            }
            composer0.endReplaceGroup();
        }
        else {
            decorationStatus2 = decorationStatus1;
            decorationStatus3 = decorationStatus0;
            v3 = v2;
        }
        composer0.endReplaceGroup();
        boolean z = false;
        composer0.startReplaceGroup(105357170);
        c0 c00 = composer0.rememberedValue();
        if((v3 & 0x380) == 0x100 || c00 == Composer.Companion.getEmpty()) {
            c00 = new c0(((DecorationRect)object2), 3);
            composer0.updateRememberedValue(c00);
        }
        composer0.endReplaceGroup();
        composer0.startReplaceGroup(0x6479FA9);
        c0 c01 = composer0.rememberedValue();
        if((v3 & 0x380) == 0x100 || c01 == Composer.Companion.getEmpty()) {
            c01 = new c0(((DecorationRect)object2), 4);
            composer0.updateRememberedValue(c01);
        }
        composer0.endReplaceGroup();
        composer0.startReplaceGroup(0x6479FF6);
        if((v3 & 0x380) == 0x100) {
            z = true;
        }
        c0 c02 = composer0.rememberedValue();
        if(z || c02 == Composer.Companion.getEmpty()) {
            c02 = new c0(((DecorationRect)object2), 5);
            composer0.updateRememberedValue(c02);
        }
        composer0.endReplaceGroup();
        ControlKt.ContentMoveControl-dBrA5TM(((Modifier)object0), decorationStatus2 == decorationStatus3, v, c00, c01, c02, ComposableSingletons.MosaicDecorationKt.INSTANCE.getLambda-1$mosaic_release(), composer0, 0x180000 | v3 & 14 | v3 << 3 & 0x380, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

