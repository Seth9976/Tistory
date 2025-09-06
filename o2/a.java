package o2;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public static final a A;
    public final int w;
    public static final a x;
    public static final a y;
    public static final a z;

    static {
        a.x = new a(2, 0);
        a.y = new a(2, 1);
        a.z = new a(2, 2);
        a.A = new a(2, 3);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xBAAB0D26, v1, -1, "androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.lambda-1.<anonymous> (ComposeViewAdapter.android.kt:79)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v2 = ((Number)object1).intValue();
                if((v2 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2086912010, v2, -1, "androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.lambda-2.<anonymous> (ComposeViewAdapter.android.kt:168)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                int v3 = ((Number)object1).intValue();
                if((v3 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x115720BC, v3, -1, "androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.lambda-3.<anonymous> (ComposeViewAdapter.android.kt:389)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-426398407, v, -1, "androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt.lambda-1.<anonymous> (PreviewActivity.android.kt:124)");
                }
                TextKt.Text-fLXpl1I("Next", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, ((Composer)object0), 6, 0, 0xFFFE);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

