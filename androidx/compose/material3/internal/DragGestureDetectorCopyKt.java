package androidx.compose.material3.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.LongRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import w0.r0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001Aa\u0010\u0010\u001A\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u000326\u0010\r\u001A2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\f0\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u001E\u0010\u0014\u001A\u00020\n*\u00020\u00112\u0006\u0010\u0004\u001A\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", "name", "change", "", "overSlop", "", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalPointerSlopOrCancellation", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDragGestureDetectorCopy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/internal/DragGestureDetectorCopyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,136:1\n74#1,10:137\n84#1,4:156\n88#1,29:167\n116#2,2:147\n33#2,6:149\n118#2:155\n33#2,6:160\n118#2:166\n116#2,2:196\n33#2,6:198\n118#2:204\n116#2,2:205\n33#2,6:207\n118#2:213\n116#2,2:214\n33#2,6:216\n118#2:222\n158#3:223\n148#3:224\n77#4:225\n*S KotlinDebug\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/internal/DragGestureDetectorCopyKt\n*L\n42#1:137,10\n42#1:156,4\n42#1:167,29\n42#1:147,2\n42#1:149,6\n42#1:155\n42#1:160,6\n42#1:166\n83#1:196,2\n83#1:198,6\n83#1:204\n87#1:205,2\n87#1:207,6\n87#1:213\n124#1:214,2\n124#1:216,6\n124#1:222\n126#1:223\n127#1:224\n128#1:225\n*E\n"})
public final class DragGestureDetectorCopyKt {
    public static final float a;

    static {
        DragGestureDetectorCopyKt.a = 0.006944f;
    }

