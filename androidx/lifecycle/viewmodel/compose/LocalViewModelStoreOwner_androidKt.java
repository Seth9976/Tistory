package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u000F\u0010\u0000\u001A\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"findViewTreeViewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;", "lifecycle-viewmodel-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLocalViewModelStoreOwner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalViewModelStoreOwner.android.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,27:1\n74#2:28\n*S KotlinDebug\n*F\n+ 1 LocalViewModelStoreOwner.android.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner_androidKt\n*L\n26#1:28\n*E\n"})
public final class LocalViewModelStoreOwner_androidKt {
    @Composable
    @Nullable
    public static final ViewModelStoreOwner findViewTreeViewModelStoreOwner(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x52686103);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x52686103, v, -1, "androidx.lifecycle.viewmodel.compose.findViewTreeViewModelStoreOwner (LocalViewModelStoreOwner.android.kt:25)");
        }
        ViewModelStoreOwner viewModelStoreOwner0 = ViewTreeViewModelStoreOwner.get(((View)composer0.consume(AndroidCompositionLocals_androidKt.getLocalView())));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return viewModelStoreOwner0;
    }
}

