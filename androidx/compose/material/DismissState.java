package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.r;
import qd.a;

@ExperimentalMaterialApi
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\tH\u0086@¢\u0006\u0002\u0010\u000FJ\u000E\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\tJ\u000E\u0010\u0011\u001A\u00020\rH\u0086@¢\u0006\u0002\u0010\u0012R\u0013\u0010\b\u001A\u0004\u0018\u00010\t8F¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B¨\u0006\u0014"}, d2 = {"Landroidx/compose/material/DismissState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/DismissValue;", "initialValue", "confirmStateChange", "Lkotlin/Function1;", "", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;)V", "dismissDirection", "Landroidx/compose/material/DismissDirection;", "getDismissDirection", "()Landroidx/compose/material/DismissDirection;", "dismiss", "", "direction", "(Landroidx/compose/material/DismissDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDismissed", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DismissState extends SwipeableState {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/material/DismissState$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/material/DismissValue;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DismissState;", "Saver", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver Saver(@NotNull Function1 function10) {
            o o0 = new o(function10);
            return SaverKt.Saver(n.w, o0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;

    static {
        DismissState.Companion = new Companion(null);
    }

    public DismissState(@NotNull DismissValue dismissValue0, @NotNull Function1 function10) {
        super(dismissValue0, null, function10, 2, null);
    }

    public DismissState(DismissValue dismissValue0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function10 = r.D;
        }
        this(dismissValue0, function10);
    }

    @Nullable
    public final Object dismiss(@NotNull DismissDirection dismissDirection0, @NotNull Continuation continuation0) {
        Object object0 = SwipeableState.animateTo$default(this, (dismissDirection0 == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart), null, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final DismissDirection getDismissDirection() {
        if(((Number)this.getOffset().getValue()).floatValue() == 0.0f) {
            return null;
        }
        return ((Number)this.getOffset().getValue()).floatValue() > 0.0f ? DismissDirection.StartToEnd : DismissDirection.EndToStart;
    }

    public final boolean isDismissed(@NotNull DismissDirection dismissDirection0) {
        return this.getCurrentValue() == (dismissDirection0 == DismissDirection.StartToEnd ? DismissValue.DismissedToEnd : DismissValue.DismissedToStart);
    }

    @Nullable
    public final Object reset(@NotNull Continuation continuation0) {
        Object object0 = SwipeableState.animateTo$default(this, DismissValue.Default, null, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

