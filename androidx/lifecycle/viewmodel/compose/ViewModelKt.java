package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Companion;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class ViewModelKt {
    @NotNull
    public static final ViewModel get(@NotNull ViewModelStoreOwner viewModelStoreOwner0, @NotNull KClass kClass0, @Nullable String s, @Nullable Factory viewModelProvider$Factory0, @NotNull CreationExtras creationExtras0) {
        ViewModelProvider viewModelProvider0;
        Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "<this>");
        Intrinsics.checkNotNullParameter(kClass0, "modelClass");
        Intrinsics.checkNotNullParameter(creationExtras0, "extras");
        if(viewModelProvider$Factory0 != null) {
            ViewModelStore viewModelStore0 = viewModelStoreOwner0.getViewModelStore();
            viewModelProvider0 = ViewModelProvider.Companion.create(viewModelStore0, viewModelProvider$Factory0, creationExtras0);
            return s == null ? viewModelProvider0.get(kClass0) : viewModelProvider0.get(s, kClass0);
        }
        if(viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory) {
            ViewModelStore viewModelStore1 = viewModelStoreOwner0.getViewModelStore();
            Factory viewModelProvider$Factory1 = ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelProviderFactory();
            viewModelProvider0 = ViewModelProvider.Companion.create(viewModelStore1, viewModelProvider$Factory1, creationExtras0);
            return s == null ? viewModelProvider0.get(kClass0) : viewModelProvider0.get(s, kClass0);
        }
        viewModelProvider0 = Companion.create$default(ViewModelProvider.Companion, viewModelStoreOwner0, null, null, 6, null);
        return s == null ? viewModelProvider0.get(kClass0) : viewModelProvider0.get(s, kClass0);
    }

    public static ViewModel get$default(ViewModelStoreOwner viewModelStoreOwner0, KClass kClass0, String s, Factory viewModelProvider$Factory0, CreationExtras creationExtras0, int v, Object object0) {
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            viewModelProvider$Factory0 = null;
        }
        if((v & 8) != 0) {
            if(viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory) {
                return ViewModelKt.get(viewModelStoreOwner0, kClass0, s, viewModelProvider$Factory0, ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras());
            }
            creationExtras0 = Empty.INSTANCE;
        }
        return ViewModelKt.get(viewModelStoreOwner0, kClass0, s, viewModelProvider$Factory0, creationExtras0);
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    public static final ViewModel viewModel(ViewModelStoreOwner viewModelStoreOwner0, String s, Factory viewModelProvider$Factory0, Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x11CECD5A);
        if((v1 & 1) != 0) {
            viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer0, 6);
            if(viewModelStoreOwner0 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        ViewModel viewModel0 = ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStoreOwner0, ((v1 & 2) == 0 ? s : null), ((v1 & 4) == 0 ? viewModelProvider$Factory0 : null), null, composer0, v << 3 & 0x1FF0, 16);
        composer0.endReplaceableGroup();
        return viewModel0;
    }

    @Composable
    public static final ViewModel viewModel(ViewModelStoreOwner viewModelStoreOwner0, String s, Factory viewModelProvider$Factory0, CreationExtras creationExtras0, Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x671A9C9B);
        if((v1 & 1) != 0) {
            viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer0, 6);
            if(viewModelStoreOwner0 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        }
        if((v1 & 8) != 0) {
            CreationExtras creationExtras1 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
            creationExtras0 = creationExtras1;
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        ViewModel viewModel0 = ViewModelKt.viewModel(Reflection.getOrCreateKotlinClass(ViewModel.class), viewModelStoreOwner0, ((v1 & 2) == 0 ? s : null), ((v1 & 4) == 0 ? viewModelProvider$Factory0 : null), creationExtras0, composer0, v << 3 & 0xFFF0, 0);
        composer0.endReplaceableGroup();
        return viewModel0;
    }

    @Composable
    public static final ViewModel viewModel(ViewModelStoreOwner viewModelStoreOwner0, String s, Function1 function10, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(function10, "initializer");
        composer0.startReplaceableGroup(0x18FF324A);
        if((v1 & 1) != 0) {
            viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer0, 6);
            if(viewModelStoreOwner0 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        }
        if((v1 & 2) != 0) {
            s = null;
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass kClass0 = Reflection.getOrCreateKotlinClass(ViewModel.class);
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder0 = new InitializerViewModelFactoryBuilder();
        Intrinsics.reifiedOperationMarker(4, "VM");
        initializerViewModelFactoryBuilder0.addInitializer(Reflection.getOrCreateKotlinClass(ViewModel.class), function10);
        Factory viewModelProvider$Factory0 = initializerViewModelFactoryBuilder0.build();
        CreationExtras creationExtras0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
        ViewModel viewModel0 = ViewModelKt.viewModel(kClass0, viewModelStoreOwner0, s, viewModelProvider$Factory0, creationExtras0, composer0, v << 3 & 0x3F0, 0);
        composer0.endReplaceableGroup();
        return viewModel0;
    }

    @Composable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    public static final ViewModel viewModel(Class class0, ViewModelStoreOwner viewModelStoreOwner0, String s, Factory viewModelProvider$Factory0, Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        composer0.startReplaceableGroup(0xB558CDAE);
        if((v1 & 2) != 0) {
            viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer0, 6);
            if(viewModelStoreOwner0 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        }
        if((v1 & 4) != 0) {
            s = null;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB558CDAE, v, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:85)");
        }
        ViewModel viewModel0 = ViewModelKt.get$default(viewModelStoreOwner0, JvmClassMappingKt.getKotlinClass(class0), s, ((v1 & 8) == 0 ? viewModelProvider$Factory0 : null), null, 8, null);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return viewModel0;
    }

    @Composable
    @NotNull
    public static final ViewModel viewModel(@NotNull Class class0, @Nullable ViewModelStoreOwner viewModelStoreOwner0, @Nullable String s, @Nullable Factory viewModelProvider$Factory0, @Nullable CreationExtras creationExtras0, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        composer0.startReplaceableGroup(0xA2A343A6);
        if((v1 & 2) != 0) {
            viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer0, 6);
            if(viewModelStoreOwner0 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        }
        if((v1 & 4) != 0) {
            s = null;
        }
        if((v1 & 8) != 0) {
            viewModelProvider$Factory0 = null;
        }
        if((v1 & 16) != 0) {
            creationExtras0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA2A343A6, v, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:123)");
        }
        ViewModel viewModel0 = ViewModelKt.get(viewModelStoreOwner0, JvmClassMappingKt.getKotlinClass(class0), s, viewModelProvider$Factory0, creationExtras0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return viewModel0;
    }

    @Composable
    @NotNull
    public static final ViewModel viewModel(@NotNull KClass kClass0, @Nullable ViewModelStoreOwner viewModelStoreOwner0, @Nullable String s, @Nullable Factory viewModelProvider$Factory0, @Nullable CreationExtras creationExtras0, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(kClass0, "modelClass");
        composer0.startReplaceableGroup(0x63C16600);
        if((v1 & 2) != 0) {
            viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer0, 6);
            if(viewModelStoreOwner0 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        }
        if((v1 & 4) != 0) {
            s = null;
        }
        if((v1 & 8) != 0) {
            viewModelProvider$Factory0 = null;
        }
        if((v1 & 16) != 0) {
            creationExtras0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x63C16600, v, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:102)");
        }
        ViewModel viewModel0 = ViewModelKt.get(viewModelStoreOwner0, kClass0, s, viewModelProvider$Factory0, creationExtras0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return viewModel0;
    }
}

