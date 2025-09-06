package com.kakao.tistory.domain.entity.push;

import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b-\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0002\u0010\u000EJ\t\u0010\'\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010(\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010)\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010*\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010+\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010,\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010-\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010.\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010/\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u00100\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u007F\u00101\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0005H\u00C6\u0001J\u0013\u00102\u001A\u0002032\b\u00104\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u00105\u001A\u000206H\u00D6\u0001J\t\u00107\u001A\u00020\u0005H\u00D6\u0001R\u001C\u0010\n\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001C\u0010\t\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001C\u0010\f\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001C\u0010\u000B\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\u0010\"\u0004\b\u001A\u0010\u0012R\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\u001C\u0010\b\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010\u0010\"\u0004\b \u0010\u0012R\u001C\u0010\r\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012\u00A8\u00068"}, d2 = {"Lcom/kakao/tistory/domain/entity/push/PushMessage;", "", "id", "", "title", "", "body", "sound", "largeIcon", "bigText", "bigImage", "groupType", "groupLabel", "link", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBigImage", "()Ljava/lang/String;", "setBigImage", "(Ljava/lang/String;)V", "getBigText", "setBigText", "getBody", "setBody", "getGroupLabel", "setGroupLabel", "getGroupType", "setGroupType", "getId", "()J", "setId", "(J)V", "getLargeIcon", "setLargeIcon", "getLink", "setLink", "getSound", "setSound", "getTitle", "setTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PushMessage {
    @Nullable
    private String bigImage;
    @Nullable
    private String bigText;
    @Nullable
    private String body;
    @Nullable
    private String groupLabel;
    @Nullable
    private String groupType;
    private long id;
    @Nullable
    private String largeIcon;
    @Nullable
    private String link;
    @Nullable
    private String sound;
    @Nullable
    private String title;

    public PushMessage(long v, @Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7, @Nullable String s8) {
        this.id = v;
        this.title = s;
        this.body = s1;
        this.sound = s2;
        this.largeIcon = s3;
        this.bigText = s4;
        this.bigImage = s5;
        this.groupType = s6;
        this.groupLabel = s7;
        this.link = s8;
    }

    public final long component1() {
        return this.id;
    }

    @Nullable
    public final String component10() {
        return this.link;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.body;
    }

    @Nullable
    public final String component4() {
        return this.sound;
    }

    @Nullable
    public final String component5() {
        return this.largeIcon;
    }

    @Nullable
    public final String component6() {
        return this.bigText;
    }

    @Nullable
    public final String component7() {
        return this.bigImage;
    }

    @Nullable
    public final String component8() {
        return this.groupType;
    }

    @Nullable
    public final String component9() {
        return this.groupLabel;
    }

    @NotNull
    public final PushMessage copy(long v, @Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7, @Nullable String s8) {
        return new PushMessage(v, s, s1, s2, s3, s4, s5, s6, s7, s8);
    }

    public static PushMessage copy$default(PushMessage pushMessage0, long v, String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, int v1, Object object0) {
        long v2 = (v1 & 1) == 0 ? v : pushMessage0.id;
        String s9 = (v1 & 2) == 0 ? s : pushMessage0.title;
        String s10 = (v1 & 4) == 0 ? s1 : pushMessage0.body;
        String s11 = (v1 & 8) == 0 ? s2 : pushMessage0.sound;
        String s12 = (v1 & 16) == 0 ? s3 : pushMessage0.largeIcon;
        String s13 = (v1 & 0x20) == 0 ? s4 : pushMessage0.bigText;
        String s14 = (v1 & 0x40) == 0 ? s5 : pushMessage0.bigImage;
        String s15 = (v1 & 0x80) == 0 ? s6 : pushMessage0.groupType;
        String s16 = (v1 & 0x100) == 0 ? s7 : pushMessage0.groupLabel;
        return (v1 & 0x200) == 0 ? pushMessage0.copy(v2, s9, s10, s11, s12, s13, s14, s15, s16, s8) : pushMessage0.copy(v2, s9, s10, s11, s12, s13, s14, s15, s16, pushMessage0.link);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PushMessage)) {
            return false;
        }
        if(this.id != ((PushMessage)object0).id) {
            return false;
        }
        if(!Intrinsics.areEqual(this.title, ((PushMessage)object0).title)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.body, ((PushMessage)object0).body)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.sound, ((PushMessage)object0).sound)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.largeIcon, ((PushMessage)object0).largeIcon)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.bigText, ((PushMessage)object0).bigText)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.bigImage, ((PushMessage)object0).bigImage)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.groupType, ((PushMessage)object0).groupType)) {
            return false;
        }
        return Intrinsics.areEqual(this.groupLabel, ((PushMessage)object0).groupLabel) ? Intrinsics.areEqual(this.link, ((PushMessage)object0).link) : false;
    }

    @Nullable
    public final String getBigImage() {
        return this.bigImage;
    }

    @Nullable
    public final String getBigText() {
        return this.bigText;
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final String getGroupLabel() {
        return this.groupLabel;
    }

    @Nullable
    public final String getGroupType() {
        return this.groupType;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getLargeIcon() {
        return this.largeIcon;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getSound() {
        return this.sound;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override
    public int hashCode() {
        int v = Long.hashCode(this.id);
        int v1 = 0;
        int v2 = this.title == null ? 0 : this.title.hashCode();
        int v3 = this.body == null ? 0 : this.body.hashCode();
        int v4 = this.sound == null ? 0 : this.sound.hashCode();
        int v5 = this.largeIcon == null ? 0 : this.largeIcon.hashCode();
        int v6 = this.bigText == null ? 0 : this.bigText.hashCode();
        int v7 = this.bigImage == null ? 0 : this.bigImage.hashCode();
        int v8 = this.groupType == null ? 0 : this.groupType.hashCode();
        int v9 = this.groupLabel == null ? 0 : this.groupLabel.hashCode();
        String s = this.link;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((((((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v1;
    }

    public final void setBigImage(@Nullable String s) {
        this.bigImage = s;
    }

    public final void setBigText(@Nullable String s) {
        this.bigText = s;
    }

    public final void setBody(@Nullable String s) {
        this.body = s;
    }

    public final void setGroupLabel(@Nullable String s) {
        this.groupLabel = s;
    }

    public final void setGroupType(@Nullable String s) {
        this.groupType = s;
    }

    public final void setId(long v) {
        this.id = v;
    }

    public final void setLargeIcon(@Nullable String s) {
        this.largeIcon = s;
    }

    public final void setLink(@Nullable String s) {
        this.link = s;
    }

    public final void setSound(@Nullable String s) {
        this.sound = s;
    }

    public final void setTitle(@Nullable String s) {
        this.title = s;
    }

    @Override
    @NotNull
    public String toString() {
        long v = this.id;
        String s = this.title;
        String s1 = this.body;
        String s2 = this.sound;
        String s3 = this.largeIcon;
        String s4 = this.bigText;
        String s5 = this.bigImage;
        String s6 = this.groupType;
        String s7 = this.groupLabel;
        String s8 = this.link;
        StringBuilder stringBuilder0 = new StringBuilder("PushMessage(id=");
        stringBuilder0.append(v);
        stringBuilder0.append(", title=");
        stringBuilder0.append(s);
        a.w(stringBuilder0, ", body=", s1, ", sound=", s2);
        a.w(stringBuilder0, ", largeIcon=", s3, ", bigText=", s4);
        a.w(stringBuilder0, ", bigImage=", s5, ", groupType=", s6);
        a.w(stringBuilder0, ", groupLabel=", s7, ", link=", s8);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

