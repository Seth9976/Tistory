package dagger.hilt.android.internal.managers;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import dagger.hilt.android.internal.ThreadUtil;
import dagger.hilt.internal.Preconditions;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.lifecycle.ActivityRetainedSavedState"})
@ScopeMetadata("dagger.hilt.android.scopes.ActivityRetainedScoped")
public final class SavedStateHandleModule_ProvideSavedStateHandleFactory implements Factory {
    public final Provider a;

    public SavedStateHandleModule_ProvideSavedStateHandleFactory(Provider provider0) {
        this.a = provider0;
    }

    public static SavedStateHandleModule_ProvideSavedStateHandleFactory create(Provider provider0) {
        return new SavedStateHandleModule_ProvideSavedStateHandleFactory(provider0);
    }

    public SavedStateHandle get() {
        return SavedStateHandleModule_ProvideSavedStateHandleFactory.provideSavedStateHandle(((SavedStateHandleHolder)this.a.get()));
    }

    @Override  // javax.inject.Provider
    public Object get() {
        return this.get();
    }

    public static SavedStateHandle provideSavedStateHandle(SavedStateHandleHolder savedStateHandleHolder0) {
        savedStateHandleHolder0.getClass();
        ThreadUtil.ensureMainThread();
        Preconditions.checkState(!savedStateHandleHolder0.c, "Activity that does not extend ComponentActivity cannot use SavedStateHandle", new Object[0]);
        SavedStateHandle savedStateHandle0 = savedStateHandleHolder0.b;
        if(savedStateHandle0 == null) {
            Preconditions.checkNotNull(savedStateHandleHolder0.a, "The first access to SavedStateHandle should happen between super.onCreate() and super.onDestroy()");
            MutableCreationExtras mutableCreationExtras0 = new MutableCreationExtras(savedStateHandleHolder0.a);
            mutableCreationExtras0.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, Bundle.EMPTY);
            savedStateHandleHolder0.a = mutableCreationExtras0;
            savedStateHandle0 = SavedStateHandleSupport.createSavedStateHandle(mutableCreationExtras0);
            savedStateHandleHolder0.b = savedStateHandle0;
            savedStateHandleHolder0.a = null;
        }
        return (SavedStateHandle)dagger.internal.Preconditions.checkNotNullFromProvides(savedStateHandle0);
    }
}

