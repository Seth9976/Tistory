package j0;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.HeightInLinesModifierKt;
import androidx.compose.foundation.text.TextFieldSizeKt;
import androidx.compose.foundation.text.input.TextFieldLineLimits.MultiLine;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.room.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function2 {
    public final boolean A;
    public final boolean B;
    public final TransformedTextFieldState C;
    public final TextFieldSelectionState D;
    public final Brush E;
    public final boolean F;
    public final boolean G;
    public final ScrollState H;
    public final Orientation I;
    public final boolean J;
    public final Function2 K;
    public final TextFieldLineLimits w;
    public final TextLayoutState x;
    public final TextStyle y;
    public final boolean z;

    public z(TextFieldLineLimits textFieldLineLimits0, TextLayoutState textLayoutState0, TextStyle textStyle0, boolean z, boolean z1, boolean z2, TransformedTextFieldState transformedTextFieldState0, TextFieldSelectionState textFieldSelectionState0, Brush brush0, boolean z3, boolean z4, ScrollState scrollState0, Orientation orientation0, boolean z5, Function2 function20) {
        this.w = textFieldLineLimits0;
        this.x = textLayoutState0;
        this.y = textStyle0;
        this.z = z;
        this.A = z1;
        this.B = z2;
        this.C = transformedTextFieldState0;
        this.D = textFieldSelectionState0;
        this.E = brush0;
        this.F = z3;
        this.G = z4;
        this.H = scrollState0;
        this.I = orientation0;
        this.J = z5;
        this.K = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v2;
        int v1;
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x755F253E, v, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
        }
        TextFieldLineLimits textFieldLineLimits0 = this.w;
        if(textFieldLineLimits0 instanceof MultiLine) {
            v1 = ((MultiLine)textFieldLineLimits0).getMinHeightInLines();
            v2 = ((MultiLine)textFieldLineLimits0).getMaxHeightInLines();
        }
        else {
            v2 = 1;
            v1 = 1;
        }
        Companion modifier$Companion0 = Modifier.Companion;
        TextLayoutState textLayoutState0 = this.x;
        Modifier modifier0 = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.heightIn-VpY3zN4$default(modifier$Companion0, textLayoutState0.getMinHeightForSingleLineField-D9Ej5fM(), 0.0f, 2, null), this.y, v1, v2), this.y));
        boolean z = this.A;
        boolean z1 = this.z;
        boolean z2 = this.G;
        boolean z3 = this.F;
        Modifier modifier1 = modifier0.then(new TextFieldCoreModifier(z1 && z, this.B, this.x, this.C, this.D, this.E, z3 && !z2, this.H, this.I));
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
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
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
            a.t(v3, composer0, v3, function20);
        }
        Updater.set-impl(composer0, modifier2, composeUiNode$Companion0.getSetModifier());
        BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(modifier$Companion0, textLayoutState0.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState0, this.C, this.y, this.J, this.K)), composer0, 0);
        if(!z3 || !z1 || !z) {
            composer0.startReplaceGroup(0xB103B9C0);
        }
        else {
            TextFieldSelectionState textFieldSelectionState0 = this.D;
            if(textFieldSelectionState0.isInTouchMode()) {
                composer0.startReplaceGroup(0xB0FE01BA);
                BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState0, composer0, 0);
                if(z2) {
                    composer0.startReplaceGroup(0xB1036480);
                }
                else {
                    composer0.startReplaceGroup(0xB100BD0B);
                    BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState0, composer0, 0);
                }
                composer0.endReplaceGroup();
            }
            else {
                composer0.startReplaceGroup(0xB103B9C0);
            }
        }
        composer0.endReplaceGroup();
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

