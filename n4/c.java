package n4;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class c extends ViewModel {
    public final SavedStateHandle H0;

    public c(@NotNull SavedStateHandle savedStateHandle0) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "handle");
        super();
        this.H0 = savedStateHandle0;
    }
}

