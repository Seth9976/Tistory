package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
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
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
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

public final class be extends Lambda implements Function2 {
    public final Function0 A;
    public final CoroutineScope B;
    public final Function3 C;
    public final Function2 w;
    public final Animatable x;
    public final Function2 y;
    public final SheetState z;

    public be(Function2 function20, Animatable animatable0, Function2 function21, SheetState sheetState0, Function0 function00, CoroutineScope coroutineScope0, Function3 function30) {
        this.w = function20;
        this.x = animatable0;
        this.y = function21;
        this.z = sheetState0;
        this.A = function00;
        this.B = coroutineScope0;
        this.C = function30;
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
            ComposerKt.traceEventStart(0xD6B6B608, v, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), ((WindowInsets)this.w.invoke(composer0, 0)));
        Animatable animatable0 = this.x;
        boolean z = composer0.changedInstance(animatable0);
        yd yd0 = composer0.rememberedValue();
        if(z || yd0 == Composer.Companion.getEmpty()) {
            yd0 = new yd(animatable0, 0);
            composer0.updateRememberedValue(yd0);
        }
        Modifier modifier1 = GraphicsLayerModifierKt.graphicsLayer(modifier0, yd0);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer0, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer0, modifier1);
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
        Updater.set-impl(composer0, modifier2, composeUiNode$Companion0.getSetModifier());
        ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
        composer0.startReplaceGroup(-1636564008);
        Function2 function21 = this.y;
        if(function21 != null) {
            String s = Strings_androidKt.getString-2EP1pXo(string.m3c_bottom_sheet_collapse_description, composer0, 0);
            String s1 = Strings_androidKt.getString-2EP1pXo(string.m3c_bottom_sheet_dismiss_description, composer0, 0);
            String s2 = Strings_androidKt.getString-2EP1pXo(string.m3c_bottom_sheet_expand_description, composer0, 0);
            Modifier modifier3 = columnScopeInstance0.align(modifier$Companion0, alignment$Companion0.getCenterHorizontally());
            SheetState sheetState0 = this.z;
            boolean z1 = composer0.changed(sheetState0);
            boolean z2 = composer0.changed(s1);
            Function0 function01 = this.A;
            boolean z3 = composer0.changed(function01);
            boolean z4 = composer0.changed(s2);
            CoroutineScope coroutineScope0 = this.B;
            boolean z5 = composer0.changedInstance(coroutineScope0);
            boolean z6 = composer0.changed(s);
            e3 e30 = composer0.rememberedValue();
            if((z1 | z2 | z3 | z4 | z5 | z6) != 0 || e30 == Composer.Companion.getEmpty()) {
                e30 = new e3(sheetState0, s1, s2, s, function01, coroutineScope0, 1);
                composer0.updateRememberedValue(e30);
            }
            Modifier modifier4 = SemanticsModifierKt.semantics(modifier3, true, e30);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
            CompositionLocalMap compositionLocalMap1 = composer0.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer0, modifier4);
            Function0 function02 = composeUiNode$Companion0.getConstructor();
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap1);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                a.t(v2, composer0, v2, function22);
            }
            function21.invoke(composer0, r0.a.l(composeUiNode$Companion0, composer0, modifier5, 0));
            composer0.endNode();
        }
        composer0.endReplaceGroup();
        this.C.invoke(columnScopeInstance0, composer0, 6);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

