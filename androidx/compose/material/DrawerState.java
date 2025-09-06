package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.r;
import p0.x3;
import qd.a;

@Stable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001A\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\u000BJ&\u0010\u0011\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\u00022\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EH\u0087@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\u0002H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0017\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR$\u0010%\u001A\u0004\u0018\u00010\u001E8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001A\u0010\r\u001A\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010)\u001A\u0004\b&\u0010\'R\u001A\u0010,\u001A\u00020\u000F8GX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010)\u001A\u0004\b*\u0010\u0016R\u0011\u0010-\u001A\u00020\u00058F¢\u0006\u0006\u001A\u0004\b-\u0010.R\u0011\u0010/\u001A\u00020\u00058F¢\u0006\u0006\u001A\u0004\b/\u0010.R\u0011\u00101\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b0\u0010\'R\u0011\u00102\u001A\u00020\u00058F¢\u0006\u0006\u001A\u0004\b2\u0010.¨\u00064"}, d2 = {"Landroidx/compose/material/DrawerState;", "", "Landroidx/compose/material/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;)V", "", "open", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "anim", "animateTo", "(Landroidx/compose/material/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Landroidx/compose/material/DrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requireOffset$material_release", "()F", "requireOffset", "Landroidx/compose/material/AnchoredDraggableState;", "a", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/ui/unit/Density;", "b", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "getTargetValue", "()Landroidx/compose/material/DrawerValue;", "getTargetValue$annotations", "()V", "getOffset", "getOffset$annotations", "offset", "isOpen", "()Z", "isClosed", "getCurrentValue", "currentValue", "isAnimationRunning", "Companion", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DrawerState {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/material/DrawerState$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/material/DrawerValue;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DrawerState;", "Saver", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver Saver(@NotNull Function1 function10) {
            t t0 = new t(function10);
            return SaverKt.Saver(s.w, t0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AnchoredDraggableState a;
    public Density b;

    static {
        DrawerState.Companion = new Companion(null);
    }

    public DrawerState(@NotNull DrawerValue drawerValue0, @NotNull Function1 function10) {
        this.a = new AnchoredDraggableState(drawerValue0, new x3(this, 1), new e(this, 5), DrawerKt.d, function10);
    }

    public DrawerState(DrawerValue drawerValue0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function10 = r.F;
        }
        this(drawerValue0, function10);
    }

    public static final Density access$requireDensity(DrawerState drawerState0) {
        Density density0 = drawerState0.b;
        if(density0 == null) {
            throw new IllegalArgumentException(("The density on DrawerState (" + drawerState0 + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
        }
        return density0;
    }

    @ExperimentalMaterialApi
    @Deprecated(level = DeprecationLevel.ERROR, message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    @Nullable
    public final Object animateTo(@NotNull DrawerValue drawerValue0, @NotNull AnimationSpec animationSpec0, @NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.animateTo$default(this.a, drawerValue0, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object close(@NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.animateTo$default(this.a, DrawerValue.Closed, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState getAnchoredDraggableState$material_release() {
        return this.a;
    }

    @NotNull
    public final DrawerValue getCurrentValue() {
        return (DrawerValue)this.a.getCurrentValue();
    }

    @Nullable
    public final Density getDensity$material_release() {
        return this.b;
    }

    @ExperimentalMaterialApi
    public final float getOffset() {
        return this.a.getOffset();
    }

    @ExperimentalMaterialApi
    public static void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    @NotNull
    public final DrawerValue getTargetValue() {
        return (DrawerValue)this.a.getTargetValue();
    }

    @ExperimentalMaterialApi
    public static void getTargetValue$annotations() {
    }

    public final boolean isAnimationRunning() {
        return this.a.isAnimationRunning();
    }

    public final boolean isClosed() {
        return this.getCurrentValue() == DrawerValue.Closed;
    }

    public final boolean isOpen() {
        return this.getCurrentValue() == DrawerValue.Open;
    }

    @Nullable
    public final Object open(@NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.animateTo$default(this.a, DrawerValue.Open, 0.0f, continuation0, 2, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final float requireOffset$material_release() {
        return this.a.requireOffset();
    }

    public final void setDensity$material_release(@Nullable Density density0) {
        this.b = density0;
    }

    @Nullable
    public final Object snapTo(@NotNull DrawerValue drawerValue0, @NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.snapTo(this.a, drawerValue0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

