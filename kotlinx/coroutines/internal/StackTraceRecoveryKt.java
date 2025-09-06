package kotlinx.coroutines.internal;

import _COROUTINE.ArtificialStackFrames;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A!\u0010\u0003\u001A\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001A\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A.\u0010\u0003\u001A\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001A\u00028\u00002\n\u0010\u0006\u001A\u0006\u0012\u0002\b\u00030\u0005H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0007\u001A\u001B\u0010\t\u001A\u00020\b2\u0006\u0010\u0002\u001A\u00020\u0000H\u0080Hø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001A\"\u0010\u000B\u001A\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001A\u00028\u0000H\u0081\b¢\u0006\u0004\b\u000B\u0010\u0004\u001A!\u0010\f\u001A\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001A\u00028\u0000H\u0001¢\u0006\u0004\b\f\u0010\u0004\u001A\u0017\u0010\u0010\u001A\u00020\u000F*\u00060\rj\u0002`\u000EH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001A\u001B\u0010\u0014\u001A\u00020\u0013*\u00020\u00002\u0006\u0010\u0012\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015*\f\b\u0000\u0010\u0017\"\u00020\u00162\u00020\u0016*\f\b\u0000\u0010\u0018\"\u00020\r2\u00020\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"", "E", "exception", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "continuation", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "", "recoverAndThrow", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unwrap", "unwrapImpl", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "", "isArtificial", "(Ljava/lang/StackTraceElement;)Z", "cause", "", "initCause", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1735#2,6:217\n12744#2,2:225\n1627#2,6:229\n12744#2,2:235\n1627#2,6:238\n37#3,2:223\n26#4:227\n26#4:228\n1#5:237\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n43#1:217,6\n131#1:225,2\n141#1:229,6\n173#1:235,2\n194#1:238,6\n106#1:223,2\n133#1:227\n135#1:228\n*E\n"})
public final class StackTraceRecoveryKt {
    public static final StackTraceElement a;
    public static final String b;

    static {
        StackTraceRecoveryKt.a = new ArtificialStackFrames().coroutineBoundary();
        StackTraceRecoveryKt.b = Result.exceptionOrNull-impl(BaseContinuationImpl.class.getCanonicalName()) == null ? BaseContinuationImpl.class.getCanonicalName() : "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        boolean z = Result.exceptionOrNull-impl(StackTraceRecoveryKt.class.getCanonicalName()) == null;
    }

    public static void CoroutineStackFrame$annotations() {
    }

    public static void StackTraceElement$annotations() {
    }

