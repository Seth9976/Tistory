package com.kakao.tistory.domain.entity.entry;

import com.google.gson.JsonObject;
import com.kakao.tistory.domain.blog.entity.a;
import com.kakao.tistory.domain.blog.entity.b;
import com.kakao.tistory.domain.entity.CategoryItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0086\b\u0018\u0000 I2\u00020\u0001:\u0001IB\u0095\u0001\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001A\u00020\u000B\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u000E\u001A\u00020\u0005\u0012\u0006\u0010\u000F\u001A\u00020\u0010\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\u0006\u0010\u0012\u001A\u00020\u0003\u0012\u0006\u0010\u0013\u001A\u00020\u0003\u0012\u0006\u0010\u0014\u001A\u00020\u0003\u0012\b\u0010\u0015\u001A\u0004\u0018\u00010\u0005\u0012\u000E\u0010\u0016\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017\u0012\b\u0010\u0018\u001A\u0004\u0018\u00010\u0019\u00A2\u0006\u0002\u0010\u001AJ\t\u00103\u001A\u00020\u0003H\u00C6\u0003J\t\u00104\u001A\u00020\u0010H\u00C6\u0003J\t\u00105\u001A\u00020\u0003H\u00C6\u0003J\t\u00106\u001A\u00020\u0003H\u00C6\u0003J\t\u00107\u001A\u00020\u0003H\u00C6\u0003J\u000B\u00108\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u0011\u00109\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017H\u00C6\u0003J\u000B\u0010:\u001A\u0004\u0018\u00010\u0019H\u00C6\u0003J\t\u0010;\u001A\u00020\u0005H\u00C6\u0003J\t\u0010<\u001A\u00020\u0005H\u00C6\u0003J\u000B\u0010=\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003J\u000B\u0010>\u001A\u0004\u0018\u00010\tH\u00C6\u0003J\t\u0010?\u001A\u00020\u000BH\u00C6\u0003J\t\u0010@\u001A\u00020\rH\u00C6\u0003J\t\u0010A\u001A\u00020\u0005H\u00C6\u0003J\t\u0010B\u001A\u00020\u0010H\u00C6\u0003J\u00B9\u0001\u0010C\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u00052\b\b\u0002\u0010\u000F\u001A\u00020\u00102\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u00032\b\b\u0002\u0010\u0013\u001A\u00020\u00032\b\b\u0002\u0010\u0014\u001A\u00020\u00032\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0016\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0019H\u00C6\u0001J\u0013\u0010D\u001A\u00020E2\b\u0010F\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010G\u001A\u00020\u0003H\u00D6\u0001J\t\u0010H\u001A\u00020\u0005H\u00D6\u0001R\u0011\u0010\u0012\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u001CR\u0013\u0010\b\u001A\u0004\u0018\u00010\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001D\u0010\u001ER\u0011\u0010\u0013\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001F\u0010\u001CR\u0011\u0010\u0014\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b \u0010\u001CR\u0011\u0010\f\u001A\u00020\r\u00A2\u0006\b\n\u0000\u001A\u0004\b!\u0010\"R\u0013\u0010\u0018\u001A\u0004\u0018\u00010\u0019\u00A2\u0006\b\n\u0000\u001A\u0004\b#\u0010$R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b%\u0010\u001CR\u0011\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\b\n\u0000\u001A\u0004\b&\u0010\'R\u0011\u0010\u000E\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b(\u0010)R\u0011\u0010\u000F\u001A\u00020\u0010\u00A2\u0006\b\n\u0000\u001A\u0004\b*\u0010\'R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b+\u0010)R\u0019\u0010\u0016\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017\u00A2\u0006\b\n\u0000\u001A\u0004\b,\u0010-R\u0013\u0010\u0015\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b.\u0010)R\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b/\u0010)R\u0011\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b0\u0010)R\u0011\u0010\n\u001A\u00020\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b1\u00102\u00A8\u0006J"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/EditableEntry;", "", "id", "", "title", "", "type", "slogan", "category", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "visibility", "Lcom/kakao/tistory/domain/entity/entry/EntryVisibilityType;", "cdm", "Lcom/google/gson/JsonObject;", "password", "published", "", "modified", "acceptComment", "cclCommercial", "cclDerive", "thumbnail", "tags", "", "daumLike", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/CategoryItem;Lcom/kakao/tistory/domain/entity/entry/EntryVisibilityType;Lcom/google/gson/JsonObject;Ljava/lang/String;JJIIILjava/lang/String;Ljava/util/List;Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;)V", "getAcceptComment", "()I", "getCategory", "()Lcom/kakao/tistory/domain/entity/CategoryItem;", "getCclCommercial", "getCclDerive", "getCdm", "()Lcom/google/gson/JsonObject;", "getDaumLike", "()Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;", "getId", "getModified", "()J", "getPassword", "()Ljava/lang/String;", "getPublished", "getSlogan", "getTags", "()Ljava/util/List;", "getThumbnail", "getTitle", "getType", "getVisibility", "()Lcom/kakao/tistory/domain/entity/entry/EntryVisibilityType;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EditableEntry {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/EditableEntry$Companion;", "", "()V", "IS_ACCEPT_COMMENT", "", "IS_NOT_ACCEPT_COMMENT", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int IS_ACCEPT_COMMENT = 1;
    public static final int IS_NOT_ACCEPT_COMMENT;
    private final int acceptComment;
    @Nullable
    private final CategoryItem category;
    private final int cclCommercial;
    private final int cclDerive;
    @NotNull
    private final JsonObject cdm;
    @Nullable
    private final DaumLikeItem daumLike;
    private final int id;
    private final long modified;
    @NotNull
    private final String password;
    private final long published;
    @Nullable
    private final String slogan;
    @Nullable
    private final List tags;
    @Nullable
    private final String thumbnail;
    @NotNull
    private final String title;
    @NotNull
    private final String type;
    @NotNull
    private final EntryVisibilityType visibility;

    static {
        EditableEntry.Companion = new Companion(null);
    }

    public EditableEntry(int v, @NotNull String s, @NotNull String s1, @Nullable String s2, @Nullable CategoryItem categoryItem0, @NotNull EntryVisibilityType entryVisibilityType0, @NotNull JsonObject jsonObject0, @NotNull String s3, long v1, long v2, int v3, int v4, int v5, @Nullable String s4, @Nullable List list0, @Nullable DaumLikeItem daumLikeItem0) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s1, "type");
        Intrinsics.checkNotNullParameter(entryVisibilityType0, "visibility");
        Intrinsics.checkNotNullParameter(jsonObject0, "cdm");
        Intrinsics.checkNotNullParameter(s3, "password");
        super();
        this.id = v;
        this.title = s;
        this.type = s1;
        this.slogan = s2;
        this.category = categoryItem0;
        this.visibility = entryVisibilityType0;
        this.cdm = jsonObject0;
        this.password = s3;
        this.published = v1;
        this.modified = v2;
        this.acceptComment = v3;
        this.cclCommercial = v4;
        this.cclDerive = v5;
        this.thumbnail = s4;
        this.tags = list0;
        this.daumLike = daumLikeItem0;
    }

    public final int component1() {
        return this.id;
    }

    public final long component10() {
        return this.modified;
    }

    public final int component11() {
        return this.acceptComment;
    }

    public final int component12() {
        return this.cclCommercial;
    }

    public final int component13() {
        return this.cclDerive;
    }

    @Nullable
    public final String component14() {
        return this.thumbnail;
    }

    @Nullable
    public final List component15() {
        return this.tags;
    }

    @Nullable
    public final DaumLikeItem component16() {
        return this.daumLike;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return this.type;
    }

    @Nullable
    public final String component4() {
        return this.slogan;
    }

    @Nullable
    public final CategoryItem component5() {
        return this.category;
    }

    @NotNull
    public final EntryVisibilityType component6() {
        return this.visibility;
    }

    @NotNull
    public final JsonObject component7() {
        return this.cdm;
    }

    @NotNull
    public final String component8() {
        return this.password;
    }

    public final long component9() {
        return this.published;
    }

    @NotNull
    public final EditableEntry copy(int v, @NotNull String s, @NotNull String s1, @Nullable String s2, @Nullable CategoryItem categoryItem0, @NotNull EntryVisibilityType entryVisibilityType0, @NotNull JsonObject jsonObject0, @NotNull String s3, long v1, long v2, int v3, int v4, int v5, @Nullable String s4, @Nullable List list0, @Nullable DaumLikeItem daumLikeItem0) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s1, "type");
        Intrinsics.checkNotNullParameter(entryVisibilityType0, "visibility");
        Intrinsics.checkNotNullParameter(jsonObject0, "cdm");
        Intrinsics.checkNotNullParameter(s3, "password");
        return new EditableEntry(v, s, s1, s2, categoryItem0, entryVisibilityType0, jsonObject0, s3, v1, v2, v3, v4, v5, s4, list0, daumLikeItem0);
    }

    public static EditableEntry copy$default(EditableEntry editableEntry0, int v, String s, String s1, String s2, CategoryItem categoryItem0, EntryVisibilityType entryVisibilityType0, JsonObject jsonObject0, String s3, long v1, long v2, int v3, int v4, int v5, String s4, List list0, DaumLikeItem daumLikeItem0, int v6, Object object0) {
        int v7 = (v6 & 1) == 0 ? v : editableEntry0.id;
        String s5 = (v6 & 2) == 0 ? s : editableEntry0.title;
        String s6 = (v6 & 4) == 0 ? s1 : editableEntry0.type;
        String s7 = (v6 & 8) == 0 ? s2 : editableEntry0.slogan;
        CategoryItem categoryItem1 = (v6 & 16) == 0 ? categoryItem0 : editableEntry0.category;
        EntryVisibilityType entryVisibilityType1 = (v6 & 0x20) == 0 ? entryVisibilityType0 : editableEntry0.visibility;
        JsonObject jsonObject1 = (v6 & 0x40) == 0 ? jsonObject0 : editableEntry0.cdm;
        String s8 = (v6 & 0x80) == 0 ? s3 : editableEntry0.password;
        long v8 = (v6 & 0x100) == 0 ? v1 : editableEntry0.published;
        long v9 = (v6 & 0x200) == 0 ? v2 : editableEntry0.modified;
        int v10 = (v6 & 0x400) == 0 ? v3 : editableEntry0.acceptComment;
        int v11 = (v6 & 0x800) == 0 ? v4 : editableEntry0.cclCommercial;
        int v12 = (v6 & 0x1000) == 0 ? v5 : editableEntry0.cclDerive;
        String s9 = (v6 & 0x2000) == 0 ? s4 : editableEntry0.thumbnail;
        List list1 = (v6 & 0x4000) == 0 ? list0 : editableEntry0.tags;
        return (v6 & 0x8000) == 0 ? editableEntry0.copy(v7, s5, s6, s7, categoryItem1, entryVisibilityType1, jsonObject1, s8, v8, v9, v10, v11, v12, s9, list1, daumLikeItem0) : editableEntry0.copy(v7, s5, s6, s7, categoryItem1, entryVisibilityType1, jsonObject1, s8, v8, v9, v10, v11, v12, s9, list1, editableEntry0.daumLike);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof EditableEntry)) {
            return false;
        }
        if(this.id != ((EditableEntry)object0).id) {
            return false;
        }
        if(!Intrinsics.areEqual(this.title, ((EditableEntry)object0).title)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.type, ((EditableEntry)object0).type)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.slogan, ((EditableEntry)object0).slogan)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.category, ((EditableEntry)object0).category)) {
            return false;
        }
        if(this.visibility != ((EditableEntry)object0).visibility) {
            return false;
        }
        if(!Intrinsics.areEqual(this.cdm, ((EditableEntry)object0).cdm)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.password, ((EditableEntry)object0).password)) {
            return false;
        }
        if(this.published != ((EditableEntry)object0).published) {
            return false;
        }
        if(this.modified != ((EditableEntry)object0).modified) {
            return false;
        }
        if(this.acceptComment != ((EditableEntry)object0).acceptComment) {
            return false;
        }
        if(this.cclCommercial != ((EditableEntry)object0).cclCommercial) {
            return false;
        }
        if(this.cclDerive != ((EditableEntry)object0).cclDerive) {
            return false;
        }
        if(!Intrinsics.areEqual(this.thumbnail, ((EditableEntry)object0).thumbnail)) {
            return false;
        }
        return Intrinsics.areEqual(this.tags, ((EditableEntry)object0).tags) ? Intrinsics.areEqual(this.daumLike, ((EditableEntry)object0).daumLike) : false;
    }

    public final int getAcceptComment() {
        return this.acceptComment;
    }

    @Nullable
    public final CategoryItem getCategory() {
        return this.category;
    }

    public final int getCclCommercial() {
        return this.cclCommercial;
    }

    public final int getCclDerive() {
        return this.cclDerive;
    }

    @NotNull
    public final JsonObject getCdm() {
        return this.cdm;
    }

    @Nullable
    public final DaumLikeItem getDaumLike() {
        return this.daumLike;
    }

    public final int getId() {
        return this.id;
    }

    public final long getModified() {
        return this.modified;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    public final long getPublished() {
        return this.published;
    }

    @Nullable
    public final String getSlogan() {
        return this.slogan;
    }

    @Nullable
    public final List getTags() {
        return this.tags;
    }

    @Nullable
    public final String getThumbnail() {
        return this.thumbnail;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final EntryVisibilityType getVisibility() {
        return this.visibility;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.a(this.cclDerive, a.a(this.cclCommercial, a.a(this.acceptComment, wb.a.k(this.modified, wb.a.k(this.published, b.a(this.password, (this.cdm.hashCode() + (this.visibility.hashCode() + ((b.a(this.type, b.a(this.title, this.id * 0x1F, 0x1F), 0x1F) + (this.slogan == null ? 0 : this.slogan.hashCode())) * 0x1F + (this.category == null ? 0 : this.category.hashCode())) * 0x1F) * 0x1F) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
        int v2 = this.thumbnail == null ? 0 : this.thumbnail.hashCode();
        int v3 = this.tags == null ? 0 : this.tags.hashCode();
        DaumLikeItem daumLikeItem0 = this.daumLike;
        if(daumLikeItem0 != null) {
            v = daumLikeItem0.hashCode();
        }
        return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("EditableEntry(id=");
        stringBuilder0.append(this.id);
        stringBuilder0.append(", title=");
        stringBuilder0.append(this.title);
        stringBuilder0.append(", type=");
        androidx.room.a.w(stringBuilder0, this.type, ", slogan=", this.slogan, ", category=");
        stringBuilder0.append(this.category);
        stringBuilder0.append(", visibility=");
        stringBuilder0.append(this.visibility);
        stringBuilder0.append(", cdm=");
        stringBuilder0.append(this.cdm);
        stringBuilder0.append(", password=");
        stringBuilder0.append(this.password);
        stringBuilder0.append(", published=");
        stringBuilder0.append(this.published);
        stringBuilder0.append(", modified=");
        stringBuilder0.append(this.modified);
        stringBuilder0.append(", acceptComment=");
        r0.a.A(stringBuilder0, this.acceptComment, ", cclCommercial=", this.cclCommercial, ", cclDerive=");
        wb.a.j(stringBuilder0, this.cclDerive, ", thumbnail=", this.thumbnail, ", tags=");
        stringBuilder0.append(this.tags);
        stringBuilder0.append(", daumLike=");
        stringBuilder0.append(this.daumLike);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

