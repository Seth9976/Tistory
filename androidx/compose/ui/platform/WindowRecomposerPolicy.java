package androidx.compose.ui.platform;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.android.HandlerDispatcher;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import md.b;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@InternalComposeUiApi
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u000B\u0010\fJ,\u0010\u0010\u001A\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0003\u001A\u00020\u00022\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000EH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "factory", "getAndSetFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;)Landroidx/compose/ui/platform/WindowRecomposerFactory;", "expected", "", "compareAndSetFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;Landroidx/compose/ui/platform/WindowRecomposerFactory;)Z", "", "setFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;)V", "R", "Lkotlin/Function0;", "block", "withFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "createAndInstallWindowRecomposer$ui_release", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "createAndInstallWindowRecomposer", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WindowRecomposerPolicy {
    public static final int $stable;
    @NotNull
    public static final WindowRecomposerPolicy INSTANCE;
    public static final AtomicReference a;

    static {
        WindowRecomposerPolicy.INSTANCE = new WindowRecomposerPolicy();  // 初始化器: Ljava/lang/Object;-><init>()V
        WindowRecomposerPolicy.a = new AtomicReference(WindowRecomposerFactory.Companion.getLifecycleAware());
        WindowRecomposerPolicy.$stable = 8;
    }

    @PublishedApi
    public final boolean compareAndSetFactory(@NotNull WindowRecomposerFactory windowRecomposerFactory0, @NotNull WindowRecomposerFactory windowRecomposerFactory1) {
        AtomicReference atomicReference0 = WindowRecomposerPolicy.a;
        do {
            if(atomicReference0.compareAndSet(windowRecomposerFactory0, windowRecomposerFactory1)) {
                return true;
            }
        }
        while(atomicReference0.get() == windowRecomposerFactory0);
        return false;
    }

    @NotNull
    public final Recomposer createAndInstallWindowRecomposer$ui_release(@NotNull View view0) {
        Recomposer recomposer0 = ((WindowRecomposerFactory)WindowRecomposerPolicy.a.get()).createRecomposer(view0);
        WindowRecomposer_androidKt.setCompositionContext(view0, recomposer0);
        HandlerDispatcher handlerDispatcher0 = HandlerDispatcherKt.from(view0.getHandler(), "windowRecomposer cleanup").getImmediate();
        a2 a20 = new a2(recomposer0, view0, null);
        view0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public final Job a;

            {
                this.a = job0;
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view0) {
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view0) {
                view0.removeOnAttachStateChangeListener(this);
                DefaultImpls.cancel$default(this.a, null, 1, null);
            }
        });
        return recomposer0;
    }

    @PublishedApi
    @NotNull
    public final WindowRecomposerFactory getAndSetFactory(@NotNull WindowRecomposerFactory windowRecomposerFactory0) {
        return (WindowRecomposerFactory)WindowRecomposerPolicy.a.getAndSet(windowRecomposerFactory0);
    }

    public final void setFactory(@NotNull WindowRecomposerFactory windowRecomposerFactory0) {
        WindowRecomposerPolicy.a.set(windowRecomposerFactory0);
    }

    public final Object withFactory(@NotNull WindowRecomposerFactory windowRecomposerFactory0, @NotNull Function0 function00) {
        Object object0;
        WindowRecomposerFactory windowRecomposerFactory1 = this.getAndSetFactory(windowRecomposerFactory0);
        try {
            object0 = function00.invoke();
        }
        catch(Throwable throwable0) {
            if(this.compareAndSetFactory(windowRecomposerFactory0, windowRecomposerFactory1)) {
                throw throwable0;
            }
            b.addSuppressed(throwable0, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
            throw throwable0;
        }
        if(!this.compareAndSetFactory(windowRecomposerFactory0, windowRecomposerFactory1)) {
            throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
        }
        return object0;
    }
}

