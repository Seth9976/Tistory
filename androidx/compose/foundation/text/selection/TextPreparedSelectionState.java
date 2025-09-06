package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\r\u001A\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "", "<init>", "()V", "", "resetCachedX", "", "a", "Ljava/lang/Float;", "getCachedX", "()Ljava/lang/Float;", "setCachedX", "(Ljava/lang/Float;)V", "cachedX", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextPreparedSelectionState {
    public static final int $stable = 8;
    public Float a;

    @Nullable
    public final Float getCachedX() {
        return this.a;
    }

    public final void resetCachedX() {
        this.a = null;
    }

    public final void setCachedX(@Nullable Float float0) {
        this.a = float0;
    }
}

