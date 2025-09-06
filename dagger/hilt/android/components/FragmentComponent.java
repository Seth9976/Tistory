package dagger.hilt.android.components;

import dagger.hilt.DefineComponent;
import dagger.hilt.android.scopes.FragmentScoped;

@DefineComponent(parent = ActivityComponent.class)
@FragmentScoped
public interface FragmentComponent {
}

