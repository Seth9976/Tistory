package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A5\u0010\u0000\u001A\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00010\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0000¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"createViewModel", "VM", "Landroidx/lifecycle/ViewModel;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "modelClass", "Lkotlin/reflect/KClass;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Landroidx/lifecycle/ViewModelProvider$Factory;Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ViewModelProviderImpl_androidKt {
    @NotNull
    public static final ViewModel createViewModel(@NotNull Factory viewModelProvider$Factory0, @NotNull KClass kClass0, @NotNull CreationExtras creationExtras0) {
        Intrinsics.checkNotNullParameter(viewModelProvider$Factory0, "factory");
        Intrinsics.checkNotNullParameter(kClass0, "modelClass");
        Intrinsics.checkNotNullParameter(creationExtras0, "extras");
        try {
            return viewModelProvider$Factory0.create(kClass0, creationExtras0);
        }
        catch(AbstractMethodError unused_ex) {
            try {
                return viewModelProvider$Factory0.create(JvmClassMappingKt.getJavaClass(kClass0), creationExtras0);
            }
            catch(AbstractMethodError unused_ex) {
                return viewModelProvider$Factory0.create(JvmClassMappingKt.getJavaClass(kClass0));
            }
        }
    }
}

