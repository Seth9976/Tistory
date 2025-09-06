package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.text.selection.y0;
import androidx.compose.material3.fj;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.aa;
import p0.ba;
import p0.ca;
import p0.q2;
import p0.r;
import p0.y9;
import qd.a;

@ExperimentalMaterialApi
@Stable
@Deprecated(message = "Material\'s Swipeable has been replaced by Foundation\'s AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 t*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001tBD\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012#\b\u0002\u0010\f\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u0007\u00A2\u0006\u0004\b\r\u0010\u000EJ#\u0010\u0014\u001A\u00020\u00112\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u000FH\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0018\u001A\u00020\u00112\u0012\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u000F2\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u000FH\u0080@\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001A\u001A\u00020\u00112\u0006\u0010\u0019\u001A\u00028\u0000H\u0087@\u00A2\u0006\u0004\b\u001A\u0010\u001BJ(\u0010\u001D\u001A\u00020\u00112\u0006\u0010\u0019\u001A\u00028\u00002\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0087@\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0018\u0010 \u001A\u00020\u00112\u0006\u0010\u001F\u001A\u00020\u0005H\u0086@\u00A2\u0006\u0004\b \u0010!J\u0015\u0010#\u001A\u00020\u00052\u0006\u0010\"\u001A\u00020\u0005\u00A2\u0006\u0004\b#\u0010$R \u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R5\u0010\f\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u00078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R+\u00104\u001A\u00028\u00002\u0006\u0010-\u001A\u00028\u00008F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u00101\"\u0004\b2\u00103R+\u00106\u001A\u00020\u000B2\u0006\u0010-\u001A\u00020\u000B8F@BX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b5\u0010/\u001A\u0004\b6\u00107\"\u0004\b8\u00109RC\u0010>\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u000F2\u0012\u0010-\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u000F8@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\b:\u0010/\u001A\u0004\b;\u0010<\"\u0004\b=\u0010\u0013R\"\u0010E\u001A\u00020\u00058\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b?\u0010@\u001A\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010I\u001A\u00020\u00058\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bF\u0010@\u001A\u0004\bG\u0010B\"\u0004\bH\u0010DRO\u0010P\u001A\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050J2\u0018\u0010-\u001A\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050J8@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bK\u0010/\u001A\u0004\bL\u0010M\"\u0004\bN\u0010OR+\u0010U\u001A\u00020\u00052\u0006\u0010-\u001A\u00020\u00058@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010B\"\u0004\bT\u0010DR/\u0010\\\u001A\u0004\u0018\u00010V2\b\u0010-\u001A\u0004\u0018\u00010V8@@@X\u0080\u008E\u0002\u00A2\u0006\u0012\n\u0004\bW\u0010/\u001A\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001A\u0010b\u001A\u00020]8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b`\u0010aR\u0017\u0010f\u001A\b\u0012\u0004\u0012\u00020\u00050c8F\u00A2\u0006\u0006\u001A\u0004\bd\u0010eR\u0017\u0010h\u001A\b\u0012\u0004\u0012\u00020\u00050c8F\u00A2\u0006\u0006\u001A\u0004\bg\u0010eR\u001A\u0010\u0019\u001A\u00028\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bj\u0010k\u001A\u0004\bi\u00101R \u0010p\u001A\b\u0012\u0004\u0012\u00028\u00000l8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bo\u0010k\u001A\u0004\bm\u0010nR\u001A\u0010s\u001A\u00020\u00058FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\br\u0010k\u001A\u0004\bq\u0010B\u00A8\u0006u"}, d2 = {"Landroidx/compose/material/SwipeableState;", "T", "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "confirmStateChange", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "", "newAnchors", "", "ensureInit$material_release", "(Ljava/util/Map;)V", "ensureInit", "oldAnchors", "processNewAnchors$material_release", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processNewAnchors", "targetValue", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "anim", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "performFling", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "performDrag", "(F)F", "a", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "b", "Lkotlin/jvm/functions/Function1;", "getConfirmStateChange$material_release", "()Lkotlin/jvm/functions/Function1;", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue", "d", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "i", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "anchors", "k", "F", "getMinBound$material_release", "()F", "setMinBound$material_release", "(F)V", "minBound", "l", "getMaxBound$material_release", "setMaxBound$material_release", "maxBound", "Lkotlin/Function2;", "m", "getThresholds$material_release", "()Lkotlin/jvm/functions/Function2;", "setThresholds$material_release", "(Lkotlin/jvm/functions/Function2;)V", "thresholds", "n", "Landroidx/compose/runtime/MutableFloatState;", "getVelocityThreshold$material_release", "setVelocityThreshold$material_release", "velocityThreshold", "Landroidx/compose/material/ResistanceConfig;", "o", "getResistance$material_release", "()Landroidx/compose/material/ResistanceConfig;", "setResistance$material_release", "(Landroidx/compose/material/ResistanceConfig;)V", "resistance", "Landroidx/compose/foundation/gestures/DraggableState;", "p", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "offset", "getOverflow", "overflow", "getTargetValue", "getTargetValue$annotations", "()V", "Landroidx/compose/material/SwipeProgress;", "getProgress", "()Landroidx/compose/material/SwipeProgress;", "getProgress$annotations", "progress", "getDirection", "getDirection$annotations", "direction", "Companion", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,908:1\n21#2:909\n23#2:913\n50#3:910\n55#3:912\n106#4:911\n81#5:914\n107#5,2:915\n81#5:917\n107#5,2:918\n81#5:920\n107#5,2:921\n81#5:951\n107#5,2:952\n81#5:957\n107#5,2:958\n2333#6,14:923\n2333#6,14:937\n76#7:954\n109#7,2:955\n1#8:960\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n133#1:909\n133#1:913\n133#1:910\n133#1:912\n133#1:911\n96#1:914\n96#1:915,2\n102#1:917\n102#1:918,2\n129#1:920\n129#1:921,2\n200#1:951\n200#1:952,2\n204#1:957\n204#1:958,2\n179#1:923,14\n185#1:937,14\n202#1:954\n202#1:955,2\n*E\n"})
public class SwipeableState {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JK\u0010\u000B\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00028\u00010\t\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/material/SwipeableState$Companion;", "", "T", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/SwipeableState;", "Saver", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver Saver(@NotNull AnimationSpec animationSpec0, @NotNull Function1 function10) {
            b0 b00 = new b0(animationSpec0, function10);
            return SaverKt.Saver(a0.w, b00);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AnimationSpec a;
    public final Function1 b;
    public final MutableState c;
    public final MutableState d;
    public final MutableFloatState e;
    public final MutableFloatState f;
    public final MutableFloatState g;
    public final MutableState h;
    public final MutableState i;
    public final Flow j;
    public float k;
    public float l;
    public final MutableState m;
    public final MutableFloatState n;
    public final MutableState o;
    public final DraggableState p;

