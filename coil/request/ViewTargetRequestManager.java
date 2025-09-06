package coil.request;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import androidx.annotation.MainThread;
import coil.util.-Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x5.a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001B\u0010\u000E\u001A\u00020\u00062\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001A\u00020\u00102\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001A\u001A\u00020\u00102\u0006\u0010\u0019\u001A\u00020\u0002H\u0017¢\u0006\u0004\b\u001A\u0010\u0005J\u0017\u0010\u001B\u001A\u00020\u00102\u0006\u0010\u0019\u001A\u00020\u0002H\u0017¢\u0006\u0004\b\u001B\u0010\u0005¨\u0006\u001C"}, d2 = {"Lcoil/request/ViewTargetRequestManager;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lcoil/request/ViewTargetDisposable;", "disposable", "", "isDisposed", "(Lcoil/request/ViewTargetDisposable;)Z", "Lkotlinx/coroutines/Deferred;", "Lcoil/request/ImageResult;", "job", "getDisposable", "(Lkotlinx/coroutines/Deferred;)Lcoil/request/ViewTargetDisposable;", "", "dispose", "()V", "getResult", "()Lcoil/request/ImageResult;", "Lcoil/request/ViewTargetRequestDelegate;", "request", "setRequest", "(Lcoil/request/ViewTargetRequestDelegate;)V", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nViewTargetRequestManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewTargetRequestManager.kt\ncoil/request/ViewTargetRequestManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public final class ViewTargetRequestManager implements View.OnAttachStateChangeListener {
    public final View a;
    public ViewTargetDisposable b;
    public Job c;
    public ViewTargetRequestDelegate d;
    public boolean e;

    public ViewTargetRequestManager(@NotNull View view0) {
        this.a = view0;
    }

    public final void dispose() {
        synchronized(this) {
            Job job0 = this.c;
            if(job0 != null) {
                DefaultImpls.cancel$default(job0, null, 1, null);
            }
            MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain().getImmediate();
            a a0 = new a(this, null);
            this.c = BuildersKt.launch$default(GlobalScope.INSTANCE, mainCoroutineDispatcher0, null, a0, 2, null);
            this.b = null;
        }
    }

    @NotNull
    public final ViewTargetDisposable getDisposable(@NotNull Deferred deferred0) {
        synchronized(this) {
            ViewTargetDisposable viewTargetDisposable0 = this.b;
            if(viewTargetDisposable0 != null && -Utils.isMainThread() && this.e) {
                this.e = false;
                viewTargetDisposable0.setJob(deferred0);
                return viewTargetDisposable0;
            }
            Job job0 = this.c;
            if(job0 != null) {
                DefaultImpls.cancel$default(job0, null, 1, null);
            }
            this.c = null;
            ViewTargetDisposable viewTargetDisposable1 = new ViewTargetDisposable(this.a, deferred0);
            this.b = viewTargetDisposable1;
            return viewTargetDisposable1;
        }
    }

    @Nullable
    public final ImageResult getResult() {
        ImageResult imageResult0;
        synchronized(this) {
            ViewTargetDisposable viewTargetDisposable0 = this.b;
            if(viewTargetDisposable0 == null) {
                imageResult0 = null;
            }
            else {
                Deferred deferred0 = viewTargetDisposable0.getJob();
                imageResult0 = deferred0 == null ? null : ((ImageResult)-Utils.getCompletedOrNull(deferred0));
            }
            return imageResult0;
        }
    }

    public final boolean isDisposed(@NotNull ViewTargetDisposable viewTargetDisposable0) {
        synchronized(this) {
        }
        return viewTargetDisposable0 != this.b;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    @MainThread
    public void onViewAttachedToWindow(@NotNull View view0) {
        ViewTargetRequestDelegate viewTargetRequestDelegate0 = this.d;
        if(viewTargetRequestDelegate0 == null) {
            return;
        }
        this.e = true;
        viewTargetRequestDelegate0.restart();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    @MainThread
    public void onViewDetachedFromWindow(@NotNull View view0) {
        ViewTargetRequestDelegate viewTargetRequestDelegate0 = this.d;
        if(viewTargetRequestDelegate0 != null) {
            viewTargetRequestDelegate0.dispose();
        }
    }

    @MainThread
    public final void setRequest(@Nullable ViewTargetRequestDelegate viewTargetRequestDelegate0) {
        ViewTargetRequestDelegate viewTargetRequestDelegate1 = this.d;
        if(viewTargetRequestDelegate1 != null) {
            viewTargetRequestDelegate1.dispose();
        }
        this.d = viewTargetRequestDelegate0;
    }
}

