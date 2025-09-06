package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B,\u0012#\u0010\t\u001A\u001F\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000BJ&\u0010\u0010\u001A\u00020\u0007*\u00020\u00042\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R?\u0010\t\u001A\u001F\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifierImpl;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "measureBlock", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "measurable", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "toString", "()Ljava/lang/String;", "n", "Lkotlin/jvm/functions/Function3;", "getMeasureBlock", "()Lkotlin/jvm/functions/Function3;", "setMeasureBlock", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LayoutModifierImpl extends Node implements LayoutModifierNode {
    public static final int $stable = 8;
    public Function3 n;

    public LayoutModifierImpl(@NotNull Function3 function30) {
        this.n = function30;
    }

    @NotNull
    public final Function3 getMeasureBlock() {
        return this.n;
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        return (MeasureResult)this.n.invoke(measureScope0, measurable0, Constraints.box-impl(v));
    }

    public final void setMeasureBlock(@NotNull Function3 function30) {
        this.n = function30;
    }

    @Override
    @NotNull
    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.n + ')';
    }
}

