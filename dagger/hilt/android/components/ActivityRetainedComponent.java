package dagger.hilt.android.components;

import dagger.hilt.DefineComponent;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.components.SingletonComponent;

@DefineComponent(parent = SingletonComponent.class)
@ActivityRetainedScoped
public interface ActivityRetainedComponent {
}

