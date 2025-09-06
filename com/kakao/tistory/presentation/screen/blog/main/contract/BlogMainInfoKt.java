package com.kakao.tistory.presentation.screen.blog.main.contract;

import androidx.compose.ui.graphics.Color;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.domain.blog.entity.BlogRoleType;
import com.kakao.tistory.domain.blog.entity.LogoGradation;
import com.kakao.tistory.domain.blog.entity.StoryCreator;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u0004\u0018\u00010\u0000\u00A2\u0006\u0004\b\u0002\u0010\u0003\u001A\u0013\u0010\u0004\u001A\u00020\u0001*\u0004\u0018\u00010\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0003\u001A\u0086\u0003\u0010$\u001A\u00020\u0000*\u00020\u00052\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0018\u0010\f\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u000B2\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00062\u0018\u0010\u0013\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u000B2\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\b0\u00142\u0012\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\b0\u00142\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\b0\u00142\'\u0010\u001D\u001A#\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u001A\u0012\b\b\u001B\u0012\u0004\b\b(\u001C\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000B2\'\u0010\u001E\u001A#\u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u001A\u0012\b\b\u001B\u0012\u0004\b\b(\u001C\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u000B2K\u0010#\u001AG\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\u001A\u0012\b\b\u001B\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0019\u00A2\u0006\f\b\u001A\u0012\b\b\u001B\u0012\u0004\b\b(\u001C\u0012\u0013\u0012\u00110!\u00A2\u0006\f\b\u001A\u0012\b\b\u001B\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\b0\u001F\u00A2\u0006\u0004\b$\u0010%\u00A8\u0006&"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;", "Landroidx/compose/ui/graphics/Color;", "topGradientStartColor", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;)J", "topGradientEndColor", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "Lkotlin/Function1;", "", "", "onClickFollowerCount", "onClickFollowingCount", "Lkotlin/Function2;", "onClickStoryCreator", "Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "onClickBlogSetting", "Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;", "onClickGuestBook", "", "onClickFollow", "onClickShare", "Lkotlin/Function0;", "onClickBack", "onClickSearch", "onClickMyBlog", "onClickOthersBlog", "", "Lkotlin/ParameterName;", "name", "blogId", "onClickBlockMenu", "onConfirmBlockChange", "Lkotlin/Function3;", "blogName", "Lcom/kakao/tistory/presentation/viewmodel/BlogTopReportData;", "reportData", "onClickReport", "toBlogMainInfo", "(Lcom/kakao/tistory/domain/blog/entity/BlogInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainInfoKt {
    @NotNull
    public static final BlogMainInfo toBlogMainInfo(@NotNull BlogInfo blogInfo0, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function2 function20, @NotNull Function1 function12, @NotNull Function1 function13, @NotNull Function1 function14, @NotNull Function2 function21, @NotNull Function0 function00, @NotNull Function1 function15, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function2 function22, @NotNull Function2 function23, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(blogInfo0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "onClickFollowerCount");
        Intrinsics.checkNotNullParameter(function11, "onClickFollowingCount");
        Intrinsics.checkNotNullParameter(function20, "onClickStoryCreator");
        Intrinsics.checkNotNullParameter(function12, "onClickBlogSetting");
        Intrinsics.checkNotNullParameter(function13, "onClickGuestBook");
        Intrinsics.checkNotNullParameter(function14, "onClickFollow");
        Intrinsics.checkNotNullParameter(function21, "onClickShare");
        Intrinsics.checkNotNullParameter(function00, "onClickBack");
        Intrinsics.checkNotNullParameter(function15, "onClickSearch");
        Intrinsics.checkNotNullParameter(function01, "onClickMyBlog");
        Intrinsics.checkNotNullParameter(function02, "onClickOthersBlog");
        Intrinsics.checkNotNullParameter(function22, "onClickBlockMenu");
        Intrinsics.checkNotNullParameter(function23, "onConfirmBlockChange");
        Intrinsics.checkNotNullParameter(function30, "onClickReport");
        String s = null;
        String s1 = blogInfo0.getName();
        BlogRoleType blogRoleType0 = blogInfo0.getRole();
        StoryCreator storyCreator0 = blogInfo0.getStoryCreator();
        com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo.StoryCreator blogMainInfo$StoryCreator0 = storyCreator0 == null ? null : new com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo.StoryCreator(storyCreator0.getLabel(), new l0(function20, storyCreator0));
        String s2 = blogInfo0.getTitle();
        boolean z = blogInfo0.isBlocked();
        int v = blogInfo0.getFollowerCount();
        boolean z1 = blogInfo0.isBlocking();
        String s3 = blogInfo0.getDescription();
        boolean z2 = blogInfo0.getAllowWriteOnGuestbook() || blogInfo0.getGuestbookCommentCount() > 0;
        boolean z3 = blogInfo0.isFollowing();
        String s4 = blogInfo0.getLogoImageUrl();
        StringUtils stringUtils0 = StringUtils.INSTANCE;
        LogoGradation logoGradation0 = blogInfo0.getLogoGradation();
        Color color0 = stringUtils0.toColorOrNull-ijrfgN4((logoGradation0 == null ? null : logoGradation0.getFrom()));
        LogoGradation logoGradation1 = blogInfo0.getLogoGradation();
        if(logoGradation1 != null) {
            s = logoGradation1.getTo();
        }
        Color color1 = stringUtils0.toColorOrNull-ijrfgN4(s);
        return new Others(s1, blogRoleType0, blogMainInfo$StoryCreator0, s2, s3, new i0(function21, blogInfo0), z, v, z3, function14, z1, new j0(function22, blogInfo0), new k0(function23, blogInfo0), true, new z(blogInfo0, function30), z2, new a0(function13, blogInfo0), s4, color0, color1, function00, new b0(function15, blogInfo0), function02, null);
    }

    public static final long topGradientEndColor(@Nullable BlogMainInfo blogMainInfo0) {
        if(blogMainInfo0 != null) {
            Color color0 = blogMainInfo0.getGradientEndColor-QN2ZGVo();
            return color0 == null ? 0L : color0.unbox-impl();
        }
        return 0L;
    }

    public static final long topGradientStartColor(@Nullable BlogMainInfo blogMainInfo0) {
        if(blogMainInfo0 != null) {
            Color color0 = blogMainInfo0.getGradientStartColor-QN2ZGVo();
            return color0 == null ? 0L : color0.unbox-impl();
        }
        return 0L;
    }
}

