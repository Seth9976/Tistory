package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m0.b1;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J#\u0010\u0006\u001A\u00020\u00052\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs$Companion$mutationPolicy$1", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "Lm0/b1;", "a", "b", "", "equivalent", "(Lm0/b1;Lm0/b1;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldLayoutStateCache.MeasureInputs.Companion.mutationPolicy.1 implements SnapshotMutationPolicy {
    @Override  // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object object0, Object object1) {
        return this.equivalent(((b1)object0), ((b1)object1));
    }

    // 去混淆评级： 低(40)
    public boolean equivalent(@Nullable b1 b10, @Nullable b1 b11) {
        return b10 == null || b11 == null ? ((b10 == null ? 1 : 0) ^ (b11 == null ? 1 : 0)) == 0 : b10.e == b11.e && b10.f == b11.f && b10.b == b11.b && Intrinsics.areEqual(b10.c, b11.c) && Constraints.equals-impl0(b10.d, b11.d);
    }
}

