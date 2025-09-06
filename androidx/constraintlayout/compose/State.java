package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001A\u00020\t2\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0012\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0018\u001A\u00020\u00152\u0006\u0010\u0014\u001A\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001D\u001A\u0004\u0018\u00010\u00072\u0006\u0010\u001A\u001A\u00020\u0019H\u0000¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R+\u0010)\u001A\u00020\"8\u0006@\u0006X\u0086\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R\"\u0010+\u001A\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.\"\u0004\b/\u00100R \u00106\u001A\b\u0012\u0004\u0012\u00020\u0007018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/core/state/State;", "Landroidx/constraintlayout/compose/SolverState;", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "", "value", "", "convertDimension", "(Ljava/lang/Object;)I", "", "reset", "()V", "id", "baselineNeededFor$compose_release", "(Ljava/lang/Object;)V", "baselineNeededFor", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "constraintWidget", "", "isBaselineNeeded$compose_release", "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Z", "isBaselineNeeded", "Landroidx/constraintlayout/core/widgets/HelperWidget;", "helperWidget", "getKeyId$compose_release", "(Landroidx/constraintlayout/core/widgets/HelperWidget;)Ljava/lang/Object;", "getKeyId", "c", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "d", "J", "getRootIncomingConstraints-msEJaDk", "()J", "setRootIncomingConstraints-BRTryo0", "(J)V", "rootIncomingConstraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "", "e", "Ljava/util/List;", "getBaselineNeeded$compose_release", "()Ljava/util/List;", "baselineNeeded", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class State extends androidx.constraintlayout.core.state.State {
    public static final int $stable = 8;
    public final Density c;
    public long d;
    public final ArrayList e;
    public boolean f;
    public final LinkedHashSet g;
    public LayoutDirection layoutDirection;

    public State(@NotNull Density density0) {
        Intrinsics.checkNotNullParameter(density0, "density");
        super();
        this.c = density0;
        this.d = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.e = new ArrayList();
        this.f = true;
        this.g = new LinkedHashSet();
    }

    public final void baselineNeededFor$compose_release(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "id");
        this.e.add(object0);
        this.f = true;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.constraintlayout.core.state.State
    public int convertDimension(@Nullable Object object0) {
        return object0 instanceof Dp ? this.c.roundToPx-0680j_4(((Dp)object0).unbox-impl()) : super.convertDimension(object0);
    }

    @NotNull
    public final List getBaselineNeeded$compose_release() {
        return this.e;
    }

    @NotNull
    public final Density getDensity() {
        return this.c;
    }

    @Nullable
    public final Object getKeyId$compose_release(@NotNull HelperWidget helperWidget0) {
        Intrinsics.checkNotNullParameter(helperWidget0, "helperWidget");
        Set set0 = this.mHelperReferences.entrySet();
        Intrinsics.checkNotNullExpressionValue(set0, "mHelperReferences.entries");
        for(Object object0: set0) {
            if(Intrinsics.areEqual(((HelperReference)((Map.Entry)object0).getValue()).getHelperWidget(), helperWidget0)) {
                return ((Map.Entry)object0) == null ? null : ((Map.Entry)object0).getKey();
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection0 = this.layoutDirection;
        if(layoutDirection0 != null) {
            return layoutDirection0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        throw null;
    }

    public final long getRootIncomingConstraints-msEJaDk() {
        return this.d;
    }

    public final boolean isBaselineNeeded$compose_release(@NotNull ConstraintWidget constraintWidget0) {
        Intrinsics.checkNotNullParameter(constraintWidget0, "constraintWidget");
        LinkedHashSet linkedHashSet0 = this.g;
        if(this.f) {
            linkedHashSet0.clear();
            for(Object object0: this.e) {
                Reference reference0 = (Reference)this.mReferences.get(object0);
                ConstraintWidget constraintWidget1 = reference0 == null ? null : reference0.getConstraintWidget();
                if(constraintWidget1 != null) {
                    linkedHashSet0.add(constraintWidget1);
                }
            }
            this.f = false;
        }
        return linkedHashSet0.contains(constraintWidget0);
    }

    @Override  // androidx.constraintlayout.core.state.State
    public void reset() {
        HashMap hashMap0 = this.mReferences;
        Intrinsics.checkNotNullExpressionValue(hashMap0, "mReferences");
        for(Object object0: hashMap0.entrySet()) {
            Reference reference0 = (Reference)((Map.Entry)object0).getValue();
            if(reference0 != null) {
                ConstraintWidget constraintWidget0 = reference0.getConstraintWidget();
                if(constraintWidget0 != null) {
                    constraintWidget0.reset();
                }
            }
        }
        this.mReferences.clear();
        HashMap hashMap1 = this.mReferences;
        Intrinsics.checkNotNullExpressionValue(hashMap1, "mReferences");
        hashMap1.put(androidx.constraintlayout.core.state.State.PARENT, this.mParent);
        this.e.clear();
        this.f = true;
        super.reset();
    }

    public final void setLayoutDirection(@NotNull LayoutDirection layoutDirection0) {
        Intrinsics.checkNotNullParameter(layoutDirection0, "<set-?>");
        this.layoutDirection = layoutDirection0;
    }

    public final void setRootIncomingConstraints-BRTryo0(long v) {
        this.d = v;
    }
}

