package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\u000BJ\r\u0010\f\u001A\u00020\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0015\u0010\u000E\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u0006¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u000FJ\r\u0010\u0015\u001A\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0004J\r\u0010\u0016\u001A\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\r\u0010\u0017\u001A\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\r\u0010\u0018\u001A\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u0015\u0010\u001A\u001A\u00020\u00022\u0006\u0010\u0019\u001A\u00020\u0006¢\u0006\u0004\b\u001A\u0010\u000FR\u001A\u0010\u001B\u001A\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u001A\u0010\u001F\u001A\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u001F\u0010\u001C\u001A\u0004\b \u0010\u001E¨\u0006!"}, d2 = {"Lcom/kakao/tistory/presentation/view/editor/EditorSettingTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "trackPage", "()V", "trackClickOpenCategory", "", "setNum", "orderNum", "itemName", "trackClickCategoryItem", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "trackClickOpenHomeSubject", "name", "trackClickHomeSubject", "(Ljava/lang/String;)V", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "entryVisibilityType", "trackClickVisibility", "(Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;)V", "trackClickReservedType", "trackClickPublish", "trackPageChallengeServiceCategoryDialog", "trackClickChallengeServiceCategory", "trackClickChallengeServiceCategoryContinue", "title", "trackClickAddChallengeTag", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EditorSettingTiara implements TiaraPage {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[EntryVisibilityType.values().length];
            try {
                arr_v[EntryVisibilityType.PUBLIC.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EntryVisibilityType.PROTECTED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EntryVisibilityType.PRIVATE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    @NotNull
    public static final EditorSettingTiara INSTANCE;

    static {
        EditorSettingTiara.INSTANCE = new EditorSettingTiara();
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackClickAddChallengeTag(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "title");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "태그 추가 버튼", null, null, null, null, null, s, null, null, null, 958, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "발행설정", TistoryTiaraActionType.CLICK_CHALLENGE_ADD_TAG, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickCategoryItem(@NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "setNum");
        Intrinsics.checkNotNullParameter(s1, "orderNum");
        Intrinsics.checkNotNullParameter(s2, "itemName");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, s, s1, s2, null, null, null, 0x38F, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "발행설정", TistoryTiaraActionType.CLICK_CATEGORY_ITEM, null, click0, null, null, null, 0xE8, null);
    }

    public static void trackClickCategoryItem$default(EditorSettingTiara editorSettingTiara0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = "0";
        }
        if((v & 2) != 0) {
            s1 = "0";
        }
        editorSettingTiara0.trackClickCategoryItem(s, s1, s2);
    }

    public final void trackClickChallengeServiceCategory() {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "홈주제 선택 레이어", "홈주제 선택하기", null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "발행설정", TistoryTiaraActionType.CLICK_CHALLENGE_SERVICE_CATEGORY, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickChallengeServiceCategoryContinue() {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "홈주제 선택 레이어", "그대로 발행하기", null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "발행설정", TistoryTiaraActionType.CLICK_CHALLENGE_SERVICE_CATEGORY_CONTINUE, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickHomeSubject(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, s, null, null, null, 0x3BF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "발행설정", TistoryTiaraActionType.CLICK_HOME_SUBJECT, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickOpenCategory() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "발행설정", TistoryTiaraActionType.CLICK_CATEGORY, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickOpenHomeSubject() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "발행설정", TistoryTiaraActionType.CLICK_HOME_SUBJECT_SELECTOR, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickPublish() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "발행설정", TistoryTiaraActionType.CLICK_PUBLISH, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickReservedType(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, s, null, null, null, 0x3BF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "발행설정", TistoryTiaraActionType.CLICK_PUBLISH_DATE, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickVisibility(@NotNull EntryVisibilityType entryVisibilityType0) {
        TistoryTiaraActionType tistoryTiaraActionType0;
        Intrinsics.checkNotNullParameter(entryVisibilityType0, "entryVisibilityType");
        switch(WhenMappings.$EnumSwitchMapping$0[entryVisibilityType0.ordinal()]) {
            case 1: {
                tistoryTiaraActionType0 = TistoryTiaraActionType.CLICK_VISIBILITY_PUBLIC;
                break;
            }
            case 2: {
                tistoryTiaraActionType0 = TistoryTiaraActionType.CLICK_VISIBILITY_PROTECTED;
                break;
            }
            case 3: {
                tistoryTiaraActionType0 = TistoryTiaraActionType.CLICK_VISIBILITY_PRIVATE;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, tistoryTiaraActionType0.getType(), null, null, null, 0x3BF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "발행설정", TistoryTiaraActionType.CLICK_VISIBILITY_SETTING, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackPage() {
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, "에디터", "발행설정", null, null, null, null, null, 0x7C, null);
    }

    // 去混淆评级： 低(20)
    public final void trackPageChallengeServiceCategoryDialog() {
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, "에디터", "발행설정", "홈주제 선택 안내_보기", null, null, null, null, 120, null);
    }
}

