package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.WindowMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.window.core.ExperimentalWindowApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@ExperimentalWindowApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0017\u0018\u00002\u00020\u0001:\u0002 !B1\b\u0000\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0011\u001A\u00020\f2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001A\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u0016\u001A\u0004\b\u001F\u0010\u0014¨\u0006\""}, d2 = {"Landroidx/window/embedding/SplitRule;", "Landroidx/window/embedding/EmbeddingRule;", "", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDirection", "<init>", "(IIFI)V", "Landroid/view/WindowMetrics;", "parentMetrics", "", "checkParentMetrics", "(Landroid/view/WindowMetrics;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getMinWidth", "b", "getMinSmallestWidth", "c", "F", "getSplitRatio", "()F", "d", "getLayoutDirection", "Api30Impl", "LayoutDir", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public class SplitRule extends EmbeddingRule {
    @RequiresApi(30)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/embedding/SplitRule$Api30Impl;", "", "Landroid/view/WindowMetrics;", "windowMetrics", "Landroid/graphics/Rect;", "getBounds", "(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Api30Impl {
        @NotNull
        public static final Api30Impl INSTANCE;

        static {
            Api30Impl.INSTANCE = new Api30Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @DoNotInline
        @NotNull
        public final Rect getBounds(@NotNull WindowMetrics windowMetrics0) {
            Intrinsics.checkNotNullParameter(windowMetrics0, "windowMetrics");
            Rect rect0 = windowMetrics0.getBounds();
            Intrinsics.checkNotNullExpressionValue(rect0, "windowMetrics.bounds");
            return rect0;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/SplitRule$LayoutDir;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface LayoutDir {
    }

    public final int a;
    public final int b;
    public final float c;
    public final int d;

    public SplitRule() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public SplitRule(int v, int v1, float f, int v2) {
        this.a = v;
        this.b = v1;
        this.c = f;
        this.d = v2;
    }

    public SplitRule(int v, int v1, float f, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 1) != 0) {
            v = 0;
        }
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            f = 0.5f;
        }
        if((v3 & 8) != 0) {
            v2 = 3;
        }
        this(v, v1, f, v2);
    }

    public final boolean checkParentMetrics(@NotNull WindowMetrics windowMetrics0) {
        Intrinsics.checkNotNullParameter(windowMetrics0, "parentMetrics");
        if(Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect rect0 = Api30Impl.INSTANCE.getBounds(windowMetrics0);
        return (this.a == 0 || rect0.width() >= this.a) && (this.b == 0 || Math.min(rect0.width(), rect0.height()) >= this.b);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SplitRule)) {
            return false;
        }
        if(this.a != ((SplitRule)object0).a) {
            return false;
        }
        return this.b == ((SplitRule)object0).b ? this.c == ((SplitRule)object0).c && this.d == ((SplitRule)object0).d : false;
    }

    public final int getLayoutDirection() {
        return this.d;
    }

    public final int getMinSmallestWidth() {
        return this.b;
    }

    public final int getMinWidth() {
        return this.a;
    }

    public final float getSplitRatio() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return a.b(this.c, (this.a * 0x1F + this.b) * 0x1F, 0x1F) + this.d;
    }
}

