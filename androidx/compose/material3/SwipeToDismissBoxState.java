package androidx.compose.material3;

import a2.b;
import androidx.annotation.FloatRange;
import androidx.compose.material3.internal.AnchoredDraggableDefaults;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.BP\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012!\u0010\r\u001A\u001D\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0010\u001A\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u0002H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001A\u00020\u00132\u0006\u0010\u0018\u001A\u00020\u0002H\u0086@¢\u0006\u0004\b\u0019\u0010\u0015R\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR \u0010#\u001A\b\u0012\u0004\u0012\u00020\u00020\u001E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u0014\u0010%\u001A\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b$\u0010\u0011R\u0011\u0010(\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b&\u0010\'R\u0011\u0010\u0012\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b)\u0010\'R\u0011\u0010+\u001A\u00020\t8G¢\u0006\u0006\u001A\u0004\b*\u0010\u0011R\u0011\u0010-\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b,\u0010\'¨\u0006/"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxState;", "", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "initialValue", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function1;", "", "confirmValueChange", "", "Lkotlin/ParameterName;", "name", "totalDistance", "positionalThreshold", "<init>", "(Landroidx/compose/material3/SwipeToDismissBoxValue;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "requireOffset", "()F", "targetValue", "", "snapTo", "(Landroidx/compose/material3/SwipeToDismissBoxValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "direction", "dismiss", "a", "Landroidx/compose/ui/unit/Density;", "getDensity$material3_release", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "b", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "getAnchoredDraggableState$material3_release", "()Landroidx/compose/material3/internal/AnchoredDraggableState;", "anchoredDraggableState", "getOffset$material3_release", "offset", "getCurrentValue", "()Landroidx/compose/material3/SwipeToDismissBoxValue;", "currentValue", "getTargetValue", "getProgress", "progress", "getDismissDirection", "dismissDirection", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SwipeToDismissBoxState {
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JX\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u00030\r2\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022!\u0010\n\u001A\u001D\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxState$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "", "confirmValueChange", "", "Lkotlin/ParameterName;", "name", "totalDistance", "positionalThreshold", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SwipeToDismissBoxState;", "Saver", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/unit/Density;)Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver Saver(@NotNull Function1 function10, @NotNull Function1 function11, @NotNull Density density0) {
            vm vm0 = new vm(function10, function11, density0);
            return SaverKt.Saver(um.w, vm0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Density a;
    public final AnchoredDraggableState b;

    static {
        SwipeToDismissBoxState.Companion = new Companion(null);
    }

    public SwipeToDismissBoxState(@NotNull SwipeToDismissBoxValue swipeToDismissBoxValue0, @NotNull Density density0, @NotNull Function1 function10, @NotNull Function1 function11) {
        this.a = density0;
        this.b = new AnchoredDraggableState(swipeToDismissBoxValue0, function11, new b(this, 11), AnchoredDraggableDefaults.INSTANCE.getAnimationSpec(), function10);
    }

    public SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue0, Density density0, Function1 function10, Function1 function11, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            function10 = a5.Y;
        }
        this(swipeToDismissBoxValue0, density0, function10, function11);
    }

    @Nullable
    public final Object dismiss(@NotNull SwipeToDismissBoxValue swipeToDismissBoxValue0, @NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.animateTo$default(this.b, swipeToDismissBoxValue0, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState getAnchoredDraggableState$material3_release() {
        return this.b;
    }

    @NotNull
    public final SwipeToDismissBoxValue getCurrentValue() {
        return (SwipeToDismissBoxValue)this.b.getCurrentValue();
    }

    @NotNull
    public final Density getDensity$material3_release() {
        return this.a;
    }

    @NotNull
    public final SwipeToDismissBoxValue getDismissDirection() {
        if(this.getOffset$material3_release() == 0.0f || Float.isNaN(this.getOffset$material3_release())) {
            return SwipeToDismissBoxValue.Settled;
        }
        return this.getOffset$material3_release() > 0.0f ? SwipeToDismissBoxValue.StartToEnd : SwipeToDismissBoxValue.EndToStart;
    }

    public final float getOffset$material3_release() {
        return this.b.getOffset();
    }

    @FloatRange(from = 0.0, to = 1.0)
    public final float getProgress() {
        return this.b.getProgress();
    }

    @NotNull
    public final SwipeToDismissBoxValue getTargetValue() {
        return (SwipeToDismissBoxValue)this.b.getTargetValue();
    }

    public final float requireOffset() {
        return this.b.requireOffset();
    }

    @Nullable
    public final Object reset(@NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.animateTo$default(this.b, SwipeToDismissBoxValue.Settled, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo(@NotNull SwipeToDismissBoxValue swipeToDismissBoxValue0, @NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.snapTo(this.b, swipeToDismissBoxValue0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

