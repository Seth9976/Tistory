package p0;

import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldColors;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import r0.a;

public final class gb extends Lambda implements Function3 {
    public final float w;
    public final TextFieldColors x;
    public final boolean y;
    public final Function2 z;

    public gb(float f, TextFieldColors textFieldColors0, boolean z, Function2 function20) {
        this.w = f;
        this.x = textFieldColors0;
        this.y = z;
        this.z = function20;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (composer0.changed(((Modifier)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1120552650, v, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:137)");
        }
        Modifier modifier0 = AlphaKt.alpha(((Modifier)object0), this.w);
        composer0.startReplaceableGroup(0x2BB5B5D7);
        MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, false, composer0, 0, -1323940314);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        TextFieldImplKt.Decoration-euL9pac(((Color)this.x.placeholderColor(this.y, composer0, 0).getValue()).unbox-impl(), MaterialTheme.INSTANCE.getTypography(composer0, 6).getSubtitle1(), null, this.z, composer0, 0, 4);
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

