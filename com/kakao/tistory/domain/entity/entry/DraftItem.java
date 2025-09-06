package com.kakao.tistory.domain.entity.entry;

import androidx.room.a;
import com.google.gson.JsonObject;
import com.kakao.tistory.domain.blog.entity.b;
import com.kakao.tistory.domain.entity.CategoryItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001D\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000E\u001A\u00020\u0007\u0012\u0006\u0010\u000F\u001A\u00020\u0007\u00A2\u0006\u0002\u0010\u0010J\t\u0010\u001F\u001A\u00020\u0003H\u00C6\u0003J\t\u0010 \u001A\u00020\u0005H\u00C6\u0003J\u000B\u0010!\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003J\u000B\u0010\"\u001A\u0004\u0018\u00010\tH\u00C6\u0003J\u000B\u0010#\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003J\u0011\u0010$\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fH\u00C6\u0003J\u000B\u0010%\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003J\t\u0010&\u001A\u00020\u0007H\u00C6\u0003J\t\u0010\'\u001A\u00020\u0007H\u00C6\u0003Js\u0010(\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000E\u001A\u00020\u00072\b\b\u0002\u0010\u000F\u001A\u00020\u0007H\u00C6\u0001J\u0013\u0010)\u001A\u00020*2\b\u0010+\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010,\u001A\u00020-H\u00D6\u0001J\t\u0010.\u001A\u00020\u0007H\u00D6\u0001R\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001A\u0004\u0018\u00010\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000E\u001A\u00020\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u0016R\u0019\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u001BR\u0013\u0010\r\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u0016R\u0013\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001D\u0010\u0016R\u0011\u0010\u000F\u001A\u00020\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001E\u0010\u0016\u00A8\u0006/"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/DraftItem;", "", "sequence", "", "category", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "title", "", "cdm", "Lcom/google/gson/JsonObject;", "summary", "tags", "", "thumbnail", "createdAt", "updatedAt", "(JLcom/kakao/tistory/domain/entity/CategoryItem;Ljava/lang/String;Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Lcom/kakao/tistory/domain/entity/CategoryItem;", "getCdm", "()Lcom/google/gson/JsonObject;", "getCreatedAt", "()Ljava/lang/String;", "getSequence", "()J", "getSummary", "getTags", "()Ljava/util/List;", "getThumbnail", "getTitle", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DraftItem {
    @NotNull
    private final CategoryItem category;
    @Nullable
    private final JsonObject cdm;
    @NotNull
    private final String createdAt;
    private final long sequence;
    @Nullable
    private final String summary;
    @Nullable
    private final List tags;
    @Nullable
    private final String thumbnail;
    @Nullable
    private final String title;
    @NotNull
    private final String updatedAt;

    public DraftItem(long v, @NotNull CategoryItem categoryItem0, @Nullable String s, @Nullable JsonObject jsonObject0, @Nullable String s1, @Nullable List list0, @Nullable String s2, @NotNull String s3, @NotNull String s4) {
        Intrinsics.checkNotNullParameter(categoryItem0, "category");
        Intrinsics.checkNotNullParameter(s3, "createdAt");
        Intrinsics.checkNotNullParameter(s4, "updatedAt");
        super();
        this.sequence = v;
        this.category = categoryItem0;
        this.title = s;
        this.cdm = jsonObject0;
        this.summary = s1;
        this.tags = list0;
        this.thumbnail = s2;
        this.createdAt = s3;
        this.updatedAt = s4;
    }

    public DraftItem(long v, CategoryItem categoryItem0, String s, JsonObject jsonObject0, String s1, List list0, String s2, String s3, String s4, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, categoryItem0, s, jsonObject0, ((v1 & 16) == 0 ? s1 : null), ((v1 & 0x20) == 0 ? list0 : null), s2, s3, s4);
    }

    public final long component1() {
        return this.sequence;
    }

    @NotNull
    public final CategoryItem component2() {
        return this.category;
    }

    @Nullable
    public final String component3() {
        return this.title;
    }

    @Nullable
    public final JsonObject component4() {
        return this.cdm;
    }

    @Nullable
    public final String component5() {
        return this.summary;
    }

    @Nullable
    public final List component6() {
        return this.tags;
    }

    @Nullable
    public final String component7() {
        return this.thumbnail;
    }

    @NotNull
    public final String component8() {
        return this.createdAt;
    }

    @NotNull
    public final String component9() {
        return this.updatedAt;
    }

    @NotNull
    public final DraftItem copy(long v, @NotNull CategoryItem categoryItem0, @Nullable String s, @Nullable JsonObject jsonObject0, @Nullable String s1, @Nullable List list0, @Nullable String s2, @NotNull String s3, @NotNull String s4) {
        Intrinsics.checkNotNullParameter(categoryItem0, "category");
        Intrinsics.checkNotNullParameter(s3, "createdAt");
        Intrinsics.checkNotNullParameter(s4, "updatedAt");
        return new DraftItem(v, categoryItem0, s, jsonObject0, s1, list0, s2, s3, s4);
    }

    public static DraftItem copy$default(DraftItem draftItem0, long v, CategoryItem categoryItem0, String s, JsonObject jsonObject0, String s1, List list0, String s2, String s3, String s4, int v1, Object object0) {
        long v2 = (v1 & 1) == 0 ? v : draftItem0.sequence;
        CategoryItem categoryItem1 = (v1 & 2) == 0 ? categoryItem0 : draftItem0.category;
        String s5 = (v1 & 4) == 0 ? s : draftItem0.title;
        JsonObject jsonObject1 = (v1 & 8) == 0 ? jsonObject0 : draftItem0.cdm;
        String s6 = (v1 & 16) == 0 ? s1 : draftItem0.summary;
        List list1 = (v1 & 0x20) == 0 ? list0 : draftItem0.tags;
        String s7 = (v1 & 0x40) == 0 ? s2 : draftItem0.thumbnail;
        String s8 = (v1 & 0x80) == 0 ? s3 : draftItem0.createdAt;
        return (v1 & 0x100) == 0 ? draftItem0.copy(v2, categoryItem1, s5, jsonObject1, s6, list1, s7, s8, s4) : draftItem0.copy(v2, categoryItem1, s5, jsonObject1, s6, list1, s7, s8, draftItem0.updatedAt);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DraftItem)) {
            return false;
        }
        if(this.sequence != ((DraftItem)object0).sequence) {
            return false;
        }
        if(!Intrinsics.areEqual(this.category, ((DraftItem)object0).category)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.title, ((DraftItem)object0).title)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.cdm, ((DraftItem)object0).cdm)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.summary, ((DraftItem)object0).summary)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.tags, ((DraftItem)object0).tags)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.thumbnail, ((DraftItem)object0).thumbnail)) {
            return false;
        }
        return Intrinsics.areEqual(this.createdAt, ((DraftItem)object0).createdAt) ? Intrinsics.areEqual(this.updatedAt, ((DraftItem)object0).updatedAt) : false;
    }

    @NotNull
    public final CategoryItem getCategory() {
        return this.category;
    }

    @Nullable
    public final JsonObject getCdm() {
        return this.cdm;
    }

    @NotNull
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final long getSequence() {
        return this.sequence;
    }

    @Nullable
    public final String getSummary() {
        return this.summary;
    }

    @Nullable
    public final List getTags() {
        return this.tags;
    }

    @Nullable
    public final String getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public int hashCode() {
        int v = Long.hashCode(this.sequence);
        int v1 = this.category.hashCode();
        int v2 = 0;
        int v3 = this.title == null ? 0 : this.title.hashCode();
        int v4 = this.cdm == null ? 0 : this.cdm.hashCode();
        int v5 = this.summary == null ? 0 : this.summary.hashCode();
        int v6 = this.tags == null ? 0 : this.tags.hashCode();
        String s = this.thumbnail;
        if(s != null) {
            v2 = s.hashCode();
        }
        return this.updatedAt.hashCode() + b.a(this.createdAt, ((((((v1 + v * 0x1F) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v2) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DraftItem(sequence=");
        stringBuilder0.append(this.sequence);
        stringBuilder0.append(", category=");
        stringBuilder0.append(this.category);
        stringBuilder0.append(", title=");
        stringBuilder0.append(this.title);
        stringBuilder0.append(", cdm=");
        stringBuilder0.append(this.cdm);
        stringBuilder0.append(", summary=");
        stringBuilder0.append(this.summary);
        stringBuilder0.append(", tags=");
        stringBuilder0.append(this.tags);
        a.w(stringBuilder0, ", thumbnail=", this.thumbnail, ", createdAt=", this.createdAt);
        return a5.b.q(stringBuilder0, ", updatedAt=", this.updatedAt, ")");
    }
}

