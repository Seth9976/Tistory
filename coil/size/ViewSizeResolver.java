package coil.size;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import zf.e;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001A\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001A\u00028\u00008&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001A\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0003"}, d2 = {"Lcoil/size/ViewSizeResolver;", "Landroid/view/View;", "T", "Lcoil/size/SizeResolver;", "Lcoil/size/Size;", "size", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getView", "()Landroid/view/View;", "view", "", "getSubtractPadding", "()Z", "subtractPadding", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nViewSizeResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewSizeResolver.kt\ncoil/size/ViewSizeResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,118:1\n1#2:119\n314#3,11:120\n*S KotlinDebug\n*F\n+ 1 ViewSizeResolver.kt\ncoil/size/ViewSizeResolver\n*L\n42#1:120,11\n*E\n"})
public interface ViewSizeResolver extends SizeResolver {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getSubtractPadding(@NotNull ViewSizeResolver viewSizeResolver0) {
            return viewSizeResolver0.super.getSubtractPadding();
        }

        @Deprecated
        @Nullable
        public static Object size(@NotNull ViewSizeResolver viewSizeResolver0, @NotNull Continuation continuation0) {
            return viewSizeResolver0.super.size(continuation0);
        }
    }

    static Dimension a(int v, int v1, int v2) {
        if(v == -2) {
            return Undefined.INSTANCE;
        }
        int v3 = v - v2;
        if(v3 > 0) {
            return -Dimensions.Dimension(v3);
        }
        int v4 = v1 - v2;
        return v4 > 0 ? -Dimensions.Dimension(v4) : null;
    }

    default void b(ViewTreeObserver viewTreeObserver0, ViewTreeObserver.OnPreDrawListener viewTreeObserver$OnPreDrawListener0) {
        if(viewTreeObserver0.isAlive()) {
            viewTreeObserver0.removeOnPreDrawListener(viewTreeObserver$OnPreDrawListener0);
            return;
        }
        this.getView().getViewTreeObserver().removeOnPreDrawListener(viewTreeObserver$OnPreDrawListener0);
    }

    default Dimension getHeight() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getView().getLayoutParams();
        int v = viewGroup$LayoutParams0 == null ? -1 : viewGroup$LayoutParams0.height;
        int v1 = this.getView().getHeight();
        if(this.getSubtractPadding()) {
            int v2 = this.getView().getPaddingTop();
            return ViewSizeResolver.a(v, v1, this.getView().getPaddingBottom() + v2);
        }
        return ViewSizeResolver.a(v, v1, 0);
    }

    default Size getSize() {
        Dimension dimension0 = this.getWidth();
        if(dimension0 == null) {
            return null;
        }
        Dimension dimension1 = this.getHeight();
        return dimension1 == null ? null : new Size(dimension0, dimension1);
    }

    default boolean getSubtractPadding() {
        return true;
    }

    @NotNull
    View getView();

    default Dimension getWidth() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getView().getLayoutParams();
        int v = viewGroup$LayoutParams0 == null ? -1 : viewGroup$LayoutParams0.width;
        int v1 = this.getView().getWidth();
        if(this.getSubtractPadding()) {
            int v2 = this.getView().getPaddingLeft();
            return ViewSizeResolver.a(v, v1, this.getView().getPaddingRight() + v2);
        }
        return ViewSizeResolver.a(v, v1, 0);
    }

    @Override  // coil.size.SizeResolver
    @Nullable
    default Object size(@NotNull Continuation continuation0) {
        return ViewSizeResolver.size$suspendImpl(this, continuation0);
    }

    static Object size$suspendImpl(ViewSizeResolver viewSizeResolver0, Continuation continuation0) {
        Size size0 = viewSizeResolver0.getSize();
        if(size0 != null) {
            return size0;
        }
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        ViewTreeObserver viewTreeObserver0 = viewSizeResolver0.getView().getViewTreeObserver();
        coil.size.ViewSizeResolver.size.3.preDrawListener.1 viewSizeResolver$size$3$preDrawListener$10 = new ViewTreeObserver.OnPreDrawListener() {
            public boolean a;
            public final ViewSizeResolver b;
            public final ViewTreeObserver c;
            public final CancellableContinuationImpl d;

            {
                ViewSizeResolver viewSizeResolver0 = viewSizeResolver0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                ViewTreeObserver viewTreeObserver0 = viewTreeObserver0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                CancellableContinuationImpl cancellableContinuationImpl0 = cancellableContinuationImpl0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.b = viewSizeResolver0;
                this.c = viewTreeObserver0;
                this.d = cancellableContinuationImpl0;
            }

            @Override  // android.view.ViewTreeObserver$OnPreDrawListener
            public boolean onPreDraw() {
                ViewSizeResolver viewSizeResolver0 = this.b;
                Size size0 = viewSizeResolver0.getSize();
                if(size0 != null) {
                    viewSizeResolver0.b(this.c, this);
                    if(!this.a) {
                        this.a = true;
                        this.d.resumeWith(size0);
                    }
                }
                return true;
            }
        };
        viewTreeObserver0.addOnPreDrawListener(viewSizeResolver$size$3$preDrawListener$10);
        cancellableContinuationImpl0.invokeOnCancellation(new e(viewSizeResolver0, viewTreeObserver0, 1, viewSizeResolver$size$3$preDrawListener$10));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }
}

