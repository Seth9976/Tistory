package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import z.m1;
import z.n1;
import z.o1;
import z.p1;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0000\u001A\u0012\u0010\u0003\u001A\u00020\u0004*\u00020\u0002H\u0080@¢\u0006\u0002\u0010\u0005\u001A\u0012\u0010\u0003\u001A\u00020\u0004*\u00020\u0006H\u0080@¢\u0006\u0002\u0010\u0007\u001A;\u0010\b\u001A\u00020\u0004*\u00020\u00062\'\u0010\t\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000B\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0086@¢\u0006\u0002\u0010\u000E\u001A;\u0010\u000F\u001A\u00020\u0004*\u00020\u00062\'\u0010\t\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000B\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0087@¢\u0006\u0002\u0010\u000E¨\u0006\u0010"}, d2 = {"allPointersUp", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "awaitAllPointersUp", "", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitEachGesture", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forEachGesture", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nForEachGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,122:1\n329#2:123\n329#2:142\n101#3,2:124\n33#3,6:126\n103#3:132\n101#3,2:133\n33#3,6:135\n103#3:141\n*S KotlinDebug\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n*L\n45#1:123\n100#1:142\n71#1:124,2\n71#1:126,6\n71#1:132\n87#1:133,2\n87#1:135,6\n87#1:141\n*E\n"})
public final class ForEachGestureKt {
    public static final boolean allPointersUp(@NotNull AwaitPointerEventScope awaitPointerEventScope0) {
        List list0 = awaitPointerEventScope0.getCurrentEvent().getChanges();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((PointerInputChange)list0.get(v1)).getPressed()) {
                return 0;
            }
        }
        return 1;
    }

    @Nullable
    public static final Object awaitAllPointersUp(@NotNull AwaitPointerEventScope awaitPointerEventScope0, @NotNull Continuation continuation0) {
        n1 n10;
        if(continuation0 instanceof n1) {
            n10 = (n1)continuation0;
            int v = n10.q;
            if((v & 0x80000000) == 0) {
                n10 = new n1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                n10.q = v ^ 0x80000000;
            }
        }
        else {
            n10 = new n1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = n10.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(n10.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(!ForEachGestureKt.allPointersUp(awaitPointerEventScope0)) {
                    goto label_25;
                }
                return Unit.INSTANCE;
            }
            case 1: {
                awaitPointerEventScope0 = n10.o;
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
            while(true) {
                if(v2 >= v1) {
                    break alab1;
                }
                if(!((PointerInputChange)list0.get(v2)).getPressed()) {
                    ++v2;
                    continue;
                }
            label_25:
                n10.o = awaitPointerEventScope0;
                n10.q = 1;
                object0 = awaitPointerEventScope0.awaitPointerEvent(PointerEventPass.Final, n10);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Object awaitAllPointersUp(@NotNull PointerInputScope pointerInputScope0, @NotNull Continuation continuation0) {
        Object object0 = pointerInputScope0.awaitPointerEventScope(new m1(2, null), continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Nullable
    public static final Object awaitEachGesture(@NotNull PointerInputScope pointerInputScope0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object0 = pointerInputScope0.awaitPointerEventScope(new o1(continuation0.getContext(), function20, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Deprecated(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @ReplaceWith(expression = "awaitEachGesture(block)", imports = {}))
    @Nullable
    public static final Object forEachGesture(@NotNull PointerInputScope pointerInputScope0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        PointerInputScope pointerInputScope1;
        CoroutineContext coroutineContext1;
        Object object1;
        Object object0;
        p1 p10;
        if(continuation0 instanceof p1) {
            p10 = (p1)continuation0;
            int v = p10.s;
            if((v & 0x80000000) == 0) {
                p10 = new p1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                p10.s = v ^ 0x80000000;
            }
        }
        else {
            p10 = new p1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        try {
            object0 = p10.r;
            object1 = a.getCOROUTINE_SUSPENDED();
            switch(p10.s) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_16;
                }
                case 2: {
                    goto label_21;
                }
                case 3: {
                    goto label_26;
                }
            }
        }
        catch(CancellationException cancellationException0) {
            goto label_54;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ResultKt.throwOnFailure(object0);
        CoroutineContext coroutineContext0 = p10.getContext();
        goto label_32;
        try {
        label_16:
            coroutineContext1 = p10.q;
            function20 = p10.p;
            pointerInputScope1 = p10.o;
            ResultKt.throwOnFailure(object0);
            goto label_47;
        label_21:
            coroutineContext1 = p10.q;
            function20 = p10.p;
            pointerInputScope1 = p10.o;
            ResultKt.throwOnFailure(object0);
            goto label_30;
        }
        catch(CancellationException cancellationException0) {
            goto label_54;
        }
    label_26:
        coroutineContext1 = p10.q;
        function20 = p10.p;
        pointerInputScope1 = p10.o;
        ResultKt.throwOnFailure(object0);
        do {
            while(true) {
            label_30:
                coroutineContext0 = coroutineContext1;
                pointerInputScope0 = pointerInputScope1;
            label_32:
                if(!JobKt.isActive(coroutineContext0)) {
                    return Unit.INSTANCE;
                }
                try {
                    p10.o = pointerInputScope0;
                    p10.p = function20;
                    p10.q = coroutineContext0;
                    p10.s = 1;
                    if(function20.invoke(pointerInputScope0, p10) == object1) {
                        return object1;
                    }
                }
                catch(CancellationException cancellationException1) {
                    pointerInputScope1 = pointerInputScope0;
                    coroutineContext1 = coroutineContext0;
                    cancellationException0 = cancellationException1;
                    break;
                }
                pointerInputScope1 = pointerInputScope0;
                coroutineContext1 = coroutineContext0;
                try {
                label_47:
                    p10.o = pointerInputScope1;
                    p10.p = function20;
                    p10.q = coroutineContext1;
                    p10.s = 2;
                    if(ForEachGestureKt.awaitAllPointersUp(pointerInputScope1, p10) != object1) {
                        continue;
                    }
                    return object1;
                }
                catch(CancellationException cancellationException0) {
                }
                break;
            }
        label_54:
            if(!JobKt.isActive(coroutineContext1)) {
                throw cancellationException0;
            }
            p10.o = pointerInputScope1;
            p10.p = function20;
            p10.q = coroutineContext1;
            p10.s = 3;
        }
        while(ForEachGestureKt.awaitAllPointersUp(pointerInputScope1, p10) != object1);
        return object1;
    }
}

