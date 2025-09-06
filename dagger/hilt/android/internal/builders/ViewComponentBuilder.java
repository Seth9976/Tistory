package dagger.hilt.android.internal.builders;

import android.view.View;
import dagger.BindsInstance;
import dagger.hilt.DefineComponent.Builder;
import dagger.hilt.android.components.ViewComponent;

@Builder
public interface ViewComponentBuilder {
    ViewComponent build();

    ViewComponentBuilder view(@BindsInstance View arg1);
}

