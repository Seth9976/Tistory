package dagger.hilt.android.internal.builders;

import dagger.BindsInstance;
import dagger.hilt.DefineComponent.Builder;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;

@Builder
public interface ActivityRetainedComponentBuilder {
    ActivityRetainedComponent build();

    ActivityRetainedComponentBuilder savedStateHandleHolder(@BindsInstance SavedStateHandleHolder arg1);
}

