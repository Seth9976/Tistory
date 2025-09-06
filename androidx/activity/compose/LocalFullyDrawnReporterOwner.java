package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.activity.ViewTreeFullyDrawnReporterOwner;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J \u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0086\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\t\u001A\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/activity/compose/LocalFullyDrawnReporterOwner;", "", "Landroidx/activity/FullyDrawnReporterOwner;", "fullyDrawnReporterOwner", "Landroidx/compose/runtime/ProvidedValue;", "provides", "(Landroidx/activity/FullyDrawnReporterOwner;)Landroidx/compose/runtime/ProvidedValue;", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/FullyDrawnReporterOwner;", "current", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,176:1\n76#2:177\n76#2:178\n76#2:179\n23#3,8:180\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n*L\n106#1:177\n107#1:178\n108#1:179\n108#1:180,8\n*E\n"})
public final class LocalFullyDrawnReporterOwner {
    public static final int $stable;
    @NotNull
    public static final LocalFullyDrawnReporterOwner INSTANCE;
    public static final ProvidableCompositionLocal a;

    static {
        LocalFullyDrawnReporterOwner.INSTANCE = new LocalFullyDrawnReporterOwner();  // 初始化器: Ljava/lang/Object;-><init>()V
        LocalFullyDrawnReporterOwner.a = CompositionLocalKt.compositionLocalOf$default(null, a.z, 1, null);
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public final FullyDrawnReporterOwner getCurrent(@Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x20329958);
        FullyDrawnReporterOwner fullyDrawnReporterOwner0 = (FullyDrawnReporterOwner)composer0.consume(LocalFullyDrawnReporterOwner.a);
        composer0.startReplaceableGroup(0x5FC124C8);
        if(fullyDrawnReporterOwner0 == null) {
            fullyDrawnReporterOwner0 = ViewTreeFullyDrawnReporterOwner.get(((View)composer0.consume(AndroidCompositionLocals_androidKt.getLocalView())));
        }
        composer0.endReplaceableGroup();
        if(fullyDrawnReporterOwner0 == null) {
            Context context0;
            for(context0 = (Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext()); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
                if(!(context0 instanceof ContextWrapper)) {
                    context0 = null;
                    break;
                }
                if(context0 instanceof FullyDrawnReporterOwner) {
                    break;
                }
            }
            fullyDrawnReporterOwner0 = (FullyDrawnReporterOwner)context0;
        }
        composer0.endReplaceableGroup();
        return fullyDrawnReporterOwner0;
    }

    @NotNull
    public final ProvidedValue provides(@NotNull FullyDrawnReporterOwner fullyDrawnReporterOwner0) {
        return LocalFullyDrawnReporterOwner.a.provides(fullyDrawnReporterOwner0);
    }
}

