package com.kakao.tistory.presentation.screen.item;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.main.contract.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\b\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0012\u0010\u000F\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0012\u0010\u0011\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u000EJ\u0012\u0010\u0012\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0014JR\u0010\u0016\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\bH\u00C6\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u0018\u0010\u000EJ\u0010\u0010\u001A\u001A\u00020\u0019H\u00D6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001E\u001A\u00020\b2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CH\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0019H\u00D6\u0001\u00A2\u0006\u0004\b \u0010\u001BJ \u0010%\u001A\u00020$2\u0006\u0010\"\u001A\u00020!2\u0006\u0010#\u001A\u00020\u0019H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u000ER\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010\u0010R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b-\u0010(\u001A\u0004\b.\u0010\u000ER\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b/\u0010+\u001A\u0004\b0\u0010\u0010R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b\t\u0010\u0014R\u0017\u0010\n\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b3\u00102\u001A\u0004\b4\u0010\u0014\u00A8\u00065"}, d2 = {"Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;", "Landroid/os/Parcelable;", "", "blogName", "", "blogId", "blogRole", "commentId", "", "isBlocked", "allowWriteOnGuestbook", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "component4", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;ZZ)Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getBlogName", "b", "Ljava/lang/Long;", "getBlogId", "c", "getBlogRole", "d", "getCommentId", "e", "Z", "f", "getAllowWriteOnGuestbook", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Parcelize
public final class GuestbookExtra implements Parcelable {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class Creator implements Parcelable.Creator {
        @NotNull
        public final GuestbookExtra createFromParcel(@NotNull Parcel parcel0) {
            Intrinsics.checkNotNullParameter(parcel0, "parcel");
            String s = parcel0.readString();
            Long long0 = parcel0.readInt() == 0 ? null : parcel0.readLong();
            String s1 = parcel0.readString();
            Long long1 = parcel0.readInt() == 0 ? null : parcel0.readLong();
            boolean z = true;
            boolean z1 = parcel0.readInt() != 0;
            if(parcel0.readInt() == 0) {
                z = false;
            }
            return new GuestbookExtra(s, long0, s1, long1, z1, z);
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.createFromParcel(parcel0);
        }

        @NotNull
        public final GuestbookExtra[] newArray(int v) {
            return new GuestbookExtra[v];
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
    public final Long b;
    public final String c;
    public final Long d;
    public final boolean e;
    public final boolean f;

    static {
        GuestbookExtra.CREATOR = new Creator();
    }

    public GuestbookExtra(@NotNull String s, @Nullable Long long0, @Nullable String s1, @Nullable Long long1, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        super();
        this.a = s;
        this.b = long0;
        this.c = s1;
        this.d = long1;
        this.e = z;
        this.f = z1;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @Nullable
    public final Long component2() {
        return this.b;
    }

    @Nullable
    public final String component3() {
        return this.c;
    }

    @Nullable
    public final Long component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.f;
    }

    @NotNull
    public final GuestbookExtra copy(@NotNull String s, @Nullable Long long0, @Nullable String s1, @Nullable Long long1, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        return new GuestbookExtra(s, long0, s1, long1, z, z1);
    }

    public static GuestbookExtra copy$default(GuestbookExtra guestbookExtra0, String s, Long long0, String s1, Long long1, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            s = guestbookExtra0.a;
        }
        if((v & 2) != 0) {
            long0 = guestbookExtra0.b;
        }
        if((v & 4) != 0) {
            s1 = guestbookExtra0.c;
        }
        if((v & 8) != 0) {
            long1 = guestbookExtra0.d;
        }
        if((v & 16) != 0) {
            z = guestbookExtra0.e;
        }
        if((v & 0x20) != 0) {
            z1 = guestbookExtra0.f;
        }
        return guestbookExtra0.copy(s, long0, s1, long1, z, z1);
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
        if(!(object0 instanceof GuestbookExtra)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((GuestbookExtra)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((GuestbookExtra)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((GuestbookExtra)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((GuestbookExtra)object0).d)) {
            return false;
        }
        return this.e == ((GuestbookExtra)object0).e ? this.f == ((GuestbookExtra)object0).f : false;
    }

    public final boolean getAllowWriteOnGuestbook() {
        return this.f;
    }

    @Nullable
    public final Long getBlogId() {
        return this.b;
    }

    @NotNull
    public final String getBlogName() {
        return this.a;
    }

    @Nullable
    public final String getBlogRole() {
        return this.c;
    }

    @Nullable
    public final Long getCommentId() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Long long0 = this.d;
        if(long0 != null) {
            v1 = long0.hashCode();
        }
        return Boolean.hashCode(this.f) + c.a(this.e, (((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F, 0x1F);
    }

    public final boolean isBlocked() {
        return this.e;
    }

    @Override
    @NotNull
    public String toString() {
        return "GuestbookExtra(blogName=" + this.a + ", blogId=" + this.b + ", blogRole=" + this.c + ", commentId=" + this.d + ", isBlocked=" + this.e + ", allowWriteOnGuestbook=" + this.f + ")";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkNotNullParameter(parcel0, "out");
        parcel0.writeString(this.a);
        Long long0 = this.b;
        if(long0 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeLong(((long)long0));
        }
        parcel0.writeString(this.c);
        Long long1 = this.d;
        if(long1 == null) {
            parcel0.writeInt(0);
        }
        else {
            parcel0.writeInt(1);
            parcel0.writeLong(((long)long1));
        }
        parcel0.writeInt(((int)this.e));
        parcel0.writeInt(((int)this.f));
    }
}

