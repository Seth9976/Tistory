package androidx.compose.runtime.changelist;

import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\r\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"androidx/compose/runtime/changelist/OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "", "instance", "Landroidx/compose/runtime/InvalidationResult;", "invalidate", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "", "recomposeScopeReleased", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "value", "recordReadOf", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class OperationKt.releaseMovableGroupAtCurrent.movableContentRecomposeScopeOwner.1 implements RecomposeScopeOwner {
    public final ControlledComposition a;
    public final MovableContentStateReference b;

    public OperationKt.releaseMovableGroupAtCurrent.movableContentRecomposeScopeOwner.1(ControlledComposition controlledComposition0, MovableContentStateReference movableContentStateReference0) {
        this.a = controlledComposition0;
        this.b = movableContentStateReference0;
    }

    @Override  // androidx.compose.runtime.RecomposeScopeOwner
    @NotNull
    public InvalidationResult invalidate(@NotNull RecomposeScopeImpl recomposeScopeImpl0, @Nullable Object object0) {
        InvalidationResult invalidationResult0;
        RecomposeScopeOwner recomposeScopeOwner0 = this.a instanceof RecomposeScopeOwner ? ((RecomposeScopeOwner)this.a) : null;
        if(recomposeScopeOwner0 == null) {
            invalidationResult0 = InvalidationResult.IGNORED;
        }
        else {
            invalidationResult0 = recomposeScopeOwner0.invalidate(recomposeScopeImpl0, object0);
            if(invalidationResult0 == null) {
                invalidationResult0 = InvalidationResult.IGNORED;
            }
        }
        if(invalidationResult0 == InvalidationResult.IGNORED) {
            Pair pair0 = TuplesKt.to(recomposeScopeImpl0, object0);
            List list0 = CollectionsKt___CollectionsKt.plus(this.b.getInvalidations$runtime_release(), pair0);
            this.b.setInvalidations$runtime_release(list0);
            return InvalidationResult.SCHEDULED;
        }
        return invalidationResult0;
    }

    @Override  // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(@NotNull RecomposeScopeImpl recomposeScopeImpl0) {
    }

    @Override  // androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(@NotNull Object object0) {
    }
}

