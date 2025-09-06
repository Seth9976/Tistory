package dagger.hilt.android.components;

import dagger.hilt.DefineComponent;
import dagger.hilt.android.scopes.ViewModelScoped;

@DefineComponent(parent = ActivityRetainedComponent.class)
@ViewModelScoped
public interface ViewModelComponent {
}

