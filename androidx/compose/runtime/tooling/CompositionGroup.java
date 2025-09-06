package androidx.compose.runtime.tooling;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001C\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001A\u0010\u0002\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0016\u0010\u000B\u001A\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0012\u0010\u000E\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\rR\u0014\u0010\u0010\u001A\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001A\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/tooling/CompositionData;", "data", "", "", "getData", "()Ljava/lang/Iterable;", "groupSize", "", "getGroupSize", "()I", "identity", "getIdentity", "()Ljava/lang/Object;", "key", "getKey", "node", "getNode", "slotsSize", "getSlotsSize", "sourceInfo", "", "getSourceInfo", "()Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface CompositionGroup extends CompositionData {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static CompositionGroup find(@NotNull CompositionGroup compositionGroup0, @NotNull Object object0) {
            return compositionGroup0.super.find(object0);
        }

        @Deprecated
        public static int getGroupSize(@NotNull CompositionGroup compositionGroup0) {
            return compositionGroup0.super.getGroupSize();
        }

        @Deprecated
        @Nullable
        public static Object getIdentity(@NotNull CompositionGroup compositionGroup0) {
            return compositionGroup0.super.getIdentity();
        }

        @Deprecated
        public static int getSlotsSize(@NotNull CompositionGroup compositionGroup0) {
            return compositionGroup0.super.getSlotsSize();
        }
    }

    @NotNull
    Iterable getData();

    default int getGroupSize() {
        return 0;
    }

    @Nullable
    default Object getIdentity() {
        return null;
    }

    @NotNull
    Object getKey();

    @Nullable
    Object getNode();

    default int getSlotsSize() {
        return 0;
    }

    @Nullable
    String getSourceInfo();
}

