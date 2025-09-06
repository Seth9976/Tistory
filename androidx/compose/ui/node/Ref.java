package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u000B\u001A\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/Ref;", "T", "", "<init>", "()V", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Ref {
    public static final int $stable = 8;
    public Object a;

    @Nullable
    public final Object getValue() {
        return this.a;
    }

    public final void setValue(@Nullable Object object0) {
        this.a = object0;
    }
}

