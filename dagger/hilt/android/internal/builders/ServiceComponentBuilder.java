package dagger.hilt.android.internal.builders;

import android.app.Service;
import dagger.BindsInstance;
import dagger.hilt.DefineComponent.Builder;
import dagger.hilt.android.components.ServiceComponent;

@Builder
public interface ServiceComponentBuilder {
    ServiceComponent build();

    ServiceComponentBuilder service(@BindsInstance Service arg1);
}

