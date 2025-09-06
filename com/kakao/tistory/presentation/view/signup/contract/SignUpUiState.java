package com.kakao.tistory.presentation.view.signup.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B\u009D\u0002\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\u001A\b\u0002\u0010\u000B\u001A\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\b\u0012\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\n0\f\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u000E\u0012\u000E\b\u0002\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u000E\u0012\u0014\b\u0002\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0014\u0012\u000E\b\u0002\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\n0\f\u0012\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\n0\f\u0012\u000E\b\u0002\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\n0\f\u0012\u000E\b\u0002\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\n0\f\u0012\u000E\b\u0002\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\n0\f\u0012\u0010\b\u0002\u0010\u001B\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010\u0012\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\n0\f\u0012\u000E\b\u0002\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\n0\f\u0012\u000E\b\u0002\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\n0\f\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010&J\"\u0010\'\u001A\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\bH\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u0016\u0010)\u001A\b\u0012\u0004\u0012\u00020\n0\fH\u00C6\u0003\u00A2\u0006\u0004\b)\u0010*J\u0010\u0010+\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b+\u0010,J\u0016\u0010-\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010.J\u0010\u0010/\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b/\u0010,J\u001C\u00100\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0014H\u00C6\u0003\u00A2\u0006\u0004\b0\u00101J\u0016\u00102\u001A\b\u0012\u0004\u0012\u00020\n0\fH\u00C6\u0003\u00A2\u0006\u0004\b2\u0010*J\u0016\u00103\u001A\b\u0012\u0004\u0012\u00020\n0\fH\u00C6\u0003\u00A2\u0006\u0004\b3\u0010*J\u0016\u00104\u001A\b\u0012\u0004\u0012\u00020\n0\fH\u00C6\u0003\u00A2\u0006\u0004\b4\u0010*J\u0016\u00105\u001A\b\u0012\u0004\u0012\u00020\n0\fH\u00C6\u0003\u00A2\u0006\u0004\b5\u0010*J\u0016\u00106\u001A\b\u0012\u0004\u0012\u00020\n0\fH\u00C6\u0003\u00A2\u0006\u0004\b6\u0010*J\u0018\u00107\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010H\u00C6\u0003\u00A2\u0006\u0004\b7\u0010.J\u0016\u00108\u001A\b\u0012\u0004\u0012\u00020\n0\fH\u00C6\u0003\u00A2\u0006\u0004\b8\u0010*J\u0016\u00109\u001A\b\u0012\u0004\u0012\u00020\n0\fH\u00C6\u0003\u00A2\u0006\u0004\b9\u0010*J\u0016\u0010:\u001A\b\u0012\u0004\u0012\u00020\n0\fH\u00C6\u0003\u00A2\u0006\u0004\b:\u0010*J\u00A6\u0002\u0010;\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u001A\b\u0002\u0010\u000B\u001A\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\b2\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\n0\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\u000E\b\u0002\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u000E2\u0014\b\u0002\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00142\u000E\b\u0002\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\n0\f2\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\n0\f2\u000E\b\u0002\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\n0\f2\u000E\b\u0002\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\n0\f2\u000E\b\u0002\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\n0\f2\u0010\b\u0002\u0010\u001B\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\n0\f2\u000E\b\u0002\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\n0\f2\u000E\b\u0002\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\n0\fH\u00C6\u0001\u00A2\u0006\u0004\b;\u0010<J\u0010\u0010=\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b=\u0010$J\u0010\u0010?\u001A\u00020>H\u00D6\u0001\u00A2\u0006\u0004\b?\u0010@J\u001A\u0010B\u001A\u00020\u000E2\b\u0010A\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010\"R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010$R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010&R)\u0010\u000B\u001A\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\b8\u0006\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010(R\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00020\n0\f8\u0006\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010*R\u0017\u0010\u000F\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bS\u0010T\u001A\u0004\bU\u0010,R\u001D\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006\u00A2\u0006\f\n\u0004\bV\u0010W\u001A\u0004\bX\u0010.R\u0017\u0010\u0013\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bY\u0010T\u001A\u0004\b\u0013\u0010,R#\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00148\u0006\u00A2\u0006\f\n\u0004\bZ\u0010[\u001A\u0004\b\\\u00101R\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\n0\f8\u0006\u00A2\u0006\f\n\u0004\b]\u0010Q\u001A\u0004\b^\u0010*R\u001D\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\n0\f8\u0006\u00A2\u0006\f\n\u0004\b_\u0010Q\u001A\u0004\b`\u0010*R\u001D\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\n0\f8\u0006\u00A2\u0006\f\n\u0004\ba\u0010Q\u001A\u0004\bb\u0010*R\u001D\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\n0\f8\u0006\u00A2\u0006\f\n\u0004\bc\u0010Q\u001A\u0004\bd\u0010*R\u001D\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\n0\f8\u0006\u00A2\u0006\f\n\u0004\be\u0010Q\u001A\u0004\bf\u0010*R\u001F\u0010\u001B\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006\u00A2\u0006\f\n\u0004\bg\u0010W\u001A\u0004\bh\u0010.R\u001D\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\n0\f8\u0006\u00A2\u0006\f\n\u0004\bi\u0010Q\u001A\u0004\bj\u0010*R\u001D\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\n0\f8\u0006\u00A2\u0006\f\n\u0004\bk\u0010Q\u001A\u0004\bl\u0010*R\u001D\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\n0\f8\u0006\u00A2\u0006\f\n\u0004\bm\u0010Q\u001A\u0004\bn\u0010*\u00A8\u0006o"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpUiState;", "", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpPageType;", "pageType", "", "kakaoEmail", "Lcom/kakao/tistory/presentation/view/signup/contract/BlogNameState;", "blogName", "Lkotlin/Function2;", "Landroidx/compose/ui/text/input/TextFieldValue;", "", "onChangeBlogName", "Lkotlin/Function0;", "onClickBlogNameClear", "", "showBlogNameRecommendation", "", "Lcom/kakao/tistory/domain/entity/common/RecommendedBlogNameInfo;", "recommendedBlogNameList", "isAgreedTalkChannel", "Lkotlin/Function1;", "onClickRecommendedBlogName", "onClickRefreshRecommendation", "onClickAgreeAll", "onClickAgreeTerms", "onClickAgreeTalkChannel", "onClickDetailTerms", "duplicatedEmails", "onClickNotice", "onClickBack", "onClickConfirm", "<init>", "(Lcom/kakao/tistory/presentation/view/signup/contract/SignUpPageType;Ljava/lang/String;Lcom/kakao/tistory/presentation/view/signup/contract/BlogNameState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;ZLjava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lcom/kakao/tistory/presentation/view/signup/contract/SignUpPageType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/kakao/tistory/presentation/view/signup/contract/BlogNameState;", "component4", "()Lkotlin/jvm/functions/Function2;", "component5", "()Lkotlin/jvm/functions/Function0;", "component6", "()Z", "component7", "()Ljava/util/List;", "component8", "component9", "()Lkotlin/jvm/functions/Function1;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Lcom/kakao/tistory/presentation/view/signup/contract/SignUpPageType;Ljava/lang/String;Lcom/kakao/tistory/presentation/view/signup/contract/BlogNameState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;ZLjava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/view/signup/contract/SignUpUiState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpPageType;", "getPageType", "b", "Ljava/lang/String;", "getKakaoEmail", "c", "Lcom/kakao/tistory/presentation/view/signup/contract/BlogNameState;", "getBlogName", "d", "Lkotlin/jvm/functions/Function2;", "getOnChangeBlogName", "e", "Lkotlin/jvm/functions/Function0;", "getOnClickBlogNameClear", "f", "Z", "getShowBlogNameRecommendation", "g", "Ljava/util/List;", "getRecommendedBlogNameList", "h", "i", "Lkotlin/jvm/functions/Function1;", "getOnClickRecommendedBlogName", "j", "getOnClickRefreshRecommendation", "k", "getOnClickAgreeAll", "l", "getOnClickAgreeTerms", "m", "getOnClickAgreeTalkChannel", "n", "getOnClickDetailTerms", "o", "getDuplicatedEmails", "p", "getOnClickNotice", "q", "getOnClickBack", "r", "getOnClickConfirm", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SignUpUiState {
    public static final int $stable = 8;
    public final SignUpPageType a;
    public final String b;
    public final BlogNameState c;
    public final Function2 d;
    public final Function0 e;
    public final boolean f;
    public final List g;
    public final boolean h;
    public final Function1 i;
    public final Function0 j;
    public final Function0 k;
    public final Function0 l;
    public final Function0 m;
    public final Function0 n;
    public final List o;
    public final Function0 p;
    public final Function0 q;
    public final Function0 r;

    public SignUpUiState() {
        this(null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 0x3FFFF, null);
    }

    public SignUpUiState(@NotNull SignUpPageType signUpPageType0, @NotNull String s, @NotNull BlogNameState blogNameState0, @NotNull Function2 function20, @NotNull Function0 function00, boolean z, @NotNull List list0, boolean z1, @NotNull Function1 function10, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function0 function03, @NotNull Function0 function04, @NotNull Function0 function05, @Nullable List list1, @NotNull Function0 function06, @NotNull Function0 function07, @NotNull Function0 function08) {
        Intrinsics.checkNotNullParameter(signUpPageType0, "pageType");
        Intrinsics.checkNotNullParameter(s, "kakaoEmail");
        Intrinsics.checkNotNullParameter(blogNameState0, "blogName");
        Intrinsics.checkNotNullParameter(function20, "onChangeBlogName");
        Intrinsics.checkNotNullParameter(function00, "onClickBlogNameClear");
        Intrinsics.checkNotNullParameter(list0, "recommendedBlogNameList");
        Intrinsics.checkNotNullParameter(function10, "onClickRecommendedBlogName");
        Intrinsics.checkNotNullParameter(function01, "onClickRefreshRecommendation");
        Intrinsics.checkNotNullParameter(function02, "onClickAgreeAll");
        Intrinsics.checkNotNullParameter(function03, "onClickAgreeTerms");
        Intrinsics.checkNotNullParameter(function04, "onClickAgreeTalkChannel");
        Intrinsics.checkNotNullParameter(function05, "onClickDetailTerms");
        Intrinsics.checkNotNullParameter(function06, "onClickNotice");
        Intrinsics.checkNotNullParameter(function07, "onClickBack");
        Intrinsics.checkNotNullParameter(function08, "onClickConfirm");
        super();
        this.a = signUpPageType0;
        this.b = s;
        this.c = blogNameState0;
        this.d = function20;
        this.e = function00;
        this.f = z;
        this.g = list0;
        this.h = z1;
        this.i = function10;
        this.j = function01;
        this.k = function02;
        this.l = function03;
        this.m = function04;
        this.n = function05;
        this.o = list1;
        this.p = function06;
        this.q = function07;
        this.r = function08;
    }

    public SignUpUiState(SignUpPageType signUpPageType0, String s, BlogNameState blogNameState0, Function2 function20, Function0 function00, boolean z, List list0, boolean z1, Function1 function10, Function0 function01, Function0 function02, Function0 function03, Function0 function04, Function0 function05, List list1, Function0 function06, Function0 function07, Function0 function08, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        SignUpPageType signUpPageType1 = (v & 1) == 0 ? signUpPageType0 : SignUpPageType.SIGNUP;
        BlogNameState blogNameState1 = (v & 4) == 0 ? blogNameState0 : new BlogNameState(null, null, null, null, 15, null);
        Function2 function21 = (v & 8) == 0 ? function20 : c.a;
        Function0 function09 = (v & 16) == 0 ? function00 : d.a;
        boolean z2 = false;
        List list2 = (v & 0x40) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList();
        if((v & 0x80) == 0) {
            z2 = z1;
        }
        Function1 function11 = (v & 0x100) == 0 ? function10 : e.a;
        Function0 function010 = (v & 0x200) == 0 ? function01 : f.a;
        Function0 function011 = (v & 0x400) == 0 ? function02 : g.a;
        Function0 function012 = (v & 0x800) == 0 ? function03 : h.a;
        Function0 function013 = (v & 0x1000) == 0 ? function04 : i.a;
        Function0 function014 = (v & 0x2000) == 0 ? function05 : j.a;
        Function0 function015 = (v & 0x8000) == 0 ? function06 : k.a;
        Function0 function016 = (v & 0x10000) == 0 ? function07 : a.a;
        Function0 function017 = (v & 0x20000) == 0 ? function08 : b.a;
        this(signUpPageType1, ((v & 2) == 0 ? s : ""), blogNameState1, function21, function09, ((v & 0x20) == 0 ? z : false), list2, z2, function11, function010, function011, function012, function013, function014, ((v & 0x4000) == 0 ? list1 : null), function015, function016, function017);
    }

    @NotNull
    public final SignUpPageType component1() {
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

    @NotNull
    public final Function0 component12() {
        return this.l;
    }

    @NotNull
    public final Function0 component13() {
        return this.m;
    }

    @NotNull
    public final Function0 component14() {
        return this.n;
    }

    @Nullable
    public final List component15() {
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
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final BlogNameState component3() {
        return this.c;
    }

    @NotNull
    public final Function2 component4() {
        return this.d;
    }

    @NotNull
    public final Function0 component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.f;
    }

    @NotNull
    public final List component7() {
        return this.g;
    }

    public final boolean component8() {
        return this.h;
    }

    @NotNull
    public final Function1 component9() {
        return this.i;
    }

    @NotNull
    public final SignUpUiState copy(@NotNull SignUpPageType signUpPageType0, @NotNull String s, @NotNull BlogNameState blogNameState0, @NotNull Function2 function20, @NotNull Function0 function00, boolean z, @NotNull List list0, boolean z1, @NotNull Function1 function10, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function0 function03, @NotNull Function0 function04, @NotNull Function0 function05, @Nullable List list1, @NotNull Function0 function06, @NotNull Function0 function07, @NotNull Function0 function08) {
        Intrinsics.checkNotNullParameter(signUpPageType0, "pageType");
        Intrinsics.checkNotNullParameter(s, "kakaoEmail");
        Intrinsics.checkNotNullParameter(blogNameState0, "blogName");
        Intrinsics.checkNotNullParameter(function20, "onChangeBlogName");
        Intrinsics.checkNotNullParameter(function00, "onClickBlogNameClear");
        Intrinsics.checkNotNullParameter(list0, "recommendedBlogNameList");
        Intrinsics.checkNotNullParameter(function10, "onClickRecommendedBlogName");
        Intrinsics.checkNotNullParameter(function01, "onClickRefreshRecommendation");
        Intrinsics.checkNotNullParameter(function02, "onClickAgreeAll");
        Intrinsics.checkNotNullParameter(function03, "onClickAgreeTerms");
        Intrinsics.checkNotNullParameter(function04, "onClickAgreeTalkChannel");
        Intrinsics.checkNotNullParameter(function05, "onClickDetailTerms");
        Intrinsics.checkNotNullParameter(function06, "onClickNotice");
        Intrinsics.checkNotNullParameter(function07, "onClickBack");
        Intrinsics.checkNotNullParameter(function08, "onClickConfirm");
        return new SignUpUiState(signUpPageType0, s, blogNameState0, function20, function00, z, list0, z1, function10, function01, function02, function03, function04, function05, list1, function06, function07, function08);
    }

    public static SignUpUiState copy$default(SignUpUiState signUpUiState0, SignUpPageType signUpPageType0, String s, BlogNameState blogNameState0, Function2 function20, Function0 function00, boolean z, List list0, boolean z1, Function1 function10, Function0 function01, Function0 function02, Function0 function03, Function0 function04, Function0 function05, List list1, Function0 function06, Function0 function07, Function0 function08, int v, Object object0) {
        SignUpPageType signUpPageType1 = (v & 1) == 0 ? signUpPageType0 : signUpUiState0.a;
        String s1 = (v & 2) == 0 ? s : signUpUiState0.b;
        BlogNameState blogNameState1 = (v & 4) == 0 ? blogNameState0 : signUpUiState0.c;
        Function2 function21 = (v & 8) == 0 ? function20 : signUpUiState0.d;
        Function0 function09 = (v & 16) == 0 ? function00 : signUpUiState0.e;
        boolean z2 = (v & 0x20) == 0 ? z : signUpUiState0.f;
        List list2 = (v & 0x40) == 0 ? list0 : signUpUiState0.g;
        boolean z3 = (v & 0x80) == 0 ? z1 : signUpUiState0.h;
        Function1 function11 = (v & 0x100) == 0 ? function10 : signUpUiState0.i;
        Function0 function010 = (v & 0x200) == 0 ? function01 : signUpUiState0.j;
        Function0 function011 = (v & 0x400) == 0 ? function02 : signUpUiState0.k;
        Function0 function012 = (v & 0x800) == 0 ? function03 : signUpUiState0.l;
        Function0 function013 = (v & 0x1000) == 0 ? function04 : signUpUiState0.m;
        Function0 function014 = (v & 0x2000) == 0 ? function05 : signUpUiState0.n;
        List list3 = (v & 0x4000) == 0 ? list1 : signUpUiState0.o;
        Function0 function015 = (v & 0x8000) == 0 ? function06 : signUpUiState0.p;
        Function0 function016 = (v & 0x10000) == 0 ? function07 : signUpUiState0.q;
        return (v & 0x20000) == 0 ? signUpUiState0.copy(signUpPageType1, s1, blogNameState1, function21, function09, z2, list2, z3, function11, function010, function011, function012, function013, function014, list3, function015, function016, function08) : signUpUiState0.copy(signUpPageType1, s1, blogNameState1, function21, function09, z2, list2, z3, function11, function010, function011, function012, function013, function014, list3, function015, function016, signUpUiState0.r);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SignUpUiState)) {
            return false;
        }
        if(this.a != ((SignUpUiState)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((SignUpUiState)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((SignUpUiState)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((SignUpUiState)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((SignUpUiState)object0).e)) {
            return false;
        }
        if(this.f != ((SignUpUiState)object0).f) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((SignUpUiState)object0).g)) {
            return false;
        }
        if(this.h != ((SignUpUiState)object0).h) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((SignUpUiState)object0).i)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.j, ((SignUpUiState)object0).j)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, ((SignUpUiState)object0).k)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.l, ((SignUpUiState)object0).l)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.m, ((SignUpUiState)object0).m)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.n, ((SignUpUiState)object0).n)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.o, ((SignUpUiState)object0).o)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.p, ((SignUpUiState)object0).p)) {
            return false;
        }
        return Intrinsics.areEqual(this.q, ((SignUpUiState)object0).q) ? Intrinsics.areEqual(this.r, ((SignUpUiState)object0).r) : false;
    }

    @NotNull
    public final BlogNameState getBlogName() {
        return this.c;
    }

    @Nullable
    public final List getDuplicatedEmails() {
        return this.o;
    }

    @NotNull
    public final String getKakaoEmail() {
        return this.b;
    }

    @NotNull
    public final Function2 getOnChangeBlogName() {
        return this.d;
    }

    @NotNull
    public final Function0 getOnClickAgreeAll() {
        return this.k;
    }

    @NotNull
    public final Function0 getOnClickAgreeTalkChannel() {
        return this.m;
    }

    @NotNull
    public final Function0 getOnClickAgreeTerms() {
        return this.l;
    }

    @NotNull
    public final Function0 getOnClickBack() {
        return this.q;
    }

    @NotNull
    public final Function0 getOnClickBlogNameClear() {
        return this.e;
    }

    @NotNull
    public final Function0 getOnClickConfirm() {
        return this.r;
    }

    @NotNull
    public final Function0 getOnClickDetailTerms() {
        return this.n;
    }

    @NotNull
    public final Function0 getOnClickNotice() {
        return this.p;
    }

    @NotNull
    public final Function1 getOnClickRecommendedBlogName() {
        return this.i;
    }

    @NotNull
    public final Function0 getOnClickRefreshRecommendation() {
        return this.j;
    }

    @NotNull
    public final SignUpPageType getPageType() {
        return this.a;
    }

    @NotNull
    public final List getRecommendedBlogNameList() {
        return this.g;
    }

    public final boolean getShowBlogNameRecommendation() {
        return this.f;
    }

    @Override
    public int hashCode() {
        int v = com.kakao.tistory.presentation.main.contract.a.a(this.n, com.kakao.tistory.presentation.main.contract.a.a(this.m, com.kakao.tistory.presentation.main.contract.a.a(this.l, com.kakao.tistory.presentation.main.contract.a.a(this.k, com.kakao.tistory.presentation.main.contract.a.a(this.j, com.kakao.tistory.presentation.main.contract.b.a(this.i, com.kakao.tistory.presentation.main.contract.c.a(this.h, a5.b.c(this.g, com.kakao.tistory.presentation.main.contract.c.a(this.f, com.kakao.tistory.presentation.main.contract.a.a(this.e, (this.d.hashCode() + (this.c.hashCode() + com.kakao.tistory.presentation.common.graph.a.a(this.b, this.a.hashCode() * 0x1F, 0x1F)) * 0x1F) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
        return this.o == null ? this.r.hashCode() + com.kakao.tistory.presentation.main.contract.a.a(this.q, com.kakao.tistory.presentation.main.contract.a.a(this.p, v * 0x1F, 0x1F), 0x1F) : this.r.hashCode() + com.kakao.tistory.presentation.main.contract.a.a(this.q, com.kakao.tistory.presentation.main.contract.a.a(this.p, (v + this.o.hashCode()) * 0x1F, 0x1F), 0x1F);
    }

    public final boolean isAgreedTalkChannel() {
        return this.h;
    }

    @Override
    @NotNull
    public String toString() {
        return "SignUpUiState(pageType=" + this.a + ", kakaoEmail=" + this.b + ", blogName=" + this.c + ", onChangeBlogName=" + this.d + ", onClickBlogNameClear=" + this.e + ", showBlogNameRecommendation=" + this.f + ", recommendedBlogNameList=" + this.g + ", isAgreedTalkChannel=" + this.h + ", onClickRecommendedBlogName=" + this.i + ", onClickRefreshRecommendation=" + this.j + ", onClickAgreeAll=" + this.k + ", onClickAgreeTerms=" + this.l + ", onClickAgreeTalkChannel=" + this.m + ", onClickDetailTerms=" + this.n + ", duplicatedEmails=" + this.o + ", onClickNotice=" + this.p + ", onClickBack=" + this.q + ", onClickConfirm=" + this.r + ")";
    }
}

