package androidx.compose.foundation.gestures;

import aa.w;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z.b;
import z.h1;
import z.z;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A#\u0010\u0005\u001A\u00020\u00042\u0012\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007\u00A2\u0006\u0004\b\u0005\u0010\u0006\u001A#\u0010\u0007\u001A\u00020\u00042\u0012\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007\u00A2\u0006\u0004\b\u0007\u0010\b\u001A\u008F\u0001\u0010\u0018\u001A\u00020\t*\u00020\t2\u0006\u0010\n\u001A\u00020\u00042\b\b\u0002\u0010\f\u001A\u00020\u000B2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000F\u001A\u00020\u000B2#\b\u0002\u0010\u0013\u001A\u001D\u0012\u0013\u0012\u00110\u0001\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00020\u00002#\b\u0002\u0010\u0016\u001A\u001D\u0012\u0013\u0012\u00110\u0014\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0017\u001A\u00020\u000BH\u0007\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A\u00C5\u0001\u0010\u0018\u001A\u00020\t*\u00020\t2\u0006\u0010\n\u001A\u00020\u00042\b\b\u0002\u0010\f\u001A\u00020\u000B2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000F\u001A\u00020\u000B2>\b\u0002\u0010\u0013\u001A8\b\u0001\u0012\u0004\u0012\u00020\u001B\u0012\u0013\u0012\u00110\u0001\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001C\u0012\u0006\u0012\u0004\u0018\u00010\u001D0\u001A\u00A2\u0006\u0002\b\u001E2>\b\u0002\u0010\u0016\u001A8\b\u0001\u0012\u0004\u0012\u00020\u001B\u0012\u0013\u0012\u00110\u0014\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001C\u0012\u0006\u0012\u0004\u0018\u00010\u001D0\u001A\u00A2\u0006\u0002\b\u001E2\b\b\u0002\u0010\u0017\u001A\u00020\u000BH\u0007\u00A2\u0006\u0004\b\u0018\u0010\u001F\u00A8\u0006 "}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onDelta", "Landroidx/compose/foundation/gestures/Draggable2DState;", "Draggable2DState", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/Draggable2DState;", "rememberDraggable2DState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/Draggable2DState;", "Landroidx/compose/ui/Modifier;", "state", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/ParameterName;", "name", "startedPosition", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "reverseDirection", "draggable2D", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Draggable2DState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/ui/Modifier;", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Draggable2DState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDraggable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,509:1\n1223#2,6:510\n*S KotlinDebug\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n*L\n123#1:510,6\n*E\n"})
public final class Draggable2DKt {
    public static final h1 a;
    public static final b b;
    public static final h1 c;
    public static final b d;

    static {
        Draggable2DKt.a = new h1(3, 0, null);
        Draggable2DKt.b = b.G;
        Draggable2DKt.c = new h1(3, 1, null);
        Draggable2DKt.d = b.H;
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Draggable2DState Draggable2DState(@NotNull Function1 function10) {
        return new z(function10);
    }

    @ExperimentalFoundationApi
    @Stable
    @NotNull
    public static final Modifier draggable2D(@NotNull Modifier modifier0, @NotNull Draggable2DState draggable2DState0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, boolean z1, @NotNull Function1 function10, @NotNull Function1 function11, boolean z2) {
        return modifier0.then(new Draggable2DElement(draggable2DState0, z, mutableInteractionSource0, z1, function10, function11, z2));
    }

    @ExperimentalFoundationApi
    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use overload without the suspend onDragStarted onDragStopped and callbacks")
    public static final Modifier draggable2D(Modifier modifier0, Draggable2DState draggable2DState0, boolean z, MutableInteractionSource mutableInteractionSource0, boolean z1, Function3 function30, Function3 function31, boolean z2) {
        return modifier0.then(new Draggable2DCompatElement(draggable2DState0, z, mutableInteractionSource0, z1, function30, function31, z2));
    }

    public static Modifier draggable2D$default(Modifier modifier0, Draggable2DState draggable2DState0, boolean z, MutableInteractionSource mutableInteractionSource0, boolean z1, Function1 function10, Function1 function11, boolean z2, int v, Object object0) {
        boolean z3 = false;
        Function1 function12 = (v & 16) == 0 ? function10 : Draggable2DKt.b;
        Function1 function13 = (v & 0x20) == 0 ? function11 : Draggable2DKt.d;
        if((v & 0x40) == 0) {
            z3 = z2;
        }
        return Draggable2DKt.draggable2D(modifier0, draggable2DState0, ((v & 2) == 0 ? z : true), ((v & 4) == 0 ? mutableInteractionSource0 : null), ((v & 8) == 0 ? z1 : false), function12, function13, z3);
    }

    public static Modifier draggable2D$default(Modifier modifier0, Draggable2DState draggable2DState0, boolean z, MutableInteractionSource mutableInteractionSource0, boolean z1, Function3 function30, Function3 function31, boolean z2, int v, Object object0) {
        boolean z3 = false;
        Function3 function32 = (v & 16) == 0 ? function30 : Draggable2DKt.a;
        Function3 function33 = (v & 0x20) == 0 ? function31 : Draggable2DKt.c;
        if((v & 0x40) == 0) {
            z3 = z2;
        }
        return Draggable2DKt.draggable2D(modifier0, draggable2DState0, ((v & 2) == 0 ? z : true), ((v & 4) == 0 ? mutableInteractionSource0 : null), ((v & 8) == 0 ? z1 : false), function32, function33, z3);
    }

    @ExperimentalFoundationApi
    @Composable
    @NotNull
    public static final Draggable2DState rememberDraggable2DState(@NotNull Function1 function10, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBB702811, v, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:120)");
        }
        State state0 = SnapshotStateKt.rememberUpdatedState(function10, composer0, v & 14);
        Draggable2DState draggable2DState0 = composer0.rememberedValue();
        if(draggable2DState0 == Composer.Companion.getEmpty()) {
            draggable2DState0 = Draggable2DKt.Draggable2DState(new w(state0, 20));
            composer0.updateRememberedValue(draggable2DState0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return draggable2DState0;
    }
}

