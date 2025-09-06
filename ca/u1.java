package ca;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.kandinsky.designsystem.common.MenuButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u1 extends Lambda implements Function2 {
    public final int w;
    public final int x;
    public final String y;

    public u1(int v, String s, int v1) {
        this.w = v1;
        this.x = v;
        this.y = s;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x28D2A021, v, -1, "com.kakao.kandinsky.designsystem.common.MenuIconTextToggleButton.<anonymous> (MenuButton.kt:52)");
            }
            MenuButtonKt.access$DefaultIconTextContent(this.x, this.y, ((Composer)object0), 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object1).intValue();
        if((v1 & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-749985404, v1, -1, "com.kakao.kandinsky.designsystem.common.MenuIconTextButton.<anonymous> (MenuButton.kt:32)");
        }
        MenuButtonKt.access$DefaultIconTextContent(this.x, this.y, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

