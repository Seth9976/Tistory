package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001A\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0087@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"trackPipAnimationHintView", "", "Landroid/app/Activity;", "view", "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PipHintTrackerKt {
    public static final Rect access$trackPipAnimationHintView$positionInWindow(View view0) {
        Rect rect0 = new Rect();
        view0.getGlobalVisibleRect(rect0);
        return rect0;
    }

    @RequiresApi(26)
    @Nullable
    public static final Object trackPipAnimationHintView(@NotNull Activity activity0, @NotNull View view0, @NotNull Continuation continuation0) {
        Object object0 = FlowKt.callbackFlow(new h0(view0, null)).collect(new d0(activity0, 0), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

