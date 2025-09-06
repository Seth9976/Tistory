package com.kakao.tistory.presentation.editor.contract;

import com.kakao.tistory.domain.blog.entity.EntryCategoryVisibilityType;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.domain.entity.CategoryItem;
import com.kakao.tistory.domain.entity.entry.ChallengeRequirements;
import com.kakao.tistory.domain.entity.entry.DaumLikeItem;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel.ReservedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u001D\u0010\b\u001A\u00020\u0007*\u0004\u0018\u00010\u00042\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001A\u001D\u0010\b\u001A\u00020\u0007*\u0004\u0018\u00010\n2\b\u0010\f\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\b\u0010\r\u001A\u001D\u0010\b\u001A\u00020\u0007*\u0004\u0018\u00010\u000E2\b\u0010\u0006\u001A\u0004\u0018\u00010\u000F¢\u0006\u0004\b\b\u0010\u0010\u001A\u001B\u0010\b\u001A\u00020\u0007*\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001A\u00020\u0007¢\u0006\u0004\b\b\u0010\u0013\u001A\u001D\u0010\b\u001A\u00020\u0007*\u0004\u0018\u00010\u00112\b\u0010\u0012\u001A\u0004\u0018\u00010\u0014¢\u0006\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/ChallengeRequirements;", "Lcom/kakao/tistory/presentation/editor/contract/EditorChallenge;", "toEditorChallenge", "(Lcom/kakao/tistory/domain/entity/entry/ChallengeRequirements;)Lcom/kakao/tistory/presentation/editor/contract/EditorChallenge;", "Lcom/kakao/tistory/presentation/editor/contract/Category;", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "category", "", "isValid", "(Lcom/kakao/tistory/presentation/editor/contract/Category;Lcom/kakao/tistory/domain/entity/CategoryItem;)Z", "Lcom/kakao/tistory/presentation/editor/contract/Visibility;", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "visibility", "(Lcom/kakao/tistory/presentation/editor/contract/Visibility;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;)Z", "Lcom/kakao/tistory/presentation/editor/contract/ServiceCategory;", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;", "(Lcom/kakao/tistory/presentation/editor/contract/ServiceCategory;Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;)Z", "Lcom/kakao/tistory/presentation/editor/contract/Reservation;", "reservation", "(Lcom/kakao/tistory/presentation/editor/contract/Reservation;Z)Z", "Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel$ReservedType;", "(Lcom/kakao/tistory/presentation/editor/contract/Reservation;Lcom/kakao/tistory/presentation/viewmodel/EditorViewModel$ReservedType;)Z", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class EditorChallengeKt {
    public static final boolean isValid(@Nullable Category category0, @Nullable CategoryItem categoryItem0) {
        return !Intrinsics.areEqual(category0, () -> string.label_toast_challenge_visibility_required) || categoryItem0 == null || categoryItem0.getVisibility() == EntryCategoryVisibilityType.PUBLIC.getValue();
    }

    public static final boolean isValid(@Nullable Reservation reservation0, @Nullable ReservedType editorViewModel$ReservedType0) {
        return !Intrinsics.areEqual(reservation0, () -> string.label_toast_challenge_publish_required) || editorViewModel$ReservedType0 != ReservedType.RESERVE;
    }

    // 去混淆评级： 低(20)
    public static final boolean isValid(@Nullable Reservation reservation0, boolean z) {
        return !Intrinsics.areEqual(reservation0, () -> string.label_toast_challenge_publish_required) || !z;
    }

    // 去混淆评级： 低(20)
    public static final boolean isValid(@Nullable ServiceCategory serviceCategory0, @Nullable DaumLikeItem daumLikeItem0) {
        return !Intrinsics.areEqual(serviceCategory0, Anything.INSTANCE) || daumLikeItem0 != null && daumLikeItem0.getId() != -3;
    }

    public static final boolean isValid(@Nullable Visibility visibility0, @Nullable EntryVisibilityType entryVisibilityType0) {
        return !Intrinsics.areEqual(visibility0, () -> string.label_toast_challenge_visibility_required) || entryVisibilityType0 == EntryVisibilityType.PUBLIC;
    }

    @Nullable
    public static final EditorChallenge toEditorChallenge(@NotNull ChallengeRequirements challengeRequirements0) {
        Intrinsics.checkNotNullParameter(challengeRequirements0, "<this>");
        EditorChallenge editorChallenge0 = null;
        if(challengeRequirements0.isActivity() || challengeRequirements0.getCanAddActivity()) {
            String s = challengeRequirements0.getChallengeCode();
            List list0 = challengeRequirements0.getTagList();
            String s1 = challengeRequirements0.getTagLabel();
            Public category$Public0 = Intrinsics.areEqual(challengeRequirements0.getCategory(), "PUBLIC") ? () -> string.label_toast_challenge_visibility_required : null;
            com.kakao.tistory.presentation.editor.contract.Visibility.Public visibility$Public0 = Intrinsics.areEqual(challengeRequirements0.getVisibility(), "PUBLIC") ? () -> string.label_toast_challenge_visibility_required : null;
            Anything serviceCategory$Anything0 = Intrinsics.areEqual(challengeRequirements0.getServiceCategory(), "ANY") ? Anything.INSTANCE : null;
            if(!challengeRequirements0.getAllowReservation()) {
                editorChallenge0 = () -> string.label_toast_challenge_publish_required;
            }
            return new EditorChallenge(s, list0, s1, category$Public0, visibility$Public0, serviceCategory$Anything0, ((Reservation)editorChallenge0));
        }
        return null;
    }
}

