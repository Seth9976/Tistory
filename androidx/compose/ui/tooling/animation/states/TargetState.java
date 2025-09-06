package androidx.compose.ui.tooling.animation.states;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\u0006\u0010\u0004\u001A\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00028\u0000HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ*\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001A\u00028\u00002\b\b\u0002\u0010\u0004\u001A\u00028\u0000HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0018\u001A\u0004\b\u001B\u0010\b¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/TargetState;", "T", "Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "initial", "target", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/ui/tooling/animation/states/TargetState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getInitial", "b", "getTarget", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TargetState implements ComposeAnimationState {
    public static final int $stable;
    public final Object a;
    public final Object b;

    public TargetState(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    public final Object component1() {
        return this.a;
    }

    public final Object component2() {
        return this.b;
    }

    @NotNull
    public final TargetState copy(Object object0, Object object1) {
        return new TargetState(object0, object1);
    }

    public static TargetState copy$default(TargetState targetState0, Object object0, Object object1, int v, Object object2) {
        if((v & 1) != 0) {
            object0 = targetState0.a;
        }
        if((v & 2) != 0) {
            object1 = targetState0.b;
        }
        return targetState0.copy(object0, object1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TargetState)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((TargetState)object0).a) ? Intrinsics.areEqual(this.b, ((TargetState)object0).b) : false;
    }

    public final Object getInitial() {
        return this.a;
    }

    public final Object getTarget() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Object object0 = this.b;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "TargetState(initial=" + this.a + ", target=" + this.b + ')';
    }
}

