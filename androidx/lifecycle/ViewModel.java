package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000F\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0004¢\u0006\u0002\u0010\u0005B\u001B\b\u0016\u0012\u0012\u0010\u0006\u001A\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0002\u0010\tB#\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0012\u0010\u0006\u001A\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0002\u0010\nB\u001B\b\u0017\u0012\u0012\u0010\u0006\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u000B0\u0007\"\u00020\u000B¢\u0006\u0002\u0010\fJ\u0010\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u000BH\u0017J\u0010\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\bH\u0016J\u0016\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0011\u001A\u00020\bJ\r\u0010\u0014\u001A\u00020\u0010H\u0001¢\u0006\u0002\b\u0015J\u001F\u0010\u0016\u001A\u0004\u0018\u0001H\u0017\"\b\b\u0000\u0010\u0017*\u00020\b2\u0006\u0010\u0012\u001A\u00020\u0013¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001A\u00020\u0010H\u0014R\u0010\u0010\r\u001A\u0004\u0018\u00010\u000EX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001A"}, d2 = {"Landroidx/lifecycle/ViewModel;", "", "()V", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "closeables", "", "Ljava/lang/AutoCloseable;", "([Ljava/lang/AutoCloseable;)V", "(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "([Ljava/io/Closeable;)V", "impl", "Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "addCloseable", "", "closeable", "key", "", "clear", "clear$lifecycle_viewmodel_release", "getCloseable", "T", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "onCleared", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class ViewModel {
    @Nullable
    private final ViewModelImpl impl;

    public ViewModel() {
        this.impl = new ViewModelImpl();
    }

    public ViewModel(@NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "viewModelScope");
        super();
        this.impl = new ViewModelImpl(coroutineScope0);
    }

    public ViewModel(@NotNull CoroutineScope coroutineScope0, @NotNull AutoCloseable[] arr_autoCloseable) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "viewModelScope");
        Intrinsics.checkNotNullParameter(arr_autoCloseable, "closeables");
        super();
        this.impl = new ViewModelImpl(coroutineScope0, ((AutoCloseable[])Arrays.copyOf(arr_autoCloseable, arr_autoCloseable.length)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public ViewModel(Closeable[] arr_closeable) {
        Intrinsics.checkNotNullParameter(arr_closeable, "closeables");
        super();
        this.impl = new ViewModelImpl(((AutoCloseable[])Arrays.copyOf(arr_closeable, arr_closeable.length)));
    }

    public ViewModel(@NotNull AutoCloseable[] arr_autoCloseable) {
        Intrinsics.checkNotNullParameter(arr_autoCloseable, "closeables");
        super();
        this.impl = new ViewModelImpl(((AutoCloseable[])Arrays.copyOf(arr_autoCloseable, arr_autoCloseable.length)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public void addCloseable(Closeable closeable0) {
        Intrinsics.checkNotNullParameter(closeable0, "closeable");
        ViewModelImpl viewModelImpl0 = this.impl;
        if(viewModelImpl0 != null) {
            viewModelImpl0.addCloseable(closeable0);
        }
    }

    public void addCloseable(@NotNull AutoCloseable autoCloseable0) {
        Intrinsics.checkNotNullParameter(autoCloseable0, "closeable");
        ViewModelImpl viewModelImpl0 = this.impl;
        if(viewModelImpl0 != null) {
            viewModelImpl0.addCloseable(autoCloseable0);
        }
    }

    public final void addCloseable(@NotNull String s, @NotNull AutoCloseable autoCloseable0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(autoCloseable0, "closeable");
        ViewModelImpl viewModelImpl0 = this.impl;
        if(viewModelImpl0 != null) {
            viewModelImpl0.addCloseable(s, autoCloseable0);
        }
    }

    @MainThread
    public final void clear$lifecycle_viewmodel_release() {
        ViewModelImpl viewModelImpl0 = this.impl;
        if(viewModelImpl0 != null) {
            viewModelImpl0.clear();
        }
        this.onCleared();
    }

    @Nullable
    public final AutoCloseable getCloseable(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        return this.impl == null ? null : this.impl.getCloseable(s);
    }

    public void onCleared() {
    }
}

