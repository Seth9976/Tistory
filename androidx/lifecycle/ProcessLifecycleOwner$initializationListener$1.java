package androidx.lifecycle;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000F\u0010\u0006\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"androidx/lifecycle/ProcessLifecycleOwner$initializationListener$1", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "", "onCreate", "()V", "onStart", "onResume", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ProcessLifecycleOwner.initializationListener.1 implements ActivityInitializationListener {
    public final ProcessLifecycleOwner a;

    public ProcessLifecycleOwner.initializationListener.1(ProcessLifecycleOwner processLifecycleOwner0) {
        this.a = processLifecycleOwner0;
    }

    @Override  // androidx.lifecycle.ReportFragment$ActivityInitializationListener
    public void onCreate() {
    }

    @Override  // androidx.lifecycle.ReportFragment$ActivityInitializationListener
    public void onResume() {
        this.a.activityResumed$lifecycle_process_release();
    }

    @Override  // androidx.lifecycle.ReportFragment$ActivityInitializationListener
    public void onStart() {
        this.a.activityStarted$lifecycle_process_release();
    }
}

