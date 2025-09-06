package com.kakao.tistory.presentation.view.comment.contract;

import com.kakao.tistory.domain.entity.CommentItemType.CommentHeader;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.domain.entity.CommentItemType.CommentReplyItem;
import com.kakao.tistory.domain.entity.CommentItemType.CommentReplyMoreItem;
import com.kakao.tistory.domain.entity.CommentItemType;
import com.kakao.tistory.domain.entity.PinComment;
import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0018\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005\u001A2\u0010\u0006\u001A\u00020\u0002*\u00020\u00072\u0006\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\u000B\u001AB\u0010\u0006\u001A\u00020\r*\u00020\t2\u0006\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\u000B2\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F\u001A2\u0010\u0006\u001A\u00020\u0011*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\u000B¨\u0006\u0013"}, d2 = {"toCommentList", "", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel;", "Lcom/kakao/tistory/domain/entity/PinComment;", "viewModel", "Lcom/kakao/tistory/presentation/view/comment/CommentListViewModel;", "toUIModel", "Lcom/kakao/tistory/domain/entity/CommentItemType;", "previewComment", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "showReplyCount", "", "isReplyToMe", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;", "onClickReply", "Lkotlin/Function0;", "", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;", "parent", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommentItemUIModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentItemUIModel.kt\ncom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n288#2,2:203\n1855#2,2:205\n*S KotlinDebug\n*F\n+ 1 CommentItemUIModel.kt\ncom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModelKt\n*L\n71#1:203,2\n185#1:205,2\n*E\n"})
public final class CommentItemUIModelKt {
    @NotNull
    public static final List toCommentList(@NotNull PinComment pinComment0, @NotNull CommentListViewModel commentListViewModel0) {
        Intrinsics.checkNotNullParameter(pinComment0, "<this>");
        Intrinsics.checkNotNullParameter(commentListViewModel0, "viewModel");
        CommentItem commentItemType$CommentItem0 = pinComment0.getComment();
        List list0 = k.createListBuilder();
        if(commentItemType$CommentItem0.isPinned()) {
            list0.add(new Pin(pinComment0.getPinnedUserName(), CommentItemUIModelKt.toUIModel$default(commentItemType$CommentItem0, commentListViewModel0, null, true, false, null, 26, null), new h(commentListViewModel0)));
        }
        else {
            list0.add(CommentItemUIModelKt.toUIModel$default(commentItemType$CommentItem0, commentListViewModel0, null, true, false, new i(commentListViewModel0), 10, null));
        }
        List list1 = commentItemType$CommentItem0.getChildren();
        if(list1 != null) {
            CommentItem commentItemType$CommentItem1 = commentItemType$CommentItem0;
            for(Object object0: list1) {
                list0.add(new Reply(CommentItemUIModelKt.toUIModel(((CommentItem)object0), commentListViewModel0, commentItemType$CommentItem1, false, commentListViewModel0.isMyUserId(commentItemType$CommentItem0.getUserId()), new j(commentListViewModel0, ((CommentItem)object0)))));
                commentItemType$CommentItem1 = (CommentItem)object0;
            }
        }
        return k.build(list0);
    }

