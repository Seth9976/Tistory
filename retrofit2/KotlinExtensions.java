package retrofit2;

import kotlin.KotlinNothingValueException;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0003\n\u0002\b\u0002\u001A\"\u0010\u0000\u001A\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@¢\u0006\u0002\u0010\u0004\u001A(\u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0003H\u0087@¢\u0006\u0004\b\u0005\u0010\u0004\u001A\u001A\u0010\u0000\u001A\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0087@¢\u0006\u0004\b\u0007\u0010\u0004\u001A$\u0010\b\u001A\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086@¢\u0006\u0002\u0010\u0004\u001A\u001E\u0010\n\u001A\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u000BH\u0086\b¢\u0006\u0002\u0010\f\u001A\u0012\u0010\r\u001A\u00020\u000E*\u00020\u000FH\u0080@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"await", "T", "", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitNullable", "", "awaitUnit", "awaitResponse", "Lretrofit2/Response;", "create", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "suspendAndThrow", "", "", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "KotlinExtensions")
@SourceDebugExtension({"SMAP\nKotlinExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinExtensions.kt\nretrofit2/KotlinExtensions\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,126:1\n310#2,11:127\n310#2,11:138\n310#2,11:149\n*S KotlinDebug\n*F\n+ 1 KotlinExtensions.kt\nretrofit2/KotlinExtensions\n*L\n32#1:127,11\n66#1:138,11\n93#1:149,11\n*E\n"})
public final class KotlinExtensions {
    @Nullable
    public static final Object await(@NotNull Call call0, @NotNull Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        cancellableContinuationImpl0.invokeOnCancellation(new n(call0, 0));
        call0.enqueue(new Callback() {
            public final CancellableContinuationImpl a;

            {
                CancellableContinuationImpl cancellableContinuationImpl0 = cancellableContinuationImpl0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = cancellableContinuationImpl0;
            }

            @Override  // retrofit2.Callback
            public void onFailure(@NotNull Call call0, @NotNull Throwable throwable0) {
                Intrinsics.checkNotNullParameter(call0, "call");
                Intrinsics.checkNotNullParameter(throwable0, "t");
                Object object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
                this.a.resumeWith(object0);
            }

            @Override  // retrofit2.Callback
            public void onResponse(@NotNull Call call0, @NotNull Response response0) {
                Intrinsics.checkNotNullParameter(call0, "call");
                Intrinsics.checkNotNullParameter(response0, "response");
                CancellableContinuationImpl cancellableContinuationImpl0 = this.a;
                if(response0.isSuccessful()) {
                    Object object0 = response0.body();
                    if(object0 == null) {
                        Object object1 = call0.request().tag(Invocation.class);
                        Intrinsics.checkNotNull(object1);
                        cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(new KotlinNullPointerException("Response from " + ((Invocation)object1).service().getName() + '.' + ((Invocation)object1).method().getName() + " was null but response body type was declared as non-null"))));
                        return;
                    }
                    cancellableContinuationImpl0.resumeWith(object0);
                    return;
                }
                cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(new HttpException(response0))));
            }
        });
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    @JvmName(name = "awaitNullable")
    @Nullable
    public static final Object awaitNullable(@NotNull Call call0, @NotNull Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        cancellableContinuationImpl0.invokeOnCancellation(new n(call0, 1));
        call0.enqueue(new Callback() {
            public final CancellableContinuationImpl a;

            {
                CancellableContinuationImpl cancellableContinuationImpl0 = cancellableContinuationImpl0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = cancellableContinuationImpl0;
            }

            @Override  // retrofit2.Callback
            public void onFailure(@NotNull Call call0, @NotNull Throwable throwable0) {
                Intrinsics.checkNotNullParameter(call0, "call");
                Intrinsics.checkNotNullParameter(throwable0, "t");
                Object object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
                this.a.resumeWith(object0);
            }

            @Override  // retrofit2.Callback
            public void onResponse(@NotNull Call call0, @NotNull Response response0) {
                Intrinsics.checkNotNullParameter(call0, "call");
                Intrinsics.checkNotNullParameter(response0, "response");
                CancellableContinuationImpl cancellableContinuationImpl0 = this.a;
                if(response0.isSuccessful()) {
                    cancellableContinuationImpl0.resumeWith(response0.body());
                    return;
                }
                cancellableContinuationImpl0.resumeWith(Result.constructor-impl(ResultKt.createFailure(new HttpException(response0))));
            }
        });
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    @Nullable
    public static final Object awaitResponse(@NotNull Call call0, @NotNull Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        cancellableContinuationImpl0.invokeOnCancellation(new n(call0, 2));
        call0.enqueue(new Callback() {
            public final CancellableContinuationImpl a;

            {
                CancellableContinuationImpl cancellableContinuationImpl0 = cancellableContinuationImpl0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = cancellableContinuationImpl0;
            }

            @Override  // retrofit2.Callback
            public void onFailure(@NotNull Call call0, @NotNull Throwable throwable0) {
                Intrinsics.checkNotNullParameter(call0, "call");
                Intrinsics.checkNotNullParameter(throwable0, "t");
                Object object0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
                this.a.resumeWith(object0);
            }

            @Override  // retrofit2.Callback
            public void onResponse(@NotNull Call call0, @NotNull Response response0) {
                Intrinsics.checkNotNullParameter(call0, "call");
                Intrinsics.checkNotNullParameter(response0, "response");
                this.a.resumeWith(response0);
            }
        });
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    @JvmName(name = "awaitUnit")
    @Nullable
    public static final Object awaitUnit(@NotNull Call call0, @NotNull Continuation continuation0) {
        Intrinsics.checkNotNull(call0, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return KotlinExtensions.awaitNullable(call0, continuation0);
    }

    public static final Object create(Retrofit retrofit0) {
        Intrinsics.checkNotNullParameter(retrofit0, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        Object object0 = retrofit0.create(Object.class);
        Intrinsics.checkNotNullExpressionValue(object0, "create(...)");
        return object0;
    }

    @Nullable
    public static final Object suspendAndThrow(@NotNull Throwable throwable0, @NotNull Continuation continuation0) {
        o o0;
        if(continuation0 instanceof o) {
            o0 = (o)continuation0;
            int v = o0.p;
            if((v & 0x80000000) == 0) {
                o0 = new o(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                o0.p = v ^ 0x80000000;
            }
        }
        else {
            o0 = new o(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = o0.o;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(o0.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                o0.p = 1;
                Dispatchers.getDefault().dispatch(o0.getContext(), new l5.a(o0, throwable0, false, 2));
                Object object2 = a.getCOROUTINE_SUSPENDED();
                if(object2 == a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(o0);
                }
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new KotlinNothingValueException();
    }
}

