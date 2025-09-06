package com.kakao.tistory.presentation.view.comment.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel;", "", "Comment", "Header", "MoreButton", "Pin", "Reply", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Header;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$MoreButton;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Reply;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class CommentItemUIModel {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B\u008F\u0002\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\b\b\u0002\u0010\u000F\u001A\u00020\r\u0012\b\b\u0002\u0010\u0010\u001A\u00020\r\u0012\b\b\u0002\u0010\u0011\u001A\u00020\r\u0012\b\b\u0002\u0010\u0012\u001A\u00020\r\u0012\b\b\u0002\u0010\u0013\u001A\u00020\r\u0012\b\b\u0002\u0010\u0014\u001A\u00020\r\u0012\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000E\b\u0002\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000E\b\u0002\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0014\b\u0002\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u001A\u0012\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000E\b\u0002\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J\u0012\u0010\"\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010#J\u0012\u0010%\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010#J\u0012\u0010&\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010#J\u0012\u0010\'\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010#J\u0010\u0010(\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b(\u0010)J\u0012\u0010*\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b.\u0010-J\u0010\u0010/\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b/\u0010-J\u0010\u00100\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b0\u0010-J\u0010\u00101\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b1\u0010-J\u0010\u00102\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b2\u0010-J\u0010\u00103\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b3\u0010-J\u0016\u00104\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00C6\u0003\u00A2\u0006\u0004\b4\u00105J\u0016\u00106\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00C6\u0003\u00A2\u0006\u0004\b6\u00105J\u0016\u00107\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00C6\u0003\u00A2\u0006\u0004\b7\u00105J\u001C\u00108\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u001AH\u00C6\u0003\u00A2\u0006\u0004\b8\u00109J\u0016\u0010:\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00C6\u0003\u00A2\u0006\u0004\b:\u00105J\u0016\u0010;\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00C6\u0003\u00A2\u0006\u0004\b;\u00105J\u0098\u0002\u0010<\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000B\u001A\u00020\n2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\b\b\u0002\u0010\u0010\u001A\u00020\r2\b\b\u0002\u0010\u0011\u001A\u00020\r2\b\b\u0002\u0010\u0012\u001A\u00020\r2\b\b\u0002\u0010\u0013\u001A\u00020\r2\b\b\u0002\u0010\u0014\u001A\u00020\r2\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u00152\u000E\b\u0002\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00160\u00152\u000E\b\u0002\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00160\u00152\u0014\b\u0002\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u001A2\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00160\u00152\u000E\b\u0002\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00C6\u0001\u00A2\u0006\u0004\b<\u0010=J\u0010\u0010>\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b>\u0010#J\u0010\u0010?\u001A\u00020\nH\u00D6\u0001\u00A2\u0006\u0004\b?\u0010)J\u001A\u0010B\u001A\u00020\r2\b\u0010A\u001A\u0004\u0018\u00010@H\u00D6\u0003\u00A2\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010!R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010#R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bJ\u0010H\u001A\u0004\bK\u0010#R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bL\u0010H\u001A\u0004\bM\u0010#R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bN\u0010H\u001A\u0004\bO\u0010#R\u0019\u0010\t\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bP\u0010H\u001A\u0004\bQ\u0010#R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\bR\u0010S\u001A\u0004\bT\u0010)R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\bW\u0010+R\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\bX\u0010Y\u001A\u0004\b\u000E\u0010-R\u0017\u0010\u000F\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\bZ\u0010Y\u001A\u0004\b\u000F\u0010-R\u0017\u0010\u0010\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b[\u0010Y\u001A\u0004\b\u0010\u0010-R\u0017\u0010\u0011\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b\\\u0010Y\u001A\u0004\b]\u0010-R\u0017\u0010\u0012\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b^\u0010Y\u001A\u0004\b_\u0010-R\u0017\u0010\u0013\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b`\u0010Y\u001A\u0004\ba\u0010-R\u0017\u0010\u0014\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\bb\u0010Y\u001A\u0004\bc\u0010-R\u001D\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006\u00A2\u0006\f\n\u0004\bd\u0010e\u001A\u0004\bf\u00105R\u001D\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006\u00A2\u0006\f\n\u0004\bg\u0010e\u001A\u0004\bh\u00105R\u001D\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006\u00A2\u0006\f\n\u0004\bi\u0010e\u001A\u0004\bj\u00105R#\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u001A8\u0006\u00A2\u0006\f\n\u0004\bk\u0010l\u001A\u0004\bm\u00109R\u001D\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006\u00A2\u0006\f\n\u0004\bn\u0010e\u001A\u0004\bo\u00105R\u001D\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006\u00A2\u0006\f\n\u0004\bp\u0010e\u001A\u0004\bq\u00105\u00A8\u0006r"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel;", "", "id", "", "userName", "userThumbnail", "writtenTime", "mentionUserName", "comment", "", "replyCount", "orderAmount", "", "isSecret", "isPinned", "isRestrict", "showPrivacyInform", "showMenuButton", "showReplyButton", "showReplyCount", "Lkotlin/Function0;", "", "onClickMenu", "onclickUserName", "onClickUserThumbnail", "Lkotlin/Function1;", "onClickLink", "onClickReply", "onClickMore", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;ZZZZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()I", "component8", "()Ljava/lang/Long;", "component9", "()Z", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Lkotlin/jvm/functions/Function0;", "component17", "component18", "component19", "()Lkotlin/jvm/functions/Function1;", "component20", "component21", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;ZZZZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "b", "Ljava/lang/String;", "getUserName", "c", "getUserThumbnail", "d", "getWrittenTime", "e", "getMentionUserName", "f", "getComment", "g", "I", "getReplyCount", "h", "Ljava/lang/Long;", "getOrderAmount", "i", "Z", "j", "k", "l", "getShowPrivacyInform", "m", "getShowMenuButton", "n", "getShowReplyButton", "o", "getShowReplyCount", "p", "Lkotlin/jvm/functions/Function0;", "getOnClickMenu", "q", "getOnclickUserName", "r", "getOnClickUserThumbnail", "s", "Lkotlin/jvm/functions/Function1;", "getOnClickLink", "t", "getOnClickReply", "u", "getOnClickMore", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Comment extends CommentItemUIModel {
        public static final int $stable;
        public final long a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final int g;
        public final Long h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final boolean m;
        public final boolean n;
        public final boolean o;
        public final Function0 p;
        public final Function0 q;
        public final Function0 r;
        public final Function1 s;
        public final Function0 t;
        public final Function0 u;

        public Comment() {
            this(0L, null, null, null, null, null, 0, null, false, false, false, false, false, false, false, null, null, null, null, null, null, 0x1FFFFF, null);
        }

        public Comment(long v, @Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, int v1, @Nullable Long long0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function1 function10, @NotNull Function0 function03, @NotNull Function0 function04) {
            Intrinsics.checkNotNullParameter(function00, "onClickMenu");
            Intrinsics.checkNotNullParameter(function01, "onclickUserName");
            Intrinsics.checkNotNullParameter(function02, "onClickUserThumbnail");
            Intrinsics.checkNotNullParameter(function10, "onClickLink");
            Intrinsics.checkNotNullParameter(function03, "onClickReply");
            Intrinsics.checkNotNullParameter(function04, "onClickMore");
            super(null);
            this.a = v;
            this.b = s;
            this.c = s1;
            this.d = s2;
            this.e = s3;
            this.f = s4;
            this.g = v1;
            this.h = long0;
            this.i = z;
            this.j = z1;
            this.k = z2;
            this.l = z3;
            this.m = z4;
            this.n = z5;
            this.o = z6;
            this.p = function00;
            this.q = function01;
            this.r = function02;
            this.s = function10;
            this.t = function03;
            this.u = function04;
        }

        public Comment(long v, String s, String s1, String s2, String s3, String s4, int v1, Long long0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Function0 function00, Function0 function01, Function0 function02, Function1 function10, Function0 function03, Function0 function04, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            Function0 function05 = (v2 & 0x8000) == 0 ? function00 : a.a;
            Function0 function06 = (v2 & 0x10000) == 0 ? function01 : b.a;
            Function0 function07 = (v2 & 0x20000) == 0 ? function02 : c.a;
            Function1 function11 = (v2 & 0x40000) == 0 ? function10 : d.a;
            Function0 function08 = (v2 & 0x80000) == 0 ? function03 : e.a;
            Function0 function09 = (v2 & 0x100000) == 0 ? function04 : f.a;
            this(((v2 & 1) == 0 ? v : 0L), ((v2 & 2) == 0 ? s : null), ((v2 & 4) == 0 ? s1 : null), ((v2 & 8) == 0 ? s2 : null), ((v2 & 16) == 0 ? s3 : null), ((v2 & 0x20) == 0 ? s4 : null), ((v2 & 0x40) == 0 ? v1 : 0), ((v2 & 0x80) == 0 ? long0 : null), ((v2 & 0x100) == 0 ? z : false), ((v2 & 0x200) == 0 ? z1 : false), ((v2 & 0x400) == 0 ? z2 : false), ((v2 & 0x800) == 0 ? z3 : false), ((v2 & 0x1000) == 0 ? z4 : false), ((v2 & 0x2000) == 0 ? z5 : false), ((v2 & 0x4000) == 0 ? z6 : false), function05, function06, function07, function11, function08, function09);
        }

        public final long component1() {
            return this.a;
        }

        public final boolean component10() {
            return this.j;
        }

        public final boolean component11() {
            return this.k;
        }

        public final boolean component12() {
            return this.l;
        }

        public final boolean component13() {
            return this.m;
        }

        public final boolean component14() {
            return this.n;
        }

        public final boolean component15() {
            return this.o;
        }

        @NotNull
        public final Function0 component16() {
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
        public final Function1 component19() {
            return this.s;
        }

        @Nullable
        public final String component2() {
            return this.b;
        }

        @NotNull
        public final Function0 component20() {
            return this.t;
        }

        @NotNull
        public final Function0 component21() {
            return this.u;
        }

        @Nullable
        public final String component3() {
            return this.c;
        }

        @Nullable
        public final String component4() {
            return this.d;
        }

        @Nullable
        public final String component5() {
            return this.e;
        }

        @Nullable
        public final String component6() {
            return this.f;
        }

        public final int component7() {
            return this.g;
        }

        @Nullable
        public final Long component8() {
            return this.h;
        }

        public final boolean component9() {
            return this.i;
        }

        @NotNull
        public final Comment copy(long v, @Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4, int v1, @Nullable Long long0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function1 function10, @NotNull Function0 function03, @NotNull Function0 function04) {
            Intrinsics.checkNotNullParameter(function00, "onClickMenu");
            Intrinsics.checkNotNullParameter(function01, "onclickUserName");
            Intrinsics.checkNotNullParameter(function02, "onClickUserThumbnail");
            Intrinsics.checkNotNullParameter(function10, "onClickLink");
            Intrinsics.checkNotNullParameter(function03, "onClickReply");
            Intrinsics.checkNotNullParameter(function04, "onClickMore");
            return new Comment(v, s, s1, s2, s3, s4, v1, long0, z, z1, z2, z3, z4, z5, z6, function00, function01, function02, function10, function03, function04);
        }

        public static Comment copy$default(Comment commentItemUIModel$Comment0, long v, String s, String s1, String s2, String s3, String s4, int v1, Long long0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Function0 function00, Function0 function01, Function0 function02, Function1 function10, Function0 function03, Function0 function04, int v2, Object object0) {
            long v3 = (v2 & 1) == 0 ? v : commentItemUIModel$Comment0.a;
            String s5 = (v2 & 2) == 0 ? s : commentItemUIModel$Comment0.b;
            String s6 = (v2 & 4) == 0 ? s1 : commentItemUIModel$Comment0.c;
            String s7 = (v2 & 8) == 0 ? s2 : commentItemUIModel$Comment0.d;
            String s8 = (v2 & 16) == 0 ? s3 : commentItemUIModel$Comment0.e;
            String s9 = (v2 & 0x20) == 0 ? s4 : commentItemUIModel$Comment0.f;
            int v4 = (v2 & 0x40) == 0 ? v1 : commentItemUIModel$Comment0.g;
            Long long1 = (v2 & 0x80) == 0 ? long0 : commentItemUIModel$Comment0.h;
            boolean z7 = (v2 & 0x100) == 0 ? z : commentItemUIModel$Comment0.i;
            boolean z8 = (v2 & 0x200) == 0 ? z1 : commentItemUIModel$Comment0.j;
            boolean z9 = (v2 & 0x400) == 0 ? z2 : commentItemUIModel$Comment0.k;
            boolean z10 = (v2 & 0x800) == 0 ? z3 : commentItemUIModel$Comment0.l;
            boolean z11 = (v2 & 0x1000) == 0 ? z4 : commentItemUIModel$Comment0.m;
            boolean z12 = (v2 & 0x2000) == 0 ? z5 : commentItemUIModel$Comment0.n;
            boolean z13 = (v2 & 0x4000) == 0 ? z6 : commentItemUIModel$Comment0.o;
            Function0 function05 = (v2 & 0x8000) == 0 ? function00 : commentItemUIModel$Comment0.p;
            Function0 function06 = (v2 & 0x10000) == 0 ? function01 : commentItemUIModel$Comment0.q;
            Function0 function07 = (v2 & 0x20000) == 0 ? function02 : commentItemUIModel$Comment0.r;
            Function1 function11 = (v2 & 0x40000) == 0 ? function10 : commentItemUIModel$Comment0.s;
            Function0 function08 = (v2 & 0x80000) == 0 ? function03 : commentItemUIModel$Comment0.t;
            return (v2 & 0x100000) == 0 ? commentItemUIModel$Comment0.copy(v3, s5, s6, s7, s8, s9, v4, long1, z7, z8, z9, z10, z11, z12, z13, function05, function06, function07, function11, function08, function04) : commentItemUIModel$Comment0.copy(v3, s5, s6, s7, s8, s9, v4, long1, z7, z8, z9, z10, z11, z12, z13, function05, function06, function07, function11, function08, commentItemUIModel$Comment0.u);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Comment)) {
                return false;
            }
            Comment commentItemUIModel$Comment0 = (Comment)object0;
            if(this.a != commentItemUIModel$Comment0.a) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, commentItemUIModel$Comment0.b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, commentItemUIModel$Comment0.c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, commentItemUIModel$Comment0.d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, commentItemUIModel$Comment0.e)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.f, commentItemUIModel$Comment0.f)) {
                return false;
            }
            if(this.g != commentItemUIModel$Comment0.g) {
                return false;
            }
            if(!Intrinsics.areEqual(this.h, commentItemUIModel$Comment0.h)) {
                return false;
            }
            if(this.i != commentItemUIModel$Comment0.i) {
                return false;
            }
            if(this.j != commentItemUIModel$Comment0.j) {
                return false;
            }
            if(this.k != commentItemUIModel$Comment0.k) {
                return false;
            }
            if(this.l != commentItemUIModel$Comment0.l) {
                return false;
            }
            if(this.m != commentItemUIModel$Comment0.m) {
                return false;
            }
            if(this.n != commentItemUIModel$Comment0.n) {
                return false;
            }
            if(this.o != commentItemUIModel$Comment0.o) {
                return false;
            }
            if(!Intrinsics.areEqual(this.p, commentItemUIModel$Comment0.p)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.q, commentItemUIModel$Comment0.q)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.r, commentItemUIModel$Comment0.r)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.s, commentItemUIModel$Comment0.s)) {
                return false;
            }
            return Intrinsics.areEqual(this.t, commentItemUIModel$Comment0.t) ? Intrinsics.areEqual(this.u, commentItemUIModel$Comment0.u) : false;
        }

        @Nullable
        public final String getComment() {
            return this.f;
        }

        public final long getId() {
            return this.a;
        }

        @Nullable
        public final String getMentionUserName() {
            return this.e;
        }

        @NotNull
        public final Function1 getOnClickLink() {
            return this.s;
        }

        @NotNull
        public final Function0 getOnClickMenu() {
            return this.p;
        }

        @NotNull
        public final Function0 getOnClickMore() {
            return this.u;
        }

        @NotNull
        public final Function0 getOnClickReply() {
            return this.t;
        }

        @NotNull
        public final Function0 getOnClickUserThumbnail() {
            return this.r;
        }

        @NotNull
        public final Function0 getOnclickUserName() {
            return this.q;
        }

        @Nullable
        public final Long getOrderAmount() {
            return this.h;
        }

        public final int getReplyCount() {
            return this.g;
        }

        public final boolean getShowMenuButton() {
            return this.m;
        }

        public final boolean getShowPrivacyInform() {
            return this.l;
        }

        public final boolean getShowReplyButton() {
            return this.n;
        }

        public final boolean getShowReplyCount() {
            return this.o;
        }

        @Nullable
        public final String getUserName() {
            return this.b;
        }

        @Nullable
        public final String getUserThumbnail() {
            return this.c;
        }

        @Nullable
        public final String getWrittenTime() {
            return this.d;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = com.kakao.tistory.presentation.screen.blog.common.contract.a.a(this.g, (((((Long.hashCode(this.a) * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F + (this.f == null ? 0 : this.f.hashCode())) * 0x1F, 0x1F);
            Long long0 = this.h;
            if(long0 != null) {
                v = long0.hashCode();
            }
            return this.u.hashCode() + com.kakao.tistory.presentation.main.contract.a.a(this.t, com.kakao.tistory.presentation.main.contract.b.a(this.s, com.kakao.tistory.presentation.main.contract.a.a(this.r, com.kakao.tistory.presentation.main.contract.a.a(this.q, com.kakao.tistory.presentation.main.contract.a.a(this.p, com.kakao.tistory.presentation.main.contract.c.a(this.o, com.kakao.tistory.presentation.main.contract.c.a(this.n, com.kakao.tistory.presentation.main.contract.c.a(this.m, com.kakao.tistory.presentation.main.contract.c.a(this.l, com.kakao.tistory.presentation.main.contract.c.a(this.k, com.kakao.tistory.presentation.main.contract.c.a(this.j, com.kakao.tistory.presentation.main.contract.c.a(this.i, (v1 + v) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
        }

        public final boolean isPinned() {
            return this.j;
        }

        public final boolean isRestrict() {
            return this.k;
        }

        public final boolean isSecret() {
            return this.i;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Comment(id=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", userName=");
            stringBuilder0.append(this.b);
            androidx.room.a.w(stringBuilder0, ", userThumbnail=", this.c, ", writtenTime=", this.d);
            androidx.room.a.w(stringBuilder0, ", mentionUserName=", this.e, ", comment=", this.f);
            stringBuilder0.append(", replyCount=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", orderAmount=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", isSecret=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", isPinned=");
            stringBuilder0.append(this.j);
            stringBuilder0.append(", isRestrict=");
            stringBuilder0.append(this.k);
            stringBuilder0.append(", showPrivacyInform=");
            stringBuilder0.append(this.l);
            stringBuilder0.append(", showMenuButton=");
            stringBuilder0.append(this.m);
            stringBuilder0.append(", showReplyButton=");
            stringBuilder0.append(this.n);
            stringBuilder0.append(", showReplyCount=");
            stringBuilder0.append(this.o);
            stringBuilder0.append(", onClickMenu=");
            stringBuilder0.append(this.p);
            stringBuilder0.append(", onclickUserName=");
            stringBuilder0.append(this.q);
            stringBuilder0.append(", onClickUserThumbnail=");
            stringBuilder0.append(this.r);
            stringBuilder0.append(", onClickLink=");
            stringBuilder0.append(this.s);
            stringBuilder0.append(", onClickReply=");
            stringBuilder0.append(this.t);
            stringBuilder0.append(", onClickMore=");
            stringBuilder0.append(this.u);
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Header;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Header extends CommentItemUIModel {
        public static final int $stable;
        @NotNull
        public static final Header INSTANCE;

        static {
            Header.INSTANCE = new Header();
        }

        public Header() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ*\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\nR\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\f¨\u0006 "}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$MoreButton;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel;", "", "size", "Lkotlin/Function0;", "", "onClick", "<init>", "(JLkotlin/jvm/functions/Function0;)V", "component1", "()J", "component2", "()Lkotlin/jvm/functions/Function0;", "copy", "(JLkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$MoreButton;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getSize", "b", "Lkotlin/jvm/functions/Function0;", "getOnClick", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class MoreButton extends CommentItemUIModel {
        public static final int $stable;
        public final long a;
        public final Function0 b;

        public MoreButton(long v, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(function00, "onClick");
            super(null);
            this.a = v;
            this.b = function00;
        }

        public final long component1() {
            return this.a;
        }

        @NotNull
        public final Function0 component2() {
            return this.b;
        }

        @NotNull
        public final MoreButton copy(long v, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(function00, "onClick");
            return new MoreButton(v, function00);
        }

        public static MoreButton copy$default(MoreButton commentItemUIModel$MoreButton0, long v, Function0 function00, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = commentItemUIModel$MoreButton0.a;
            }
            if((v1 & 2) != 0) {
                function00 = commentItemUIModel$MoreButton0.b;
            }
            return commentItemUIModel$MoreButton0.copy(v, function00);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof MoreButton)) {
                return false;
            }
            return this.a == ((MoreButton)object0).a ? Intrinsics.areEqual(this.b, ((MoreButton)object0).b) : false;
        }

        @NotNull
        public final Function0 getOnClick() {
            return this.b;
        }

        public final long getSize() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + Long.hashCode(this.a) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "MoreButton(size=" + this.a + ", onClick=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000B\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J6\u0010\u0011\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001A\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u001A\u001A\u00020\u00192\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BR\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000ER\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel;", "", "ownerUserName", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;", "comment", "Lkotlin/Function0;", "", "onClickReply", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;Lkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;", "component3", "()Lkotlin/jvm/functions/Function0;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOwnerUserName", "b", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;", "getComment", "c", "Lkotlin/jvm/functions/Function0;", "getOnClickReply", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Pin extends CommentItemUIModel {
        public static final int $stable;
        public final String a;
        public final Comment b;
        public final Function0 c;

        public Pin(@Nullable String s, @NotNull Comment commentItemUIModel$Comment0, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(commentItemUIModel$Comment0, "comment");
            Intrinsics.checkNotNullParameter(function00, "onClickReply");
            super(null);
            this.a = s;
            this.b = commentItemUIModel$Comment0;
            this.c = function00;
        }

        public Pin(String s, Comment commentItemUIModel$Comment0, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = null;
            }
            if((v & 4) != 0) {
                function00 = g.a;
            }
            this(s, commentItemUIModel$Comment0, function00);
        }

        @Nullable
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Comment component2() {
            return this.b;
        }

        @NotNull
        public final Function0 component3() {
            return this.c;
        }

        @NotNull
        public final Pin copy(@Nullable String s, @NotNull Comment commentItemUIModel$Comment0, @NotNull Function0 function00) {
            Intrinsics.checkNotNullParameter(commentItemUIModel$Comment0, "comment");
            Intrinsics.checkNotNullParameter(function00, "onClickReply");
            return new Pin(s, commentItemUIModel$Comment0, function00);
        }

        public static Pin copy$default(Pin commentItemUIModel$Pin0, String s, Comment commentItemUIModel$Comment0, Function0 function00, int v, Object object0) {
            if((v & 1) != 0) {
                s = commentItemUIModel$Pin0.a;
            }
            if((v & 2) != 0) {
                commentItemUIModel$Comment0 = commentItemUIModel$Pin0.b;
            }
            if((v & 4) != 0) {
                function00 = commentItemUIModel$Pin0.c;
            }
            return commentItemUIModel$Pin0.copy(s, commentItemUIModel$Comment0, function00);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Pin)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Pin)object0).a)) {
                return false;
            }
            return Intrinsics.areEqual(this.b, ((Pin)object0).b) ? Intrinsics.areEqual(this.c, ((Pin)object0).c) : false;
        }

        @NotNull
        public final Comment getComment() {
            return this.b;
        }

        @NotNull
        public final Function0 getOnClickReply() {
            return this.c;
        }

        @Nullable
        public final String getOwnerUserName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? this.c.hashCode() + this.b.hashCode() * 0x1F : this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Pin(ownerUserName=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", comment=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", onClickReply=");
            return q.q(stringBuilder0, this.c, ")");
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Reply;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;", "comment", "<init>", "(Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;)V", "component1", "()Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;", "copy", "(Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Reply;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;", "getComment", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Reply extends CommentItemUIModel {
        public static final int $stable;
        public final Comment a;

        public Reply(@NotNull Comment commentItemUIModel$Comment0) {
            Intrinsics.checkNotNullParameter(commentItemUIModel$Comment0, "comment");
            super(null);
            this.a = commentItemUIModel$Comment0;
        }

        @NotNull
        public final Comment component1() {
            return this.a;
        }

        @NotNull
        public final Reply copy(@NotNull Comment commentItemUIModel$Comment0) {
            Intrinsics.checkNotNullParameter(commentItemUIModel$Comment0, "comment");
            return new Reply(commentItemUIModel$Comment0);
        }

        public static Reply copy$default(Reply commentItemUIModel$Reply0, Comment commentItemUIModel$Comment0, int v, Object object0) {
            if((v & 1) != 0) {
                commentItemUIModel$Comment0 = commentItemUIModel$Reply0.a;
            }
            return commentItemUIModel$Reply0.copy(commentItemUIModel$Comment0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Reply ? Intrinsics.areEqual(this.a, ((Reply)object0).a) : false;
        }

        @NotNull
        public final Comment getComment() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Reply(comment=" + this.a + ")";
        }
    }

    public static final int $stable;

    public CommentItemUIModel(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

