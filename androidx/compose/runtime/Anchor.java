package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import wb.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\b\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FR\"\u0010\u0015\u001A\u00020\u00028\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005R\u0011\u0010\u0019\u001A\u00020\u00168F¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Landroidx/compose/runtime/Anchor;", "", "", "loc", "<init>", "(I)V", "Landroidx/compose/runtime/SlotTable;", "slots", "toIndexFor", "(Landroidx/compose/runtime/SlotTable;)I", "Landroidx/compose/runtime/SlotWriter;", "writer", "(Landroidx/compose/runtime/SlotWriter;)I", "", "toString", "()Ljava/lang/String;", "a", "I", "getLocation$runtime_release", "()I", "setLocation$runtime_release", "location", "", "getValid", "()Z", "valid", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Anchor {
    public static final int $stable = 8;
    public int a;

    public Anchor(int v) {
        this.a = v;
    }

    public final int getLocation$runtime_release() {
        return this.a;
    }

    public final boolean getValid() {
        return this.a != 0x80000000;
    }

    public final void setLocation$runtime_release(int v) {
        this.a = v;
    }

    public final int toIndexFor(@NotNull SlotTable slotTable0) {
        return slotTable0.anchorIndex(this);
    }

    public final int toIndexFor(@NotNull SlotWriter slotWriter0) {
        return slotWriter0.anchorIndex(this);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append("{ location = ");
        return a.c(this.a, " }", stringBuilder0);
    }
}

