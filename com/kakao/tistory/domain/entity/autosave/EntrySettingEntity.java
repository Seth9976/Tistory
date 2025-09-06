package com.kakao.tistory.domain.entity.autosave;

import com.kakao.tistory.domain.blog.entity.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b*\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u000E\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001A\u0004\u0018\u00010\n\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\n\u00A2\u0006\u0002\u0010\u0012J\u000B\u0010&\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010\'\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0010\u0010(\u001A\u0004\u0018\u00010\nH\u00C6\u0003\u00A2\u0006\u0002\u0010\u001EJ\u0010\u0010)\u001A\u0004\u0018\u00010\nH\u00C6\u0003\u00A2\u0006\u0002\u0010\u001EJ\u0011\u0010*\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u00C6\u0003J\t\u0010+\u001A\u00020\u0007H\u00C6\u0003J\u000B\u0010,\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0010\u0010-\u001A\u0004\u0018\u00010\nH\u00C6\u0003\u00A2\u0006\u0002\u0010\u001EJ\u0010\u0010.\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003\u00A2\u0006\u0002\u0010\u0014J\u000B\u0010/\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u0010\u00100\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003\u00A2\u0006\u0002\u0010\u0014J\u000B\u00101\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u00A2\u0001\u00102\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\nH\u00C6\u0001\u00A2\u0006\u0002\u00103J\u0013\u00104\u001A\u0002052\b\u00106\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u00107\u001A\u00020\u0007H\u00D6\u0001J\t\u00108\u001A\u00020\u0003H\u00D6\u0001R\u0015\u0010\u000B\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\n\n\u0002\u0010\u0015\u001A\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001A\u00020\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R\u0015\u0010\r\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\n\n\u0002\u0010\u0015\u001A\u0004\b\u001A\u0010\u0014R\u0013\u0010\u000E\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u0017R\u0013\u0010\u000F\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u0017R\u0015\u0010\u0010\u001A\u0004\u0018\u00010\n\u00A2\u0006\n\n\u0002\u0010\u001F\u001A\u0004\b\u001D\u0010\u001ER\u0015\u0010\t\u001A\u0004\u0018\u00010\n\u00A2\u0006\n\n\u0002\u0010\u001F\u001A\u0004\b \u0010\u001ER\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b!\u0010\u0017R\u0019\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\"\u0010#R\u0015\u0010\u0011\u001A\u0004\u0018\u00010\n\u00A2\u0006\n\n\u0002\u0010\u001F\u001A\u0004\b$\u0010\u001ER\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b%\u0010\u0017\u00A8\u00069"}, d2 = {"Lcom/kakao/tistory/domain/entity/autosave/EntrySettingEntity;", "", "visibility", "", "tags", "", "commentPermit", "", "reserveType", "reserveTime", "", "categoryId", "categoryName", "daumLikeId", "daumLikeName", "passwordString", "published", "updatedAt", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCategoryName", "()Ljava/lang/String;", "getCommentPermit", "()I", "getDaumLikeId", "getDaumLikeName", "getPasswordString", "getPublished", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getReserveTime", "getReserveType", "getTags", "()Ljava/util/List;", "getUpdatedAt", "getVisibility", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/kakao/tistory/domain/entity/autosave/EntrySettingEntity;", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EntrySettingEntity {
    @Nullable
    private final Integer categoryId;
    @Nullable
    private final String categoryName;
    private final int commentPermit;
    @Nullable
    private final Integer daumLikeId;
    @Nullable
    private final String daumLikeName;
    @Nullable
    private final String passwordString;
    @Nullable
    private final Long published;
    @Nullable
    private final Long reserveTime;
    @Nullable
    private final String reserveType;
    @Nullable
    private final List tags;
    @Nullable
    private final Long updatedAt;
    @Nullable
    private final String visibility;

    public EntrySettingEntity(@Nullable String s, @Nullable List list0, int v, @Nullable String s1, @Nullable Long long0, @Nullable Integer integer0, @Nullable String s2, @Nullable Integer integer1, @Nullable String s3, @Nullable String s4, @Nullable Long long1, @Nullable Long long2) {
        this.visibility = s;
        this.tags = list0;
        this.commentPermit = v;
        this.reserveType = s1;
        this.reserveTime = long0;
        this.categoryId = integer0;
        this.categoryName = s2;
        this.daumLikeId = integer1;
        this.daumLikeName = s3;
        this.passwordString = s4;
        this.published = long1;
        this.updatedAt = long2;
    }

    public EntrySettingEntity(String s, List list0, int v, String s1, Long long0, Integer integer0, String s2, Integer integer1, String s3, String s4, Long long1, Long long2, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, list0, ((v1 & 4) == 0 ? v : 1), s1, long0, integer0, s2, integer1, s3, s4, long1, long2);
    }

    @Nullable
    public final String component1() {
        return this.visibility;
    }

    @Nullable
    public final String component10() {
        return this.passwordString;
    }

    @Nullable
    public final Long component11() {
        return this.published;
    }

    @Nullable
    public final Long component12() {
        return this.updatedAt;
    }

    @Nullable
    public final List component2() {
        return this.tags;
    }

    public final int component3() {
        return this.commentPermit;
    }

    @Nullable
    public final String component4() {
        return this.reserveType;
    }

    @Nullable
    public final Long component5() {
        return this.reserveTime;
    }

    @Nullable
    public final Integer component6() {
        return this.categoryId;
    }

    @Nullable
    public final String component7() {
        return this.categoryName;
    }

    @Nullable
    public final Integer component8() {
        return this.daumLikeId;
    }

    @Nullable
    public final String component9() {
        return this.daumLikeName;
    }

    @NotNull
    public final EntrySettingEntity copy(@Nullable String s, @Nullable List list0, int v, @Nullable String s1, @Nullable Long long0, @Nullable Integer integer0, @Nullable String s2, @Nullable Integer integer1, @Nullable String s3, @Nullable String s4, @Nullable Long long1, @Nullable Long long2) {
        return new EntrySettingEntity(s, list0, v, s1, long0, integer0, s2, integer1, s3, s4, long1, long2);
    }

    public static EntrySettingEntity copy$default(EntrySettingEntity entrySettingEntity0, String s, List list0, int v, String s1, Long long0, Integer integer0, String s2, Integer integer1, String s3, String s4, Long long1, Long long2, int v1, Object object0) {
        String s5 = (v1 & 1) == 0 ? s : entrySettingEntity0.visibility;
        List list1 = (v1 & 2) == 0 ? list0 : entrySettingEntity0.tags;
        int v2 = (v1 & 4) == 0 ? v : entrySettingEntity0.commentPermit;
        String s6 = (v1 & 8) == 0 ? s1 : entrySettingEntity0.reserveType;
        Long long3 = (v1 & 16) == 0 ? long0 : entrySettingEntity0.reserveTime;
        Integer integer2 = (v1 & 0x20) == 0 ? integer0 : entrySettingEntity0.categoryId;
        String s7 = (v1 & 0x40) == 0 ? s2 : entrySettingEntity0.categoryName;
        Integer integer3 = (v1 & 0x80) == 0 ? integer1 : entrySettingEntity0.daumLikeId;
        String s8 = (v1 & 0x100) == 0 ? s3 : entrySettingEntity0.daumLikeName;
        String s9 = (v1 & 0x200) == 0 ? s4 : entrySettingEntity0.passwordString;
        Long long4 = (v1 & 0x400) == 0 ? long1 : entrySettingEntity0.published;
        return (v1 & 0x800) == 0 ? entrySettingEntity0.copy(s5, list1, v2, s6, long3, integer2, s7, integer3, s8, s9, long4, long2) : entrySettingEntity0.copy(s5, list1, v2, s6, long3, integer2, s7, integer3, s8, s9, long4, entrySettingEntity0.updatedAt);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof EntrySettingEntity)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.visibility, ((EntrySettingEntity)object0).visibility)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.tags, ((EntrySettingEntity)object0).tags)) {
            return false;
        }
        if(this.commentPermit != ((EntrySettingEntity)object0).commentPermit) {
            return false;
        }
        if(!Intrinsics.areEqual(this.reserveType, ((EntrySettingEntity)object0).reserveType)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.reserveTime, ((EntrySettingEntity)object0).reserveTime)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.categoryId, ((EntrySettingEntity)object0).categoryId)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.categoryName, ((EntrySettingEntity)object0).categoryName)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.daumLikeId, ((EntrySettingEntity)object0).daumLikeId)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.daumLikeName, ((EntrySettingEntity)object0).daumLikeName)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.passwordString, ((EntrySettingEntity)object0).passwordString)) {
            return false;
        }
        return Intrinsics.areEqual(this.published, ((EntrySettingEntity)object0).published) ? Intrinsics.areEqual(this.updatedAt, ((EntrySettingEntity)object0).updatedAt) : false;
    }

    @Nullable
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getCategoryName() {
        return this.categoryName;
    }

    public final int getCommentPermit() {
        return this.commentPermit;
    }

    @Nullable
    public final Integer getDaumLikeId() {
        return this.daumLikeId;
    }

    @Nullable
    public final String getDaumLikeName() {
        return this.daumLikeName;
    }

    @Nullable
    public final String getPasswordString() {
        return this.passwordString;
    }

    @Nullable
    public final Long getPublished() {
        return this.published;
    }

    @Nullable
    public final Long getReserveTime() {
        return this.reserveTime;
    }

    @Nullable
    public final String getReserveType() {
        return this.reserveType;
    }

    @Nullable
    public final List getTags() {
        return this.tags;
    }

    @Nullable
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    @Nullable
    public final String getVisibility() {
        return this.visibility;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.a(this.commentPermit, ((this.visibility == null ? 0 : this.visibility.hashCode()) * 0x1F + (this.tags == null ? 0 : this.tags.hashCode())) * 0x1F, 0x1F);
        int v2 = this.reserveType == null ? 0 : this.reserveType.hashCode();
        int v3 = this.reserveTime == null ? 0 : this.reserveTime.hashCode();
        int v4 = this.categoryId == null ? 0 : this.categoryId.hashCode();
        int v5 = this.categoryName == null ? 0 : this.categoryName.hashCode();
        int v6 = this.daumLikeId == null ? 0 : this.daumLikeId.hashCode();
        int v7 = this.daumLikeName == null ? 0 : this.daumLikeName.hashCode();
        int v8 = this.passwordString == null ? 0 : this.passwordString.hashCode();
        int v9 = this.published == null ? 0 : this.published.hashCode();
        Long long0 = this.updatedAt;
        if(long0 != null) {
            v = long0.hashCode();
        }
        return ((((((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("EntrySettingEntity(visibility=");
        stringBuilder0.append(this.visibility);
        stringBuilder0.append(", tags=");
        stringBuilder0.append(this.tags);
        stringBuilder0.append(", commentPermit=");
        wb.a.j(stringBuilder0, this.commentPermit, ", reserveType=", this.reserveType, ", reserveTime=");
        stringBuilder0.append(this.reserveTime);
        stringBuilder0.append(", categoryId=");
        stringBuilder0.append(this.categoryId);
        stringBuilder0.append(", categoryName=");
        stringBuilder0.append(this.categoryName);
        stringBuilder0.append(", daumLikeId=");
        stringBuilder0.append(this.daumLikeId);
        stringBuilder0.append(", daumLikeName=");
        androidx.room.a.w(stringBuilder0, this.daumLikeName, ", passwordString=", this.passwordString, ", published=");
        stringBuilder0.append(this.published);
        stringBuilder0.append(", updatedAt=");
        stringBuilder0.append(this.updatedAt);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

