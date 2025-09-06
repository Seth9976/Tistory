package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras.Key;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001$J\'\u0010\t\u001A\u00020\u0006\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\r\u001A\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u0002H\u0000¢\u0006\u0004\b\u000B\u0010\fJ!\u0010\u0014\u001A\u00020\u00112\u0010\u0010\u0010\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000F0\u000EH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001A\u00020\u00112\u001A\u0010\u0010\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000F0\u0015\"\u0006\u0012\u0002\b\u00030\u000FH\u0000¢\u0006\u0004\b\u0012\u0010\u0016J\u0017\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u0018\u001A\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001F\u001A\u00020\u001C2\u0006\u0010\u0018\u001A\u00020\u0017H\u0000¢\u0006\u0004\b\u001D\u0010\u001EJK\u0010#\u001A\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010 \u001A\u00020\u001C2\u001A\u0010\u0010\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000F0\u0015\"\u0006\u0012\u0002\b\u00030\u000FH\u0000¢\u0006\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelProviders;", "", "Landroidx/lifecycle/ViewModel;", "T", "Lkotlin/reflect/KClass;", "modelClass", "", "getDefaultKey$lifecycle_viewmodel_release", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "getDefaultKey", "VM", "unsupportedCreateViewModel$lifecycle_viewmodel_release", "()Landroidx/lifecycle/ViewModel;", "unsupportedCreateViewModel", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "initializers", "Landroidx/lifecycle/ViewModelProvider$Factory;", "createInitializerFactory$lifecycle_viewmodel_release", "(Ljava/util/Collection;)Landroidx/lifecycle/ViewModelProvider$Factory;", "createInitializerFactory", "", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModelStoreOwner;", "owner", "getDefaultFactory$lifecycle_viewmodel_release", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultFactory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultCreationExtras$lifecycle_viewmodel_release", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultCreationExtras", "extras", "createViewModelFromInitializers$lifecycle_viewmodel_release", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/viewmodel/CreationExtras;[Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModel;", "createViewModelFromInitializers", "ViewModelKey", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nViewModelProviders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,99:1\n37#2,2:100\n1282#3,2:102\n*S KotlinDebug\n*F\n+ 1 ViewModelProviders.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelProviders\n*L\n59#1:100,2\n85#1:102,2\n*E\n"})
public final class ViewModelProviders {
    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelProviders$ViewModelKey;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ViewModelKey implements Key {
        @NotNull
        public static final ViewModelKey INSTANCE;

        static {
            ViewModelKey.INSTANCE = new ViewModelKey();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @NotNull
    public static final ViewModelProviders INSTANCE;

    static {
        ViewModelProviders.INSTANCE = new ViewModelProviders();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final Factory createInitializerFactory$lifecycle_viewmodel_release(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "initializers");
        ViewModelInitializer[] arr_viewModelInitializer = (ViewModelInitializer[])collection0.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory(((ViewModelInitializer[])Arrays.copyOf(arr_viewModelInitializer, arr_viewModelInitializer.length)));
    }

    @NotNull
    public final Factory createInitializerFactory$lifecycle_viewmodel_release(@NotNull ViewModelInitializer[] arr_viewModelInitializer) {
        Intrinsics.checkNotNullParameter(arr_viewModelInitializer, "initializers");
        return new InitializerViewModelFactory(((ViewModelInitializer[])Arrays.copyOf(arr_viewModelInitializer, arr_viewModelInitializer.length)));
    }

    @NotNull
    public final ViewModel createViewModelFromInitializers$lifecycle_viewmodel_release(@NotNull KClass kClass0, @NotNull CreationExtras creationExtras0, @NotNull ViewModelInitializer[] arr_viewModelInitializer) {
        ViewModel viewModel0;
        ViewModelInitializer viewModelInitializer0;
        Intrinsics.checkNotNullParameter(kClass0, "modelClass");
        Intrinsics.checkNotNullParameter(creationExtras0, "extras");
        Intrinsics.checkNotNullParameter(arr_viewModelInitializer, "initializers");
        for(int v = 0; true; ++v) {
            viewModelInitializer0 = null;
            viewModel0 = null;
            if(v >= arr_viewModelInitializer.length) {
                break;
            }
            ViewModelInitializer viewModelInitializer1 = arr_viewModelInitializer[v];
            if(Intrinsics.areEqual(viewModelInitializer1.getClazz$lifecycle_viewmodel_release(), kClass0)) {
                viewModelInitializer0 = viewModelInitializer1;
                break;
            }
        }
        if(viewModelInitializer0 != null) {
            Function1 function10 = viewModelInitializer0.getInitializer$lifecycle_viewmodel_release();
            if(function10 != null) {
                viewModel0 = (ViewModel)function10.invoke(creationExtras0);
            }
        }
        if(viewModel0 == null) {
            throw new IllegalArgumentException(("No initializer set for given class " + ViewModelProviders_jvmKt.getCanonicalName(kClass0)).toString());
        }
        return viewModel0;
    }

    @NotNull
    public final CreationExtras getDefaultCreationExtras$lifecycle_viewmodel_release(@NotNull ViewModelStoreOwner viewModelStoreOwner0) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "owner");
        return viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
    }

    @NotNull
    public final Factory getDefaultFactory$lifecycle_viewmodel_release(@NotNull ViewModelStoreOwner viewModelStoreOwner0) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "owner");
        return viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelProviderFactory() : DefaultViewModelProviderFactory.INSTANCE;
    }

    @NotNull
    public final String getDefaultKey$lifecycle_viewmodel_release(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "modelClass");
        String s = ViewModelProviders_jvmKt.getCanonicalName(kClass0);
        if(s == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + s;
    }

    @NotNull
    public final ViewModel unsupportedCreateViewModel$lifecycle_viewmodel_release() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}

