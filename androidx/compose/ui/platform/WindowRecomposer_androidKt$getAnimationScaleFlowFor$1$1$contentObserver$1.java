package androidx.compose.ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "", "onChange", "(ZLandroid/net/Uri;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WindowRecomposer_androidKt.getAnimationScaleFlowFor.1.1.contentObserver.1 extends ContentObserver {
    public final Channel a;

    public WindowRecomposer_androidKt.getAnimationScaleFlowFor.1.1.contentObserver.1(Channel channel0, Handler handler0) {
        this.a = channel0;
        super(handler0);
    }

    @Override  // android.database.ContentObserver
    public void onChange(boolean z, @Nullable Uri uri0) {
        this.a.trySend-JP2dKIU(Unit.INSTANCE);
    }
}

