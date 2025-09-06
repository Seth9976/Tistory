package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n6.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.l5;
import qd.a;

@ExperimentalMaterialApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001A\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB?\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\t\u00A2\u0006\u0004\b\u000B\u0010\fB3\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\t\u00A2\u0006\u0004\b\u000B\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EH\u0086@\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u000EH\u0080@\u00A2\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0014\u001A\u00020\u000EH\u0080@\u00A2\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0015\u001A\u00020\u000EH\u0086@\u00A2\u0006\u0004\b\u0015\u0010\u0010J\"\u0010\u001A\u001A\u00020\u000E2\u0006\u0010\u0016\u001A\u00020\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u0005H\u0080@\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001D\u001A\u00020\u000E2\u0006\u0010\u0016\u001A\u00020\u0002H\u0080@\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010 \u001A\u00020\u0005H\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FR \u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R\u001A\u0010\b\u001A\u00020\u00078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R \u0010.\u001A\b\u0012\u0004\u0012\u00020\u00020)8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R$\u00106\u001A\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b0\u00101\u001A\u0004\b2\u00103\"\u0004\b4\u00105R\u001A\u0010:\u001A\u00020\u00058GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b8\u00109\u001A\u0004\b7\u0010\u001FR\u0011\u0010=\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b;\u0010<R\u0011\u0010?\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b>\u0010<R\u0011\u0010@\u001A\u00020\u00078F\u00A2\u0006\u0006\u001A\u0004\b@\u0010(R\u0014\u0010B\u001A\u00020\u00078@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bA\u0010(\u00A8\u0006D"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "", "Landroidx/compose/material/ModalBottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "", "isSkipHalfExpanded", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;)V", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "", "show", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "halfExpand$material_release", "halfExpand", "expand$material_release", "expand", "hide", "target", "velocity", "animateTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "snapTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "requireOffset$material_release", "()F", "requireOffset", "a", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "b", "Z", "isSkipHalfExpanded$material_release", "()Z", "Landroidx/compose/material/AnchoredDraggableState;", "c", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/ui/unit/Density;", "d", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "getProgress", "getProgress$annotations", "()V", "progress", "getCurrentValue", "()Landroidx/compose/material/ModalBottomSheetValue;", "currentValue", "getTargetValue", "targetValue", "isVisible", "getHasHalfExpandedState$material_release", "hasHalfExpandedState", "Companion", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ModalBottomSheetState {
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001JI\u0010\u000E\u001A\f\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u00030\f2\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\t\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u000E\u0010\u000FJC\u0010\u000E\u001A\f\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u00030\f2\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\t\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\u000E\u0010\u0010JC\u0010\u000E\u001A\f\u0012\u0004\u0012\u00020\r\u0012\u0002\b\u00030\f2\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001A\u00020\u00072\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u000E\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState$Companion;", "", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Landroidx/compose/material/ModalBottomSheetValue;", "", "confirmValueChange", "skipHalfExpanded", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/ModalBottomSheetState;", "Saver", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/unit/Density;)Landroidx/compose/runtime/saveable/Saver;", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/runtime/saveable/Saver;", "confirmStateChange", "(Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Deprecated(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @ReplaceWith(expression = "Saver(animationSpec, confirmValueChange, density, skipHalfExpanded)", imports = {}))
        @NotNull
        public final Saver Saver(@NotNull AnimationSpec animationSpec0, @NotNull Function1 function10, boolean z) {
            x x0 = new x(animationSpec0, function10, z);
            return SaverKt.Saver(w.w, x0);
        }

        @NotNull
        public final Saver Saver(@NotNull AnimationSpec animationSpec0, @NotNull Function1 function10, boolean z, @NotNull Density density0) {
            v v0 = new v(animationSpec0, function10, z, density0);
            return SaverKt.Saver(u.w, v0);
        }

        @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "Saver(animationSpec, confirmStateChange, skipHalfExpanded)", imports = {}))
        @NotNull
        public final Saver Saver(@NotNull AnimationSpec animationSpec0, boolean z, @NotNull Function1 function10) {
            return this.Saver(animationSpec0, function10, z);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AnimationSpec a;
    public final boolean b;
    public final AnchoredDraggableState c;
    public Density d;

    static {
        ModalBottomSheetState.Companion = new Companion(null);
        ModalBottomSheetState.$stable = 8;
    }

    @Deprecated(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "ModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    public ModalBottomSheetState(@NotNull ModalBottomSheetValue modalBottomSheetValue0, @NotNull AnimationSpec animationSpec0, @NotNull Function1 function10) {
        this(modalBottomSheetValue0, animationSpec0, false, function10);
    }

    @Deprecated(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "ModalBottomSheetState(initialValue, animationSpec, confirmStateChange, isSkipHalfExpanded)", imports = {}))
    public ModalBottomSheetState(@NotNull ModalBottomSheetValue modalBottomSheetValue0, @NotNull AnimationSpec animationSpec0, boolean z, @NotNull Function1 function10) {
        this.a = animationSpec0;
        this.b = z;
        this.c = new AnchoredDraggableState(modalBottomSheetValue0, new l5(this, 1), new f(this, 1), animationSpec0, function10);
        if(z && modalBottomSheetValue0 == ModalBottomSheetValue.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    public ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue0, AnimationSpec animationSpec0, boolean z, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            animationSpec0 = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if((v & 4) != 0) {
            z = false;
        }
        this(modalBottomSheetValue0, animationSpec0, z, function10);
    }

    public static final Density access$requireDensity(ModalBottomSheetState modalBottomSheetState0) {
        Density density0 = modalBottomSheetState0.d;
        if(density0 == null) {
            throw new IllegalArgumentException(("The density on ModalBottomSheetState (" + modalBottomSheetState0 + ") was not set. Did you use ModalBottomSheetState with the ModalBottomSheetLayout composable?").toString());
        }
        return density0;
    }

    @Nullable
    public final Object animateTo$material_release(@NotNull ModalBottomSheetValue modalBottomSheetValue0, float f, @NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.animateTo(this.c, modalBottomSheetValue0, f, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object animateTo$material_release$default(ModalBottomSheetState modalBottomSheetState0, ModalBottomSheetValue modalBottomSheetValue0, float f, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            f = modalBottomSheetState0.c.getLastVelocity();
        }
        return modalBottomSheetState0.animateTo$material_release(modalBottomSheetValue0, f, continuation0);
    }

    @Nullable
    public final Object expand$material_release(@NotNull Continuation continuation0) {
        DraggableAnchors draggableAnchors0 = this.c.getAnchors();
        ModalBottomSheetValue modalBottomSheetValue0 = ModalBottomSheetValue.Expanded;
        if(!draggableAnchors0.hasAnchorFor(modalBottomSheetValue0)) {
            return Unit.INSTANCE;
        }
        Object object0 = ModalBottomSheetState.animateTo$material_release$default(this, modalBottomSheetValue0, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState getAnchoredDraggableState$material_release() {
        return this.c;
    }

    @NotNull
    public final AnimationSpec getAnimationSpec$material_release() {
        return this.a;
    }

    @NotNull
    public final ModalBottomSheetValue getCurrentValue() {
        return (ModalBottomSheetValue)this.c.getCurrentValue();
    }

    @Nullable
    public final Density getDensity$material_release() {
        return this.d;
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return this.c.getAnchors().hasAnchorFor(ModalBottomSheetValue.HalfExpanded);
    }

    @FloatRange(from = 0.0, to = 1.0)
    public final float getProgress() {
        return this.c.getProgress();
    }

    @ExperimentalMaterialApi
    public static void getProgress$annotations() {
    }

    @NotNull
    public final ModalBottomSheetValue getTargetValue() {
        return (ModalBottomSheetValue)this.c.getTargetValue();
    }

    @Nullable
    public final Object halfExpand$material_release(@NotNull Continuation continuation0) {
        if(!this.getHasHalfExpandedState$material_release()) {
            return Unit.INSTANCE;
        }
        Object object0 = ModalBottomSheetState.animateTo$material_release$default(this, ModalBottomSheetValue.HalfExpanded, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object hide(@NotNull Continuation continuation0) {
        Object object0 = ModalBottomSheetState.animateTo$material_release$default(this, ModalBottomSheetValue.Hidden, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final boolean isSkipHalfExpanded$material_release() {
        return this.b;
    }

    public final boolean isVisible() {
        return this.c.getCurrentValue() != ModalBottomSheetValue.Hidden;
    }

    public final float requireOffset$material_release() {
        return this.c.requireOffset();
    }

    public final void setDensity$material_release(@Nullable Density density0) {
        this.d = density0;
    }

    @Nullable
    public final Object show(@NotNull Continuation continuation0) {
        Object object0 = ModalBottomSheetState.animateTo$material_release$default(this, (this.getHasHalfExpandedState$material_release() ? ModalBottomSheetValue.HalfExpanded : ModalBottomSheetValue.Expanded), 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo$material_release(@NotNull ModalBottomSheetValue modalBottomSheetValue0, @NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.snapTo(this.c, modalBottomSheetValue0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

