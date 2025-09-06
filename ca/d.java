package ca;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.room.a;
import com.kakao.kandinsky.designsystem.common.CommonDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final String w;
    public final String x;
    public final Function0 y;
    public final Function0 z;

    public d(String s, Function0 function00, Function0 function01, String s1) {
        this.w = s;
        this.x = s1;
        this.y = function00;
        this.z = function01;
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
            ComposerKt.traceEventStart(0x4EF51935, v, -1, "com.kakao.kandinsky.designsystem.common.CommonDialog.<anonymous> (CommonDialog.kt:58)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = ClipKt.clip(PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 12.0f, 0.0f, 2, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(12.0f));
        MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
        int v1 = MaterialTheme.$stable;
        Modifier modifier1 = BackgroundKt.background-bw27NRU$default(modifier0, materialTheme0.getColorScheme(((Composer)object0), v1).getOnBackground-0d7_KjU(), null, 2, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), ((Composer)object0), 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier1);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            a.t(v2, composer0, v2, function20);
        }
        Updater.set-impl(composer0, modifier2, composeUiNode$Companion0.getSetModifier());
        Modifier modifier3 = PaddingKt.padding-qDBjuR0(modifier$Companion0, 40.0f, 34.5f, 40.0f, 8.0f);
        TextStyle textStyle0 = materialTheme0.getTypography(((Composer)object0), v1).getHeadlineLarge();
        long v3 = materialTheme0.getColorScheme(((Composer)object0), v1).getOnTertiaryContainer-0d7_KjU();
        TextKt.Text--4IGK_g(this.w, modifier3, v3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, ((Composer)object0), 0, 0, 0xFFF8);
        Modifier modifier4 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 40.0f, 0.0f, 2, null);
        TextStyle textStyle1 = materialTheme0.getTypography(((Composer)object0), v1).getBodyMedium();
        long v4 = materialTheme0.getColorScheme(((Composer)object0), v1).getOnSecondary-0d7_KjU();
        TextAlign textAlign0 = TextAlign.box-impl(3);
        TextKt.Text--4IGK_g(this.x, modifier4, v4, 0L, null, null, null, 0L, null, textAlign0, 0L, 0, false, 0, 0, null, textStyle1, ((Composer)object0), 0x30, 0, 0xFDF8);
        CommonDialogKt.access$DialogButtons(this.y, this.z, ((Composer)object0), 0, 0);
        ((Composer)object0).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

