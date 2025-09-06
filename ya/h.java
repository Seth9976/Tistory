package ya;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.kakao.kandinsky.sticker.contract.StickerGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function3 {
    public final boolean w;
    public final StickerGroup x;

    public h(boolean z, StickerGroup stickerGroup0) {
        this.w = z;
        this.x = stickerGroup0;
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
            ComposerKt.traceEventStart(0x7F3483C4, v, -1, "com.kakao.kandinsky.sticker.ui.StickerGroupButton.<anonymous> (StickerTabBar.kt:137)");
        }
        ImageKt.Image(PainterResources_androidKt.painterResource((this.w ? this.x.getMenuIconOn() : this.x.getMenuIcon()), ((Composer)object1), 0), this.x.getName(), SizeKt.size-3ABfNKs(Modifier.Companion, 28.0f), null, null, 0.0f, null, ((Composer)object1), 392, 120);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

