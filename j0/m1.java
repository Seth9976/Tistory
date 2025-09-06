package j0;

import androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m1 extends Lambda implements Function2 {
    public final Function1 A;
    public final TextFieldValue B;
    public final OffsetMapping C;
    public final Density D;
    public final int E;
    public final TextFieldSelectionManager w;
    public final LegacyTextFieldState x;
    public final boolean y;
    public final boolean z;

    public m1(TextFieldSelectionManager textFieldSelectionManager0, LegacyTextFieldState legacyTextFieldState0, boolean z, boolean z1, Function1 function10, TextFieldValue textFieldValue0, OffsetMapping offsetMapping0, Density density0, int v) {
        this.w = textFieldSelectionManager0;
        this.x = legacyTextFieldState0;
        this.y = z;
        this.z = z1;
        this.A = function10;
        this.B = textFieldValue0;
        this.C = offsetMapping0;
        this.D = density0;
        this.E = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        boolean z1;
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xEA5A8151, v, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)");
        }
        CoreTextFieldKt.CoreTextField.5.1.1.2 coreTextFieldKt$CoreTextField$5$1$1$20 = new CoreTextFieldKt.CoreTextField.5.1.1.2(this.x, this.A, this.B, this.C, this.D, this.E);
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
        Updater.set-impl(composer0, coreTextFieldKt$CoreTextField$5$1$1$20, composeUiNode$Companion0.getSetMeasurePolicy());
        Updater.set-impl(composer0, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
        Function2 function20 = composeUiNode$Companion0.getSetCompositeKeyHash();
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            a.t(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        ((Composer)object0).endNode();
        LegacyTextFieldState legacyTextFieldState0 = this.x;
        HandleState handleState0 = legacyTextFieldState0.getHandleState();
        boolean z = this.y;
        if(handleState0 == HandleState.None || legacyTextFieldState0.getLayoutCoordinates() == null) {
            z1 = false;
        }
        else {
            LayoutCoordinates layoutCoordinates0 = legacyTextFieldState0.getLayoutCoordinates();
            Intrinsics.checkNotNull(layoutCoordinates0);
            z1 = !layoutCoordinates0.isAttached() || !z ? false : true;
        }
        TextFieldSelectionManager textFieldSelectionManager0 = this.w;
        CoreTextFieldKt.access$SelectionToolbarAndHandles(textFieldSelectionManager0, z1, ((Composer)object0), 0);
        if(legacyTextFieldState0.getHandleState() != HandleState.Cursor || this.z || !z) {
            ((Composer)object0).startReplaceGroup(0xFFE229BE);
        }
        else {
            ((Composer)object0).startReplaceGroup(0xFFE0FD6E);
            CoreTextFieldKt.TextFieldCursorHandle(textFieldSelectionManager0, ((Composer)object0), 0);
        }
        ((Composer)object0).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

