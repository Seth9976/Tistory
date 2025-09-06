package a;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.designsystem.theme.ThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function2 {
    public final KandinskyActivity a;

    public a0(KandinskyActivity kandinskyActivity0) {
        this.a = kandinskyActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x48A849A1, v, -1, "com.kakao.kandinsky.KandinskyActivity.KandinskyApp.<anonymous> (KandinskyActivity.kt:213)");
        }
        ThemeKt.KandinskyTheme(ComposableLambdaKt.rememberComposableLambda(0xDF8777B, true, new z(this.a), ((Composer)object0), 54), ((Composer)object0), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

