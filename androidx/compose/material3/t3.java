package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t3 extends Lambda implements Function2 {
    public final Function2 A;
    public final long B;
    public final Function2 C;
    public final long D;
    public final float w;
    public final PaddingValues x;
    public final Function2 y;
    public final Function2 z;

    public t3(float f, PaddingValues paddingValues0, Function2 function20, Function2 function21, Function2 function22, long v, Function2 function23, long v1) {
        this.w = f;
        this.x = paddingValues0;
        this.y = function20;
        this.z = function21;
        this.A = function22;
        this.B = v;
        this.C = function23;
        this.D = v1;
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
            ComposerKt.traceEventStart(0x683C8EAC, v, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:2056)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding(SizeKt.defaultMinSize-VpY3zN4$default(modifier$Companion0, 0.0f, this.w, 1, null), this.x);
        s3 s30 = s3.b;
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
        Updater.set-impl(composer0, s30, composeUiNode$Companion0.getSetMeasurePolicy());
        Updater.set-impl(composer0, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
        Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        r0.a.z(composeUiNode$Companion0, composer0, modifier1, composer0, 0xB2EBCBF9);
        Function2 function21 = this.y;
        Function2 function22 = this.z;
        if(function21 != null || function22 != null) {
            Modifier modifier2 = LayoutIdKt.layoutId(modifier$Companion0, "leadingIcon");
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
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
            Function2 function23 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap1);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                a.t(v2, composer0, v2, function23);
            }
            Updater.set-impl(composer0, modifier3, composeUiNode$Companion0.getSetModifier());
            if(function21 != null) {
                composer0.startReplaceGroup(832680499);
                function21.invoke(composer0, 0);
            }
            else if(function22 == null) {
                composer0.startReplaceGroup(833040347);
            }
            else {
                composer0.startReplaceGroup(0x31A35855);
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(this.B)), function22, composer0, ProvidedValue.$stable);
            }
            composer0.endReplaceGroup();
            composer0.endNode();
        }
        composer0.endReplaceGroup();
        Modifier modifier4 = PaddingKt.padding-VpY3zN4(LayoutIdKt.layoutId(modifier$Companion0, "label"), 8.0f, 0.0f);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getCenterVertically(), composer0, 54);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap2 = composer0.getCurrentCompositionLocalMap();
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
        Function2 function24 = a.r(composeUiNode$Companion0, composer0, measurePolicy1, composer0, compositionLocalMap2);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
            a.t(v3, composer0, v3, function24);
        }
        Integer integer0 = r0.a.l(composeUiNode$Companion0, composer0, modifier5, 0);
        this.C.invoke(composer0, integer0);
        composer0.endNode();
        composer0.startReplaceGroup(0xB2EC5224);
        Function2 function25 = this.A;
        if(function25 != null) {
            Modifier modifier6 = LayoutIdKt.layoutId(modifier$Companion0, "trailingIcon");
            MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
            CompositionLocalMap compositionLocalMap3 = composer0.getCurrentCompositionLocalMap();
            Modifier modifier7 = ComposedModifierKt.materializeModifier(composer0, modifier6);
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer0.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer0.startReusableNode();
            if(composer0.getInserting()) {
                composer0.createNode(function03);
            }
            else {
                composer0.useNode();
            }
            Function2 function26 = a.r(composeUiNode$Companion0, composer0, measurePolicy2, composer0, compositionLocalMap3);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v4)) {
                a.t(v4, composer0, v4, function26);
            }
            Updater.set-impl(composer0, modifier7, composeUiNode$Companion0.getSetModifier());
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(this.D)), function25, composer0, ProvidedValue.$stable);
            composer0.endNode();
        }
        if(a.x(composer0)) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

