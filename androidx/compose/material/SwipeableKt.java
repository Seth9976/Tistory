package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.g1;
import androidx.compose.material3.td;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.q2;
import p0.q9;
import p0.r9;
import p0.r;
import p0.s9;
import p0.t9;
import p0.w9;
import qd.a;

@Metadata(d1 = {"\u0000r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\\\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001A\u00028\u00002\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032#\b\u0002\u0010\u000B\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006H\u0007\u00A2\u0006\u0004\b\r\u0010\u000E\u001AK\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000F\u001A\u00028\u00002\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u00062\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013\u001A\u00B6\u0001\u0010)\u001A\u00020\u0014\"\u0004\b\u0000\u0010\u0001*\u00020\u00142\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001A\u001A\u00020\n2\b\b\u0002\u0010\u001B\u001A\u00020\n2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C28\b\u0002\u0010\"\u001A2\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001F\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u001E2\n\b\u0002\u0010$\u001A\u0004\u0018\u00010#2\b\b\u0002\u0010&\u001A\u00020%H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010(\"*\u0010/\u001A\u00020*\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\f8@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\b-\u0010.\u001A\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00060"}, d2 = {"", "T", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "confirmStateChange", "Landroidx/compose/material/SwipeableState;", "rememberSwipeableState", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "value", "", "onValueChange", "rememberSwipeableStateFor", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "Landroidx/compose/ui/Modifier;", "state", "", "anchors", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function2;", "from", "to", "Landroidx/compose/material/ThresholdConfig;", "thresholds", "Landroidx/compose/material/ResistanceConfig;", "resistance", "Landroidx/compose/ui/unit/Dp;", "velocityThreshold", "swipeable-pPrIpRY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/ResistanceConfig;F)Landroidx/compose/ui/Modifier;", "swipeable", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection", "(Landroidx/compose/material/SwipeableState;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getPreUpPostDownNestedScrollConnection$annotations", "(Landroidx/compose/material/SwipeableState;)V", "PreUpPostDownNestedScrollConnection", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,908:1\n25#2:909\n25#2:916\n1116#3,6:910\n1116#3,6:917\n135#4:923\n766#5:924\n857#5,2:925\n766#5:940\n857#5,2:941\n288#5,2:956\n171#6,13:927\n482#6,13:943\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n*L\n510#1:909\n517#1:916\n510#1:910,6\n517#1:917,6\n583#1:923\n752#1:924\n752#1:925,2\n753#1:940\n753#1:941,2\n810#1:956,2\n752#1:927,13\n753#1:943,13\n*E\n"})
public final class SwipeableKt {
    public static final List a(float f, Set set0) {
        Object object2;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: set0) {
            if(((double)((Number)object0).floatValue()) <= ((double)f) + 0.001) {
                arrayList0.add(object0);
            }
        }
        Object object1 = null;
        if(arrayList0.isEmpty()) {
            object2 = null;
        }
        else {
            object2 = arrayList0.get(0);
            float f1 = ((Number)object2).floatValue();
            int v1 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
            if(1 <= v1) {
                for(int v2 = 1; true; ++v2) {
                    Object object3 = arrayList0.get(v2);
                    float f2 = ((Number)object3).floatValue();
                    if(Float.compare(f1, f2) < 0) {
                        object2 = object3;
                        f1 = f2;
                    }
                    if(v2 == v1) {
                        break;
                    }
                }
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object4: set0) {
            if(((double)((Number)object4).floatValue()) >= ((double)f) - 0.001) {
                arrayList1.add(object4);
            }
        }
        if(!arrayList1.isEmpty()) {
            Object object5 = arrayList1.get(0);
            float f3 = ((Number)object5).floatValue();
            int v3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList1);
            if(1 <= v3) {
                for(int v = 1; true; ++v) {
                    Object object6 = arrayList1.get(v);
                    float f4 = ((Number)object6).floatValue();
                    if(Float.compare(f3, f4) > 0) {
                        object5 = object6;
                        f3 = f4;
                    }
                    if(v == v3) {
                        break;
                    }
                }
            }
            object1 = object5;
        }
        if(((Float)object2) == null) {
            return CollectionsKt__CollectionsKt.listOfNotNull(((Float)object1));
        }
        if(((Float)object1) == null) {
            return k.listOf(((Float)object2));
        }
        return Intrinsics.areEqual(((Float)object2), ((Float)object1)) ? k.listOf(((Float)object2)) : CollectionsKt__CollectionsKt.listOf(new Float[]{((Float)object2), ((Float)object1)});
    }

    public static final float access$computeTarget(float f, float f1, Set set0, Function2 function20, float f2, float f3) {
        List list0 = SwipeableKt.a(f, set0);
        switch(list0.size()) {
            case 0: {
                return f1;
            }
            case 1: {
                return ((Number)list0.get(0)).floatValue();
            }
            default: {
                float f4 = ((Number)list0.get(0)).floatValue();
                float f5 = ((Number)list0.get(1)).floatValue();
                if(f1 <= f) {
                    if(f2 >= f3) {
                        return f5;
                    }
                    return f < ((Number)function20.invoke(f4, f5)).floatValue() ? f4 : f5;
                }
                return f2 <= -f3 || f <= ((Number)function20.invoke(f5, f4)).floatValue() ? f4 : f5;
            }
        }
    }

    public static final List access$findBounds(float f, Set set0) {
        return SwipeableKt.a(f, set0);
    }

    public static final Float access$getOffset(Map map0, Object object0) {
        for(Object object1: map0.entrySet()) {
            if(Intrinsics.areEqual(((Map.Entry)object1).getValue(), object0)) {
                return ((Map.Entry)object1) == null ? null : ((Float)((Map.Entry)object1).getKey());
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @NotNull
    public static final NestedScrollConnection getPreUpPostDownNestedScrollConnection(@NotNull SwipeableState swipeableState0) {
        return new NestedScrollConnection() {
            public final SwipeableState a;

            {
                SwipeableState swipeableState0 = swipeableState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = swipeableState0;
            }

            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            @Nullable
            public Object onPostFling-RZ2iAVY(long v, long v1, @NotNull Continuation continuation0) {
                q9 q90;
                if(continuation0 instanceof q9) {
                    q90 = (q9)continuation0;
                    int v2 = q90.r;
                    if((v2 & 0x80000000) == 0) {
                        q90 = new q9(this, continuation0);
                    }
                    else {
                        q90.r = v2 ^ 0x80000000;
                    }
                }
                else {
                    q90 = new q9(this, continuation0);
                }
                Object object0 = q90.p;
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(q90.r) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        q90.o = v1;
                        q90.r = 1;
                        return this.a.performFling(Offset.getY-impl(OffsetKt.Offset(Velocity.getX-impl(v1), Velocity.getY-impl(v1))), q90) == object1 ? object1 : Velocity.box-impl(v1);
                    }
                    case 1: {
                        v1 = q90.o;
                        ResultKt.throwOnFailure(object0);
                        return Velocity.box-impl(v1);
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }

            // 去混淆评级： 中等(60)
            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public long onPostScroll-DzOQY0M(long v, long v1, int v2) {
                return NestedScrollSource.equals-impl0(v2, 1) ? OffsetKt.Offset(0.0f, this.a.performDrag(Offset.getY-impl(v1))) : 0L;
            }

            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            @Nullable
            public Object onPreFling-QWom1Mo(long v, @NotNull Continuation continuation0) {
                r9 r90;
                if(continuation0 instanceof r9) {
                    r90 = (r9)continuation0;
                    int v1 = r90.r;
                    if((v1 & 0x80000000) == 0) {
                        r90 = new r9(this, continuation0);
                    }
                    else {
                        r90.r = v1 ^ 0x80000000;
                    }
                }
                else {
                    r90 = new r9(this, continuation0);
                }
                Object object0 = r90.p;
                Object object1 = a.getCOROUTINE_SUSPENDED();
                switch(r90.r) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        float f = Offset.getY-impl(OffsetKt.Offset(Velocity.getX-impl(v), Velocity.getY-impl(v)));
                        if(f < 0.0f) {
                            SwipeableState swipeableState0 = this.a;
                            if(((Number)swipeableState0.getOffset().getValue()).floatValue() <= swipeableState0.getMinBound$material_release()) {
                                return Velocity.box-impl(0L);
                            }
                            r90.o = v;
                            r90.r = 1;
                            if(swipeableState0.performFling(f, r90) == object1) {
                                return object1;
                            }
                        }
                        else {
                            v = 0L;
                        }
                        return Velocity.box-impl(v);
                    }
                    case 1: {
                        v = r90.o;
                        ResultKt.throwOnFailure(object0);
                        return Velocity.box-impl(v);
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }

            // 去混淆评级： 低(25)
            @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            public long onPreScroll-OzD1aCk(long v, int v1) {
                float f = Offset.getY-impl(v);
                return f >= 0.0f || !NestedScrollSource.equals-impl0(v1, 1) ? 0L : OffsetKt.Offset(0.0f, this.a.performDrag(f));
            }
        };
    }

    @ExperimentalMaterialApi
    public static void getPreUpPostDownNestedScrollConnection$annotations(SwipeableState swipeableState0) {
    }

    @ExperimentalMaterialApi
    @Composable
    @Deprecated(message = "Material\'s Swipeable has been replaced by Foundation\'s AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
    @NotNull
    public static final SwipeableState rememberSwipeableState(@NotNull Object object0, @Nullable AnimationSpec animationSpec0, @Nullable Function1 function10, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0xB6395ADF);
        if((v1 & 2) != 0) {
            animationSpec0 = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if((v1 & 4) != 0) {
            function10 = s9.w;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB6395ADF, v, -1, "androidx.compose.material.rememberSwipeableState (Swipeable.kt:478)");
        }
        Saver saver0 = SwipeableState.Companion.Saver(animationSpec0, function10);
        td td0 = new td(object0, animationSpec0, 12, function10);
        SwipeableState swipeableState0 = (SwipeableState)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, td0, composer0, 72, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return swipeableState0;
    }

    @ExperimentalMaterialApi
    @Composable
    @Deprecated(message = "Material\'s Swipeable has been replaced by Foundation\'s AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
    @NotNull
    public static final SwipeableState rememberSwipeableStateFor(@NotNull Object object0, @NotNull Function1 function10, @Nullable AnimationSpec animationSpec0, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x44ED1106);
        if((v1 & 4) != 0) {
            animationSpec0 = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x44ED1106, v, -1, "androidx.compose.material.rememberSwipeableStateFor (Swipeable.kt:508)");
        }
        composer0.startReplaceableGroup(0xE2A708A4);
        SwipeableState swipeableState0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(swipeableState0 == composer$Companion0.getEmpty()) {
            swipeableState0 = new SwipeableState(object0, animationSpec0, r.O);
            composer0.updateRememberedValue(swipeableState0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0xE2A708A4);
        MutableState mutableState0 = composer0.rememberedValue();
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer0.updateRememberedValue(mutableState0);
        }
        composer0.endReplaceableGroup();
        EffectsKt.LaunchedEffect(object0, mutableState0.getValue(), new t9(object0, swipeableState0, null), composer0, v & 14 | (v & 8 | 0x200));
        EffectsKt.DisposableEffect(swipeableState0.getCurrentValue(), new g1(4, object0, swipeableState0, function10, mutableState0), composer0, v & 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return swipeableState0;
    }

    // 去混淆评级： 低(30)
    @ExperimentalMaterialApi
    @Deprecated(message = "Material\'s Swipeable has been replaced by Foundation\'s AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
    @NotNull
    public static final Modifier swipeable-pPrIpRY(@NotNull Modifier modifier0, @NotNull SwipeableState swipeableState0, @NotNull Map map0, @NotNull Orientation orientation0, boolean z, boolean z1, @Nullable MutableInteractionSource mutableInteractionSource0, @NotNull Function2 function20, @Nullable ResistanceConfig resistanceConfig0, float f) {
        return ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new w9(swipeableState0, map0, orientation0, z, z1, mutableInteractionSource0, function20, resistanceConfig0, f));

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n*L\n1#1,170:1\n584#2,11:171\n*E\n"})
        public final class androidx.compose.material.SwipeableKt.swipeable-pPrIpRY..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            public final boolean A;
            public final MutableInteractionSource B;
            public final Function2 C;
            public final ResistanceConfig D;
            public final float E;
            public final SwipeableState w;
            public final Map x;
            public final Orientation y;
            public final boolean z;

            public androidx.compose.material.SwipeableKt.swipeable-pPrIpRY..inlined.debugInspectorInfo.1(SwipeableState swipeableState0, Map map0, Orientation orientation0, boolean z, boolean z1, MutableInteractionSource mutableInteractionSource0, Function2 function20, ResistanceConfig resistanceConfig0, float f) {
                this.w = swipeableState0;
                this.x = map0;
                this.y = orientation0;
                this.z = z;
                this.A = z1;
                this.B = mutableInteractionSource0;
                this.C = function20;
                this.D = resistanceConfig0;
                this.E = f;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo0) {
                inspectorInfo0.setName("swipeable");
                inspectorInfo0.getProperties().set("state", this.w);
                inspectorInfo0.getProperties().set("anchors", this.x);
                inspectorInfo0.getProperties().set("orientation", this.y);
                ValueElementSequence valueElementSequence0 = r0.a.k(this.z, inspectorInfo0.getProperties(), "enabled", inspectorInfo0);
                r0.a.k(this.A, valueElementSequence0, "reverseDirection", inspectorInfo0).set("interactionSource", this.B);
                inspectorInfo0.getProperties().set("thresholds", this.C);
                inspectorInfo0.getProperties().set("resistance", this.D);
                inspectorInfo0.getProperties().set("velocityThreshold", Dp.box-impl(this.E));
            }
        }

    }

    public static Modifier swipeable-pPrIpRY$default(Modifier modifier0, SwipeableState swipeableState0, Map map0, Orientation orientation0, boolean z, boolean z1, MutableInteractionSource mutableInteractionSource0, Function2 function20, ResistanceConfig resistanceConfig0, float f, int v, Object object0) {
        boolean z2 = (v & 8) == 0 ? z : true;
        boolean z3 = (v & 16) == 0 ? z1 : false;
        MutableInteractionSource mutableInteractionSource1 = (v & 0x20) == 0 ? mutableInteractionSource0 : null;
        Function2 function21 = (v & 0x40) == 0 ? function20 : q2.K;
        if((v & 0x80) != 0) {
            Set set0 = map0.keySet();
            ResistanceConfig resistanceConfig1 = SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, set0, 0.0f, 0.0f, 6, null);
            return (v & 0x100) == 0 ? SwipeableKt.swipeable-pPrIpRY(modifier0, swipeableState0, map0, orientation0, z2, z3, mutableInteractionSource1, function21, resistanceConfig1, f) : SwipeableKt.swipeable-pPrIpRY(modifier0, swipeableState0, map0, orientation0, z2, z3, mutableInteractionSource1, function21, resistanceConfig1, 125.0f);
        }
        return (v & 0x100) == 0 ? SwipeableKt.swipeable-pPrIpRY(modifier0, swipeableState0, map0, orientation0, z2, z3, mutableInteractionSource1, function21, resistanceConfig0, f) : SwipeableKt.swipeable-pPrIpRY(modifier0, swipeableState0, map0, orientation0, z2, z3, mutableInteractionSource1, function21, resistanceConfig0, 125.0f);
    }
}

