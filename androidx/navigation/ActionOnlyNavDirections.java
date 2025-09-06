package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u001A\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\fR\u001A\u0010\u001B\u001A\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Landroidx/navigation/ActionOnlyNavDirections;", "Landroidx/navigation/NavDirections;", "", "actionId", "<init>", "(I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "component1", "copy", "(I)Landroidx/navigation/ActionOnlyNavDirections;", "a", "I", "getActionId", "Landroid/os/Bundle;", "b", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "arguments", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ActionOnlyNavDirections implements NavDirections {
    public final int a;
    public final Bundle b;

    public ActionOnlyNavDirections(int v) {
        this.a = v;
        this.b = new Bundle();
    }

    public final int component1() {
        return this.a;
    }

    @NotNull
    public final ActionOnlyNavDirections copy(int v) {
        return new ActionOnlyNavDirections(v);
    }

    public static ActionOnlyNavDirections copy$default(ActionOnlyNavDirections actionOnlyNavDirections0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = actionOnlyNavDirections0.a;
        }
        return actionOnlyNavDirections0.copy(v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return Intrinsics.areEqual(ActionOnlyNavDirections.class, class0) && this.getActionId() == ((ActionOnlyNavDirections)object0).getActionId();
        }
        return false;
    }

    @Override  // androidx.navigation.NavDirections
    public int getActionId() {
        return this.a;
    }

    @Override  // androidx.navigation.NavDirections
    @NotNull
    public Bundle getArguments() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.getActionId() + 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + this.getActionId() + ')';
    }
}

