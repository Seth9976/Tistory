package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001D\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0006\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\'\u0010\b\u001A\u0004\u0018\u00018\u00002\u0006\u0010\t\u001A\u00028\u00002\u0006\u0010\n\u001A\u00028\u00002\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/SnapshotMutationPolicy;", "T", "", "equivalent", "", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "merge", "previous", "current", "applied", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface SnapshotMutationPolicy {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static Object merge(@NotNull SnapshotMutationPolicy snapshotMutationPolicy0, Object object0, Object object1, Object object2) {
            return SnapshotMutationPolicy.access$merge$jd(snapshotMutationPolicy0, object0, object1, object2);
        }
    }

    static Object access$merge$jd(SnapshotMutationPolicy snapshotMutationPolicy0, Object object0, Object object1, Object object2) {
        return null;
    }

    boolean equivalent(Object arg1, Object arg2);

    @Nullable
    default Object merge(Object object0, Object object1, Object object2) [...] // Inlined contents
}

