package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\bR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\n¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/platform/ValueElement;", "", "", "name", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/compose/ui/platform/ValueElement;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Ljava/lang/Object;", "getValue", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ValueElement {
    public static final int $stable = 8;
    public final String a;
    public final Object b;

    public ValueElement(@NotNull String s, @Nullable Object object0) {
        this.a = s;
        this.b = object0;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @Nullable
    public final Object component2() {
        return this.b;
    }

    @NotNull
    public final ValueElement copy(@NotNull String s, @Nullable Object object0) {
        return new ValueElement(s, object0);
    }

    public static ValueElement copy$default(ValueElement valueElement0, String s, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            s = valueElement0.a;
        }
        if((v & 2) != 0) {
            object0 = valueElement0.b;
        }
        return valueElement0.copy(s, object0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ValueElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((ValueElement)object0).a) ? Intrinsics.areEqual(this.b, ((ValueElement)object0).b) : false;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    @Nullable
    public final Object getValue() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "ValueElement(name=" + this.a + ", value=" + this.b + ')';
    }
}

