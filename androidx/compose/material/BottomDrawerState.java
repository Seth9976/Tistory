package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.c1;
import p0.r;
import qd.a;

@ExperimentalMaterialApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB\'\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\f\u001A\u00020\tH\u0000\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\u000E\u001A\u00020\rH\u0086@\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\rH\u0086@\u00A2\u0006\u0004\b\u0010\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\rH\u0086@\u00A2\u0006\u0004\b\u0011\u0010\u000FJ\"\u0010\u0016\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\tH\u0080@\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\u0002H\u0080@\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u001A\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CR \u0010\"\u001A\b\u0012\u0004\u0012\u00020\u00020\u001D8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\u001A\u0010(\u001A\u00020#8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R$\u00100\u001A\u0004\u0018\u00010)8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0017\u00104\u001A\u00020\t8F\u00A2\u0006\f\u0012\u0004\b2\u00103\u001A\u0004\b1\u0010\u000BR\u001A\u00107\u001A\u00020\t8GX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b6\u00103\u001A\u0004\b5\u0010\u000BR\u0011\u0010:\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b8\u00109R\u0011\u0010<\u001A\u00020\u00028F\u00A2\u0006\u0006\u001A\u0004\b;\u00109R\u0011\u0010=\u001A\u00020\u00058F\u00A2\u0006\u0006\u001A\u0004\b=\u0010>R\u0011\u0010?\u001A\u00020\u00058F\u00A2\u0006\u0006\u001A\u0004\b?\u0010>R\u0011\u0010@\u001A\u00020\u00058F\u00A2\u0006\u0006\u001A\u0004\b@\u0010>\u00A8\u0006B"}, d2 = {"Landroidx/compose/material/BottomDrawerState;", "", "Landroidx/compose/material/BottomDrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;)V", "", "requireOffset$material_release", "()F", "requireOffset", "", "open", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "expand", "target", "velocity", "animateTo$material_release", "(Landroidx/compose/material/BottomDrawerValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "snapTo$material_release", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "value", "confirmStateChange$material_release", "(Landroidx/compose/material/BottomDrawerValue;)Z", "Landroidx/compose/material/AnchoredDraggableState;", "a", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "b", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/ui/unit/Density;", "c", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "getOffset", "getOffset$annotations", "()V", "offset", "getProgress", "getProgress$annotations", "progress", "getTargetValue", "()Landroidx/compose/material/BottomDrawerValue;", "targetValue", "getCurrentValue", "currentValue", "isOpen", "()Z", "isClosed", "isExpanded", "Companion", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BottomDrawerState {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J5\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000BJ/\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/material/BottomDrawerState$Companion;", "", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function1;", "Landroidx/compose/material/BottomDrawerValue;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomDrawerState;", "Saver", "(Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver Saver(@NotNull Density density0, @NotNull Function1 function10) {
            f f0 = new f(density0, function10);
            return SaverKt.Saver(e.w, f0);
        }

        @Deprecated(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @ReplaceWith(expression = "Saver(density, confirmValueChange)", imports = {}))
        @NotNull
        public final Saver Saver(@NotNull Function1 function10) {
            h h0 = new h(function10);
            return SaverKt.Saver(g.w, h0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AnchoredDraggableState a;
    public final NestedScrollConnection b;
    public Density c;

    static {
        BottomDrawerState.Companion = new Companion(null);
        BottomDrawerState.$stable = 8;
    }

    @Deprecated(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @ReplaceWith(expression = "\n            BottomDrawerState(\n                initialValue = initialValue,\n                density =,\n                confirmStateChange = confirmStateChange\n            )\n            ", imports = {}))
    public BottomDrawerState(@NotNull BottomDrawerValue bottomDrawerValue0, @NotNull Function1 function10) {
        AnchoredDraggableState anchoredDraggableState0 = new AnchoredDraggableState(bottomDrawerValue0, new c1(this, 0), new o0.e(this, 2), DrawerKt.access$getAnimationSpec$p(), function10);
        this.a = anchoredDraggableState0;
        this.b = DrawerKt.access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(anchoredDraggableState0);
    }

    public BottomDrawerState(BottomDrawerValue bottomDrawerValue0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function10 = r.A;
        }
        this(bottomDrawerValue0, function10);
    }

    public static final Density access$requireDensity(BottomDrawerState bottomDrawerState0) {
        Density density0 = bottomDrawerState0.c;
        if(density0 == null) {
            throw new IllegalArgumentException(("The density on BottomDrawerState (" + bottomDrawerState0 + ") was not set. Did you use BottomDrawer with the BottomDrawer composable?").toString());
        }
        return density0;
    }

    @Nullable
    public final Object animateTo$material_release(@NotNull BottomDrawerValue bottomDrawerValue0, float f, @NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.animateTo(this.a, bottomDrawerValue0, f, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object animateTo$material_release$default(BottomDrawerState bottomDrawerState0, BottomDrawerValue bottomDrawerValue0, float f, Continuation continuation0, int v, Object object0) {
        if((v & 2) != 0) {
            f = bottomDrawerState0.a.getLastVelocity();
        }
        return bottomDrawerState0.animateTo$material_release(bottomDrawerValue0, f, continuation0);
    }

    @Nullable
    public final Object close(@NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.animateTo$default(this.a, BottomDrawerValue.Closed, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final boolean confirmStateChange$material_release(@NotNull BottomDrawerValue bottomDrawerValue0) {
        return ((Boolean)this.a.getConfirmValueChange$material_release().invoke(bottomDrawerValue0)).booleanValue();
    }

    @Nullable
    public final Object expand(@NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.animateTo$default(this.a, BottomDrawerValue.Expanded, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState getAnchoredDraggableState$material_release() {
        return this.a;
    }

    @NotNull
    public final BottomDrawerValue getCurrentValue() {
        return (BottomDrawerValue)this.a.getCurrentValue();
    }

    @Nullable
    public final Density getDensity$material_release() {
        return this.c;
    }

    @NotNull
    public final NestedScrollConnection getNestedScrollConnection$material_release() {
        return this.b;
    }

    public final float getOffset() {
        return this.a.getOffset();
    }

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
    public final BottomDrawerValue getTargetValue() {
        return (BottomDrawerValue)this.a.getTargetValue();
    }

    public final boolean isClosed() {
        return this.a.getCurrentValue() == BottomDrawerValue.Closed;
    }

    public final boolean isExpanded() {
        return this.a.getCurrentValue() == BottomDrawerValue.Expanded;
    }

    public final boolean isOpen() {
        return this.a.getCurrentValue() != BottomDrawerValue.Closed;
    }

    @Nullable
    public final Object open(@NotNull Continuation continuation0) {
        BottomDrawerValue bottomDrawerValue0 = this.a.getAnchors().hasAnchorFor(BottomDrawerValue.Open) ? BottomDrawerValue.Open : BottomDrawerValue.Expanded;
        Object object0 = AnchoredDraggableKt.animateTo$default(this.a, bottomDrawerValue0, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final float requireOffset$material_release() {
        return this.a.requireOffset();
    }

    public final void setDensity$material_release(@Nullable Density density0) {
        this.c = density0;
    }

    @Nullable
    public final Object snapTo$material_release(@NotNull BottomDrawerValue bottomDrawerValue0, @NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.snapTo(this.a, bottomDrawerValue0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

