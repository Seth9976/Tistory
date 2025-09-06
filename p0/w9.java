package p0;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.ResistanceConfig;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class w9 extends Lambda implements Function3 {
    public final MutableInteractionSource A;
    public final boolean B;
    public final ResistanceConfig C;
    public final Function2 D;
    public final float E;
    public final Map w;
    public final SwipeableState x;
    public final Orientation y;
    public final boolean z;

    public w9(SwipeableState swipeableState0, Map map0, Orientation orientation0, boolean z, boolean z1, MutableInteractionSource mutableInteractionSource0, Function2 function20, ResistanceConfig resistanceConfig0, float f) {
        this.w = map0;
        this.x = swipeableState0;
        this.y = orientation0;
        this.z = z;
        this.A = mutableInteractionSource0;
        this.B = z1;
        this.C = resistanceConfig0;
        this.D = function20;
        this.E = f;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier0 = (Modifier)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceableGroup(0x29934E9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x29934E9, v, -1, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:595)");
        }
        Map map0 = this.w;
        if(map0.isEmpty()) {
            throw new IllegalArgumentException("You must have at least one anchor.");
        }
        if(CollectionsKt___CollectionsKt.distinct(map0.values()).size() != map0.size()) {
            throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
        }
        Object object3 = ((Composer)object1).consume(CompositionLocalsKt.getLocalDensity());
        SwipeableState swipeableState0 = this.x;
        swipeableState0.ensureInit$material_release(map0);
        u9 u90 = new u9(this.x, this.w, this.C, ((Density)object3), this.D, this.E, null);
        EffectsKt.LaunchedEffect(this.w, this.x, u90, ((Composer)object1), 520);
        Companion modifier$Companion0 = Modifier.Companion;
        boolean z = swipeableState0.isAnimationRunning();
        DraggableState draggableState0 = swipeableState0.getDraggableState$material_release();
        ((Composer)object1).startReplaceableGroup(0x188F83F);
        boolean z1 = ((Composer)object1).changed(swipeableState0);
        i i0 = ((Composer)object1).rememberedValue();
        if(z1 || i0 == Composer.Companion.getEmpty()) {
            i0 = new i(1, swipeableState0, null);
            ((Composer)object1).updateRememberedValue(i0);
        }
        ((Composer)object1).endReplaceableGroup();
        Modifier modifier1 = DraggableKt.draggable$default(modifier$Companion0, draggableState0, this.y, this.z, this.A, z, null, i0, this.B, 0x20, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceableGroup();
        return modifier1;
    }
}

