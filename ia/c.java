package ia;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.kandinsky.home.HomeScreenKt;
import com.kakao.kandinsky.home.contract.HomeMenu;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public static final c w;

    static {
        c.w = new c(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1E14D6F5, v, -1, "com.kakao.kandinsky.home.ComposableSingletons$HomeScreenKt.lambda-1.<anonymous> (HomeScreen.kt:33)");
        }
        HomeScreenKt.HomeScreen(null, 1, 4, HomeMenu.getEntries(), a.x, a.y, b.x, a.z, b.y, ((Composer)object0), 0x6DB71B0, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

