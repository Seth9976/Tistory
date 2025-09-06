package p0;

import aa.e;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.DismissDirection;
import androidx.compose.material.DismissState;
import androidx.compose.material.DismissValue;
import androidx.compose.material.ResistanceConfig;
import androidx.compose.material.SwipeableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import m0.b0;
import r0.a;

public final class o9 extends Lambda implements Function3 {
    public final Function3 A;
    public final Set w;
    public final Function1 x;
    public final DismissState y;
    public final Function3 z;

    public o9(Set set0, Function1 function10, DismissState dismissState0, Function3 function30, Function3 function31) {
        this.w = set0;
        this.x = function10;
        this.y = dismissState0;
        this.z = function30;
        this.A = function31;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (composer0.changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(338007641, v, -1, "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:183)");
        }
        float f = (float)Constraints.getMaxWidth-impl(((BoxWithConstraintsScope)object0).getConstraints-msEJaDk());
        boolean z = true;
        boolean z1 = composer0.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        DismissValue dismissValue0 = DismissValue.Default;
        Map map0 = x.mutableMapOf(new Pair[]{TuplesKt.to(0.0f, dismissValue0)});
        DismissDirection dismissDirection0 = DismissDirection.StartToEnd;
        Set set0 = this.w;
        if(set0.contains(dismissDirection0)) {
            Pair pair0 = TuplesKt.to(f, DismissValue.DismissedToEnd);
            map0.put(pair0.getFirst(), pair0.getSecond());
        }
        DismissDirection dismissDirection1 = DismissDirection.EndToStart;
        if(set0.contains(dismissDirection1)) {
            Pair pair1 = TuplesKt.to(((float)(-f)), DismissValue.DismissedToStart);
            map0.put(pair1.getFirst(), pair1.getSecond());
        }
        composer0.startReplaceableGroup(0x5C0F1CC);
        Function1 function10 = this.x;
        boolean z2 = composer0.changedInstance(function10);
        e e0 = composer0.rememberedValue();
        if(z2 || e0 == Composer.Companion.getEmpty()) {
            e0 = new e(function10, 4);
            composer0.updateRememberedValue(e0);
        }
        composer0.endReplaceableGroup();
        float f1 = 20.0f;
        float f2 = set0.contains(dismissDirection1) ? 10.0f : 20.0f;
        if(set0.contains(dismissDirection0)) {
            f1 = 10.0f;
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Orientation orientation0 = Orientation.Horizontal;
        DismissState dismissState0 = this.y;
        if(dismissState0.getCurrentValue() != dismissValue0) {
            z = false;
        }
        ResistanceConfig resistanceConfig0 = new ResistanceConfig(f, f2, f1);
        Modifier modifier0 = SwipeableKt.swipeable-pPrIpRY$default(modifier$Companion0, this.y, map0, orientation0, z, z1, null, e0, resistanceConfig0, 0.0f, 0x120, null);
        composer0.startReplaceableGroup(0x2BB5B5D7);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = a.i(alignment$Companion0, false, composer0, 0, -1323940314);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.modifierMaterializerOf(modifier0);
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            androidx.room.a.t(v1, composer0, v1, function20);
        }
        a.w(0, function30, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        Modifier modifier1 = BoxScopeInstance.INSTANCE.matchParentSize(modifier$Companion0);
        composer0.startReplaceableGroup(693286680);
        Arrangement arrangement0 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer0, 0);
        composer0.startReplaceableGroup(-1323940314);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
        Function0 function01 = composeUiNode$Companion0.getConstructor();
        Function3 function31 = LayoutKt.modifierMaterializerOf(modifier1);
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function01);
        }
        else {
            composer0.useNode();
        }
        Function2 function21 = androidx.room.a.r(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            androidx.room.a.t(v2, composer0, v2, function21);
        }
        a.w(0, function31, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        this.z.invoke(rowScopeInstance0, composer0, 6);
        composer0.endReplaceableGroup();
        composer0.endNode();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0x5C0F5A4);
        boolean z3 = composer0.changed(dismissState0);
        b0 b00 = composer0.rememberedValue();
        if(z3 || b00 == Composer.Companion.getEmpty()) {
            b00 = new b0(dismissState0, 20);
            composer0.updateRememberedValue(b00);
        }
        composer0.endReplaceableGroup();
        Modifier modifier2 = OffsetKt.offset(modifier$Companion0, b00);
        composer0.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicy2 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer0, 0);
        composer0.startReplaceableGroup(-1323940314);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap2 = composer0.getCurrentCompositionLocalMap();
        Function0 function02 = composeUiNode$Companion0.getConstructor();
        Function3 function32 = LayoutKt.modifierMaterializerOf(modifier2);
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function02);
        }
        else {
            composer0.useNode();
        }
        Function2 function22 = androidx.room.a.r(composeUiNode$Companion0, composer0, measurePolicy2, composer0, compositionLocalMap2);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
            androidx.room.a.t(v3, composer0, v3, function22);
        }
        a.w(0, function32, SkippableUpdater.box-impl(composer0), composer0, 2058660585);
        this.A.invoke(rowScopeInstance0, composer0, 6);
        composer0.endReplaceableGroup();
        composer0.endNode();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        composer0.endNode();
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

