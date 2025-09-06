package androidx.compose.ui.platform;

import aa.x;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R.id;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

public final class g2 extends Lambda implements Function2 {
    public final i2 w;
    public final Function2 x;

    public g2(i2 i20, Function2 function20) {
        this.w = i20;
        this.x = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2000640158, v, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:134)");
        }
        i2 i20 = this.w;
        Object object2 = i20.a.getTag(id.inspection_slot_table_set);
        Set set0 = TypeIntrinsics.isMutableSet(object2) ? ((Set)object2) : null;
        AndroidComposeView androidComposeView0 = i20.a;
        if(set0 == null) {
            ViewParent viewParent0 = androidComposeView0.getParent();
            View view0 = viewParent0 instanceof View ? ((View)viewParent0) : null;
            Object object3 = view0 == null ? null : view0.getTag(id.inspection_slot_table_set);
            set0 = TypeIntrinsics.isMutableSet(object3) ? ((Set)object3) : null;
        }
        if(set0 != null) {
            set0.add(((Composer)object0).getCompositionData());
            ((Composer)object0).collectParameterInformation();
        }
        boolean z = ((Composer)object0).changedInstance(i20);
        e2 e20 = ((Composer)object0).rememberedValue();
        if(z || e20 == Composer.Companion.getEmpty()) {
            e20 = new e2(i20, null);
            ((Composer)object0).updateRememberedValue(e20);
        }
        EffectsKt.LaunchedEffect(androidComposeView0, e20, ((Composer)object0), 0);
        boolean z1 = ((Composer)object0).changedInstance(i20);
        f2 f20 = ((Composer)object0).rememberedValue();
        if(z1 || f20 == Composer.Companion.getEmpty()) {
            f20 = new f2(i20, null);
            ((Composer)object0).updateRememberedValue(f20);
        }
        EffectsKt.LaunchedEffect(androidComposeView0, f20, ((Composer)object0), 0);
        CompositionLocalKt.CompositionLocalProvider(InspectionTablesKt.getLocalInspectionTables().provides(set0), ComposableLambdaKt.rememberComposableLambda(-1193460702, true, new x(11, i20, this.x), ((Composer)object0), 54), ((Composer)object0), ProvidedValue.$stable | 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

