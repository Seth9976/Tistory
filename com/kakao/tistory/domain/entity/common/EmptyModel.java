package com.kakao.tistory.domain.entity.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001D\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000B\u0010\t\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\u000B\u0010\n\u001A\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000B\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\f\u001A\u00020\rHÖ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001A\u00020\rHÖ\u0001J\t\u0010\u0013\u001A\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\rHÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/domain/entity/common/EmptyModel;", "Landroid/os/Parcelable;", "title", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Parcelize
public final class EmptyModel implements Parcelable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class Creator implements Parcelable.Creator {
        @NotNull
        public final EmptyModel createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkNotNullParameter(parcel0, "parcel");
            return new EmptyModel(parcel0.readString(), parcel0.readString());
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.createFromParcel(parcel0);
        }

        @NotNull
        public final EmptyModel[] newArray(int v) {
            return new EmptyModel[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.newArray(v);
        }
    }

    @NotNull
    public static final Parcelable.Creator CREATOR;
    @Nullable
    private final String message;
    @Nullable
    private final String title;

    static {
        EmptyModel.CREATOR = new Creator();
    }

    public EmptyModel() {
        this(null, null, 3, null);
    }

    public EmptyModel(@Nullable String s, @Nullable String s1) {
        this.title = s;
        this.message = s1;
    }

    public EmptyModel(String s, String s1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        this(s, s1);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.message;
    }

    @NotNull
    public final EmptyModel copy(@Nullable String s, @Nullable String s1) {
        return new EmptyModel(s, s1);
    }

    public static EmptyModel copy$default(EmptyModel emptyModel0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = emptyModel0.title;
        }
        if((v & 2) != 0) {
            s1 = emptyModel0.message;
        }
        return emptyModel0.copy(s, s1);
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
        if(!(object0 instanceof EmptyModel)) {
            return false;
        }
        return Intrinsics.areEqual(this.title, ((EmptyModel)object0).title) ? Intrinsics.areEqual(this.message, ((EmptyModel)object0).message) : false;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.title == null ? 0 : this.title.hashCode();
        String s = this.message;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "EmptyModel(title=" + this.title + ", message=" + this.message + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkNotNullParameter(parcel0, "out");
        parcel0.writeString(this.title);
        parcel0.writeString(this.message);
    }
}

