package androidx.compose.ui.platform;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00072\u00020\u0001:\u0005\u0007\b\t\n\u000BJ\u0016\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy;", "", "installFor", "Lkotlin/Function0;", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "Companion", "DisposeOnDetachedFromWindow", "DisposeOnDetachedFromWindowOrReleasedFromPool", "DisposeOnLifecycleDestroyed", "DisposeOnViewTreeLifecycleDestroyed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ViewCompositionStrategy {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0011\u0010\u0005\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$Companion;", "", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "getDefault", "()Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Default", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final ViewCompositionStrategy getDefault() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindow;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "installFor", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        public static final int $stable;
        @NotNull
        public static final DisposeOnDetachedFromWindow INSTANCE;

        static {
            DisposeOnDetachedFromWindow.INSTANCE = new DisposeOnDetachedFromWindow();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // androidx.compose.ui.platform.ViewCompositionStrategy
        @NotNull
        public Function0 installFor(@NotNull AbstractComposeView abstractComposeView0) {
            androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindow.installFor.listener.1 viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$10 = new View.OnAttachStateChangeListener() {
                public final AbstractComposeView a;

                {
                    this.a = abstractComposeView0;
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view0) {
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view0) {
                    this.a.disposeComposition();
                }
            };
            abstractComposeView0.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$10);
            return new o1(abstractComposeView0, viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$10);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "installFor", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final int $stable;
        @NotNull
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool INSTANCE;

        static {
            DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE = new DisposeOnDetachedFromWindowOrReleasedFromPool();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // androidx.compose.ui.platform.ViewCompositionStrategy
        @NotNull
        public Function0 installFor(@NotNull AbstractComposeView abstractComposeView0) {
            androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.installFor.listener.1 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$10 = new View.OnAttachStateChangeListener() {
                public final AbstractComposeView a;

                {
                    this.a = abstractComposeView0;
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view0) {
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view0) {
                    AbstractComposeView abstractComposeView0 = this.a;
                    if(!PoolingContainer.isWithinPoolingContainer(abstractComposeView0)) {
                        abstractComposeView0.disposeComposition();
                    }
                }
            };
            abstractComposeView0.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$10);
            p1 p10 = new p1(abstractComposeView0);
            PoolingContainer.addPoolingContainerListener(abstractComposeView0, p10);
            return new q1(abstractComposeView0, viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$10, p10);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B2\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "installFor", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 8;
        public final Lifecycle a;

        public DisposeOnLifecycleDestroyed(@NotNull Lifecycle lifecycle0) {
            this.a = lifecycle0;
        }

        public DisposeOnLifecycleDestroyed(@NotNull LifecycleOwner lifecycleOwner0) {
            this(lifecycleOwner0.getLifecycle());
        }

        @Override  // androidx.compose.ui.platform.ViewCompositionStrategy
        @NotNull
        public Function0 installFor(@NotNull AbstractComposeView abstractComposeView0) {
            return ViewCompositionStrategy_androidKt.access$installForLifecycle(abstractComposeView0, this.a);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "", "installFor", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nViewCompositionStrategy.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewCompositionStrategy.android.kt\nandroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,196:1\n66#2,9:197\n*S KotlinDebug\n*F\n+ 1 ViewCompositionStrategy.android.kt\nandroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed\n*L\n155#1:197,9\n*E\n"})
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable;
        @NotNull
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE;

        static {
            DisposeOnViewTreeLifecycleDestroyed.INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // androidx.compose.ui.platform.ViewCompositionStrategy
        @NotNull
        public Function0 installFor(@NotNull AbstractComposeView abstractComposeView0) {
            if(abstractComposeView0.isAttachedToWindow()) {
                LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.get(abstractComposeView0);
                if(lifecycleOwner0 != null) {
                    return ViewCompositionStrategy_androidKt.access$installForLifecycle(abstractComposeView0, lifecycleOwner0.getLifecycle());
                }
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(("View tree for " + abstractComposeView0 + " has no ViewTreeLifecycleOwner"));
                throw new KotlinNothingValueException();
            }
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.installFor.listener.1 viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$10 = new View.OnAttachStateChangeListener() {
                public final AbstractComposeView a;
                public final ObjectRef b;

                {
                    AbstractComposeView abstractComposeView0 = ref$ObjectRef0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                    this.a = abstractComposeView0;
                    this.b = ref$ObjectRef0;
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view0) {
                    AbstractComposeView abstractComposeView0 = this.a;
                    LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.get(abstractComposeView0);
                    if(lifecycleOwner0 != null) {
                        this.b.element = ViewCompositionStrategy_androidKt.access$installForLifecycle(abstractComposeView0, lifecycleOwner0.getLifecycle());
                        abstractComposeView0.removeOnAttachStateChangeListener(this);
                        return;
                    }
                    InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(("View tree for " + abstractComposeView0 + " has no ViewTreeLifecycleOwner"));
                    throw new KotlinNothingValueException();
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view0) {
                }
            };
            abstractComposeView0.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$10);
            ref$ObjectRef0.element = new r1(abstractComposeView0, viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$10);
            return new s1(ref$ObjectRef0);
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        ViewCompositionStrategy.Companion = Companion.a;
    }

    @NotNull
    Function0 installFor(@NotNull AbstractComposeView arg1);
}

