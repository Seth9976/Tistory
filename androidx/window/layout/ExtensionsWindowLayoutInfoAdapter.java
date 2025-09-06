package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.extensions.layout.DisplayFeature;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001J!\u0010\t\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\t\u001A\u00020\f2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\nH\u0000¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/window/layout/ExtensionsWindowLayoutInfoAdapter;", "", "Landroid/app/Activity;", "activity", "Landroidx/window/extensions/layout/FoldingFeature;", "oemFeature", "Landroidx/window/layout/FoldingFeature;", "translate$window_release", "(Landroid/app/Activity;Landroidx/window/extensions/layout/FoldingFeature;)Landroidx/window/layout/FoldingFeature;", "translate", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "info", "Landroidx/window/layout/WindowLayoutInfo;", "(Landroid/app/Activity;Landroidx/window/extensions/layout/WindowLayoutInfo;)Landroidx/window/layout/WindowLayoutInfo;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class ExtensionsWindowLayoutInfoAdapter {
    @NotNull
    public static final ExtensionsWindowLayoutInfoAdapter INSTANCE;

    static {
        ExtensionsWindowLayoutInfoAdapter.INSTANCE = new ExtensionsWindowLayoutInfoAdapter();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Nullable
    public final FoldingFeature translate$window_release(@NotNull Activity activity0, @NotNull androidx.window.extensions.layout.FoldingFeature foldingFeature0) {
        State foldingFeature$State0;
        Type hardwareFoldingFeature$Type0;
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(foldingFeature0, "oemFeature");
        switch(foldingFeature0.getType()) {
            case 1: {
                hardwareFoldingFeature$Type0 = Type.Companion.getFOLD();
                break;
            }
            case 2: {
                hardwareFoldingFeature$Type0 = Type.Companion.getHINGE();
                break;
            }
            default: {
                return null;
            }
        }
        switch(foldingFeature0.getState()) {
            case 1: {
                foldingFeature$State0 = State.FLAT;
                break;
            }
            case 2: {
                foldingFeature$State0 = State.HALF_OPENED;
                break;
            }
            default: {
                return null;
            }
        }
        Rect rect0 = foldingFeature0.getBounds();
        Intrinsics.checkNotNullExpressionValue(rect0, "oemFeature.bounds");
        Bounds bounds0 = new Bounds(rect0);
        Rect rect1 = WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics(activity0).getBounds();
        if(!bounds0.isZero() && (bounds0.getWidth() == rect1.width() || bounds0.getHeight() == rect1.height()) && (bounds0.getWidth() >= rect1.width() || bounds0.getHeight() >= rect1.height()) && (bounds0.getWidth() != rect1.width() || bounds0.getHeight() != rect1.height())) {
            Rect rect2 = foldingFeature0.getBounds();
            Intrinsics.checkNotNullExpressionValue(rect2, "oemFeature.bounds");
            return new HardwareFoldingFeature(new Bounds(rect2), hardwareFoldingFeature$Type0, foldingFeature$State0);
        }
        return null;
    }

    @NotNull
    public final WindowLayoutInfo translate$window_release(@NotNull Activity activity0, @NotNull androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo0) {
        FoldingFeature foldingFeature0;
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(windowLayoutInfo0, "info");
        List list0 = windowLayoutInfo0.getDisplayFeatures();
        Intrinsics.checkNotNullExpressionValue(list0, "info.displayFeatures");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            DisplayFeature displayFeature0 = (DisplayFeature)object0;
            if(displayFeature0 instanceof androidx.window.extensions.layout.FoldingFeature) {
                Intrinsics.checkNotNullExpressionValue(displayFeature0, "feature");
                foldingFeature0 = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(activity0, ((androidx.window.extensions.layout.FoldingFeature)displayFeature0));
            }
            else {
                foldingFeature0 = null;
            }
            if(foldingFeature0 != null) {
                arrayList0.add(foldingFeature0);
            }
        }
        return new WindowLayoutInfo(arrayList0);
    }
}

