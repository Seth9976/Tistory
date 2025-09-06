package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification.Action.Builder;
import android.app.Notification.Action;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.Builder;
import android.app.Notification.CallStyle;
import android.app.Notification.InboxStyle;
import android.app.Notification.MessagingStyle.Message;
import android.app.Notification.MessagingStyle;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput.Builder;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.activity.p;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.R.color;
import androidx.core.R.dimen;
import androidx.core.R.drawable;
import androidx.core.R.id;
import androidx.core.R.integer;
import androidx.core.R.string;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class NotificationCompat {
    public static class Action {
        public static final class Builder {
            public final IconCompat a;
            public final CharSequence b;
            public final PendingIntent c;
            public boolean d;
            public final Bundle e;
            public ArrayList f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;

            public Builder(int v, @Nullable CharSequence charSequence0, @Nullable PendingIntent pendingIntent0) {
                this((v == 0 ? null : IconCompat.createWithResource(null, "", v)), charSequence0, pendingIntent0, new Bundle(), null, true, 0, true, false, false);
            }

            public Builder(@NonNull Action notificationCompat$Action0) {
                this(notificationCompat$Action0.getIconCompat(), notificationCompat$Action0.title, notificationCompat$Action0.actionIntent, new Bundle(notificationCompat$Action0.a), notificationCompat$Action0.getRemoteInputs(), notificationCompat$Action0.getAllowGeneratedReplies(), notificationCompat$Action0.getSemanticAction(), notificationCompat$Action0.f, notificationCompat$Action0.isContextual(), notificationCompat$Action0.isAuthenticationRequired());
            }

            public Builder(@Nullable IconCompat iconCompat0, @Nullable CharSequence charSequence0, @Nullable PendingIntent pendingIntent0) {
                this(iconCompat0, charSequence0, pendingIntent0, new Bundle(), null, true, 0, true, false, false);
            }

            public Builder(IconCompat iconCompat0, CharSequence charSequence0, PendingIntent pendingIntent0, Bundle bundle0, RemoteInput[] arr_remoteInput, boolean z, int v, boolean z1, boolean z2, boolean z3) {
                this.d = true;
                this.h = true;
                this.a = iconCompat0;
                this.b = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
                this.c = pendingIntent0;
                this.e = bundle0;
                this.f = arr_remoteInput == null ? null : new ArrayList(Arrays.asList(arr_remoteInput));
                this.d = z;
                this.g = v;
                this.h = z1;
                this.i = z2;
                this.j = z3;
            }

            @NonNull
            public Builder addExtras(@Nullable Bundle bundle0) {
                if(bundle0 != null) {
                    this.e.putAll(bundle0);
                }
                return this;
            }

            @NonNull
            public Builder addRemoteInput(@Nullable RemoteInput remoteInput0) {
                if(this.f == null) {
                    this.f = new ArrayList();
                }
                if(remoteInput0 != null) {
                    this.f.add(remoteInput0);
                }
                return this;
            }

            @NonNull
            public Action build() {
                if(this.i && this.c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
                ArrayList arrayList0 = new ArrayList();
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = this.f;
                if(arrayList2 != null) {
                    for(Object object0: arrayList2) {
                        RemoteInput remoteInput0 = (RemoteInput)object0;
                        if(remoteInput0.isDataOnly()) {
                            arrayList0.add(remoteInput0);
                        }
                        else {
                            arrayList1.add(remoteInput0);
                        }
                    }
                }
                RemoteInput[] arr_remoteInput = arrayList0.isEmpty() ? null : ((RemoteInput[])arrayList0.toArray(new RemoteInput[arrayList0.size()]));
                if(arrayList1.isEmpty()) {
                    return new Action(this.a, this.b, this.c, this.e, null, arr_remoteInput, this.d, this.g, this.h, this.i, this.j);
                }
                RemoteInput[] arr_remoteInput1 = (RemoteInput[])arrayList1.toArray(new RemoteInput[arrayList1.size()]);
                return new Action(this.a, this.b, this.c, this.e, arr_remoteInput1, arr_remoteInput, this.d, this.g, this.h, this.i, this.j);
            }

            @NonNull
            public Builder extend(@NonNull Extender notificationCompat$Action$Extender0) {
                notificationCompat$Action$Extender0.extend(this);
                return this;
            }

            @NonNull
            @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
            public static Builder fromAndroidAction(@NonNull Notification.Action notification$Action0) {
                Builder notificationCompat$Action$Builder0 = m0.a(notification$Action0) == null ? new Builder(notification$Action0.icon, notification$Action0.title, notification$Action0.actionIntent) : new Builder(IconCompat.createFromIconOrNullIfZeroResId(m0.a(notification$Action0)), notification$Action0.title, notification$Action0.actionIntent);
                android.app.RemoteInput[] arr_remoteInput = l0.b(notification$Action0);
                if(arr_remoteInput != null && arr_remoteInput.length != 0) {
                    for(int v = 0; v < arr_remoteInput.length; ++v) {
                        android.app.RemoteInput remoteInput0 = arr_remoteInput[v];
                        androidx.core.app.RemoteInput.Builder remoteInput$Builder0 = new androidx.core.app.RemoteInput.Builder(remoteInput0.getResultKey()).setLabel(remoteInput0.getLabel()).setChoices(remoteInput0.getChoices()).setAllowFreeFormInput(remoteInput0.getAllowFreeFormInput()).addExtras(remoteInput0.getExtras());
                        Set set0 = z2.b(remoteInput0);
                        if(set0 != null) {
                            for(Object object0: set0) {
                                remoteInput$Builder0.setAllowDataType(((String)object0), true);
                            }
                        }
                        if(Build.VERSION.SDK_INT >= 29) {
                            remoteInput$Builder0.setEditChoicesBeforeSending(b3.a(remoteInput0));
                        }
                        notificationCompat$Action$Builder0.addRemoteInput(remoteInput$Builder0.build());
                    }
                }
                int v1 = Build.VERSION.SDK_INT;
                notificationCompat$Action$Builder0.d = n0.a(notification$Action0);
                if(v1 >= 28) {
                    notificationCompat$Action$Builder0.setSemanticAction(o0.a(notification$Action0));
                }
                if(v1 >= 29) {
                    notificationCompat$Action$Builder0.setContextual(p0.a(notification$Action0));
                }
                if(v1 >= 0x1F) {
                    notificationCompat$Action$Builder0.setAuthenticationRequired(q0.a(notification$Action0));
                }
                notificationCompat$Action$Builder0.addExtras(l0.a(notification$Action0));
                return notificationCompat$Action$Builder0;
            }

            @NonNull
            public Bundle getExtras() {
                return this.e;
            }

            @NonNull
            public Builder setAllowGeneratedReplies(boolean z) {
                this.d = z;
                return this;
            }

            @NonNull
            public Builder setAuthenticationRequired(boolean z) {
                this.j = z;
                return this;
            }

            @NonNull
            public Builder setContextual(boolean z) {
                this.i = z;
                return this;
            }

            @NonNull
            public Builder setSemanticAction(int v) {
                this.g = v;
                return this;
            }

            @NonNull
            public Builder setShowsUserInterface(boolean z) {
                this.h = z;
                return this;
            }
        }

        public interface Extender {
            @NonNull
            Builder extend(@NonNull Builder arg1);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public static final class WearableExtender implements Extender {
            public int a;
            public CharSequence b;
            public CharSequence c;
            public CharSequence d;

            public WearableExtender() {
                this.a = 1;
            }

            public WearableExtender(@NonNull Action notificationCompat$Action0) {
                this.a = 1;
                Bundle bundle0 = notificationCompat$Action0.getExtras().getBundle("android.wearable.EXTENSIONS");
                if(bundle0 != null) {
                    this.a = bundle0.getInt("flags", 1);
                    this.b = bundle0.getCharSequence("inProgressLabel");
                    this.c = bundle0.getCharSequence("confirmLabel");
                    this.d = bundle0.getCharSequence("cancelLabel");
                }
            }

            public final void a(int v, boolean z) {
                if(z) {
                    this.a |= v;
                    return;
                }
                this.a &= ~v;
            }

            @NonNull
            public WearableExtender clone() {
                WearableExtender notificationCompat$Action$WearableExtender0 = new WearableExtender();
                notificationCompat$Action$WearableExtender0.a = this.a;
                notificationCompat$Action$WearableExtender0.b = this.b;
                notificationCompat$Action$WearableExtender0.c = this.c;
                notificationCompat$Action$WearableExtender0.d = this.d;
                return notificationCompat$Action$WearableExtender0;
            }

            @Override
            @NonNull
            public Object clone() throws CloneNotSupportedException {
                return this.clone();
            }

            @Override  // androidx.core.app.NotificationCompat$Action$Extender
            @NonNull
            public Builder extend(@NonNull Builder notificationCompat$Action$Builder0) {
                Bundle bundle0 = new Bundle();
                int v = this.a;
                if(v != 1) {
                    bundle0.putInt("flags", v);
                }
                CharSequence charSequence0 = this.b;
                if(charSequence0 != null) {
                    bundle0.putCharSequence("inProgressLabel", charSequence0);
                }
                CharSequence charSequence1 = this.c;
                if(charSequence1 != null) {
                    bundle0.putCharSequence("confirmLabel", charSequence1);
                }
                CharSequence charSequence2 = this.d;
                if(charSequence2 != null) {
                    bundle0.putCharSequence("cancelLabel", charSequence2);
                }
                notificationCompat$Action$Builder0.getExtras().putBundle("android.wearable.EXTENSIONS", bundle0);
                return notificationCompat$Action$Builder0;
            }

            @Nullable
            @Deprecated
            public CharSequence getCancelLabel() {
                return this.d;
            }

            @Nullable
            @Deprecated
            public CharSequence getConfirmLabel() {
                return this.c;
            }

            public boolean getHintDisplayActionInline() {
                return (this.a & 4) != 0;
            }

            public boolean getHintLaunchesActivity() {
                return (this.a & 2) != 0;
            }

            @Nullable
            @Deprecated
            public CharSequence getInProgressLabel() {
                return this.b;
            }

            public boolean isAvailableOffline() {
                return (this.a & 1) != 0;
            }

            @NonNull
            public WearableExtender setAvailableOffline(boolean z) {
                this.a(1, z);
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setCancelLabel(@Nullable CharSequence charSequence0) {
                this.d = charSequence0;
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setConfirmLabel(@Nullable CharSequence charSequence0) {
                this.c = charSequence0;
                return this;
            }

            @NonNull
            public WearableExtender setHintDisplayActionInline(boolean z) {
                this.a(4, z);
                return this;
            }

            @NonNull
            public WearableExtender setHintLaunchesActivity(boolean z) {
                this.a(2, z);
                return this;
            }

            @NonNull
            @Deprecated
            public WearableExtender setInProgressLabel(@Nullable CharSequence charSequence0) {
                this.b = charSequence0;
                return this;
            }
        }

        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        public final Bundle a;
        @Nullable
        public PendingIntent actionIntent;
        public IconCompat b;
        public final RemoteInput[] c;
        public final RemoteInput[] d;
        public final boolean e;
        public final boolean f;
        public final int g;
        public final boolean h;
        public final boolean i;
        @Deprecated
        public int icon;
        public CharSequence title;

        public Action(int v, @Nullable CharSequence charSequence0, @Nullable PendingIntent pendingIntent0) {
            this((v == 0 ? null : IconCompat.createWithResource(null, "", v)), charSequence0, pendingIntent0);
        }

        public Action(int v, CharSequence charSequence0, PendingIntent pendingIntent0, Bundle bundle0, RemoteInput[] arr_remoteInput, RemoteInput[] arr_remoteInput1, boolean z, int v1, boolean z1, boolean z2, boolean z3) {
            this((v == 0 ? null : IconCompat.createWithResource(null, "", v)), charSequence0, pendingIntent0, bundle0, arr_remoteInput, arr_remoteInput1, z, v1, z1, z2, z3);
        }

        public Action(@Nullable IconCompat iconCompat0, @Nullable CharSequence charSequence0, @Nullable PendingIntent pendingIntent0) {
            this(iconCompat0, charSequence0, pendingIntent0, new Bundle(), null, null, true, 0, true, false, false);
        }

        public Action(IconCompat iconCompat0, CharSequence charSequence0, PendingIntent pendingIntent0, Bundle bundle0, RemoteInput[] arr_remoteInput, RemoteInput[] arr_remoteInput1, boolean z, int v, boolean z1, boolean z2, boolean z3) {
            this.f = true;
            this.b = iconCompat0;
            if(iconCompat0 != null && iconCompat0.getType() == 2) {
                this.icon = iconCompat0.getResId();
            }
            this.title = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            this.actionIntent = pendingIntent0;
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            this.a = bundle0;
            this.c = arr_remoteInput;
            this.d = arr_remoteInput1;
            this.e = z;
            this.g = v;
            this.f = z1;
            this.h = z2;
            this.i = z3;
        }

        @Nullable
        public PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public boolean getAllowGeneratedReplies() {
            return this.e;
        }

        @Nullable
        public RemoteInput[] getDataOnlyRemoteInputs() {
            return this.d;
        }

        @NonNull
        public Bundle getExtras() {
            return this.a;
        }

        @Deprecated
        public int getIcon() {
            return this.icon;
        }

        @Nullable
        public IconCompat getIconCompat() {
            if(this.b == null) {
                int v = this.icon;
                if(v != 0) {
                    this.b = IconCompat.createWithResource(null, "", v);
                }
            }
            return this.b;
        }

        @Nullable
        public RemoteInput[] getRemoteInputs() {
            return this.c;
        }

        public int getSemanticAction() {
            return this.g;
        }

        public boolean getShowsUserInterface() {
            return this.f;
        }

        @Nullable
        public CharSequence getTitle() {
            return this.title;
        }

        public boolean isAuthenticationRequired() {
            return this.i;
        }

        public boolean isContextual() {
            return this.h;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    public static class BigPictureStyle extends Style {
        public IconCompat d;
        public IconCompat e;
        public boolean f;
        public CharSequence g;
        public boolean h;

        public BigPictureStyle() {
        }

        public BigPictureStyle(@Nullable androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            this.setBuilder(notificationCompat$Builder0);
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            Notification.BigPictureStyle notification$BigPictureStyle0 = new Notification.BigPictureStyle(notificationBuilderWithBuilderAccessor0.getBuilder()).setBigContentTitle(this.a);
            IconCompat iconCompat0 = this.d;
            Context context0 = null;
            if(iconCompat0 != null) {
                if(Build.VERSION.SDK_INT >= 0x1F) {
                    z0.a(notification$BigPictureStyle0, iconCompat0.toIcon((notificationBuilderWithBuilderAccessor0 instanceof e2 ? ((e2)notificationBuilderWithBuilderAccessor0).a : null)));
                }
                else if(iconCompat0.getType() == 1) {
                    notification$BigPictureStyle0 = notification$BigPictureStyle0.bigPicture(this.d.getBitmap());
                }
            }
            if(this.f) {
                IconCompat iconCompat1 = this.e;
                if(iconCompat1 == null) {
                    notification$BigPictureStyle0.bigLargeIcon(null);
                }
                else {
                    if(notificationBuilderWithBuilderAccessor0 instanceof e2) {
                        context0 = ((e2)notificationBuilderWithBuilderAccessor0).a;
                    }
                    y0.a(notification$BigPictureStyle0, iconCompat1.toIcon(context0));
                }
            }
            if(this.c) {
                notification$BigPictureStyle0.setSummaryText(this.b);
            }
            if(Build.VERSION.SDK_INT >= 0x1F) {
                z0.c(notification$BigPictureStyle0, this.h);
                z0.b(notification$BigPictureStyle0, this.g);
            }
        }

        @NonNull
        public BigPictureStyle bigLargeIcon(@Nullable Bitmap bitmap0) {
            this.e = bitmap0 == null ? null : IconCompat.createWithBitmap(bitmap0);
            this.f = true;
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public BigPictureStyle bigLargeIcon(@Nullable Icon icon0) {
            this.e = icon0 == null ? null : IconCompat.createFromIcon(icon0);
            this.f = true;
            return this;
        }

        @NonNull
        public BigPictureStyle bigPicture(@Nullable Bitmap bitmap0) {
            this.d = bitmap0 == null ? null : IconCompat.createWithBitmap(bitmap0);
            return this;
        }

        @NonNull
        @RequiresApi(0x1F)
        public BigPictureStyle bigPicture(@Nullable Icon icon0) {
            this.d = IconCompat.createFromIcon(icon0);
            return this;
        }

        public static IconCompat c(Parcelable parcelable0) {
            if(parcelable0 != null) {
                if(parcelable0 instanceof Icon) {
                    return IconCompat.createFromIcon(((Icon)parcelable0));
                }
                return parcelable0 instanceof Bitmap ? IconCompat.createWithBitmap(((Bitmap)parcelable0)) : null;
            }
            return null;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle0) {
            super.clearCompatExtraKeys(bundle0);
            bundle0.remove("android.largeIcon.big");
            bundle0.remove("android.picture");
            bundle0.remove("android.pictureIcon");
            bundle0.remove("android.showBigPictureWhenCollapsed");
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @NonNull
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Nullable
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public static IconCompat getPictureIcon(@Nullable Bundle bundle0) {
            if(bundle0 == null) {
                return null;
            }
            Parcelable parcelable0 = bundle0.getParcelable("android.picture");
            return parcelable0 == null ? BigPictureStyle.c(bundle0.getParcelable("android.pictureIcon")) : BigPictureStyle.c(parcelable0);
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle0) {
            super.restoreFromCompatExtras(bundle0);
            if(bundle0.containsKey("android.largeIcon.big")) {
                this.e = BigPictureStyle.c(bundle0.getParcelable("android.largeIcon.big"));
                this.f = true;
            }
            this.d = BigPictureStyle.getPictureIcon(bundle0);
            this.h = bundle0.getBoolean("android.showBigPictureWhenCollapsed");
        }

        @NonNull
        public BigPictureStyle setBigContentTitle(@Nullable CharSequence charSequence0) {
            this.a = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            return this;
        }

        @NonNull
        @RequiresApi(0x1F)
        public BigPictureStyle setContentDescription(@Nullable CharSequence charSequence0) {
            this.g = charSequence0;
            return this;
        }

        @NonNull
        public BigPictureStyle setSummaryText(@Nullable CharSequence charSequence0) {
            this.b = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            this.c = true;
            return this;
        }

        @NonNull
        @RequiresApi(0x1F)
        public BigPictureStyle showBigPictureWhenCollapsed(boolean z) {
            this.h = z;
            return this;
        }
    }

    public static class BigTextStyle extends Style {
        public CharSequence d;

        public BigTextStyle() {
        }

        public BigTextStyle(@Nullable androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            this.setBuilder(notificationCompat$Builder0);
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle0) {
            super.addCompatExtras(bundle0);
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            Notification.BigTextStyle notification$BigTextStyle0 = new Notification.BigTextStyle(notificationBuilderWithBuilderAccessor0.getBuilder()).setBigContentTitle(this.a).bigText(this.d);
            if(this.c) {
                notification$BigTextStyle0.setSummaryText(this.b);
            }
        }

        @NonNull
        public BigTextStyle bigText(@Nullable CharSequence charSequence0) {
            this.d = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            return this;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle0) {
            super.clearCompatExtraKeys(bundle0);
            bundle0.remove("android.bigText");
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @NonNull
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle0) {
            super.restoreFromCompatExtras(bundle0);
            this.d = bundle0.getCharSequence("android.bigText");
        }

        @NonNull
        public BigTextStyle setBigContentTitle(@Nullable CharSequence charSequence0) {
            this.a = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            return this;
        }

        @NonNull
        public BigTextStyle setSummaryText(@Nullable CharSequence charSequence0) {
            this.b = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            this.c = true;
            return this;
        }
    }

    public static final class BubbleMetadata {
        public static final class androidx.core.app.NotificationCompat.BubbleMetadata.Builder {
            public PendingIntent a;
            public IconCompat b;
            public int c;
            public int d;
            public int e;
            public PendingIntent f;
            public final String g;

            @Deprecated
            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder() {
            }

            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder(@NonNull PendingIntent pendingIntent0, @NonNull IconCompat iconCompat0) {
                if(pendingIntent0 == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if(iconCompat0 == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.a = pendingIntent0;
                this.b = iconCompat0;
            }

            @RequiresApi(30)
            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder(@NonNull String s) {
                if(TextUtils.isEmpty(s)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.g = s;
            }

            @NonNull
            public BubbleMetadata build() {
                String s = this.g;
                if(s == null && this.a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if(s == null && this.b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                PendingIntent pendingIntent0 = this.a;
                PendingIntent pendingIntent1 = this.f;
                IconCompat iconCompat0 = this.b;
                int v = this.c;
                int v1 = this.d;
                int v2 = this.e;
                BubbleMetadata notificationCompat$BubbleMetadata0 = new BubbleMetadata();  // 初始化器: Ljava/lang/Object;-><init>()V
                notificationCompat$BubbleMetadata0.a = pendingIntent0;
                notificationCompat$BubbleMetadata0.c = iconCompat0;
                notificationCompat$BubbleMetadata0.d = v;
                notificationCompat$BubbleMetadata0.e = v1;
                notificationCompat$BubbleMetadata0.b = pendingIntent1;
                notificationCompat$BubbleMetadata0.f = v2;
                notificationCompat$BubbleMetadata0.g = s;
                notificationCompat$BubbleMetadata0.setFlags(v2);
                return notificationCompat$BubbleMetadata0;
            }

            @NonNull
            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setAutoExpandBubble(boolean z) {
                if(z) {
                    this.e |= 1;
                    return this;
                }
                this.e &= -2;
                return this;
            }

            @NonNull
            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDeleteIntent(@Nullable PendingIntent pendingIntent0) {
                this.f = pendingIntent0;
                return this;
            }

            @NonNull
            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDesiredHeight(@Dimension(unit = 0) int v) {
                this.c = Math.max(v, 0);
                this.d = 0;
                return this;
            }

            @NonNull
            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDesiredHeightResId(@DimenRes int v) {
                this.d = v;
                this.c = 0;
                return this;
            }

            @NonNull
            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setIcon(@NonNull IconCompat iconCompat0) {
                if(this.g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if(iconCompat0 == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.b = iconCompat0;
                return this;
            }

            @NonNull
            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setIntent(@NonNull PendingIntent pendingIntent0) {
                if(this.g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if(pendingIntent0 == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                this.a = pendingIntent0;
                return this;
            }

            @NonNull
            public androidx.core.app.NotificationCompat.BubbleMetadata.Builder setSuppressNotification(boolean z) {
                if(z) {
                    this.e |= 2;
                    return this;
                }
                this.e &= -3;
                return this;
            }
        }

        public PendingIntent a;
        public PendingIntent b;
        public IconCompat c;
        public int d;
        public int e;
        public int f;
        public String g;

        @Nullable
        public static BubbleMetadata fromPlatform(@Nullable Notification.BubbleMetadata notification$BubbleMetadata0) {
            if(notification$BubbleMetadata0 == null) {
                return null;
            }
            int v = Build.VERSION.SDK_INT;
            if(v >= 30) {
                return b1.a(notification$BubbleMetadata0);
            }
            return v == 29 ? a1.a(notification$BubbleMetadata0) : null;
        }

        public boolean getAutoExpandBubble() {
            return (this.f & 1) != 0;
        }

        @Nullable
        public PendingIntent getDeleteIntent() {
            return this.b;
        }

        @Dimension(unit = 0)
        public int getDesiredHeight() {
            return this.d;
        }

        @DimenRes
        public int getDesiredHeightResId() {
            return this.e;
        }

        @SuppressLint({"InvalidNullConversion"})
        @Nullable
        public IconCompat getIcon() {
            return this.c;
        }

        @SuppressLint({"InvalidNullConversion"})
        @Nullable
        public PendingIntent getIntent() {
            return this.a;
        }

        @Nullable
        public String getShortcutId() {
            return this.g;
        }

        public boolean isNotificationSuppressed() {
            return (this.f & 2) != 0;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void setFlags(int v) {
            this.f = v;
        }

        @Nullable
        public static Notification.BubbleMetadata toPlatform(@Nullable BubbleMetadata notificationCompat$BubbleMetadata0) {
            if(notificationCompat$BubbleMetadata0 == null) {
                return null;
            }
            int v = Build.VERSION.SDK_INT;
            if(v >= 30) {
                return b1.b(notificationCompat$BubbleMetadata0);
            }
            return v == 29 ? a1.b(notificationCompat$BubbleMetadata0) : null;
        }
    }

    public static class androidx.core.app.NotificationCompat.Builder {
        public String A;
        public Bundle B;
        public int C;
        public int D;
        public Notification E;
        public RemoteViews F;
        public RemoteViews G;
        public RemoteViews H;
        public String I;
        public int J;
        public String K;
        public LocusIdCompat L;
        public long M;
        public int N;
        public int O;
        public boolean P;
        public BubbleMetadata Q;
        public final Notification R;
        public boolean S;
        public Icon T;
        public final ArrayList a;
        public CharSequence b;
        public CharSequence c;
        public PendingIntent d;
        public PendingIntent e;
        public RemoteViews f;
        public IconCompat g;
        public CharSequence h;
        public int i;
        public int j;
        public boolean k;
        public boolean l;
        public boolean m;
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList mActions;
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public Context mContext;
        @Deprecated
        public ArrayList mPeople;
        @NonNull
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList mPersonList;
        public Style n;
        public CharSequence o;
        public CharSequence p;
        public CharSequence[] q;
        public int r;
        public int s;
        public boolean t;
        public String u;
        public boolean v;
        public String w;
        public boolean x;
        public boolean y;
        public boolean z;

        @Deprecated
        public androidx.core.app.NotificationCompat.Builder(@NonNull Context context0) {
            this(context0, null);
        }

        public androidx.core.app.NotificationCompat.Builder(@NonNull Context context0, @NonNull Notification notification0) {
            this(context0, NotificationCompat.getChannelId(notification0));
            Bundle bundle1;
            Bundle bundle0 = notification0.extras;
            Style notificationCompat$Style0 = Style.extractStyleFromNotification(notification0);
            androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0 = this.setContentTitle(NotificationCompat.getContentTitle(notification0)).setContentText(NotificationCompat.getContentText(notification0)).setContentInfo(NotificationCompat.getContentInfo(notification0)).setSubText(NotificationCompat.getSubText(notification0)).setSettingsText(NotificationCompat.getSettingsText(notification0)).setStyle(notificationCompat$Style0).setGroup(NotificationCompat.getGroup(notification0)).setGroupSummary(NotificationCompat.isGroupSummary(notification0)).setLocusId(NotificationCompat.getLocusId(notification0)).setWhen(notification0.when).setShowWhen(NotificationCompat.getShowWhen(notification0)).setUsesChronometer(NotificationCompat.getUsesChronometer(notification0)).setAutoCancel(NotificationCompat.getAutoCancel(notification0)).setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(notification0)).setOngoing(NotificationCompat.getOngoing(notification0)).setLocalOnly(NotificationCompat.getLocalOnly(notification0)).setLargeIcon(notification0.largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(notification0)).setCategory(NotificationCompat.getCategory(notification0)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(notification0)).setNumber(notification0.number).setTicker(notification0.tickerText).setContentIntent(notification0.contentIntent).setDeleteIntent(notification0.deleteIntent).setFullScreenIntent(notification0.fullScreenIntent, (notification0.flags & 0x80) != 0).setSound(notification0.sound, notification0.audioStreamType).setVibrate(notification0.vibrate).setLights(notification0.ledARGB, notification0.ledOnMS, notification0.ledOffMS).setDefaults(notification0.defaults).setPriority(notification0.priority).setColor(NotificationCompat.getColor(notification0)).setVisibility(NotificationCompat.getVisibility(notification0)).setPublicVersion(NotificationCompat.getPublicVersion(notification0)).setSortKey(NotificationCompat.getSortKey(notification0)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(notification0)).setShortcutId(NotificationCompat.getShortcutId(notification0)).setProgress(bundle0.getInt("android.progressMax"), bundle0.getInt("android.progress"), bundle0.getBoolean("android.progressIndeterminate")).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(notification0)).setSmallIcon(notification0.icon, notification0.iconLevel);
            if(notification0.extras == null) {
                bundle1 = null;
            }
            else {
                Bundle bundle2 = new Bundle(notification0.extras);
                bundle2.remove("android.title");
                bundle2.remove("android.text");
                bundle2.remove("android.infoText");
                bundle2.remove("android.subText");
                bundle2.remove("android.intent.extra.CHANNEL_ID");
                bundle2.remove("android.intent.extra.CHANNEL_GROUP_ID");
                bundle2.remove("android.showWhen");
                bundle2.remove("android.progress");
                bundle2.remove("android.progressMax");
                bundle2.remove("android.progressIndeterminate");
                bundle2.remove("android.chronometerCountDown");
                bundle2.remove("android.colorized");
                bundle2.remove("android.people.list");
                bundle2.remove("android.people");
                bundle2.remove("android.support.sortKey");
                bundle2.remove("android.support.groupKey");
                bundle2.remove("android.support.isGroupSummary");
                bundle2.remove("android.support.localOnly");
                bundle2.remove("android.support.actionExtras");
                Bundle bundle3 = bundle2.getBundle("android.car.EXTENSIONS");
                if(bundle3 != null) {
                    Bundle bundle4 = new Bundle(bundle3);
                    bundle4.remove("invisible_actions");
                    bundle2.putBundle("android.car.EXTENSIONS", bundle4);
                }
                if(notificationCompat$Style0 != null) {
                    notificationCompat$Style0.clearCompatExtraKeys(bundle2);
                }
                bundle1 = bundle2;
            }
            notificationCompat$Builder0.addExtras(bundle1);
            this.T = d1.b(notification0);
            Icon icon0 = d1.a(notification0);
            if(icon0 != null) {
                this.g = IconCompat.createFromIcon(icon0);
            }
            Notification.Action[] arr_notification$Action = notification0.actions;
            if(arr_notification$Action != null && arr_notification$Action.length != 0) {
                for(int v1 = 0; v1 < arr_notification$Action.length; ++v1) {
                    this.addAction(Builder.fromAndroidAction(arr_notification$Action[v1]).build());
                }
            }
            List list0 = NotificationCompat.getInvisibleActions(notification0);
            if(!list0.isEmpty()) {
                for(Object object0: list0) {
                    this.addInvisibleAction(((Action)object0));
                }
            }
            String[] arr_s = notification0.extras.getStringArray("android.people");
            if(arr_s != null && arr_s.length != 0) {
                for(int v = 0; v < arr_s.length; ++v) {
                    this.addPerson(arr_s[v]);
                }
            }
            if(Build.VERSION.SDK_INT >= 28) {
                ArrayList arrayList0 = notification0.extras.getParcelableArrayList("android.people.list");
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    for(Object object1: arrayList0) {
                        this.addPerson(Person.fromAndroidPerson(((android.app.Person)object1)));
                    }
                }
            }
            if(bundle0.containsKey("android.chronometerCountDown")) {
                this.setChronometerCountDown(bundle0.getBoolean("android.chronometerCountDown"));
            }
            if(bundle0.containsKey("android.colorized")) {
                this.setColorized(bundle0.getBoolean("android.colorized"));
            }
        }

        public androidx.core.app.NotificationCompat.Builder(@NonNull Context context0, @NonNull String s) {
            this.mActions = new ArrayList();
            this.mPersonList = new ArrayList();
            this.a = new ArrayList();
            this.k = true;
            this.x = false;
            this.C = 0;
            this.D = 0;
            this.J = 0;
            this.N = 0;
            this.O = 0;
            Notification notification0 = new Notification();
            this.R = notification0;
            this.mContext = context0;
            this.I = s;
            notification0.when = System.currentTimeMillis();
            notification0.audioStreamType = -1;
            this.j = 0;
            this.mPeople = new ArrayList();
            this.P = true;
        }

        public final void a(int v, boolean z) {
            Notification notification0 = this.R;
            if(z) {
                notification0.flags |= v;
                return;
            }
            notification0.flags &= ~v;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder addAction(int v, @Nullable CharSequence charSequence0, @Nullable PendingIntent pendingIntent0) {
            this.mActions.add(new Action(v, charSequence0, pendingIntent0));
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder addAction(@Nullable Action notificationCompat$Action0) {
            if(notificationCompat$Action0 != null) {
                this.mActions.add(notificationCompat$Action0);
            }
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder addExtras(@Nullable Bundle bundle0) {
            if(bundle0 != null) {
                Bundle bundle1 = this.B;
                if(bundle1 == null) {
                    this.B = new Bundle(bundle0);
                    return this;
                }
                bundle1.putAll(bundle0);
            }
            return this;
        }

        @NonNull
        @RequiresApi(21)
        public androidx.core.app.NotificationCompat.Builder addInvisibleAction(int v, @Nullable CharSequence charSequence0, @Nullable PendingIntent pendingIntent0) {
            Action notificationCompat$Action0 = new Action(v, charSequence0, pendingIntent0);
            this.a.add(notificationCompat$Action0);
            return this;
        }

        @NonNull
        @RequiresApi(21)
        public androidx.core.app.NotificationCompat.Builder addInvisibleAction(@Nullable Action notificationCompat$Action0) {
            if(notificationCompat$Action0 != null) {
                this.a.add(notificationCompat$Action0);
            }
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder addPerson(@Nullable Person person0) {
            if(person0 != null) {
                this.mPersonList.add(person0);
            }
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.Builder addPerson(@Nullable String s) {
            if(s != null && !s.isEmpty()) {
                this.mPeople.add(s);
            }
            return this;
        }

        @NonNull
        public Notification build() {
            return new e2(this).b();
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder clearActions() {
            this.mActions.clear();
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder clearInvisibleActions() {
            this.a.clear();
            Bundle bundle0 = this.B.getBundle("android.car.EXTENSIONS");
            if(bundle0 != null) {
                Bundle bundle1 = new Bundle(bundle0);
                bundle1.remove("invisible_actions");
                this.B.putBundle("android.car.EXTENSIONS", bundle1);
            }
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder clearPeople() {
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @Nullable
        public RemoteViews createBigContentView() {
            if(this.G != null && (this.n == null || !this.n.displayCustomViewInline())) {
                return this.G;
            }
            e2 e20 = new e2(this);
            Style notificationCompat$Style0 = this.n;
            if(notificationCompat$Style0 != null) {
                RemoteViews remoteViews0 = notificationCompat$Style0.makeBigContentView(e20);
                if(remoteViews0 != null) {
                    return remoteViews0;
                }
            }
            Notification notification0 = e20.b();
            return e1.a(e1.d(this.mContext, notification0));
        }

        @SuppressLint({"BuilderSetStyle"})
        @Nullable
        public RemoteViews createContentView() {
            if(this.F != null && (this.n == null || !this.n.displayCustomViewInline())) {
                return this.F;
            }
            e2 e20 = new e2(this);
            Style notificationCompat$Style0 = this.n;
            if(notificationCompat$Style0 != null) {
                RemoteViews remoteViews0 = notificationCompat$Style0.makeContentView(e20);
                if(remoteViews0 != null) {
                    return remoteViews0;
                }
            }
            Notification notification0 = e20.b();
            return e1.b(e1.d(this.mContext, notification0));
        }

        @SuppressLint({"BuilderSetStyle"})
        @Nullable
        public RemoteViews createHeadsUpContentView() {
            if(this.H != null && (this.n == null || !this.n.displayCustomViewInline())) {
                return this.H;
            }
            e2 e20 = new e2(this);
            Style notificationCompat$Style0 = this.n;
            if(notificationCompat$Style0 != null) {
                RemoteViews remoteViews0 = notificationCompat$Style0.makeHeadsUpContentView(e20);
                if(remoteViews0 != null) {
                    return remoteViews0;
                }
            }
            Notification notification0 = e20.b();
            return e1.c(e1.d(this.mContext, notification0));
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder extend(@NonNull androidx.core.app.NotificationCompat.Extender notificationCompat$Extender0) {
            notificationCompat$Extender0.extend(this);
            return this;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getBigContentView() {
            return this.G;
        }

        @Nullable
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public BubbleMetadata getBubbleMetadata() {
            return this.Q;
        }

        @ColorInt
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public int getColor() {
            return this.C;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getContentView() {
            return this.F;
        }

        @NonNull
        public Bundle getExtras() {
            if(this.B == null) {
                this.B = new Bundle();
            }
            return this.B;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public int getForegroundServiceBehavior() {
            return this.O;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews getHeadsUpContentView() {
            return this.H;
        }

        @NonNull
        @Deprecated
        public Notification getNotification() {
            return this.build();
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public int getPriority() {
            return this.j;
        }

        // 去混淆评级： 低(20)
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public long getWhenIfShowing() {
            return this.k ? this.R.when : 0L;
        }

        @Nullable
        public static CharSequence limitCharSequenceLength(@Nullable CharSequence charSequence0) {
            if(charSequence0 == null) {
                return null;
            }
            return charSequence0.length() <= 0x1400 ? charSequence0 : charSequence0.subSequence(0, 0x1400);
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setAllowSystemGeneratedContextualActions(boolean z) {
            this.P = z;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setAutoCancel(boolean z) {
            this.a(16, z);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setBadgeIconType(int v) {
            this.J = v;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setBubbleMetadata(@Nullable BubbleMetadata notificationCompat$BubbleMetadata0) {
            this.Q = notificationCompat$BubbleMetadata0;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setCategory(@Nullable String s) {
            this.A = s;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setChannelId(@NonNull String s) {
            this.I = s;
            return this;
        }

        @NonNull
        @RequiresApi(24)
        public androidx.core.app.NotificationCompat.Builder setChronometerCountDown(boolean z) {
            this.m = z;
            this.getExtras().putBoolean("android.chronometerCountDown", z);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setColor(@ColorInt int v) {
            this.C = v;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setColorized(boolean z) {
            this.y = z;
            this.z = true;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setContent(@Nullable RemoteViews remoteViews0) {
            this.R.contentView = remoteViews0;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setContentInfo(@Nullable CharSequence charSequence0) {
            this.h = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setContentIntent(@Nullable PendingIntent pendingIntent0) {
            this.d = pendingIntent0;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setContentText(@Nullable CharSequence charSequence0) {
            this.c = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setContentTitle(@Nullable CharSequence charSequence0) {
            this.b = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setCustomBigContentView(@Nullable RemoteViews remoteViews0) {
            this.G = remoteViews0;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setCustomContentView(@Nullable RemoteViews remoteViews0) {
            this.F = remoteViews0;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setCustomHeadsUpContentView(@Nullable RemoteViews remoteViews0) {
            this.H = remoteViews0;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setDefaults(int v) {
            Notification notification0 = this.R;
            notification0.defaults = v;
            if((v & 4) != 0) {
                notification0.flags |= 1;
            }
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setDeleteIntent(@Nullable PendingIntent pendingIntent0) {
            this.R.deleteIntent = pendingIntent0;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setExtras(@Nullable Bundle bundle0) {
            this.B = bundle0;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setForegroundServiceBehavior(int v) {
            this.O = v;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setFullScreenIntent(@Nullable PendingIntent pendingIntent0, boolean z) {
            this.e = pendingIntent0;
            this.a(0x80, z);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setGroup(@Nullable String s) {
            this.u = s;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setGroupAlertBehavior(int v) {
            this.N = v;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setGroupSummary(boolean z) {
            this.v = z;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setLargeIcon(@Nullable Bitmap bitmap0) {
            this.g = bitmap0 == null ? null : IconCompat.createWithBitmap(NotificationCompat.reduceLargeIconSize(this.mContext, bitmap0));
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public androidx.core.app.NotificationCompat.Builder setLargeIcon(@Nullable Icon icon0) {
            this.g = icon0 == null ? null : IconCompat.createFromIcon(icon0);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setLights(@ColorInt int v, int v1, int v2) {
            this.R.ledARGB = v;
            this.R.ledOnMS = v1;
            this.R.ledOffMS = v2;
            this.R.flags = (v1 == 0 || v2 == 0 ? 0 : 1) | this.R.flags & -2;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setLocalOnly(boolean z) {
            this.x = z;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setLocusId(@Nullable LocusIdCompat locusIdCompat0) {
            this.L = locusIdCompat0;
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.Builder setNotificationSilent() {
            this.S = true;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setNumber(int v) {
            this.i = v;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setOngoing(boolean z) {
            this.a(2, z);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setOnlyAlertOnce(boolean z) {
            this.a(8, z);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setPriority(int v) {
            this.j = v;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setProgress(int v, int v1, boolean z) {
            this.r = v;
            this.s = v1;
            this.t = z;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setPublicVersion(@Nullable Notification notification0) {
            this.E = notification0;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setRemoteInputHistory(@Nullable CharSequence[] arr_charSequence) {
            this.q = arr_charSequence;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setSettingsText(@Nullable CharSequence charSequence0) {
            this.p = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setShortcutId(@Nullable String s) {
            this.K = s;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setShortcutInfo(@Nullable ShortcutInfoCompat shortcutInfoCompat0) {
            if(shortcutInfoCompat0 == null) {
                return this;
            }
            this.K = shortcutInfoCompat0.getId();
            if(this.L == null) {
                if(shortcutInfoCompat0.getLocusId() != null) {
                    this.L = shortcutInfoCompat0.getLocusId();
                }
                else if(shortcutInfoCompat0.getId() != null) {
                    this.L = new LocusIdCompat(shortcutInfoCompat0.getId());
                }
            }
            if(this.b == null) {
                this.setContentTitle(shortcutInfoCompat0.getShortLabel());
            }
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setShowWhen(boolean z) {
            this.k = z;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setSilent(boolean z) {
            this.S = z;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setSmallIcon(int v) {
            this.R.icon = v;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setSmallIcon(int v, int v1) {
            this.R.icon = v;
            this.R.iconLevel = v1;
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public androidx.core.app.NotificationCompat.Builder setSmallIcon(@NonNull IconCompat iconCompat0) {
            this.T = iconCompat0.toIcon(this.mContext);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setSortKey(@Nullable String s) {
            this.w = s;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setSound(@Nullable Uri uri0) {
            this.R.sound = uri0;
            this.R.audioStreamType = -1;
            this.R.audioAttributes = c1.a(c1.e(c1.c(c1.b(), 4), 5));
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setSound(@Nullable Uri uri0, int v) {
            this.R.sound = uri0;
            this.R.audioStreamType = v;
            this.R.audioAttributes = c1.a(c1.d(c1.c(c1.b(), 4), v));
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setStyle(@Nullable Style notificationCompat$Style0) {
            if(this.n != notificationCompat$Style0) {
                this.n = notificationCompat$Style0;
                if(notificationCompat$Style0 != null) {
                    notificationCompat$Style0.setBuilder(this);
                }
            }
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setSubText(@Nullable CharSequence charSequence0) {
            this.o = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setTicker(@Nullable CharSequence charSequence0) {
            this.R.tickerText = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.Builder setTicker(@Nullable CharSequence charSequence0, @Nullable RemoteViews remoteViews0) {
            this.R.tickerText = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            this.f = remoteViews0;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setTimeoutAfter(long v) {
            this.M = v;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setUsesChronometer(boolean z) {
            this.l = z;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setVibrate(@Nullable long[] arr_v) {
            this.R.vibrate = arr_v;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setVisibility(int v) {
            this.D = v;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.Builder setWhen(long v) {
            this.R.when = v;
            return this;
        }
    }

    public static class CallStyle extends Style {
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        public @interface CallType {
        }

        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        public static final int CALL_TYPE_UNKNOWN;
        public int d;
        public Person e;
        public PendingIntent f;
        public PendingIntent g;
        public PendingIntent h;
        public boolean i;
        public Integer j;
        public Integer k;
        public IconCompat l;
        public CharSequence m;

        public CallStyle() {
        }

        public CallStyle(int v, Person person0, PendingIntent pendingIntent0, PendingIntent pendingIntent1, PendingIntent pendingIntent2) {
            if(person0 == null || TextUtils.isEmpty(person0.getName())) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.d = v;
            this.e = person0;
            this.f = pendingIntent2;
            this.g = pendingIntent1;
            this.h = pendingIntent0;
        }

        public CallStyle(@Nullable androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            this.setBuilder(notificationCompat$Builder0);
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle0) {
            super.addCompatExtras(bundle0);
            bundle0.putInt("android.callType", this.d);
            bundle0.putBoolean("android.callIsVideo", this.i);
            Person person0 = this.e;
            if(person0 != null) {
                if(Build.VERSION.SDK_INT >= 28) {
                    bundle0.putParcelable("android.callPerson", h1.b(person0.toAndroidPerson()));
                }
                else {
                    bundle0.putParcelable("android.callPersonCompat", person0.toBundle());
                }
            }
            IconCompat iconCompat0 = this.l;
            if(iconCompat0 != null) {
                bundle0.putParcelable("android.verificationIcon", g1.a(iconCompat0.toIcon(this.mBuilder.mContext)));
            }
            bundle0.putCharSequence("android.verificationText", this.m);
            bundle0.putParcelable("android.answerIntent", this.f);
            bundle0.putParcelable("android.declineIntent", this.g);
            bundle0.putParcelable("android.hangUpIntent", this.h);
            Integer integer0 = this.j;
            if(integer0 != null) {
                bundle0.putInt("android.answerColor", ((int)integer0));
            }
            Integer integer1 = this.k;
            if(integer1 != null) {
                bundle0.putInt("android.declineColor", ((int)integer1));
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            int v = Build.VERSION.SDK_INT;
            Notification.CallStyle notification$CallStyle0 = null;
            if(v >= 0x1F) {
                switch(this.d) {
                    case 1: {
                        notification$CallStyle0 = i1.a(this.e.toAndroidPerson(), this.g, this.f);
                        break;
                    }
                    case 2: {
                        notification$CallStyle0 = i1.b(this.e.toAndroidPerson(), this.h);
                        break;
                    }
                    case 3: {
                        notification$CallStyle0 = i1.c(this.e.toAndroidPerson(), this.h, this.f);
                        break;
                    }
                    default: {
                        if(Log.isLoggable("NotifCompat", 3)) {
                            Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + this.d);
                        }
                    }
                }
                if(notification$CallStyle0 != null) {
                    notification$CallStyle0.setBuilder(notificationBuilderWithBuilderAccessor0.getBuilder());
                    Integer integer0 = this.j;
                    if(integer0 != null) {
                        i1.d(notification$CallStyle0, ((int)integer0));
                    }
                    Integer integer1 = this.k;
                    if(integer1 != null) {
                        i1.f(notification$CallStyle0, ((int)integer1));
                    }
                    i1.i(notification$CallStyle0, this.m);
                    IconCompat iconCompat0 = this.l;
                    if(iconCompat0 != null) {
                        i1.h(notification$CallStyle0, iconCompat0.toIcon(this.mBuilder.mContext));
                    }
                    i1.g(notification$CallStyle0, this.i);
                }
            }
            else {
                Notification.Builder notification$Builder0 = notificationBuilderWithBuilderAccessor0.getBuilder();
                notification$Builder0.setContentTitle((this.e == null ? null : this.e.getName()));
                Bundle bundle0 = this.mBuilder.B;
                CharSequence charSequence0 = bundle0 == null || !bundle0.containsKey("android.text") ? null : this.mBuilder.B.getCharSequence("android.text");
                if(charSequence0 == null) {
                    switch(this.d) {
                        case 1: {
                            notification$CallStyle0 = this.mBuilder.mContext.getResources().getString(string.call_notification_incoming_text);
                            break;
                        }
                        case 2: {
                            notification$CallStyle0 = this.mBuilder.mContext.getResources().getString(string.call_notification_ongoing_text);
                            break;
                        }
                        case 3: {
                            notification$CallStyle0 = this.mBuilder.mContext.getResources().getString(string.call_notification_screening_text);
                        }
                    }
                    charSequence0 = notification$CallStyle0;
                }
                notification$Builder0.setContentText(charSequence0);
                Person person0 = this.e;
                if(person0 != null) {
                    if(person0.getIcon() != null) {
                        g1.c(notification$Builder0, this.e.getIcon().toIcon(this.mBuilder.mContext));
                    }
                    if(v >= 28) {
                        h1.a(notification$Builder0, this.e.toAndroidPerson());
                    }
                    else {
                        f1.a(notification$Builder0, this.e.getUri());
                    }
                }
                f1.b(notification$Builder0, "call");
            }
        }

        public final Action c(int v, int v1, Integer integer0, int v2, PendingIntent pendingIntent0) {
            if(integer0 == null) {
                integer0 = ContextCompat.getColor(this.mBuilder.mContext, v2);
            }
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
            spannableStringBuilder0.append(this.mBuilder.mContext.getResources().getString(v1));
            spannableStringBuilder0.setSpan(new ForegroundColorSpan(((int)integer0)), 0, spannableStringBuilder0.length(), 18);
            Action notificationCompat$Action0 = new Builder(IconCompat.createWithResource(this.mBuilder.mContext, v), spannableStringBuilder0, pendingIntent0).build();
            notificationCompat$Action0.getExtras().putBoolean("key_action_priority", true);
            return notificationCompat$Action0;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return true;
        }

        @NonNull
        public static CallStyle forIncomingCall(@NonNull Person person0, @NonNull PendingIntent pendingIntent0, @NonNull PendingIntent pendingIntent1) {
            Objects.requireNonNull(pendingIntent0, "declineIntent is required");
            Objects.requireNonNull(pendingIntent1, "answerIntent is required");
            return new CallStyle(1, person0, null, pendingIntent0, pendingIntent1);
        }

        @NonNull
        public static CallStyle forOngoingCall(@NonNull Person person0, @NonNull PendingIntent pendingIntent0) {
            Objects.requireNonNull(pendingIntent0, "hangUpIntent is required");
            return new CallStyle(2, person0, pendingIntent0, null, null);
        }

        @NonNull
        public static CallStyle forScreeningCall(@NonNull Person person0, @NonNull PendingIntent pendingIntent0, @NonNull PendingIntent pendingIntent1) {
            Objects.requireNonNull(pendingIntent0, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent1, "answerIntent is required");
            return new CallStyle(3, person0, pendingIntent0, null, pendingIntent1);
        }

        @NonNull
        @RequiresApi(20)
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public ArrayList getActionsListWithSystemActions() {
            int v = drawable.ic_call_decline;
            Action notificationCompat$Action0 = this.g == null ? this.c(v, string.call_notification_hang_up_action, this.k, color.call_notification_decline_color, this.h) : this.c(v, string.call_notification_decline_action, this.k, color.call_notification_decline_color, this.g);
            int v1 = drawable.ic_call_answer_video;
            int v2 = drawable.ic_call_answer;
            PendingIntent pendingIntent0 = this.f;
            Action notificationCompat$Action1 = pendingIntent0 == null ? null : this.c((this.i ? v1 : v2), (this.i ? string.call_notification_answer_video_action : string.call_notification_answer_action), this.j, color.call_notification_answer_color, pendingIntent0);
            ArrayList arrayList0 = new ArrayList(3);
            arrayList0.add(notificationCompat$Action0);
            ArrayList arrayList1 = this.mBuilder.mActions;
            int v3 = 2;
            if(arrayList1 != null) {
                for(Object object0: arrayList1) {
                    Action notificationCompat$Action2 = (Action)object0;
                    if(notificationCompat$Action2.isContextual()) {
                        arrayList0.add(notificationCompat$Action2);
                    }
                    else if(!notificationCompat$Action2.getExtras().getBoolean("key_action_priority") && v3 > 1) {
                        arrayList0.add(notificationCompat$Action2);
                        --v3;
                    }
                    if(notificationCompat$Action1 != null && v3 == 1) {
                        arrayList0.add(notificationCompat$Action1);
                        v3 = 0;
                    }
                }
            }
            if(notificationCompat$Action1 != null && v3 >= 1) {
                arrayList0.add(notificationCompat$Action1);
            }
            return arrayList0;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @NonNull
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle0) {
            super.restoreFromCompatExtras(bundle0);
            this.d = bundle0.getInt("android.callType");
            this.i = bundle0.getBoolean("android.callIsVideo");
            if(Build.VERSION.SDK_INT >= 28 && bundle0.containsKey("android.callPerson")) {
                this.e = Person.fromAndroidPerson(p.e(bundle0.getParcelable("android.callPerson")));
            }
            else if(bundle0.containsKey("android.callPersonCompat")) {
                this.e = Person.fromBundle(bundle0.getBundle("android.callPersonCompat"));
            }
            if(bundle0.containsKey("android.verificationIcon")) {
                this.l = IconCompat.createFromIcon(((Icon)bundle0.getParcelable("android.verificationIcon")));
            }
            else if(bundle0.containsKey("android.verificationIconCompat")) {
                this.l = IconCompat.createFromBundle(bundle0.getBundle("android.verificationIconCompat"));
            }
            this.m = bundle0.getCharSequence("android.verificationText");
            this.f = (PendingIntent)bundle0.getParcelable("android.answerIntent");
            this.g = (PendingIntent)bundle0.getParcelable("android.declineIntent");
            this.h = (PendingIntent)bundle0.getParcelable("android.hangUpIntent");
            Integer integer0 = null;
            this.j = bundle0.containsKey("android.answerColor") ? bundle0.getInt("android.answerColor") : null;
            if(bundle0.containsKey("android.declineColor")) {
                integer0 = bundle0.getInt("android.declineColor");
            }
            this.k = integer0;
        }

        @NonNull
        public CallStyle setAnswerButtonColorHint(@ColorInt int v) {
            this.j = v;
            return this;
        }

        @NonNull
        public CallStyle setDeclineButtonColorHint(@ColorInt int v) {
            this.k = v;
            return this;
        }

        @NonNull
        public CallStyle setIsVideo(boolean z) {
            this.i = z;
            return this;
        }

        @NonNull
        public CallStyle setVerificationIcon(@Nullable Bitmap bitmap0) {
            this.l = IconCompat.createWithBitmap(bitmap0);
            return this;
        }

        @NonNull
        @RequiresApi(23)
        public CallStyle setVerificationIcon(@Nullable Icon icon0) {
            this.l = icon0 == null ? null : IconCompat.createFromIcon(icon0);
            return this;
        }

        @NonNull
        public CallStyle setVerificationText(@Nullable CharSequence charSequence0) {
            this.m = charSequence0;
            return this;
        }
    }

    public static final class CarExtender implements androidx.core.app.NotificationCompat.Extender {
        @Deprecated
        public static class UnreadConversation {
            public static class androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder {
                public final ArrayList a;
                public final String b;
                public RemoteInput c;
                public PendingIntent d;
                public PendingIntent e;
                public long f;

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder(@NonNull String s) {
                    this.a = new ArrayList();
                    this.b = s;
                }

                @NonNull
                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder addMessage(@Nullable String s) {
                    if(s != null) {
                        this.a.add(s);
                    }
                    return this;
                }

                @NonNull
                public UnreadConversation build() {
                    return new UnreadConversation(((String[])this.a.toArray(new String[this.a.size()])), this.c, this.e, this.d, new String[]{this.b}, this.f);
                }

                @NonNull
                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setLatestTimestamp(long v) {
                    this.f = v;
                    return this;
                }

                @NonNull
                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setReadPendingIntent(@Nullable PendingIntent pendingIntent0) {
                    this.d = pendingIntent0;
                    return this;
                }

                @NonNull
                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setReplyAction(@Nullable PendingIntent pendingIntent0, @Nullable RemoteInput remoteInput0) {
                    this.c = remoteInput0;
                    this.e = pendingIntent0;
                    return this;
                }
            }

            public final String[] a;
            public final RemoteInput b;
            public final PendingIntent c;
            public final PendingIntent d;
            public final String[] e;
            public final long f;

            public UnreadConversation(String[] arr_s, RemoteInput remoteInput0, PendingIntent pendingIntent0, PendingIntent pendingIntent1, String[] arr_s1, long v) {
                this.a = arr_s;
                this.b = remoteInput0;
                this.d = pendingIntent1;
                this.c = pendingIntent0;
                this.e = arr_s1;
                this.f = v;
            }

            public long getLatestTimestamp() {
                return this.f;
            }

            @Nullable
            public String[] getMessages() {
                return this.a;
            }

            @Nullable
            public String getParticipant() {
                return this.e.length <= 0 ? null : this.e[0];
            }

            @Nullable
            public String[] getParticipants() {
                return this.e;
            }

            @Nullable
            public PendingIntent getReadPendingIntent() {
                return this.d;
            }

            @Nullable
            public RemoteInput getRemoteInput() {
                return this.b;
            }

            @Nullable
            public PendingIntent getReplyPendingIntent() {
                return this.c;
            }
        }

        public Bitmap a;
        public UnreadConversation b;
        public int c;

        public CarExtender() {
            this.c = 0;
        }

        public CarExtender(@NonNull Notification notification0) {
            String[] arr_s1;
            int v = 0;
            this.c = 0;
            UnreadConversation notificationCompat$CarExtender$UnreadConversation0 = null;
            Bundle bundle0 = NotificationCompat.getExtras(notification0) == null ? null : NotificationCompat.getExtras(notification0).getBundle("android.car.EXTENSIONS");
            if(bundle0 != null) {
                this.a = (Bitmap)bundle0.getParcelable("large_icon");
                this.c = bundle0.getInt("app_color", 0);
                Bundle bundle1 = bundle0.getBundle("car_conversation");
                if(bundle1 != null) {
                    Parcelable[] arr_parcelable = bundle1.getParcelableArray("messages");
                    if(arr_parcelable == null) {
                        arr_s1 = null;
                    }
                    else {
                        String[] arr_s = new String[arr_parcelable.length];
                        for(int v1 = 0; v1 < arr_parcelable.length; ++v1) {
                            Parcelable parcelable0 = arr_parcelable[v1];
                            if(!(parcelable0 instanceof Bundle)) {
                                this.b = notificationCompat$CarExtender$UnreadConversation0;
                                return;
                            }
                            String s = ((Bundle)parcelable0).getString("text");
                            arr_s[v1] = s;
                            if(s == null) {
                                this.b = notificationCompat$CarExtender$UnreadConversation0;
                                return;
                            }
                        }
                        arr_s1 = arr_s;
                    }
                    Parcelable parcelable1 = bundle1.getParcelable("on_read");
                    Parcelable parcelable2 = bundle1.getParcelable("on_reply");
                    android.app.RemoteInput remoteInput0 = (android.app.RemoteInput)bundle1.getParcelable("remote_input");
                    String[] arr_s2 = bundle1.getStringArray("participants");
                    if(arr_s2 != null && arr_s2.length == 1) {
                        if(remoteInput0 != null) {
                            String s1 = j1.i(remoteInput0);
                            CharSequence charSequence0 = j1.h(remoteInput0);
                            CharSequence[] arr_charSequence = j1.f(remoteInput0);
                            boolean z = j1.e(remoteInput0);
                            if(Build.VERSION.SDK_INT >= 29) {
                                v = k1.a(remoteInput0);
                            }
                            notificationCompat$CarExtender$UnreadConversation0 = new RemoteInput(s1, charSequence0, arr_charSequence, z, v, j1.g(remoteInput0), null);
                        }
                        notificationCompat$CarExtender$UnreadConversation0 = new UnreadConversation(arr_s1, ((RemoteInput)notificationCompat$CarExtender$UnreadConversation0), ((PendingIntent)parcelable2), ((PendingIntent)parcelable1), arr_s2, bundle1.getLong("timestamp"));
                    }
                }
                this.b = notificationCompat$CarExtender$UnreadConversation0;
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Extender
        @NonNull
        public androidx.core.app.NotificationCompat.Builder extend(@NonNull androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            Bundle bundle0 = new Bundle();
            Bitmap bitmap0 = this.a;
            if(bitmap0 != null) {
                bundle0.putParcelable("large_icon", bitmap0);
            }
            int v = this.c;
            if(v != 0) {
                bundle0.putInt("app_color", v);
            }
            UnreadConversation notificationCompat$CarExtender$UnreadConversation0 = this.b;
            if(notificationCompat$CarExtender$UnreadConversation0 != null) {
                Bundle bundle1 = new Bundle();
                String s = notificationCompat$CarExtender$UnreadConversation0.getParticipants() == null || notificationCompat$CarExtender$UnreadConversation0.getParticipants().length <= 1 ? null : notificationCompat$CarExtender$UnreadConversation0.getParticipants()[0];
                String[] arr_s = notificationCompat$CarExtender$UnreadConversation0.getMessages();
                Parcelable[] arr_parcelable = new Parcelable[arr_s.length];
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("text", notificationCompat$CarExtender$UnreadConversation0.getMessages()[v1]);
                    bundle2.putString("author", s);
                    arr_parcelable[v1] = bundle2;
                }
                bundle1.putParcelableArray("messages", arr_parcelable);
                RemoteInput remoteInput0 = notificationCompat$CarExtender$UnreadConversation0.getRemoteInput();
                if(remoteInput0 != null) {
                    RemoteInput.Builder remoteInput$Builder0 = j1.d(remoteInput0.getResultKey());
                    j1.l(remoteInput$Builder0, remoteInput0.getLabel());
                    j1.k(remoteInput$Builder0, remoteInput0.getChoices());
                    j1.j(remoteInput$Builder0, remoteInput0.getAllowFreeFormInput());
                    j1.a(remoteInput$Builder0, remoteInput0.getExtras());
                    bundle1.putParcelable("remote_input", j1.c(j1.b(remoteInput$Builder0)));
                }
                bundle1.putParcelable("on_reply", notificationCompat$CarExtender$UnreadConversation0.getReplyPendingIntent());
                bundle1.putParcelable("on_read", notificationCompat$CarExtender$UnreadConversation0.getReadPendingIntent());
                bundle1.putStringArray("participants", notificationCompat$CarExtender$UnreadConversation0.getParticipants());
                bundle1.putLong("timestamp", notificationCompat$CarExtender$UnreadConversation0.getLatestTimestamp());
                bundle0.putBundle("car_conversation", bundle1);
            }
            notificationCompat$Builder0.getExtras().putBundle("android.car.EXTENSIONS", bundle0);
            return notificationCompat$Builder0;
        }

        @ColorInt
        public int getColor() {
            return this.c;
        }

        @Nullable
        public Bitmap getLargeIcon() {
            return this.a;
        }

        @Nullable
        @Deprecated
        public UnreadConversation getUnreadConversation() {
            return this.b;
        }

        @NonNull
        public CarExtender setColor(@ColorInt int v) {
            this.c = v;
            return this;
        }

        @NonNull
        public CarExtender setLargeIcon(@Nullable Bitmap bitmap0) {
            this.a = bitmap0;
            return this;
        }

        @NonNull
        @Deprecated
        public CarExtender setUnreadConversation(@Nullable UnreadConversation notificationCompat$CarExtender$UnreadConversation0) {
            this.b = notificationCompat$CarExtender$UnreadConversation0;
            return this;
        }
    }

    public static class DecoratedCustomViewStyle extends Style {
        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            notificationBuilderWithBuilderAccessor0.getBuilder().setStyle(l1.a());
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @NonNull
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            return null;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            return null;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            return null;
        }
    }

    public interface androidx.core.app.NotificationCompat.Extender {
        @NonNull
        androidx.core.app.NotificationCompat.Builder extend(@NonNull androidx.core.app.NotificationCompat.Builder arg1);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    public static class InboxStyle extends Style {
        public final ArrayList d;

        public InboxStyle() {
            this.d = new ArrayList();
        }

        public InboxStyle(@Nullable androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            this.d = new ArrayList();
            this.setBuilder(notificationCompat$Builder0);
        }

        @NonNull
        public InboxStyle addLine(@Nullable CharSequence charSequence0) {
            if(charSequence0 != null) {
                CharSequence charSequence1 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
                this.d.add(charSequence1);
            }
            return this;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            Notification.InboxStyle notification$InboxStyle0 = new Notification.InboxStyle(notificationBuilderWithBuilderAccessor0.getBuilder()).setBigContentTitle(this.a);
            if(this.c) {
                notification$InboxStyle0.setSummaryText(this.b);
            }
            for(Object object0: this.d) {
                notification$InboxStyle0.addLine(((CharSequence)object0));
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle0) {
            super.clearCompatExtraKeys(bundle0);
            bundle0.remove("android.textLines");
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @NonNull
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle0) {
            super.restoreFromCompatExtras(bundle0);
            ArrayList arrayList0 = this.d;
            arrayList0.clear();
            if(bundle0.containsKey("android.textLines")) {
                Collections.addAll(arrayList0, bundle0.getCharSequenceArray("android.textLines"));
            }
        }

        @NonNull
        public InboxStyle setBigContentTitle(@Nullable CharSequence charSequence0) {
            this.a = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            return this;
        }

        @NonNull
        public InboxStyle setSummaryText(@Nullable CharSequence charSequence0) {
            this.b = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence0);
            this.c = true;
            return this;
        }
    }

    public static class MessagingStyle extends Style {
        public static final class Message {
            public final CharSequence a;
            public final long b;
            public final Person c;
            public final Bundle d;
            public String e;
            public Uri f;

            public Message(@Nullable CharSequence charSequence0, long v, @Nullable Person person0) {
                this.d = new Bundle();
                this.a = charSequence0;
                this.b = v;
                this.c = person0;
            }

            @Deprecated
            public Message(@Nullable CharSequence charSequence0, long v, @Nullable CharSequence charSequence1) {
                this(charSequence0, v, new androidx.core.app.Person.Builder().setName(charSequence1).build());
            }

            public static Bundle[] a(ArrayList arrayList0) {
                Bundle[] arr_bundle = new Bundle[arrayList0.size()];
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    Message notificationCompat$MessagingStyle$Message0 = (Message)arrayList0.get(v1);
                    notificationCompat$MessagingStyle$Message0.getClass();
                    Bundle bundle0 = new Bundle();
                    CharSequence charSequence0 = notificationCompat$MessagingStyle$Message0.a;
                    if(charSequence0 != null) {
                        bundle0.putCharSequence("text", charSequence0);
                    }
                    bundle0.putLong("time", notificationCompat$MessagingStyle$Message0.b);
                    Person person0 = notificationCompat$MessagingStyle$Message0.c;
                    if(person0 != null) {
                        bundle0.putCharSequence("sender", person0.getName());
                        if(Build.VERSION.SDK_INT >= 28) {
                            bundle0.putParcelable("sender_person", q1.a(person0.toAndroidPerson()));
                        }
                        else {
                            bundle0.putBundle("person", person0.toBundle());
                        }
                    }
                    String s = notificationCompat$MessagingStyle$Message0.e;
                    if(s != null) {
                        bundle0.putString("type", s);
                    }
                    Uri uri0 = notificationCompat$MessagingStyle$Message0.f;
                    if(uri0 != null) {
                        bundle0.putParcelable("uri", uri0);
                    }
                    Bundle bundle1 = notificationCompat$MessagingStyle$Message0.d;
                    if(bundle1 != null) {
                        bundle0.putBundle("extras", bundle1);
                    }
                    arr_bundle[v1] = bundle0;
                }
                return arr_bundle;
            }

            public static ArrayList b(Parcelable[] arr_parcelable) {
                Person person0;
                ArrayList arrayList0 = new ArrayList(arr_parcelable.length);
                for(int v = 0; v < arr_parcelable.length; ++v) {
                    Parcelable parcelable0 = arr_parcelable[v];
                    if(parcelable0 instanceof Bundle) {
                        Bundle bundle0 = (Bundle)parcelable0;
                        Message notificationCompat$MessagingStyle$Message0 = null;
                        try {
                            if(bundle0.containsKey("text") && bundle0.containsKey("time")) {
                                if(bundle0.containsKey("person")) {
                                    person0 = Person.fromBundle(bundle0.getBundle("person"));
                                }
                                else if(!bundle0.containsKey("sender_person") || Build.VERSION.SDK_INT < 28) {
                                    person0 = bundle0.containsKey("sender") ? new androidx.core.app.Person.Builder().setName(bundle0.getCharSequence("sender")).build() : null;
                                }
                                else {
                                    person0 = Person.fromAndroidPerson(p.e(bundle0.getParcelable("sender_person")));
                                }
                                Message notificationCompat$MessagingStyle$Message1 = new Message(bundle0.getCharSequence("text"), bundle0.getLong("time"), person0);
                                if(bundle0.containsKey("type") && bundle0.containsKey("uri")) {
                                    notificationCompat$MessagingStyle$Message1.setData(bundle0.getString("type"), ((Uri)bundle0.getParcelable("uri")));
                                }
                                if(bundle0.containsKey("extras")) {
                                    notificationCompat$MessagingStyle$Message1.getExtras().putAll(bundle0.getBundle("extras"));
                                }
                                notificationCompat$MessagingStyle$Message0 = notificationCompat$MessagingStyle$Message1;
                            }
                        }
                        catch(ClassCastException unused_ex) {
                        }
                        if(notificationCompat$MessagingStyle$Message0 != null) {
                            arrayList0.add(notificationCompat$MessagingStyle$Message0);
                        }
                    }
                }
                return arrayList0;
            }

            public final Notification.MessagingStyle.Message c() {
                Notification.MessagingStyle.Message notification$MessagingStyle$Message0;
                Person person0 = this.getPerson();
                android.app.Person person1 = null;
                if(Build.VERSION.SDK_INT >= 28) {
                    CharSequence charSequence0 = this.getText();
                    long v = this.getTimestamp();
                    if(person0 != null) {
                        person1 = person0.toAndroidPerson();
                    }
                    notification$MessagingStyle$Message0 = q1.b(charSequence0, v, person1);
                }
                else {
                    CharSequence charSequence1 = this.getText();
                    long v1 = this.getTimestamp();
                    if(person0 != null) {
                        person1 = person0.getName();
                    }
                    notification$MessagingStyle$Message0 = p1.a(charSequence1, v1, ((CharSequence)person1));
                }
                if(this.getDataMimeType() != null) {
                    p1.b(notification$MessagingStyle$Message0, this.getDataMimeType(), this.getDataUri());
                }
                return notification$MessagingStyle$Message0;
            }

            @Nullable
            public String getDataMimeType() {
                return this.e;
            }

            @Nullable
            public Uri getDataUri() {
                return this.f;
            }

            @NonNull
            public Bundle getExtras() {
                return this.d;
            }

            @Nullable
            public Person getPerson() {
                return this.c;
            }

            @Nullable
            @Deprecated
            public CharSequence getSender() {
                return this.c == null ? null : this.c.getName();
            }

            @Nullable
            public CharSequence getText() {
                return this.a;
            }

            public long getTimestamp() {
                return this.b;
            }

            @NonNull
            public Message setData(@Nullable String s, @Nullable Uri uri0) {
                this.e = s;
                this.f = uri0;
                return this;
            }
        }

        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        public final ArrayList d;
        public final ArrayList e;
        public Person f;
        public CharSequence g;
        public Boolean h;

        public MessagingStyle() {
            this.d = new ArrayList();
            this.e = new ArrayList();
        }

        public MessagingStyle(@NonNull Person person0) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            if(TextUtils.isEmpty(person0.getName())) {
                throw new IllegalArgumentException("User\'s name must not be empty.");
            }
            this.f = person0;
        }

        @Deprecated
        public MessagingStyle(@NonNull CharSequence charSequence0) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.f = new androidx.core.app.Person.Builder().setName(charSequence0).build();
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        public void addCompatExtras(@NonNull Bundle bundle0) {
            super.addCompatExtras(bundle0);
            bundle0.putCharSequence("android.selfDisplayName", this.f.getName());
            bundle0.putBundle("android.messagingStyleUser", this.f.toBundle());
            bundle0.putCharSequence("android.hiddenConversationTitle", this.g);
            if(this.g != null && this.h.booleanValue()) {
                bundle0.putCharSequence("android.conversationTitle", this.g);
            }
            ArrayList arrayList0 = this.d;
            if(!arrayList0.isEmpty()) {
                bundle0.putParcelableArray("android.messages", Message.a(arrayList0));
            }
            ArrayList arrayList1 = this.e;
            if(!arrayList1.isEmpty()) {
                bundle0.putParcelableArray("android.messages.historic", Message.a(arrayList1));
            }
            Boolean boolean0 = this.h;
            if(boolean0 != null) {
                bundle0.putBoolean("android.isGroupConversation", boolean0.booleanValue());
            }
        }

        @NonNull
        public MessagingStyle addHistoricMessage(@Nullable Message notificationCompat$MessagingStyle$Message0) {
            if(notificationCompat$MessagingStyle$Message0 != null) {
                ArrayList arrayList0 = this.e;
                arrayList0.add(notificationCompat$MessagingStyle$Message0);
                if(arrayList0.size() > 25) {
                    arrayList0.remove(0);
                }
            }
            return this;
        }

        @NonNull
        public MessagingStyle addMessage(@Nullable Message notificationCompat$MessagingStyle$Message0) {
            if(notificationCompat$MessagingStyle$Message0 != null) {
                ArrayList arrayList0 = this.d;
                arrayList0.add(notificationCompat$MessagingStyle$Message0);
                if(arrayList0.size() > 25) {
                    arrayList0.remove(0);
                }
            }
            return this;
        }

        @NonNull
        public MessagingStyle addMessage(@Nullable CharSequence charSequence0, long v, @Nullable Person person0) {
            this.addMessage(new Message(charSequence0, v, person0));
            return this;
        }

        @NonNull
        @Deprecated
        public MessagingStyle addMessage(@Nullable CharSequence charSequence0, long v, @Nullable CharSequence charSequence1) {
            Message notificationCompat$MessagingStyle$Message0 = new Message(charSequence0, v, new androidx.core.app.Person.Builder().setName(charSequence1).build());
            ArrayList arrayList0 = this.d;
            arrayList0.add(notificationCompat$MessagingStyle$Message0);
            if(arrayList0.size() > 25) {
                arrayList0.remove(0);
            }
            return this;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            this.setGroupConversation(this.isGroupConversation());
            Notification.MessagingStyle notification$MessagingStyle0 = Build.VERSION.SDK_INT < 28 ? m1.b(this.f.getName()) : o1.a(this.f.toAndroidPerson());
            for(Object object0: this.d) {
                m1.a(notification$MessagingStyle0, ((Message)object0).c());
            }
            for(Object object1: this.e) {
                n1.a(notification$MessagingStyle0, ((Message)object1).c());
            }
            if(this.h.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                m1.c(notification$MessagingStyle0, this.g);
            }
            if(Build.VERSION.SDK_INT >= 28) {
                o1.b(notification$MessagingStyle0, this.h.booleanValue());
            }
            notification$MessagingStyle0.setBuilder(notificationBuilderWithBuilderAccessor0.getBuilder());
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle0) {
            super.clearCompatExtraKeys(bundle0);
            bundle0.remove("android.messagingStyleUser");
            bundle0.remove("android.selfDisplayName");
            bundle0.remove("android.conversationTitle");
            bundle0.remove("android.hiddenConversationTitle");
            bundle0.remove("android.messages");
            bundle0.remove("android.messages.historic");
            bundle0.remove("android.isGroupConversation");
        }

        @Nullable
        public static MessagingStyle extractMessagingStyleFromNotification(@NonNull Notification notification0) {
            Style notificationCompat$Style0 = Style.extractStyleFromNotification(notification0);
            return notificationCompat$Style0 instanceof MessagingStyle ? ((MessagingStyle)notificationCompat$Style0) : null;
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @NonNull
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Nullable
        public CharSequence getConversationTitle() {
            return this.g;
        }

        @NonNull
        public List getHistoricMessages() {
            return this.e;
        }

        @NonNull
        public List getMessages() {
            return this.d;
        }

        @NonNull
        public Person getUser() {
            return this.f;
        }

        @Nullable
        @Deprecated
        public CharSequence getUserDisplayName() {
            return this.f.getName();
        }

        public boolean isGroupConversation() {
            return this.h == null ? false : this.h.booleanValue();
        }

        @Override  // androidx.core.app.NotificationCompat$Style
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle0) {
            super.restoreFromCompatExtras(bundle0);
            ArrayList arrayList0 = this.d;
            arrayList0.clear();
            this.f = bundle0.containsKey("android.messagingStyleUser") ? Person.fromBundle(bundle0.getBundle("android.messagingStyleUser")) : new androidx.core.app.Person.Builder().setName(bundle0.getString("android.selfDisplayName")).build();
            CharSequence charSequence0 = bundle0.getCharSequence("android.conversationTitle");
            this.g = charSequence0;
            if(charSequence0 == null) {
                this.g = bundle0.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] arr_parcelable = bundle0.getParcelableArray("android.messages");
            if(arr_parcelable != null) {
                arrayList0.addAll(Message.b(arr_parcelable));
            }
            Parcelable[] arr_parcelable1 = bundle0.getParcelableArray("android.messages.historic");
            if(arr_parcelable1 != null) {
                ArrayList arrayList1 = Message.b(arr_parcelable1);
                this.e.addAll(arrayList1);
            }
            if(bundle0.containsKey("android.isGroupConversation")) {
                this.h = Boolean.valueOf(bundle0.getBoolean("android.isGroupConversation"));
            }
        }

        @NonNull
        public MessagingStyle setConversationTitle(@Nullable CharSequence charSequence0) {
            this.g = charSequence0;
            return this;
        }

        @NonNull
        public MessagingStyle setGroupConversation(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ServiceNotificationBehavior {
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    public static abstract class Style {
        public CharSequence a;
        public CharSequence b;
        public boolean c;
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        protected androidx.core.app.NotificationCompat.Builder mBuilder;

        public Style() {
            this.c = false;
        }

        public final Bitmap a(IconCompat iconCompat0, int v, int v1) {
            Drawable drawable0 = iconCompat0.loadDrawable(this.mBuilder.mContext);
            int v2 = v1 == 0 ? drawable0.getIntrinsicWidth() : v1;
            if(v1 == 0) {
                v1 = drawable0.getIntrinsicHeight();
            }
            Bitmap bitmap0 = Bitmap.createBitmap(v2, v1, Bitmap.Config.ARGB_8888);
            drawable0.setBounds(0, 0, v2, v1);
            if(v != 0) {
                drawable0.mutate().setColorFilter(new PorterDuffColorFilter(v, PorterDuff.Mode.SRC_IN));
            }
            drawable0.draw(new Canvas(bitmap0));
            return bitmap0;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void addCompatExtras(@NonNull Bundle bundle0) {
            if(this.c) {
                bundle0.putCharSequence("android.summaryText", this.b);
            }
            CharSequence charSequence0 = this.a;
            if(charSequence0 != null) {
                bundle0.putCharSequence("android.title.big", charSequence0);
            }
            String s = this.getClassName();
            if(s != null) {
                bundle0.putString("androidx.core.app.extra.COMPAT_TEMPLATE", s);
            }
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
        }

        @NonNull
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews applyStandardTemplate(boolean z, int v, boolean z1) {
            int v8;
            boolean z2;
            Resources resources0 = this.mBuilder.mContext.getResources();
            RemoteViews remoteViews0 = new RemoteViews("net.daum.android.tistoryapp", v);
            androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0 = this.mBuilder;
            int v1 = 0;
            if(notificationCompat$Builder0.g != null) {
                remoteViews0.setViewVisibility(id.icon, 0);
                remoteViews0.setImageViewBitmap(id.icon, this.a(this.mBuilder.g, 0, 0));
                if(z && this.mBuilder.R.icon != 0) {
                    int v2 = resources0.getDimensionPixelSize(dimen.notification_right_icon_size);
                    int v3 = resources0.getDimensionPixelSize(dimen.notification_small_icon_background_padding);
                    Bitmap bitmap0 = this.b(this.mBuilder.R.icon, v2, v2 - v3 * 2, this.mBuilder.getColor());
                    remoteViews0.setImageViewBitmap(id.right_icon, bitmap0);
                    remoteViews0.setViewVisibility(id.right_icon, 0);
                }
            }
            else if(z && notificationCompat$Builder0.R.icon != 0) {
                remoteViews0.setViewVisibility(id.icon, 0);
                int v4 = resources0.getDimensionPixelSize(dimen.notification_large_icon_width);
                int v5 = resources0.getDimensionPixelSize(dimen.notification_big_circle_margin);
                int v6 = resources0.getDimensionPixelSize(dimen.notification_small_icon_size_as_large);
                Bitmap bitmap1 = this.b(this.mBuilder.R.icon, v4 - v5, v6, this.mBuilder.getColor());
                remoteViews0.setImageViewBitmap(id.icon, bitmap1);
            }
            CharSequence charSequence0 = this.mBuilder.b;
            if(charSequence0 != null) {
                remoteViews0.setTextViewText(id.title, charSequence0);
            }
            CharSequence charSequence1 = this.mBuilder.c;
            int v7 = 1;
            if(charSequence1 == null) {
                z2 = false;
            }
            else {
                remoteViews0.setTextViewText(id.text, charSequence1);
                z2 = true;
            }
            androidx.core.app.NotificationCompat.Builder notificationCompat$Builder1 = this.mBuilder;
            CharSequence charSequence2 = notificationCompat$Builder1.h;
            if(charSequence2 != null) {
                remoteViews0.setTextViewText(id.info, charSequence2);
                remoteViews0.setViewVisibility(id.info, 0);
                z2 = true;
                v8 = 1;
            }
            else if(notificationCompat$Builder1.i > 0) {
                int v9 = resources0.getInteger(integer.status_bar_notification_info_maxnum);
                if(this.mBuilder.i > v9) {
                    remoteViews0.setTextViewText(id.info, resources0.getString(string.status_bar_notification_info_overflow));
                }
                else {
                    NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
                    remoteViews0.setTextViewText(id.info, numberFormat0.format(((long)this.mBuilder.i)));
                }
                remoteViews0.setViewVisibility(id.info, 0);
                z2 = true;
                v8 = 1;
            }
            else {
                remoteViews0.setViewVisibility(id.info, 8);
                v8 = 0;
            }
            CharSequence charSequence3 = this.mBuilder.o;
            if(charSequence3 != null) {
                remoteViews0.setTextViewText(id.text, charSequence3);
                CharSequence charSequence4 = this.mBuilder.c;
                if(charSequence4 == null) {
                    remoteViews0.setViewVisibility(id.text2, 8);
                }
                else {
                    remoteViews0.setTextViewText(id.text2, charSequence4);
                    remoteViews0.setViewVisibility(id.text2, 0);
                    if(z1) {
                        float f = (float)resources0.getDimensionPixelSize(dimen.notification_subtext_size);
                        remoteViews0.setTextViewTextSize(id.text, 0, f);
                    }
                    remoteViews0.setViewPadding(id.line1, 0, 0, 0, 0);
                }
            }
            if(this.mBuilder.getWhenIfShowing() == 0L) {
                v7 = v8;
            }
            else if(this.mBuilder.l) {
                remoteViews0.setViewVisibility(id.chronometer, 0);
                int v10 = id.chronometer;
                long v11 = this.mBuilder.getWhenIfShowing();
                remoteViews0.setLong(v10, "setBase", SystemClock.elapsedRealtime() - System.currentTimeMillis() + v11);
                remoteViews0.setBoolean(id.chronometer, "setStarted", true);
                if(this.mBuilder.m) {
                    r1.a(remoteViews0, id.chronometer, true);
                }
            }
            else {
                remoteViews0.setViewVisibility(id.time, 0);
                remoteViews0.setLong(id.time, "setTime", this.mBuilder.getWhenIfShowing());
            }
            remoteViews0.setViewVisibility(id.right_side, (v7 == 0 ? 8 : 0));
            int v12 = id.line3;
            if(!z2) {
                v1 = 8;
            }
            remoteViews0.setViewVisibility(v12, v1);
            return remoteViews0;
        }

        public final Bitmap b(int v, int v1, int v2, int v3) {
            int v4 = drawable.notification_icon_background;
            if(v3 == 0) {
                v3 = 0;
            }
            Bitmap bitmap0 = this.a(IconCompat.createWithResource(this.mBuilder.mContext, v4), v3, v1);
            Canvas canvas0 = new Canvas(bitmap0);
            Drawable drawable0 = this.mBuilder.mContext.getResources().getDrawable(v).mutate();
            drawable0.setFilterBitmap(true);
            int v5 = (v1 - v2) / 2;
            drawable0.setBounds(v5, v5, v2 + v5, v2 + v5);
            drawable0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawable0.draw(canvas0);
            return bitmap0;
        }

        @Nullable
        public Notification build() {
            return this.mBuilder == null ? null : this.mBuilder.build();
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void buildIntoRemoteViews(RemoteViews remoteViews0, RemoteViews remoteViews1) {
            remoteViews0.setViewVisibility(id.title, 8);
            remoteViews0.setViewVisibility(id.text2, 8);
            remoteViews0.setViewVisibility(id.text, 8);
            remoteViews0.removeAllViews(id.notification_main_column);
            remoteViews0.addView(id.notification_main_column, remoteViews1.clone());
            remoteViews0.setViewVisibility(id.notification_main_column, 0);
            Resources resources0 = this.mBuilder.mContext.getResources();
            int v = resources0.getDimensionPixelSize(dimen.notification_top_pad);
            int v1 = resources0.getDimensionPixelSize(dimen.notification_top_pad_large_text);
            float f = resources0.getConfiguration().fontScale;
            if(f < 1.0f) {
                f = 1.0f;
            }
            else if(f > 1.3f) {
                f = 1.3f;
            }
            float f1 = (f - 1.0f) / 0.3f;
            remoteViews0.setViewPadding(id.notification_main_column_container, 0, Math.round(f1 * ((float)v1) + (1.0f - f1) * ((float)v)), 0, 0);
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void clearCompatExtraKeys(@NonNull Bundle bundle0) {
            bundle0.remove("android.summaryText");
            bundle0.remove("android.title.big");
            bundle0.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public Bitmap createColoredBitmap(int v, int v1) {
            return this.a(IconCompat.createWithResource(this.mBuilder.mContext, v), v1, 0);
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public boolean displayCustomViewInline() {
            return false;
        }

        @Nullable
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public static Style extractStyleFromNotification(@NonNull Notification notification0) {
            DecoratedCustomViewStyle notificationCompat$DecoratedCustomViewStyle0;
            Bundle bundle0 = NotificationCompat.getExtras(notification0);
            if(bundle0 == null) {
                return null;
            }
            String s = bundle0.getString("androidx.core.app.extra.COMPAT_TEMPLATE");
            if(s == null) {
                notificationCompat$DecoratedCustomViewStyle0 = null;
            }
            else {
                switch(s) {
                    case "androidx.core.app.NotificationCompat$BigPictureStyle": {
                        notificationCompat$DecoratedCustomViewStyle0 = new BigPictureStyle();
                        break;
                    }
                    case "androidx.core.app.NotificationCompat$BigTextStyle": {
                        notificationCompat$DecoratedCustomViewStyle0 = new BigTextStyle();
                        break;
                    }
                    case "androidx.core.app.NotificationCompat$CallStyle": {
                        notificationCompat$DecoratedCustomViewStyle0 = new CallStyle();
                        break;
                    }
                    case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle": {
                        notificationCompat$DecoratedCustomViewStyle0 = new DecoratedCustomViewStyle();
                        break;
                    }
                    case "androidx.core.app.NotificationCompat$InboxStyle": {
                        notificationCompat$DecoratedCustomViewStyle0 = new InboxStyle();
                        break;
                    }
                    case "androidx.core.app.NotificationCompat$MessagingStyle": {
                        notificationCompat$DecoratedCustomViewStyle0 = new MessagingStyle();
                        break;
                    }
                    default: {
                        notificationCompat$DecoratedCustomViewStyle0 = null;
                    }
                }
            }
            if(notificationCompat$DecoratedCustomViewStyle0 == null) {
                if(bundle0.containsKey("android.selfDisplayName") || bundle0.containsKey("android.messagingStyleUser")) {
                    notificationCompat$DecoratedCustomViewStyle0 = new MessagingStyle();
                }
                else if(bundle0.containsKey("android.picture") || bundle0.containsKey("android.pictureIcon")) {
                    notificationCompat$DecoratedCustomViewStyle0 = new BigPictureStyle();
                }
                else if(bundle0.containsKey("android.bigText")) {
                    notificationCompat$DecoratedCustomViewStyle0 = new BigTextStyle();
                }
                else if(bundle0.containsKey("android.textLines")) {
                    notificationCompat$DecoratedCustomViewStyle0 = new InboxStyle();
                }
                else if(bundle0.containsKey("android.callType")) {
                    notificationCompat$DecoratedCustomViewStyle0 = new CallStyle();
                }
                else {
                    String s1 = bundle0.getString("android.template");
                    if(s1 == null) {
                        notificationCompat$DecoratedCustomViewStyle0 = null;
                    }
                    else if(s1.equals("android.app.Notification$BigPictureStyle")) {
                        notificationCompat$DecoratedCustomViewStyle0 = new BigPictureStyle();
                    }
                    else if(s1.equals("android.app.Notification$BigTextStyle")) {
                        notificationCompat$DecoratedCustomViewStyle0 = new BigTextStyle();
                    }
                    else if(s1.equals("android.app.Notification$InboxStyle")) {
                        notificationCompat$DecoratedCustomViewStyle0 = new InboxStyle();
                    }
                    else if(s1.equals("android.app.Notification$MessagingStyle")) {
                        notificationCompat$DecoratedCustomViewStyle0 = new MessagingStyle();
                    }
                    else if(s1.equals("android.app.Notification$DecoratedCustomViewStyle")) {
                        notificationCompat$DecoratedCustomViewStyle0 = new DecoratedCustomViewStyle();
                    }
                    else {
                        notificationCompat$DecoratedCustomViewStyle0 = null;
                    }
                }
            }
            if(notificationCompat$DecoratedCustomViewStyle0 != null) {
                try {
                    notificationCompat$DecoratedCustomViewStyle0.restoreFromCompatExtras(bundle0);
                    return notificationCompat$DecoratedCustomViewStyle0;
                }
                catch(ClassCastException unused_ex) {
                }
            }
            return null;
        }

        @Nullable
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public String getClassName() {
            return null;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            return null;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            return null;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor0) {
            return null;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public void restoreFromCompatExtras(@NonNull Bundle bundle0) {
            if(bundle0.containsKey("android.summaryText")) {
                this.b = bundle0.getCharSequence("android.summaryText");
                this.c = true;
            }
            this.a = bundle0.getCharSequence("android.title.big");
        }

        public void setBuilder(@Nullable androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            if(this.mBuilder != notificationCompat$Builder0) {
                this.mBuilder = notificationCompat$Builder0;
                if(notificationCompat$Builder0 != null) {
                    notificationCompat$Builder0.setStyle(this);
                }
            }
        }
    }

    public static final class TvExtender implements androidx.core.app.NotificationCompat.Extender {
        public final int a;
        public String b;
        public PendingIntent c;
        public PendingIntent d;
        public boolean e;

        public TvExtender() {
            this.a = 1;
        }

        public TvExtender(@NonNull Notification notification0) {
            Bundle bundle0 = notification0.extras == null ? null : notification0.extras.getBundle("android.tv.EXTENSIONS");
            if(bundle0 != null) {
                this.a = bundle0.getInt("flags");
                this.b = bundle0.getString("channel_id");
                this.e = bundle0.getBoolean("suppressShowOverApps");
                this.c = (PendingIntent)bundle0.getParcelable("content_intent");
                this.d = (PendingIntent)bundle0.getParcelable("delete_intent");
            }
        }

        @Override  // androidx.core.app.NotificationCompat$Extender
        @NonNull
        public androidx.core.app.NotificationCompat.Builder extend(@NonNull androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("flags", this.a);
            bundle0.putString("channel_id", this.b);
            bundle0.putBoolean("suppressShowOverApps", this.e);
            PendingIntent pendingIntent0 = this.c;
            if(pendingIntent0 != null) {
                bundle0.putParcelable("content_intent", pendingIntent0);
            }
            PendingIntent pendingIntent1 = this.d;
            if(pendingIntent1 != null) {
                bundle0.putParcelable("delete_intent", pendingIntent1);
            }
            notificationCompat$Builder0.getExtras().putBundle("android.tv.EXTENSIONS", bundle0);
            return notificationCompat$Builder0;
        }

        @Nullable
        public String getChannelId() {
            return this.b;
        }

        @Nullable
        public PendingIntent getContentIntent() {
            return this.c;
        }

        @Nullable
        public PendingIntent getDeleteIntent() {
            return this.d;
        }

        public boolean isAvailableOnTv() {
            return (this.a & 1) != 0;
        }

        public boolean isSuppressShowOverApps() {
            return this.e;
        }

        @NonNull
        public TvExtender setChannelId(@Nullable String s) {
            this.b = s;
            return this;
        }

        @NonNull
        public TvExtender setContentIntent(@Nullable PendingIntent pendingIntent0) {
            this.c = pendingIntent0;
            return this;
        }

        @NonNull
        public TvExtender setDeleteIntent(@Nullable PendingIntent pendingIntent0) {
            this.d = pendingIntent0;
            return this;
        }

        @NonNull
        public TvExtender setSuppressShowOverApps(boolean z) {
            this.e = z;
            return this;
        }
    }

    public static final class androidx.core.app.NotificationCompat.WearableExtender implements androidx.core.app.NotificationCompat.Extender {
        @Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;
        @Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;
        @Deprecated
        public static final int SIZE_DEFAULT = 0;
        @Deprecated
        public static final int SIZE_FULL_SCREEN = 5;
        @Deprecated
        public static final int SIZE_LARGE = 4;
        @Deprecated
        public static final int SIZE_MEDIUM = 3;
        @Deprecated
        public static final int SIZE_SMALL = 2;
        @Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        public ArrayList a;
        public int b;
        public PendingIntent c;
        public ArrayList d;
        public Bitmap e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public String m;
        public String n;

        public androidx.core.app.NotificationCompat.WearableExtender() {
            this.a = new ArrayList();
            this.b = 1;
            this.d = new ArrayList();
            this.g = 0x800005;
            this.h = -1;
            this.i = 0;
            this.k = 80;
        }

        public androidx.core.app.NotificationCompat.WearableExtender(@NonNull Notification notification0) {
            Notification[] arr_notification;
            this.a = new ArrayList();
            this.b = 1;
            this.d = new ArrayList();
            this.g = 0x800005;
            this.h = -1;
            this.i = 0;
            this.k = 80;
            Bundle bundle0 = NotificationCompat.getExtras(notification0);
            Bundle bundle1 = bundle0 == null ? null : bundle0.getBundle("android.wearable.EXTENSIONS");
            if(bundle1 != null) {
                ArrayList arrayList0 = bundle1.getParcelableArrayList("actions");
                if(arrayList0 != null) {
                    int v = arrayList0.size();
                    Action[] arr_notificationCompat$Action = new Action[v];
                    for(int v1 = 0; v1 < v; ++v1) {
                        arr_notificationCompat$Action[v1] = s1.e(arrayList0, v1);
                    }
                    Collections.addAll(this.a, arr_notificationCompat$Action);
                }
                this.b = bundle1.getInt("flags", 1);
                this.c = (PendingIntent)bundle1.getParcelable("displayIntent");
                Parcelable[] arr_parcelable = bundle1.getParcelableArray("pages");
                if(arr_parcelable instanceof Notification[] || arr_parcelable == null) {
                    arr_notification = (Notification[])arr_parcelable;
                }
                else {
                    arr_notification = new Notification[arr_parcelable.length];
                    for(int v2 = 0; v2 < arr_parcelable.length; ++v2) {
                        arr_notification[v2] = (Notification)arr_parcelable[v2];
                    }
                    bundle1.putParcelableArray("pages", arr_notification);
                }
                if(arr_notification != null) {
                    Collections.addAll(this.d, arr_notification);
                }
                this.e = (Bitmap)bundle1.getParcelable("background");
                this.f = bundle1.getInt("contentIcon");
                this.g = bundle1.getInt("contentIconGravity", 0x800005);
                this.h = bundle1.getInt("contentActionIndex", -1);
                this.i = bundle1.getInt("customSizePreset", 0);
                this.j = bundle1.getInt("customContentHeight");
                this.k = bundle1.getInt("gravity", 80);
                this.l = bundle1.getInt("hintScreenTimeout");
                this.m = bundle1.getString("dismissalId");
                this.n = bundle1.getString("bridgeTag");
            }
        }

        public final void a(int v, boolean z) {
            if(z) {
                this.b |= v;
                return;
            }
            this.b &= ~v;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.WearableExtender addAction(@NonNull Action notificationCompat$Action0) {
            this.a.add(notificationCompat$Action0);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.WearableExtender addActions(@NonNull List list0) {
            this.a.addAll(list0);
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender addPage(@NonNull Notification notification0) {
            this.d.add(notification0);
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender addPages(@NonNull List list0) {
            this.d.addAll(list0);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.WearableExtender clearActions() {
            this.a.clear();
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender clearPages() {
            this.d.clear();
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.WearableExtender clone() {
            androidx.core.app.NotificationCompat.WearableExtender notificationCompat$WearableExtender0 = new androidx.core.app.NotificationCompat.WearableExtender();
            notificationCompat$WearableExtender0.a = new ArrayList(this.a);
            notificationCompat$WearableExtender0.b = this.b;
            notificationCompat$WearableExtender0.c = this.c;
            notificationCompat$WearableExtender0.d = new ArrayList(this.d);
            notificationCompat$WearableExtender0.e = this.e;
            notificationCompat$WearableExtender0.f = this.f;
            notificationCompat$WearableExtender0.g = this.g;
            notificationCompat$WearableExtender0.h = this.h;
            notificationCompat$WearableExtender0.i = this.i;
            notificationCompat$WearableExtender0.j = this.j;
            notificationCompat$WearableExtender0.k = this.k;
            notificationCompat$WearableExtender0.l = this.l;
            notificationCompat$WearableExtender0.m = this.m;
            notificationCompat$WearableExtender0.n = this.n;
            return notificationCompat$WearableExtender0;
        }

        @Override
        @NonNull
        public Object clone() throws CloneNotSupportedException {
            return this.clone();
        }

        @Override  // androidx.core.app.NotificationCompat$Extender
        @NonNull
        public androidx.core.app.NotificationCompat.Builder extend(@NonNull androidx.core.app.NotificationCompat.Builder notificationCompat$Builder0) {
            Bundle bundle0 = new Bundle();
            if(!this.a.isEmpty()) {
                ArrayList arrayList0 = new ArrayList(this.a.size());
                for(Object object0: this.a) {
                    Action notificationCompat$Action0 = (Action)object0;
                    int v = Build.VERSION.SDK_INT;
                    IconCompat iconCompat0 = notificationCompat$Action0.getIconCompat();
                    Notification.Action.Builder notification$Action$Builder0 = t1.a((iconCompat0 == null ? null : iconCompat0.toIcon()), notificationCompat$Action0.getTitle(), notificationCompat$Action0.getActionIntent());
                    Bundle bundle1 = notificationCompat$Action0.getExtras() == null ? new Bundle() : new Bundle(notificationCompat$Action0.getExtras());
                    bundle1.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action0.getAllowGeneratedReplies());
                    u1.a(notification$Action$Builder0, notificationCompat$Action0.getAllowGeneratedReplies());
                    if(v >= 0x1F) {
                        v1.a(notification$Action$Builder0, notificationCompat$Action0.isAuthenticationRequired());
                    }
                    s1.a(notification$Action$Builder0, bundle1);
                    RemoteInput[] arr_remoteInput = notificationCompat$Action0.getRemoteInputs();
                    if(arr_remoteInput != null) {
                        android.app.RemoteInput[] arr_remoteInput1 = RemoteInput.b(arr_remoteInput);
                        for(int v1 = 0; v1 < arr_remoteInput1.length; ++v1) {
                            s1.b(notification$Action$Builder0, arr_remoteInput1[v1]);
                        }
                    }
                    arrayList0.add(s1.c(notification$Action$Builder0));
                }
                bundle0.putParcelableArrayList("actions", arrayList0);
            }
            int v2 = this.b;
            if(v2 != 1) {
                bundle0.putInt("flags", v2);
            }
            PendingIntent pendingIntent0 = this.c;
            if(pendingIntent0 != null) {
                bundle0.putParcelable("displayIntent", pendingIntent0);
            }
            if(!this.d.isEmpty()) {
                bundle0.putParcelableArray("pages", ((Parcelable[])this.d.toArray(new Notification[this.d.size()])));
            }
            Bitmap bitmap0 = this.e;
            if(bitmap0 != null) {
                bundle0.putParcelable("background", bitmap0);
            }
            int v3 = this.f;
            if(v3 != 0) {
                bundle0.putInt("contentIcon", v3);
            }
            int v4 = this.g;
            if(v4 != 0x800005) {
                bundle0.putInt("contentIconGravity", v4);
            }
            int v5 = this.h;
            if(v5 != -1) {
                bundle0.putInt("contentActionIndex", v5);
            }
            int v6 = this.i;
            if(v6 != 0) {
                bundle0.putInt("customSizePreset", v6);
            }
            int v7 = this.j;
            if(v7 != 0) {
                bundle0.putInt("customContentHeight", v7);
            }
            int v8 = this.k;
            if(v8 != 80) {
                bundle0.putInt("gravity", v8);
            }
            int v9 = this.l;
            if(v9 != 0) {
                bundle0.putInt("hintScreenTimeout", v9);
            }
            String s = this.m;
            if(s != null) {
                bundle0.putString("dismissalId", s);
            }
            String s1 = this.n;
            if(s1 != null) {
                bundle0.putString("bridgeTag", s1);
            }
            notificationCompat$Builder0.getExtras().putBundle("android.wearable.EXTENSIONS", bundle0);
            return notificationCompat$Builder0;
        }

        @NonNull
        public List getActions() {
            return this.a;
        }

        @Nullable
        @Deprecated
        public Bitmap getBackground() {
            return this.e;
        }

        @Nullable
        public String getBridgeTag() {
            return this.n;
        }

        public int getContentAction() {
            return this.h;
        }

        @Deprecated
        public int getContentIcon() {
            return this.f;
        }

        @Deprecated
        public int getContentIconGravity() {
            return this.g;
        }

        public boolean getContentIntentAvailableOffline() {
            return (this.b & 1) != 0;
        }

        @Deprecated
        public int getCustomContentHeight() {
            return this.j;
        }

        @Deprecated
        public int getCustomSizePreset() {
            return this.i;
        }

        @Nullable
        public String getDismissalId() {
            return this.m;
        }

        @Nullable
        @Deprecated
        public PendingIntent getDisplayIntent() {
            return this.c;
        }

        @Deprecated
        public int getGravity() {
            return this.k;
        }

        @Deprecated
        public boolean getHintAmbientBigPicture() {
            return (this.b & 0x20) != 0;
        }

        @Deprecated
        public boolean getHintAvoidBackgroundClipping() {
            return (this.b & 16) != 0;
        }

        public boolean getHintContentIntentLaunchesActivity() {
            return (this.b & 0x40) != 0;
        }

        @Deprecated
        public boolean getHintHideIcon() {
            return (this.b & 2) != 0;
        }

        @Deprecated
        public int getHintScreenTimeout() {
            return this.l;
        }

        @Deprecated
        public boolean getHintShowBackgroundOnly() {
            return (this.b & 4) != 0;
        }

        @NonNull
        @Deprecated
        public List getPages() {
            return this.d;
        }

        public boolean getStartScrollBottom() {
            return (this.b & 8) != 0;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setBackground(@Nullable Bitmap bitmap0) {
            this.e = bitmap0;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.WearableExtender setBridgeTag(@Nullable String s) {
            this.n = s;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.WearableExtender setContentAction(int v) {
            this.h = v;
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setContentIcon(int v) {
            this.f = v;
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setContentIconGravity(int v) {
            this.g = v;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.WearableExtender setContentIntentAvailableOffline(boolean z) {
            this.a(1, z);
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setCustomContentHeight(int v) {
            this.j = v;
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setCustomSizePreset(int v) {
            this.i = v;
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.WearableExtender setDismissalId(@Nullable String s) {
            this.m = s;
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setDisplayIntent(@Nullable PendingIntent pendingIntent0) {
            this.c = pendingIntent0;
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setGravity(int v) {
            this.k = v;
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintAmbientBigPicture(boolean z) {
            this.a(0x20, z);
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintAvoidBackgroundClipping(boolean z) {
            this.a(16, z);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.WearableExtender setHintContentIntentLaunchesActivity(boolean z) {
            this.a(0x40, z);
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintHideIcon(boolean z) {
            this.a(2, z);
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintScreenTimeout(int v) {
            this.l = v;
            return this;
        }

        @NonNull
        @Deprecated
        public androidx.core.app.NotificationCompat.WearableExtender setHintShowBackgroundOnly(boolean z) {
            this.a(4, z);
            return this;
        }

        @NonNull
        public androidx.core.app.NotificationCompat.WearableExtender setStartScrollBottom(boolean z) {
            this.a(8, z);
            return this;
        }
    }

    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_WORKOUT = "workout";
    @ColorInt
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON = "android.callPerson";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_TYPE = "android.callType";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COLORIZED = "android.colorized";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGES = "android.messages";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";
    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE = "android.picture";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS = "android.progress";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SMALL_ICON = "android.icon";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUB_TEXT = "android.subText";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEMPLATE = "android.template";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT = "android.text";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE = "android.title";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 0x1000;
    public static final int FLAG_FOREGROUND_SERVICE = 0x40;
    public static final int FLAG_GROUP_SUMMARY = 0x200;
    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 0x80;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 0x100;
    public static final int FLAG_NO_CLEAR = 0x20;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    @SuppressLint({"ActionValue"})
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    public static Action a(Notification.Action notification$Action0) {
        RemoteInput[] arr_remoteInput1;
        android.app.RemoteInput[] arr_remoteInput = r0.g(notification$Action0);
        boolean z = false;
        if(arr_remoteInput == null) {
            arr_remoteInput1 = null;
        }
        else {
            RemoteInput[] arr_remoteInput2 = new RemoteInput[arr_remoteInput.length];
            for(int v = 0; v < arr_remoteInput.length; ++v) {
                android.app.RemoteInput remoteInput0 = arr_remoteInput[v];
                arr_remoteInput2[v] = new RemoteInput(r0.h(remoteInput0), r0.f(remoteInput0), r0.b(remoteInput0), r0.a(remoteInput0), (Build.VERSION.SDK_INT < 29 ? 0 : w0.c(remoteInput0)), r0.d(remoteInput0), null);
            }
            arr_remoteInput1 = arr_remoteInput2;
        }
        int v1 = Build.VERSION.SDK_INT;
        boolean z1 = r0.c(notification$Action0).getBoolean("android.support.allowGeneratedReplies") || t0.a(notification$Action0);
        boolean z2 = r0.c(notification$Action0).getBoolean("android.support.action.showsUserInterface", true);
        int v2 = v1 < 28 ? r0.c(notification$Action0).getInt("android.support.action.semanticAction", 0) : v0.a(notification$Action0);
        boolean z3 = v1 < 29 ? false : w0.e(notification$Action0);
        if(v1 >= 0x1F) {
            z = x0.a(notification$Action0);
        }
        if(s0.a(notification$Action0) == null) {
            int v3 = notification$Action0.icon;
            if(v3 != 0) {
                return new Action(v3, notification$Action0.title, notification$Action0.actionIntent, r0.c(notification$Action0), arr_remoteInput1, null, z1, v2, z2, z3, z);
            }
        }
        return s0.a(notification$Action0) == null ? new Action(null, notification$Action0.title, notification$Action0.actionIntent, r0.c(notification$Action0), arr_remoteInput1, null, z1, v2, z2, z3, z) : new Action(IconCompat.createFromIconOrNullIfZeroResId(s0.a(notification$Action0)), notification$Action0.title, notification$Action0.actionIntent, r0.c(notification$Action0), arr_remoteInput1, null, z1, v2, z2, z3, z);
    }

    @Nullable
    public static Action getAction(@NonNull Notification notification0, int v) {
        return NotificationCompat.a(notification0.actions[v]);
    }

    public static int getActionCount(@NonNull Notification notification0) {
        return notification0.actions == null ? 0 : notification0.actions.length;
    }

    public static boolean getAllowSystemGeneratedContextualActions(@NonNull Notification notification0) {
        return Build.VERSION.SDK_INT < 29 ? false : w0.a(notification0);
    }

    public static boolean getAutoCancel(@NonNull Notification notification0) {
        return (notification0.flags & 16) != 0;
    }

    public static int getBadgeIconType(@NonNull Notification notification0) {
        return u0.a(notification0);
    }

    @Nullable
    public static BubbleMetadata getBubbleMetadata(@NonNull Notification notification0) {
        return Build.VERSION.SDK_INT < 29 ? null : BubbleMetadata.fromPlatform(w0.b(notification0));
    }

    @Nullable
    public static String getCategory(@NonNull Notification notification0) {
        return notification0.category;
    }

    @Nullable
    public static String getChannelId(@NonNull Notification notification0) {
        return u0.b(notification0);
    }

    public static int getColor(@NonNull Notification notification0) {
        return notification0.color;
    }

    @Nullable
    public static CharSequence getContentInfo(@NonNull Notification notification0) {
        return notification0.extras.getCharSequence("android.infoText");
    }

    @Nullable
    public static CharSequence getContentText(@NonNull Notification notification0) {
        return notification0.extras.getCharSequence("android.text");
    }

    @Nullable
    public static CharSequence getContentTitle(@NonNull Notification notification0) {
        return notification0.extras.getCharSequence("android.title");
    }

    @Nullable
    public static Bundle getExtras(@NonNull Notification notification0) {
        return notification0.extras;
    }

    @Nullable
    public static String getGroup(@NonNull Notification notification0) {
        return r0.e(notification0);
    }

    public static int getGroupAlertBehavior(@NonNull Notification notification0) {
        return u0.c(notification0);
    }

    @NonNull
    @RequiresApi(21)
    public static List getInvisibleActions(@NonNull Notification notification0) {
        Bundle[] arr_bundle1;
        Bundle[] arr_bundle;
        List list0 = new ArrayList();
        Bundle bundle0 = notification0.extras.getBundle("android.car.EXTENSIONS");
        if(bundle0 == null) {
            return list0;
        }
        Bundle bundle1 = bundle0.getBundle("invisible_actions");
        if(bundle1 != null) {
            for(int v = 0; v < bundle1.size(); ++v) {
                Bundle bundle2 = bundle1.getBundle(Integer.toString(v));
                Bundle bundle3 = bundle2.getBundle("extras");
                boolean z = bundle3 == null ? false : bundle3.getBoolean("android.support.allowGeneratedReplies", false);
                int v1 = bundle2.getInt("icon");
                CharSequence charSequence0 = bundle2.getCharSequence("title");
                Parcelable parcelable0 = bundle2.getParcelable("actionIntent");
                Bundle bundle4 = bundle2.getBundle("extras");
                Parcelable[] arr_parcelable = bundle2.getParcelableArray("remoteInputs");
                Class class0 = Bundle[].class;
                if(arr_parcelable instanceof Bundle[] || arr_parcelable == null) {
                    arr_bundle = (Bundle[])arr_parcelable;
                }
                else {
                    arr_bundle = (Bundle[])Arrays.copyOf(arr_parcelable, arr_parcelable.length, class0);
                    bundle2.putParcelableArray("remoteInputs", arr_bundle);
                }
                RemoteInput[] arr_remoteInput = f2.a(arr_bundle);
                Parcelable[] arr_parcelable1 = bundle2.getParcelableArray("dataOnlyRemoteInputs");
                if(arr_parcelable1 instanceof Bundle[] || arr_parcelable1 == null) {
                    arr_bundle1 = (Bundle[])arr_parcelable1;
                }
                else {
                    arr_bundle1 = (Bundle[])Arrays.copyOf(arr_parcelable1, arr_parcelable1.length, class0);
                    bundle2.putParcelableArray("dataOnlyRemoteInputs", arr_bundle1);
                }
                ((ArrayList)list0).add(new Action(v1, charSequence0, ((PendingIntent)parcelable0), bundle4, arr_remoteInput, f2.a(arr_bundle1), z, bundle2.getInt("semanticAction"), bundle2.getBoolean("showsUserInterface"), false, false));
            }
        }
        return list0;
    }

    public static boolean getLocalOnly(@NonNull Notification notification0) {
        return (notification0.flags & 0x100) != 0;
    }

    @Nullable
    public static LocusIdCompat getLocusId(@NonNull Notification notification0) {
        if(Build.VERSION.SDK_INT >= 29) {
            LocusId locusId0 = w0.d(notification0);
            return locusId0 == null ? null : LocusIdCompat.toLocusIdCompat(locusId0);
        }
        return null;
    }

    public static boolean getOngoing(@NonNull Notification notification0) {
        return (notification0.flags & 2) != 0;
    }

    public static boolean getOnlyAlertOnce(@NonNull Notification notification0) {
        return (notification0.flags & 8) != 0;
    }

    @NonNull
    public static List getPeople(@NonNull Notification notification0) {
        List list0 = new ArrayList();
        if(Build.VERSION.SDK_INT >= 28) {
            ArrayList arrayList0 = notification0.extras.getParcelableArrayList("android.people.list");
            if(arrayList0 != null && !arrayList0.isEmpty()) {
                for(Object object0: arrayList0) {
                    ((ArrayList)list0).add(Person.fromAndroidPerson(((android.app.Person)object0)));
                }
                return list0;
            }
        }
        else {
            String[] arr_s = notification0.extras.getStringArray("android.people");
            if(arr_s != null && arr_s.length != 0) {
                for(int v = 0; v < arr_s.length; ++v) {
                    String s = arr_s[v];
                    ((ArrayList)list0).add(new androidx.core.app.Person.Builder().setUri(s).build());
                }
            }
        }
        return list0;
    }

    @Nullable
    public static Notification getPublicVersion(@NonNull Notification notification0) {
        return notification0.publicVersion;
    }

    @Nullable
    public static CharSequence getSettingsText(@NonNull Notification notification0) {
        return u0.d(notification0);
    }

    @Nullable
    public static String getShortcutId(@NonNull Notification notification0) {
        return u0.e(notification0);
    }

    public static boolean getShowWhen(@NonNull Notification notification0) {
        return notification0.extras.getBoolean("android.showWhen");
    }

    @Nullable
    public static String getSortKey(@NonNull Notification notification0) {
        return r0.i(notification0);
    }

    @Nullable
    public static CharSequence getSubText(@NonNull Notification notification0) {
        return notification0.extras.getCharSequence("android.subText");
    }

    public static long getTimeoutAfter(@NonNull Notification notification0) {
        return u0.f(notification0);
    }

    public static boolean getUsesChronometer(@NonNull Notification notification0) {
        return notification0.extras.getBoolean("android.showChronometer");
    }

    public static int getVisibility(@NonNull Notification notification0) {
        return notification0.visibility;
    }

    public static boolean isGroupSummary(@NonNull Notification notification0) {
        return (notification0.flags & 0x200) != 0;
    }

    @Nullable
    public static Bitmap reduceLargeIconSize(@NonNull Context context0, @Nullable Bitmap bitmap0) {
        if(bitmap0 != null && Build.VERSION.SDK_INT < 27) {
            Resources resources0 = context0.getResources();
            int v = resources0.getDimensionPixelSize(dimen.compat_notification_large_icon_max_width);
            int v1 = resources0.getDimensionPixelSize(dimen.compat_notification_large_icon_max_height);
            if(bitmap0.getWidth() <= v && bitmap0.getHeight() <= v1) {
                return bitmap0;
            }
            double f = Math.min(((double)v) / ((double)Math.max(1, bitmap0.getWidth())), ((double)v1) / ((double)Math.max(1, bitmap0.getHeight())));
            return Bitmap.createScaledBitmap(bitmap0, ((int)Math.ceil(((double)bitmap0.getWidth()) * f)), ((int)Math.ceil(((double)bitmap0.getHeight()) * f)), true);
        }
        return bitmap0;
    }
}

