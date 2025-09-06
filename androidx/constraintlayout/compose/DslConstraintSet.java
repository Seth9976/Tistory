package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.Transition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B,\u0012\u0017\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u0013\u001A\u00020\u00072\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u001C\u0010\b\u001A\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Landroidx/constraintlayout/compose/DslConstraintSet;", "Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/ConstraintSetScope;", "", "Lkotlin/ExtensionFunctionType;", "description", "Landroidx/constraintlayout/compose/ConstraintSet;", "extendFrom", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/constraintlayout/compose/ConstraintSet;)V", "Landroidx/constraintlayout/compose/State;", "state", "applyToState", "(Landroidx/constraintlayout/compose/State;)V", "", "name", "", "value", "override", "(Ljava/lang/String;F)Landroidx/constraintlayout/compose/ConstraintSet;", "a", "Lkotlin/jvm/functions/Function1;", "getDescription", "()Lkotlin/jvm/functions/Function1;", "b", "Landroidx/constraintlayout/compose/ConstraintSet;", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DslConstraintSet implements DerivedConstraintSet {
    public final Function1 a;
    public final ConstraintSet b;

    public DslConstraintSet(@NotNull Function1 function10, @Nullable ConstraintSet constraintSet0) {
        Intrinsics.checkNotNullParameter(function10, "description");
        super();
        this.a = function10;
        this.b = constraintSet0;
    }

    public DslConstraintSet(Function1 function10, ConstraintSet constraintSet0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            constraintSet0 = null;
        }
        this(function10, constraintSet0);
    }

    @Override  // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyTo(@NotNull State state0, @NotNull List list0) {
        DefaultImpls.applyTo(this, state0, list0);
    }

    @Override  // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@NotNull Transition transition0, int v) {
        DefaultImpls.applyTo(this, transition0, v);
    }

    @Override  // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyToState(@NotNull State state0) {
        Intrinsics.checkNotNullParameter(state0, "state");
        ConstraintSetScope constraintSetScope0 = new ConstraintSetScope();
        this.a.invoke(constraintSetScope0);
        constraintSetScope0.applyTo(state0);
    }

    @NotNull
    public final Function1 getDescription() {
        return this.a;
    }

    @Override  // androidx.constraintlayout.compose.DerivedConstraintSet
    @Nullable
    public ConstraintSet getExtendFrom() {
        return this.b;
    }

    @Override  // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(@NotNull List list0) {
        return DefaultImpls.isDirty(this, list0);
    }

    @Override  // androidx.constraintlayout.compose.ConstraintSet
    @NotNull
    public ConstraintSet override(@NotNull String s, float f) {
        Intrinsics.checkNotNullParameter(s, "name");
        return this;
    }
}

