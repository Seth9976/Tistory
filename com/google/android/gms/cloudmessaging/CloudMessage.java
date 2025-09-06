package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

@Class(creator = "CloudMessageCreator")
public final class CloudMessage extends AbstractSafeParcelable {
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    public @interface MessagePriority {
    }

    @NonNull
    public static final Parcelable.Creator CREATOR = null;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN;
    public final Intent a;
    public ArrayMap b;

    static {
        CloudMessage.CREATOR = new zza();
    }

    @Constructor
    public CloudMessage(@NonNull @Param(id = 1) Intent intent0) {
        this.a = intent0;
    }

    @Nullable
    public String getCollapseKey() {
        return this.a.getStringExtra("collapse_key");
    }

    @NonNull
    public Map getData() {
        synchronized(this) {
            if(this.b == null) {
                Bundle bundle0 = this.a.getExtras();
                ArrayMap arrayMap0 = new ArrayMap();
                if(bundle0 != null) {
                    for(Object object0: bundle0.keySet()) {
                        String s = (String)object0;
                        Object object1 = bundle0.get(s);
                        if(object1 instanceof String && !s.startsWith("google.") && !s.equals("from") && !s.equals("message_type") && !s.equals("collapse_key")) {
                            arrayMap0.put(s, ((String)object1));
                        }
                    }
                }
                this.b = arrayMap0;
            }
            return this.b;
        }
    }

    @Nullable
    public String getFrom() {
        return this.a.getStringExtra("from");
    }

    @NonNull
    public Intent getIntent() {
        return this.a;
    }

    @Nullable
    public String getMessageId() {
        String s = this.a.getStringExtra("google.message_id");
        return s == null ? this.a.getStringExtra("message_id") : s;
    }

    @Nullable
    public String getMessageType() {
        return this.a.getStringExtra("message_type");
    }

    public int getOriginalPriority() {
        Intent intent0 = this.a;
        String s = intent0.getStringExtra("google.original_priority");
        if(s == null) {
            s = intent0.getStringExtra("google.priority");
        }
        if("high".equals(s)) {
            return 1;
        }
        return "normal".equals(s) ? 2 : 0;
    }

    public int getPriority() {
        Intent intent0 = this.a;
        String s = intent0.getStringExtra("google.delivered_priority");
        if(s == null) {
            if("1".equals(intent0.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            s = intent0.getStringExtra("google.priority");
        }
        if("high".equals(s)) {
            return 1;
        }
        return "normal".equals(s) ? 2 : 0;
    }

    @Nullable
    public byte[] getRawData() {
        return this.a.getByteArrayExtra("rawData");
    }

    @Nullable
    public String getSenderId() {
        return this.a.getStringExtra("google.c.sender.id");
    }

    public long getSentTime() {
        Bundle bundle0 = this.a.getExtras();
        Object object0 = bundle0 == null ? null : bundle0.get("google.sent_time");
        if(object0 instanceof Long) {
            return (long)(((Long)object0));
        }
        if(object0 instanceof String) {
            try {
                return Long.parseLong(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
                Log.w("CloudMessage", "Invalid sent time: " + object0);
            }
        }
        return 0L;
    }

    @Nullable
    public String getTo() {
        return this.a.getStringExtra("google.to");
    }

    public int getTtl() {
        Bundle bundle0 = this.a.getExtras();
        Object object0 = bundle0 == null ? null : bundle0.get("google.ttl");
        if(object0 instanceof Integer) {
            return (int)(((Integer)object0));
        }
        if(object0 instanceof String) {
            try {
                return Integer.parseInt(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
                Log.w("CloudMessage", "Invalid TTL: " + object0);
            }
        }
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.a, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

