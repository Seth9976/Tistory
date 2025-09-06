package dagger.hilt.android.internal.managers;

import androidx.lifecycle.ViewModel;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;

public final class b extends ViewModel {
    public final ActivityRetainedComponent H0;
    public final SavedStateHandleHolder I0;

    public b(ActivityRetainedComponent activityRetainedComponent0, SavedStateHandleHolder savedStateHandleHolder0) {
        this.H0 = activityRetainedComponent0;
        this.I0 = savedStateHandleHolder0;
    }

    @Override  // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((RetainedLifecycleImpl)((ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint)EntryPoints.get(this.H0, ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint.class)).getActivityRetainedLifecycle()).dispatchOnCleared();
    }
}

