package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import m0.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001A\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003R+\u0010\u0010\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\b8F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "", "<init>", "()V", "", "snapToVisibleAndAnimate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAndHide", "", "<set-?>", "b", "Landroidx/compose/runtime/MutableFloatState;", "getCursorAlpha", "()F", "setCursorAlpha", "(F)V", "cursorAlpha", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCursorAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,97:1\n76#2:98\n109#2,2:99\n*S KotlinDebug\n*F\n+ 1 CursorAnimationState.kt\nandroidx/compose/foundation/text/input/internal/CursorAnimationState\n*L\n44#1:98\n44#1:99,2\n*E\n"})
public final class CursorAnimationState {
    public static final int $stable = 8;
    public final AtomicReference a;
    public final MutableFloatState b;

    public CursorAnimationState() {
        this.a = new AtomicReference(null);
        this.b = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    public static final void access$setCursorAlpha(CursorAnimationState cursorAnimationState0, float f) {
        cursorAnimationState0.b.setFloatValue(f);
    }

    public final void cancelAndHide() {
        Job job0 = (Job)this.a.getAndSet(null);
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
    }

    public final float getCursorAlpha() {
        return this.b.getFloatValue();
    }

    @Nullable
    public final Object snapToVisibleAndAnimate(@NotNull Continuation continuation0) {
        Object object0 = CoroutineScopeKt.coroutineScope(new t(this, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

