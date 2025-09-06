package com.kakao.tistory.domain.entity;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\t\u0010\f\u001A\u00020\rHÖ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001A\u00020\rHÖ\u0001J\t\u0010\u0013\u001A\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/domain/entity/TopCategory;", "Landroid/os/Parcelable;", "label", "", "link", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getLink", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Parcelize
public final class TopCategory implements Parcelable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class Creator implements Parcelable.Creator {
        @NotNull
        public final TopCategory createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkNotNullParameter(parcel0, "parcel");
            return new TopCategory(parcel0.readString(), parcel0.readString());
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.createFromParcel(parcel0);
        }

        @NotNull
        public final TopCategory[] newArray(int v) {
            return new TopCategory[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.newArray(v);
        }
    }

    @NotNull
    public static final Parcelable.Creator CREATOR;
    @NotNull
    private final String label;
    @NotNull
    private final String link;

    static {
        TopCategory.CREATOR = new Creator();
    }

    public TopCategory(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "label");
        Intrinsics.checkNotNullParameter(s1, "link");
        super();
        this.label = s;
        this.link = s1;
    }

    @NotNull
    public final String component1() {
        return this.label;
    }

    @NotNull
    public final String component2() {
        return this.link;
    }

    @NotNull
    public final TopCategory copy(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "label");
        Intrinsics.checkNotNullParameter(s1, "link");
        return new TopCategory(s, s1);
    }

    public static TopCategory copy$default(TopCategory topCategory0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = topCategory0.label;
        }
        if((v & 2) != 0) {
            s1 = topCategory0.link;
        }
        return topCategory0.copy(s, s1);
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
        if(!(object0 instanceof TopCategory)) {
            return false;
        }
        return Intrinsics.areEqual(this.label, ((TopCategory)object0).label) ? Intrinsics.areEqual(this.link, ((TopCategory)object0).link) : false;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @Override
    public int hashCode() {
        return this.link.hashCode() + this.label.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "TopCategory(label=" + this.label + ", link=" + this.link + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkNotNullParameter(parcel0, "out");
        parcel0.writeString(this.label);
        parcel0.writeString(this.link);
    }
}

