package androidx.lifecycle;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001A\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/AndroidViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "T", "getApplication", "()Landroid/app/Application;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class AndroidViewModel extends ViewModel {
    public final Application H0;

    public AndroidViewModel(@NotNull Application application0) {
        Intrinsics.checkNotNullParameter(application0, "application");
        super();
        this.H0 = application0;
    }

    @NotNull
    public Application getApplication() {
        Intrinsics.checkNotNull(this.H0, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return this.H0;
    }
}

