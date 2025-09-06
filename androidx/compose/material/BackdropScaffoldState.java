package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
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
@Stable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001FB?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EH\u0086@¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u000EH\u0086@¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u000B\u001A\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u001A\u0010\u001B\u001A\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u0011\u0010\u001C\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u001DR\u0011\u0010\u001E\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001D¨\u0006 "}, d2 = {"Landroidx/compose/material/BackdropScaffoldState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/BackdropValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "<init>", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;)V", "", "reveal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "conceal", "q", "Landroidx/compose/material/SnackbarHostState;", "getSnackbarHostState", "()Landroidx/compose/material/SnackbarHostState;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "r", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "isRevealed", "()Z", "isConcealed", "Companion", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BackdropScaffoldState extends SwipeableState {
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JA\u0010\r\u001A\f\u0012\u0004\u0012\u00020\f\u0012\u0002\b\u00030\u000B2\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/material/BackdropScaffoldState$Companion;", "", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Landroidx/compose/material/BackdropValue;", "", "confirmStateChange", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BackdropScaffoldState;", "Saver", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;)Landroidx/compose/runtime/saveable/Saver;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver Saver(@NotNull AnimationSpec animationSpec0, @NotNull Function1 function10, @NotNull SnackbarHostState snackbarHostState0) {
            d d0 = new d(animationSpec0, function10, snackbarHostState0);
            return SaverKt.Saver(c.w, d0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final SnackbarHostState q;
    public final NestedScrollConnection r;

    static {
        BackdropScaffoldState.Companion = new Companion(null);
    }

    public BackdropScaffoldState(@NotNull BackdropValue backdropValue0, @NotNull AnimationSpec animationSpec0, @NotNull Function1 function10, @NotNull SnackbarHostState snackbarHostState0) {
        super(backdropValue0, animationSpec0, function10);
        this.q = snackbarHostState0;
        this.r = SwipeableKt.getPreUpPostDownNestedScrollConnection(this);
    }

    public BackdropScaffoldState(BackdropValue backdropValue0, AnimationSpec animationSpec0, Function1 function10, SnackbarHostState snackbarHostState0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            animationSpec0 = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if((v & 4) != 0) {
            function10 = r.z;
        }
        if((v & 8) != 0) {
            snackbarHostState0 = new SnackbarHostState();
        }
        this(backdropValue0, animationSpec0, function10, snackbarHostState0);
    }

    @Nullable
    public final Object conceal(@NotNull Continuation continuation0) {
        Object object0 = SwipeableState.animateTo$default(this, BackdropValue.Concealed, null, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @NotNull
    public final NestedScrollConnection getNestedScrollConnection$material_release() {
        return this.r;
    }

    @NotNull
    public final SnackbarHostState getSnackbarHostState() {
        return this.q;
    }

    public final boolean isConcealed() {
        return this.getCurrentValue() == BackdropValue.Concealed;
    }

    public final boolean isRevealed() {
        return this.getCurrentValue() == BackdropValue.Revealed;
    }

    @Nullable
    public final Object reveal(@NotNull Continuation continuation0) {
        Object object0 = SwipeableState.animateTo$default(this, BackdropValue.Revealed, null, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

