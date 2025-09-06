package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import z.q3;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\u001A\u0080\u0001\u0010\u000E\u001A\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012`\u0010\r\u001A\\\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\f0\u0003H\u0086@¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u0011\u0010\u0011\u001A\u00020\t*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001A\u0011\u0010\u0013\u001A\u00020\t*\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012\u001A\u0011\u0010\u0014\u001A\u00020\u0004*\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001A\u001B\u0010\u0017\u001A\u00020\t*\u00020\u00102\b\b\u0002\u0010\u0016\u001A\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001A\u001B\u0010\u0019\u001A\u00020\u0004*\u00020\u00102\b\b\u0002\u0010\u0016\u001A\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "panZoomLock", "Lkotlin/Function4;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "centroid", "pan", "", "zoom", "rotation", "", "onGesture", "detectTransformGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "calculateRotation", "(Landroidx/compose/ui/input/pointer/PointerEvent;)F", "calculateZoom", "calculatePan", "(Landroidx/compose/ui/input/pointer/PointerEvent;)J", "useCurrent", "calculateCentroidSize", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)F", "calculateCentroid", "(Landroidx/compose/ui/input/pointer/PointerEvent;Z)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n132#2,3:256\n33#2,4:259\n135#2,2:263\n38#2:265\n137#2:266\n33#2,6:267\n33#2,6:273\n33#2,6:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,4\n116#1:263,2\n116#1:265\n116#1:266\n131#1:267,6\n216#1:273,6\n242#1:279,6\n*E\n"})
public final class TransformGestureDetectorKt {
    public static final float a(long v) {
        return Offset.getX-impl(v) == 0.0f && Offset.getY-impl(v) == 0.0f ? 0.0f : -((float)Math.atan2(Offset.getX-impl(v), Offset.getY-impl(v))) * 180.0f / 3.141593f;
    }

    public static final long calculateCentroid(@NotNull PointerEvent pointerEvent0, boolean z) {
        long v = 0L;
        List list0 = pointerEvent0.getChanges();
        int v1 = list0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v2);
            if(pointerInputChange0.getPressed() && pointerInputChange0.getPreviousPressed()) {
                v = Offset.plus-MK-Hz9U(v, (z ? pointerInputChange0.getPosition-F1C5BW0() : pointerInputChange0.getPreviousPosition-F1C5BW0()));
                ++v3;
            }
        }
        return v3 == 0 ? 0x7FC000007FC00000L : Offset.div-tuRUvjQ(v, ((float)v3));
    }

    public static long calculateCentroid$default(PointerEvent pointerEvent0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        return TransformGestureDetectorKt.calculateCentroid(pointerEvent0, z);
    }

    public static final float calculateCentroidSize(@NotNull PointerEvent pointerEvent0, boolean z) {
        long v = TransformGestureDetectorKt.calculateCentroid(pointerEvent0, z);
        float f = 0.0f;
        if(Offset.equals-impl0(v, 0x7FC000007FC00000L)) {
            return 0.0f;
        }
        List list0 = pointerEvent0.getChanges();
        int v1 = list0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v2);
            if(pointerInputChange0.getPressed() && pointerInputChange0.getPreviousPressed()) {
                ++v3;
                f = Offset.getDistance-impl(Offset.minus-MK-Hz9U((z ? pointerInputChange0.getPosition-F1C5BW0() : pointerInputChange0.getPreviousPosition-F1C5BW0()), v)) + f;
            }
        }
        return f / ((float)v3);
    }

    public static float calculateCentroidSize$default(PointerEvent pointerEvent0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        return TransformGestureDetectorKt.calculateCentroidSize(pointerEvent0, z);
    }

    // 去混淆评级： 低(30)
    public static final long calculatePan(@NotNull PointerEvent pointerEvent0) {
        long v = TransformGestureDetectorKt.calculateCentroid(pointerEvent0, true);
        return Offset.equals-impl0(v, 0x7FC000007FC00000L) ? 0L : Offset.minus-MK-Hz9U(v, TransformGestureDetectorKt.calculateCentroid(pointerEvent0, false));
    }

    public static final float calculateRotation(@NotNull PointerEvent pointerEvent0) {
        List list0 = pointerEvent0.getChanges();
        int v = list0.size();
        int v3 = 0;
        for(int v2 = 0; true; ++v2) {
            int v4 = 1;
            if(v2 >= v) {
                break;
            }
            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v2);
            if(!pointerInputChange0.getPreviousPressed() || !pointerInputChange0.getPressed()) {
                v4 = 0;
            }
            v3 += v4;
        }
        if(v3 < 2) {
            return 0.0f;
        }
        long v5 = TransformGestureDetectorKt.calculateCentroid(pointerEvent0, true);
        long v6 = TransformGestureDetectorKt.calculateCentroid(pointerEvent0, false);
        List list1 = pointerEvent0.getChanges();
        int v7 = list1.size();
        float f = 0.0f;
        float f1 = 0.0f;
        for(int v1 = 0; v1 < v7; ++v1) {
            PointerInputChange pointerInputChange1 = (PointerInputChange)list1.get(v1);
            if(pointerInputChange1.getPressed() && pointerInputChange1.getPreviousPressed()) {
                long v8 = Offset.minus-MK-Hz9U(pointerInputChange1.getPreviousPosition-F1C5BW0(), v6);
                long v9 = Offset.minus-MK-Hz9U(pointerInputChange1.getPosition-F1C5BW0(), v5);
                float f2 = TransformGestureDetectorKt.a(v9) - TransformGestureDetectorKt.a(v8);
                float f3 = Offset.getDistance-impl(Offset.plus-MK-Hz9U(v9, v8));
                if(Float.compare(f2, 180.0f) > 0) {
                    f2 -= 360.0f;
                }
                else if(f2 < -180.0f) {
                    f2 += 360.0f;
                }
                f1 += f2 * (f3 / 2.0f);
                f += f3 / 2.0f;
            }
        }
        return f == 0.0f ? 0.0f : f1 / f;
    }

    public static final float calculateZoom(@NotNull PointerEvent pointerEvent0) {
        float f = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent0, true);
        float f1 = TransformGestureDetectorKt.calculateCentroidSize(pointerEvent0, false);
        return f != 0.0f && f1 != 0.0f ? f / f1 : 1.0f;
    }

    @Nullable
    public static final Object detectTransformGestures(@NotNull PointerInputScope pointerInputScope0, boolean z, @NotNull Function4 function40, @NotNull Continuation continuation0) {
        Object object0 = ForEachGestureKt.awaitEachGesture(pointerInputScope0, new q3(z, function40, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object detectTransformGestures$default(PointerInputScope pointerInputScope0, boolean z, Function4 function40, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return TransformGestureDetectorKt.detectTransformGestures(pointerInputScope0, z, function40, continuation0);
    }
}

