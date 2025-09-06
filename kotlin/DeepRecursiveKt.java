package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import qd.a;

@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A4\u0010\u0004\u001A\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001A\u00028\u0000H\u0087\u0002¢\u0006\u0004\b\u0004\u0010\u0005*r\b\u0002\u0010\u000B\"5\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\t\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\n25\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\t\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\n¨\u0006\f"}, d2 = {"T", "R", "Lkotlin/DeepRecursiveFunction;", "value", "invoke", "(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlin/DeepRecursiveScope;", "", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "DeepRecursiveFunctionBlock", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class DeepRecursiveKt {
    public static final Object a;

    static {
        DeepRecursiveKt.a = a.getCOROUTINE_SUSPENDED();
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Object invoke(@NotNull DeepRecursiveFunction deepRecursiveFunction0, Object object0) {
        Object object3;
        Object object1;
        Intrinsics.checkNotNullParameter(deepRecursiveFunction0, "<this>");
        Function3 function30 = deepRecursiveFunction0.getBlock$kotlin_stdlib();
        Intrinsics.checkNotNullParameter(function30, "block");
        md.a a0 = new md.a(null);  // 初始化器: Lkotlin/DeepRecursiveScope;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        a0.a = function30;
        a0.b = object0;
        Intrinsics.checkNotNull(a0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        a0.c = a0;
        a0.d = DeepRecursiveKt.a;
        while(true) {
            object1 = a0.d;
            Continuation continuation0 = a0.c;
            if(continuation0 == null) {
                break;
            }
            if(Result.equals-impl0(DeepRecursiveKt.a, object1)) {
                try {
                    Function3 function31 = a0.a;
                    Object object2 = a0.b;
                    object3 = function31 instanceof BaseContinuationImpl ? ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function31, 3)).invoke(a0, object2, continuation0) : IntrinsicsKt__IntrinsicsJvmKt.wrapWithContinuationImpl(function31, a0, object2, continuation0);
                }
                catch(Throwable throwable0) {
                    continuation0.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable0)));
                    continue;
                }
                if(object3 == a.getCOROUTINE_SUSPENDED()) {
                    continue;
                }
                continuation0.resumeWith(object3);
            }
            else {
                a0.d = DeepRecursiveKt.a;
                continuation0.resumeWith(object1);
            }
        }
        ResultKt.throwOnFailure(object1);
        return object1;
    }
}

