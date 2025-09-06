package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class d2 extends Lambda implements Function2 {
    public final Function3 A;
    public final Function2 w;
    public final SheetState x;
    public final boolean y;
    public final CoroutineScope z;

    public d2(Function2 function20, SheetState sheetState0, boolean z, CoroutineScope coroutineScope0, Function3 function30) {
        this.w = function20;
        this.x = sheetState0;
        this.y = z;
        this.z = coroutineScope0;
        this.A = function30;
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
            ComposerKt.traceEventStart(390720907, v, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:295)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer0, 0);
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
        ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
        composer0.startReplaceGroup(-1168080147);
        Function2 function21 = this.w;
        if(function21 != null) {
            String s = Strings_androidKt.getString-2EP1pXo(string.m3c_bottom_sheet_collapse_description, composer0, 0);
            String s1 = Strings_androidKt.getString-2EP1pXo(string.m3c_bottom_sheet_dismiss_description, composer0, 0);
            String s2 = Strings_androidKt.getString-2EP1pXo(string.m3c_bottom_sheet_expand_description, composer0, 0);
            Modifier modifier2 = columnScopeInstance0.align(modifier$Companion0, alignment$Companion0.getCenterHorizontally());
            SheetState sheetState0 = this.x;
            boolean z = composer0.changed(sheetState0);
            boolean z1 = this.y;
            boolean z2 = composer0.changed(z1);
            boolean z3 = composer0.changed(s2);
            CoroutineScope coroutineScope0 = this.z;
            boolean z4 = composer0.changedInstance(coroutineScope0);
            boolean z5 = composer0.changed(s);
            boolean z6 = composer0.changed(s1);
            c2 c20 = composer0.rememberedValue();
            if((z | z2 | z3 | z4 | z5 | z6) != 0 || c20 == Composer.Companion.getEmpty()) {
                c20 = new c2(sheetState0, z1, s2, s, s1, coroutineScope0);
                composer0.updateRememberedValue(c20);
            }
            Modifier modifier3 = SemanticsModifierKt.semantics(modifier2, true, c20);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
            CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer0, modifier3);
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
            function21.invoke(composer0, r0.a.l(composeUiNode$Companion0, composer0, modifier4, 0));
            composer0.endNode();
        }
        composer0.endReplaceGroup();
        this.A.invoke(columnScopeInstance0, composer0, 6);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

