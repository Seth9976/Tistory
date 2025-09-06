package androidx.compose.material3.carousel;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import v0.m;
import v0.n;

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B)\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000B\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u000B\u0010\fJA\u0010\u0016\u001A\u00020\u00122\u0006\u0010\u000E\u001A\u00020\r2\'\u0010\u0015\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000F¢\u0006\u0002\b\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R.\u0010\u001F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00188\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\"\u0010\'\u001A\u00020 8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010)\u001A\u00020(8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/material3/carousel/CarouselState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "currentItem", "", "currentItemOffsetFraction", "Lkotlin/Function0;", "itemCount", "<init>", "(IFLkotlin/jvm/functions/Function0;)V", "delta", "dispatchRawDelta", "(F)F", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/MutableState;", "a", "Landroidx/compose/runtime/MutableState;", "getItemCountState", "()Landroidx/compose/runtime/MutableState;", "setItemCountState", "(Landroidx/compose/runtime/MutableState;)V", "itemCountState", "Landroidx/compose/foundation/pager/PagerState;", "b", "Landroidx/compose/foundation/pager/PagerState;", "getPagerState$material3_release", "()Landroidx/compose/foundation/pager/PagerState;", "setPagerState$material3_release", "(Landroidx/compose/foundation/pager/PagerState;)V", "pagerState", "", "isScrollInProgress", "()Z", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CarouselState implements ScrollableState {
    @ExperimentalMaterial3Api
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001R!\u0010\u0004\u001A\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material3/carousel/CarouselState$Companion;", "", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/carousel/CarouselState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver getSaver() {
            return CarouselState.c;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public MutableState a;
    public PagerState b;
    public static final Saver c;

    static {
        CarouselState.Companion = new Companion(null);
        CarouselState.$stable = 8;
        CarouselState.c = ListSaverKt.listSaver(m.w, n.w);
    }

    public CarouselState(int v, @FloatRange(from = -0.5, to = 0.5) float f, @NotNull Function0 function00) {
        MutableState mutableState0 = SnapshotStateKt.mutableStateOf$default(function00, null, 2, null);
        this.a = mutableState0;
        this.b = PagerStateKt.PagerState(v, f, ((Function0)mutableState0.getValue()));
    }

    public CarouselState(int v, float f, Function0 function00, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        this(v, f, function00);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.b.dispatchRawDelta(f);
    }

    @NotNull
    public final MutableState getItemCountState() {
        return this.a;
    }

    @NotNull
    public final PagerState getPagerState$material3_release() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.b.isScrollInProgress();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object0 = this.b.scroll(mutatePriority0, function20, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final void setItemCountState(@NotNull MutableState mutableState0) {
        this.a = mutableState0;
    }

    public final void setPagerState$material3_release(@NotNull PagerState pagerState0) {
        this.b = pagerState0;
    }
}

