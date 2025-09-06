package com.kakao.tistory.domain.entity;

import a5.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000B\u0010\r\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000E\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001A\u00020\u0003HÖ\u0001J\u0019\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u0013HÖ\u0001R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u001F"}, d2 = {"Lcom/kakao/tistory/domain/entity/Thumbnail;", "Landroid/os/Parcelable;", "origin", "", "small", "medium", "large", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLarge", "()Ljava/lang/String;", "getMedium", "getOrigin", "getSmall", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Parcelize
public final class Thumbnail implements Parcelable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class Creator implements Parcelable.Creator {
        @NotNull
        public final Thumbnail createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkNotNullParameter(parcel0, "parcel");
            return new Thumbnail(parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString());
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.createFromParcel(parcel0);
        }

        @NotNull
        public final Thumbnail[] newArray(int v) {
            return new Thumbnail[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.newArray(v);
        }
    }

    @NotNull
    public static final Parcelable.Creator CREATOR;
    @Nullable
    private final String large;
    @Nullable
    private final String medium;
    @Nullable
    private final String origin;
    @Nullable
    private final String small;

    static {
        Thumbnail.CREATOR = new Creator();
    }

    public Thumbnail() {
        this(null, null, null, null, 15, null);
    }

    public Thumbnail(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
        this.origin = s;
        this.small = s1;
        this.medium = s2;
        this.large = s3;
    }

    public Thumbnail(String s, String s1, String s2, String s3, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        if((v & 8) != 0) {
            s3 = null;
        }
        this(s, s1, s2, s3);
    }

    @Nullable
    public final String component1() {
        return this.origin;
    }

    @Nullable
    public final String component2() {
        return this.small;
    }

    @Nullable
    public final String component3() {
        return this.medium;
    }

    @Nullable
    public final String component4() {
        return this.large;
    }

    @NotNull
    public final Thumbnail copy(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
        return new Thumbnail(s, s1, s2, s3);
    }

    public static Thumbnail copy$default(Thumbnail thumbnail0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = thumbnail0.origin;
        }
        if((v & 2) != 0) {
            s1 = thumbnail0.small;
        }
        if((v & 4) != 0) {
            s2 = thumbnail0.medium;
        }
        if((v & 8) != 0) {
            s3 = thumbnail0.large;
        }
        return thumbnail0.copy(s, s1, s2, s3);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Thumbnail)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.origin, ((Thumbnail)object0).origin)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.small, ((Thumbnail)object0).small)) {
            return false;
        }
        return Intrinsics.areEqual(this.medium, ((Thumbnail)object0).medium) ? Intrinsics.areEqual(this.large, ((Thumbnail)object0).large) : false;
    }

    @Nullable
    public final String getLarge() {
        return this.large;
    }

    @Nullable
    public final String getMedium() {
        return this.medium;
    }

    @Nullable
    public final String getOrigin() {
        return this.origin;
    }

    @Nullable
    public final String getSmall() {
        return this.small;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.origin == null ? 0 : this.origin.hashCode();
        int v2 = this.small == null ? 0 : this.small.hashCode();
        int v3 = this.medium == null ? 0 : this.medium.hashCode();
        String s = this.large;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return b.r(b.w("Thumbnail(origin=", this.origin, ", small=", this.small, ", medium="), this.medium, ", large=", this.large, ")");
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkNotNullParameter(parcel0, "out");
        parcel0.writeString(this.origin);
        parcel0.writeString(this.small);
        parcel0.writeString(this.medium);
        parcel0.writeString(this.large);
    }
}

