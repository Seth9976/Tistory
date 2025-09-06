package p0;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.room.a;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.text.q;
import kotlinx.coroutines.CoroutineScope;

public final class va extends Lambda implements Function2 {
    public final Function3 A;
    public final float w;
    public final Function2 x;
    public final Function2 y;
    public final int z;

    public va(float f, Function2 function20, Function2 function21, int v, Function3 function30) {
        this.w = f;
        this.x = function20;
        this.y = function21;
        this.z = v;
        this.A = function30;
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
            ComposerKt.traceEventStart(1455860572, v, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:249)");
        }
        ScrollState scrollState0 = ScrollKt.rememberScrollState(0, ((Composer)object0), 0, 1);
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = q.h(0x2E20B340, ((Composer)object0), 0xE2A708A4);
        Companion composer$Companion0 = Composer.Companion;
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, ((Composer)object0)), ((Composer)object0));
        }
        ((Composer)object0).endReplaceableGroup();
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        ((Composer)object0).endReplaceableGroup();
        ((Composer)object0).startReplaceableGroup(0x1E7B2B64);
        boolean z = ((Composer)object0).changed(scrollState0);
        boolean z1 = ((Composer)object0).changed(coroutineScope0);
        h7 h70 = ((Composer)object0).rememberedValue();
        if(z || z1 || h70 == composer$Companion0.getEmpty()) {
            h70 = new h7(scrollState0, coroutineScope0);
            ((Composer)object0).updateRememberedValue(h70);
        }
        ((Composer)object0).endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), scrollState0, false, null, false, 14, null))), new ua(this.w, this.x, this.y, h70, this.z, this.A), ((Composer)object0), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