    public static final Throwable access$recoverFromStackFrame(Throwable throwable0, CoroutineStackFrame coroutineStackFrame0) {
        Pair pair0;
        Throwable throwable1 = throwable0.getCause();
        int v = 0;
        if(throwable1 != null && Intrinsics.areEqual(throwable1.getClass(), throwable0.getClass())) {
            StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
            int v1 = 0;
            while(v1 < arr_stackTraceElement.length) {
                if(StackTraceRecoveryKt.isArtificial(arr_stackTraceElement[v1])) {
                    pair0 = TuplesKt.to(throwable1, arr_stackTraceElement);
                    goto label_14;
                }
                ++v1;
            }
        }
        pair0 = TuplesKt.to(throwable0, new StackTraceElement[0]);
    label_14:
        Throwable throwable2 = (Throwable)pair0.component1();
        StackTraceElement[] arr_stackTraceElement1 = (StackTraceElement[])pair0.component2();
        Throwable throwable3 = ExceptionsConstructorKt.tryCopyException(throwable2);
        if(throwable3 != null) {
            ArrayDeque arrayDeque0 = new ArrayDeque();
            StackTraceElement stackTraceElement0 = coroutineStackFrame0.getStackTraceElement();
            if(stackTraceElement0 != null) {
                arrayDeque0.add(stackTraceElement0);
            }
            while(true) {
                coroutineStackFrame0 = coroutineStackFrame0.getCallerFrame();
                if(coroutineStackFrame0 == null) {
                    break;
                }
                StackTraceElement stackTraceElement1 = coroutineStackFrame0.getStackTraceElement();
                if(stackTraceElement1 != null) {
                    arrayDeque0.add(stackTraceElement1);
                }
            }
            if(!arrayDeque0.isEmpty()) {
                if(throwable2 != throwable0) {
                    int v2;
                    for(v2 = 0; true; ++v2) {
                        if(v2 >= arr_stackTraceElement1.length) {
                            v2 = -1;
                            break;
                        }
                        if(StackTraceRecoveryKt.isArtificial(arr_stackTraceElement1[v2])) {
                            break;
                        }
                    }
                    int v3 = arr_stackTraceElement1.length - 1;
                    if(v2 + 1 <= v3) {
                        while(true) {
                            StackTraceElement stackTraceElement2 = arr_stackTraceElement1[v3];
                            StackTraceElement stackTraceElement3 = (StackTraceElement)arrayDeque0.getLast();
                            if(stackTraceElement2.getLineNumber() == stackTraceElement3.getLineNumber() && Intrinsics.areEqual(stackTraceElement2.getMethodName(), stackTraceElement3.getMethodName()) && Intrinsics.areEqual(stackTraceElement2.getFileName(), stackTraceElement3.getFileName()) && Intrinsics.areEqual(stackTraceElement2.getClassName(), stackTraceElement3.getClassName())) {
                                arrayDeque0.removeLast();
                            }
                            arrayDeque0.addFirst(arr_stackTraceElement1[v3]);
                            if(v3 == v2 + 1) {
                                break;
                            }
                            --v3;
                        }
                    }
                }
                arrayDeque0.addFirst(StackTraceRecoveryKt.a);
                StackTraceElement[] arr_stackTraceElement2 = throwable2.getStackTrace();
                int v4;
                for(v4 = 0; true; ++v4) {
                    if(v4 >= arr_stackTraceElement2.length) {
                        v4 = -1;
                        break;
                    }
                    String s = arr_stackTraceElement2[v4].getClassName();
                    if(Intrinsics.areEqual(StackTraceRecoveryKt.b, s)) {
                        break;
                    }
                }
                if(v4 == -1) {
                    throwable3.setStackTrace(((StackTraceElement[])arrayDeque0.toArray(new StackTraceElement[0])));
                    return throwable3;
                }
                StackTraceElement[] arr_stackTraceElement3 = new StackTraceElement[arrayDeque0.size() + v4];
                for(int v5 = 0; v5 < v4; ++v5) {
                    arr_stackTraceElement3[v5] = arr_stackTraceElement2[v5];
                }
                for(Object object0: arrayDeque0) {
                    arr_stackTraceElement3[v + v4] = (StackTraceElement)object0;
                    ++v;
                }
                throwable3.setStackTrace(arr_stackTraceElement3);
                return throwable3;
            }
        }
        return throwable0;
    }

    public static final void initCause(@NotNull Throwable throwable0, @NotNull Throwable throwable1) {
        throwable0.initCause(throwable1);
    }

    public static final boolean isArtificial(@NotNull StackTraceElement stackTraceElement0) {
        return p.startsWith$default(stackTraceElement0.getClassName(), "_COROUTINE", false, 2, null);
    }

    @Nullable
    public static final Object recoverAndThrow(@NotNull Throwable throwable0, @NotNull Continuation continuation0) {
        throw throwable0;
    }

    @NotNull
    public static final Throwable recoverStackTrace(@NotNull Throwable throwable0) [...] // Inlined contents

    @NotNull
    public static final Throwable recoverStackTrace(@NotNull Throwable throwable0, @NotNull Continuation continuation0) {
        return throwable0;
    }

    @PublishedApi
    @NotNull
    public static final Throwable unwrap(@NotNull Throwable throwable0) {
        return throwable0;
    }

    @PublishedApi
    @NotNull
    public static final Throwable unwrapImpl(@NotNull Throwable throwable0) {
        Throwable throwable1 = throwable0.getCause();
        if(throwable1 != null && Intrinsics.areEqual(throwable1.getClass(), throwable0.getClass())) {
            StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
            for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                if(StackTraceRecoveryKt.isArtificial(arr_stackTraceElement[v])) {
                    return throwable1;
                }
            }
        }
        return throwable0;
    }
}

