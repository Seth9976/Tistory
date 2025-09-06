package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.Transition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001E\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u0016J\u0010\u0010\f\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH&R\u0014\u0010\u0002\u001A\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\r"}, d2 = {"Landroidx/constraintlayout/compose/DerivedConstraintSet;", "Landroidx/constraintlayout/compose/ConstraintSet;", "extendFrom", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "applyTo", "", "state", "Landroidx/constraintlayout/compose/State;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "applyToState", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface DerivedConstraintSet extends ConstraintSet {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static void applyTo(@NotNull DerivedConstraintSet derivedConstraintSet0, @NotNull State state0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(derivedConstraintSet0, "this");
            Intrinsics.checkNotNullParameter(state0, "state");
            Intrinsics.checkNotNullParameter(list0, "measurables");
            ConstraintLayoutKt.buildMapping(state0, list0);
            ConstraintSet constraintSet0 = derivedConstraintSet0.getExtendFrom();
            DerivedConstraintSet derivedConstraintSet1 = constraintSet0 instanceof DerivedConstraintSet ? ((DerivedConstraintSet)constraintSet0) : null;
            if(derivedConstraintSet1 != null) {
                derivedConstraintSet1.applyTo(state0, list0);
            }
            derivedConstraintSet0.applyToState(state0);
        }

        public static void applyTo(@NotNull DerivedConstraintSet derivedConstraintSet0, @NotNull Transition transition0, int v) {
            Intrinsics.checkNotNullParameter(derivedConstraintSet0, "this");
            Intrinsics.checkNotNullParameter(transition0, "transition");
            androidx.constraintlayout.compose.ConstraintSet.DefaultImpls.applyTo(derivedConstraintSet0, transition0, v);
        }

        public static boolean isDirty(@NotNull DerivedConstraintSet derivedConstraintSet0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(derivedConstraintSet0, "this");
            Intrinsics.checkNotNullParameter(list0, "measurables");
            return androidx.constraintlayout.compose.ConstraintSet.DefaultImpls.isDirty(derivedConstraintSet0, list0);
        }

        @NotNull
        public static ConstraintSet override(@NotNull DerivedConstraintSet derivedConstraintSet0, @NotNull String s, float f) {
            Intrinsics.checkNotNullParameter(derivedConstraintSet0, "this");
            Intrinsics.checkNotNullParameter(s, "name");
            return androidx.constraintlayout.compose.ConstraintSet.DefaultImpls.override(derivedConstraintSet0, s, f);
        }
    }

    @Override  // androidx.constraintlayout.compose.ConstraintSet
    void applyTo(@NotNull State arg1, @NotNull List arg2);

    void applyToState(@NotNull State arg1);

    @Nullable
    ConstraintSet getExtendFrom();
}

