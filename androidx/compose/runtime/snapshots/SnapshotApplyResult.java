package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\nJ\u000F\u0010\u0003\u001A\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00058&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000B\f¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "", "", "check", "()V", "", "getSucceeded", "()Z", "succeeded", "Failure", "Success", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Failure;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Success;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class SnapshotApplyResult {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\u0010\u001A\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Failure;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "", "check", "()V", "a", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "", "getSucceeded", "()Z", "succeeded", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Failure extends SnapshotApplyResult {
        public static final int $stable = 8;
        public final Snapshot a;

        public Failure(@NotNull Snapshot snapshot0) {
            super(null);
            this.a = snapshot0;
        }

        @Override  // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public void check() {
            this.a.dispose();
            throw new SnapshotApplyConflictException(this.a);
        }

        @NotNull
        public final Snapshot getSnapshot() {
            return this.a;
        }

        @Override  // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public boolean getSucceeded() {
            return false;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyResult$Success;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "", "check", "()V", "", "getSucceeded", "()Z", "succeeded", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Success extends SnapshotApplyResult {
        public static final int $stable;
        @NotNull
        public static final Success INSTANCE;

        static {
            Success.INSTANCE = new Success(null);  // 初始化器: Landroidx/compose/runtime/snapshots/SnapshotApplyResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        }

        @Override  // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public void check() {
        }

        @Override  // androidx.compose.runtime.snapshots.SnapshotApplyResult
        public boolean getSucceeded() {
            return true;
        }
    }

    public static final int $stable;

    public SnapshotApplyResult(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public abstract void check();

    public abstract boolean getSucceeded();
}

