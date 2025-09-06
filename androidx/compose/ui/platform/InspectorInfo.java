package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000B\u001A\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0012\u001A\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001A\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "b", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "Landroidx/compose/ui/platform/ValueElementSequence;", "c", "Landroidx/compose/ui/platform/ValueElementSequence;", "getProperties", "()Landroidx/compose/ui/platform/ValueElementSequence;", "properties", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class InspectorInfo {
    public static final int $stable = 8;
    public String a;
    public Object b;
    public final ValueElementSequence c;

    public InspectorInfo() {
        this.c = new ValueElementSequence();
    }

    @Nullable
    public final String getName() {
        return this.a;
    }

    @NotNull
    public final ValueElementSequence getProperties() {
        return this.c;
    }

    @Nullable
    public final Object getValue() {
        return this.b;
    }

    public final void setName(@Nullable String s) {
        this.a = s;
    }

    public final void setValue(@Nullable Object object0) {
        this.b = object0;
    }
}

