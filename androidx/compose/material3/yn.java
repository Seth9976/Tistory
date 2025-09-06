package androidx.compose.material3;

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
import kotlinx.coroutines.CoroutineScope;

public final class yn extends Lambda implements Function2 {
    public final Function3 A;
    public final int B;
    public final ScrollState w;
    public final float x;
    public final Function2 y;
    public final Function2 z;

    public yn(float f, int v, ScrollState scrollState0, Function2 function20, Function2 function21, Function3 function30) {
        this.w = scrollState0;
        this.x = f;
        this.y = function20;
        this.z = function21;
        this.A = function30;
        this.B = v;
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
            ComposerKt.traceEventStart(0xA23E8AC0, v, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1016)");
        }
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = ((Composer)object0).rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, ((Composer)object0)), ((Composer)object0));
        }
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        ScrollState scrollState0 = this.w;
        boolean z = ((Composer)object0).changed(scrollState0);
        boolean z1 = ((Composer)object0).changed(coroutineScope0);
        si si0 = ((Composer)object0).rememberedValue();
        if(z || z1 || si0 == composer$Companion0.getEmpty()) {
            si0 = new si(scrollState0, coroutineScope0);
            ((Composer)object0).updateRememberedValue(si0);
        }
        Modifier modifier0 = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), this.w, false, null, false, 14, null)));
        boolean z2 = ((Composer)object0).changed(this.x);
        boolean z3 = ((Composer)object0).changed(this.y);
        boolean z4 = ((Composer)object0).changed(this.z);
        boolean z5 = ((Composer)object0).changed(this.A);
        boolean z6 = ((Composer)object0).changedInstance(si0);
        boolean z7 = ((Composer)object0).changed(this.B);
        vn vn0 = ((Composer)object0).rememberedValue();
        if((z2 | z3 | z4 | z5 | z6 | z7) != 0 || vn0 == composer$Companion0.getEmpty()) {
            vn0 = new vn(this.x, this.y, this.z, si0, this.B, this.A);
            ((Composer)object0).updateRememberedValue(vn0);
        }
        SubcomposeLayoutKt.SubcomposeLayout(modifier0, vn0, ((Composer)object0), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

