package com.kakao.android.base.viewmodel;

import j9.a;
import j9.b;
import j9.c;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000B\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00042\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000B\u0010\nJ%\u0010\r\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u00042\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\r\u0010\nR\"\u0010\u000F\u001A\u00020\u000E8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/android/base/viewmodel/CoroutineThrottle;", "Lcom/kakao/android/base/viewmodel/CoroutineThrottleInterface;", "<init>", "()V", "", "delayTime", "Lkotlin/Function0;", "", "function", "throttleFirst", "(ILkotlin/jvm/functions/Function0;)V", "throttleLast", "waitTime", "debounce", "Lkotlinx/coroutines/CoroutineScope;", "coroutineThrottleScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineThrottleScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineThrottleScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CoroutineThrottle implements CoroutineThrottleInterface {
    public Job a;
    public long b;
    public Job c;
    public CoroutineScope coroutineThrottleScope;
    public long d;
    public Job e;

    public CoroutineThrottle() {
        this.b = System.currentTimeMillis();
        this.d = System.currentTimeMillis();
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    public void debounce(int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "function");
        Job job0 = this.e;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        this.e = BuildersKt.launch$default(this.getCoroutineThrottleScope(), null, null, new a(v, function00, null), 3, null);
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    @NotNull
    public CoroutineScope getCoroutineThrottleScope() {
        CoroutineScope coroutineScope0 = this.coroutineThrottleScope;
        if(coroutineScope0 != null) {
            return coroutineScope0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineThrottleScope");
        return null;
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    public void setCoroutineThrottleScope(@NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "<set-?>");
        this.coroutineThrottleScope = coroutineScope0;
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    public void throttleFirst(int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "function");
        if(this.b + ((long)v) < System.currentTimeMillis() && (this.a == null || !this.a.isActive())) {
            this.a = BuildersKt.launch$default(this.getCoroutineThrottleScope(), null, null, new b(this, function00, null), 3, null);
        }
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    public void throttleLast(int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "function");
        long v1 = this.d + ((long)v) - System.currentTimeMillis();
        if(v1 > 0L) {
            Job job0 = this.c;
            if(job0 != null) {
                DefaultImpls.cancel$default(job0, null, 1, null);
            }
        }
        this.c = BuildersKt.launch$default(this.getCoroutineThrottleScope(), null, null, new c(v1, this, function00, null), 3, null);
    }
}

