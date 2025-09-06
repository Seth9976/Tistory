package androidx.compose.ui.platform;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/platform/AndroidUriHandler;", "Landroidx/compose/ui/platform/UriHandler;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "uri", "", "openUri", "(Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidUriHandler implements UriHandler {
    public static final int $stable = 8;
    public final Context a;

    public AndroidUriHandler(@NotNull Context context0) {
        this.a = context0;
    }

    @Override  // androidx.compose.ui.platform.UriHandler
    public void openUri(@NotNull String s) {
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
            this.a.startActivity(intent0);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            throw new IllegalArgumentException("Can\'t open " + s + '.', activityNotFoundException0);
        }
    }
}

