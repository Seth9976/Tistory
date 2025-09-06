package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelStoreOwner;
import j4.a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J \u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0086\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\t\u001A\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;", "", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "Landroidx/compose/runtime/ProvidedValue;", "provides", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/compose/runtime/ProvidedValue;", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;", "current", "lifecycle-viewmodel-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLocalViewModelStoreOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,53:1\n74#2:54\n*S KotlinDebug\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n*L\n39#1:54\n*E\n"})
public final class LocalViewModelStoreOwner {
    public static final int $stable;
    @NotNull
    public static final LocalViewModelStoreOwner INSTANCE;
    public static final ProvidableCompositionLocal a;

    static {
        LocalViewModelStoreOwner.INSTANCE = new LocalViewModelStoreOwner();  // 初始化器: Ljava/lang/Object;-><init>()V
        LocalViewModelStoreOwner.a = CompositionLocalKt.compositionLocalOf$default(null, a.w, 1, null);
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public final ViewModelStoreOwner getCurrent(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0xDD2E61C8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDD2E61C8, v, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:38)");
        }
        ViewModelStoreOwner viewModelStoreOwner0 = (ViewModelStoreOwner)composer0.consume(LocalViewModelStoreOwner.a);
        if(viewModelStoreOwner0 == null) {
            viewModelStoreOwner0 = LocalViewModelStoreOwner_androidKt.findViewTreeViewModelStoreOwner(composer0, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return viewModelStoreOwner0;
    }

    @NotNull
    public final ProvidedValue provides(@NotNull ViewModelStoreOwner viewModelStoreOwner0) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner0, "viewModelStoreOwner");
        return LocalViewModelStoreOwner.a.provides(viewModelStoreOwner0);
    }
}

