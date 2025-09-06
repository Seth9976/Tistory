package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR$\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/RememberObserverHolder;", "", "Landroidx/compose/runtime/RememberObserver;", "wrapped", "Landroidx/compose/runtime/Anchor;", "after", "<init>", "(Landroidx/compose/runtime/RememberObserver;Landroidx/compose/runtime/Anchor;)V", "a", "Landroidx/compose/runtime/RememberObserver;", "getWrapped", "()Landroidx/compose/runtime/RememberObserver;", "setWrapped", "(Landroidx/compose/runtime/RememberObserver;)V", "b", "Landroidx/compose/runtime/Anchor;", "getAfter", "()Landroidx/compose/runtime/Anchor;", "setAfter", "(Landroidx/compose/runtime/Anchor;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RememberObserverHolder {
    public static final int $stable = 8;
    public RememberObserver a;
    public Anchor b;

    public RememberObserverHolder(@NotNull RememberObserver rememberObserver0, @Nullable Anchor anchor0) {
        this.a = rememberObserver0;
        this.b = anchor0;
    }

    @Nullable
    public final Anchor getAfter() {
        return this.b;
    }

    @NotNull
    public final RememberObserver getWrapped() {
        return this.a;
    }

    public final void setAfter(@Nullable Anchor anchor0) {
        this.b = anchor0;
    }

    public final void setWrapped(@NotNull RememberObserver rememberObserver0) {
        this.a = rememberObserver0;
    }
}

