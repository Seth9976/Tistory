package dagger.hilt.android.components;

import dagger.hilt.DefineComponent;
import dagger.hilt.android.scopes.ViewScoped;

@DefineComponent(parent = FragmentComponent.class)
@ViewScoped
public interface ViewWithFragmentComponent {
}

