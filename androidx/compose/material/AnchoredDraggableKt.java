package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.b5;
import p0.g;
import p0.i;
import p0.k;
import p0.l;
import p0.p;
import p0.q;
import qd.a;

@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\u001A>\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001D\u0010\u0006\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001AY\u0010\u0015\u001A\u00020\n\"\u0004\b\u0000\u0010\u0001*\u00020\n2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u000B2\u0006\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0011\u001A\u00020\u000F2\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001A\u00020\u000FH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001A(\u0010\u0018\u001A\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000B2\u0006\u0010\u0017\u001A\u00028\u0000H\u0081@¢\u0006\u0004\b\u0018\u0010\u0019\u001A2\u0010\u001C\u001A\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000B2\u0006\u0010\u0017\u001A\u00028\u00002\b\b\u0002\u0010\u001B\u001A\u00020\u001AH\u0081@¢\u0006\u0004\b\u001C\u0010\u001D¨\u0006\u001E"}, d2 = {"", "T", "Lkotlin/Function1;", "Landroidx/compose/material/DraggableAnchorsConfig;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/compose/material/DraggableAnchors;", "DraggableAnchors", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/material/DraggableAnchors;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "anchoredDraggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Z)Landroidx/compose/ui/Modifier;", "targetValue", "snapTo", "(Landroidx/compose/material/AnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "velocity", "animateTo", "(Landroidx/compose/material/AnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AnchoredDraggableKt {
    @ExperimentalMaterialApi
    @NotNull
    public static final DraggableAnchors DraggableAnchors(@NotNull Function1 function10) {
        DraggableAnchorsConfig draggableAnchorsConfig0 = new DraggableAnchorsConfig();
        function10.invoke(draggableAnchorsConfig0);
        return new b5(draggableAnchorsConfig0.getAnchors$material_release());
    }

    public static final b5 access$emptyDraggableAnchors() {
        return new b5(x.emptyMap());
    }

    public static final Object access$restartable(Function0 function00, Function2 function20, Continuation continuation0) {
        l l0;
        if(continuation0 instanceof l) {
            l0 = (l)continuation0;
            int v = l0.p;
            if((v & 0x80000000) == 0) {
                l0 = new l(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                l0.p = v ^ 0x80000000;
            }
        }
        else {
            l0 = new l(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = l0.o;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(l0.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    p p0 = new p(function00, function20, null);
                    l0.p = 1;
                    return CoroutineScopeKt.coroutineScope(p0, l0) != unit0 ? Unit.INSTANCE : unit0;
                }
                catch(g unused_ex) {
                    return Unit.INSTANCE;
                }
            }
            case 1: {
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(g unused_ex) {
                }
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @ExperimentalMaterialApi
    @NotNull
    public static final Modifier anchoredDraggable(@NotNull Modifier modifier0, @NotNull AnchoredDraggableState anchoredDraggableState0, @NotNull Orientation orientation0, boolean z, boolean z1, @Nullable MutableInteractionSource mutableInteractionSource0, boolean z2) {
        return DraggableKt.draggable$default(modifier0, anchoredDraggableState0.getDraggableState$material_release(), orientation0, z, mutableInteractionSource0, z2, null, new i(0, anchoredDraggableState0, null), z1, 0x20, null);
    }

    public static Modifier anchoredDraggable$default(Modifier modifier0, AnchoredDraggableState anchoredDraggableState0, Orientation orientation0, boolean z, boolean z1, MutableInteractionSource mutableInteractionSource0, boolean z2, int v, Object object0) {
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            z1 = false;
        }
        if((v & 16) != 0) {
            mutableInteractionSource0 = null;
        }
        if((v & 0x20) != 0) {
            z2 = anchoredDraggableState0.isAnimationRunning();
        }
        return AnchoredDraggableKt.anchoredDraggable(modifier0, anchoredDraggableState0, orientation0, z, z1, mutableInteractionSource0, z2);
    }

    @ExperimentalMaterialApi
    @Nullable
    public static final Object animateTo(@NotNull AnchoredDraggableState anchoredDraggableState0, Object object0, float f, @NotNull Continuation continuation0) {
        Object object1 = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState0, object0, null, new k(anchoredDraggableState0, f, null), continuation0, 2, null);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    public static Object animateTo$default(AnchoredDraggableState anchoredDraggableState0, Object object0, float f, Continuation continuation0, int v, Object object1) {
        if((v & 2) != 0) {
            f = anchoredDraggableState0.getLastVelocity();
        }
        return AnchoredDraggableKt.animateTo(anchoredDraggableState0, object0, f, continuation0);
    }

    @ExperimentalMaterialApi
    @Nullable
    public static final Object snapTo(@NotNull AnchoredDraggableState anchoredDraggableState0, Object object0, @NotNull Continuation continuation0) {
        Object object1 = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState0, object0, null, new q(4, 0, null), continuation0, 2, null);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }
}

