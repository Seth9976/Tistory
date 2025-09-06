package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import x0.e;
import x0.o;

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001A\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001A\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\u0006J\u0018\u0010\n\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\bH\u0096@¢\u0006\u0004\b\n\u0010\u000BR\u0014\u0010\u000E\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001A\u00020\u000F8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "<init>", "()V", "", "animateToThreshold", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToHidden", "", "targetValue", "snapTo", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDistanceFraction", "()F", "distanceFraction", "", "isAnimating", "()Z", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PullToRefreshStateImpl implements PullToRefreshState {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R#\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl$Companion;", "", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshStateImpl;", "", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver getSaver() {
            return PullToRefreshStateImpl.b;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Animatable a;
    public static final Saver b;

    static {
        PullToRefreshStateImpl.Companion = new Companion(null);
        PullToRefreshStateImpl.b = SaverKt.Saver(o.w, e.y);
    }

    public PullToRefreshStateImpl() {
        this(new Animatable(0.0f, VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), null, null, 12, null));
    }

    public PullToRefreshStateImpl(Animatable animatable0) {
        this.a = animatable0;
    }

    public PullToRefreshStateImpl(Animatable animatable0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(animatable0);
    }

    @Override  // androidx.compose.material3.pulltorefresh.PullToRefreshState
    @Nullable
    public Object animateToHidden(@NotNull Continuation continuation0) {
        Object object0 = Animatable.animateTo$default(this.a, Boxing.boxFloat(0.0f), null, null, null, continuation0, 14, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.material3.pulltorefresh.PullToRefreshState
    @Nullable
    public Object animateToThreshold(@NotNull Continuation continuation0) {
        Object object0 = Animatable.animateTo$default(this.a, Boxing.boxFloat(1.0f), null, null, null, continuation0, 14, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public float getDistanceFraction() {
        return ((Number)this.a.getValue()).floatValue();
    }

    @Override  // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public boolean isAnimating() {
        return this.a.isRunning();
    }

    @Override  // androidx.compose.material3.pulltorefresh.PullToRefreshState
    @Nullable
    public Object snapTo(float f, @NotNull Continuation continuation0) {
        Object object0 = this.a.snapTo(Boxing.boxFloat(f), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

