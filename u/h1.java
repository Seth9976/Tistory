package u;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.CombinedClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o0.e;
import qd.a;

public final class h1 extends AbstractClickableNode implements CombinedClickableNode {
    public String G;
    public Function0 H;
    public Function0 I;

    public h1(Function0 function00, String s, Function0 function01, Function0 function02, MutableInteractionSource mutableInteractionSource0, IndicationNodeFactory indicationNodeFactory0, boolean z, String s1, Role role0) {
        super(mutableInteractionSource0, indicationNodeFactory0, z, s1, role0, function00, null);
        this.G = s;
        this.H = function01;
        this.I = function02;
    }

    @Override  // androidx.compose.foundation.AbstractClickableNode
    public final void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        if(this.H != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver0, this.G, new e(this, 24));
        }
    }

    @Override  // androidx.compose.foundation.AbstractClickableNode
    public final Object clickPointerInput(PointerInputScope pointerInputScope0, Continuation continuation0) {
        Object object0 = TapGestureDetectorKt.detectTapGestures(pointerInputScope0, (!this.getEnabled() || this.I == null ? null : new g1(this, 0)), (!this.getEnabled() || this.H == null ? null : new g1(this, 1)), new d1(this, null, 1), new g1(this, 2), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.foundation.CombinedClickableNode
    public final void update-nSzSaCc(Function0 function00, String s, Function0 function01, Function0 function02, MutableInteractionSource mutableInteractionSource0, IndicationNodeFactory indicationNodeFactory0, boolean z, String s1, Role role0) {
        int v1;
        if(!Intrinsics.areEqual(this.G, s)) {
            this.G = s;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        int v = 0;
        if((this.H == null ? 1 : 0) == (function01 == null ? 1 : 0)) {
            v1 = 0;
        }
        else {
            this.disposeInteractions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
            v1 = 1;
        }
        this.H = function01;
        int v2 = this.I == null ? 1 : 0;
        if(function02 == null) {
            v = 1;
        }
        if(v2 != v) {
            v1 = 1;
        }
        this.I = function02;
        this.updateCommon-QzZPfjk(mutableInteractionSource0, indicationNodeFactory0, z, s1, role0, function00);
        if((this.getEnabled() == z ? v1 : 1) != 0) {
            this.resetPointerInputHandler();
        }
    }
}

