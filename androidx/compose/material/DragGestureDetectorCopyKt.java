package androidx.compose.material;

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
import p0.l3;
import qd.a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001Aa\u0010\u0010\u001A\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u000326\u0010\r\u001A2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\f0\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u001E\u0010\u0014\u001A\u00020\n*\u00020\u00112\u0006\u0010\u0004\u001A\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", "name", "change", "", "overSlop", "", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalPointerSlopOrCancellation", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDragGestureDetectorCopy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material/DragGestureDetectorCopyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,115:1\n53#1,10:116\n63#1,4:135\n67#1,29:146\n116#2,2:126\n33#2,6:128\n118#2:134\n33#2,6:139\n118#2:145\n116#2,2:175\n33#2,6:177\n118#2:183\n116#2,2:184\n33#2,6:186\n118#2:192\n116#2,2:193\n33#2,6:195\n118#2:201\n164#3:202\n154#3:203\n81#4:204\n*S KotlinDebug\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material/DragGestureDetectorCopyKt\n*L\n40#1:116,10\n40#1:135,4\n40#1:146,29\n40#1:126,2\n40#1:128,6\n40#1:134\n40#1:139,6\n40#1:145\n62#1:175,2\n62#1:177,6\n62#1:183\n66#1:184,2\n66#1:186,6\n66#1:192\n103#1:193,2\n103#1:195,6\n103#1:201\n105#1:202\n106#1:203\n107#1:204\n*E\n"})
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
        l3 l32;
        float f5;
        float f2;
        float f1;
        l3 l31;
        LongRef ref$LongRef1;
        Function2 function21;
        AwaitPointerEventScope awaitPointerEventScope1;
        l3 l30;
        if(continuation0 instanceof l3) {
            l30 = (l3)continuation0;
            int v2 = l30.v;
            if((v2 & 0x80000000) == 0) {
                l30 = new l3(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                l30.v = v2 ^ 0x80000000;
            }
        }
        else {
            l30 = new l3(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = l30.u;
        Object object1 = a.getCOROUTINE_SUSPENDED();
    alab1:
        switch(l30.v) {
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
                    l31 = l30;
                    f1 = f;
                    f2 = 0.0f;
                    goto label_67;
                }
                break;
            }
            case 1: {
                float f3 = l30.t;
                float f4 = l30.s;
                LongRef ref$LongRef2 = l30.q;
                AwaitPointerEventScope awaitPointerEventScope2 = l30.p;
                Function2 function22 = l30.o;
                ResultKt.throwOnFailure(object0);
                f5 = f3;
                awaitPointerEventScope1 = awaitPointerEventScope2;
                l32 = l30;
                f6 = f4;
                function21 = function22;
                ref$LongRef3 = ref$LongRef2;
                goto label_82;
            }
            case 2: {
                float f7 = l30.t;
                float f8 = l30.s;
                PointerInputChange pointerInputChange0 = l30.r;
                LongRef ref$LongRef4 = l30.q;
                AwaitPointerEventScope awaitPointerEventScope3 = l30.p;
                Function2 function23 = l30.o;
                ResultKt.throwOnFailure(object0);
                f2 = f7;
                awaitPointerEventScope1 = awaitPointerEventScope3;
                ref$LongRef3 = ref$LongRef4;
                l32 = l30;
                f1 = f8;
                function21 = function23;
                while(true) {
                    if(pointerInputChange0.isConsumed()) {
                        return null;
                    }
                    while(true) {
                        l31 = l32;
                        ref$LongRef1 = ref$LongRef3;
                    label_67:
                        l31.o = function21;
                        l31.p = awaitPointerEventScope1;
                        l31.q = ref$LongRef1;
                        l31.r = null;
                        l31.s = f1;
                        l31.t = f2;
                        l31.v = 1;
                        Object object4 = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope1, null, l31, 1, null);
                        if(object4 == object1) {
                            return object1;
                        }
                        f5 = f2;
                        object0 = object4;
                        ref$LongRef3 = ref$LongRef1;
                        l32 = l31;
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
                                    l32.o = function21;
                                    l32.p = awaitPointerEventScope1;
                                    l32.q = ref$LongRef3;
                                    l32.r = (PointerInputChange)object5;
                                    l32.s = f6;
                                    l32.t = f2;
                                    l32.v = 2;
                                    if(awaitPointerEventScope1.awaitPointerEvent(PointerEventPass.Final, l32) == object1) {
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
                                        l31 = l32;
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

