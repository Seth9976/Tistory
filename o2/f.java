package o2;

import aa.x;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.ComposableInvoker;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final int w;
    public final String x;
    public final String y;
    public final Object[] z;

    public f(String s, String s1, Object[] arr_object) {
        this.w = 1;
        this.x = s;
        this.y = s1;
        this.z = arr_object;
        super(2);
    }

    public f(Object[] arr_object, String s, String s1) {
        this.w = 0;
        this.z = arr_object;
        this.x = s;
        this.y = s1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1901447514, v, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:134)");
            }
            Object[] arr_object = Arrays.copyOf(this.z, this.z.length);
            ComposableInvoker.INSTANCE.invokeComposable(this.x, this.y, ((Composer)object0), arr_object);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object1).intValue();
        if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCC9FD9DD, v1, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:109)");
        }
        MutableIntState mutableIntState0 = ((Composer)object0).rememberedValue();
        if(mutableIntState0 == Composer.Companion.getEmpty()) {
            mutableIntState0 = SnapshotIntStateKt.mutableIntStateOf(0);
            ((Composer)object0).updateRememberedValue(mutableIntState0);
        }
        ScaffoldKt.Scaffold-27mzLpw(null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(958604965, true, new x(19, this.z, mutableIntState0), ((Composer)object0), 54), 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(57310875, true, new e(this.x, this.y, this.z, mutableIntState0), ((Composer)object0), 54), ((Composer)object0), 0x30000, 0xC00000, 0x1FFDF);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

