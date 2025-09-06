package ya;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import com.kakao.kandinsky.base.ui.KDAsyncImageKt;
import com.kakao.kandinsky.core.kdphoto.Sticker;
import com.kakao.kandinsky.designsystem.util.DpExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function3 {
    public final Sticker w;

    public c(Sticker sticker0) {
        this.w = sticker0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        long v = ((Size)object0).unbox-impl();
        int v1 = ((Number)object2).intValue();
        if((v1 & 14) == 0) {
            v1 |= (((Composer)object1).changed(v) ? 4 : 2);
        }
        if((v1 & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x70008A7C, v1, -1, "com.kakao.kandinsky.sticker.ui.StickerDecoration.<anonymous> (StickerDecoration.kt:35)");
        }
        long v2 = DpExtensionKt.toDpSize-Pq9zytI(v, ((Composer)object1), v1 & 14);
        KDAsyncImageKt.AsyncImage(this.w.getStickerUrl(), false, null, SizeKt.size-6HolHcs(Modifier.Companion, v2), null, null, ((Composer)object1), 0x1B0, 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

