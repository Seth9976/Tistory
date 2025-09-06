package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map.Entry;
import java.util.Map;

@Class(creator = "RemoteMessageCreator")
@Reserved({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    public static class Builder {
        public final Bundle a;
        public final ArrayMap b;

        public Builder(@NonNull String s) {
            Bundle bundle0 = new Bundle();
            this.a = bundle0;
            this.b = new ArrayMap();
            if(TextUtils.isEmpty(s)) {
                throw new IllegalArgumentException("Invalid to: " + s);
            }
            bundle0.putString("google.to", s);
        }

        @NonNull
        public Builder addData(@NonNull String s, @Nullable String s1) {
            this.b.put(s, s1);
            return this;
        }

        @NonNull
        public RemoteMessage build() {
            Bundle bundle0 = new Bundle();
            for(Object object0: this.b.entrySet()) {
                bundle0.putString(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            bundle0.putAll(this.a);
            this.a.remove("from");
            return new RemoteMessage(bundle0);
        }

        @NonNull
        public Builder clearData() {
            this.b.clear();
            return this;
        }

        @Nullable
        public String getCollapseKey() {
            return this.a.getString("message_type");
        }

        @NonNull
        public Map getData() {
            return this.b;
        }

        @NonNull
        public String getMessageId() {
            return this.a.getString("google.message_id", "");
        }

        @Nullable
        public String getMessageType() {
            return this.a.getString("message_type");
        }

        @IntRange(from = 0L, to = 86400L)
        public int getTtl() {
            return Integer.parseInt(this.a.getString("message_type", "0"));
        }

        @NonNull
        public Builder setCollapseKey(@Nullable String s) {
            this.a.putString("collapse_key", s);
            return this;
        }

        @NonNull
        public Builder setData(@NonNull Map map0) {
            this.b.clear();
            this.b.putAll(map0);
            return this;
        }

        @NonNull
        public Builder setMessageId(@NonNull String s) {
            this.a.putString("google.message_id", s);
            return this;
        }

        @NonNull
        public Builder setMessageType(@Nullable String s) {
            this.a.putString("message_type", s);
            return this;
        }

        @NonNull
        @ShowFirstParty
        public Builder setRawData(byte[] arr_b) {
            this.a.putByteArray("rawData", arr_b);
            return this;
        }

        @NonNull
        public Builder setTtl(@IntRange(from = 0L, to = 86400L) int v) {
            this.a.putString("google.ttl", String.valueOf(v));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public static class Notification {
        public final String a;
        public final String b;
        public final String[] c;
        public final String d;
        public final String e;
        public final String[] f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final Uri n;
        public final String o;
        public final Integer p;
        public final Integer q;
        public final Integer r;
        public final int[] s;
        public final Long t;
        public final boolean u;
        public final boolean v;
        public final boolean w;
        public final boolean x;
        public final boolean y;
        public final long[] z;

        public Notification(NotificationParams notificationParams0) {
            String[] arr_s1;
            this.a = notificationParams0.getString("gcm.n.title");
            this.b = notificationParams0.getLocalizationResourceForKey("gcm.n.title");
            Object[] arr_object = notificationParams0.getLocalizationArgsForKey("gcm.n.title");
            String[] arr_s = null;
            if(arr_object == null) {
                arr_s1 = null;
            }
            else {
                arr_s1 = new String[arr_object.length];
                for(int v1 = 0; v1 < arr_object.length; ++v1) {
                    arr_s1[v1] = String.valueOf(arr_object[v1]);
                }
            }
            this.c = arr_s1;
            this.d = notificationParams0.getString("gcm.n.body");
            this.e = notificationParams0.getLocalizationResourceForKey("gcm.n.body");
            Object[] arr_object1 = notificationParams0.getLocalizationArgsForKey("gcm.n.body");
            if(arr_object1 != null) {
                arr_s = new String[arr_object1.length];
                for(int v = 0; v < arr_object1.length; ++v) {
                    arr_s[v] = String.valueOf(arr_object1[v]);
                }
            }
            this.f = arr_s;
            this.g = notificationParams0.getString("gcm.n.icon");
            this.i = notificationParams0.getSoundResourceName();
            this.j = notificationParams0.getString("gcm.n.tag");
            this.k = notificationParams0.getString("gcm.n.color");
            this.l = notificationParams0.getString("gcm.n.click_action");
            this.m = notificationParams0.getString("gcm.n.android_channel_id");
            this.n = notificationParams0.getLink();
            this.h = notificationParams0.getString("gcm.n.image");
            this.o = notificationParams0.getString("gcm.n.ticker");
            this.p = notificationParams0.getInteger("gcm.n.notification_priority");
            this.q = notificationParams0.getInteger("gcm.n.visibility");
            this.r = notificationParams0.getInteger("gcm.n.notification_count");
            this.u = notificationParams0.getBoolean("gcm.n.sticky");
            this.v = notificationParams0.getBoolean("gcm.n.local_only");
            this.w = notificationParams0.getBoolean("gcm.n.default_sound");
            this.x = notificationParams0.getBoolean("gcm.n.default_vibrate_timings");
            this.y = notificationParams0.getBoolean("gcm.n.default_light_settings");
            this.t = notificationParams0.getLong("gcm.n.event_time");
            this.s = notificationParams0.a();
            this.z = notificationParams0.getVibrateTimings();
        }

        @Nullable
        public String getBody() {
            return this.d;
        }

        @Nullable
        public String[] getBodyLocalizationArgs() {
            return this.f;
        }

        @Nullable
        public String getBodyLocalizationKey() {
            return this.e;
        }

        @Nullable
        public String getChannelId() {
            return this.m;
        }

        @Nullable
        public String getClickAction() {
            return this.l;
        }

        @Nullable
        public String getColor() {
            return this.k;
        }

        public boolean getDefaultLightSettings() {
            return this.y;
        }

        public boolean getDefaultSound() {
            return this.w;
        }

        public boolean getDefaultVibrateSettings() {
            return this.x;
        }

        @Nullable
        public Long getEventTime() {
            return this.t;
        }

        @Nullable
        public String getIcon() {
            return this.g;
        }

        @Nullable
        public Uri getImageUrl() {
            return this.h == null ? null : Uri.parse(this.h);
        }

        @Nullable
        public int[] getLightSettings() {
            return this.s;
        }

        @Nullable
        public Uri getLink() {
            return this.n;
        }

        public boolean getLocalOnly() {
            return this.v;
        }

        @Nullable
        public Integer getNotificationCount() {
            return this.r;
        }

        @Nullable
        public Integer getNotificationPriority() {
            return this.p;
        }

        @Nullable
        public String getSound() {
            return this.i;
        }

        public boolean getSticky() {
            return this.u;
        }

        @Nullable
        public String getTag() {
            return this.j;
        }

        @Nullable
        public String getTicker() {
            return this.o;
        }

        @Nullable
        public String getTitle() {
            return this.a;
        }

        @Nullable
        public String[] getTitleLocalizationArgs() {
            return this.c;
        }

        @Nullable
        public String getTitleLocalizationKey() {
            return this.b;
        }

        @Nullable
        public long[] getVibrateTimings() {
            return this.z;
        }

        @Nullable
        public Integer getVisibility() {
            return this.q;
        }
    }

    public static final Parcelable.Creator CREATOR = null;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN;
    public final Bundle a;
    public ArrayMap b;
    public Notification c;

    static {
        RemoteMessage.CREATOR = new RemoteMessageCreator();
    }

    @Constructor
    public RemoteMessage(@Param(id = 2) Bundle bundle0) {
        this.a = bundle0;
    }

    @Nullable
    public String getCollapseKey() {
        return this.a.getString("collapse_key");
    }

    @NonNull
    public Map getData() {
        if(this.b == null) {
            this.b = MessagePayloadKeys.extractDeveloperDefinedPayload(this.a);
        }
        return this.b;
    }

    @Nullable
    public String getFrom() {
        return this.a.getString("from");
    }

    @Nullable
    public String getMessageId() {
        String s = this.a.getString("google.message_id");
        return s == null ? this.a.getString("message_id") : s;
    }

    @Nullable
    public String getMessageType() {
        return this.a.getString("message_type");
    }

    @Nullable
    public Notification getNotification() {
        if(this.c == null) {
            Bundle bundle0 = this.a;
            if(NotificationParams.isNotification(bundle0)) {
                this.c = new Notification(new NotificationParams(bundle0));
            }
        }
        return this.c;
    }

    public int getOriginalPriority() {
        Bundle bundle0 = this.a;
        String s = bundle0.getString("google.original_priority");
        if(s == null) {
            s = bundle0.getString("google.priority");
        }
        if("high".equals(s)) {
            return 1;
        }
        return "normal".equals(s) ? 2 : 0;
    }

    public int getPriority() {
        Bundle bundle0 = this.a;
        String s = bundle0.getString("google.delivered_priority");
        if(s == null) {
            if("1".equals(bundle0.getString("google.priority_reduced"))) {
                return 2;
            }
            s = bundle0.getString("google.priority");
        }
        if("high".equals(s)) {
            return 1;
        }
        return "normal".equals(s) ? 2 : 0;
    }

    @Nullable
    @ShowFirstParty
    public byte[] getRawData() {
        return this.a.getByteArray("rawData");
    }

    @Nullable
    public String getSenderId() {
        return this.a.getString("google.c.sender.id");
    }

    public long getSentTime() {
        Object object0 = this.a.get("google.sent_time");
        if(object0 instanceof Long) {
            return (long)(((Long)object0));
        }
        if(object0 instanceof String) {
            try {
                return Long.parseLong(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
                Log.w("FirebaseMessaging", "Invalid sent time: " + object0);
            }
        }
        return 0L;
    }

    @Nullable
    public String getTo() {
        return this.a.getString("google.to");
    }

    public int getTtl() {
        Object object0 = this.a.get("google.ttl");
        if(object0 instanceof Integer) {
            return (int)(((Integer)object0));
        }
        if(object0 instanceof String) {
            try {
                return Integer.parseInt(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + object0);
            }
        }
        return 0;
    }

    @KeepForSdk
    public Intent toIntent() {
        Intent intent0 = new Intent();
        intent0.putExtras(this.a);
        return intent0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBundle(parcel0, 2, this.a, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

