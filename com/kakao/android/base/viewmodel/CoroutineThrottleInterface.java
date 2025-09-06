package com.kakao.android.base.viewmodel;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J \u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\t0\rH&J \u0010\u000E\u001A\u00020\t2\b\b\u0002\u0010\u000F\u001A\u00020\u000B2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\t0\rH&J \u0010\u0010\u001A\u00020\t2\b\b\u0002\u0010\u000F\u001A\u00020\u000B2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\t0\rH&R\u0018\u0010\u0002\u001A\u00020\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/kakao/android/base/viewmodel/CoroutineThrottleInterface;", "", "coroutineThrottleScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineThrottleScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineThrottleScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "debounce", "", "waitTime", "", "function", "Lkotlin/Function0;", "throttleFirst", "delayTime", "throttleLast", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface CoroutineThrottleInterface {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void debounce$default(CoroutineThrottleInterface coroutineThrottleInterface0, int v, Function0 function00, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debounce");
            }
            if((v1 & 1) != 0) {
                v = 200;
            }
            coroutineThrottleInterface0.debounce(v, function00);
        }

        public static void throttleFirst$default(CoroutineThrottleInterface coroutineThrottleInterface0, int v, Function0 function00, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throttleFirst");
            }
            if((v1 & 1) != 0) {
                v = 200;
            }
            coroutineThrottleInterface0.throttleFirst(v, function00);
        }

        public static void throttleLast$default(CoroutineThrottleInterface coroutineThrottleInterface0, int v, Function0 function00, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throttleLast");
            }
            if((v1 & 1) != 0) {
                v = 200;
            }
            coroutineThrottleInterface0.throttleLast(v, function00);
        }
    }

    void debounce(int arg1, @NotNull Function0 arg2);

    @NotNull
    CoroutineScope getCoroutineThrottleScope();

    void setCoroutineThrottleScope(@NotNull CoroutineScope arg1);

    void throttleFirst(int arg1, @NotNull Function0 arg2);

    void throttleLast(int arg1, @NotNull Function0 arg2);
}

