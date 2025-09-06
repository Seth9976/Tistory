package p0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.BottomSheetScaffoldKt;
import androidx.compose.material.BottomSheetScaffoldState;
import androidx.compose.material.BottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.constraintlayout.compose.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class u1 extends Lambda implements Function3 {
    public final Shape A;
    public final float B;
    public final long C;
    public final long D;
    public final Function3 E;
    public final boolean w;
    public final BottomSheetScaffoldState x;
    public final float y;
    public final float z;

    public u1(boolean z, BottomSheetScaffoldState bottomSheetScaffoldState0, float f, float f1, Shape shape0, float f2, long v, long v1, Function3 function30) {
        this.w = z;
        this.x = bottomSheetScaffoldState0;
        this.y = f;
        this.z = f1;
        this.A = shape0;
        this.B = f2;
        this.C = v;
        this.D = v1;
        this.E = function30;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier0;
        int v = ((Number)object0).intValue();
        int v1 = ((Number)object2).intValue();
        if((v1 & 14) == 0) {
            v1 |= (((Composer)object1).changed(v) ? 4 : 2);
        }
        if((v1 & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1900337132, v1, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:470)");
        }
        ((Composer)object1).startReplaceableGroup(0xCF4FD6E8);
        BottomSheetScaffoldState bottomSheetScaffoldState0 = this.x;
        if(this.w) {
            Companion modifier$Companion0 = Modifier.Companion;
            ((Composer)object1).startReplaceableGroup(0x44FAF204);
            boolean z = ((Composer)object1).changed(bottomSheetScaffoldState0.getBottomSheetState().getAnchoredDraggableState$material_release());
            NestedScrollConnection nestedScrollConnection0 = ((Composer)object1).rememberedValue();
            if(z || nestedScrollConnection0 == Composer.Companion.getEmpty()) {
                nestedScrollConnection0 = BottomSheetScaffoldKt.access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(bottomSheetScaffoldState0.getBottomSheetState().getAnchoredDraggableState$material_release(), Orientation.Vertical);
                ((Composer)object1).updateRememberedValue(nestedScrollConnection0);
            }
            ((Composer)object1).endReplaceableGroup();
            modifier0 = NestedScrollModifierKt.nestedScroll$default(modifier$Companion0, nestedScrollConnection0, null, 2, null);
        }
        else {
            modifier0 = Modifier.Companion;
        }
        ((Composer)object1).endReplaceableGroup();
        BottomSheetState bottomSheetState0 = bottomSheetScaffoldState0.getBottomSheetState();
        Modifier modifier1 = SizeKt.requiredHeightIn-VpY3zN4$default(SizeKt.fillMaxWidth$default(modifier0, 0.0f, 1, null), this.y, 0.0f, 2, null);
        ((Composer)object1).startReplaceableGroup(1938009097);
        boolean z1 = ((Composer)object1).changed(v);
        float f = this.z;
        boolean z2 = ((Composer)object1).changed(f);
        k k0 = ((Composer)object1).rememberedValue();
        if(z1 || z2 || k0 == Composer.Companion.getEmpty()) {
            k0 = new k(f, v, 9);
            ((Composer)object1).updateRememberedValue(k0);
        }
        ((Composer)object1).endReplaceableGroup();
        BottomSheetScaffoldKt.access$BottomSheet-0cLKjW4(bottomSheetState0, this.w, k0, this.A, this.B, this.C, this.D, modifier1, this.E, ((Composer)object1), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

