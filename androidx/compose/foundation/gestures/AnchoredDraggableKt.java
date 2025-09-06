package androidx.compose.foundation.gestures;

import androidx.collection.MutableObjectFloatMap;
import androidx.collection.ObjectFloatMap;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.q;
import qd.a;
import z.b;
import z.c;
import z.d;
import z.e;
import z.g;
import z.h;
import z.l;
import z.q1;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\u001Ac\u0010\u000E\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00042\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\r\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u000E\u0010\u000F\u001A[\u0010\u000E\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00042\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\r\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u000E\u0010\u0010\u001A>\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017\"\b\b\u0000\u0010\u0000*\u00020\u00112\u001D\u0010\u0016\u001A\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001A(\u0010\u001B\u001A\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001A\u001A\u00028\u0000H\u0087@¢\u0006\u0004\b\u001B\u0010\u001C\u001A(\u0010\u001D\u001A\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001A\u001A\u00028\u0000H\u0087@¢\u0006\u0004\b\u001D\u0010\u001C\u001A0\u0010 \u001A\u00020\u001E\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001A\u001A\u00028\u00002\u0006\u0010\u001F\u001A\u00020\u001EH\u0087@¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"T", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "state", "", "reverseDirection", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "startDragImmediately", "anchoredDraggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;ZLandroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Z)Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Z)Landroidx/compose/ui/Modifier;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DraggableAnchorsConfig;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "DraggableAnchors", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/DraggableAnchors;", "targetValue", "snapTo", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "", "velocity", "animateToWithDecay", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n+ 2 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1225:1\n1221#1,4:1226\n428#2,3:1230\n373#2,6:1233\n383#2,3:1240\n386#2,2:1244\n431#2,2:1246\n389#2,6:1248\n433#2:1254\n428#2,3:1255\n373#2,6:1258\n383#2,3:1265\n386#2,2:1269\n431#2,2:1271\n389#2,6:1273\n433#2:1279\n1810#3:1239\n1672#3:1243\n1810#3:1264\n1672#3:1268\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n*L\n996#1:1226,4\n1200#1:1230,3\n1200#1:1233,6\n1200#1:1240,3\n1200#1:1244,2\n1200#1:1246,2\n1200#1:1248,6\n1200#1:1254\n1211#1:1255,3\n1211#1:1258,6\n1211#1:1265,3\n1211#1:1269,2\n1211#1:1271,2\n1211#1:1273,6\n1211#1:1279\n1200#1:1239\n1200#1:1243\n1211#1:1264\n1211#1:1268\n*E\n"})
public final class AnchoredDraggableKt {
    public static final b a;

