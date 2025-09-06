package com.kakao.tistory.presentation.viewmodel;

import a5.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.common.graph.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0010\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u000EJ\u0010\u0010\u0012\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u000EJ\u0012\u0010\u0013\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u000EJ\u0010\u0010\u0014\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\tH\u00C6\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0018\u0010\u000EJ\u0010\u0010\u001A\u001A\u00020\u0019H\u00D6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001E\u001A\u00020\t2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CH\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0019H\u00D6\u0001\u00A2\u0006\u0004\b \u0010\u001BJ \u0010%\u001A\u00020$2\u0006\u0010\"\u001A\u00020!2\u0006\u0010#\u001A\u00020\u0019H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u000ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b*\u0010(\u001A\u0004\b+\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010(\u001A\u0004\b-\u0010\u000ER\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b.\u0010(\u001A\u0004\b/\u0010\u000ER\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b0\u0010(\u001A\u0004\b1\u0010\u000ER\u0019\u0010\b\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b2\u0010(\u001A\u0004\b3\u0010\u000ER\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b\n\u0010\u0015\u00A8\u00066"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/BlogTopReportData;", "Landroid/os/Parcelable;", "", "userKey", "userName", "nickname", "description", "imageUrl", "viewUrl", "", "isFlash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/kakao/tistory/presentation/viewmodel/BlogTopReportData;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getUserKey", "b", "getUserName", "c", "getNickname", "d", "getDescription", "e", "getImageUrl", "f", "getViewUrl", "g", "Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Parcelize
public final class BlogTopReportData implements Parcelable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class Creator implements Parcelable.Creator {
        @NotNull
        public final BlogTopReportData createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkNotNullParameter(parcel0, "parcel");
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            String s2 = parcel0.readString();
            String s3 = parcel0.readString();
            String s4 = parcel0.readString();
            String s5 = parcel0.readString();
            return parcel0.readInt() == 0 ? new BlogTopReportData(s, s1, s2, s3, s4, s5, false) : new BlogTopReportData(s, s1, s2, s3, s4, s5, true);
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.createFromParcel(parcel0);
        }

        @NotNull
        public final BlogTopReportData[] newArray(int v) {
            return new BlogTopReportData[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.newArray(v);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    static {
        BlogTopReportData.CREATOR = new Creator();
    }

    public BlogTopReportData(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull String s4, @Nullable String s5, boolean z) {
        Intrinsics.checkNotNullParameter(s, "userKey");
        Intrinsics.checkNotNullParameter(s1, "userName");
        Intrinsics.checkNotNullParameter(s2, "nickname");
        Intrinsics.checkNotNullParameter(s3, "description");
        Intrinsics.checkNotNullParameter(s4, "imageUrl");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = z;
    }

    public BlogTopReportData(String s, String s1, String s2, String s3, String s4, String s5, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, s1, s2, s3, s4, s5, ((v & 0x40) == 0 ? z : false));
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final String component4() {
        return this.d;
    }

    @NotNull
    public final String component5() {
        return this.e;
    }

    @Nullable
    public final String component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    @NotNull
    public final BlogTopReportData copy(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull String s4, @Nullable String s5, boolean z) {
        Intrinsics.checkNotNullParameter(s, "userKey");
        Intrinsics.checkNotNullParameter(s1, "userName");
        Intrinsics.checkNotNullParameter(s2, "nickname");
        Intrinsics.checkNotNullParameter(s3, "description");
        Intrinsics.checkNotNullParameter(s4, "imageUrl");
        return new BlogTopReportData(s, s1, s2, s3, s4, s5, z);
    }

    public static BlogTopReportData copy$default(BlogTopReportData blogTopReportData0, String s, String s1, String s2, String s3, String s4, String s5, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            s = blogTopReportData0.a;
        }
        if((v & 2) != 0) {
            s1 = blogTopReportData0.b;
        }
        if((v & 4) != 0) {
            s2 = blogTopReportData0.c;
        }
        if((v & 8) != 0) {
            s3 = blogTopReportData0.d;
        }
        if((v & 16) != 0) {
            s4 = blogTopReportData0.e;
        }
        if((v & 0x20) != 0) {
            s5 = blogTopReportData0.f;
        }
        if((v & 0x40) != 0) {
            z = blogTopReportData0.g;
        }
        return blogTopReportData0.copy(s, s1, s2, s3, s4, s5, z);
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
        if(!(object0 instanceof BlogTopReportData)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((BlogTopReportData)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((BlogTopReportData)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((BlogTopReportData)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((BlogTopReportData)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((BlogTopReportData)object0).e)) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((BlogTopReportData)object0).f) ? this.g == ((BlogTopReportData)object0).g : false;
    }

    @NotNull
    public final String getDescription() {
        return this.d;
    }

    @NotNull
    public final String getImageUrl() {
        return this.e;
    }

    @NotNull
    public final String getNickname() {
        return this.c;
    }

    @NotNull
    public final String getUserKey() {
        return this.a;
    }

    @NotNull
    public final String getUserName() {
        return this.b;
    }

    @Nullable
    public final String getViewUrl() {
        return this.f;
    }

    @Override
    public int hashCode() {
        int v = a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
        return this.f == null ? Boolean.hashCode(this.g) + v * 0x1F : Boolean.hashCode(this.g) + (v + this.f.hashCode()) * 0x1F;
    }

    public final boolean isFlash() {
        return this.g;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = b.w("BlogTopReportData(userKey=", this.a, ", userName=", this.b, ", nickname=");
        androidx.room.a.w(stringBuilder0, this.c, ", description=", this.d, ", imageUrl=");
        androidx.room.a.w(stringBuilder0, this.e, ", viewUrl=", this.f, ", isFlash=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkNotNullParameter(parcel0, "out");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        parcel0.writeString(this.d);
        parcel0.writeString(this.e);
        parcel0.writeString(this.f);
        parcel0.writeInt(((int)this.g));
    }
}