    @Nullable
    public static final Object awaitHorizontalPointerSlopOrCancellation-gDDlDlE(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, int v1, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object7;
        Object object5;
        LongRef ref$LongRef3;
        float f6;
        r0 r02;
        float f5;
        float f2;
        float f1;
        r0 r01;
        LongRef ref$LongRef1;
        Function2 function21;
        AwaitPointerEventScope awaitPointerEventScope1;
        r0 r00;
        if(continuation0 instanceof r0) {
            r00 = (r0)continuation0;
            int v2 = r00.v;
            if((v2 & 0x80000000) == 0) {
                r00 = new r0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                r00.v = v2 ^ 0x80000000;
            }
        }
        else {
            r00 = new r0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = r00.u;
        Object object1 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(r00.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                List list0 = awaitPointerEventScope0.getCurrentEvent().getChanges();
                int v3 = list0.size();
                for(int v4 = 0; true; ++v4) {
                    Object object2 = null;
                    if(v4 >= v3) {
                        break;
                    }
                    Object object3 = list0.get(v4);
                    if(PointerId.equals-impl0(((PointerInputChange)object3).getId-J3iCeTQ(), v)) {
                        object2 = object3;
                        break;
                    }
                }
                if(((PointerInputChange)object2) != null && ((PointerInputChange)object2).getPressed()) {
                    float f = DragGestureDetectorCopyKt.pointerSlop-E8SPZFQ(awaitPointerEventScope0.getViewConfiguration(), v1);
                    LongRef ref$LongRef0 = new LongRef();
                    ref$LongRef0.element = v;
                    awaitPointerEventScope1 = awaitPointerEventScope0;
                    function21 = function20;
                    ref$LongRef1 = ref$LongRef0;
                    r01 = r00;
                    f1 = f;
                    f2 = 0.0f;
                    goto label_67;
                }
                break;
            }
            case 1: {
                float f3 = r00.t;
                float f4 = r00.s;
                LongRef ref$LongRef2 = r00.q;
                AwaitPointerEventScope awaitPointerEventScope2 = r00.p;
                Function2 function22 = r00.o;
                ResultKt.throwOnFailure(object0);
                f5 = f3;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                r02 = r00;
                f6 = f4;
                function21 = function22;
                ref$LongRef3 = ref$LongRef2;
                goto label_82;
            }
            case 2: {
                float f7 = r00.t;
                float f8 = r00.s;
                PointerInputChange pointerInputChange0 = r00.r;
                LongRef ref$LongRef4 = r00.q;
                AwaitPointerEventScope awaitPointerEventScope3 = r00.p;
                Function2 function23 = r00.o;
                ResultKt.throwOnFailure(object0);
                f2 = f7;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                ref$LongRef3 = ref$LongRef4;
                r02 = r00;
                f1 = f8;
                function21 = function23;
                while(true) {
                    if(pointerInputChange0.isConsumed()) {
                        return null;
                    }
                    while(true) {
                        r01 = r02;
                        ref$LongRef1 = ref$LongRef3;
                    label_67:
                        r01.o = function21;
                        r01.p = awaitPointerEventScope1;
                        r01.q = ref$LongRef1;
                        r01.r = null;
                        r01.s = f1;
                        r01.t = f2;
                        r01.v = 1;
                        Object object4 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope1, null, r01, 1, null);
                        if(object4 == object1) {
                            return object1;
                        }
                        f5 = f2;
                        object0 = object4;
                        ref$LongRef3 = ref$LongRef1;
                        r02 = r01;
                        f6 = f1;
                    label_82:
                        List list1 = ((PointerEvent)object0).getChanges();
                        int v5 = list1.size();
                        int v6 = 0;
                        while(true) {
                            object5 = null;
                            if(v6 < v5) {
                                Object object6 = list1.get(v6);
                                if(PointerId.equals-impl0(((PointerInputChange)object6).getId-J3iCeTQ(), ref$LongRef3.element)) {
                                    object5 = object6;
                                }
                                else {
                                    ++v6;
                                    continue;
                                }
                            }
                            break;
                        }
                        Intrinsics.checkNotNull(object5);
                        if(!((PointerInputChange)object5).isConsumed()) {
                            if(PointerEventKt.changedToUpIgnoreConsumed(((PointerInputChange)object5))) {
                                List list2 = ((PointerEvent)object0).getChanges();
                                int v7 = list2.size();
                                int v8 = 0;
                                while(true) {
                                    object7 = null;
                                    if(v8 < v7) {
                                        Object object8 = list2.get(v8);
                                        if(((PointerInputChange)object8).getPressed()) {
                                            object7 = object8;
                                        }
                                        else {
                                            ++v8;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                if(((PointerInputChange)object7) != null) {
                                    ref$LongRef3.element = ((PointerInputChange)object7).getId-J3iCeTQ();
                                    f2 = f5;
                                    f1 = f6;
                                    continue;
                                }
                            }
                            else {
                                f2 = Offset.getX-impl(((PointerInputChange)object5).getPosition-F1C5BW0()) - Offset.getX-impl(((PointerInputChange)object5).getPreviousPosition-F1C5BW0()) + f5;
                                if(Math.abs(f2) < f6) {
                                    r02.o = function21;
                                    r02.p = awaitPointerEventScope1;
                                    r02.q = ref$LongRef3;
                                    r02.r = (PointerInputChange)object5;
                                    r02.s = f6;
                                    r02.t = f2;
                                    r02.v = 2;
                                    if(awaitPointerEventScope1.awaitPointerEvent(PointerEventPass.Final, r02) == object1) {
                                        return object1;
                                    }
                                    f1 = f6;
                                    pointerInputChange0 = (PointerInputChange)object5;
                                    break;
                                }
                                else {
                                    function21.invoke(((PointerInputChange)object5), Boxing.boxFloat(f2 - Math.signum(f2) * f6));
                                    if(!((PointerInputChange)object5).isConsumed()) {
                                        f1 = f6;
                                        r01 = r02;
                                        ref$LongRef1 = ref$LongRef3;
                                        f2 = 0.0f;
                                        goto label_67;
                                    }
                                    return (PointerInputChange)object5;
                                }
                            }
                        }
                        break alab1;
                    }
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return null;
    }

    // 去混淆评级： 低(40)
    public static final float pointerSlop-E8SPZFQ(@NotNull ViewConfiguration viewConfiguration0, int v) {
        return PointerType.equals-impl0(v, 2) ? viewConfiguration0.getTouchSlop() * DragGestureDetectorCopyKt.a : viewConfiguration0.getTouchSlop();
    }
}

