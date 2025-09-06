package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import qd.a;
import z.b;
import z.r3;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A-\u0010\u0006\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001AC\u0010\u0006\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/TransformableState;", "state", "", "lockRotationOnZoomPan", "enabled", "transformable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;ZZ)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "canPan", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;Lkotlin/jvm/functions/Function1;ZZ)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,277:1\n101#2,2:278\n33#2,6:280\n103#2:286\n33#2,6:287\n101#2,2:293\n33#2,6:295\n103#2:301\n101#2,2:302\n33#2,6:304\n103#2:310\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n219#1:278,2\n219#1:280,6\n219#1:286\n253#1:287,6\n264#1:293,2\n264#1:295,6\n264#1:301\n265#1:302,2\n265#1:304,6\n265#1:310\n*E\n"})
public final class TransformableKt {
    public static final Object access$detectZoom(AwaitPointerEventScope awaitPointerEventScope0, boolean z, Channel channel0, Function1 function10, Continuation continuation0) {
        long v24;
        float f14;
        int v23;
        long v20;
        int v19;
        float f11;
        int v17;
        r3 r31;
        int v16;
        boolean z7;
        Object object1;
        int v9;
        int v8;
        float f7;
        boolean z6;
        PointerEvent pointerEvent0;
        Channel channel3;
        boolean z4;
        AwaitPointerEventScope awaitPointerEventScope3;
        Function1 function13;
        Function1 function11;
        float f3;
        float f2;
        int v3;
        int v2;
        long v1;
        float f1;
        boolean z1;
        Channel channel1;
        AwaitPointerEventScope awaitPointerEventScope1;
        r3 r30;
        if(continuation0 instanceof r3) {
            r30 = (r3)continuation0;
            int v = r30.B;
            if((v & 0x80000000) == 0) {
                r30 = new r3(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                r30.B = v ^ 0x80000000;
            }
        }
        else {
            r30 = new r3(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = r30.A;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(r30.B) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                float f = awaitPointerEventScope0.getViewConfiguration().getTouchSlop();
                awaitPointerEventScope1 = awaitPointerEventScope0;
                r30.o = awaitPointerEventScope1;
                channel1 = channel0;
                r30.p = channel1;
                r30.q = function10;
                z1 = z;
                r30.s = z1;
                r30.t = 0.0f;
                r30.u = 1.0f;
                r30.w = 0L;
                r30.x = 0;
                r30.v = f;
                r30.y = 0;
                r30.B = 1;
                if(TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope0, false, null, r30, 2, null) == unit0) {
                    return unit0;
                }
                f1 = f;
                v1 = 0L;
                v2 = 0;
                v3 = 0;
                f2 = 1.0f;
                f3 = 0.0f;
                function11 = function10;
                goto label_116;
            }
            case 1: {
                v2 = r30.y;
                f1 = r30.v;
                v3 = r30.x;
                v1 = r30.w;
                f2 = r30.u;
                f3 = r30.t;
                boolean z2 = r30.s;
                Function1 function12 = r30.q;
                channel1 = r30.p;
                AwaitPointerEventScope awaitPointerEventScope2 = r30.o;
                ResultKt.throwOnFailure(object0);
                function11 = function12;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                z1 = z2;
                goto label_116;
            }
            case 2: {
                v2 = r30.y;
                f1 = r30.v;
                v3 = r30.x;
                v1 = r30.w;
                f2 = r30.u;
                f3 = r30.t;
                boolean z3 = r30.s;
                function13 = r30.q;
                Channel channel2 = r30.p;
                awaitPointerEventScope3 = r30.o;
                ResultKt.throwOnFailure(object0);
                z4 = z3;
                channel3 = channel2;
                goto label_135;
            }
            case 3: {
                int v4 = r30.z;
                int v5 = r30.y;
                float f4 = r30.v;
                int v6 = r30.x;
                long v7 = r30.w;
                float f5 = r30.u;
                float f6 = r30.t;
                boolean z5 = r30.s;
                pointerEvent0 = r30.r;
                Function1 function14 = r30.q;
                Channel channel4 = r30.p;
                awaitPointerEventScope3 = r30.o;
                ResultKt.throwOnFailure(object0);
                z6 = z5;
                channel1 = channel4;
                f7 = f6;
                function13 = function14;
                v8 = v5;
                f1 = f4;
                v3 = v6;
                v1 = v7;
                f2 = f5;
                v9 = v4;
                object1 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            List list0 = ((PointerEvent)object1).getChanges();
            int v10 = list0.size();
            int v11 = 0;
            while(true) {
                if(v11 < v10) {
                    if(!((PointerInputChange)list0.get(v11)).isConsumed()) {
                        ++v11;
                        continue;
                    }
                    else if(v3 == 0) {
                        z7 = true;
                        break;
                    }
                }
                z7 = false;
                break;
            }
            if(v9 == 0 && !z7) {
                List list1 = pointerEvent0.getChanges();
                int v12 = list1.size();
                int v13 = 0;
                while(true) {
                    if(v13 >= v12) {
                        break;
                    }
                    if(!((PointerInputChange)list1.get(v13)).getPressed()) {
                        ++v13;
                        continue;
                    }
                    f3 = f7;
                    function11 = function13;
                    awaitPointerEventScope1 = awaitPointerEventScope3;
                    v2 = v8;
                    z1 = z6;
                label_116:
                    r30.o = awaitPointerEventScope1;
                    r30.p = channel1;
                    r30.q = function11;
                    r30.r = null;
                    r30.s = z1;
                    r30.t = f3;
                    r30.u = f2;
                    r30.w = v1;
                    r30.x = v3;
                    r30.v = f1;
                    r30.y = v2;
                    r30.B = 2;
                    Object object2 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope1, null, r30, 1, null);
                    if(object2 == unit0) {
                        break alab1;
                    }
                    function13 = function11;
                    object0 = object2;
                    channel3 = channel1;
                    z4 = z1;
                    awaitPointerEventScope3 = awaitPointerEventScope1;
                label_135:
                    List list2 = ((PointerEvent)object0).getChanges();
                    int v14 = list2.size();
                    int v15 = 0;
                    while(true) {
                        v16 = 0;
                        if(v15 < v14) {
                            if(((PointerInputChange)list2.get(v15)).isConsumed()) {
                                v16 = 1;
                            }
                            else {
                                ++v15;
                                continue;
                            }
                        }
                        break;
                    }
                    if(v16 == 0) {
                        float f8 = TransformGestureDetectorKt.calculateZoom(((PointerEvent)object0));
                        float f9 = TransformGestureDetectorKt.calculateRotation(((PointerEvent)object0));
                        r31 = r30;
                        v17 = 0;
                        long v18 = TransformGestureDetectorKt.calculatePan(((PointerEvent)object0));
                        if(v3 == 0) {
                            f2 *= f8;
                            f3 += f9;
                            v1 = Offset.plus-MK-Hz9U(v1, v18);
                            float f10 = TransformGestureDetectorKt.calculateCentroidSize(((PointerEvent)object0), false);
                            f11 = f9;
                            float f12 = Math.abs(3.141593f * f3 * f10 / 180.0f);
                            if(Math.abs(1.0f - f2) * f10 > f1 || f12 > f1 || Offset.getDistance-impl(v1) > f1 && ((Boolean)function13.invoke(Offset.box-impl(v18))).booleanValue()) {
                                v8 = !z4 || f12 >= f1 ? 0 : 1;
                                channel3.trySend-JP2dKIU(TransformEvent.TransformStarted.INSTANCE);
                                v3 = 1;
                            }
                            else {
                                v8 = v2;
                            }
                        }
                        else {
                            f11 = f9;
                            v8 = v2;
                        }
                        if(v3 == 0) {
                            v19 = 0;
                            v20 = v1;
                        }
                        else {
                            float f13 = v8 == 0 ? f11 : 0.0f;
                            if(f13 != 0.0f) {
                                v19 = v3;
                                v20 = v1;
                                channel3.trySend-JP2dKIU(new TransformEvent.TransformDelta(f8, v18, f13, null));
                            }
                            else if(f8 == 1.0f) {
                                v19 = v3;
                                v20 = v1;
                                if(!Offset.equals-impl0(v18, 0L) && ((Boolean)function13.invoke(Offset.box-impl(v18))).booleanValue()) {
                                    channel3.trySend-JP2dKIU(new TransformEvent.TransformDelta(1.0f, v18, 0.0f, null));
                                }
                            }
                            else {
                                v19 = v3;
                                v20 = v1;
                                channel3.trySend-JP2dKIU(new TransformEvent.TransformDelta(f8, v18, 0.0f, null));
                            }
                            List list3 = ((PointerEvent)object0).getChanges();
                            int v21 = list3.size();
                            for(int v22 = 0; v22 < v21; ++v22) {
                                PointerInputChange pointerInputChange0 = (PointerInputChange)list3.get(v22);
                                if(PointerEventKt.positionChanged(pointerInputChange0)) {
                                    pointerInputChange0.consume();
                                }
                            }
                        }
                        v23 = v19;
                        f14 = f2;
                        v24 = v20;
                    }
                    else {
                        r31 = r30;
                        v17 = v16;
                        channel3.trySend-JP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                        v8 = v2;
                        f14 = f2;
                        v24 = v1;
                        v23 = v3;
                    }
                    r31.o = awaitPointerEventScope3;
                    r31.p = channel3;
                    r31.q = function13;
                    r31.r = (PointerEvent)object0;
                    r31.s = z4;
                    r31.t = f3;
                    r31.u = f14;
                    r31.w = v24;
                    r31.x = v23;
                    r31.v = f1;
                    r31.y = v8;
                    v9 = v17;
                    r31.z = v9;
                    r31.B = 3;
                    object1 = awaitPointerEventScope3.awaitPointerEvent(PointerEventPass.Final, r31);
                    if(object1 == unit0) {
                        break alab1;
                    }
                    z6 = z4;
                    channel1 = channel3;
                    f7 = f3;
                    pointerEvent0 = (PointerEvent)object0;
                    f2 = f14;
                    r30 = r31;
                    v3 = v23;
                    v1 = v24;
                    continue alab1;
                }
            }
            return Unit.INSTANCE;
        }
        return unit0;
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier transformable(@NotNull Modifier modifier0, @NotNull TransformableState transformableState0, @NotNull Function1 function10, boolean z, boolean z1) {
        return modifier0.then(new TransformableElement(transformableState0, function10, z, z1));
    }

    @NotNull
    public static final Modifier transformable(@NotNull Modifier modifier0, @NotNull TransformableState transformableState0, boolean z, boolean z1) {
        return TransformableKt.transformable(modifier0, transformableState0, b.K, z, z1);
    }

    public static Modifier transformable$default(Modifier modifier0, TransformableState transformableState0, Function1 function10, boolean z, boolean z1, int v, Object object0) {
        if((v & 4) != 0) {
            z = false;
        }
        if((v & 8) != 0) {
            z1 = true;
        }
        return TransformableKt.transformable(modifier0, transformableState0, function10, z, z1);
    }

    public static Modifier transformable$default(Modifier modifier0, TransformableState transformableState0, boolean z, boolean z1, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            z1 = true;
        }
        return TransformableKt.transformable(modifier0, transformableState0, z, z1);
    }
}

