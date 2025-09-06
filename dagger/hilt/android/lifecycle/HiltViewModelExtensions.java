package dagger.hilt.android.lifecycle;

import androidx.compose.material3.ti;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A$\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u001A$\u0010\u0007\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\b"}, d2 = {"addCreationCallback", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VMF", "Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "callback", "Lkotlin/Function1;", "Landroidx/lifecycle/ViewModel;", "withCreationCallback", "java_dagger_hilt_android_lifecycle-hilt_view_model_extensions_internal_kt"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "HiltViewModelExtensions")
public final class HiltViewModelExtensions {
    @NotNull
    public static final CreationExtras addCreationCallback(@NotNull MutableCreationExtras mutableCreationExtras0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(mutableCreationExtras0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "callback");
        Intrinsics.checkNotNullExpressionValue(HiltViewModelFactory.CREATION_CALLBACK_KEY, "CREATION_CALLBACK_KEY");
        ti ti0 = new ti(function10, 4);
        mutableCreationExtras0.set(HiltViewModelFactory.CREATION_CALLBACK_KEY, ti0);
        return mutableCreationExtras0;
    }

    @NotNull
    public static final CreationExtras withCreationCallback(@NotNull CreationExtras creationExtras0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(creationExtras0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "callback");
        return HiltViewModelExtensions.addCreationCallback(new MutableCreationExtras(creationExtras0), function10);
    }
}

