package ya;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.kakao.kandinsky.sticker.R.drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public static final a w;

    static {
        a.w = new a(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x641B44FC, v, -1, "com.kakao.kandinsky.sticker.ui.ComposableSingletons$StickerTabBarKt.lambda-1.<anonymous> (StickerTabBar.kt:154)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.action_delete_s, ((Composer)object0), 0), null, null, 0L, ((Composer)object0), 56, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

