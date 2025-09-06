package com.kakao.tistory.presentation.screen.blog.main.contract;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import com.kakao.tistory.domain.blog.entity.BlogRoleType;
import com.kakao.tistory.presentation.main.contract.a;
import com.kakao.tistory.presentation.main.contract.b;
import com.kakao.tistory.presentation.main.contract.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003234R\u0012\u0010\u0002\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\tR\u001A\u0010\n\u001A\u0004\u0018\u00010\u000BX\u00A6\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b\f\u0010\rR\u001A\u0010\u000E\u001A\u0004\u0018\u00010\u000BX\u00A6\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\rR\u0012\u0010\u0010\u001A\u00020\u0011X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001A\u0004\u0018\u00010\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001A\u00020\u0011X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0016\u0010\u0013R\u0012\u0010\u0017\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0018\u0010\u0005R\u0018\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u001B0\u001AX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001C\u0010\u001DR\u0018\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u001B0\u001AX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001F\u0010\u001DR\u0018\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001B0\u001AX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b!\u0010\u001DR\u0018\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u001B0\u001AX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010\u001DR\u0018\u0010$\u001A\b\u0012\u0004\u0012\u00020\u001B0\u001AX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b%\u0010\u001DR\u0012\u0010&\u001A\u00020\'X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b(\u0010)R\u0012\u0010*\u001A\u00020\u0011X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b+\u0010\u0013R\u0014\u0010,\u001A\u0004\u0018\u00010-X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b.\u0010/R\u0012\u00100\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b1\u0010\u0005\u0082\u0001\u000256\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00067"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;", "", "description", "", "getDescription", "()Ljava/lang/String;", "followerCount", "", "getFollowerCount", "()I", "gradientEndColor", "Landroidx/compose/ui/graphics/Color;", "getGradientEndColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "gradientStartColor", "getGradientStartColor-QN2ZGVo", "hasEntryEditAuth", "", "getHasEntryEditAuth", "()Z", "image", "getImage", "isMine", "name", "getName", "onClickBack", "Lkotlin/Function0;", "", "getOnClickBack", "()Lkotlin/jvm/functions/Function0;", "onClickBlog", "getOnClickBlog", "onClickGuestBook", "getOnClickGuestBook", "onClickSearch", "getOnClickSearch", "onClickShare", "getOnClickShare", "role", "Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "getRole", "()Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "showGuestBook", "getShowGuestBook", "storyCreator", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;", "getStoryCreator", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;", "title", "getTitle", "My", "Others", "StoryCreator", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$My;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$Others;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BlogMainInfo {
    @Immutable
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B\u00E7\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u000E\b\u0002\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0010\u0010\u001A\u00020\r\u0012\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u000E\b\u0002\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0010\u0014\u001A\u00020\u0013\u0012\u000E\b\u0002\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\b\u0010\u0016\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001A\u0004\u0018\u00010\u0017\u0012\u000E\b\u0002\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u000E\b\u0002\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010 J\u0010\u0010&\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010 J\u0016\u0010\'\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b)\u0010*J\u0016\u0010+\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b+\u0010(J\u0010\u0010,\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b,\u0010*J\u0016\u0010-\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b-\u0010(J\u0016\u0010.\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b.\u0010(J\u0010\u0010/\u001A\u00020\u0013H\u00C6\u0003\u00A2\u0006\u0004\b/\u00100J\u0016\u00101\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b1\u0010(J\u0012\u00102\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b2\u0010 J\u0018\u00105\u001A\u0004\u0018\u00010\u0017H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b3\u00104J\u0018\u00107\u001A\u0004\u0018\u00010\u0017H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b6\u00104J\u0016\u00108\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b8\u0010(J\u0016\u00109\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b9\u0010(J\u0016\u0010:\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b:\u0010(J\u0089\u0002\u0010=\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\b\b\u0002\u0010\u000E\u001A\u00020\r2\u000E\b\u0002\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\b\b\u0002\u0010\u0010\u001A\u00020\r2\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\u000E\b\u0002\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\b\b\u0002\u0010\u0014\u001A\u00020\u00132\u000E\b\u0002\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001A\u0004\u0018\u00010\u00172\u000E\b\u0002\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\u000E\b\u0002\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\b;\u0010<J\u0010\u0010>\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b>\u0010 J\u0010\u0010?\u001A\u00020\rH\u00D6\u0001\u00A2\u0006\u0004\b?\u0010*J\u001A\u0010B\u001A\u00020\u00132\b\u0010A\u001A\u0004\u0018\u00010@H\u00D6\u0003\u00A2\u0006\u0004\bB\u0010CR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010 R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010\"R\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010$R\u001A\u0010\b\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bM\u0010E\u001A\u0004\bN\u0010 R\u001A\u0010\t\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bO\u0010E\u001A\u0004\bP\u0010 R \u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010(R\u001A\u0010\u000E\u001A\u00020\r8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bT\u0010U\u001A\u0004\bV\u0010*R\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0006\u00A2\u0006\f\n\u0004\bW\u0010R\u001A\u0004\bX\u0010(R\u0017\u0010\u0010\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\bY\u0010U\u001A\u0004\bZ\u0010*R\u001D\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0006\u00A2\u0006\f\n\u0004\b[\u0010R\u001A\u0004\b\\\u0010(R\u001D\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0006\u00A2\u0006\f\n\u0004\b]\u0010R\u001A\u0004\b^\u0010(R\u001A\u0010\u0014\u001A\u00020\u00138\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b_\u0010`\u001A\u0004\ba\u00100R \u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bb\u0010R\u001A\u0004\bc\u0010(R\u001C\u0010\u0016\u001A\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bd\u0010E\u001A\u0004\be\u0010 R\"\u0010\u0018\u001A\u0004\u0018\u00010\u00178\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bf\u0010g\u001A\u0004\bh\u00104R\"\u0010\u0019\u001A\u0004\u0018\u00010\u00178\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bi\u0010g\u001A\u0004\bj\u00104R \u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bk\u0010R\u001A\u0004\bl\u0010(R \u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bm\u0010R\u001A\u0004\bn\u0010(R \u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bo\u0010R\u001A\u0004\bp\u0010(R\u001A\u0010r\u001A\u00020\u00138\u0016X\u0096D\u00A2\u0006\f\n\u0004\bq\u0010`\u001A\u0004\br\u00100R\u001A\u0010u\u001A\u00020\u00138\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bs\u0010`\u001A\u0004\bt\u00100\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006v"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$My;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;", "", "name", "Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "role", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;", "storyCreator", "title", "description", "Lkotlin/Function0;", "", "onClickShare", "", "followerCount", "onClickFollower", "followingCount", "onClickFollowing", "onClickSetting", "", "showGuestBook", "onClickGuestBook", "image", "Landroidx/compose/ui/graphics/Color;", "gradientStartColor", "gradientEndColor", "onClickBack", "onClickSearch", "onClickBlog", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/functions/Function0;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "component3", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;", "component4", "component5", "component6", "()Lkotlin/jvm/functions/Function0;", "component7", "()I", "component8", "component9", "component10", "component11", "component12", "()Z", "component13", "component14", "component15-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component15", "component16-QN2ZGVo", "component16", "component17", "component18", "component19", "copy-viOQa8Q", "(Ljava/lang/String;Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/functions/Function0;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$My;", "copy", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "getRole", "c", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;", "getStoryCreator", "d", "getTitle", "e", "getDescription", "f", "Lkotlin/jvm/functions/Function0;", "getOnClickShare", "g", "I", "getFollowerCount", "h", "getOnClickFollower", "i", "getFollowingCount", "j", "getOnClickFollowing", "k", "getOnClickSetting", "l", "Z", "getShowGuestBook", "m", "getOnClickGuestBook", "n", "getImage", "o", "Landroidx/compose/ui/graphics/Color;", "getGradientStartColor-QN2ZGVo", "p", "getGradientEndColor-QN2ZGVo", "q", "getOnClickBack", "r", "getOnClickSearch", "s", "getOnClickBlog", "t", "isMine", "u", "getHasEntryEditAuth", "hasEntryEditAuth", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class My implements BlogMainInfo {
        public static final int $stable;
        public final String a;
        public final BlogRoleType b;
        public final StoryCreator c;
        public final String d;
        public final String e;
        public final Function0 f;
        public final int g;
        public final Function0 h;
        public final int i;
        public final Function0 j;
        public final Function0 k;
        public final boolean l;
        public final Function0 m;
        public final String n;
        public final Color o;
        public final Color p;
        public final Function0 q;
        public final Function0 r;
        public final Function0 s;
        public final boolean t;
        public final boolean u;

        public My(String s, BlogRoleType blogRoleType0, StoryCreator blogMainInfo$StoryCreator0, String s1, String s2, Function0 function00, int v, Function0 function01, int v1, Function0 function02, Function0 function03, boolean z, Function0 function04, String s3, Color color0, Color color1, Function0 function05, Function0 function06, Function0 function07, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            Function0 function08 = (v2 & 0x20) == 0 ? function00 : i.a;
            Function0 function09 = (v2 & 0x80) == 0 ? function01 : j.a;
            Function0 function010 = (v2 & 0x200) == 0 ? function02 : k.a;
            Function0 function011 = (v2 & 0x400) == 0 ? function03 : l.a;
            Function0 function012 = (v2 & 0x1000) == 0 ? function04 : m.a;
            Function0 function013 = (0x10000 & v2) == 0 ? function05 : n.a;
            Function0 function014 = (0x20000 & v2) == 0 ? function06 : o.a;
            Function0 function015 = (v2 & 0x40000) == 0 ? function07 : p.a;
            this(s, blogRoleType0, blogMainInfo$StoryCreator0, s1, s2, function08, v, function09, v1, function010, function011, z, function012, s3, color0, color1, function013, function014, function015, null);
        }

        public My(String s, BlogRoleType blogRoleType0, StoryCreator blogMainInfo$StoryCreator0, String s1, String s2, Function0 function00, int v, Function0 function01, int v1, Function0 function02, Function0 function03, boolean z, Function0 function04, String s3, Color color0, Color color1, Function0 function05, Function0 function06, Function0 function07, DefaultConstructorMarker defaultConstructorMarker0) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(blogRoleType0, "role");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(s2, "description");
            Intrinsics.checkNotNullParameter(function00, "onClickShare");
            Intrinsics.checkNotNullParameter(function01, "onClickFollower");
            Intrinsics.checkNotNullParameter(function02, "onClickFollowing");
            Intrinsics.checkNotNullParameter(function03, "onClickSetting");
            Intrinsics.checkNotNullParameter(function04, "onClickGuestBook");
            Intrinsics.checkNotNullParameter(function05, "onClickBack");
            Intrinsics.checkNotNullParameter(function06, "onClickSearch");
            Intrinsics.checkNotNullParameter(function07, "onClickBlog");
            super();
            this.a = s;
            this.b = blogRoleType0;
            this.c = blogMainInfo$StoryCreator0;
            this.d = s1;
            this.e = s2;
            this.f = function00;
            this.g = v;
            this.h = function01;
            this.i = v1;
            this.j = function02;
            this.k = function03;
            this.l = z;
            this.m = function04;
            this.n = s3;
            this.o = color0;
            this.p = color1;
            this.q = function05;
            this.r = function06;
            this.s = function07;
            this.t = true;
            this.u = this.getRole().getHasEntryEditAuth();
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Function0 component10() {
            return this.j;
        }

        @NotNull
        public final Function0 component11() {
            return this.k;
        }

        public final boolean component12() {
            return this.l;
        }

        @NotNull
        public final Function0 component13() {
            return this.m;
        }

        @Nullable
        public final String component14() {
            return this.n;
        }

        @Nullable
        public final Color component15-QN2ZGVo() {
            return this.o;
        }

        @Nullable
        public final Color component16-QN2ZGVo() {
            return this.p;
        }

        @NotNull
        public final Function0 component17() {
            return this.q;
        }

        @NotNull
        public final Function0 component18() {
            return this.r;
        }

        @NotNull
        public final Function0 component19() {
            return this.s;
        }

        @NotNull
        public final BlogRoleType component2() {
            return this.b;
        }

        @Nullable
        public final StoryCreator component3() {
            return this.c;
        }

        @NotNull
        public final String component4() {
            return this.d;
        }

        @NotNull
        public final String component5() {
            return this.e;
        }

        @NotNull
        public final Function0 component6() {
            return this.f;
        }

        public final int component7() {
            return this.g;
        }

        @NotNull
        public final Function0 component8() {
            return this.h;
        }

        public final int component9() {
            return this.i;
        }

        @NotNull
        public final My copy-viOQa8Q(@NotNull String s, @NotNull BlogRoleType blogRoleType0, @Nullable StoryCreator blogMainInfo$StoryCreator0, @NotNull String s1, @NotNull String s2, @NotNull Function0 function00, int v, @NotNull Function0 function01, int v1, @NotNull Function0 function02, @NotNull Function0 function03, boolean z, @NotNull Function0 function04, @Nullable String s3, @Nullable Color color0, @Nullable Color color1, @NotNull Function0 function05, @NotNull Function0 function06, @NotNull Function0 function07) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(blogRoleType0, "role");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(s2, "description");
            Intrinsics.checkNotNullParameter(function00, "onClickShare");
            Intrinsics.checkNotNullParameter(function01, "onClickFollower");
            Intrinsics.checkNotNullParameter(function02, "onClickFollowing");
            Intrinsics.checkNotNullParameter(function03, "onClickSetting");
            Intrinsics.checkNotNullParameter(function04, "onClickGuestBook");
            Intrinsics.checkNotNullParameter(function05, "onClickBack");
            Intrinsics.checkNotNullParameter(function06, "onClickSearch");
            Intrinsics.checkNotNullParameter(function07, "onClickBlog");
            return new My(s, blogRoleType0, blogMainInfo$StoryCreator0, s1, s2, function00, v, function01, v1, function02, function03, z, function04, s3, color0, color1, function05, function06, function07, null);
        }

        public static My copy-viOQa8Q$default(My blogMainInfo$My0, String s, BlogRoleType blogRoleType0, StoryCreator blogMainInfo$StoryCreator0, String s1, String s2, Function0 function00, int v, Function0 function01, int v1, Function0 function02, Function0 function03, boolean z, Function0 function04, String s3, Color color0, Color color1, Function0 function05, Function0 function06, Function0 function07, int v2, Object object0) {
            String s4 = (v2 & 1) == 0 ? s : blogMainInfo$My0.a;
            BlogRoleType blogRoleType1 = (v2 & 2) == 0 ? blogRoleType0 : blogMainInfo$My0.b;
            StoryCreator blogMainInfo$StoryCreator1 = (v2 & 4) == 0 ? blogMainInfo$StoryCreator0 : blogMainInfo$My0.c;
            String s5 = (v2 & 8) == 0 ? s1 : blogMainInfo$My0.d;
            String s6 = (v2 & 16) == 0 ? s2 : blogMainInfo$My0.e;
            Function0 function08 = (v2 & 0x20) == 0 ? function00 : blogMainInfo$My0.f;
            int v3 = (v2 & 0x40) == 0 ? v : blogMainInfo$My0.g;
            Function0 function09 = (v2 & 0x80) == 0 ? function01 : blogMainInfo$My0.h;
            int v4 = (v2 & 0x100) == 0 ? v1 : blogMainInfo$My0.i;
            Function0 function010 = (v2 & 0x200) == 0 ? function02 : blogMainInfo$My0.j;
            Function0 function011 = (v2 & 0x400) == 0 ? function03 : blogMainInfo$My0.k;
            boolean z1 = (v2 & 0x800) == 0 ? z : blogMainInfo$My0.l;
            Function0 function012 = (v2 & 0x1000) == 0 ? function04 : blogMainInfo$My0.m;
            String s7 = (v2 & 0x2000) == 0 ? s3 : blogMainInfo$My0.n;
            Color color2 = (v2 & 0x4000) == 0 ? color0 : blogMainInfo$My0.o;
            Color color3 = (v2 & 0x8000) == 0 ? color1 : blogMainInfo$My0.p;
            Function0 function013 = (v2 & 0x10000) == 0 ? function05 : blogMainInfo$My0.q;
            Function0 function014 = (v2 & 0x20000) == 0 ? function06 : blogMainInfo$My0.r;
            return (v2 & 0x40000) == 0 ? blogMainInfo$My0.copy-viOQa8Q(s4, blogRoleType1, blogMainInfo$StoryCreator1, s5, s6, function08, v3, function09, v4, function010, function011, z1, function012, s7, color2, color3, function013, function014, function07) : blogMainInfo$My0.copy-viOQa8Q(s4, blogRoleType1, blogMainInfo$StoryCreator1, s5, s6, function08, v3, function09, v4, function010, function011, z1, function012, s7, color2, color3, function013, function014, blogMainInfo$My0.s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof My)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((My)object0).a)) {
                return false;
            }
            if(this.b != ((My)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((My)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((My)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((My)object0).e)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.f, ((My)object0).f)) {
                return false;
            }
            if(this.g != ((My)object0).g) {
                return false;
            }
            if(!Intrinsics.areEqual(this.h, ((My)object0).h)) {
                return false;
            }
            if(this.i != ((My)object0).i) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, ((My)object0).j)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.k, ((My)object0).k)) {
                return false;
            }
            if(this.l != ((My)object0).l) {
                return false;
            }
            if(!Intrinsics.areEqual(this.m, ((My)object0).m)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.n, ((My)object0).n)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.o, ((My)object0).o)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.p, ((My)object0).p)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.q, ((My)object0).q)) {
                return false;
            }
            return Intrinsics.areEqual(this.r, ((My)object0).r) ? Intrinsics.areEqual(this.s, ((My)object0).s) : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public String getDescription() {
            return this.e;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        public int getFollowerCount() {
            return this.g;
        }

        public final int getFollowingCount() {
            return this.i;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @Nullable
        public Color getGradientEndColor-QN2ZGVo() {
            return this.p;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @Nullable
        public Color getGradientStartColor-QN2ZGVo() {
            return this.o;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        public boolean getHasEntryEditAuth() {
            return this.u;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @Nullable
        public String getImage() {
            return this.n;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public String getName() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public Function0 getOnClickBack() {
            return this.q;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public Function0 getOnClickBlog() {
            return this.s;
        }

        @NotNull
        public final Function0 getOnClickFollower() {
            return this.h;
        }

        @NotNull
        public final Function0 getOnClickFollowing() {
            return this.j;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public Function0 getOnClickGuestBook() {
            return this.m;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public Function0 getOnClickSearch() {
            return this.r;
        }

        @NotNull
        public final Function0 getOnClickSetting() {
            return this.k;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public Function0 getOnClickShare() {
            return this.f;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public BlogRoleType getRole() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        public boolean getShowGuestBook() {
            return this.l;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @Nullable
        public StoryCreator getStoryCreator() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public String getTitle() {
            return this.d;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = a.a(this.m, c.a(this.l, a.a(this.k, a.a(this.j, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.i, a.a(this.h, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.g, a.a(this.f, com.kakao.tistory.presentation.common.graph.a.a(this.e, com.kakao.tistory.presentation.common.graph.a.a(this.d, ((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
            int v2 = this.n == null ? 0 : this.n.hashCode();
            int v3 = this.o == null ? 0 : Color.hashCode-impl(this.o.unbox-impl());
            Color color0 = this.p;
            if(color0 != null) {
                v = Color.hashCode-impl(color0.unbox-impl());
            }
            return this.s.hashCode() + a.a(this.r, a.a(this.q, (((v1 + v2) * 0x1F + v3) * 0x1F + v) * 0x1F, 0x1F), 0x1F);
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        public boolean isMine() {
            return this.t;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("My(name=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", role=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", storyCreator=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", title=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", description=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", onClickShare=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", followerCount=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", onClickFollower=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", followingCount=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", onClickFollowing=");
            stringBuilder0.append(this.j);
            stringBuilder0.append(", onClickSetting=");
            stringBuilder0.append(this.k);
            stringBuilder0.append(", showGuestBook=");
            stringBuilder0.append(this.l);
            stringBuilder0.append(", onClickGuestBook=");
            stringBuilder0.append(this.m);
            stringBuilder0.append(", image=");
            stringBuilder0.append(this.n);
            stringBuilder0.append(", gradientStartColor=");
            stringBuilder0.append(this.o);
            stringBuilder0.append(", gradientEndColor=");
            stringBuilder0.append(this.p);
            stringBuilder0.append(", onClickBack=");
            stringBuilder0.append(this.q);
            stringBuilder0.append(", onClickSearch=");
            stringBuilder0.append(this.r);
            stringBuilder0.append(", onClickBlog=");
            return q.q(stringBuilder0, this.s, ")");
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001B\u00BF\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0011\u001A\u00020\r\u0012\u0014\b\u0002\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000B0\u0012\u0012\u0006\u0010\u0014\u001A\u00020\r\u0012#\b\u0002\u0010\u0017\u001A\u001D\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0015\u0012\b\b\u0003\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000B0\u0012\u0012#\b\u0002\u0010\u0018\u001A\u001D\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0015\u0012\b\b\u0003\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000B0\u0012\u0012\u0006\u0010\u0019\u001A\u00020\r\u0012\u000E\b\u0002\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u0006\u0010\u001B\u001A\u00020\r\u0012\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\b\u0010\u001D\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u0012\b\u0010 \u001A\u0004\u0018\u00010\u001E\u0012\u000E\b\u0002\u0010!\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u000E\b\u0002\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u0012\u000E\b\u0002\u0010#\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010)J\u0012\u0010*\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010\'J\u0010\u0010-\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010\'J\u0016\u0010.\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b.\u0010/J\u0010\u00100\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b0\u00101J\u0010\u00102\u001A\u00020\u000FH\u00C6\u0003\u00A2\u0006\u0004\b2\u00103J\u0010\u00104\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b4\u00101J\u001C\u00105\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000B0\u0012H\u00C6\u0003\u00A2\u0006\u0004\b5\u00106J\u0010\u00107\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b7\u00101J+\u00108\u001A\u001D\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0015\u0012\b\b\u0003\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000B0\u0012H\u00C6\u0003\u00A2\u0006\u0004\b8\u00106J+\u00109\u001A\u001D\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0015\u0012\b\b\u0003\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000B0\u0012H\u00C6\u0003\u00A2\u0006\u0004\b9\u00106J\u0010\u0010:\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b:\u00101J\u0016\u0010;\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b;\u0010/J\u0010\u0010<\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b<\u00101J\u0016\u0010=\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b=\u0010/J\u0012\u0010>\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b>\u0010\'J\u0018\u0010A\u001A\u0004\u0018\u00010\u001EH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b?\u0010@J\u0018\u0010C\u001A\u0004\u0018\u00010\u001EH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bB\u0010@J\u0016\u0010D\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\bD\u0010/J\u0016\u0010E\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\bE\u0010/J\u0016\u0010F\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\bF\u0010/J\u00E7\u0002\u0010I\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\u00022\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\b\b\u0002\u0010\u0011\u001A\u00020\r2\u0014\b\u0002\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000B0\u00122\b\b\u0002\u0010\u0014\u001A\u00020\r2#\b\u0002\u0010\u0017\u001A\u001D\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0015\u0012\b\b\u0003\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000B0\u00122#\b\u0002\u0010\u0018\u001A\u001D\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0015\u0012\b\b\u0003\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000B0\u00122\b\b\u0002\u0010\u0019\u001A\u00020\r2\u000E\b\u0002\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\b\b\u0002\u0010\u001B\u001A\u00020\r2\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010\u001E2\u000E\b\u0002\u0010!\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\u000E\b\u0002\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u000B0\n2\u000E\b\u0002\u0010#\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\bG\u0010HJ\u0010\u0010J\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\bJ\u0010\'J\u0010\u0010K\u001A\u00020\u000FH\u00D6\u0001\u00A2\u0006\u0004\bK\u00103J\u001A\u0010N\u001A\u00020\r2\b\u0010M\u001A\u0004\u0018\u00010LH\u00D6\u0003\u00A2\u0006\u0004\bN\u0010OR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010\'R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bS\u0010T\u001A\u0004\bU\u0010)R\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bV\u0010W\u001A\u0004\bX\u0010+R\u001A\u0010\b\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bY\u0010Q\u001A\u0004\bZ\u0010\'R\u001A\u0010\t\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b[\u0010Q\u001A\u0004\b\\\u0010\'R \u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b]\u0010^\u001A\u0004\b_\u0010/R\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b`\u0010a\u001A\u0004\b\u000E\u00101R\u001A\u0010\u0010\u001A\u00020\u000F8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bb\u0010c\u001A\u0004\bd\u00103R\u0017\u0010\u0011\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\be\u0010a\u001A\u0004\b\u0011\u00101R#\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000B0\u00128\u0006\u00A2\u0006\f\n\u0004\bf\u0010g\u001A\u0004\bh\u00106R\u0017\u0010\u0014\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\bi\u0010a\u001A\u0004\b\u0014\u00101R2\u0010\u0017\u001A\u001D\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0015\u0012\b\b\u0003\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000B0\u00128\u0006\u00A2\u0006\f\n\u0004\bj\u0010g\u001A\u0004\bk\u00106R2\u0010\u0018\u001A\u001D\u0012\u0013\u0012\u00110\r\u00A2\u0006\f\b\u0015\u0012\b\b\u0003\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000B0\u00128\u0006\u00A2\u0006\f\n\u0004\bl\u0010g\u001A\u0004\bm\u00106R\u0017\u0010\u0019\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\bn\u0010a\u001A\u0004\b\u0019\u00101R\u001D\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0006\u00A2\u0006\f\n\u0004\bo\u0010^\u001A\u0004\bp\u0010/R\u001A\u0010\u001B\u001A\u00020\r8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bq\u0010a\u001A\u0004\br\u00101R \u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bs\u0010^\u001A\u0004\bt\u0010/R\u001C\u0010\u001D\u001A\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bu\u0010Q\u001A\u0004\bv\u0010\'R\"\u0010\u001F\u001A\u0004\u0018\u00010\u001E8\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bw\u0010x\u001A\u0004\by\u0010@R\"\u0010 \u001A\u0004\u0018\u00010\u001E8\u0016X\u0096\u0004\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bz\u0010x\u001A\u0004\b{\u0010@R \u0010!\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b|\u0010^\u001A\u0004\b}\u0010/R \u0010\"\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b~\u0010^\u001A\u0004\b\u007F\u0010/R\"\u0010#\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0016X\u0096\u0004\u00A2\u0006\u000E\n\u0005\b\u0080\u0001\u0010^\u001A\u0005\b\u0081\u0001\u0010/R\u001D\u0010\u0082\u0001\u001A\u00020\r8\u0016X\u0096D\u00A2\u0006\u000E\n\u0005\b\u0082\u0001\u0010a\u001A\u0005\b\u0082\u0001\u00101R\u001D\u0010\u0083\u0001\u001A\u00020\r8\u0016X\u0096D\u00A2\u0006\u000E\n\u0005\b\u0083\u0001\u0010a\u001A\u0005\b\u0084\u0001\u00101\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006\u0085\u0001"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$Others;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;", "", "name", "Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "role", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;", "storyCreator", "title", "description", "Lkotlin/Function0;", "", "onClickShare", "", "isBlocked", "", "followerCount", "isFollowing", "Lkotlin/Function1;", "onClickFollowing", "isBlocking", "Lkotlin/ParameterName;", "needBlock", "onClickBlockMenu", "onConfirmBlockChange", "isReportable", "onClickReport", "showGuestBook", "onClickGuestBook", "image", "Landroidx/compose/ui/graphics/Color;", "gradientStartColor", "gradientEndColor", "onClickBack", "onClickSearch", "onClickBlog", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZIZLkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "component3", "()Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;", "component4", "component5", "component6", "()Lkotlin/jvm/functions/Function0;", "component7", "()Z", "component8", "()I", "component9", "component10", "()Lkotlin/jvm/functions/Function1;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component19", "component20-QN2ZGVo", "component20", "component21", "component22", "component23", "copy-CdxTIzs", "(Ljava/lang/String;Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZIZLkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$Others;", "copy", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "getRole", "c", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;", "getStoryCreator", "d", "getTitle", "e", "getDescription", "f", "Lkotlin/jvm/functions/Function0;", "getOnClickShare", "g", "Z", "h", "I", "getFollowerCount", "i", "j", "Lkotlin/jvm/functions/Function1;", "getOnClickFollowing", "k", "l", "getOnClickBlockMenu", "m", "getOnConfirmBlockChange", "n", "o", "getOnClickReport", "p", "getShowGuestBook", "q", "getOnClickGuestBook", "r", "getImage", "s", "Landroidx/compose/ui/graphics/Color;", "getGradientStartColor-QN2ZGVo", "t", "getGradientEndColor-QN2ZGVo", "u", "getOnClickBack", "v", "getOnClickSearch", "w", "getOnClickBlog", "isMine", "hasEntryEditAuth", "getHasEntryEditAuth", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Others implements BlogMainInfo {
        public static final int $stable;
        public final String a;
        public final BlogRoleType b;
        public final StoryCreator c;
        public final String d;
        public final String e;
        public final Function0 f;
        public final boolean g;
        public final int h;
        public final boolean i;
        public final Function1 j;
        public final boolean k;
        public final Function1 l;
        public final Function1 m;
        public final boolean n;
        public final Function0 o;
        public final boolean p;
        public final Function0 q;
        public final String r;
        public final Color s;
        public final Color t;
        public final Function0 u;
        public final Function0 v;
        public final Function0 w;

        public Others(String s, BlogRoleType blogRoleType0, StoryCreator blogMainInfo$StoryCreator0, String s1, String s2, Function0 function00, boolean z, int v, boolean z1, Function1 function10, boolean z2, Function1 function11, Function1 function12, boolean z3, Function0 function01, boolean z4, Function0 function02, String s3, Color color0, Color color1, Function0 function03, Function0 function04, Function0 function05, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            Function0 function06 = (v1 & 0x20) == 0 ? function00 : com.kakao.tistory.presentation.screen.blog.main.contract.q.a;
            Function1 function13 = (v1 & 0x200) == 0 ? function10 : r.a;
            Function1 function14 = (v1 & 0x800) == 0 ? function11 : s.a;
            Function1 function15 = (v1 & 0x1000) == 0 ? function12 : t.a;
            Function0 function07 = (v1 & 0x4000) == 0 ? function01 : u.a;
            Function0 function08 = (0x10000 & v1) == 0 ? function02 : v.a;
            Function0 function09 = (0x100000 & v1) == 0 ? function03 : w.a;
            Function0 function010 = (0x200000 & v1) == 0 ? function04 : x.a;
            Function0 function011 = (v1 & 0x400000) == 0 ? function05 : y.a;
            this(s, blogRoleType0, blogMainInfo$StoryCreator0, s1, s2, function06, z, v, z1, function13, z2, function14, function15, z3, function07, z4, function08, s3, color0, color1, function09, function010, function011, null);
        }

        public Others(String s, BlogRoleType blogRoleType0, StoryCreator blogMainInfo$StoryCreator0, String s1, String s2, Function0 function00, boolean z, int v, boolean z1, Function1 function10, boolean z2, Function1 function11, Function1 function12, boolean z3, Function0 function01, boolean z4, Function0 function02, String s3, Color color0, Color color1, Function0 function03, Function0 function04, Function0 function05, DefaultConstructorMarker defaultConstructorMarker0) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(blogRoleType0, "role");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(s2, "description");
            Intrinsics.checkNotNullParameter(function00, "onClickShare");
            Intrinsics.checkNotNullParameter(function10, "onClickFollowing");
            Intrinsics.checkNotNullParameter(function11, "onClickBlockMenu");
            Intrinsics.checkNotNullParameter(function12, "onConfirmBlockChange");
            Intrinsics.checkNotNullParameter(function01, "onClickReport");
            Intrinsics.checkNotNullParameter(function02, "onClickGuestBook");
            Intrinsics.checkNotNullParameter(function03, "onClickBack");
            Intrinsics.checkNotNullParameter(function04, "onClickSearch");
            Intrinsics.checkNotNullParameter(function05, "onClickBlog");
            super();
            this.a = s;
            this.b = blogRoleType0;
            this.c = blogMainInfo$StoryCreator0;
            this.d = s1;
            this.e = s2;
            this.f = function00;
            this.g = z;
            this.h = v;
            this.i = z1;
            this.j = function10;
            this.k = z2;
            this.l = function11;
            this.m = function12;
            this.n = z3;
            this.o = function01;
            this.p = z4;
            this.q = function02;
            this.r = s3;
            this.s = color0;
            this.t = color1;
            this.u = function03;
            this.v = function04;
            this.w = function05;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Function1 component10() {
            return this.j;
        }

        public final boolean component11() {
            return this.k;
        }

        @NotNull
        public final Function1 component12() {
            return this.l;
        }

        @NotNull
        public final Function1 component13() {
            return this.m;
        }

        public final boolean component14() {
            return this.n;
        }

        @NotNull
        public final Function0 component15() {
            return this.o;
        }

        public final boolean component16() {
            return this.p;
        }

        @NotNull
        public final Function0 component17() {
            return this.q;
        }

        @Nullable
        public final String component18() {
            return this.r;
        }

        @Nullable
        public final Color component19-QN2ZGVo() {
            return this.s;
        }

        @NotNull
        public final BlogRoleType component2() {
            return this.b;
        }

        @Nullable
        public final Color component20-QN2ZGVo() {
            return this.t;
        }

        @NotNull
        public final Function0 component21() {
            return this.u;
        }

        @NotNull
        public final Function0 component22() {
            return this.v;
        }

        @NotNull
        public final Function0 component23() {
            return this.w;
        }

        @Nullable
        public final StoryCreator component3() {
            return this.c;
        }

        @NotNull
        public final String component4() {
            return this.d;
        }

        @NotNull
        public final String component5() {
            return this.e;
        }

        @NotNull
        public final Function0 component6() {
            return this.f;
        }

        public final boolean component7() {
            return this.g;
        }

        public final int component8() {
            return this.h;
        }

        public final boolean component9() {
            return this.i;
        }

        @NotNull
        public final Others copy-CdxTIzs(@NotNull String s, @NotNull BlogRoleType blogRoleType0, @Nullable StoryCreator blogMainInfo$StoryCreator0, @NotNull String s1, @NotNull String s2, @NotNull Function0 function00, boolean z, int v, boolean z1, @NotNull Function1 function10, boolean z2, @NotNull Function1 function11, @NotNull Function1 function12, boolean z3, @NotNull Function0 function01, boolean z4, @NotNull Function0 function02, @Nullable String s3, @Nullable Color color0, @Nullable Color color1, @NotNull Function0 function03, @NotNull Function0 function04, @NotNull Function0 function05) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(blogRoleType0, "role");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(s2, "description");
            Intrinsics.checkNotNullParameter(function00, "onClickShare");
            Intrinsics.checkNotNullParameter(function10, "onClickFollowing");
            Intrinsics.checkNotNullParameter(function11, "onClickBlockMenu");
            Intrinsics.checkNotNullParameter(function12, "onConfirmBlockChange");
            Intrinsics.checkNotNullParameter(function01, "onClickReport");
            Intrinsics.checkNotNullParameter(function02, "onClickGuestBook");
            Intrinsics.checkNotNullParameter(function03, "onClickBack");
            Intrinsics.checkNotNullParameter(function04, "onClickSearch");
            Intrinsics.checkNotNullParameter(function05, "onClickBlog");
            return new Others(s, blogRoleType0, blogMainInfo$StoryCreator0, s1, s2, function00, z, v, z1, function10, z2, function11, function12, z3, function01, z4, function02, s3, color0, color1, function03, function04, function05, null);
        }

        public static Others copy-CdxTIzs$default(Others blogMainInfo$Others0, String s, BlogRoleType blogRoleType0, StoryCreator blogMainInfo$StoryCreator0, String s1, String s2, Function0 function00, boolean z, int v, boolean z1, Function1 function10, boolean z2, Function1 function11, Function1 function12, boolean z3, Function0 function01, boolean z4, Function0 function02, String s3, Color color0, Color color1, Function0 function03, Function0 function04, Function0 function05, int v1, Object object0) {
            String s4 = (v1 & 1) == 0 ? s : blogMainInfo$Others0.a;
            BlogRoleType blogRoleType1 = (v1 & 2) == 0 ? blogRoleType0 : blogMainInfo$Others0.b;
            StoryCreator blogMainInfo$StoryCreator1 = (v1 & 4) == 0 ? blogMainInfo$StoryCreator0 : blogMainInfo$Others0.c;
            String s5 = (v1 & 8) == 0 ? s1 : blogMainInfo$Others0.d;
            String s6 = (v1 & 16) == 0 ? s2 : blogMainInfo$Others0.e;
            Function0 function06 = (v1 & 0x20) == 0 ? function00 : blogMainInfo$Others0.f;
            boolean z5 = (v1 & 0x40) == 0 ? z : blogMainInfo$Others0.g;
            int v2 = (v1 & 0x80) == 0 ? v : blogMainInfo$Others0.h;
            boolean z6 = (v1 & 0x100) == 0 ? z1 : blogMainInfo$Others0.i;
            Function1 function13 = (v1 & 0x200) == 0 ? function10 : blogMainInfo$Others0.j;
            boolean z7 = (v1 & 0x400) == 0 ? z2 : blogMainInfo$Others0.k;
            Function1 function14 = (v1 & 0x800) == 0 ? function11 : blogMainInfo$Others0.l;
            Function1 function15 = (v1 & 0x1000) == 0 ? function12 : blogMainInfo$Others0.m;
            boolean z8 = (v1 & 0x2000) == 0 ? z3 : blogMainInfo$Others0.n;
            Function0 function07 = (v1 & 0x4000) == 0 ? function01 : blogMainInfo$Others0.o;
            boolean z9 = (v1 & 0x8000) == 0 ? z4 : blogMainInfo$Others0.p;
            Function0 function08 = (v1 & 0x10000) == 0 ? function02 : blogMainInfo$Others0.q;
            String s7 = (v1 & 0x20000) == 0 ? s3 : blogMainInfo$Others0.r;
            Color color2 = (v1 & 0x40000) == 0 ? color0 : blogMainInfo$Others0.s;
            Color color3 = (v1 & 0x80000) == 0 ? color1 : blogMainInfo$Others0.t;
            Function0 function09 = (v1 & 0x100000) == 0 ? function03 : blogMainInfo$Others0.u;
            Function0 function010 = (v1 & 0x200000) == 0 ? function04 : blogMainInfo$Others0.v;
            return (v1 & 0x400000) == 0 ? blogMainInfo$Others0.copy-CdxTIzs(s4, blogRoleType1, blogMainInfo$StoryCreator1, s5, s6, function06, z5, v2, z6, function13, z7, function14, function15, z8, function07, z9, function08, s7, color2, color3, function09, function010, function05) : blogMainInfo$Others0.copy-CdxTIzs(s4, blogRoleType1, blogMainInfo$StoryCreator1, s5, s6, function06, z5, v2, z6, function13, z7, function14, function15, z8, function07, z9, function08, s7, color2, color3, function09, function010, blogMainInfo$Others0.w);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Others)) {
                return false;
            }
            Others blogMainInfo$Others0 = (Others)object0;
            if(!Intrinsics.areEqual(this.a, blogMainInfo$Others0.a)) {
                return false;
            }
            if(this.b != blogMainInfo$Others0.b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, blogMainInfo$Others0.c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, blogMainInfo$Others0.d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, blogMainInfo$Others0.e)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.f, blogMainInfo$Others0.f)) {
                return false;
            }
            if(this.g != blogMainInfo$Others0.g) {
                return false;
            }
            if(this.h != blogMainInfo$Others0.h) {
                return false;
            }
            if(this.i != blogMainInfo$Others0.i) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, blogMainInfo$Others0.j)) {
                return false;
            }
            if(this.k != blogMainInfo$Others0.k) {
                return false;
            }
            if(!Intrinsics.areEqual(this.l, blogMainInfo$Others0.l)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.m, blogMainInfo$Others0.m)) {
                return false;
            }
            if(this.n != blogMainInfo$Others0.n) {
                return false;
            }
            if(!Intrinsics.areEqual(this.o, blogMainInfo$Others0.o)) {
                return false;
            }
            if(this.p != blogMainInfo$Others0.p) {
                return false;
            }
            if(!Intrinsics.areEqual(this.q, blogMainInfo$Others0.q)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.r, blogMainInfo$Others0.r)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.s, blogMainInfo$Others0.s)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.t, blogMainInfo$Others0.t)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.u, blogMainInfo$Others0.u)) {
                return false;
            }
            return Intrinsics.areEqual(this.v, blogMainInfo$Others0.v) ? Intrinsics.areEqual(this.w, blogMainInfo$Others0.w) : false;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public String getDescription() {
            return this.e;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        public int getFollowerCount() {
            return this.h;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @Nullable
        public Color getGradientEndColor-QN2ZGVo() {
            return this.t;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @Nullable
        public Color getGradientStartColor-QN2ZGVo() {
            return this.s;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        public boolean getHasEntryEditAuth() {
            return false;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @Nullable
        public String getImage() {
            return this.r;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public String getName() {
            return this.a;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public Function0 getOnClickBack() {
            return this.u;
        }

        @NotNull
        public final Function1 getOnClickBlockMenu() {
            return this.l;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public Function0 getOnClickBlog() {
            return this.w;
        }

        @NotNull
        public final Function1 getOnClickFollowing() {
            return this.j;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public Function0 getOnClickGuestBook() {
            return this.q;
        }

        @NotNull
        public final Function0 getOnClickReport() {
            return this.o;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public Function0 getOnClickSearch() {
            return this.v;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public Function0 getOnClickShare() {
            return this.f;
        }

        @NotNull
        public final Function1 getOnConfirmBlockChange() {
            return this.m;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public BlogRoleType getRole() {
            return this.b;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        public boolean getShowGuestBook() {
            return this.p;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @Nullable
        public StoryCreator getStoryCreator() {
            return this.c;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        @NotNull
        public String getTitle() {
            return this.d;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = a.a(this.q, c.a(this.p, a.a(this.o, c.a(this.n, b.a(this.m, b.a(this.l, c.a(this.k, b.a(this.j, c.a(this.i, com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.h, c.a(this.g, a.a(this.f, com.kakao.tistory.presentation.common.graph.a.a(this.e, com.kakao.tistory.presentation.common.graph.a.a(this.d, ((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
            int v2 = this.r == null ? 0 : this.r.hashCode();
            int v3 = this.s == null ? 0 : Color.hashCode-impl(this.s.unbox-impl());
            Color color0 = this.t;
            if(color0 != null) {
                v = Color.hashCode-impl(color0.unbox-impl());
            }
            return this.w.hashCode() + a.a(this.v, a.a(this.u, (((v1 + v2) * 0x1F + v3) * 0x1F + v) * 0x1F, 0x1F), 0x1F);
        }

        public final boolean isBlocked() {
            return this.g;
        }

        public final boolean isBlocking() {
            return this.k;
        }

        public final boolean isFollowing() {
            return this.i;
        }

        @Override  // com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo
        public boolean isMine() {
            return false;
        }

        public final boolean isReportable() {
            return this.n;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Others(name=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", role=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", storyCreator=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", title=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", description=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", onClickShare=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", isBlocked=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", followerCount=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", isFollowing=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", onClickFollowing=");
            stringBuilder0.append(this.j);
            stringBuilder0.append(", isBlocking=");
            stringBuilder0.append(this.k);
            stringBuilder0.append(", onClickBlockMenu=");
            stringBuilder0.append(this.l);
            stringBuilder0.append(", onConfirmBlockChange=");
            stringBuilder0.append(this.m);
            stringBuilder0.append(", isReportable=");
            stringBuilder0.append(this.n);
            stringBuilder0.append(", onClickReport=");
            stringBuilder0.append(this.o);
            stringBuilder0.append(", showGuestBook=");
            stringBuilder0.append(this.p);
            stringBuilder0.append(", onClickGuestBook=");
            stringBuilder0.append(this.q);
            stringBuilder0.append(", image=");
            stringBuilder0.append(this.r);
            stringBuilder0.append(", gradientStartColor=");
            stringBuilder0.append(this.s);
            stringBuilder0.append(", gradientEndColor=");
            stringBuilder0.append(this.t);
            stringBuilder0.append(", onClickBack=");
            stringBuilder0.append(this.u);
            stringBuilder0.append(", onClickSearch=");
            stringBuilder0.append(this.v);
            stringBuilder0.append(", onClickBlog=");
            return q.q(stringBuilder0, this.w, ")");
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ*\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\nJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\nR\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\f¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;", "", "", "label", "Lkotlin/Function0;", "", "onClick", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/jvm/functions/Function0;", "copy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo$StoryCreator;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLabel", "b", "Lkotlin/jvm/functions/Function0;", "getOnClick", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class StoryCreator {
        public static final int $stable;
        public final String a;
        public final Function0 b;

        public StoryCreator(@NotNull String s, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(s, "label");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            super();
            this.a = s;
            this.b = function00;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Function0 component2() {
            return this.b;
        }

        @NotNull
        public final StoryCreator copy(@NotNull String s, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(s, "label");
            Intrinsics.checkNotNullParameter(function00, "onClick");
            return new StoryCreator(s, function00);
        }

        public static StoryCreator copy$default(StoryCreator blogMainInfo$StoryCreator0, String s, Function0 function00, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogMainInfo$StoryCreator0.a;
            }
            if((v & 2) != 0) {
                function00 = blogMainInfo$StoryCreator0.b;
            }
            return blogMainInfo$StoryCreator0.copy(s, function00);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof StoryCreator)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((StoryCreator)object0).a) ? Intrinsics.areEqual(this.b, ((StoryCreator)object0).b) : false;
        }

        @NotNull
        public final String getLabel() {
            return this.a;
        }

        @NotNull
        public final Function0 getOnClick() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "StoryCreator(label=" + this.a + ", onClick=" + this.b + ")";
        }
    }

    @NotNull
    String getDescription();

    int getFollowerCount();

    @Nullable
    Color getGradientEndColor-QN2ZGVo();

    @Nullable
    Color getGradientStartColor-QN2ZGVo();

    boolean getHasEntryEditAuth();

    @Nullable
    String getImage();

    @NotNull
    String getName();

    @NotNull
    Function0 getOnClickBack();

    @NotNull
    Function0 getOnClickBlog();

    @NotNull
    Function0 getOnClickGuestBook();

    @NotNull
    Function0 getOnClickSearch();

    @NotNull
    Function0 getOnClickShare();

    @NotNull
    BlogRoleType getRole();

    boolean getShowGuestBook();

    @Nullable
    StoryCreator getStoryCreator();

    @NotNull
    String getTitle();

    boolean isMine();
}

