package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders_jvmKt;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@ViewModelFactoryDsl
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\r\u001A\u00020\f\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062\u0017\u0010\u000B\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\b\n¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModel;", "T", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/ExtensionFunctionType;", "initializer", "", "addInitializer", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/ViewModelProvider$Factory;", "build", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class InitializerViewModelFactoryBuilder {
    public final LinkedHashMap a;

    public InitializerViewModelFactoryBuilder() {
        this.a = new LinkedHashMap();
    }

    public final void addInitializer(@NotNull KClass kClass0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(kClass0, "clazz");
        Intrinsics.checkNotNullParameter(function10, "initializer");
        LinkedHashMap linkedHashMap0 = this.a;
        if(linkedHashMap0.containsKey(kClass0)) {
            throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + ViewModelProviders_jvmKt.getCanonicalName(kClass0) + '.').toString());
        }
        linkedHashMap0.put(kClass0, new ViewModelInitializer(kClass0, function10));
    }

    @NotNull
    public final Factory build() {
        Collection collection0 = this.a.values();
        return ViewModelProviders.INSTANCE.createInitializerFactory$lifecycle_viewmodel_release(collection0);
    }
}

