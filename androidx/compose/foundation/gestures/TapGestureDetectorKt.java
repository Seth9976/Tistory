package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import z.h1;
import z.n3;
import z.o3;
import z.r2;
import z.s2;
import z.t2;
import z.z2;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u008D\u0001\u0010\r\u001A\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001A\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012/\b\u0002\u0010\u000B\u001A)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001A\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@¢\u0006\u0004\b\r\u0010\u000E\u001A]\u0010\u000F\u001A\u00020\u0003*\u00020\u00002/\b\u0002\u0010\u000B\u001A)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001A\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u000F\u0010\u0010\u001A\u001E\u0010\u0015\u001A\u00020\u0014*\u00020\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u0012H\u0087@¢\u0006\u0004\b\u0015\u0010\u0016\u001A(\u0010\u0015\u001A\u00020\u0014*\u00020\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0086@¢\u0006\u0004\b\u0015\u0010\u0019\u001A\u0016\u0010\u001A\u001A\u0004\u0018\u00010\u0014*\u00020\u0011H\u0087@¢\u0006\u0004\b\u001A\u0010\u001B\u001A \u0010\u001A\u001A\u0004\u0018\u00010\u0014*\u00020\u00112\b\b\u0002\u0010\u0018\u001A\u00020\u0017H\u0086@¢\u0006\u0004\b\u001A\u0010\u001C¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onPress", "onTap", "detectTapGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTapAndPress", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "requireUnconsumed", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "awaitFirstDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForUpOrCancellation", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,376:1\n33#2,6:377\n101#2,2:383\n33#2,6:385\n103#2:391\n86#2,2:392\n33#2,6:394\n88#2:400\n86#2,2:401\n33#2,6:403\n88#2:409\n101#2,2:410\n33#2,6:412\n103#2:418\n101#2,2:419\n33#2,6:421\n103#2:427\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n*L\n196#1:377,6\n197#1:383,2\n197#1:385,6\n197#1:391\n281#1:392,2\n281#1:394,6\n281#1:400\n306#1:401,2\n306#1:403,6\n306#1:409\n311#1:410,2\n311#1:412,6\n311#1:418\n321#1:419,2\n321#1:421,6\n321#1:427\n*E\n"})
public final class TapGestureDetectorKt {
    public static final h1 a;

    static {
        TapGestureDetectorKt.a = new h1(3, 4, null);
    }

