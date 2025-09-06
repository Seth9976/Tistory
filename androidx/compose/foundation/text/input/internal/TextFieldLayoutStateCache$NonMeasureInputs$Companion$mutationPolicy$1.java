package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m0.c1;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J#\u0010\u0006\u001A\u00020\u00052\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "Lm0/c1;", "a", "b", "", "equivalent", "(Lm0/c1;Lm0/c1;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldLayoutStateCache.NonMeasureInputs.Companion.mutationPolicy.1 implements SnapshotMutationPolicy {
    @Override  // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(Object object0, Object object1) {
        return this.equivalent(((c1)object0), ((c1)object1));
    }

    // 去混淆评级： 低(30)
    public boolean equivalent(@Nullable c1 c10, @Nullable c1 c11) {
        return c10 == null || c11 == null ? ((c10 == null ? 1 : 0) ^ (c11 == null ? 1 : 0)) == 0 : c10.a == c11.a && Intrinsics.areEqual(c10.b, c11.b) && c10.c == c11.c && c10.d == c11.d;
    }
}

