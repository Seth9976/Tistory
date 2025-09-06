package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@UiToolingDataApi
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001A\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J(\u0010\t\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0002\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001A\u0004\b\u0019\u0010\u0007¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/tooling/data/JoinedKey;", "", "left", "right", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/ui/tooling/data/JoinedKey;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getLeft", "b", "getRight", "ui-tooling-data_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class JoinedKey {
    public static final int $stable = 8;
    public final Object a;
    public final Object b;

    public JoinedKey(@Nullable Object object0, @Nullable Object object1) {
        this.a = object0;
        this.b = object1;
    }

    @Nullable
    public final Object component1() {
        return this.a;
    }

    @Nullable
    public final Object component2() {
        return this.b;
    }

    @NotNull
    public final JoinedKey copy(@Nullable Object object0, @Nullable Object object1) {
        return new JoinedKey(object0, object1);
    }

    public static JoinedKey copy$default(JoinedKey joinedKey0, Object object0, Object object1, int v, Object object2) {
        if((v & 1) != 0) {
            object0 = joinedKey0.a;
        }
        if((v & 2) != 0) {
            object1 = joinedKey0.b;
        }
        return joinedKey0.copy(object0, object1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof JoinedKey)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((JoinedKey)object0).a) ? Intrinsics.areEqual(this.b, ((JoinedKey)object0).b) : false;
    }

    @Nullable
    public final Object getLeft() {
        return this.a;
    }

    @Nullable
    public final Object getRight() {
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
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}

