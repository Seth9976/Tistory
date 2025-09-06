package androidx.core.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.CallStyle;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class i1 {
    @DoNotInline
    public static Notification.CallStyle a(@NonNull Person person0, @NonNull PendingIntent pendingIntent0, @NonNull PendingIntent pendingIntent1) {
        return Notification.CallStyle.forIncomingCall(person0, pendingIntent0, pendingIntent1);
    }

    @DoNotInline
    public static Notification.CallStyle b(@NonNull Person person0, @NonNull PendingIntent pendingIntent0) {
        return Notification.CallStyle.forOngoingCall(person0, pendingIntent0);
    }

    @DoNotInline
    public static Notification.CallStyle c(@NonNull Person person0, @NonNull PendingIntent pendingIntent0, @NonNull PendingIntent pendingIntent1) {
        return Notification.CallStyle.forScreeningCall(person0, pendingIntent0, pendingIntent1);
    }

    @DoNotInline
    public static Notification.CallStyle d(Notification.CallStyle notification$CallStyle0, @ColorInt int v) {
        return notification$CallStyle0.setAnswerButtonColorHint(v);
    }

    @DoNotInline
    public static Notification.Action.Builder e(Notification.Action.Builder notification$Action$Builder0, boolean z) {
        return notification$Action$Builder0.setAuthenticationRequired(z);
    }

    @DoNotInline
    public static Notification.CallStyle f(Notification.CallStyle notification$CallStyle0, @ColorInt int v) {
        return notification$CallStyle0.setDeclineButtonColorHint(v);
    }

    @DoNotInline
    public static Notification.CallStyle g(Notification.CallStyle notification$CallStyle0, boolean z) {
        return notification$CallStyle0.setIsVideo(z);
    }

    @DoNotInline
    public static Notification.CallStyle h(Notification.CallStyle notification$CallStyle0, @Nullable Icon icon0) {
        return notification$CallStyle0.setVerificationIcon(icon0);
    }

    @DoNotInline
    public static Notification.CallStyle i(Notification.CallStyle notification$CallStyle0, @Nullable CharSequence charSequence0) {
        return notification$CallStyle0.setVerificationText(charSequence0);
    }
}

