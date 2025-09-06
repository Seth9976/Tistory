package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001A\u0010\u0004\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001A\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "<init>", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)V", "Landroidx/lifecycle/ViewModel;", "VM", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class InitializerViewModelFactory implements Factory {
    public final ViewModelInitializer[] a;

    public InitializerViewModelFactory(@NotNull ViewModelInitializer[] arr_viewModelInitializer) {
        Intrinsics.checkNotNullParameter(arr_viewModelInitializer, "initializers");
        super();
        this.a = arr_viewModelInitializer;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    @NotNull
    public ViewModel create(@NotNull Class class0, @NotNull CreationExtras creationExtras0) {
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        Intrinsics.checkNotNullParameter(creationExtras0, "extras");
        KClass kClass0 = JvmClassMappingKt.getKotlinClass(class0);
        ViewModelInitializer[] arr_viewModelInitializer = (ViewModelInitializer[])Arrays.copyOf(this.a, this.a.length);
        return ViewModelProviders.INSTANCE.createViewModelFromInitializers$lifecycle_viewmodel_release(kClass0, creationExtras0, arr_viewModelInitializer);
    }
}

