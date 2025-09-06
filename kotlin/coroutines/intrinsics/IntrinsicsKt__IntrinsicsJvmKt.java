package kotlin.coroutines.intrinsics;

import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class IntrinsicsKt__IntrinsicsJvmKt {
    public static final BaseContinuationImpl a(Continuation continuation0) {
        CoroutineContext coroutineContext0 = continuation0.getContext();
        if(coroutineContext0 == EmptyCoroutineContext.INSTANCE) {
            Intrinsics.checkNotNull(continuation0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            return new IntrinsicsKt__IntrinsicsJvmKt.createSimpleCoroutineForSuspendFunction.1(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Intrinsics.checkNotNull(continuation0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        return new IntrinsicsKt__IntrinsicsJvmKt.createSimpleCoroutineForSuspendFunction.2(continuation0, coroutineContext0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static Continuation createCoroutineUnintercepted(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        Intrinsics.checkNotNullParameter(function10, "<this>");
        Intrinsics.checkNotNullParameter(continuation0, "completion");
        Continuation continuation1 = DebugProbesKt.probeCoroutineCreated(continuation0);
        if(function10 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl)function10).create(continuation1);
        }
        CoroutineContext coroutineContext0 = continuation1.getContext();
        return coroutineContext0 == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(continuation1) {
            public int o;

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public Object invokeSuspend(@NotNull Object object0) {
                switch(this.o) {
                    case 0: {
                        this.o = 1;
                        ResultKt.throwOnFailure(object0);
                        Intrinsics.checkNotNull(function10, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                        return ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function10, 1)).invoke(this);
                    }
                    case 1: {
                        this.o = 2;
                        ResultKt.throwOnFailure(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            }
        } : new ContinuationImpl(continuation1, coroutineContext0) {
            public int o;

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public Object invokeSuspend(@NotNull Object object0) {
                switch(this.o) {
                    case 0: {
                        this.o = 1;
                        ResultKt.throwOnFailure(object0);
                        Intrinsics.checkNotNull(function10, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                        return ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function10, 1)).invoke(this);
                    }
                    case 1: {
                        this.o = 2;
                        ResultKt.throwOnFailure(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            }
        };
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static Continuation createCoroutineUnintercepted(@NotNull Function2 function20, Object object0, @NotNull Continuation continuation0) {
        Intrinsics.checkNotNullParameter(function20, "<this>");
        Intrinsics.checkNotNullParameter(continuation0, "completion");
        Continuation continuation1 = DebugProbesKt.probeCoroutineCreated(continuation0);
        if(function20 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl)function20).create(object0, continuation1);
        }
        CoroutineContext coroutineContext0 = continuation1.getContext();
        return coroutineContext0 == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(continuation1) {
            public int o;

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public Object invokeSuspend(@NotNull Object object0) {
                switch(this.o) {
                    case 0: {
                        this.o = 1;
                        ResultKt.throwOnFailure(object0);
                        Intrinsics.checkNotNull(function20, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                        return ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function20, 2)).invoke(object0, this);
                    }
                    case 1: {
                        this.o = 2;
                        ResultKt.throwOnFailure(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            }
        } : new ContinuationImpl(continuation1, coroutineContext0) {
            public int o;

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public Object invokeSuspend(@NotNull Object object0) {
                switch(this.o) {
                    case 0: {
                        this.o = 1;
                        ResultKt.throwOnFailure(object0);
                        Intrinsics.checkNotNull(function20, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                        return ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function20, 2)).invoke(object0, this);
                    }
                    case 1: {
                        this.o = 2;
                        ResultKt.throwOnFailure(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                }
            }
        };
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static Continuation intercepted(@NotNull Continuation continuation0) {
        Intrinsics.checkNotNullParameter(continuation0, "<this>");
        ContinuationImpl continuationImpl0 = continuation0 instanceof ContinuationImpl ? ((ContinuationImpl)continuation0) : null;
        if(continuationImpl0 != null) {
            Continuation continuation1 = continuationImpl0.intercepted();
            return continuation1 == null ? continuation0 : continuation1;
        }
        return continuation0;
    }

    @PublishedApi
    @Nullable
    public static final Object wrapWithContinuationImpl(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        Intrinsics.checkNotNullParameter(function10, "<this>");
        Intrinsics.checkNotNullParameter(continuation0, "completion");
        BaseContinuationImpl baseContinuationImpl0 = IntrinsicsKt__IntrinsicsJvmKt.a(DebugProbesKt.probeCoroutineCreated(continuation0));
        return ((Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function10, 1)).invoke(baseContinuationImpl0);
    }

    @PublishedApi
    @Nullable
    public static final Object wrapWithContinuationImpl(@NotNull Function2 function20, Object object0, @NotNull Continuation continuation0) {
        Intrinsics.checkNotNullParameter(function20, "<this>");
        Intrinsics.checkNotNullParameter(continuation0, "completion");
        BaseContinuationImpl baseContinuationImpl0 = IntrinsicsKt__IntrinsicsJvmKt.a(DebugProbesKt.probeCoroutineCreated(continuation0));
        return ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function20, 2)).invoke(object0, baseContinuationImpl0);
    }

    @PublishedApi
    @Nullable
    public static Object wrapWithContinuationImpl(@NotNull Function3 function30, Object object0, Object object1, @NotNull Continuation continuation0) {
        Intrinsics.checkNotNullParameter(function30, "<this>");
        Intrinsics.checkNotNullParameter(continuation0, "completion");
        BaseContinuationImpl baseContinuationImpl0 = IntrinsicsKt__IntrinsicsJvmKt.a(DebugProbesKt.probeCoroutineCreated(continuation0));
        return ((Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function30, 3)).invoke(object0, object1, baseContinuationImpl0);
    }
}

