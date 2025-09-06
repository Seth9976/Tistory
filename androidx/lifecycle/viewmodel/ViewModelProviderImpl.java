package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProvider.OnRequeryFactory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders.ViewModelKey;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ1\u0010\u0015\u001A\u00028\u0000\"\b\b\u0000\u0010\u000E*\u00020\r2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/viewmodel/ViewModelProviderImpl;", "", "Landroidx/lifecycle/ViewModelStore;", "store", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "<init>", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "Landroidx/lifecycle/ViewModel;", "T", "Lkotlin/reflect/KClass;", "modelClass", "", "key", "getViewModel$lifecycle_viewmodel_release", "(Lkotlin/reflect/KClass;Ljava/lang/String;)Landroidx/lifecycle/ViewModel;", "getViewModel", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nViewModelProviderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviderImpl.kt\nandroidx/lifecycle/viewmodel/ViewModelProviderImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class ViewModelProviderImpl {
    public final ViewModelStore a;
    public final Factory b;
    public final CreationExtras c;

    public ViewModelProviderImpl(@NotNull ViewModelStore viewModelStore0, @NotNull Factory viewModelProvider$Factory0, @NotNull CreationExtras creationExtras0) {
        Intrinsics.checkNotNullParameter(viewModelStore0, "store");
        Intrinsics.checkNotNullParameter(viewModelProvider$Factory0, "factory");
        Intrinsics.checkNotNullParameter(creationExtras0, "extras");
        super();
        this.a = viewModelStore0;
        this.b = viewModelProvider$Factory0;
        this.c = creationExtras0;
    }

    public ViewModelProviderImpl(@NotNull ViewModelStoreOwner viewModelStoreOwner0, @NotNull Factory viewModelProvider$Factory0, @NotNull CreationExtras creationExtras0) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "owner");
        Intrinsics.checkNotNullParameter(viewModelProvider$Factory0, "factory");
        Intrinsics.checkNotNullParameter(creationExtras0, "extras");
        this(viewModelStoreOwner0.getViewModelStore(), viewModelProvider$Factory0, creationExtras0);
    }

    @NotNull
    public final ViewModel getViewModel$lifecycle_viewmodel_release(@NotNull KClass kClass0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(kClass0, "modelClass");
        Intrinsics.checkNotNullParameter(s, "key");
        ViewModelStore viewModelStore0 = this.a;
        ViewModel viewModel0 = viewModelStore0.get(s);
        boolean z = kClass0.isInstance(viewModel0);
        Factory viewModelProvider$Factory0 = this.b;
        if(z) {
            if(viewModelProvider$Factory0 instanceof OnRequeryFactory) {
                Intrinsics.checkNotNull(viewModel0);
                ((OnRequeryFactory)viewModelProvider$Factory0).onRequery(viewModel0);
            }
            Intrinsics.checkNotNull(viewModel0, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return viewModel0;
        }
        MutableCreationExtras mutableCreationExtras0 = new MutableCreationExtras(this.c);
        mutableCreationExtras0.set(ViewModelKey.INSTANCE, s);
        ViewModel viewModel1 = ViewModelProviderImpl_androidKt.createViewModel(viewModelProvider$Factory0, kClass0, mutableCreationExtras0);
        viewModelStore0.put(s, viewModel1);
        return viewModel1;
    }

    public static ViewModel getViewModel$lifecycle_viewmodel_release$default(ViewModelProviderImpl viewModelProviderImpl0, KClass kClass0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            s = ViewModelProviders.INSTANCE.getDefaultKey$lifecycle_viewmodel_release(kClass0);
        }
        return viewModelProviderImpl0.getViewModel$lifecycle_viewmodel_release(kClass0, s);
    }
}

