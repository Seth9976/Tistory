package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\t\u001A\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\u001F\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001F\u0010\u0013\u001A\u00020\u000F2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u001D\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/node/MergedViewAdapter;", "Landroidx/compose/ui/node/ViewAdapter;", "<init>", "()V", "T", "", "id", "Lkotlin/Function0;", "factory", "get", "(ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "parent", "", "willInsert", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "didInsert", "didUpdate", "", "a", "Ljava/util/List;", "getAdapters", "()Ljava/util/List;", "adapters", "I", "getId", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,92:1\n116#2,2:93\n33#2,6:95\n118#2:101\n33#2,6:102\n33#2,6:108\n33#2,6:114\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n*L\n48#1:93,2\n48#1:95,6\n48#1:101\n56#1:102,6\n60#1:108,6\n64#1:114,6\n*E\n"})
public final class MergedViewAdapter implements ViewAdapter {
    public static final int $stable = 8;
    public final ArrayList a;

    public MergedViewAdapter() {
        this.a = new ArrayList();
    }

    @Override  // androidx.compose.ui.node.ViewAdapter
    public void didInsert(@NotNull View view0, @NotNull ViewGroup viewGroup0) {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ViewAdapter)arrayList0.get(v1)).didInsert(view0, viewGroup0);
        }
    }

    @Override  // androidx.compose.ui.node.ViewAdapter
    public void didUpdate(@NotNull View view0, @NotNull ViewGroup viewGroup0) {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ViewAdapter)arrayList0.get(v1)).didUpdate(view0, viewGroup0);
        }
    }

    @NotNull
    public final ViewAdapter get(int v, @NotNull Function0 function00) {
        ViewAdapter viewAdapter0;
        Object object0;
        List list0 = this.getAdapters();
        int v1 = list0.size();
        for(int v2 = 0; true; ++v2) {
            object0 = null;
            viewAdapter0 = null;
            if(v2 >= v1) {
                break;
            }
            Object object1 = list0.get(v2);
            if(((ViewAdapter)object1).getId() == v) {
                object0 = object1;
                break;
            }
        }
        if(object0 instanceof ViewAdapter) {
            viewAdapter0 = (ViewAdapter)object0;
        }
        if(viewAdapter0 != null) {
            return viewAdapter0;
        }
        ViewAdapter viewAdapter1 = (ViewAdapter)function00.invoke();
        this.getAdapters().add(viewAdapter1);
        return viewAdapter1;
    }

    @NotNull
    public final List getAdapters() {
        return this.a;
    }

    @Override  // androidx.compose.ui.node.ViewAdapter
    public int getId() {
        return 0;
    }

    @Override  // androidx.compose.ui.node.ViewAdapter
    public void willInsert(@NotNull View view0, @NotNull ViewGroup viewGroup0) {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ViewAdapter)arrayList0.get(v1)).willInsert(view0, viewGroup0);
        }
    }
}

