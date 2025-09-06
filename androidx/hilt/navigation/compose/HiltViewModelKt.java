package androidx.hilt.navigation.compose;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0017\u0010\u0000\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001A0\u0010\u0005\u001A\u0002H\u0006\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00072\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\tH\u0087\b¢\u0006\u0002\u0010\n\u001AN\u0010\u0005\u001A\u0002H\u0006\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0007\"\u0006\b\u0001\u0010\u000B\u0018\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\u0014\b\b\u0010\f\u001A\u000E\u0012\u0004\u0012\u0002H\u000B\u0012\u0004\u0012\u0002H\u00060\rH\u0087\b¢\u0006\u0002\u0010\u000E¨\u0006\u000F"}, d2 = {"createHiltViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;", "hiltViewModel", "VM", "Landroidx/lifecycle/ViewModel;", "key", "", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "VMF", "creationCallback", "Lkotlin/Function1;", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "hilt-navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHiltViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,104:1\n86#2,6:105\n91#2:111\n76#3:112\n*S KotlinDebug\n*F\n+ 1 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n*L\n52#1:105,6\n76#1:111\n96#1:112\n*E\n"})
public final class HiltViewModelKt {
    @Composable
    @PublishedApi
    @Nullable
    public static final Factory createHiltViewModelFactory(@NotNull ViewModelStoreOwner viewModelStoreOwner0, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(1770922558);
        Factory viewModelProvider$Factory0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? HiltViewModelFactory.create(((Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext())), ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelProviderFactory()) : null;
        composer0.endReplaceableGroup();
        return viewModelProvider$Factory0;
    }

    @Composable
    public static final ViewModel hiltViewModel(ViewModelStoreOwner viewModelStoreOwner0, String s, Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0x70B323C8);
        if((v1 & 1) != 0) {
            viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer0, LocalViewModelStoreOwner.$stable);
            if(viewModelStoreOwner0 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        }
        if((v1 & 2) != 0) {
            s = null;
        }
        Factory viewModelProvider$Factory0 = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner0, composer0, v & 14);
        composer0.startReplaceableGroup(0x671A9C9B);
        CreationExtras creationExtras0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras() : Empty.INSTANCE;
        Intrinsics.reifiedOperationMarker(4, "VM");
        ViewModel viewModel0 = ViewModelKt.viewModel(ViewModel.class, viewModelStoreOwner0, s, viewModelProvider$Factory0, creationExtras0, composer0, (v & 0x7E) << 3 & 0x380 | 0x9048, 0);
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return viewModel0;
    }

    @Composable
    public static final ViewModel hiltViewModel(ViewModelStoreOwner viewModelStoreOwner0, String s, Function1 function10, Composer composer0, int v, int v1) {
        composer0.startReplaceableGroup(0xFB046115);
        if((v1 & 1) != 0) {
            viewModelStoreOwner0 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer0, LocalViewModelStoreOwner.$stable);
            if(viewModelStoreOwner0 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        }
        if((v1 & 2) != 0) {
            s = null;
        }
        Factory viewModelProvider$Factory0 = HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner0, composer0, v & 14);
        CreationExtras creationExtras0 = viewModelStoreOwner0 instanceof HasDefaultViewModelProviderFactory ? HiltViewModelExtensions.withCreationCallback(((HasDefaultViewModelProviderFactory)viewModelStoreOwner0).getDefaultViewModelCreationExtras(), function10) : HiltViewModelExtensions.withCreationCallback(Empty.INSTANCE, function10);
        composer0.startReplaceableGroup(0x671A9C9B);
        Intrinsics.reifiedOperationMarker(4, "VM");
        ViewModel viewModel0 = ViewModelKt.viewModel(ViewModel.class, viewModelStoreOwner0, s, viewModelProvider$Factory0, creationExtras0, composer0, (v & 0x7E) << 3 & 0x380 | 0x9048, 0);
        composer0.endReplaceableGroup();
        composer0.endReplaceableGroup();
        return viewModel0;
    }
}

