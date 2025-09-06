package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t6 extends Lambda implements Function2 {
    public final boolean A;
    public final Function0 B;
    public final boolean C;
    public final Function0 w;
    public final boolean x;
    public final String y;
    public final Function0 z;

    public t6(Function0 function00, boolean z, String s, Function0 function01, boolean z1, Function0 function02, boolean z2) {
        this.w = function00;
        this.x = z;
        this.y = s;
        this.z = function01;
        this.A = z1;
        this.B = function02;
        this.C = z2;
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
            ComposerKt.traceEventStart(-962805198, v, -1, "androidx.compose.material3.MonthsNavigation.<anonymous>.<anonymous> (DatePicker.kt:2143)");
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(1377272806, true, new s6(this.y), ((Composer)object0), 54);
        DatePickerKt.access$YearPickerMenuButton(this.w, this.x, null, composableLambda0, ((Composer)object0), 0xC00, 4);
        if(!this.x) {
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), ((Composer)object0), 0);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
            CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(((Composer)object0), Modifier.Companion);
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
            Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
            IconButtonKt.IconButton(this.z, null, this.A, null, null, ComposableSingletons.DatePickerKt.INSTANCE.getLambda-3$material3_release(), ((Composer)object0), 0x30000, 26);
            IconButtonKt.IconButton(this.B, null, this.C, null, null, ComposableSingletons.DatePickerKt.INSTANCE.getLambda-4$material3_release(), ((Composer)object0), 0x30000, 26);
            ((Composer)object0).endNode();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

