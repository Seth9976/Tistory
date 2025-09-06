package dagger.hilt.android.components;

import dagger.hilt.DefineComponent;
import dagger.hilt.android.scopes.ViewScoped;

@DefineComponent(parent = ActivityComponent.class)
@ViewScoped
public interface ViewComponent {
}

