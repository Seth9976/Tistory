package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class bn extends Lambda implements Function2 {
    public final boolean A;
    public final Function0 B;
    public final Function2 C;
    public final Function2 D;
    public final Modifier w;
    public final boolean x;
    public final MutableInteractionSource y;
    public final Indication z;

    public bn(Modifier modifier0, boolean z, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z1, Function0 function00, Function2 function20, Function2 function21) {
        this.w = modifier0;
        this.x = z;
        this.y = mutableInteractionSource0;
        this.z = indication0;
        this.A = z1;
        this.B = function00;
        this.C = function20;
        this.D = function21;
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
            ComposerKt.traceEventStart(0xE66D6804, v, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:174)");
        }
        Modifier modifier0 = SizeKt.height-3ABfNKs(this.w, 0.0f);
        Role role0 = Role.box-impl(4);
        Modifier modifier1 = SizeKt.fillMaxWidth$default(PaddingKt.padding-VpY3zN4$default(SelectableKt.selectable-O2vRcR0(modifier0, this.x, this.y, this.z, this.A, role0, this.B), 0.0f, 0.0f, 2, null), 0.0f, 1, null);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), ((Composer)object0), 54);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier1);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
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
        Integer integer0 = r0.a.l(composeUiNode$Companion0, composer0, modifier2, 0);
        this.C.invoke(((Composer)object0), integer0);
        SpacerKt.Spacer(SizeKt.requiredWidth-3ABfNKs(Modifier.Companion, 0.0f), ((Composer)object0), 6);
        TextKt.ProvideTextStyle(TextStyle.copy-p1EtxEg$default(TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), ((Composer)object0), 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 3, 0, 0L, null, null, null, 0, 0, null, 0xFF7FFF, null), this.D, ((Composer)object0), 0);
        ((Composer)object0).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

