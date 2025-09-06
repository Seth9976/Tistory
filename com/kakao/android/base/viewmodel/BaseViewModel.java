package com.kakao.android.base.viewmodel;

import androidx.annotation.CallSuper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u0006\u001A\u00020\u00052\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000BJ(\u0010\r\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\u00052\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096\u0001¢\u0006\u0004\b\r\u0010\u000BJ(\u0010\u000E\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\u00052\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096\u0001¢\u0006\u0004\b\u000E\u0010\u000BJ\u000F\u0010\u000F\u001A\u00020\bH\u0015¢\u0006\u0004\b\u000F\u0010\u0004R \u0010\u0016\u001A\u00020\u00108\u0004X\u0085\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0004\u001A\u0004\b\u0013\u0010\u0014R(\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER*\u0010\'\u001A\u0004\u0018\u00010\u001F8\u0006@\u0006X\u0087\u000E¢\u0006\u0018\n\u0004\b \u0010!\u0012\u0004\b&\u0010\u0004\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010,\u001A\u00020\u001F8\u0006@\u0006X\u0087\u000E¢\u0006\u0018\n\u0004\b(\u0010!\u0012\u0004\b+\u0010\u0004\u001A\u0004\b)\u0010#\"\u0004\b*\u0010%R\u001C\u00102\u001A\u00020-8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/kakao/android/base/viewmodel/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/kakao/android/base/viewmodel/CoroutineThrottleInterface;", "<init>", "()V", "", "waitTime", "Lkotlin/Function0;", "", "function", "debounce", "(ILkotlin/jvm/functions/Function0;)V", "delayTime", "throttleFirst", "throttleLast", "onCleared", "Lio/reactivex/disposables/CompositeDisposable;", "I0", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "getDisposable$annotations", "disposable", "Landroidx/lifecycle/MutableLiveData;", "", "J0", "Landroidx/lifecycle/MutableLiveData;", "isShowProgress", "()Landroidx/lifecycle/MutableLiveData;", "setShowProgress", "(Landroidx/lifecycle/MutableLiveData;)V", "", "K0", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "setSection", "(Ljava/lang/String;)V", "getSection$annotations", "section", "L0", "getPage", "setPage", "getPage$annotations", "page", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineThrottleScope", "()Lkotlinx/coroutines/CoroutineScope;", "setCoroutineThrottleScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "coroutineThrottleScope", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class BaseViewModel extends ViewModel implements CoroutineThrottleInterface {
    public final CoroutineThrottle H0;
    public final CompositeDisposable I0;
    public MutableLiveData J0;
    public String K0;
    public String L0;

    public BaseViewModel() {
        this.H0 = new CoroutineThrottle();
        this.setCoroutineThrottleScope(ViewModelKt.getViewModelScope(this));
        this.I0 = new CompositeDisposable();
        this.J0 = new MutableLiveData();
        this.L0 = "";
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    public void debounce(int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "function");
        this.H0.debounce(v, function00);
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    @NotNull
    public CoroutineScope getCoroutineThrottleScope() {
        return this.H0.getCoroutineThrottleScope();
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.I0;
    }

    @Deprecated(message = "use coroutine")
    public static void getDisposable$annotations() {
    }

    @NotNull
    public final String getPage() {
        return this.L0;
    }

    @Deprecated(message = "Don\'t use viewModel page")
    public static void getPage$annotations() {
    }

    @Nullable
    public final String getSection() {
        return this.K0;
    }

    @Deprecated(message = "Don\'t use viewModel section")
    public static void getSection$annotations() {
    }

    @NotNull
    public final MutableLiveData isShowProgress() {
        return this.J0;
    }

    @Override  // androidx.lifecycle.ViewModel
    @CallSuper
    public void onCleared() {
        this.I0.clear();
        super.onCleared();
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    public void setCoroutineThrottleScope(@NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "<set-?>");
        this.H0.setCoroutineThrottleScope(coroutineScope0);
    }

    public final void setPage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.L0 = s;
    }

    public final void setSection(@Nullable String s) {
        this.K0 = s;
    }

    public final void setShowProgress(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.J0 = mutableLiveData0;
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    public void throttleFirst(int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "function");
        this.H0.throttleFirst(v, function00);
    }

    @Override  // com.kakao.android.base.viewmodel.CoroutineThrottleInterface
    public void throttleLast(int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "function");
        this.H0.throttleLast(v, function00);
    }
}

