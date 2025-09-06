package com.kakao.android.base.viewmodel;

import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\n\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001D\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BR\u001B\u0010\u0010\u001A\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0012\u001A\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u000F¨\u0006\u0013"}, d2 = {"Lcom/kakao/android/base/viewmodel/BaseViewModelLazy;", "Lcom/kakao/android/base/viewmodel/BaseViewModel;", "VM", "Lkotlin/Lazy;", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "viewModelLazy", "<init>", "(Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/Lazy;)V", "", "isInitialized", "()Z", "b", "Lkotlin/Lazy;", "getViewModel", "()Lcom/kakao/android/base/viewmodel/BaseViewModel;", "viewModel", "getValue", "value", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBaseViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseViewModelLazy.kt\ncom/kakao/android/base/viewmodel/BaseViewModelLazy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
public final class BaseViewModelLazy implements Lazy {
    public final ViewModelStoreOwner a;
    public final Lazy b;

    public BaseViewModelLazy(@NotNull ViewModelStoreOwner viewModelStoreOwner0, @NotNull Lazy lazy0) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "viewModelStoreOwner");
        Intrinsics.checkNotNullParameter(lazy0, "viewModelLazy");
        super();
        this.a = viewModelStoreOwner0;
        this.b = lazy0;
    }

    @NotNull
    public BaseViewModel getValue() {
        BaseViewModel baseViewModel0 = this.getViewModel();
        ViewModelExtensionKt.setTiara(baseViewModel0, this.a);
        return baseViewModel0;
    }

    @Override  // kotlin.Lazy
    public Object getValue() {
        return this.getValue();
    }

    @NotNull
    public final BaseViewModel getViewModel() {
        return (BaseViewModel)this.b.getValue();
    }

    @Override  // kotlin.Lazy
    public boolean isInitialized() {
        return true;
    }
}

