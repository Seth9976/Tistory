package androidx.compose.foundation;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import s.h1;
import u.d1;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u000B\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000E0\r¢\u0006\u0002\u0010\u000FJL\u0010\u0010\u001A\u00020\u000E2\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001A\u00020\u00072\b\u0010\b\u001A\u0004\u0018\u00010\t2\b\u0010\n\u001A\u0004\u0018\u00010\u000B2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000E0\rø\u0001\u0000¢\u0006\u0002\b\u0011J\u0012\u0010\u0012\u001A\u00020\u000E*\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/ClickableNode;", "Landroidx/compose/foundation/AbstractClickableNode;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indicationNodeFactory", "Landroidx/compose/foundation/IndicationNodeFactory;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "update", "update-QzZPfjk", "clickPointerInput", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class ClickableNode extends AbstractClickableNode {
    public static final int $stable;

    public ClickableNode(MutableInteractionSource mutableInteractionSource0, IndicationNodeFactory indicationNodeFactory0, boolean z, String s, Role role0, Function0 function00, DefaultConstructorMarker defaultConstructorMarker0) {
        super(mutableInteractionSource0, indicationNodeFactory0, z, s, role0, function00, null);
    }

    @Override  // androidx.compose.foundation.AbstractClickableNode
    @Nullable
    public Object clickPointerInput(@NotNull PointerInputScope pointerInputScope0, @NotNull Continuation continuation0) {
        Unit unit0 = TapGestureDetectorKt.detectTapAndPress(pointerInputScope0, new d1(this, null, 0), new h1(this, 9), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public final void update-QzZPfjk(@Nullable MutableInteractionSource mutableInteractionSource0, @Nullable IndicationNodeFactory indicationNodeFactory0, boolean z, @Nullable String s, @Nullable Role role0, @NotNull Function0 function00) {
        this.updateCommon-QzZPfjk(mutableInteractionSource0, indicationNodeFactory0, z, s, role0, function00);
    }
}

