package com.kakao.tistory.presentation.view.setting;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationManagerCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\n\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ!\u0010\u000F\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\f2\b\u0010\u000E\u001A\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R$\u0010\u0018\u001A\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/RequestNotificationPermissionBySettings;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lkotlin/Unit;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "Landroidx/core/app/NotificationManagerCompat;", "a", "Landroidx/core/app/NotificationManagerCompat;", "getNotificationManager", "()Landroidx/core/app/NotificationManagerCompat;", "setNotificationManager", "(Landroidx/core/app/NotificationManagerCompat;)V", "notificationManager", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RequestNotificationPermissionBySettings extends ActivityResultContract {
    public static final int $stable = 8;
    public NotificationManagerCompat a;

    @Override  // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context0, Object object0) {
        return this.createIntent(context0, ((Unit)object0));
    }

    @NotNull
    public Intent createIntent(@NotNull Context context0, @NotNull Unit unit0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(unit0, "input");
        this.a = NotificationManagerCompat.from(context0);
        Intent intent0 = new Intent();
        intent0.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent0.putExtra("android.provider.extra.APP_PACKAGE", "net.daum.android.tistoryapp");
        return intent0;
    }

    @Nullable
    public final NotificationManagerCompat getNotificationManager() {
        return this.a;
    }

    @NotNull
    public Boolean parseResult(int v, @Nullable Intent intent0) {
        return this.a == null ? false : Boolean.valueOf(this.a.areNotificationsEnabled());
    }

    @Override  // androidx.activity.result.contract.ActivityResultContract
    public Object parseResult(int v, Intent intent0) {
        return this.parseResult(v, intent0);
    }

    public final void setNotificationManager(@Nullable NotificationManagerCompat notificationManagerCompat0) {
        this.a = notificationManagerCompat0;
    }
}

