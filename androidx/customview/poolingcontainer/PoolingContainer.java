package androidx.customview.poolingcontainer;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q3.a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\u001A\u001B\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001A\u001B\u0010\u0006\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001A\u0011\u0010\u0007\u001A\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A\u0011\u0010\n\u001A\u00020\u0003*\u00020\t¢\u0006\u0004\b\n\u0010\u000B\"(\u0010\u000E\u001A\u00020\f*\u00020\u00002\u0006\u0010\r\u001A\u00020\f8F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0012\u001A\u00020\f*\u00020\u00008F¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u000F¨\u0006\u0013"}, d2 = {"Landroid/view/View;", "Landroidx/customview/poolingcontainer/PoolingContainerListener;", "listener", "", "addPoolingContainerListener", "(Landroid/view/View;Landroidx/customview/poolingcontainer/PoolingContainerListener;)V", "removePoolingContainerListener", "callPoolingContainerOnRelease", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "callPoolingContainerOnReleaseForChildren", "(Landroid/view/ViewGroup;)V", "", "value", "isPoolingContainer", "(Landroid/view/View;)Z", "setPoolingContainer", "(Landroid/view/View;Z)V", "isWithinPoolingContainer", "customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0}, xi = 0x30)
@JvmName(name = "PoolingContainer")
public final class PoolingContainer {
    public static final int a;
    public static final int b;

    static {
        PoolingContainer.a = id.pooling_container_listener_holder_tag;
        PoolingContainer.b = id.is_pooling_container_tag;
    }

    public static final a a(View view0) {
        int v = PoolingContainer.a;
        a a0 = (a)view0.getTag(v);
        if(a0 == null) {
            a0 = new a();
            view0.setTag(v, a0);
        }
        return a0;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void addPoolingContainerListener(@NotNull View view0, @NotNull PoolingContainerListener poolingContainerListener0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(poolingContainerListener0, "listener");
        a a0 = PoolingContainer.a(view0);
        Intrinsics.checkNotNullParameter(poolingContainerListener0, "listener");
        a0.a.add(poolingContainerListener0);
    }

    public static final void callPoolingContainerOnRelease(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        for(Object object0: ViewKt.getAllViews(view0)) {
            ArrayList arrayList0 = PoolingContainer.a(((View)object0)).a;
            for(int v = CollectionsKt__CollectionsKt.getLastIndex(arrayList0); -1 < v; --v) {
                ((PoolingContainerListener)arrayList0.get(v)).onRelease();
            }
        }
    }

    public static final void callPoolingContainerOnReleaseForChildren(@NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "<this>");
        for(Object object0: ViewGroupKt.getChildren(viewGroup0)) {
            ArrayList arrayList0 = PoolingContainer.a(((View)object0)).a;
            for(int v = CollectionsKt__CollectionsKt.getLastIndex(arrayList0); -1 < v; --v) {
                ((PoolingContainerListener)arrayList0.get(v)).onRelease();
            }
        }
    }

    public static final boolean isPoolingContainer(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Object object0 = view0.getTag(PoolingContainer.b);
        Boolean boolean0 = object0 instanceof Boolean ? ((Boolean)object0) : null;
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    public static final boolean isWithinPoolingContainer(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        for(Object object0: ViewKt.getAncestors(view0)) {
            if(((ViewParent)object0) instanceof View && PoolingContainer.isPoolingContainer(((View)(((ViewParent)object0))))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void removePoolingContainerListener(@NotNull View view0, @NotNull PoolingContainerListener poolingContainerListener0) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(poolingContainerListener0, "listener");
        a a0 = PoolingContainer.a(view0);
        Intrinsics.checkNotNullParameter(poolingContainerListener0, "listener");
        a0.a.remove(poolingContainerListener0);
    }

    public static final void setPoolingContainer(@NotNull View view0, boolean z) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        view0.setTag(PoolingContainer.b, Boolean.valueOf(z));
    }
}

