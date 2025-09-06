package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001Jz\u0010\u0014\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001A\u0004\u0018\u00010\u00052\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\u000E\u001A\u00020\r2\b\u0010\u000F\u001A\u0004\u0018\u00010\u00052\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010H&ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0015ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/CombinedClickableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Lkotlin/Function0;", "", "onClick", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/IndicationNodeFactory;", "indicationNodeFactory", "", "enabled", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "update-nSzSaCc", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;)V", "update", "Lu/h1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface CombinedClickableNode extends PointerInputModifierNode {
    void update-nSzSaCc(@NotNull Function0 arg1, @Nullable String arg2, @Nullable Function0 arg3, @Nullable Function0 arg4, @Nullable MutableInteractionSource arg5, @Nullable IndicationNodeFactory arg6, boolean arg7, @Nullable String arg8, @Nullable Role arg9);
}

