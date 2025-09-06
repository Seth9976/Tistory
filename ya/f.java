package ya;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import com.kakao.kandinsky.base.ui.KDAsyncImageKt;
import com.kakao.kandinsky.sticker.contract.StickerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function3 {
    public final StickerItem w;

    public f(StickerItem stickerItem0) {
        this.w = stickerItem0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$KDButton");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBF0F87A7, v, -1, "com.kakao.kandinsky.sticker.ui.StickerList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StickerList.kt:72)");
        }
        KDAsyncImageKt.AsyncImage(this.w.getThumbnailUrl(), false, this.w.getLabel(), SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, ContentScale.Companion.getFillBounds(), ((Composer)object1), 0x30C00, 18);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

