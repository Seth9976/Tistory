package p0;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d5 extends Lambda implements Function2 {
    public final Modifier w;
    public final ScrollState x;
    public final Function3 y;

    public d5(Modifier modifier0, ScrollState scrollState0, Function3 function30) {
        this.w = modifier0;
        this.x = scrollState0;
        this.y = function30;
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
            ComposerKt.traceEventStart(0x356116D2, v, -1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:124)");
        }
        Modifier modifier0 = ScrollKt.verticalScroll$default(IntrinsicKt.width(PaddingKt.padding-VpY3zN4$default(this.w, 0.0f, 8.0f, 1, null), IntrinsicSize.Max), this.x, false, null, false, 14, null);
        ((Composer)object0).startReplaceableGroup(0xE32F0E82);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), ((Composer)object0), 0);
        ((Composer)object0).startReplaceableGroup(-1323940314);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        Function3 function30 = LayoutKt.modifierMaterializerOf(modifier0);
        if(((Composer)object0).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object0).startReusableNode();
        if(((Composer)object0).getInserting()) {
            ((Composer)object0).createNode(function00);
        }
        else {
            ((Composer)object0).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object0));
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        r0.a.w(0, function30, SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(((Composer)object0))), ((Composer)object0), 2058660585);
        this.y.invoke(ColumnScopeInstance.INSTANCE, ((Composer)object0), 6);
        ((Composer)object0).endReplaceableGroup();
        ((Composer)object0).endNode();
        ((Composer)object0).endReplaceableGroup();
        ((Composer)object0).endReplaceableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

