package dagger.hilt.android.internal.builders;

import android.app.Activity;
import dagger.BindsInstance;
import dagger.hilt.DefineComponent.Builder;
import dagger.hilt.android.components.ActivityComponent;

@Builder
public interface ActivityComponentBuilder {
    ActivityComponentBuilder activity(@BindsInstance Activity arg1);

    ActivityComponent build();
}

