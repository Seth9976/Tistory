package eb;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final int w;
    public final int x;

    public g(int v, int v1) {
        this.w = v;
        this.x = v1;
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
            ComposerKt.traceEventStart(0x10B3D038, v, -1, "com.kakao.kandinsky.textedit.ui.TabButton.<anonymous> (EditTabBar.kt:154)");
        }
        Painter painter0 = PainterResources_androidKt.painterResource(this.w, ((Composer)object0), 0);
        Modifier modifier0 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        ImageKt.Image(painter0, StringResources_androidKt.stringResource(this.x, ((Composer)object0), 0), modifier0, null, null, 0.0f, null, ((Composer)object0), 392, 120);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

