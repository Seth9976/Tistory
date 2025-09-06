package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import j.a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J \u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0086\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\t\u001A\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;", "", "Landroidx/activity/OnBackPressedDispatcherOwner;", "dispatcherOwner", "Landroidx/compose/runtime/ProvidedValue;", "provides", "(Landroidx/activity/OnBackPressedDispatcherOwner;)Landroidx/compose/runtime/ProvidedValue;", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/OnBackPressedDispatcherOwner;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,110:1\n76#2:111\n76#2:112\n76#2:113\n23#3,8:114\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/LocalOnBackPressedDispatcherOwner\n*L\n51#1:111\n52#1:112\n53#1:113\n53#1:114,8\n*E\n"})
public final class LocalOnBackPressedDispatcherOwner {
    public static final int $stable;
    @NotNull
    public static final LocalOnBackPressedDispatcherOwner INSTANCE;
    public static final ProvidableCompositionLocal a;

    static {
        LocalOnBackPressedDispatcherOwner.INSTANCE = new LocalOnBackPressedDispatcherOwner();  // 初始化器: Ljava/lang/Object;-><init>()V
        LocalOnBackPressedDispatcherOwner.a = CompositionLocalKt.compositionLocalOf$default(null, a.A, 1, null);
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public final OnBackPressedDispatcherOwner getCurrent(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(-2068013981);
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner0 = (OnBackPressedDispatcherOwner)composer0.consume(LocalOnBackPressedDispatcherOwner.a);
        composer0.startReplaceableGroup(0x64249EFD);
        if(onBackPressedDispatcherOwner0 == null) {
            onBackPressedDispatcherOwner0 = ViewTreeOnBackPressedDispatcherOwner.get(((View)composer0.consume(AndroidCompositionLocals_androidKt.getLocalView())));
        }
        composer0.endReplaceableGroup();
        if(onBackPressedDispatcherOwner0 == null) {
            Context context0;
            for(context0 = (Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext()); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
                if(!(context0 instanceof ContextWrapper)) {
                    context0 = null;
                    break;
                }
                if(context0 instanceof OnBackPressedDispatcherOwner) {
                    break;
                }
            }
            onBackPressedDispatcherOwner0 = (OnBackPressedDispatcherOwner)context0;
        }
        composer0.endReplaceableGroup();
        return onBackPressedDispatcherOwner0;
    }

    @NotNull
    public final ProvidedValue provides(@NotNull OnBackPressedDispatcherOwner onBackPressedDispatcherOwner0) {
        return LocalOnBackPressedDispatcherOwner.a.provides(onBackPressedDispatcherOwner0);
    }
}

