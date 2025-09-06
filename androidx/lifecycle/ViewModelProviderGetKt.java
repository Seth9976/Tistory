package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001E\u0010\u0000\u001A\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"get", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider;", "(Landroidx/lifecycle/ViewModelProvider;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "ViewModelProviderGetKt")
public final class ViewModelProviderGetKt {
    @MainThread
    public static final ViewModel get(ViewModelProvider viewModelProvider0) {
        Intrinsics.checkNotNullParameter(viewModelProvider0, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        return viewModelProvider0.get(Reflection.getOrCreateKotlinClass(ViewModel.class));
    }
}