    @NotNull
    public static final Comment toUIModel(@NotNull CommentItem commentItemType$CommentItem0, @NotNull CommentListViewModel commentListViewModel0, @Nullable CommentItem commentItemType$CommentItem1, boolean z, boolean z1, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "<this>");
        Intrinsics.checkNotNullParameter(commentListViewModel0, "viewModel");
        Intrinsics.checkNotNullParameter(function00, "onClickReply");
        boolean z2 = commentListViewModel0.isAllowedSecret(commentItemType$CommentItem0, z1) || !commentItemType$CommentItem0.isSecret();
        long v = commentItemType$CommentItem0.getId();
        String s = commentItemType$CommentItem0.getWriterName();
        String s1 = commentItemType$CommentItem0.getMentionUserName();
        String s2 = commentItemType$CommentItem0.getContent();
        List list0 = commentItemType$CommentItem0.getChildren();
        return list0 == null ? new Comment(v, s, commentItemType$CommentItem0.getProfileImageUrl(), commentItemType$CommentItem0.getWritten(), s1, s2, 0, commentItemType$CommentItem0.getOrderAmount(), commentItemType$CommentItem0.isSecret(), commentItemType$CommentItem0.isPinned(), commentItemType$CommentItem0.isRestrict(), z2, commentListViewModel0.isMenuVisible(commentItemType$CommentItem0), commentListViewModel0.isReplyButtonVisible(commentItemType$CommentItem0, z1), z, new p(commentListViewModel0, commentItemType$CommentItem1, commentItemType$CommentItem0), new q(commentListViewModel0, commentItemType$CommentItem0, z1), new r(commentListViewModel0, commentItemType$CommentItem0, z1), new s(commentListViewModel0), function00, new t(commentListViewModel0)) : new Comment(v, s, commentItemType$CommentItem0.getProfileImageUrl(), commentItemType$CommentItem0.getWritten(), s1, s2, list0.size(), commentItemType$CommentItem0.getOrderAmount(), commentItemType$CommentItem0.isSecret(), commentItemType$CommentItem0.isPinned(), commentItemType$CommentItem0.isRestrict(), z2, commentListViewModel0.isMenuVisible(commentItemType$CommentItem0), commentListViewModel0.isReplyButtonVisible(commentItemType$CommentItem0, z1), z, new p(commentListViewModel0, commentItemType$CommentItem1, commentItemType$CommentItem0), new q(commentListViewModel0, commentItemType$CommentItem0, z1), new r(commentListViewModel0, commentItemType$CommentItem0, z1), new s(commentListViewModel0), function00, new t(commentListViewModel0));
    }

    @NotNull
    public static final Pin toUIModel(@NotNull PinComment pinComment0, @NotNull CommentListViewModel commentListViewModel0, @Nullable CommentItem commentItemType$CommentItem0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(pinComment0, "<this>");
        Intrinsics.checkNotNullParameter(commentListViewModel0, "viewModel");
        return new Pin(pinComment0.getPinnedUserName(), CommentItemUIModelKt.toUIModel$default(pinComment0.getComment(), commentListViewModel0, commentItemType$CommentItem0, z, z1, null, 16, null), new com.kakao.tistory.presentation.view.comment.contract.k(commentListViewModel0));
    }

    @NotNull
    public static final CommentItemUIModel toUIModel(@NotNull CommentItemType commentItemType0, @NotNull CommentListViewModel commentListViewModel0, @Nullable CommentItem commentItemType$CommentItem0, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(commentItemType0, "<this>");
        Intrinsics.checkNotNullParameter(commentListViewModel0, "viewModel");
        if(Intrinsics.areEqual(commentItemType0, CommentHeader.INSTANCE)) {
            return Header.INSTANCE;
        }
        if(commentItemType0 instanceof CommentItem) {
            return CommentItemUIModelKt.toUIModel(((CommentItem)commentItemType0), commentListViewModel0, commentItemType$CommentItem0, z, z1, new l(commentListViewModel0, commentItemType0));
        }
        if(commentItemType0 instanceof CommentReplyItem) {
            boolean z2 = commentListViewModel0.isMyUserId(((CommentReplyItem)commentItemType0).getParentUserId()) && ((CommentReplyItem)commentItemType0).getCommentItem().getMentionId() == null;
            List list0 = ((CommentReplyItem)commentItemType0).getParentComment().getChildren();
            Long long0 = null;
            if(list0 != null) {
                for(Object object0: list0) {
                    Long long1 = ((CommentReplyItem)commentItemType0).getCommentItem().getMentionId();
                    if(long1 == null || ((CommentItem)object0).getId() != ((long)long1)) {
                        continue;
                    }
                    goto label_18;
                }
                object0 = null;
            label_18:
                if(((CommentItem)object0) != null) {
                    long0 = ((CommentItem)object0).getUserId();
                }
            }
            boolean z3 = commentListViewModel0.isMyUserId(long0);
            CommentItem commentItemType$CommentItem1 = ((CommentReplyItem)commentItemType0).getCommentItem();
            return z2 || z3 ? new Reply(CommentItemUIModelKt.toUIModel(commentItemType$CommentItem1, commentListViewModel0, commentItemType$CommentItem0, false, true, new m(commentListViewModel0, commentItemType0))) : new Reply(CommentItemUIModelKt.toUIModel(commentItemType$CommentItem1, commentListViewModel0, commentItemType$CommentItem0, false, false, new m(commentListViewModel0, commentItemType0)));
        }
        if(!(commentItemType0 instanceof CommentReplyMoreItem)) {
            throw new NoWhenBranchMatchedException();
        }
        return new MoreButton(((CommentReplyMoreItem)commentItemType0).getReplySize(), new n(commentListViewModel0, commentItemType0));
    }

    public static Comment toUIModel$default(CommentItem commentItemType$CommentItem0, CommentListViewModel commentListViewModel0, CommentItem commentItemType$CommentItem1, boolean z, boolean z1, Function0 function00, int v, Object object0) {
        if((v & 2) != 0) {
            commentItemType$CommentItem1 = null;
        }
        if((v & 16) != 0) {
            function00 = o.a;
        }
        return CommentItemUIModelKt.toUIModel(commentItemType$CommentItem0, commentListViewModel0, commentItemType$CommentItem1, ((v & 4) == 0 ? z : false), ((v & 8) == 0 ? z1 : false), function00);
    }

    public static Pin toUIModel$default(PinComment pinComment0, CommentListViewModel commentListViewModel0, CommentItem commentItemType$CommentItem0, boolean z, boolean z1, int v, Object object0) {
        if((v & 2) != 0) {
            commentItemType$CommentItem0 = null;
        }
        if((v & 4) != 0) {
            z = false;
        }
        if((v & 8) != 0) {
            z1 = false;
        }
        return CommentItemUIModelKt.toUIModel(pinComment0, commentListViewModel0, commentItemType$CommentItem0, z, z1);
    }

    public static CommentItemUIModel toUIModel$default(CommentItemType commentItemType0, CommentListViewModel commentListViewModel0, CommentItem commentItemType$CommentItem0, boolean z, boolean z1, int v, Object object0) {
        if((v & 2) != 0) {
            commentItemType$CommentItem0 = null;
        }
        if((v & 4) != 0) {
            z = false;
        }
        if((v & 8) != 0) {
            z1 = false;
        }
        return CommentItemUIModelKt.toUIModel(commentItemType0, commentListViewModel0, commentItemType$CommentItem0, z, z1);
    }
}

