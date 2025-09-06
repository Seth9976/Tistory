package androidx.core.app;

import android.app.Notification.BubbleMetadata.Builder;
import android.app.Notification.BubbleMetadata;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;

public abstract class b1 {
    @Nullable
    @RequiresApi(30)
    public static BubbleMetadata a(@Nullable Notification.BubbleMetadata notification$BubbleMetadata0) {
        if(notification$BubbleMetadata0 == null) {
            return null;
        }
        Builder notificationCompat$BubbleMetadata$Builder0 = notification$BubbleMetadata0.getShortcutId() == null ? new Builder(notification$BubbleMetadata0.getIntent(), IconCompat.createFromIcon(notification$BubbleMetadata0.getIcon())) : new Builder(notification$BubbleMetadata0.getShortcutId());
        notificationCompat$BubbleMetadata$Builder0.setAutoExpandBubble(notification$BubbleMetadata0.getAutoExpandBubble()).setDeleteIntent(notification$BubbleMetadata0.getDeleteIntent()).setSuppressNotification(notification$BubbleMetadata0.isNotificationSuppressed());
        if(notification$BubbleMetadata0.getDesiredHeight() != 0) {
            notificationCompat$BubbleMetadata$Builder0.setDesiredHeight(notification$BubbleMetadata0.getDesiredHeight());
        }
        if(notification$BubbleMetadata0.getDesiredHeightResId() != 0) {
            notificationCompat$BubbleMetadata$Builder0.setDesiredHeightResId(notification$BubbleMetadata0.getDesiredHeightResId());
        }
        return notificationCompat$BubbleMetadata$Builder0.build();
    }

    @Nullable
    @RequiresApi(30)
    public static Notification.BubbleMetadata b(@Nullable BubbleMetadata notificationCompat$BubbleMetadata0) {
        if(notificationCompat$BubbleMetadata0 == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder notification$BubbleMetadata$Builder0 = notificationCompat$BubbleMetadata0.getShortcutId() == null ? new Notification.BubbleMetadata.Builder(notificationCompat$BubbleMetadata0.getIntent(), notificationCompat$BubbleMetadata0.getIcon().toIcon()) : new Notification.BubbleMetadata.Builder(notificationCompat$BubbleMetadata0.getShortcutId());
        notification$BubbleMetadata$Builder0.setDeleteIntent(notificationCompat$BubbleMetadata0.getDeleteIntent()).setAutoExpandBubble(notificationCompat$BubbleMetadata0.getAutoExpandBubble()).setSuppressNotification(notificationCompat$BubbleMetadata0.isNotificationSuppressed());
        if(notificationCompat$BubbleMetadata0.getDesiredHeight() != 0) {
            notification$BubbleMetadata$Builder0.setDesiredHeight(notificationCompat$BubbleMetadata0.getDesiredHeight());
        }
        if(notificationCompat$BubbleMetadata0.getDesiredHeightResId() != 0) {
            notification$BubbleMetadata$Builder0.setDesiredHeightResId(notificationCompat$BubbleMetadata0.getDesiredHeightResId());
        }
        return notification$BubbleMetadata$Builder0.build();
    }
}

