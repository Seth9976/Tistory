package com.kakao.tistory.domain.entity.entry;

import androidx.room.a;
import com.kakao.tistory.domain.blog.entity.b;
import com.kakao.tistory.domain.blog.entity.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u001D\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001A\u00020\u000B\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u000B\u0012\u0006\u0010\u000E\u001A\u00020\u000B\u00A2\u0006\u0002\u0010\u000FJ\t\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001C\u001A\u00020\u000BH\u00C6\u0003J\u000F\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00C6\u0003J\t\u0010\u001E\u001A\u00020\u0003H\u00C6\u0003J\u000B\u0010\u001F\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010 \u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\u000B\u0010!\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003J\t\u0010\"\u001A\u00020\u000BH\u00C6\u0003J\t\u0010#\u001A\u00020\u000BH\u00C6\u0003J\t\u0010$\u001A\u00020\u000BH\u00C6\u0003Jy\u0010%\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u000BH\u00C6\u0001J\u0013\u0010&\u001A\u00020\u000B2\b\u0010\'\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010(\u001A\u00020)H\u00D6\u0001J\t\u0010*\u001A\u00020\u0003H\u00D6\u0001R\u0011\u0010\n\u001A\u00020\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000E\u001A\u00020\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0014R\u0011\u0010\r\u001A\u00020\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u0011R\u0011\u0010\f\u001A\u00020\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u0011R\u0013\u0010\t\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u0014\u00A8\u0006+"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/ChallengeRequirements;", "", "challengeCode", "", "tagList", "", "tagLabel", "category", "visibility", "serviceCategory", "allowReservation", "", "isPostedToday", "isActivity", "canAddActivity", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "getAllowReservation", "()Z", "getCanAddActivity", "getCategory", "()Ljava/lang/String;", "getChallengeCode", "getServiceCategory", "getTagLabel", "getTagList", "()Ljava/util/List;", "getVisibility", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ChallengeRequirements {
    private final boolean allowReservation;
    private final boolean canAddActivity;
    @Nullable
    private final String category;
    @NotNull
    private final String challengeCode;
    private final boolean isActivity;
    private final boolean isPostedToday;
    @Nullable
    private final String serviceCategory;
    @NotNull
    private final String tagLabel;
    @NotNull
    private final List tagList;
    @Nullable
    private final String visibility;

    public ChallengeRequirements(@NotNull String s, @NotNull List list0, @NotNull String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, boolean z, boolean z1, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(s, "challengeCode");
        Intrinsics.checkNotNullParameter(list0, "tagList");
        Intrinsics.checkNotNullParameter(s1, "tagLabel");
        super();
        this.challengeCode = s;
        this.tagList = list0;
        this.tagLabel = s1;
        this.category = s2;
        this.visibility = s3;
        this.serviceCategory = s4;
        this.allowReservation = z;
        this.isPostedToday = z1;
        this.isActivity = z2;
        this.canAddActivity = z3;
    }

    @NotNull
    public final String component1() {
        return this.challengeCode;
    }

    public final boolean component10() {
        return this.canAddActivity;
    }

    @NotNull
    public final List component2() {
        return this.tagList;
    }

    @NotNull
    public final String component3() {
        return this.tagLabel;
    }

    @Nullable
    public final String component4() {
        return this.category;
    }

    @Nullable
    public final String component5() {
        return this.visibility;
    }

    @Nullable
    public final String component6() {
        return this.serviceCategory;
    }

    public final boolean component7() {
        return this.allowReservation;
    }

    public final boolean component8() {
        return this.isPostedToday;
    }

    public final boolean component9() {
        return this.isActivity;
    }

    @NotNull
    public final ChallengeRequirements copy(@NotNull String s, @NotNull List list0, @NotNull String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, boolean z, boolean z1, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(s, "challengeCode");
        Intrinsics.checkNotNullParameter(list0, "tagList");
        Intrinsics.checkNotNullParameter(s1, "tagLabel");
        return new ChallengeRequirements(s, list0, s1, s2, s3, s4, z, z1, z2, z3);
    }

    public static ChallengeRequirements copy$default(ChallengeRequirements challengeRequirements0, String s, List list0, String s1, String s2, String s3, String s4, boolean z, boolean z1, boolean z2, boolean z3, int v, Object object0) {
        String s5 = (v & 1) == 0 ? s : challengeRequirements0.challengeCode;
        List list1 = (v & 2) == 0 ? list0 : challengeRequirements0.tagList;
        String s6 = (v & 4) == 0 ? s1 : challengeRequirements0.tagLabel;
        String s7 = (v & 8) == 0 ? s2 : challengeRequirements0.category;
        String s8 = (v & 16) == 0 ? s3 : challengeRequirements0.visibility;
        String s9 = (v & 0x20) == 0 ? s4 : challengeRequirements0.serviceCategory;
        boolean z4 = (v & 0x40) == 0 ? z : challengeRequirements0.allowReservation;
        boolean z5 = (v & 0x80) == 0 ? z1 : challengeRequirements0.isPostedToday;
        boolean z6 = (v & 0x100) == 0 ? z2 : challengeRequirements0.isActivity;
        return (v & 0x200) == 0 ? challengeRequirements0.copy(s5, list1, s6, s7, s8, s9, z4, z5, z6, z3) : challengeRequirements0.copy(s5, list1, s6, s7, s8, s9, z4, z5, z6, challengeRequirements0.canAddActivity);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ChallengeRequirements)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.challengeCode, ((ChallengeRequirements)object0).challengeCode)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.tagList, ((ChallengeRequirements)object0).tagList)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.tagLabel, ((ChallengeRequirements)object0).tagLabel)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.category, ((ChallengeRequirements)object0).category)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.visibility, ((ChallengeRequirements)object0).visibility)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.serviceCategory, ((ChallengeRequirements)object0).serviceCategory)) {
            return false;
        }
        if(this.allowReservation != ((ChallengeRequirements)object0).allowReservation) {
            return false;
        }
        if(this.isPostedToday != ((ChallengeRequirements)object0).isPostedToday) {
            return false;
        }
        return this.isActivity == ((ChallengeRequirements)object0).isActivity ? this.canAddActivity == ((ChallengeRequirements)object0).canAddActivity : false;
    }

    public final boolean getAllowReservation() {
        return this.allowReservation;
    }

    public final boolean getCanAddActivity() {
        return this.canAddActivity;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getChallengeCode() {
        return this.challengeCode;
    }

    @Nullable
    public final String getServiceCategory() {
        return this.serviceCategory;
    }

    @NotNull
    public final String getTagLabel() {
        return this.tagLabel;
    }

    @NotNull
    public final List getTagList() {
        return this.tagList;
    }

    @Nullable
    public final String getVisibility() {
        return this.visibility;
    }

    @Override
    public int hashCode() {
        int v = b.a(this.tagLabel, a5.b.c(this.tagList, this.challengeCode.hashCode() * 0x1F, 0x1F), 0x1F);
        int v1 = 0;
        int v2 = this.category == null ? 0 : this.category.hashCode();
        int v3 = this.visibility == null ? 0 : this.visibility.hashCode();
        String s = this.serviceCategory;
        if(s != null) {
            v1 = s.hashCode();
        }
        return Boolean.hashCode(this.canAddActivity) + c.a(this.isActivity, c.a(this.isPostedToday, c.a(this.allowReservation, (((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    public final boolean isActivity() {
        return this.isActivity;
    }

    public final boolean isPostedToday() {
        return this.isPostedToday;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ChallengeRequirements(challengeCode=");
        stringBuilder0.append(this.challengeCode);
        stringBuilder0.append(", tagList=");
        stringBuilder0.append(this.tagList);
        stringBuilder0.append(", tagLabel=");
        a.w(stringBuilder0, this.tagLabel, ", category=", this.category, ", visibility=");
        a.w(stringBuilder0, this.visibility, ", serviceCategory=", this.serviceCategory, ", allowReservation=");
        stringBuilder0.append(this.allowReservation);
        stringBuilder0.append(", isPostedToday=");
        stringBuilder0.append(this.isPostedToday);
        stringBuilder0.append(", isActivity=");
        stringBuilder0.append(this.isActivity);
        stringBuilder0.append(", canAddActivity=");
        stringBuilder0.append(this.canAddActivity);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }
}

