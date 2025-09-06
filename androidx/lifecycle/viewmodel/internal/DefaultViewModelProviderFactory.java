package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J/\u0010\b\u001A\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/DefaultViewModelProviderFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", "T", "Lkotlin/reflect/KClass;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DefaultViewModelProviderFactory implements Factory {
    @NotNull
    public static final DefaultViewModelProviderFactory INSTANCE;

    static {
        DefaultViewModelProviderFactory.INSTANCE = new DefaultViewModelProviderFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @NotNull
    public ViewModel create(@NotNull KClass kClass0, @NotNull CreationExtras creationExtras0) {
        Intrinsics.checkNotNullParameter(kClass0, "modelClass");
        Intrinsics.checkNotNullParameter(creationExtras0, "extras");
        Class class0 = JvmClassMappingKt.getJavaClass(kClass0);
        return JvmViewModelProviders.INSTANCE.createViewModel(class0);
    }
}

