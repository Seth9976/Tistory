package androidx.compose.foundation.gestures;

import aa.w;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z.b0;
import z.h1;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A!\u0010\u0005\u001A\u00020\u00042\u0012\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A#\u0010\u0007\u001A\u00020\u00042\u0012\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001AÍ\u0001\u0010\u001F\u001A\u00020\t*\u00020\t2\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0011\u001A\u00020\r2>\b\u0002\u0010\u001B\u001A8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001A2>\b\u0002\u0010\u001D\u001A8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001C\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001A2\b\b\u0002\u0010\u001E\u001A\u00020\rH\u0007¢\u0006\u0004\b\u001F\u0010 ¨\u0006!"}, d2 = {"Lkotlin/Function1;", "", "", "onDelta", "Landroidx/compose/foundation/gestures/DraggableState;", "DraggableState", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/DraggableState;", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "velocity", "onDragStopped", "reverseDirection", "draggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,649:1\n1223#2,6:650\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n139#1:650,6\n*E\n"})
public final class DraggableKt {
    public static final h1 a;
    public static final h1 b;

    static {
        DraggableKt.a = new h1(3, 2, null);
        DraggableKt.b = new h1(3, 3, null);
    }

    @NotNull
    public static final DraggableState DraggableState(@NotNull Function1 function10) {
        return new b0(function10);
    }

    public static final float access$toFloat-3MmeM6k(long v, Orientation orientation0) {
        return orientation0 == Orientation.Vertical ? Offset.getY-impl(v) : Offset.getX-impl(v);
    }

    public static final float access$toFloat-sF-c-tU(long v, Orientation orientation0) {
        return orientation0 == Orientation.Vertical ? Velocity.getY-impl(v) : Velocity.getX-impl(v);
    }

    public static final long access$toValidVelocity-TH1AsA0(long v) {
        float f = 0.0f;
        float f1 = Float.isNaN(Velocity.getX-impl(v)) ? 0.0f : Velocity.getX-impl(v);
        if(!Float.isNaN(Velocity.getY-impl(v))) {
            f = Velocity.getY-impl(v);
        }
        return VelocityKt.Velocity(f1, f);
    }

    @Stable
    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier0, @NotNull DraggableState draggableState0, @NotNull Orientation orientation0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, boolean z1, @NotNull Function3 function30, @NotNull Function3 function31, boolean z2) {
        return modifier0.then(new DraggableElement(draggableState0, orientation0, z, mutableInteractionSource0, z1, function30, function31, z2));
    }

    public static Modifier draggable$default(Modifier modifier0, DraggableState draggableState0, Orientation orientation0, boolean z, MutableInteractionSource mutableInteractionSource0, boolean z1, Function3 function30, Function3 function31, boolean z2, int v, Object object0) {
        boolean z3 = (v & 4) == 0 ? z : true;
        MutableInteractionSource mutableInteractionSource1 = (v & 8) == 0 ? mutableInteractionSource0 : null;
        boolean z4 = (v & 16) == 0 ? z1 : false;
        Function3 function32 = (v & 0x20) == 0 ? function30 : DraggableKt.a;
        if((v & 0x40) != 0) {
            return (v & 0x80) == 0 ? DraggableKt.draggable(modifier0, draggableState0, orientation0, z3, mutableInteractionSource1, z4, function32, DraggableKt.b, z2) : DraggableKt.draggable(modifier0, draggableState0, orientation0, z3, mutableInteractionSource1, z4, function32, DraggableKt.b, false);
        }
        return (v & 0x80) == 0 ? DraggableKt.draggable(modifier0, draggableState0, orientation0, z3, mutableInteractionSource1, z4, function32, function31, z2) : DraggableKt.draggable(modifier0, draggableState0, orientation0, z3, mutableInteractionSource1, z4, function32, function31, false);
    }

    @Composable
    @NotNull
    public static final DraggableState rememberDraggableState(@NotNull Function1 function10, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF513E663, v, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:136)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(function10, composer0, v & 14);
        DraggableState draggableState0 = composer0.rememberedValue();
        if(draggableState0 == Composer.Companion.getEmpty()) {
            draggableState0 = DraggableKt.DraggableState(new w(state0, 21));
            composer0.updateRememberedValue(draggableState0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return draggableState0;
    }
}

