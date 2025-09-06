package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.kakao.editortracker.data.Action;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y4 extends Lambda implements Function1 {
    public final int w;
    public final String x;
    public final String y;

    public y4(String s, String s1, int v) {
        this.w = v;
        this.x = s;
        this.y = s1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x + ", " + this.y);
                return Unit.INSTANCE;
            }
            case 1: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x + ", " + this.y);
                return Unit.INSTANCE;
            }
            case 2: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x + ", " + this.y);
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((Action)object0), "$this$click");
                ((Action)object0).setLayer1("photopicker");
                ((Action)object0).setLayer2(this.x);
                ((Action)object0).setLayer3(this.y);
                return Unit.INSTANCE;
            }
        }
    }
}