    static {
        SwipeableState.Companion = new Companion(null);
    }

    public SwipeableState(Object object0, @NotNull AnimationSpec animationSpec0, @NotNull Function1 function10) {
        this.a = animationSpec0;
        this.b = function10;
        this.c = SnapshotStateKt.mutableStateOf$default(object0, null, 2, null);
        this.d = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.e = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.g = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.h = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.i = SnapshotStateKt.mutableStateOf$default(x.emptyMap(), null, 2, null);
        this.j = FlowKt.take(new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                androidx.compose.material.SwipeableState.special..inlined.filter.1.2 swipeableState$special$$inlined$filter$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        androidx.compose.material.SwipeableState.special..inlined.filter.1.2.1 swipeableState$special$$inlined$filter$1$2$10;
                        if(continuation0 instanceof androidx.compose.material.SwipeableState.special..inlined.filter.1.2.1) {
                            swipeableState$special$$inlined$filter$1$2$10 = (androidx.compose.material.SwipeableState.special..inlined.filter.1.2.1)continuation0;
                            int v = swipeableState$special$$inlined$filter$1$2$10.p;
                            if((v & 0x80000000) == 0) {
                                swipeableState$special$$inlined$filter$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    public Object o;
                                    public int p;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.o = object0;
                                        this.p |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                swipeableState$special$$inlined$filter$1$2$10.p = v ^ 0x80000000;
                            }
                        }
                        else {
                            swipeableState$special$$inlined$filter$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                public Object o;
                                public int p;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.o = object0;
                                    this.p |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = swipeableState$special$$inlined$filter$1$2$10.o;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(swipeableState$special$$inlined$filter$1$2$10.p) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                if(!((Map)object0).isEmpty()) {
                                    swipeableState$special$$inlined$filter$1$2$10.p = 1;
                                    if(this.a.emit(object0, swipeableState$special$$inlined$filter$1$2$10) == object2) {
                                        return object2;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = this.a.collect(swipeableState$special$$inlined$filter$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }, 1);
        this.k = -Infinityf;
        this.l = Infinityf;
        this.m = SnapshotStateKt.mutableStateOf$default(q2.L, null, 2, null);
        this.n = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.o = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.p = DraggableKt.DraggableState(new m0.b0(this, 21));
    }

    public SwipeableState(Object object0, AnimationSpec animationSpec0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            animationSpec0 = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if((v & 4) != 0) {
            function10 = r.P;
        }
        this(object0, animationSpec0, function10);
    }

    public final Object a(float f, Continuation continuation0) {
        ca ca0 = new ca(this, f, null);
        Object object0 = DraggableState.drag$default(this.p, null, ca0, continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static final Object access$animateInternalToOffset(SwipeableState swipeableState0, float f, AnimationSpec animationSpec0, Continuation continuation0) {
        swipeableState0.getClass();
        y9 y90 = new y9(swipeableState0, f, animationSpec0, null);
        Unit unit0 = DraggableState.drag$default(swipeableState0.p, null, y90, continuation0, 1, null);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static final void access$setAnimationRunning(SwipeableState swipeableState0, boolean z) {
        swipeableState0.d.setValue(Boolean.valueOf(z));
    }

    public static final void access$setCurrentValue(SwipeableState swipeableState0, Object object0) {
        swipeableState0.c.setValue(object0);
    }

    public static final Object access$snapInternalToOffset(SwipeableState swipeableState0, float f, Continuation continuation0) {
        return swipeableState0.a(f, continuation0);
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object animateTo(Object object0, @NotNull AnimationSpec animationSpec0, @NotNull Continuation continuation0) {
        fj fj0 = new fj(object0, this, 3, animationSpec0);
        Object object1 = this.j.collect(fj0, continuation0);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    public static Object animateTo$default(SwipeableState swipeableState0, Object object0, AnimationSpec animationSpec0, Continuation continuation0, int v, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if((v & 2) != 0) {
            animationSpec0 = swipeableState0.a;
        }
        return swipeableState0.animateTo(object0, animationSpec0, continuation0);
    }

    public final void ensureInit$material_release(@NotNull Map map0) {
        if(this.getAnchors$material_release().isEmpty()) {
            Float float0 = SwipeableKt.access$getOffset(map0, this.getCurrentValue());
            if(float0 == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            this.e.setFloatValue(((float)float0));
            this.g.setFloatValue(((float)float0));
        }
    }

    @NotNull
    public final Map getAnchors$material_release() {
        return (Map)this.i.getValue();
    }

    @NotNull
    public final AnimationSpec getAnimationSpec$material_release() {
        return this.a;
    }

    @NotNull
    public final Function1 getConfirmStateChange$material_release() {
        return this.b;
    }

    public final Object getCurrentValue() {
        return this.c.getValue();
    }

    public final float getDirection() {
        Float float0 = SwipeableKt.access$getOffset(this.getAnchors$material_release(), this.getCurrentValue());
        return float0 == null ? 0.0f : Math.signum(((Number)this.getOffset().getValue()).floatValue() - float0.floatValue());
    }

    @ExperimentalMaterialApi
    public static void getDirection$annotations() {
    }

    @NotNull
    public final DraggableState getDraggableState$material_release() {
        return this.p;
    }

    public final float getMaxBound$material_release() {
        return this.l;
    }

    public final float getMinBound$material_release() {
        return this.k;
    }

    @NotNull
    public final State getOffset() {
        return this.e;
    }

    @NotNull
    public final State getOverflow() {
        return this.f;
    }

    @NotNull
    public final SwipeProgress getProgress() {
        List list0 = SwipeableKt.access$findBounds(((Number)this.getOffset().getValue()).floatValue(), this.getAnchors$material_release().keySet());
        switch(list0.size()) {
            case 0: {
                return new SwipeProgress(this.getCurrentValue(), this.getCurrentValue(), 1.0f);
            }
            case 1: {
                return new SwipeProgress(x.getValue(this.getAnchors$material_release(), list0.get(0)), x.getValue(this.getAnchors$material_release(), list0.get(0)), 1.0f);
            }
            default: {
                Pair pair0 = this.getDirection() > 0.0f ? TuplesKt.to(list0.get(0), list0.get(1)) : TuplesKt.to(list0.get(1), list0.get(0));
                float f = ((Number)pair0.component1()).floatValue();
                float f1 = ((Number)pair0.component2()).floatValue();
                return new SwipeProgress(x.getValue(this.getAnchors$material_release(), f), x.getValue(this.getAnchors$material_release(), f1), (((Number)this.getOffset().getValue()).floatValue() - f) / (f1 - f));
            }
        }
    }

    @ExperimentalMaterialApi
    public static void getProgress$annotations() {
    }

    @Nullable
    public final ResistanceConfig getResistance$material_release() {
        return (ResistanceConfig)this.o.getValue();
    }

    public final Object getTargetValue() {
        float f;
        Float float0 = (Float)this.h.getValue();
        if(float0 == null) {
            float f1 = ((Number)this.getOffset().getValue()).floatValue();
            Float float1 = SwipeableKt.access$getOffset(this.getAnchors$material_release(), this.getCurrentValue());
            f = SwipeableKt.access$computeTarget(f1, (float1 == null ? ((Number)this.getOffset().getValue()).floatValue() : ((float)float1)), this.getAnchors$material_release().keySet(), this.getThresholds$material_release(), 0.0f, Infinityf);
        }
        else {
            f = (float)float0;
        }
        Object object0 = this.getAnchors$material_release().get(f);
        return object0 == null ? this.getCurrentValue() : object0;
    }

    @ExperimentalMaterialApi
    public static void getTargetValue$annotations() {
    }

    @NotNull
    public final Function2 getThresholds$material_release() {
        return (Function2)this.m.getValue();
    }

    public final float getVelocityThreshold$material_release() {
        return this.n.getFloatValue();
    }

    public final boolean isAnimationRunning() {
        return ((Boolean)this.d.getValue()).booleanValue();
    }

    public final float performDrag(float f) {
        float f1 = c.coerceIn(this.g.getFloatValue() + f, this.k, this.l) - this.g.getFloatValue();
        if(Math.abs(f1) > 0.0f) {
            this.p.dispatchRawDelta(f1);
        }
        return f1;
    }

    @Nullable
    public final Object performFling(float f, @NotNull Continuation continuation0) {
        aa aa0 = new aa(this, f);
        Object object0 = this.j.collect(aa0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public final Object processNewAnchors$material_release(@NotNull Map map0, @NotNull Map map1, @NotNull Continuation continuation0) {
        SwipeableState swipeableState1;
        SwipeableState swipeableState0;
        float f;
        Object object2;
        Object object5;
        ba ba0;
        if(continuation0 instanceof ba) {
            ba0 = (ba)continuation0;
            int v = ba0.t;
            if((v & 0x80000000) == 0) {
                ba0 = new ba(this, continuation0);
            }
            else {
                ba0.t = v ^ 0x80000000;
            }
        }
        else {
            ba0 = new ba(this, continuation0);
        }
        Object object0 = ba0.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(ba0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(map0.isEmpty()) {
                    Float float0 = CollectionsKt___CollectionsKt.minOrNull(map1.keySet());
                    Intrinsics.checkNotNull(float0);
                    this.k = (float)float0;
                    Float float1 = CollectionsKt___CollectionsKt.maxOrNull(map1.keySet());
                    Intrinsics.checkNotNull(float1);
                    this.l = (float)float1;
                    Float float2 = SwipeableKt.access$getOffset(map1, this.getCurrentValue());
                    if(float2 == null) {
                        throw new IllegalArgumentException("The initial value must have an associated anchor.");
                    }
                    ba0.t = 1;
                    return this.a(((float)float2), ba0) == object1 ? object1 : Unit.INSTANCE;
                }
                if(!Intrinsics.areEqual(map1, map0)) {
                    this.k = -Infinityf;
                    this.l = Infinityf;
                    Float float3 = (Float)this.h.getValue();
                    if(float3 == null) {
                        Object object4 = map0.get(this.getOffset().getValue());
                        if(Intrinsics.areEqual(object4, this.getCurrentValue())) {
                            object4 = this.getCurrentValue();
                        }
                        Float float5 = SwipeableKt.access$getOffset(map1, object4);
                        if(float5 == null) {
                            Iterator iterator1 = map1.keySet().iterator();
                            if(iterator1.hasNext()) {
                                object5 = iterator1.next();
                                if(iterator1.hasNext()) {
                                    float f3 = Math.abs(((Number)object5).floatValue() - ((Number)this.getOffset().getValue()).floatValue());
                                    while(true) {
                                        Object object6 = iterator1.next();
                                        float f4 = Math.abs(((Number)object6).floatValue() - ((Number)this.getOffset().getValue()).floatValue());
                                        if(Float.compare(f3, f4) > 0) {
                                            object5 = object6;
                                            f3 = f4;
                                        }
                                        if(!iterator1.hasNext()) {
                                            break;
                                        }
                                    }
                                }
                            }
                            else {
                                object5 = null;
                            }
                            Intrinsics.checkNotNull(object5);
                            f = ((Number)object5).floatValue();
                        }
                        else {
                            f = (float)float5;
                        }
                    }
                    else {
                        Float float4 = SwipeableKt.access$getOffset(map1, map0.get(float3));
                        if(float4 == null) {
                            Iterator iterator0 = map1.keySet().iterator();
                            if(iterator0.hasNext()) {
                                object2 = iterator0.next();
                                if(iterator0.hasNext()) {
                                    float f1 = Math.abs(((Number)object2).floatValue() - ((float)float3));
                                    while(true) {
                                        Object object3 = iterator0.next();
                                        float f2 = Math.abs(((Number)object3).floatValue() - ((float)float3));
                                        if(Float.compare(f1, f2) > 0) {
                                            object2 = object3;
                                            f1 = f2;
                                        }
                                        if(!iterator0.hasNext()) {
                                            break;
                                        }
                                    }
                                }
                            }
                            else {
                                object2 = null;
                            }
                            Intrinsics.checkNotNull(object2);
                            f = ((Number)object2).floatValue();
                        }
                        else {
                            f = (float)float4;
                        }
                    }
                    try {
                        ba0.o = this;
                        ba0.p = map1;
                        ba0.q = f;
                        ba0.t = 2;
                        y9 y90 = new y9(this, f, this.a, null);
                        Unit unit0 = DraggableState.drag$default(this.p, null, y90, ba0, 1, null);
                        if(unit0 != a.getCOROUTINE_SUSPENDED()) {
                            unit0 = Unit.INSTANCE;
                        }
                    }
                    catch(CancellationException unused_ex) {
                        swipeableState0 = this;
                        goto label_101;
                    }
                    catch(Throwable throwable0) {
                        swipeableState1 = this;
                        goto label_127;
                    }
                    if(unit0 == object1) {
                        return object1;
                    }
                    swipeableState0 = this;
                    goto label_112;
                }
                return Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 2: {
                try {
                    try {
                        f = ba0.q;
                        map1 = ba0.p;
                        swipeableState0 = ba0.o;
                        ResultKt.throwOnFailure(object0);
                        goto label_112;
                    }
                    catch(CancellationException unused_ex) {
                    }
                label_101:
                    ba0.o = swipeableState0;
                    ba0.p = map1;
                    ba0.q = f;
                    ba0.t = 3;
                    if(swipeableState0.a(f, ba0) == object1) {
                        return object1;
                    }
                    swipeableState1 = swipeableState0;
                    goto label_136;
                }
                catch(Throwable throwable0) {
                    swipeableState1 = swipeableState0;
                    goto label_127;
                }
            label_112:
                Object object7 = x.getValue(map1, Boxing.boxFloat(f));
                swipeableState0.c.setValue(object7);
                Float float6 = CollectionsKt___CollectionsKt.minOrNull(map1.keySet());
                Intrinsics.checkNotNull(float6);
                swipeableState0.k = (float)float6;
                Float float7 = CollectionsKt___CollectionsKt.maxOrNull(map1.keySet());
                Intrinsics.checkNotNull(float7);
                swipeableState0.l = (float)float7;
                return Unit.INSTANCE;
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            f = ba0.q;
            map1 = ba0.p;
            swipeableState1 = ba0.o;
            ResultKt.throwOnFailure(object0);
            goto label_136;
        }
        catch(Throwable throwable0) {
        }
    label_127:
        Object object8 = x.getValue(map1, Boxing.boxFloat(f));
        swipeableState1.c.setValue(object8);
        Float float8 = CollectionsKt___CollectionsKt.minOrNull(map1.keySet());
        Intrinsics.checkNotNull(float8);
        swipeableState1.k = (float)float8;
        Float float9 = CollectionsKt___CollectionsKt.maxOrNull(map1.keySet());
        Intrinsics.checkNotNull(float9);
        swipeableState1.l = (float)float9;
        throw throwable0;
    label_136:
        Object object9 = x.getValue(map1, Boxing.boxFloat(f));
        swipeableState1.c.setValue(object9);
        Float float10 = CollectionsKt___CollectionsKt.minOrNull(map1.keySet());
        Intrinsics.checkNotNull(float10);
        swipeableState1.k = (float)float10;
        Float float11 = CollectionsKt___CollectionsKt.maxOrNull(map1.keySet());
        Intrinsics.checkNotNull(float11);
        swipeableState1.l = (float)float11;
        return Unit.INSTANCE;
    }

    public final void setAnchors$material_release(@NotNull Map map0) {
        this.i.setValue(map0);
    }

    public final void setMaxBound$material_release(float f) {
        this.l = f;
    }

    public final void setMinBound$material_release(float f) {
        this.k = f;
    }

    public final void setResistance$material_release(@Nullable ResistanceConfig resistanceConfig0) {
        this.o.setValue(resistanceConfig0);
    }

    public final void setThresholds$material_release(@NotNull Function2 function20) {
        this.m.setValue(function20);
    }

    public final void setVelocityThreshold$material_release(float f) {
        this.n.setFloatValue(f);
    }

    @ExperimentalMaterialApi
    @Nullable
    public final Object snapTo(Object object0, @NotNull Continuation continuation0) {
        y0 y00 = new y0(4, object0, this);
        Object object1 = this.j.collect(y00, continuation0);
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }
}

