package androidx.compose.ui.node;

import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A3\u0010\u0007\u001A\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00032\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001A\u0017\u0010\u000B\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\tH\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A\u0015\u0010\u000E\u001A\u0004\u0018\u00010\r*\u00020\u0002H\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u0013\u0010\u0010\u001A\u00020\r*\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u000F¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/ViewAdapter;", "T", "Landroid/view/View;", "", "id", "Lkotlin/Function0;", "factory", "getOrAddAdapter", "(Landroid/view/View;ILkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/ViewAdapter;", "", "key", "tagKey", "(Ljava/lang/String;)I", "Landroidx/compose/ui/node/MergedViewAdapter;", "getViewAdapterIfExists", "(Landroid/view/View;)Landroidx/compose/ui/node/MergedViewAdapter;", "getViewAdapter", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n+ 2 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,92:1\n48#2:93\n49#2,4:103\n116#3,2:94\n33#3,6:96\n118#3:102\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n*L\n39#1:93\n39#1:103,4\n39#1:94,2\n39#1:96,6\n39#1:102\n*E\n"})
public final class ViewInterop_androidKt {
    public static final int a;

    static {
        ViewInterop_androidKt.a = 0x1F4454CA;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final ViewAdapter getOrAddAdapter(@NotNull View view0, int v, @NotNull Function0 function00) {
        ViewAdapter viewAdapter0;
        Object object0;
        MergedViewAdapter mergedViewAdapter0 = ViewInterop_androidKt.getViewAdapter(view0);
        List list0 = mergedViewAdapter0.getAdapters();
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
        if(viewAdapter0 == null) {
            viewAdapter0 = (ViewAdapter)function00.invoke();
            mergedViewAdapter0.getAdapters().add(viewAdapter0);
        }
        return viewAdapter0;
    }

    @NotNull
    public static final MergedViewAdapter getViewAdapter(@NotNull View view0) {
        int v = ViewInterop_androidKt.a;
        Object object0 = view0.getTag(v);
        MergedViewAdapter mergedViewAdapter0 = object0 instanceof MergedViewAdapter ? ((MergedViewAdapter)object0) : null;
        if(mergedViewAdapter0 == null) {
            mergedViewAdapter0 = new MergedViewAdapter();
            view0.setTag(v, mergedViewAdapter0);
        }
        return mergedViewAdapter0;
    }

    @Nullable
    public static final MergedViewAdapter getViewAdapterIfExists(@NotNull View view0) {
        Object object0 = view0.getTag(ViewInterop_androidKt.a);
        return object0 instanceof MergedViewAdapter ? ((MergedViewAdapter)object0) : null;
    }

    public static final int tagKey(@NotNull String s) [...] // 潜在的解密器
}

