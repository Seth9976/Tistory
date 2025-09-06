package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00122\u00020\u0001:\u0003\u0013\u0012\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000F\u0010\n\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000F\u0010\u000B\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u000B\u0010\u0003J\u000F\u0010\f\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000F\u0010\r\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001A\u00020\u00062\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/ReportFragment;", "Landroid/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "processListener", "setProcessListener", "(Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;)V", "Companion", "ActivityInitializationListener", "LifecycleCallbacks", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class ReportFragment extends Fragment {
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J\b\u0010\u0004\u001A\u00020\u0003H&J\b\u0010\u0005\u001A\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "", "onCreate", "", "onResume", "onStart", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\nR\u001E\u0010\u0010\u001A\u00020\f*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000F\u0010\u0006\u001A\u0004\b\r\u0010\u000ER\u0014\u0010\u0012\u001A\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/ReportFragment$Companion;", "", "Landroid/app/Activity;", "activity", "", "injectIfNeededIn", "(Landroid/app/Activity;)V", "Landroidx/lifecycle/Lifecycle$Event;", "event", "dispatch$lifecycle_runtime_release", "(Landroid/app/Activity;Landroidx/lifecycle/Lifecycle$Event;)V", "dispatch", "Landroidx/lifecycle/ReportFragment;", "get", "(Landroid/app/Activity;)Landroidx/lifecycle/ReportFragment;", "get$annotations", "reportFragment", "", "REPORT_FRAGMENT_TAG", "Ljava/lang/String;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        public final void dispatch$lifecycle_runtime_release(@NotNull Activity activity0, @NotNull Event lifecycle$Event0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
            if(activity0 instanceof LifecycleRegistryOwner) {
                ((LifecycleRegistryOwner)activity0).getLifecycle().handleLifecycleEvent(lifecycle$Event0);
                return;
            }
            if(activity0 instanceof LifecycleOwner) {
                Lifecycle lifecycle0 = ((LifecycleOwner)activity0).getLifecycle();
                if(lifecycle0 instanceof LifecycleRegistry) {
                    ((LifecycleRegistry)lifecycle0).handleLifecycleEvent(lifecycle$Event0);
                }
            }
        }

        @JvmName(name = "get")
        @NotNull
        public final ReportFragment get(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "<this>");
            Fragment fragment0 = activity0.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            Intrinsics.checkNotNull(fragment0, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (ReportFragment)fragment0;
        }

        @JvmStatic
        public static void get$annotations(Activity activity0) {
        }

        @JvmStatic
        public final void injectIfNeededIn(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            if(Build.VERSION.SDK_INT >= 29) {
                LifecycleCallbacks.Companion.registerIn(activity0);
            }
            FragmentManager fragmentManager0 = activity0.getFragmentManager();
            if(fragmentManager0.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager0.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager0.executePendingTransactions();
            }
        }
    }

    @RequiresApi(29)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u001A\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\n\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u001A\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\f\u001A\u0004\u0018\u00010\bH\u0016J\u0010\u0010\r\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0018\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0016J\u0010\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0010\u0010\u0015\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityPostCreated", "savedInstanceState", "onActivityPostResumed", "onActivityPostStarted", "onActivityPreDestroyed", "onActivityPrePaused", "onActivityPreStopped", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "Companion", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks$Companion;", "", "Landroid/app/Activity;", "activity", "", "registerIn", "(Landroid/app/Activity;)V", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion {
            public androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @JvmStatic
            public final void registerIn(@NotNull Activity activity0) {
                Intrinsics.checkNotNullParameter(activity0, "activity");
                activity0.registerActivityLifecycleCallbacks(new LifecycleCallbacks());
            }
        }

        @NotNull
        public static final androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion Companion;

        static {
            LifecycleCallbacks.Companion = new androidx.lifecycle.ReportFragment.LifecycleCallbacks.Companion(null);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity0, @Nullable Bundle bundle0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPostCreated(@NotNull Activity activity0, @Nullable Bundle bundle0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity0, Event.ON_CREATE);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity0, Event.ON_RESUME);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity0, Event.ON_START);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity0, Event.ON_DESTROY);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPrePaused(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity0, Event.ON_PAUSE);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPreStopped(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity0, Event.ON_STOP);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity0, @NotNull Bundle bundle0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            Intrinsics.checkNotNullParameter(bundle0, "bundle");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
        }

        @JvmStatic
        public static final void registerIn(@NotNull Activity activity0) {
            LifecycleCallbacks.Companion.registerIn(activity0);
        }
    }

    @NotNull
    public static final Companion Companion;
    public ActivityInitializationListener a;

    static {
        ReportFragment.Companion = new Companion(null);
    }

    public final void a(Event lifecycle$Event0) {
        if(Build.VERSION.SDK_INT < 29) {
            Activity activity0 = this.getActivity();
            Intrinsics.checkNotNullExpressionValue(activity0, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity0, lifecycle$Event0);
        }
    }

    @JvmStatic
    public static final void dispatch$lifecycle_runtime_release(@NotNull Activity activity0, @NotNull Event lifecycle$Event0) {
        ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity0, lifecycle$Event0);
    }

    @JvmName(name = "get")
    @NotNull
    public static final ReportFragment get(@NotNull Activity activity0) {
        return ReportFragment.Companion.get(activity0);
    }

    @JvmStatic
    public static final void injectIfNeededIn(@NotNull Activity activity0) {
        ReportFragment.Companion.injectIfNeededIn(activity0);
    }

    @Override  // android.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle0) {
        super.onActivityCreated(bundle0);
        ActivityInitializationListener reportFragment$ActivityInitializationListener0 = this.a;
        if(reportFragment$ActivityInitializationListener0 != null) {
            reportFragment$ActivityInitializationListener0.onCreate();
        }
        this.a(Event.ON_CREATE);
    }

    @Override  // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a(Event.ON_DESTROY);
        this.a = null;
    }

    @Override  // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.a(Event.ON_PAUSE);
    }

    @Override  // android.app.Fragment
    public void onResume() {
        super.onResume();
        ActivityInitializationListener reportFragment$ActivityInitializationListener0 = this.a;
        if(reportFragment$ActivityInitializationListener0 != null) {
            reportFragment$ActivityInitializationListener0.onResume();
        }
        this.a(Event.ON_RESUME);
    }

    @Override  // android.app.Fragment
    public void onStart() {
        super.onStart();
        ActivityInitializationListener reportFragment$ActivityInitializationListener0 = this.a;
        if(reportFragment$ActivityInitializationListener0 != null) {
            reportFragment$ActivityInitializationListener0.onStart();
        }
        this.a(Event.ON_START);
    }

    @Override  // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.a(Event.ON_STOP);
    }

    public final void setProcessListener(@Nullable ActivityInitializationListener reportFragment$ActivityInitializationListener0) {
        this.a = reportFragment$ActivityInitializationListener0;
    }
}

