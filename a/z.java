package a;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.kakao.kandinsky.KandinskyActivity;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function2 {
    public final KandinskyActivity a;

    public z(KandinskyActivity kandinskyActivity0) {
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
            ComposerKt.traceEventStart(0xDF8777B, v, -1, "com.kakao.kandinsky.KandinskyActivity.KandinskyApp.<anonymous>.<anonymous> (KandinskyActivity.kt:214)");
        }
        Orientation orientation0 = (Orientation)((Composer)object0).consume(OrientationKt.getLocalOrientation());
        EffectsKt.LaunchedEffect(orientation0, new y(this.a, orientation0, null), ((Composer)object0), 0x40);
        KandinskyActivity.b(this.a, ((Composer)object0), 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

