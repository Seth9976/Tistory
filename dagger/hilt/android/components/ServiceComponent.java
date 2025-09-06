package dagger.hilt.android.components;

import dagger.hilt.DefineComponent;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.components.SingletonComponent;

@DefineComponent(parent = SingletonComponent.class)
@ServiceScoped
public interface ServiceComponent {
}

