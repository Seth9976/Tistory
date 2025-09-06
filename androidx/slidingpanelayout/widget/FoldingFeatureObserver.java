package androidx.slidingpanelayout.widget;

import a5.a;
import android.app.Activity;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\u000F\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;", "", "Landroidx/window/layout/WindowInfoTracker;", "windowInfoTracker", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Landroidx/window/layout/WindowInfoTracker;Ljava/util/concurrent/Executor;)V", "Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "onFoldingFeatureChangeListener", "", "setOnFoldingFeatureChangeListener", "(Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;)V", "Landroid/app/Activity;", "activity", "registerLayoutStateChangeCallback", "(Landroid/app/Activity;)V", "unregisterLayoutStateChangeCallback", "()V", "OnFoldingFeatureChangeListener", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class FoldingFeatureObserver {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "", "onFoldingFeatureChange", "", "foldingFeature", "Landroidx/window/layout/FoldingFeature;", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public interface OnFoldingFeatureChangeListener {
        void onFoldingFeatureChange(@NotNull FoldingFeature arg1);
    }

    public final WindowInfoTracker a;
    public final Executor b;
    public Job c;
    public OnFoldingFeatureChangeListener d;

    public FoldingFeatureObserver(@NotNull WindowInfoTracker windowInfoTracker0, @NotNull Executor executor0) {
        Intrinsics.checkNotNullParameter(windowInfoTracker0, "windowInfoTracker");
        Intrinsics.checkNotNullParameter(executor0, "executor");
        super();
        this.a = windowInfoTracker0;
        this.b = executor0;
    }

    public static final FoldingFeature access$getFoldingFeature(FoldingFeatureObserver foldingFeatureObserver0, WindowLayoutInfo windowLayoutInfo0) {
        foldingFeatureObserver0.getClass();
        for(Object object0: windowLayoutInfo0.getDisplayFeatures()) {
            if(((DisplayFeature)object0) instanceof FoldingFeature) {
                return object0 instanceof FoldingFeature ? ((FoldingFeature)object0) : null;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static final OnFoldingFeatureChangeListener access$getOnFoldingFeatureChangeListener$p(FoldingFeatureObserver foldingFeatureObserver0) {
        return foldingFeatureObserver0.d;
    }

    public static final WindowInfoTracker access$getWindowInfoTracker$p(FoldingFeatureObserver foldingFeatureObserver0) {
        return foldingFeatureObserver0.a;
    }

    public final void registerLayoutStateChangeCallback(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Job job0 = this.c;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
        this.c = BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(this.b)), null, null, new a(this, activity0, null), 3, null);
    }

    public final void setOnFoldingFeatureChangeListener(@NotNull OnFoldingFeatureChangeListener foldingFeatureObserver$OnFoldingFeatureChangeListener0) {
        Intrinsics.checkNotNullParameter(foldingFeatureObserver$OnFoldingFeatureChangeListener0, "onFoldingFeatureChangeListener");
        this.d = foldingFeatureObserver$OnFoldingFeatureChangeListener0;
    }

    public final void unregisterLayoutStateChangeCallback() {
        Job job0 = this.c;
        if(job0 != null) {
            DefaultImpls.cancel$default(job0, null, 1, null);
        }
    }
}