    public static final Object access$awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope0, PointerInputChange pointerInputChange0, Continuation continuation0) {
        return awaitPointerEventScope0.withTimeoutOrNull(awaitPointerEventScope0.getViewConfiguration().getDoubleTapTimeoutMillis(), new s2(pointerInputChange0, null), continuation0);
    }

    public static final Object access$consumeUntilUp(AwaitPointerEventScope awaitPointerEventScope0, Continuation continuation0) {
        t2 t20;
        if(continuation0 instanceof t2) {
            t20 = (t2)continuation0;
            int v = t20.q;
            if((v & 0x80000000) == 0) {
                t20 = new t2(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                t20.q = v ^ 0x80000000;
            }
        }
        else {
            t20 = new t2(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = t20.p;
        Unit unit0 = a.getCOROUTINE_SUSPENDED();
        switch(t20.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                goto label_31;
            }
            case 1: {
                awaitPointerEventScope0 = t20.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            List list0 = ((PointerEvent)object0).getChanges();
            int v1 = list0.size();
            int v2 = 0;
            for(int v3 = 0; v3 < v1; ++v3) {
                ((PointerInputChange)list0.get(v3)).consume();
            }
            List list1 = ((PointerEvent)object0).getChanges();
            int v4 = list1.size();
            while(true) {
                if(v2 >= v4) {
                    break alab1;
                }
                if(!((PointerInputChange)list1.get(v2)).getPressed()) {
                    ++v2;
                    continue;
                }
            label_31:
                t20.o = awaitPointerEventScope0;
                t20.q = 1;
                object0 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope0, null, t20, 1, null);
                if(object0 != unit0) {
                    break;
                }
                return unit0;
            }
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Object awaitFirstDown(@NotNull AwaitPointerEventScope awaitPointerEventScope0, boolean z, @NotNull PointerEventPass pointerEventPass0, @NotNull Continuation continuation0) {
        r2 r20;
        if(continuation0 instanceof r2) {
            r20 = (r2)continuation0;
            int v = r20.s;
            if((v & 0x80000000) == 0) {
                r20 = new r2(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                r20.s = v ^ 0x80000000;
            }
        }
        else {
            r20 = new r2(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = r20.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(r20.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                goto label_36;
            }
            case 1: {
                boolean z1 = r20.q;
                PointerEventPass pointerEventPass1 = r20.p;
                AwaitPointerEventScope awaitPointerEventScope1 = r20.o;
                ResultKt.throwOnFailure(object0);
                z = z1;
                awaitPointerEventScope0 = awaitPointerEventScope1;
                pointerEventPass0 = pointerEventPass1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            List list0 = ((PointerEvent)object0).getChanges();
            int v1 = list0.size();
            int v2 = 0;
            while(true) {
                boolean z2 = true;
                if(v2 < v1) {
                    PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v2);
                    if((z ? PointerEventKt.changedToDown(pointerInputChange0) : PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange0))) {
                        ++v2;
                        continue;
                    }
                    else {
                        z2 = false;
                    }
                }
                break;
            }
            if(z2) {
                return ((PointerEvent)object0).getChanges().get(0);
            }
        label_36:
            r20.o = awaitPointerEventScope0;
            r20.p = pointerEventPass0;
            r20.q = z;
            r20.s = 1;
            object0 = awaitPointerEventScope0.awaitPointerEvent(pointerEventPass0, r20);
        }
        while(object0 != object1);
        return object1;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with PointerEventPass instead.")
    public static final Object awaitFirstDown(AwaitPointerEventScope awaitPointerEventScope0, boolean z, Continuation continuation0) {
        return TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope0, z, PointerEventPass.Main, continuation0);
    }

    public static Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope0, boolean z, PointerEventPass pointerEventPass0, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            pointerEventPass0 = PointerEventPass.Main;
        }
        return TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope0, z, pointerEventPass0, continuation0);
    }

    public static Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope0, boolean z, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        return TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope0, z, continuation0);
    }

    @Nullable
    public static final Object detectTapAndPress(@NotNull PointerInputScope pointerInputScope0, @NotNull Function3 function30, @Nullable Function1 function10, @NotNull Continuation continuation0) {
        Object object0 = CoroutineScopeKt.coroutineScope(new z2(pointerInputScope0, function30, function10, new PressGestureScopeImpl(pointerInputScope0), null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object detectTapAndPress$default(PointerInputScope pointerInputScope0, Function3 function30, Function1 function10, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            function30 = TapGestureDetectorKt.a;
        }
        if((v & 2) != 0) {
            function10 = null;
        }
        return TapGestureDetectorKt.detectTapAndPress(pointerInputScope0, function30, function10, continuation0);
    }

    @Nullable
    public static final Object detectTapGestures(@NotNull PointerInputScope pointerInputScope0, @Nullable Function1 function10, @Nullable Function1 function11, @NotNull Function3 function30, @Nullable Function1 function12, @NotNull Continuation continuation0) {
        Object object0 = CoroutineScopeKt.coroutineScope(new n3(pointerInputScope0, function11, function10, function30, function12, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object detectTapGestures$default(PointerInputScope pointerInputScope0, Function1 function10, Function1 function11, Function3 function30, Function1 function12, Continuation continuation0, int v, Object object0) {
        Function1 function13 = (v & 1) == 0 ? function10 : null;
        Function1 function14 = (v & 2) == 0 ? function11 : null;
        if((v & 4) != 0) {
            function30 = TapGestureDetectorKt.a;
        }
        return (v & 8) == 0 ? TapGestureDetectorKt.detectTapGestures(pointerInputScope0, function13, function14, function30, function12, continuation0) : TapGestureDetectorKt.detectTapGestures(pointerInputScope0, function13, function14, function30, null, continuation0);
    }

    @Nullable
    public static final Object waitForUpOrCancellation(@NotNull AwaitPointerEventScope awaitPointerEventScope0, @NotNull PointerEventPass pointerEventPass0, @NotNull Continuation continuation0) {
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerEventPass pointerEventPass2;
        PointerEventPass pointerEventPass1;
        o3 o31;
        AwaitPointerEventScope awaitPointerEventScope1;
        o3 o30;
        if(continuation0 instanceof o3) {
            o30 = (o3)continuation0;
            int v = o30.r;
            if((v & 0x80000000) == 0) {
                o30 = new o3(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                o30.r = v ^ 0x80000000;
            }
        }
        else {
            o30 = new o3(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = o30.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(o30.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                awaitPointerEventScope1 = awaitPointerEventScope0;
                o31 = o30;
                pointerEventPass1 = pointerEventPass0;
                goto label_36;
            }
            case 1: {
                pointerEventPass2 = o30.p;
                awaitPointerEventScope2 = o30.o;
                ResultKt.throwOnFailure(object0);
                goto label_46;
            }
            case 2: {
                pointerEventPass2 = o30.p;
                awaitPointerEventScope2 = o30.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            o31 = o30;
            pointerEventPass1 = pointerEventPass2;
            List list0 = ((PointerEvent)object0).getChanges();
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((PointerInputChange)list0.get(v2)).isConsumed()) {
                    return null;
                }
            }
            awaitPointerEventScope1 = awaitPointerEventScope2;
        label_36:
            o31.o = awaitPointerEventScope1;
            o31.p = pointerEventPass1;
            o31.r = 1;
            Object object2 = awaitPointerEventScope1.awaitPointerEvent(pointerEventPass1, o31);
            if(object2 == object1) {
                return object1;
            }
            awaitPointerEventScope2 = awaitPointerEventScope1;
            object0 = object2;
            pointerEventPass2 = pointerEventPass1;
            o30 = o31;
        label_46:
            List list1 = ((PointerEvent)object0).getChanges();
            int v3 = list1.size();
            int v4 = 0;
            while(true) {
                if(v4 >= v3) {
                    break alab1;
                }
                if(PointerEventKt.changedToUp(((PointerInputChange)list1.get(v4)))) {
                    ++v4;
                    continue;
                }
                List list2 = ((PointerEvent)object0).getChanges();
                int v5 = list2.size();
                int v6 = 0;
                while(v6 < v5) {
                    PointerInputChange pointerInputChange0 = (PointerInputChange)list2.get(v6);
                    if(!pointerInputChange0.isConsumed() && !PointerEventKt.isOutOfBounds-jwHxaWs(pointerInputChange0, awaitPointerEventScope2.getSize-YbymL2g(), awaitPointerEventScope2.getExtendedTouchPadding-NH-jbRc())) {
                        ++v6;
                        continue;
                    }
                    return null;
                }
                o30.o = awaitPointerEventScope2;
                o30.p = pointerEventPass2;
                o30.r = 2;
                object0 = awaitPointerEventScope2.awaitPointerEvent(PointerEventPass.Final, o30);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
        }
        return ((PointerEvent)object0).getChanges().get(0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with PointerEventPass instead.")
    public static final Object waitForUpOrCancellation(AwaitPointerEventScope awaitPointerEventScope0, Continuation continuation0) {
        return TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope0, PointerEventPass.Main, continuation0);
    }

    public static Object waitForUpOrCancellation$default(AwaitPointerEventScope awaitPointerEventScope0, PointerEventPass pointerEventPass0, Continuation continuation0, int v, Object object0) {
        if((v & 1) != 0) {
            pointerEventPass0 = PointerEventPass.Main;
        }
        return TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope0, pointerEventPass0, continuation0);
    }
}

