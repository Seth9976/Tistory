package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B)\u0012\u0018\u0010\u0006\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000EJ+\u0010\u0016\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/constraintlayout/compose/BaseHorizontalAnchorable;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "", "tasks", "", "index", "<init>", "(Ljava/util/List;I)V", "state", "Landroidx/constraintlayout/core/state/ConstraintReference;", "getConstraintReference", "(Landroidx/constraintlayout/compose/State;)Landroidx/constraintlayout/core/state/ConstraintReference;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "anchor", "Landroidx/compose/ui/unit/Dp;", "margin", "goneMargin", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FF)V", "linkTo", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class BaseHorizontalAnchorable implements HorizontalAnchorable {
    public final List a;
    public final int b;

    public BaseHorizontalAnchorable(@NotNull List list0, int v) {
        Intrinsics.checkNotNullParameter(list0, "tasks");
        super();
        this.a = list0;
        this.b = v;
    }

    @NotNull
    public abstract ConstraintReference getConstraintReference(@NotNull State arg1);

    @Override  // androidx.constraintlayout.compose.HorizontalAnchorable
    public final void linkTo-VpY3zN4(@NotNull HorizontalAnchor constraintLayoutBaseScope$HorizontalAnchor0, float f, float f1) {
        Intrinsics.checkNotNullParameter(constraintLayoutBaseScope$HorizontalAnchor0, "anchor");
        c c0 = new c(f, f1, this, 0, constraintLayoutBaseScope$HorizontalAnchor0);
        this.a.add(c0);
    }
}

