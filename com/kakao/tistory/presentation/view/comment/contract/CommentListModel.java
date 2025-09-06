package com.kakao.tistory.presentation.view.comment.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.presentation.main.contract.b;
import com.kakao.tistory.presentation.main.contract.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001D\n\u0002\u0010\b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u00F0\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\u0014\b\u0002\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\r\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000E\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u000B\u0012\u0014\b\u0002\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u0014\u0012#\b\u0002\u0010\u001A\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00190\u0014\u0012\u0014\b\u0002\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u00190\u0014\u0012\u0014\b\u0002\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020\u00190\u0014\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\"J\u001C\u0010$\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0012\u0010&\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b(\u0010)J\u0010\u0010*\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010\"J\u0012\u0010+\u001A\u0004\u0018\u00010\u000EH\u00C6\u0003\u00A2\u0006\u0004\b+\u0010,J\u0012\u0010-\u001A\u0004\u0018\u00010\u000EH\u00C6\u0003\u00A2\u0006\u0004\b-\u0010,J\u0010\u0010.\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010\"J\u0010\u0010/\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b/\u0010\"J\u0012\u00100\u001A\u0004\u0018\u00010\u000BH\u00C6\u0003\u00A2\u0006\u0004\b0\u00101J\u001C\u00102\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u0014H\u00C6\u0003\u00A2\u0006\u0004\b2\u00103J+\u00104\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00190\u0014H\u00C6\u0003\u00A2\u0006\u0004\b4\u00103J\u001C\u00105\u001A\u000E\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u00190\u0014H\u00C6\u0003\u00A2\u0006\u0004\b5\u00103J\u001C\u00106\u001A\u000E\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020\u00190\u0014H\u00C6\u0003\u00A2\u0006\u0004\b6\u00103J\u00F9\u0001\u00107\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\u0014\b\u0002\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u00022\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0012\u001A\u00020\u00022\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u000B2\u0014\b\u0002\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00142#\b\u0002\u0010\u001A\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00190\u00142\u0014\b\u0002\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u00190\u00142\u0014\b\u0002\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020\u00190\u0014H\u00C6\u0001\u00A2\u0006\u0004\b7\u00108J\u0010\u00109\u001A\u00020\u0015H\u00D6\u0001\u00A2\u0006\u0004\b9\u0010:J\u0010\u0010<\u001A\u00020;H\u00D6\u0001\u00A2\u0006\u0004\b<\u0010=J\u001A\u0010?\u001A\u00020\u00022\b\u0010>\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\b\u0003\u0010\"R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bC\u0010B\u001A\u0004\b\u0004\u0010\"R#\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010%R\u0019\u0010\n\u001A\u0004\u0018\u00010\t8\u0006\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010\'R\u0017\u0010\f\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010)R\u0017\u0010\r\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bM\u0010B\u001A\u0004\bN\u0010\"R\u0019\u0010\u000F\u001A\u0004\u0018\u00010\u000E8\u0006\u00A2\u0006\f\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010,R\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u000E8\u0006\u00A2\u0006\f\n\u0004\bR\u0010P\u001A\u0004\bS\u0010,R\u0017\u0010\u0011\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bT\u0010B\u001A\u0004\bU\u0010\"R\u0017\u0010\u0012\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bV\u0010B\u001A\u0004\b\u0012\u0010\"R\u0019\u0010\u0013\u001A\u0004\u0018\u00010\u000B8\u0006\u00A2\u0006\f\n\u0004\bW\u0010X\u001A\u0004\bY\u00101R#\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bZ\u0010[\u001A\u0004\b\\\u00103R2\u0010\u001A\u001A\u001D\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00190\u00148\u0006\u00A2\u0006\f\n\u0004\b]\u0010[\u001A\u0004\b^\u00103R#\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u00190\u00148\u0006\u00A2\u0006\f\n\u0004\b_\u0010[\u001A\u0004\b`\u00103R#\u0010\u001E\u001A\u000E\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020\u00190\u00148\u0006\u00A2\u0006\f\n\u0004\ba\u0010[\u001A\u0004\bb\u00103\u00A8\u0006c"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListModel;", "", "", "isInitialized", "isEmpty", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel;", "comments", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;", "pinComment", "", "totalCount", "showEditor", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "parent", "mention", "keepScrollPosition", "isListStartFromBottom", "scrollTargetCommentId", "Lkotlin/Function1;", "", "checkTextValidation", "Lkotlin/ParameterName;", "name", "", "onInitLoadComplete", "Lcom/kakao/tistory/presentation/view/entry/widget/ReplyType;", "onClickRemove", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "onClickComplete", "<init>", "(ZZLkotlinx/coroutines/flow/Flow;Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;JZLcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;ZZLjava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "component1", "()Z", "component2", "component3", "()Lkotlinx/coroutines/flow/Flow;", "component4", "()Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;", "component5", "()J", "component6", "component7", "()Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "component8", "component9", "component10", "component11", "()Ljava/lang/Long;", "component12", "()Lkotlin/jvm/functions/Function1;", "component13", "component14", "component15", "copy", "(ZZLkotlinx/coroutines/flow/Flow;Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;JZLcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;ZZLjava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentListModel;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "c", "Lkotlinx/coroutines/flow/Flow;", "getComments", "d", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;", "getPinComment", "e", "J", "getTotalCount", "f", "getShowEditor", "g", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "getParent", "h", "getMention", "i", "getKeepScrollPosition", "j", "k", "Ljava/lang/Long;", "getScrollTargetCommentId", "l", "Lkotlin/jvm/functions/Function1;", "getCheckTextValidation", "m", "getOnInitLoadComplete", "n", "getOnClickRemove", "o", "getOnClickComplete", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommentListModel {
    public static final int $stable = 8;
    public final boolean a;
    public final boolean b;
    public final Flow c;
    public final Pin d;
    public final long e;
    public final boolean f;
    public final CommentItem g;
    public final CommentItem h;
    public final boolean i;
    public final boolean j;
    public final Long k;
    public final Function1 l;
    public final Function1 m;
    public final Function1 n;
    public final Function1 o;

    public CommentListModel() {
        this(false, false, null, null, 0L, false, null, null, false, false, null, null, null, null, null, 0x7FFF, null);
    }

    public CommentListModel(boolean z, boolean z1, @NotNull Flow flow0, @Nullable Pin commentItemUIModel$Pin0, long v, boolean z2, @Nullable CommentItem commentItemType$CommentItem0, @Nullable CommentItem commentItemType$CommentItem1, boolean z3, boolean z4, @Nullable Long long0, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function1 function12, @NotNull Function1 function13) {
        Intrinsics.checkNotNullParameter(flow0, "comments");
        Intrinsics.checkNotNullParameter(function10, "checkTextValidation");
        Intrinsics.checkNotNullParameter(function11, "onInitLoadComplete");
        Intrinsics.checkNotNullParameter(function12, "onClickRemove");
        Intrinsics.checkNotNullParameter(function13, "onClickComplete");
        super();
        this.a = z;
        this.b = z1;
        this.c = flow0;
        this.d = commentItemUIModel$Pin0;
        this.e = v;
        this.f = z2;
        this.g = commentItemType$CommentItem0;
        this.h = commentItemType$CommentItem1;
        this.i = z3;
        this.j = z4;
        this.k = long0;
        this.l = function10;
        this.m = function11;
        this.n = function12;
        this.o = function13;
    }

    public CommentListModel(boolean z, boolean z1, Flow flow0, Pin commentItemUIModel$Pin0, long v, boolean z2, CommentItem commentItemType$CommentItem0, CommentItem commentItemType$CommentItem1, boolean z3, boolean z4, Long long0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        boolean z5 = false;
        Flow flow1 = (v1 & 4) == 0 ? flow0 : FlowKt.emptyFlow();
        Long long1 = null;
        if((v1 & 0x200) == 0) {
            z5 = z4;
        }
        if((v1 & 0x400) == 0) {
            long1 = long0;
        }
        Function1 function14 = (v1 & 0x800) == 0 ? function10 : u.a;
        Function1 function15 = (v1 & 0x1000) == 0 ? function11 : v.a;
        Function1 function16 = (v1 & 0x2000) == 0 ? function12 : w.a;
        Function1 function17 = (v1 & 0x4000) == 0 ? function13 : x.a;
        this(((v1 & 1) == 0 ? z : false), ((v1 & 2) == 0 ? z1 : false), flow1, ((v1 & 8) == 0 ? commentItemUIModel$Pin0 : null), ((v1 & 16) == 0 ? v : 0L), ((v1 & 0x20) == 0 ? z2 : true), ((v1 & 0x40) == 0 ? commentItemType$CommentItem0 : null), ((v1 & 0x80) == 0 ? commentItemType$CommentItem1 : null), ((v1 & 0x100) == 0 ? z3 : false), z5, long1, function14, function15, function16, function17);
    }

    public final boolean component1() {
        return this.a;
    }

    public final boolean component10() {
        return this.j;
    }

    @Nullable
    public final Long component11() {
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

    @NotNull
    public final Function1 component14() {
        return this.n;
    }

    @NotNull
    public final Function1 component15() {
        return this.o;
    }

    public final boolean component2() {
        return this.b;
    }

    @NotNull
    public final Flow component3() {
        return this.c;
    }

    @Nullable
    public final Pin component4() {
        return this.d;
    }

    public final long component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.f;
    }

    @Nullable
    public final CommentItem component7() {
        return this.g;
    }

    @Nullable
    public final CommentItem component8() {
        return this.h;
    }

    public final boolean component9() {
        return this.i;
    }

    @NotNull
    public final CommentListModel copy(boolean z, boolean z1, @NotNull Flow flow0, @Nullable Pin commentItemUIModel$Pin0, long v, boolean z2, @Nullable CommentItem commentItemType$CommentItem0, @Nullable CommentItem commentItemType$CommentItem1, boolean z3, boolean z4, @Nullable Long long0, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function1 function12, @NotNull Function1 function13) {
        Intrinsics.checkNotNullParameter(flow0, "comments");
        Intrinsics.checkNotNullParameter(function10, "checkTextValidation");
        Intrinsics.checkNotNullParameter(function11, "onInitLoadComplete");
        Intrinsics.checkNotNullParameter(function12, "onClickRemove");
        Intrinsics.checkNotNullParameter(function13, "onClickComplete");
        return new CommentListModel(z, z1, flow0, commentItemUIModel$Pin0, v, z2, commentItemType$CommentItem0, commentItemType$CommentItem1, z3, z4, long0, function10, function11, function12, function13);
    }

    public static CommentListModel copy$default(CommentListModel commentListModel0, boolean z, boolean z1, Flow flow0, Pin commentItemUIModel$Pin0, long v, boolean z2, CommentItem commentItemType$CommentItem0, CommentItem commentItemType$CommentItem1, boolean z3, boolean z4, Long long0, Function1 function10, Function1 function11, Function1 function12, Function1 function13, int v1, Object object0) {
        boolean z5 = (v1 & 1) == 0 ? z : commentListModel0.a;
        boolean z6 = (v1 & 2) == 0 ? z1 : commentListModel0.b;
        Flow flow1 = (v1 & 4) == 0 ? flow0 : commentListModel0.c;
        Pin commentItemUIModel$Pin1 = (v1 & 8) == 0 ? commentItemUIModel$Pin0 : commentListModel0.d;
        long v2 = (v1 & 16) == 0 ? v : commentListModel0.e;
        boolean z7 = (v1 & 0x20) == 0 ? z2 : commentListModel0.f;
        CommentItem commentItemType$CommentItem2 = (v1 & 0x40) == 0 ? commentItemType$CommentItem0 : commentListModel0.g;
        CommentItem commentItemType$CommentItem3 = (v1 & 0x80) == 0 ? commentItemType$CommentItem1 : commentListModel0.h;
        boolean z8 = (v1 & 0x100) == 0 ? z3 : commentListModel0.i;
        boolean z9 = (v1 & 0x200) == 0 ? z4 : commentListModel0.j;
        Long long1 = (v1 & 0x400) == 0 ? long0 : commentListModel0.k;
        Function1 function14 = (v1 & 0x800) == 0 ? function10 : commentListModel0.l;
        Function1 function15 = (v1 & 0x1000) == 0 ? function11 : commentListModel0.m;
        Function1 function16 = (v1 & 0x2000) == 0 ? function12 : commentListModel0.n;
        return (v1 & 0x4000) == 0 ? commentListModel0.copy(z5, z6, flow1, commentItemUIModel$Pin1, v2, z7, commentItemType$CommentItem2, commentItemType$CommentItem3, z8, z9, long1, function14, function15, function16, function13) : commentListModel0.copy(z5, z6, flow1, commentItemUIModel$Pin1, v2, z7, commentItemType$CommentItem2, commentItemType$CommentItem3, z8, z9, long1, function14, function15, function16, commentListModel0.o);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CommentListModel)) {
            return false;
        }
        if(this.a != ((CommentListModel)object0).a) {
            return false;
        }
        if(this.b != ((CommentListModel)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((CommentListModel)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((CommentListModel)object0).d)) {
            return false;
        }
        if(this.e != ((CommentListModel)object0).e) {
            return false;
        }
        if(this.f != ((CommentListModel)object0).f) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((CommentListModel)object0).g)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((CommentListModel)object0).h)) {
            return false;
        }
        if(this.i != ((CommentListModel)object0).i) {
            return false;
        }
        if(this.j != ((CommentListModel)object0).j) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, ((CommentListModel)object0).k)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.l, ((CommentListModel)object0).l)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.m, ((CommentListModel)object0).m)) {
            return false;
        }
        return Intrinsics.areEqual(this.n, ((CommentListModel)object0).n) ? Intrinsics.areEqual(this.o, ((CommentListModel)object0).o) : false;
    }

    @NotNull
    public final Function1 getCheckTextValidation() {
        return this.l;
    }

    @NotNull
    public final Flow getComments() {
        return this.c;
    }

    public final boolean getKeepScrollPosition() {
        return this.i;
    }

    @Nullable
    public final CommentItem getMention() {
        return this.h;
    }

    @NotNull
    public final Function1 getOnClickComplete() {
        return this.o;
    }

    @NotNull
    public final Function1 getOnClickRemove() {
        return this.n;
    }

    @NotNull
    public final Function1 getOnInitLoadComplete() {
        return this.m;
    }

    @Nullable
    public final CommentItem getParent() {
        return this.g;
    }

    @Nullable
    public final Pin getPinComment() {
        return this.d;
    }

    @Nullable
    public final Long getScrollTargetCommentId() {
        return this.k;
    }

    public final boolean getShowEditor() {
        return this.f;
    }

    public final long getTotalCount() {
        return this.e;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = c.a(this.j, c.a(this.i, ((c.a(this.f, a.k(this.e, ((this.c.hashCode() + c.a(this.b, Boolean.hashCode(this.a) * 0x1F, 0x1F)) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F, 0x1F), 0x1F) + (this.g == null ? 0 : this.g.hashCode())) * 0x1F + (this.h == null ? 0 : this.h.hashCode())) * 0x1F, 0x1F), 0x1F);
        Long long0 = this.k;
        if(long0 != null) {
            v = long0.hashCode();
        }
        return this.o.hashCode() + b.a(this.n, b.a(this.m, b.a(this.l, (v1 + v) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    public final boolean isEmpty() {
        return this.b;
    }

    public final boolean isInitialized() {
        return this.a;
    }

    public final boolean isListStartFromBottom() {
        return this.j;
    }

    @Override
    @NotNull
    public String toString() {
        return "CommentListModel(isInitialized=" + this.a + ", isEmpty=" + this.b + ", comments=" + this.c + ", pinComment=" + this.d + ", totalCount=" + this.e + ", showEditor=" + this.f + ", parent=" + this.g + ", mention=" + this.h + ", keepScrollPosition=" + this.i + ", isListStartFromBottom=" + this.j + ", scrollTargetCommentId=" + this.k + ", checkTextValidation=" + this.l + ", onInitLoadComplete=" + this.m + ", onClickRemove=" + this.n + ", onClickComplete=" + this.o + ")";
    }
}

