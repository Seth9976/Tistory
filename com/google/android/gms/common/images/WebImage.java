package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "WebImageCreator")
public final class WebImage extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final Uri b;
    public final int c;
    public final int d;

    static {
        WebImage.CREATOR = new zah();
    }

    public WebImage(int v, Uri uri0, int v1, int v2) {
        this.a = v;
        this.b = uri0;
        this.c = v1;
        this.d = v2;
    }

    public WebImage(@NonNull Uri uri0) throws IllegalArgumentException {
        this(uri0, 0, 0);
    }

    public WebImage(@NonNull Uri uri0, int v, int v1) throws IllegalArgumentException {
        this(1, uri0, v, v1);
        if(uri0 == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    @KeepForSdk
    public WebImage(@NonNull JSONObject jSONObject0) throws IllegalArgumentException {
        Uri uri0 = Uri.EMPTY;
        if(jSONObject0.has("url")) {
            try {
                uri0 = Uri.parse(jSONObject0.getString("url"));
            }
            catch(JSONException unused_ex) {
            }
        }
        this(uri0, jSONObject0.optInt("width", 0), jSONObject0.optInt("height", 0));
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 != null && object0 instanceof WebImage && Objects.equal(this.b, ((WebImage)object0).b) && this.c == ((WebImage)object0).c && this.d == ((WebImage)object0).d;
    }

    public int getHeight() {
        return this.d;
    }

    @NonNull
    public Uri getUrl() {
        return this.b;
    }

    public int getWidth() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.b, this.c, this.d});
    }

    @NonNull
    @KeepForSdk
    public JSONObject toJson() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("url", this.b.toString());
            jSONObject0.put("width", this.c);
            jSONObject0.put("height", this.d);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }

    @Override
    @NonNull
    public String toString() {
        return "Image " + this.c + "x" + this.d + " " + this.b.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.getUrl(), v, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.getWidth());
        SafeParcelWriter.writeInt(parcel0, 4, this.getHeight());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

