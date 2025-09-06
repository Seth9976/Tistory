package com.kakao.tistory.presentation.view.comment.contract;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.graph.a;
import com.kakao.tistory.presentation.main.contract.b;
import com.kakao.tistory.presentation.main.contract.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001B\u00C0\u0001\u0012\b\b\u0003\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000B\u0012\u000E\b\u0002\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r\u0012#\b\u0002\u0010\u0013\u001A\u001D\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000E0\u000B\u00128\b\u0002\u0010\u0018\u001A2\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000E0\u0014\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001A\u0004\u0018\u00010\bH\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\"J\u001C\u0010$\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000BH\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0016\u0010&\u001A\b\u0012\u0004\u0012\u00020\u000E0\rH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J+\u0010(\u001A\u001D\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000E0\u000BH\u00C6\u0003\u00A2\u0006\u0004\b(\u0010%J@\u0010)\u001A2\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000E0\u0014H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010*J\u00C9\u0001\u0010+\u001A\u00020\u00002\b\b\u0003\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000B2\u000E\b\u0002\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2#\b\u0002\u0010\u0013\u001A\u001D\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000E0\u000B28\b\u0002\u0010\u0018\u001A2\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000E0\u0014H\u00C6\u0001\u00A2\u0006\u0004\b+\u0010,J\u0010\u0010-\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b-\u0010\u001EJ\u0010\u0010.\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b.\u0010\u001CJ\u001A\u00100\u001A\u00020\u00062\b\u0010/\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u001CR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u001ER\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010 R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010\"R\u0019\u0010\n\u001A\u0004\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b>\u0010<\u001A\u0004\b?\u0010\"R#\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000B8\u0006\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010%R\u001D\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r8\u0006\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010\'R2\u0010\u0013\u001A\u001D\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000E0\u000B8\u0006\u00A2\u0006\f\n\u0004\bF\u0010A\u001A\u0004\bG\u0010%RG\u0010\u0018\u001A2\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000E0\u00148\u0006\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010*\u00A8\u0006K"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyModel;", "", "", "titleResId", "", "initComment", "", "showSecretButton", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "origin", "mention", "Lkotlin/Function1;", "checkTextValidation", "Lkotlin/Function0;", "", "removeMention", "Lkotlin/ParameterName;", "name", "modified", "onClickCancel", "Lkotlin/Function2;", "isPinned", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "commentCompletion", "onClickComplete", "<init>", "(ILjava/lang/String;ZLcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Z", "component4", "()Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "component5", "component6", "()Lkotlin/jvm/functions/Function1;", "component7", "()Lkotlin/jvm/functions/Function0;", "component8", "component9", "()Lkotlin/jvm/functions/Function2;", "copy", "(ILjava/lang/String;ZLcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyModel;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getTitleResId", "b", "Ljava/lang/String;", "getInitComment", "c", "Z", "getShowSecretButton", "d", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "getOrigin", "e", "getMention", "f", "Lkotlin/jvm/functions/Function1;", "getCheckTextValidation", "g", "Lkotlin/jvm/functions/Function0;", "getRemoveMention", "h", "getOnClickCancel", "i", "Lkotlin/jvm/functions/Function2;", "getOnClickComplete", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommentModifyModel {
    public static final int $stable = 8;
    public final int a;
    public final String b;
    public final boolean c;
    public final CommentItem d;
    public final CommentItem e;
    public final Function1 f;
    public final Function0 g;
    public final Function1 h;
    public final Function2 i;

    public CommentModifyModel() {
        this(0, null, false, null, null, null, null, null, null, 0x1FF, null);
    }

    public CommentModifyModel(@StringRes int v, @NotNull String s, boolean z, @NotNull CommentItem commentItemType$CommentItem0, @Nullable CommentItem commentItemType$CommentItem1, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function1 function11, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(s, "initComment");
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "origin");
        Intrinsics.checkNotNullParameter(function10, "checkTextValidation");
        Intrinsics.checkNotNullParameter(function00, "removeMention");
        Intrinsics.checkNotNullParameter(function11, "onClickCancel");
        Intrinsics.checkNotNullParameter(function20, "onClickComplete");
        super();
        this.a = v;
        this.b = s;
        this.c = z;
        this.d = commentItemType$CommentItem0;
        this.e = commentItemType$CommentItem1;
        this.f = function10;
        this.g = function00;
        this.h = function11;
        this.i = function20;
    }

    public CommentModifyModel(int v, String s, boolean z, CommentItem commentItemType$CommentItem0, CommentItem commentItemType$CommentItem1, Function1 function10, Function0 function00, Function1 function11, Function2 function20, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        int v2 = (v1 & 1) == 0 ? v : string.label_reply_modify_title;
        CommentItem commentItemType$CommentItem2 = (v1 & 8) == 0 ? commentItemType$CommentItem0 : new CommentItem(0L, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, 0xFFFFE, null);
        Function1 function12 = (v1 & 0x20) == 0 ? function10 : y.a;
        Function0 function01 = (v1 & 0x40) == 0 ? function00 : z.a;
        Function1 function13 = (v1 & 0x80) == 0 ? function11 : a0.a;
        Function2 function21 = (v1 & 0x100) == 0 ? function20 : b0.a;
        this(v2, ((v1 & 2) == 0 ? s : ""), ((v1 & 4) == 0 ? z : false), commentItemType$CommentItem2, ((v1 & 16) == 0 ? commentItemType$CommentItem1 : null), function12, function01, function13, function21);
    }

    public final int component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    @NotNull
    public final CommentItem component4() {
        return this.d;
    }

    @Nullable
    public final CommentItem component5() {
        return this.e;
    }

    @NotNull
    public final Function1 component6() {
        return this.f;
    }

    @NotNull
    public final Function0 component7() {
        return this.g;
    }

    @NotNull
    public final Function1 component8() {
        return this.h;
    }

    @NotNull
    public final Function2 component9() {
        return this.i;
    }

    @NotNull
    public final CommentModifyModel copy(@StringRes int v, @NotNull String s, boolean z, @NotNull CommentItem commentItemType$CommentItem0, @Nullable CommentItem commentItemType$CommentItem1, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function1 function11, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(s, "initComment");
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "origin");
        Intrinsics.checkNotNullParameter(function10, "checkTextValidation");
        Intrinsics.checkNotNullParameter(function00, "removeMention");
        Intrinsics.checkNotNullParameter(function11, "onClickCancel");
        Intrinsics.checkNotNullParameter(function20, "onClickComplete");
        return new CommentModifyModel(v, s, z, commentItemType$CommentItem0, commentItemType$CommentItem1, function10, function00, function11, function20);
    }

    public static CommentModifyModel copy$default(CommentModifyModel commentModifyModel0, int v, String s, boolean z, CommentItem commentItemType$CommentItem0, CommentItem commentItemType$CommentItem1, Function1 function10, Function0 function00, Function1 function11, Function2 function20, int v1, Object object0) {
        int v2 = (v1 & 1) == 0 ? v : commentModifyModel0.a;
        String s1 = (v1 & 2) == 0 ? s : commentModifyModel0.b;
        boolean z1 = (v1 & 4) == 0 ? z : commentModifyModel0.c;
        CommentItem commentItemType$CommentItem2 = (v1 & 8) == 0 ? commentItemType$CommentItem0 : commentModifyModel0.d;
        CommentItem commentItemType$CommentItem3 = (v1 & 16) == 0 ? commentItemType$CommentItem1 : commentModifyModel0.e;
        Function1 function12 = (v1 & 0x20) == 0 ? function10 : commentModifyModel0.f;
        Function0 function01 = (v1 & 0x40) == 0 ? function00 : commentModifyModel0.g;
        Function1 function13 = (v1 & 0x80) == 0 ? function11 : commentModifyModel0.h;
        return (v1 & 0x100) == 0 ? commentModifyModel0.copy(v2, s1, z1, commentItemType$CommentItem2, commentItemType$CommentItem3, function12, function01, function13, function20) : commentModifyModel0.copy(v2, s1, z1, commentItemType$CommentItem2, commentItemType$CommentItem3, function12, function01, function13, commentModifyModel0.i);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CommentModifyModel)) {
            return false;
        }
        if(this.a != ((CommentModifyModel)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((CommentModifyModel)object0).b)) {
            return false;
        }
        if(this.c != ((CommentModifyModel)object0).c) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((CommentModifyModel)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((CommentModifyModel)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((CommentModifyModel)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((CommentModifyModel)object0).g)) {
            return false;
        }
        return Intrinsics.areEqual(this.h, ((CommentModifyModel)object0).h) ? Intrinsics.areEqual(this.i, ((CommentModifyModel)object0).i) : false;
    }

    @NotNull
    public final Function1 getCheckTextValidation() {
        return this.f;
    }

    @NotNull
    public final String getInitComment() [...] // 潜在的解密器

    @Nullable
    public final CommentItem getMention() {
        return this.e;
    }

    @NotNull
    public final Function1 getOnClickCancel() {
        return this.h;
    }

    @NotNull
    public final Function2 getOnClickComplete() {
        return this.i;
    }

    @NotNull
    public final CommentItem getOrigin() {
        return this.d;
    }

    @NotNull
    public final Function0 getRemoveMention() {
        return this.g;
    }

    public final boolean getShowSecretButton() {
        return this.c;
    }

    public final int getTitleResId() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = c.a(this.c, a.a(this.b, this.a * 0x1F, 0x1F), 0x1F);
        int v1 = this.d.hashCode();
        return this.e == null ? this.i.hashCode() + b.a(this.h, com.kakao.tistory.presentation.main.contract.a.a(this.g, b.a(this.f, (v1 + v) * 961, 0x1F), 0x1F), 0x1F) : this.i.hashCode() + b.a(this.h, com.kakao.tistory.presentation.main.contract.a.a(this.g, b.a(this.f, ((v1 + v) * 0x1F + this.e.hashCode()) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "CommentModifyModel(titleResId=" + this.a + ", initComment=" + this.b + ", showSecretButton=" + this.c + ", origin=" + this.d + ", mention=" + this.e + ", checkTextValidation=" + this.f + ", removeMention=" + this.g + ", onClickCancel=" + this.h + ", onClickComplete=" + this.i + ")";
    }
}

