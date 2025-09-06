package n4;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;

public final class b extends AbstractSavedStateViewModelFactory {
    @Override  // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String s, Class class0, SavedStateHandle savedStateHandle0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(class0, "modelClass");
        Intrinsics.checkNotNullParameter(savedStateHandle0, "handle");
        return new c(savedStateHandle0);
    }
}

