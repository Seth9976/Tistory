package dagger.hilt.android.internal.builders;

import android.view.View;
import dagger.BindsInstance;
import dagger.hilt.DefineComponent.Builder;
import dagger.hilt.android.components.ViewWithFragmentComponent;

@Builder
public interface ViewWithFragmentComponentBuilder {
    ViewWithFragmentComponent build();

    ViewWithFragmentComponentBuilder view(@BindsInstance View arg1);
}

