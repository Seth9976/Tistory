package pa;

import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.kakao.kandinsky.core.designsystem.R.drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public static final f w;

    static {
        f.w = new f(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x282F6614, v, -1, "com.kakao.kandinsky.resize.ComposableSingletons$ReSizeScreenKt.lambda-6.<anonymous> (ReSizeScreen.kt:521)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.icon_action_confirm, ((Composer)object0), 0), null, null, ((Color)((Composer)object0).consume(ContentColorKt.getLocalContentColor())).unbox-impl(), ((Composer)object0), 56, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