    static {
        AnchoredDraggableKt.a = b.x;
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final DraggableAnchors DraggableAnchors(@NotNull Function1 function10) {
        DraggableAnchorsConfig draggableAnchorsConfig0 = new DraggableAnchorsConfig();
        function10.invoke(draggableAnchorsConfig0);
        return new q1(draggableAnchorsConfig0.getAnchors$foundation_release());
    }

    public static final Object access$animateTo(AnchoredDraggableState anchoredDraggableState0, float f, AnchoredDragScope anchoredDragScope0, DraggableAnchors draggableAnchors0, Object object0, Continuation continuation0) {
        float f1 = draggableAnchors0.positionOf(object0);
        FloatRef ref$FloatRef0 = new FloatRef();
        ref$FloatRef0.element = Float.isNaN(anchoredDraggableState0.getOffset()) ? 0.0f : anchoredDraggableState0.getOffset();
        if(!Float.isNaN(f1)) {
            float f2 = ref$FloatRef0.element;
            if(f2 != f1) {
                Unit unit0 = SuspendAnimationKt.animate(f2, f1, f, anchoredDraggableState0.getSnapAnimationSpec(), new c(anchoredDragScope0, ref$FloatRef0), continuation0);
                return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    public static final float access$coerceToTarget(float f, float f1) {
        if(f1 != 0.0f) {
            return f1 > 0.0f ? kotlin.ranges.c.coerceAtMost(f, f1) : kotlin.ranges.c.coerceAtLeast(f, f1);
        }
        return 0.0f;
    }

    public static final q1 access$emptyDraggableAnchors() {
        return new q1(new MutableObjectFloatMap(0, 1, null));
    }

    public static final float access$maxValueOrNaN(ObjectFloatMap objectFloatMap0) {
        if(objectFloatMap0.getSize() == 1) {
            return NaNf;
        }
        float[] arr_f = objectFloatMap0.values;
        long[] arr_v = objectFloatMap0.metadata;
        int v = arr_v.length - 2;
        float f = -Infinityf;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            float f1 = arr_f[(v1 << 3) + v4];
                            if(f1 >= f) {
                                f = f1;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_21;
                    }
                    break;
                }
            label_21:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return f;
    }

    public static final float access$minValueOrNaN(ObjectFloatMap objectFloatMap0) {
        if(objectFloatMap0.getSize() == 1) {
            return NaNf;
        }
        float[] arr_f = objectFloatMap0.values;
        long[] arr_v = objectFloatMap0.metadata;
        int v = arr_v.length - 2;
        float f = Infinityf;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            float f1 = arr_f[(v1 << 3) + v4];
                            if(f1 <= f) {
                                f = f1;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_21;
                    }
                    break;
                }
            label_21:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return f;
    }

    public static final Object access$restartable(Function0 function00, Function2 function20, Continuation continuation0) {
        h h0;
        if(continuation0 instanceof h) {
            h0 = (h)continuation0;
            int v = h0.p;
            if((v & 0x80000000) == 0) {
                h0 = new h(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                h0.p = v ^ 0x80000000;
            }
        }
        else {
            h0 = new h(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = h0.o;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(h0.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    l l0 = new l(function00, function20, null);
                    h0.p = 1;
                    return CoroutineScopeKt.coroutineScope(l0, h0) != unit0 ? Unit.INSTANCE : unit0;
                }
                catch(z.a unused_ex) {
                    return Unit.INSTANCE;
                }
            }
            case 1: {
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(z.a unused_ex) {
                }
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier anchoredDraggable(@NotNull Modifier modifier0, @NotNull AnchoredDraggableState anchoredDraggableState0, @NotNull Orientation orientation0, boolean z, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable OverscrollEffect overscrollEffect0, boolean z1) {
        return modifier0.then(new AnchoredDraggableElement(anchoredDraggableState0, orientation0, z, null, mutableInteractionSource0, z1, overscrollEffect0));
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier anchoredDraggable(@NotNull Modifier modifier0, @NotNull AnchoredDraggableState anchoredDraggableState0, boolean z, @NotNull Orientation orientation0, boolean z1, @Nullable MutableInteractionSource mutableInteractionSource0, @Nullable OverscrollEffect overscrollEffect0, boolean z2) {
        return modifier0.then(new AnchoredDraggableElement(anchoredDraggableState0, orientation0, z1, Boolean.valueOf(z), mutableInteractionSource0, z2, overscrollEffect0));
    }

    public static Modifier anchoredDraggable$default(Modifier modifier0, AnchoredDraggableState anchoredDraggableState0, Orientation orientation0, boolean z, MutableInteractionSource mutableInteractionSource0, OverscrollEffect overscrollEffect0, boolean z1, int v, Object object0) {
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 0x20) != 0) {
            z1 = anchoredDraggableState0.isAnimationRunning();
        }
        return AnchoredDraggableKt.anchoredDraggable(modifier0, anchoredDraggableState0, orientation0, z, ((v & 8) == 0 ? mutableInteractionSource0 : null), ((v & 16) == 0 ? overscrollEffect0 : null), z1);
    }

    public static Modifier anchoredDraggable$default(Modifier modifier0, AnchoredDraggableState anchoredDraggableState0, boolean z, Orientation orientation0, boolean z1, MutableInteractionSource mutableInteractionSource0, OverscrollEffect overscrollEffect0, boolean z2, int v, Object object0) {
        boolean z3 = (v & 8) == 0 ? z1 : true;
        MutableInteractionSource mutableInteractionSource1 = (v & 16) == 0 ? mutableInteractionSource0 : null;
        OverscrollEffect overscrollEffect1 = (v & 0x20) == 0 ? overscrollEffect0 : null;
        return (v & 0x40) == 0 ? AnchoredDraggableKt.anchoredDraggable(modifier0, anchoredDraggableState0, z, orientation0, z3, mutableInteractionSource1, overscrollEffect1, z2) : AnchoredDraggableKt.anchoredDraggable(modifier0, anchoredDraggableState0, z, orientation0, z3, mutableInteractionSource1, overscrollEffect1, anchoredDraggableState0.isAnimationRunning());
    }

    @ExperimentalFoundationApi
    @Nullable
    public static final Object animateTo(@NotNull AnchoredDraggableState anchoredDraggableState0, Object object0, @NotNull Continuation continuation0) {
        Object object1 = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState0, object0, null, new d(anchoredDraggableState0, null), continuation0, 2, null);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    @ExperimentalFoundationApi
    @Nullable
    public static final Object animateToWithDecay(@NotNull AnchoredDraggableState anchoredDraggableState0, Object object0, float f, @NotNull Continuation continuation0) {
        e e0;
        if(continuation0 instanceof e) {
            e0 = (e)continuation0;
            int v = e0.r;
            if((v & 0x80000000) == 0) {
                e0 = new e(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                e0.r = v ^ 0x80000000;
            }
        }
        else {
            e0 = new e(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object1 = e0.q;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(e0.r) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                FloatRef ref$FloatRef0 = new FloatRef();
                ref$FloatRef0.element = f;
                g g0 = new g(anchoredDraggableState0, f, ref$FloatRef0, null);
                e0.p = ref$FloatRef0;
                e0.o = f;
                e0.r = 1;
                return AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState0, object0, null, g0, e0, 2, null) == object2 ? object2 : Boxing.boxFloat(f - ref$FloatRef0.element);
            }
            case 1: {
                f = e0.o;
                FloatRef ref$FloatRef1 = e0.p;
                ResultKt.throwOnFailure(object1);
                return Boxing.boxFloat(f - ref$FloatRef1.element);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @ExperimentalFoundationApi
    @Nullable
    public static final Object snapTo(@NotNull AnchoredDraggableState anchoredDraggableState0, Object object0, @NotNull Continuation continuation0) {
        Object object1 = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState0, object0, null, new q(4, 2, null), continuation0, 2, null);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }
}

