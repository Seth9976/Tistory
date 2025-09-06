package com.kakao.tistory.domain.entity;

import a5.b;
import androidx.room.a;
import com.kakao.tistory.domain.blog.entity.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001A\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000B\f\r\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/domain/entity/NotificationItem;", "", "()V", "link", "", "getLink", "()Ljava/lang/String;", "Banner", "Empty", "Header", "Notification", "Lcom/kakao/tistory/domain/entity/NotificationItem$Banner;", "Lcom/kakao/tistory/domain/entity/NotificationItem$Empty;", "Lcom/kakao/tistory/domain/entity/NotificationItem$Header;", "Lcom/kakao/tistory/domain/entity/NotificationItem$Notification;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class NotificationItem {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0007HÆ\u0003J)\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/domain/entity/NotificationItem$Banner;", "Lcom/kakao/tistory/domain/entity/NotificationItem;", "id", "", "imageUrl", "", "position", "", "(JLjava/lang/String;I)V", "getId", "()J", "getImageUrl", "()Ljava/lang/String;", "getPosition", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Banner extends NotificationItem {
        private final long id;
        @Nullable
        private final String imageUrl;
        private final int position;

        public Banner(long v, @Nullable String s, int v1) {
            super(null);
            this.id = v;
            this.imageUrl = s;
            this.position = v1;
        }

        public Banner(long v, String s, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v2 & 2) != 0) {
                s = null;
            }
            if((v2 & 4) != 0) {
                v1 = 3;
            }
            this(v, s, v1);
        }

        public final long component1() {
            return this.id;
        }

        @Nullable
        public final String component2() {
            return this.imageUrl;
        }

        public final int component3() {
            return this.position;
        }

        @NotNull
        public final Banner copy(long v, @Nullable String s, int v1) {
            return new Banner(v, s, v1);
        }

        public static Banner copy$default(Banner notificationItem$Banner0, long v, String s, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = notificationItem$Banner0.id;
            }
            if((v2 & 2) != 0) {
                s = notificationItem$Banner0.imageUrl;
            }
            if((v2 & 4) != 0) {
                v1 = notificationItem$Banner0.position;
            }
            return notificationItem$Banner0.copy(v, s, v1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Banner)) {
                return false;
            }
            if(this.id != ((Banner)object0).id) {
                return false;
            }
            return Intrinsics.areEqual(this.imageUrl, ((Banner)object0).imageUrl) ? this.position == ((Banner)object0).position : false;
        }

        public final long getId() {
            return this.id;
        }

        @Nullable
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override
        public int hashCode() {
            int v = Long.hashCode(this.id);
            return this.imageUrl == null ? this.position + v * 961 : this.position + (v * 0x1F + this.imageUrl.hashCode()) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "Banner(id=" + this.id + ", imageUrl=" + this.imageUrl + ", position=" + this.position + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/tistory/domain/entity/NotificationItem$Empty;", "Lcom/kakao/tistory/domain/entity/NotificationItem;", "()V", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Empty extends NotificationItem {
        public Empty() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/tistory/domain/entity/NotificationItem$Header;", "Lcom/kakao/tistory/domain/entity/NotificationItem;", "()V", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Header extends NotificationItem {
        @NotNull
        public static final Header INSTANCE;

        static {
            Header.INSTANCE = new Header();
        }

        private Header() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\u0002\u0010\rJ\u0010\u0010\u001C\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u0010\u0012J\t\u0010\u001D\u001A\u00020\u0005H\u00C6\u0003J\u000B\u0010\u001E\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003J\u000B\u0010\u001F\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003J\u000B\u0010 \u001A\u0004\u0018\u00010\u0007H\u00C6\u0003J\u000B\u0010!\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003J\u000B\u0010\"\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003J\u000B\u0010#\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003Jl\u0010$\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0007H\u00C6\u0001\u00A2\u0006\u0002\u0010%J\u0013\u0010&\u001A\u00020\u00052\b\u0010\'\u001A\u0004\u0018\u00010(H\u00D6\u0003J\t\u0010)\u001A\u00020*H\u00D6\u0001J\t\u0010+\u001A\u00020\u0007H\u00D6\u0001R\u0013\u0010\n\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\b\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000FR\u0015\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u0010\u0013\u001A\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0004\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u000FR\u0013\u0010\u000B\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u000FR\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u000FR\u0013\u0010\f\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u000F\u00A8\u0006,"}, d2 = {"Lcom/kakao/tistory/domain/entity/NotificationItem$Notification;", "Lcom/kakao/tistory/domain/entity/NotificationItem;", "id", "", "read", "", "title", "", "content", "representativeImage", "bottomLabel", "timestamp", "type", "(Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBottomLabel", "()Ljava/lang/String;", "getContent", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRead", "()Z", "setRead", "(Z)V", "getRepresentativeImage", "getTimestamp", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/domain/entity/NotificationItem$Notification;", "equals", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Notification extends NotificationItem {
        @Nullable
        private final String bottomLabel;
        @Nullable
        private final String content;
        @Nullable
        private final Long id;
        private boolean read;
        @Nullable
        private final String representativeImage;
        @Nullable
        private final String timestamp;
        @Nullable
        private final String title;
        @Nullable
        private final String type;

        public Notification() {
            this(null, false, null, null, null, null, null, null, 0xFF, null);
        }

        public Notification(@Nullable Long long0, boolean z, @Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5) {
            super(null);
            this.id = long0;
            this.read = z;
            this.title = s;
            this.content = s1;
            this.representativeImage = s2;
            this.bottomLabel = s3;
            this.timestamp = s4;
            this.type = s5;
        }

        public Notification(Long long0, boolean z, String s, String s1, String s2, String s3, String s4, String s5, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            this(((v & 1) == 0 ? long0 : null), ((v & 2) == 0 ? z : false), ((v & 4) == 0 ? s : null), ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? s3 : null), ((v & 0x40) == 0 ? s4 : null), ((v & 0x80) == 0 ? s5 : null));
        }

        @Nullable
        public final Long component1() {
            return this.id;
        }

        public final boolean component2() {
            return this.read;
        }

        @Nullable
        public final String component3() {
            return this.title;
        }

        @Nullable
        public final String component4() {
            return this.content;
        }

        @Nullable
        public final String component5() {
            return this.representativeImage;
        }

        @Nullable
        public final String component6() {
            return this.bottomLabel;
        }

        @Nullable
        public final String component7() {
            return this.timestamp;
        }

        @Nullable
        public final String component8() {
            return this.type;
        }

        @NotNull
        public final Notification copy(@Nullable Long long0, boolean z, @Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5) {
            return new Notification(long0, z, s, s1, s2, s3, s4, s5);
        }

        public static Notification copy$default(Notification notificationItem$Notification0, Long long0, boolean z, String s, String s1, String s2, String s3, String s4, String s5, int v, Object object0) {
            Long long1 = (v & 1) == 0 ? long0 : notificationItem$Notification0.id;
            boolean z1 = (v & 2) == 0 ? z : notificationItem$Notification0.read;
            String s6 = (v & 4) == 0 ? s : notificationItem$Notification0.title;
            String s7 = (v & 8) == 0 ? s1 : notificationItem$Notification0.content;
            String s8 = (v & 16) == 0 ? s2 : notificationItem$Notification0.representativeImage;
            String s9 = (v & 0x20) == 0 ? s3 : notificationItem$Notification0.bottomLabel;
            String s10 = (v & 0x40) == 0 ? s4 : notificationItem$Notification0.timestamp;
            return (v & 0x80) == 0 ? notificationItem$Notification0.copy(long1, z1, s6, s7, s8, s9, s10, s5) : notificationItem$Notification0.copy(long1, z1, s6, s7, s8, s9, s10, notificationItem$Notification0.type);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Notification)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.id, ((Notification)object0).id)) {
                return false;
            }
            if(this.read != ((Notification)object0).read) {
                return false;
            }
            if(!Intrinsics.areEqual(this.title, ((Notification)object0).title)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.content, ((Notification)object0).content)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.representativeImage, ((Notification)object0).representativeImage)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.bottomLabel, ((Notification)object0).bottomLabel)) {
                return false;
            }
            return Intrinsics.areEqual(this.timestamp, ((Notification)object0).timestamp) ? Intrinsics.areEqual(this.type, ((Notification)object0).type) : false;
        }

        @Nullable
        public final String getBottomLabel() {
            return this.bottomLabel;
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final Long getId() {
            return this.id;
        }

        public final boolean getRead() {
            return this.read;
        }

        @Nullable
        public final String getRepresentativeImage() {
            return this.representativeImage;
        }

        @Nullable
        public final String getTimestamp() {
            return this.timestamp;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = c.a(this.read, (this.id == null ? 0 : this.id.hashCode()) * 0x1F, 0x1F);
            int v2 = this.title == null ? 0 : this.title.hashCode();
            int v3 = this.content == null ? 0 : this.content.hashCode();
            int v4 = this.representativeImage == null ? 0 : this.representativeImage.hashCode();
            int v5 = this.bottomLabel == null ? 0 : this.bottomLabel.hashCode();
            int v6 = this.timestamp == null ? 0 : this.timestamp.hashCode();
            String s = this.type;
            if(s != null) {
                v = s.hashCode();
            }
            return (((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v;
        }

        public final void setRead(boolean z) {
            this.read = z;
        }

        @Override
        @NotNull
        public String toString() {
            boolean z = this.read;
            StringBuilder stringBuilder0 = new StringBuilder("Notification(id=");
            stringBuilder0.append(this.id);
            stringBuilder0.append(", read=");
            stringBuilder0.append(z);
            stringBuilder0.append(", title=");
            a.w(stringBuilder0, this.title, ", content=", this.content, ", representativeImage=");
            a.w(stringBuilder0, this.representativeImage, ", bottomLabel=", this.bottomLabel, ", timestamp=");
            return b.r(stringBuilder0, this.timestamp, ", type=", this.type, ")");
        }
    }

    @Nullable
    private final String link;

    private NotificationItem() {
    }

    public NotificationItem(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }
}

