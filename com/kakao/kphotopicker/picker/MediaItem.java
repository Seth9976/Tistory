package com.kakao.kphotopicker.picker;

import a5.b;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import kotlin.text.q;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u001B\u001CJ\u000F\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0005\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0004R\u001A\u0010\u000B\u001A\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\nR\u001A\u0010\u000E\u001A\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001A\u0004\b\r\u0010\nR\u001A\u0010\u0011\u001A\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000F\u0010\b\u001A\u0004\b\u0010\u0010\nR\u001A\u0010\u0017\u001A\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001A\u0010\u001A\u001A\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\b\u001A\u0004\b\u0019\u0010\n\u0082\u0001\u0002\u001D\u001E¨\u0006\u001F"}, d2 = {"Lcom/kakao/kphotopicker/picker/MediaItem;", "Landroid/os/Parcelable;", "", "src", "()Ljava/lang/String;", "mimeType", "", "a", "J", "getId", "()J", "id", "b", "getDateModified", "dateModified", "c", "getDataTaken", "dataTaken", "", "d", "I", "getOrientation", "()I", "orientation", "e", "getBucketId", "bucketId", "Photo", "Video", "Lcom/kakao/kphotopicker/picker/MediaItem$Photo;", "Lcom/kakao/kphotopicker/picker/MediaItem$Video;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class MediaItem implements Parcelable {
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\u0006\u0010\n\u001A\u00020\u0003\u0012\u0006\u0010\u000B\u001A\u00020\u0003\u0012\u0006\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000E\u001A\u00020\u0003\u0012\u0006\u0010\u000F\u001A\u00020\f\u0012\u0006\u0010\u0010\u001A\u00020\f\u0012\u0006\u0010\u0011\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0019J\u0010\u0010\u001D\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u0019J\u0012\u0010\u001E\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u0019J\u0010\u0010\u001F\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u0019J\u0010\u0010 \u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001BJ\u0010\u0010!\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001BJ\u0010\u0010\"\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010\u001BJ\u0010\u0010%\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010#J\u0010\u0010&\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010#J\u0010\u0010\'\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010\u001BJ\u008A\u0001\u0010(\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00032\b\b\u0002\u0010\u000B\u001A\u00020\u00032\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\u00032\b\b\u0002\u0010\u000F\u001A\u00020\f2\b\b\u0002\u0010\u0010\u001A\u00020\f2\b\b\u0002\u0010\u0011\u001A\u00020\u0003H\u00C6\u0001\u00A2\u0006\u0004\b(\u0010)J\u0010\u0010*\u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001A\u00020\fH\u00D6\u0001\u00A2\u0006\u0004\b+\u0010#J\u001A\u0010.\u001A\u00020\u00142\b\u0010-\u001A\u0004\u0018\u00010,H\u00D6\u0003\u00A2\u0006\u0004\b.\u0010/J\u0010\u00100\u001A\u00020\fH\u00D6\u0001\u00A2\u0006\u0004\b0\u0010#J \u00105\u001A\u0002042\u0006\u00102\u001A\u0002012\u0006\u00103\u001A\u00020\fH\u00D6\u0001\u00A2\u0006\u0004\b5\u00106R\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\u001BR\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010\u0019R\u0017\u0010\u0007\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b=\u0010;\u001A\u0004\b>\u0010\u0019R$\u0010\b\u001A\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b?\u0010;\u001A\u0004\b@\u0010\u0019\"\u0004\bA\u0010BR\"\u0010\t\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bC\u0010;\u001A\u0004\bD\u0010\u0019\"\u0004\bE\u0010BR\u001A\u0010\n\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bF\u00108\u001A\u0004\bG\u0010\u001BR\u001A\u0010\u000B\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bH\u00108\u001A\u0004\bI\u0010\u001BR\"\u0010\r\u001A\u00020\f8\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010#\"\u0004\bM\u0010NR\u0017\u0010\u000E\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\bO\u00108\u001A\u0004\bP\u0010\u001BR\"\u0010\u000F\u001A\u00020\f8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bQ\u0010K\u001A\u0004\bR\u0010#\"\u0004\bS\u0010NR\"\u0010\u0010\u001A\u00020\f8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bT\u0010K\u001A\u0004\bU\u0010#\"\u0004\bV\u0010NR\u001A\u0010\u0011\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bW\u00108\u001A\u0004\bX\u0010\u001B\u00A8\u0006Y"}, d2 = {"Lcom/kakao/kphotopicker/picker/MediaItem$Photo;", "Lcom/kakao/kphotopicker/picker/MediaItem;", "Landroid/os/Parcelable;", "", "id", "", "data", "uri", "editedPath", "mimeType", "dateModified", "dataTaken", "", "orientation", "fileSize", "width", "height", "bucketId", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIJIIJ)V", "", "isGif", "()Z", "isEdited", "output", "()Ljava/lang/String;", "component1", "()J", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()I", "component9", "component10", "component11", "component12", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIJIIJ)Lcom/kakao/kphotopicker/picker/MediaItem$Photo;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "f", "J", "getId", "g", "Ljava/lang/String;", "getData", "h", "getUri", "i", "getEditedPath", "setEditedPath", "(Ljava/lang/String;)V", "j", "getMimeType", "setMimeType", "k", "getDateModified", "l", "getDataTaken", "m", "I", "getOrientation", "setOrientation", "(I)V", "n", "getFileSize", "o", "getWidth", "setWidth", "p", "getHeight", "setHeight", "q", "getBucketId", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Parcelize
    public static final class Photo extends MediaItem implements Parcelable {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class Creator implements Parcelable.Creator {
            @NotNull
            public final Photo createFromParcel(@NotNull Parcel parcel0) {
                Intrinsics.checkNotNullParameter(parcel0, "parcel");
                return new Photo(parcel0.readLong(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readLong(), parcel0.readLong(), parcel0.readInt(), parcel0.readLong(), parcel0.readInt(), parcel0.readInt(), parcel0.readLong());
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            @NotNull
            public final Photo[] newArray(int v) {
                return new Photo[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        }

        @NotNull
        public static final Parcelable.Creator CREATOR;
        public final long f;
        public final String g;
        public final String h;
        public String i;
        public String j;
        public final long k;
        public final long l;
        public int m;
        public final long n;
        public int o;
        public int p;
        public final long q;

        static {
            Photo.CREATOR = new Creator();
        }

        public Photo(long v, @NotNull String s, @NotNull String s1, @Nullable String s2, @NotNull String s3, long v1, long v2, int v3, long v4, int v5, int v6, long v7) {
            Intrinsics.checkNotNullParameter(s, "data");
            Intrinsics.checkNotNullParameter(s1, "uri");
            Intrinsics.checkNotNullParameter(s3, "mimeType");
            super(v, v1, v2, v3, v7, null);
            this.f = v;
            this.g = s;
            this.h = s1;
            this.i = s2;
            this.j = s3;
            this.k = v1;
            this.l = v2;
            this.m = v3;
            this.n = v4;
            this.o = v5;
            this.p = v6;
            this.q = v7;
        }

        public Photo(long v, String s, String s1, String s2, String s3, long v1, long v2, int v3, long v4, int v5, int v6, long v7, int v8, DefaultConstructorMarker defaultConstructorMarker0) {
            this(v, s, s1, ((v8 & 8) == 0 ? s2 : null), s3, v1, v2, v3, ((v8 & 0x100) == 0 ? v4 : 0L), v5, v6, v7);
        }

        public final long component1() {
            return this.f;
        }

        public final int component10() {
            return this.o;
        }

        public final int component11() {
            return this.p;
        }

        public final long component12() {
            return this.q;
        }

        @NotNull
        public final String component2() {
            return this.g;
        }

        @NotNull
        public final String component3() {
            return this.h;
        }

        @Nullable
        public final String component4() {
            return this.i;
        }

        @NotNull
        public final String component5() {
            return this.j;
        }

        public final long component6() {
            return this.k;
        }

        public final long component7() {
            return this.l;
        }

        public final int component8() {
            return this.m;
        }

        public final long component9() {
            return this.n;
        }

        @NotNull
        public final Photo copy(long v, @NotNull String s, @NotNull String s1, @Nullable String s2, @NotNull String s3, long v1, long v2, int v3, long v4, int v5, int v6, long v7) {
            Intrinsics.checkNotNullParameter(s, "data");
            Intrinsics.checkNotNullParameter(s1, "uri");
            Intrinsics.checkNotNullParameter(s3, "mimeType");
            return new Photo(v, s, s1, s2, s3, v1, v2, v3, v4, v5, v6, v7);
        }

        public static Photo copy$default(Photo mediaItem$Photo0, long v, String s, String s1, String s2, String s3, long v1, long v2, int v3, long v4, int v5, int v6, long v7, int v8, Object object0) {
            long v9 = (v8 & 1) == 0 ? v : mediaItem$Photo0.f;
            String s4 = (v8 & 2) == 0 ? s : mediaItem$Photo0.g;
            String s5 = (v8 & 4) == 0 ? s1 : mediaItem$Photo0.h;
            String s6 = (v8 & 8) == 0 ? s2 : mediaItem$Photo0.i;
            String s7 = (v8 & 16) == 0 ? s3 : mediaItem$Photo0.j;
            long v10 = (v8 & 0x20) == 0 ? v1 : mediaItem$Photo0.k;
            long v11 = (v8 & 0x40) == 0 ? v2 : mediaItem$Photo0.l;
            int v12 = (v8 & 0x80) == 0 ? v3 : mediaItem$Photo0.m;
            long v13 = (v8 & 0x100) == 0 ? v4 : mediaItem$Photo0.n;
            int v14 = (v8 & 0x200) == 0 ? v5 : mediaItem$Photo0.o;
            int v15 = (v8 & 0x400) == 0 ? v6 : mediaItem$Photo0.p;
            return (v8 & 0x800) == 0 ? mediaItem$Photo0.copy(v9, s4, s5, s6, s7, v10, v11, v12, v13, v14, v15, v7) : mediaItem$Photo0.copy(v9, s4, s5, s6, s7, v10, v11, v12, v13, v14, v15, mediaItem$Photo0.q);
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
            if(!(object0 instanceof Photo)) {
                return false;
            }
            if(this.f != ((Photo)object0).f) {
                return false;
            }
            if(!Intrinsics.areEqual(this.g, ((Photo)object0).g)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.h, ((Photo)object0).h)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.i, ((Photo)object0).i)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, ((Photo)object0).j)) {
                return false;
            }
            if(this.k != ((Photo)object0).k) {
                return false;
            }
            if(this.l != ((Photo)object0).l) {
                return false;
            }
            if(this.m != ((Photo)object0).m) {
                return false;
            }
            if(this.n != ((Photo)object0).n) {
                return false;
            }
            if(this.o != ((Photo)object0).o) {
                return false;
            }
            return this.p == ((Photo)object0).p ? this.q == ((Photo)object0).q : false;
        }

        @Override  // com.kakao.kphotopicker.picker.MediaItem
        public long getBucketId() {
            return this.q;
        }

        @NotNull
        public final String getData() {
            return this.g;
        }

        @Override  // com.kakao.kphotopicker.picker.MediaItem
        public long getDataTaken() {
            return this.l;
        }

        @Override  // com.kakao.kphotopicker.picker.MediaItem
        public long getDateModified() {
            return this.k;
        }

        @Nullable
        public final String getEditedPath() {
            return this.i;
        }

        public final long getFileSize() {
            return this.n;
        }

        public final int getHeight() {
            return this.p;
        }

        @Override  // com.kakao.kphotopicker.picker.MediaItem
        public long getId() {
            return this.f;
        }

        @NotNull
        public final String getMimeType() {
            return this.j;
        }

        @Override  // com.kakao.kphotopicker.picker.MediaItem
        public int getOrientation() {
            return this.m;
        }

        @NotNull
        public final String getUri() {
            return this.h;
        }

        public final int getWidth() {
            return this.o;
        }

        @Override
        public int hashCode() {
            int v = q.c(q.c(Long.hashCode(this.f) * 0x1F, 0x1F, this.g), 0x1F, this.h);
            return this.i == null ? Long.hashCode(this.q) + a.c(this.p, a.c(this.o, wb.a.k(this.n, a.c(this.m, wb.a.k(this.l, wb.a.k(this.k, q.c(v * 0x1F, 0x1F, this.j), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F) : Long.hashCode(this.q) + a.c(this.p, a.c(this.o, wb.a.k(this.n, a.c(this.m, wb.a.k(this.l, wb.a.k(this.k, q.c((v + this.i.hashCode()) * 0x1F, 0x1F, this.j), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
        }

        public final boolean isEdited() {
            return this.i == null || this.i.length() == 0 ? 0 : 1;
        }

        public final boolean isGif() {
            return StringsKt__StringsKt.contains$default(this.j, "gif", false, 2, null);
        }

        @NotNull
        public final String output() {
            if(this.isEdited()) {
                String s = this.i;
                Intrinsics.checkNotNull(s);
                return s;
            }
            return this.g;
        }

        public final void setEditedPath(@Nullable String s) {
            this.i = s;
        }

        public final void setHeight(int v) {
            this.p = v;
        }

        public final void setMimeType(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "<set-?>");
            this.j = s;
        }

        public void setOrientation(int v) {
            this.m = v;
        }

        public final void setWidth(int v) {
            this.o = v;
        }

        @Override
        @NotNull
        public String toString() {
            String s = this.i;
            String s1 = this.j;
            int v = this.m;
            int v1 = this.o;
            int v2 = this.p;
            StringBuilder stringBuilder0 = new StringBuilder("Photo(id=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", data=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", uri=");
            androidx.room.a.w(stringBuilder0, this.h, ", editedPath=", s, ", mimeType=");
            stringBuilder0.append(s1);
            stringBuilder0.append(", dateModified=");
            stringBuilder0.append(this.k);
            stringBuilder0.append(", dataTaken=");
            stringBuilder0.append(this.l);
            stringBuilder0.append(", orientation=");
            stringBuilder0.append(v);
            stringBuilder0.append(", fileSize=");
            stringBuilder0.append(this.n);
            stringBuilder0.append(", width=");
            stringBuilder0.append(v1);
            stringBuilder0.append(", height=");
            stringBuilder0.append(v2);
            stringBuilder0.append(", bucketId=");
            return b.g(this.q, ")", stringBuilder0);
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel0, int v) {
            Intrinsics.checkNotNullParameter(parcel0, "out");
            parcel0.writeLong(this.f);
            parcel0.writeString(this.g);
            parcel0.writeString(this.h);
            parcel0.writeString(this.i);
            parcel0.writeString(this.j);
            parcel0.writeLong(this.k);
            parcel0.writeLong(this.l);
            parcel0.writeInt(this.m);
            parcel0.writeLong(this.n);
            parcel0.writeInt(this.o);
            parcel0.writeInt(this.p);
            parcel0.writeLong(this.q);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001B\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bg\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\u0006\u0010\t\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\u0003\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u000B\u0012\u0006\u0010\u000E\u001A\u00020\u0003\u0012\u0006\u0010\u000F\u001A\u00020\u000B\u0012\u0006\u0010\u0010\u001A\u00020\u000B\u0012\u0006\u0010\u0011\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001A\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0015J\u0010\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0015J\u0010\u0010\u001C\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\u0010\u0010\u001F\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u0015J\u0010\u0010 \u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001DJ\u0010\u0010!\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001DJ\u0010\u0010\"\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010\u0015J\u0088\u0001\u0010#\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00032\b\b\u0002\u0010\n\u001A\u00020\u00032\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u00032\b\b\u0002\u0010\u000F\u001A\u00020\u000B2\b\b\u0002\u0010\u0010\u001A\u00020\u000B2\b\b\u0002\u0010\u0011\u001A\u00020\u0003H\u00C6\u0001\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0005H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001A\u00020\u000BH\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\u001DJ\u001A\u0010*\u001A\u00020)2\b\u0010(\u001A\u0004\u0018\u00010\'H\u00D6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001A\u00020\u000BH\u00D6\u0001\u00A2\u0006\u0004\b,\u0010\u001DJ \u00101\u001A\u0002002\u0006\u0010.\u001A\u00020-2\u0006\u0010/\u001A\u00020\u000BH\u00D6\u0001\u00A2\u0006\u0004\b1\u00102R\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010\u0015R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u0010\u0017R\u0017\u0010\u0007\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b9\u00107\u001A\u0004\b:\u0010\u0017R\u0017\u0010\b\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b;\u00107\u001A\u0004\b<\u0010\u0017R\u001A\u0010\t\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b=\u00104\u001A\u0004\b>\u0010\u0015R\u001A\u0010\n\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b?\u00104\u001A\u0004\b@\u0010\u0015R\"\u0010\f\u001A\u00020\u000B8\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010B\u001A\u0004\bC\u0010\u001D\"\u0004\bD\u0010ER\u0017\u0010\r\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bF\u0010B\u001A\u0004\bG\u0010\u001DR\u0017\u0010\u000E\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\bH\u00104\u001A\u0004\bI\u0010\u0015R\u0017\u0010\u000F\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bJ\u0010B\u001A\u0004\bK\u0010\u001DR\u0017\u0010\u0010\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bL\u0010B\u001A\u0004\bM\u0010\u001DR\u001A\u0010\u0011\u001A\u00020\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bN\u00104\u001A\u0004\bO\u0010\u0015\u00A8\u0006P"}, d2 = {"Lcom/kakao/kphotopicker/picker/MediaItem$Video;", "Lcom/kakao/kphotopicker/picker/MediaItem;", "Landroid/os/Parcelable;", "", "id", "", "data", "uri", "mimeType", "dateModified", "dataTaken", "", "orientation", "duration", "fileSize", "width", "height", "bucketId", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIIJIIJ)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()I", "component8", "component9", "component10", "component11", "component12", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIIJIIJ)Lcom/kakao/kphotopicker/picker/MediaItem$Video;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "f", "J", "getId", "g", "Ljava/lang/String;", "getData", "h", "getUri", "i", "getMimeType", "j", "getDateModified", "k", "getDataTaken", "l", "I", "getOrientation", "setOrientation", "(I)V", "m", "getDuration", "n", "getFileSize", "o", "getWidth", "p", "getHeight", "q", "getBucketId", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Parcelize
    public static final class Video extends MediaItem implements Parcelable {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.kphotopicker.picker.MediaItem.Video.Creator implements Parcelable.Creator {
            @NotNull
            public final Video createFromParcel(@NotNull Parcel parcel0) {
                Intrinsics.checkNotNullParameter(parcel0, "parcel");
                return new Video(parcel0.readLong(), parcel0.readString(), parcel0.readString(), parcel0.readString(), parcel0.readLong(), parcel0.readLong(), parcel0.readInt(), parcel0.readInt(), parcel0.readLong(), parcel0.readInt(), parcel0.readInt(), parcel0.readLong());
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            @NotNull
            public final Video[] newArray(int v) {
                return new Video[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        }

        @NotNull
        public static final Parcelable.Creator CREATOR;
        public final long f;
        public final String g;
        public final String h;
        public final String i;
        public final long j;
        public final long k;
        public int l;
        public final int m;
        public final long n;
        public final int o;
        public final int p;
        public final long q;

        static {
            Video.CREATOR = new com.kakao.kphotopicker.picker.MediaItem.Video.Creator();
        }

        public Video(long v, @NotNull String s, @NotNull String s1, @NotNull String s2, long v1, long v2, int v3, int v4, long v5, int v6, int v7, long v8) {
            Intrinsics.checkNotNullParameter(s, "data");
            Intrinsics.checkNotNullParameter(s1, "uri");
            Intrinsics.checkNotNullParameter(s2, "mimeType");
            super(v, v1, v2, v3, v8, null);
            this.f = v;
            this.g = s;
            this.h = s1;
            this.i = s2;
            this.j = v1;
            this.k = v2;
            this.l = v3;
            this.m = v4;
            this.n = v5;
            this.o = v6;
            this.p = v7;
            this.q = v8;
        }

        public final long component1() {
            return this.f;
        }

        public final int component10() {
            return this.o;
        }

        public final int component11() {
            return this.p;
        }

        public final long component12() {
            return this.q;
        }

        @NotNull
        public final String component2() {
            return this.g;
        }

        @NotNull
        public final String component3() {
            return this.h;
        }

        @NotNull
        public final String component4() {
            return this.i;
        }

        public final long component5() {
            return this.j;
        }

        public final long component6() {
            return this.k;
        }

        public final int component7() {
            return this.l;
        }

        public final int component8() {
            return this.m;
        }

        public final long component9() {
            return this.n;
        }

        @NotNull
        public final Video copy(long v, @NotNull String s, @NotNull String s1, @NotNull String s2, long v1, long v2, int v3, int v4, long v5, int v6, int v7, long v8) {
            Intrinsics.checkNotNullParameter(s, "data");
            Intrinsics.checkNotNullParameter(s1, "uri");
            Intrinsics.checkNotNullParameter(s2, "mimeType");
            return new Video(v, s, s1, s2, v1, v2, v3, v4, v5, v6, v7, v8);
        }

        public static Video copy$default(Video mediaItem$Video0, long v, String s, String s1, String s2, long v1, long v2, int v3, int v4, long v5, int v6, int v7, long v8, int v9, Object object0) {
            long v10 = (v9 & 1) == 0 ? v : mediaItem$Video0.f;
            String s3 = (v9 & 2) == 0 ? s : mediaItem$Video0.g;
            String s4 = (v9 & 4) == 0 ? s1 : mediaItem$Video0.h;
            String s5 = (v9 & 8) == 0 ? s2 : mediaItem$Video0.i;
            long v11 = (v9 & 16) == 0 ? v1 : mediaItem$Video0.j;
            long v12 = (v9 & 0x20) == 0 ? v2 : mediaItem$Video0.k;
            int v13 = (v9 & 0x40) == 0 ? v3 : mediaItem$Video0.l;
            int v14 = (v9 & 0x80) == 0 ? v4 : mediaItem$Video0.m;
            long v15 = (v9 & 0x100) == 0 ? v5 : mediaItem$Video0.n;
            int v16 = (v9 & 0x200) == 0 ? v6 : mediaItem$Video0.o;
            int v17 = (v9 & 0x400) == 0 ? v7 : mediaItem$Video0.p;
            return (v9 & 0x800) == 0 ? mediaItem$Video0.copy(v10, s3, s4, s5, v11, v12, v13, v14, v15, v16, v17, v8) : mediaItem$Video0.copy(v10, s3, s4, s5, v11, v12, v13, v14, v15, v16, v17, mediaItem$Video0.q);
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
            if(!(object0 instanceof Video)) {
                return false;
            }
            if(this.f != ((Video)object0).f) {
                return false;
            }
            if(!Intrinsics.areEqual(this.g, ((Video)object0).g)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.h, ((Video)object0).h)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.i, ((Video)object0).i)) {
                return false;
            }
            if(this.j != ((Video)object0).j) {
                return false;
            }
            if(this.k != ((Video)object0).k) {
                return false;
            }
            if(this.l != ((Video)object0).l) {
                return false;
            }
            if(this.m != ((Video)object0).m) {
                return false;
            }
            if(this.n != ((Video)object0).n) {
                return false;
            }
            if(this.o != ((Video)object0).o) {
                return false;
            }
            return this.p == ((Video)object0).p ? this.q == ((Video)object0).q : false;
        }

        @Override  // com.kakao.kphotopicker.picker.MediaItem
        public long getBucketId() {
            return this.q;
        }

        @NotNull
        public final String getData() {
            return this.g;
        }

        @Override  // com.kakao.kphotopicker.picker.MediaItem
        public long getDataTaken() {
            return this.k;
        }

        @Override  // com.kakao.kphotopicker.picker.MediaItem
        public long getDateModified() {
            return this.j;
        }

        public final int getDuration() {
            return this.m;
        }

        public final long getFileSize() {
            return this.n;
        }

        public final int getHeight() {
            return this.p;
        }

        @Override  // com.kakao.kphotopicker.picker.MediaItem
        public long getId() {
            return this.f;
        }

        @NotNull
        public final String getMimeType() {
            return this.i;
        }

        @Override  // com.kakao.kphotopicker.picker.MediaItem
        public int getOrientation() {
            return this.l;
        }

        @NotNull
        public final String getUri() {
            return this.h;
        }

        public final int getWidth() {
            return this.o;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(this.q) + a.c(this.p, a.c(this.o, wb.a.k(this.n, a.c(this.m, a.c(this.l, wb.a.k(this.k, wb.a.k(this.j, q.c(q.c(q.c(Long.hashCode(this.f) * 0x1F, 0x1F, this.g), 0x1F, this.h), 0x1F, this.i), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
        }

        public void setOrientation(int v) {
            this.l = v;
        }

        @Override
        @NotNull
        public String toString() {
            int v = this.l;
            StringBuilder stringBuilder0 = new StringBuilder("Video(id=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", data=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", uri=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", mimeType=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", dateModified=");
            stringBuilder0.append(this.j);
            stringBuilder0.append(", dataTaken=");
            stringBuilder0.append(this.k);
            stringBuilder0.append(", orientation=");
            stringBuilder0.append(v);
            stringBuilder0.append(", duration=");
            stringBuilder0.append(this.m);
            stringBuilder0.append(", fileSize=");
            stringBuilder0.append(this.n);
            stringBuilder0.append(", width=");
            stringBuilder0.append(this.o);
            stringBuilder0.append(", height=");
            stringBuilder0.append(this.p);
            stringBuilder0.append(", bucketId=");
            return b.g(this.q, ")", stringBuilder0);
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel0, int v) {
            Intrinsics.checkNotNullParameter(parcel0, "out");
            parcel0.writeLong(this.f);
            parcel0.writeString(this.g);
            parcel0.writeString(this.h);
            parcel0.writeString(this.i);
            parcel0.writeLong(this.j);
            parcel0.writeLong(this.k);
            parcel0.writeInt(this.l);
            parcel0.writeInt(this.m);
            parcel0.writeLong(this.n);
            parcel0.writeInt(this.o);
            parcel0.writeInt(this.p);
            parcel0.writeLong(this.q);
        }
    }

    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final long e;

    public MediaItem(long v, long v1, long v2, int v3, long v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    public long getBucketId() {
        return this.e;
    }

    public long getDataTaken() {
        return this.c;
    }

    public long getDateModified() {
        return this.b;
    }

    public long getId() {
        return this.a;
    }

    public int getOrientation() {
        return this.d;
    }

    @Nullable
    public final String mimeType() {
        if(this instanceof Photo) {
            return ((Photo)this).getMimeType();
        }
        return this instanceof Video ? ((Video)this).getMimeType() : null;
    }

    @Nullable
    public final String src() {
        if(this instanceof Photo) {
            return ((Photo)this).output();
        }
        if(this instanceof Video) {
            String s = ((Video)this).getData();
            return s == null || p.isBlank(s) ? ((Video)this).getUri() : ((Video)this).getData();
        }
        return null;
    }
}

