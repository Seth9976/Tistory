package a;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import com.kakao.kandinsky.core.kdphoto.Decoration;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.core.kdphoto.Sticker;
import com.kakao.kandinsky.core.kdphoto.Text;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.mosaic.ui.MosaicDecorationKt;
import com.kakao.kandinsky.sticker.StickerViewModel;
import com.kakao.kandinsky.sticker.ui.StickerDecorationKt;
import com.kakao.kandinsky.text.TextViewModel;
import com.kakao.kandinsky.text.ui.TextDecorationKt;
import com.kakao.kandinsky.utils.MatrixValues;
import kotlin.Unit;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;

public final class p extends Lambda implements Function6 {
    public final KandinskyActivity a;

    public p(KandinskyActivity kandinskyActivity0) {
        this.a = kandinskyActivity0;
        super(6);
    }

    @Override  // kotlin.jvm.functions.Function6
    public final Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        ImmutableList immutableList0 = ((MatrixValues)object1).unbox-impl();
        int v = ((Number)object5).intValue();
        Intrinsics.checkNotNullParameter(((DecorationStatus)object0), "status");
        Intrinsics.checkNotNullParameter(immutableList0, "matrixValues");
        Intrinsics.checkNotNullParameter(((Decoration)object2), "decoration");
        Intrinsics.checkNotNullParameter(((Rect)object3), "displayRect");
        int v1 = (v & 14) == 0 ? (((Composer)object4).changed(((DecorationStatus)object0)) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (((Composer)object4).changed(immutableList0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (((Composer)object4).changed(((Decoration)object2)) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (((Composer)object4).changed(((Rect)object3)) ? 0x800 : 0x400);
        }
        if((0xB6DB & v1) == 9362 && ((Composer)object4).getSkipping()) {
            ((Composer)object4).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x40729CFE, v1, -1, "com.kakao.kandinsky.KandinskyActivity.ImagePreview.<anonymous> (KandinskyActivity.kt:343)");
        }
        StickerViewModel stickerViewModel0 = null;
        if(((Decoration)object2) instanceof Sticker) {
            ((Composer)object4).startReplaceGroup(0x8A315FBD);
            StickerViewModel stickerViewModel1 = this.a.g;
            if(stickerViewModel1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stickerViewModel");
            }
            else {
                stickerViewModel0 = stickerViewModel1;
            }
            StickerDecorationKt.StickerDecoration-BRlu0J8(((DecorationStatus)object0), immutableList0, ((Sticker)(((Decoration)object2))), ((Rect)object3), stickerViewModel0.getController(), ((Composer)object4), v1 & 7294);
        }
        else if(((Decoration)object2) instanceof Text) {
            ((Composer)object4).startReplaceGroup(0x8A316117);
            TextViewModel textViewModel0 = this.a.i;
            if(textViewModel0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textViewModel");
            }
            else {
                stickerViewModel0 = textViewModel0;
            }
            TextDecorationKt.TextDecoration-BRlu0J8(((DecorationStatus)object0), immutableList0, ((Text)(((Decoration)object2))), ((Rect)object3), ((TextViewModel)stickerViewModel0).getController(), ((Composer)object4), v1 & 7294);
        }
        else if(!(((Decoration)object2) instanceof Mosaic) && !(((Decoration)object2) instanceof Blur)) {
            ((Composer)object4).startReplaceGroup(0x8A316428);
        }
        else {
            ((Composer)object4).startReplaceGroup(0x8A3162D3);
            MosaicDecorationKt.MosaicDecoration-w1lL6yk(((DecorationStatus)object0), immutableList0, ((Absolute)(((Decoration)object2))), ((Rect)object3), this.a.b().getBitmapLoader(), this.a.b().getController(), ((Composer)object4), v1 & 7294);
        }
        ((Composer)object4).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

