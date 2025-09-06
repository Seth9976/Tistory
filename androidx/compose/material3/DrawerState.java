package androidx.compose.material3;

import a2.b;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Stable
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001A\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\u000BJ&\u0010\u0011\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\u00022\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EH\u0087@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\u0002H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0017\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR&\u0010%\u001A\b\u0012\u0004\u0012\u00020\u000F0\u001E8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001F\u0010 \u0012\u0004\b#\u0010$\u001A\u0004\b!\u0010\"R/\u0010.\u001A\u0004\u0018\u00010&2\b\u0010\'\u001A\u0004\u0018\u00010&8@@@X\u0080\u008E\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0011\u0010/\u001A\u00020\u00058F¢\u0006\u0006\u001A\u0004\b/\u00100R\u0011\u00101\u001A\u00020\u00058F¢\u0006\u0006\u001A\u0004\b1\u00100R\u0011\u00104\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b2\u00103R\u0011\u00105\u001A\u00020\u00058F¢\u0006\u0006\u001A\u0004\b5\u00100R\u0011\u0010\r\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b6\u00103R\u0011\u00108\u001A\u00020\u000F8F¢\u0006\u0006\u001A\u0004\b7\u0010\u0016¨\u0006:"}, d2 = {"Landroidx/compose/material3/DrawerState;", "", "Landroidx/compose/material3/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;)V", "", "open", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "anim", "animateTo", "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Landroidx/compose/material3/DrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requireOffset$material3_release", "()F", "requireOffset", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "a", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "getAnchoredDraggableState$material3_release", "()Landroidx/compose/material3/internal/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/runtime/State;", "b", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "getOffset$annotations", "()V", "offset", "Landroidx/compose/ui/unit/Density;", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getDensity$material3_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material3_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "isOpen", "()Z", "isClosed", "getCurrentValue", "()Landroidx/compose/material3/DrawerValue;", "currentValue", "isAnimationRunning", "getTargetValue", "getCurrentOffset", "currentOffset", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1161:1\n81#2:1162\n107#2,2:1163\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n*L\n235#1:1162\n235#1:1163,2\n*E\n"})
public final class DrawerState {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/material3/DrawerState$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/material3/DrawerValue;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DrawerState;", "Saver", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver Saver(@NotNull Function1 function10) {
            a9 a90 = new a9(function10);
            return SaverKt.Saver(z8.w, a90);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AnchoredDraggableState a;
    public final androidx.compose.material3.DrawerState.offset.1 b;
    public final MutableState c;

    static {
        DrawerState.Companion = new Companion(null);
    }

    public DrawerState(@NotNull DrawerValue drawerValue0, @NotNull Function1 function10) {
        b b0 = new b(this, 8);
        this.a = new AnchoredDraggableState(drawerValue0, a5.L, b0, NavigationDrawerKt.access$getAnimationSpec$p(), function10);
        this.b = new State() {
            public final DrawerState a;

            {
                this.a = drawerState0;
            }

            @NotNull
            public Float getValue() {
                return this.a.getAnchoredDraggableState$material3_release().getOffset();
            }

            @Override  // androidx.compose.runtime.State
            public Object getValue() {
                return this.getValue();
            }
        };
        this.c = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public DrawerState(DrawerValue drawerValue0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function10 = a5.K;
        }
        this(drawerValue0, function10);
    }

    public static Object a(DrawerState drawerState0, DrawerValue drawerValue0, AnimationSpec animationSpec0, Continuation continuation0, int v) {
        if((v & 2) != 0) {
            animationSpec0 = NavigationDrawerKt.access$getAnimationSpec$p();
        }
        float f = drawerState0.a.getLastVelocity();
        drawerState0.getClass();
        c9 c90 = new c9(drawerState0, f, animationSpec0, null);
        Unit unit0 = AnchoredDraggableState.anchoredDrag$default(drawerState0.a, drawerValue0, null, c90, continuation0, 2, null);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static final Object access$animateTo(DrawerState drawerState0, DrawerValue drawerValue0, AnimationSpec animationSpec0, float f, Continuation continuation0) {
        drawerState0.getClass();
        c9 c90 = new c9(drawerState0, f, animationSpec0, null);
        Unit unit0 = AnchoredDraggableState.anchoredDrag$default(drawerState0.a, drawerValue0, null, c90, continuation0, 2, null);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static final Density access$requireDensity(DrawerState drawerState0) {
        Density density0 = drawerState0.getDensity$material3_release();
        if(density0 == null) {
            throw new IllegalArgumentException(("The density on DrawerState (" + drawerState0 + ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?").toString());
        }
        return density0;
    }

    @Deprecated(message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    @Nullable
    public final Object animateTo(@NotNull DrawerValue drawerValue0, @NotNull AnimationSpec animationSpec0, @NotNull Continuation continuation0) {
        Object object0 = DrawerState.a(this, drawerValue0, animationSpec0, continuation0, 4);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object close(@NotNull Continuation continuation0) {
        Object object0 = DrawerState.a(this, DrawerValue.Closed, null, continuation0, 6);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState getAnchoredDraggableState$material3_release() {
        return this.a;
    }

    public final float getCurrentOffset() {
        return this.a.getOffset();
    }

    @NotNull
    public final DrawerValue getCurrentValue() {
        return (DrawerValue)this.a.getCurrentValue();
    }

    @Nullable
    public final Density getDensity$material3_release() {
        return (Density)this.c.getValue();
    }

    @NotNull
    public final State getOffset() {
        return this.b;
    }

    @Deprecated(message = "Please access the offset through currentOffset, which returns the value directly instead of wrapping it in a state object.", replaceWith = @ReplaceWith(expression = "currentOffset", imports = {}))
    public static void getOffset$annotations() {
    }

    @NotNull
    public final DrawerValue getTargetValue() {
        return (DrawerValue)this.a.getTargetValue();
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
        Object object0 = DrawerState.a(this, DrawerValue.Open, null, continuation0, 6);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public final float requireOffset$material3_release() {
        return this.a.requireOffset();
    }

    public final void setDensity$material3_release(@Nullable Density density0) {
        this.c.setValue(density0);
    }

    @Nullable
    public final Object snapTo(@NotNull DrawerValue drawerValue0, @NotNull Continuation continuation0) {
        Object object0 = AnchoredDraggableKt.snapTo(this.a, drawerValue0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

