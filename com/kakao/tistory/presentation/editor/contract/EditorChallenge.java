package com.kakao.tistory.presentation.editor.contract;

import a5.b;
import androidx.compose.runtime.Immutable;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.domain.entity.CategoryItem;
import com.kakao.tistory.presentation.common.graph.a;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel.ReservedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u001A\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\r\u00A2\u0006\u0004\b\u000F\u0010\u0010J+\u0010\u0015\u001A\u00020\u00142\b\u0010\b\u001A\u0004\u0018\u00010\u00112\b\u0010\n\u001A\u0004\u0018\u00010\u00122\b\u0010\u000E\u001A\u0004\u0018\u00010\u0013\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0018J\u0012\u0010\u001C\u001A\u0004\u0018\u00010\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0012\u0010\u001E\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0012\u0010 \u001A\u0004\u0018\u00010\u000BH\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J\u0012\u0010\"\u001A\u0004\u0018\u00010\rH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#Jd\u0010$\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\rH\u00C6\u0001\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\u0018J\u0010\u0010(\u001A\u00020\'H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010)J\u001A\u0010+\u001A\u00020\u00142\b\u0010*\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u0018R\u001D\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001AR\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b3\u0010.\u001A\u0004\b4\u0010\u0018R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00078\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u001DR\u0019\u0010\n\u001A\u0004\u0018\u00010\t8\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010\u001FR\u0019\u0010\f\u001A\u0004\u0018\u00010\u000B8\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010!R\u0019\u0010\u000E\u001A\u0004\u0018\u00010\r8\u0006\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b@\u0010#\u00A8\u0006A"}, d2 = {"Lcom/kakao/tistory/presentation/editor/contract/EditorChallenge;", "", "", "challengeCode", "", "tagList", "tagLabel", "Lcom/kakao/tistory/presentation/editor/contract/Category;", "category", "Lcom/kakao/tistory/presentation/editor/contract/Visibility;", "visibility", "Lcom/kakao/tistory/presentation/editor/contract/ServiceCategory;", "serviceCategory", "Lcom/kakao/tistory/presentation/editor/contract/Reservation;", "reservation", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/kakao/tistory/presentation/editor/contract/Category;Lcom/kakao/tistory/presentation/editor/contract/Visibility;Lcom/kakao/tistory/presentation/editor/contract/ServiceCategory;Lcom/kakao/tistory/presentation/editor/contract/Reservation;)V", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel$ReservedType;", "", "areGeneralRequirementsValid", "(Lcom/kakao/tistory/domain/entity/CategoryItem;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel$ReservedType;)Z", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/kakao/tistory/presentation/editor/contract/Category;", "component5", "()Lcom/kakao/tistory/presentation/editor/contract/Visibility;", "component6", "()Lcom/kakao/tistory/presentation/editor/contract/ServiceCategory;", "component7", "()Lcom/kakao/tistory/presentation/editor/contract/Reservation;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/kakao/tistory/presentation/editor/contract/Category;Lcom/kakao/tistory/presentation/editor/contract/Visibility;Lcom/kakao/tistory/presentation/editor/contract/ServiceCategory;Lcom/kakao/tistory/presentation/editor/contract/Reservation;)Lcom/kakao/tistory/presentation/editor/contract/EditorChallenge;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getChallengeCode", "b", "Ljava/util/List;", "getTagList", "c", "getTagLabel", "d", "Lcom/kakao/tistory/presentation/editor/contract/Category;", "getCategory", "e", "Lcom/kakao/tistory/presentation/editor/contract/Visibility;", "getVisibility", "f", "Lcom/kakao/tistory/presentation/editor/contract/ServiceCategory;", "getServiceCategory", "g", "Lcom/kakao/tistory/presentation/editor/contract/Reservation;", "getReservation", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EditorChallenge {
    public static final int $stable;
    public final String a;
    public final List b;
    public final String c;
    public final Category d;
    public final Visibility e;
    public final ServiceCategory f;
    public final Reservation g;

    public EditorChallenge(@NotNull String s, @NotNull List list0, @NotNull String s1, @Nullable Category category0, @Nullable Visibility visibility0, @Nullable ServiceCategory serviceCategory0, @Nullable Reservation reservation0) {
        Intrinsics.checkNotNullParameter(s, "challengeCode");
        Intrinsics.checkNotNullParameter(list0, "tagList");
        Intrinsics.checkNotNullParameter(s1, "tagLabel");
        super();
        this.a = s;
        this.b = list0;
        this.c = s1;
        this.d = category0;
        this.e = visibility0;
        this.f = serviceCategory0;
        this.g = reservation0;
    }

    // 去混淆评级： 低(30)
    public final boolean areGeneralRequirementsValid(@Nullable CategoryItem categoryItem0, @Nullable EntryVisibilityType entryVisibilityType0, @Nullable ReservedType editorViewModel$ReservedType0) {
        return EditorChallengeKt.isValid(this.d, categoryItem0) && EditorChallengeKt.isValid(this.e, entryVisibilityType0) && EditorChallengeKt.isValid(this.g, editorViewModel$ReservedType0);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final List component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    @Nullable
    public final Category component4() {
        return this.d;
    }

    @Nullable
    public final Visibility component5() {
        return this.e;
    }

    @Nullable
    public final ServiceCategory component6() {
        return this.f;
    }

    @Nullable
    public final Reservation component7() {
        return this.g;
    }

    @NotNull
    public final EditorChallenge copy(@NotNull String s, @NotNull List list0, @NotNull String s1, @Nullable Category category0, @Nullable Visibility visibility0, @Nullable ServiceCategory serviceCategory0, @Nullable Reservation reservation0) {
        Intrinsics.checkNotNullParameter(s, "challengeCode");
        Intrinsics.checkNotNullParameter(list0, "tagList");
        Intrinsics.checkNotNullParameter(s1, "tagLabel");
        return new EditorChallenge(s, list0, s1, category0, visibility0, serviceCategory0, reservation0);
    }

    public static EditorChallenge copy$default(EditorChallenge editorChallenge0, String s, List list0, String s1, Category category0, Visibility visibility0, ServiceCategory serviceCategory0, Reservation reservation0, int v, Object object0) {
        if((v & 1) != 0) {
            s = editorChallenge0.a;
        }
        if((v & 2) != 0) {
            list0 = editorChallenge0.b;
        }
        if((v & 4) != 0) {
            s1 = editorChallenge0.c;
        }
        if((v & 8) != 0) {
            category0 = editorChallenge0.d;
        }
        if((v & 16) != 0) {
            visibility0 = editorChallenge0.e;
        }
        if((v & 0x20) != 0) {
            serviceCategory0 = editorChallenge0.f;
        }
        if((v & 0x40) != 0) {
            reservation0 = editorChallenge0.g;
        }
        return editorChallenge0.copy(s, list0, s1, category0, visibility0, serviceCategory0, reservation0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof EditorChallenge)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((EditorChallenge)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((EditorChallenge)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((EditorChallenge)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((EditorChallenge)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((EditorChallenge)object0).e)) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((EditorChallenge)object0).f) ? Intrinsics.areEqual(this.g, ((EditorChallenge)object0).g) : false;
    }

    @Nullable
    public final Category getCategory() {
        return this.d;
    }

    @NotNull
    public final String getChallengeCode() {
        return this.a;
    }

    @Nullable
    public final Reservation getReservation() {
        return this.g;
    }

    @Nullable
    public final ServiceCategory getServiceCategory() {
        return this.f;
    }

    @NotNull
    public final String getTagLabel() {
        return this.c;
    }

    @NotNull
    public final List getTagList() {
        return this.b;
    }

    @Nullable
    public final Visibility getVisibility() {
        return this.e;
    }

    @Override
    public int hashCode() {
        int v = a.a(this.c, b.c(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F);
        int v1 = 0;
        int v2 = this.d == null ? 0 : this.d.hashCode();
        int v3 = this.e == null ? 0 : this.e.hashCode();
        int v4 = this.f == null ? 0 : this.f.hashCode();
        Reservation reservation0 = this.g;
        if(reservation0 != null) {
            v1 = reservation0.hashCode();
        }
        return (((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1;
    }

    @Override
    @NotNull
    public String toString() {
        return "EditorChallenge(challengeCode=" + this.a + ", tagList=" + this.b + ", tagLabel=" + this.c + ", category=" + this.d + ", visibility=" + this.e + ", serviceCategory=" + this.f + ", reservation=" + this.g + ")";
    }
}

