package com.kakao.tistory.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

@OriginatingElement(topLevelClass = TistoryLoginViewModel.class)
public final class TistoryLoginViewModel_HiltModules {
    @Module
    @InstallIn({ViewModelComponent.class})
    public static abstract class BindsModule {
        @Binds
        @HiltViewModelMap
        @IntoMap
        @StringKey("com.kakao.tistory.presentation.viewmodel.TistoryLoginViewModel")
        public abstract ViewModel binds(TistoryLoginViewModel arg1);
    }

    @Module
    @InstallIn({ActivityRetainedComponent.class})
    public static final class KeyModule {
        @Provides
        @KeySet
        @IntoSet
        public static String provide() [...] // Inlined contents
    }

}

