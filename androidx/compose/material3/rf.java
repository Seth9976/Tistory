package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class rf extends Lambda implements Function2 {
    public final Function2 A;
    public final Function2 w;
    public final NavigationDrawerItemColors x;
    public final boolean y;
    public final Function2 z;

    public rf(Function2 function20, NavigationDrawerItemColors navigationDrawerItemColors0, boolean z, Function2 function21, Function2 function22) {
        this.w = function20;
        this.x = navigationDrawerItemColors0;
        this.y = z;
        this.z = function21;
        this.A = function22;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB69E1A7, v, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:941)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 16.0f, 0.0f, 24.0f, 0.0f, 10, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getCenterVertically(), composer0, 0x30);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
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
        Function2 function20 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        composer0.startReplaceGroup(-449407448);
        NavigationDrawerItemColors navigationDrawerItemColors0 = this.x;
        Function2 function21 = this.w;
        boolean z = this.y;
        if(function21 != null) {
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(((Color)navigationDrawerItemColors0.iconColor(z, composer0, 0).getValue()).unbox-impl())), function21, composer0, ProvidedValue.$stable);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 12.0f), composer0, 6);
        }
        composer0.endReplaceGroup();
        Modifier modifier2 = RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null);
        MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer0, modifier2);
        Function0 function01 = composeUiNode$Companion0.getConstructor();
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
        Function2 function22 = a.r(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function22);
        }
        Updater.set-impl(composer0, modifier3, composeUiNode$Companion0.getSetModifier());
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(((Color)navigationDrawerItemColors0.textColor(z, composer0, 0).getValue()).unbox-impl())), this.A, composer0, ProvidedValue.$stable);
        composer0.endNode();
        composer0.startReplaceGroup(0xE536D0AD);
        Function2 function23 = this.z;
        if(function23 != null) {
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 12.0f), composer0, 6);
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(((Color)navigationDrawerItemColors0.badgeColor(z, composer0, 0).getValue()).unbox-impl())), function23, composer0, 8);
        }
        if(a.x(composer0)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

