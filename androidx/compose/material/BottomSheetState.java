package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
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
import m0.b0;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.r;
import qd.a;

@ExperimentalMaterialApi
@Stable
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B7\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\fH\u0086@¢\u0006\u0004\b\u000F\u0010\u000EJ\r\u0010\u0010\u001A\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0016\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u0005H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\u0002H\u0080@¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00020\u001A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER$\u0010\'\u001A\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001A\u0010+\u001A\u00020\u00058GX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001A\u0004\b(\u0010\u0011R\u001A\u0010.\u001A\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010*\u001A\u0004\b,\u0010\u0011R\u0011\u00101\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b/\u00100R\u0011\u00103\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b2\u00100R\u0011\u00104\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b4\u00105R\u0011\u00106\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b6\u00105¨\u00068"}, d2 = {"Landroidx/compose/material/BottomSheetState;", "", "Landroidx/compose/material/BottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "<init>", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "", "expand", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collapse", "requireOffset", "()F", "target", "velocity", "animateTo$material_release", "(Landroidx/compose/material/BottomSheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "snapTo$material_release", "(Landroidx/compose/material/BottomSheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "Landroidx/compose/material/AnchoredDraggableState;", "a", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/ui/unit/Density;", "b", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "getProgress", "getProgress$annotations", "()V", "progress", "getOffset", "getOffset$annotations", "offset", "getCurrentValue", "()Landroidx/compose/material/BottomSheetValue;", "currentValue", "getTargetValue", "targetValue", "isExpanded", "()Z", "isCollapsed", "Companion", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BottomSheetState {
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001JA\u0010\r\u001A\f\u0012\u0004\u0012\u00020\f\u0012\u0002\b\u00030\u000B2\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\r\u0010\u000EJ;\u0010\r\u001A\f\u0012\u0004\u0012\u00020\f\u0012\u0002\b\u00030\u000B2\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/BottomSheetState$Companion;", "", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Landroidx/compose/material/BottomSheetValue;", "", "confirmStateChange", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomSheetState;", "Saver", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/unit/Density;)Landroidx/compose/runtime/saveable/Saver;", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Deprecated(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @ReplaceWith(expression = "Saver(animationSpec, confirmStateChange, density)", imports = {}))
        @NotNull
        public final Saver Saver(@NotNull AnimationSpec animationSpec0, @NotNull Function1 function10) {
            m m0 = new m(animationSpec0, function10);
            return SaverKt.Saver(l.w, m0);
        }

        @NotNull
        public final Saver Saver(@NotNull AnimationSpec animationSpec0, @NotNull Function1 function10, @NotNull Density density0) {
            k k0 = new k(animationSpec0, function10, density0);
            return SaverKt.Saver(j.w, k0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AnchoredDraggableState a;
    public Density b;

    static {
        BottomSheetState.Companion = new Companion(null);
    }

    @Deprecated(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @ReplaceWith(expression = "\n            BottomSheetState(\n                initialValue = initialValue,\n                density = LocalDensity.current,\n                animationSpec = animationSpec,\n                confirmValueChange = confirmValueChange\n            )\n            ", imports = {}))
    public BottomSheetState(@NotNull BottomSheetValue bottomSheetValue0, @NotNull AnimationSpec animationSpec0, @NotNull Function1 function10) {
        this.a = new AnchoredDraggableState(bottomSheetValue0, new b0(this, 18), new e(this, 4), animationSpec0, function10);
    }

    public BottomSheetState(BottomSheetValue bottomSheetValue0, AnimationSpec animationSpec0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            animationSpec0 = AnchoredDraggableDefaults.INSTANCE.getAnimationSpec();
        }
        if((v & 4) != 0) {
            function10 = r.C;
        }
        this(bottomSheetValue0, animationSpec0, function10);
    }

    public static final Density access$requireDensity(BottomSheetState bottomSheetState0) {
        Density density0 = bottomSheetState0.b;
        if(density0 == null) {
            throw new IllegalArgumentException(("The density on BottomSheetState (" + bottomSheetState0 + ") was not set. Did you use BottomSheetState with the BottomSheetScaffold composable?").toString());
        }
        return density0;
    }

    @Nullable
    public final Object animateTo$material_release(@NotNull BottomSheetValue bottomSheetValue0, float f, @NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.animateTo(this.a, bottomSheetValue0, f, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object animateTo$material_release$default(BottomSheetState bottomSheetState0, BottomSheetValue bottomSheetValue0, float f, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            f = bottomSheetState0.a.getLastVelocity();
        }
        return bottomSheetState0.animateTo$material_release(bottomSheetValue0, f, continuation0);
    }

    @Nullable
    public final Object collapse(@NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.animateTo$default(this.a, BottomSheetValue.Collapsed, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object expand(@NotNull Continuation continuation0) {
        BottomSheetValue bottomSheetValue0 = this.a.getAnchors().hasAnchorFor(BottomSheetValue.Expanded) ? BottomSheetValue.Expanded : BottomSheetValue.Collapsed;
        Object object0 = AnchoredDraggableKt.animateTo$default(this.a, bottomSheetValue0, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState getAnchoredDraggableState$material_release() {
        return this.a;
    }

    @NotNull
    public final BottomSheetValue getCurrentValue() {
        return (BottomSheetValue)this.a.getCurrentValue();
    }

    @Nullable
    public final Density getDensity$material_release() {
        return this.b;
    }

    public final float getOffset() {
        throw new IllegalStateException("Use requireOffset() to access the offset.");
    }

    @Deprecated(message = "Use requireOffset() to access the offset.", replaceWith = @ReplaceWith(expression = "requireOffset()", imports = {}))
    public static void getOffset$annotations() {
    }

    @FloatRange(from = 0.0, to = 1.0)
    public final float getProgress() {
        return this.a.getProgress();
    }

    @ExperimentalMaterialApi
    public static void getProgress$annotations() {
    }

    @NotNull
    public final BottomSheetValue getTargetValue() {
        return (BottomSheetValue)this.a.getTargetValue();
    }

    public final boolean isCollapsed() {
        return this.a.getCurrentValue() == BottomSheetValue.Collapsed;
    }

    public final boolean isExpanded() {
        return this.a.getCurrentValue() == BottomSheetValue.Expanded;
    }

    public final float requireOffset() {
        return this.a.requireOffset();
    }

    public final void setDensity$material_release(@Nullable Density density0) {
        this.b = density0;
    }

    @Nullable
    public final Object snapTo$material_release(@NotNull BottomSheetValue bottomSheetValue0, @NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.snapTo(this.a, bottomSheetValue0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

