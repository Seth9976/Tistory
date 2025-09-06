package com.kakao.tistory.presentation.viewmodel;

import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001A\u001BB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001F\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00020\u00042\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000B\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\u0003R\u001D\u0010\u0011\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r0\f8F¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00060\f8F¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00140\f8F¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00170\f8F¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0010¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "<init>", "()V", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideType;", "guideType", "", "redirectUrl", "", "init", "(Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideType;Ljava/lang/String;)V", "onClickGuideButton", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator;", "getGuideNavigator", "()Landroidx/lifecycle/LiveData;", "guideNavigator", "getTitle", "title", "", "getMessage", "message", "", "getButton", "button", "GuideNavigator", "GuideType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryGuideViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryGuideViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
public final class TistoryGuideViewModel extends TistoryViewModel {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator;", "", "ApplyKakaoAccount", "Back", "Link", "Main", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator$ApplyKakaoAccount;", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator$Back;", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator$Link;", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator$Main;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class GuideNavigator {
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator$ApplyKakaoAccount;", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class ApplyKakaoAccount extends GuideNavigator {
            public static final int $stable;
            @NotNull
            public static final ApplyKakaoAccount INSTANCE;

            static {
                ApplyKakaoAccount.INSTANCE = new ApplyKakaoAccount();
            }

            public ApplyKakaoAccount() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator$Back;", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Back extends GuideNavigator {
            public static final int $stable;
            @NotNull
            public static final Back INSTANCE;

            static {
                Back.INSTANCE = new Back();
            }

            public Back() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000E\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00042\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u001AR\"\u0010\u0005\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000B\"\u0004\b\u001E\u0010\u001F¨\u0006 "}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator$Link;", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator;", "", "url", "", "goToBrowser", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator$Link;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUrl", "setUrl", "(Ljava/lang/String;)V", "b", "Z", "getGoToBrowser", "setGoToBrowser", "(Z)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Link extends GuideNavigator {
            public static final int $stable = 8;
            public String a;
            public boolean b;

            public Link(@NotNull String s, boolean z) {
                Intrinsics.checkNotNullParameter(s, "url");
                super(null);
                this.a = s;
                this.b = z;
            }

            public Link(String s, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
                if((v & 2) != 0) {
                    z = false;
                }
                this(s, z);
            }

            @NotNull
            public final String component1() {
                return this.a;
            }

            public final boolean component2() {
                return this.b;
            }

            @NotNull
            public final Link copy(@NotNull String s, boolean z) {
                Intrinsics.checkNotNullParameter(s, "url");
                return new Link(s, z);
            }

            public static Link copy$default(Link tistoryGuideViewModel$GuideNavigator$Link0, String s, boolean z, int v, Object object0) {
                if((v & 1) != 0) {
                    s = tistoryGuideViewModel$GuideNavigator$Link0.a;
                }
                if((v & 2) != 0) {
                    z = tistoryGuideViewModel$GuideNavigator$Link0.b;
                }
                return tistoryGuideViewModel$GuideNavigator$Link0.copy(s, z);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                if(!(object0 instanceof Link)) {
                    return false;
                }
                return Intrinsics.areEqual(this.a, ((Link)object0).a) ? this.b == ((Link)object0).b : false;
            }

            public final boolean getGoToBrowser() {
                return this.b;
            }

            @NotNull
            public final String getUrl() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return Boolean.hashCode(this.b) + this.a.hashCode() * 0x1F;
            }

            public final void setGoToBrowser(boolean z) {
                this.b = z;
            }

            public final void setUrl(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "<set-?>");
                this.a = s;
            }

            @Override
            @NotNull
            public String toString() {
                return "Link(url=" + this.a + ", goToBrowser=" + this.b + ")";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\u0005¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator$Main;", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator;", "", "redirectUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator$Main;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRedirectUrl", "setRedirectUrl", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class Main extends GuideNavigator {
            public static final int $stable = 8;
            public String a;

            public Main() {
                this(null, 1, null);
            }

            public Main(@Nullable String s) {
                super(null);
                this.a = s;
            }

            public Main(String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
                if((v & 1) != 0) {
                    s = null;
                }
                this(s);
            }

            @Nullable
            public final String component1() {
                return this.a;
            }

            @NotNull
            public final Main copy(@Nullable String s) {
                return new Main(s);
            }

            public static Main copy$default(Main tistoryGuideViewModel$GuideNavigator$Main0, String s, int v, Object object0) {
                if((v & 1) != 0) {
                    s = tistoryGuideViewModel$GuideNavigator$Main0.a;
                }
                return tistoryGuideViewModel$GuideNavigator$Main0.copy(s);
            }

            @Override
            public boolean equals(@Nullable Object object0) {
                if(this == object0) {
                    return true;
                }
                return object0 instanceof Main ? Intrinsics.areEqual(this.a, ((Main)object0).a) : false;
            }

            @Nullable
            public final String getRedirectUrl() {
                return this.a;
            }

            @Override
            public int hashCode() {
                return this.a == null ? 0 : this.a.hashCode();
            }

            public final void setRedirectUrl(@Nullable String s) {
                this.a = s;
            }

            @Override
            @NotNull
            public String toString() {
                return "Main(redirectUrl=" + this.a + ")";
            }
        }

        public static final int $stable;

        public GuideNavigator(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0019\u0010\u000F\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u0019\u0010\u0012\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001A\u0004\b\u0011\u0010\u000ER\u0017\u0010\u0015\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001A\u0004\b\u0014\u0010\u0006R\u0017\u0010\u001B\u001A\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u0019\u0010!\u001A\u0004\u0018\u00010\u001C8\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 R\u0017\u0010$\u001A\u00020\u001C8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001E\u001A\u0004\b#\u0010 R\u0019\u0010*\u001A\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006."}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideType;", "", "", "a", "I", "getTitleStringId", "()I", "titleStringId", "b", "getMessageStringId", "messageStringId", "c", "Ljava/lang/Integer;", "getLinkedTextStringId", "()Ljava/lang/Integer;", "linkedTextStringId", "d", "getLinkedTextUrlStringId", "linkedTextUrlStringId", "e", "getButtonStringId", "buttonStringId", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator;", "f", "Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator;", "getGuideNavigator", "()Lcom/kakao/tistory/presentation/viewmodel/TistoryGuideViewModel$GuideNavigator;", "guideNavigator", "", "g", "Ljava/lang/String;", "getTiaraSection", "()Ljava/lang/String;", "tiaraSection", "h", "getTiaraPage", "tiaraPage", "Lcom/kakao/tistory/presentation/common/tiara/TiaraActionType;", "i", "Lcom/kakao/tistory/presentation/common/tiara/TiaraActionType;", "getTiaraLinkClickActionType", "()Lcom/kakao/tistory/presentation/common/tiara/TiaraActionType;", "tiaraLinkClickActionType", "UNREGISTERED_KAKAO_ACCOUNT", "APPLY_KAKAO_ACCOUNT", "COMPLETE_KAKAO_ACCOUNT", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum GuideType {
        UNREGISTERED_KAKAO_ACCOUNT(string.label_guide_title_kakao_account_not_registered, string.label_guide_message_kakao_account_not_registered, string.label_guide_linked_text_kakao_account_not_registered, string.link_unregistered_kakao_account_guide, string.label_guide_back, Back.INSTANCE, "로그인", "로그인불가", TiaraActionType.CLICK_SEE_DETAIL),
        APPLY_KAKAO_ACCOUNT(string.label_guide_title_apply_kakao_account, string.label_guide_message_apply_kakao_account, string.label_guide_apply_kakao_account, new Main(null, 1, null)),
        COMPLETE_KAKAO_ACCOUNT(string.label_guide_title_complete_kakao_account, string.label_guide_message_complete_kakao_account, string.label_guide_go_main, ApplyKakaoAccount.INSTANCE);

        public final int a;
        public final int b;
        public final Integer c;
        public final Integer d;
        public final int e;
        public final GuideNavigator f;
        public final String g;
        public final String h;
        public final TiaraActionType i;
        public static final GuideType[] j;
        public static final EnumEntries k;

        static {
            GuideType.j = arr_tistoryGuideViewModel$GuideType;
            Intrinsics.checkNotNullParameter(arr_tistoryGuideViewModel$GuideType, "entries");
            GuideType.k = new a(arr_tistoryGuideViewModel$GuideType);
        }

        public GuideType(int v1, int v2, int v3, GuideNavigator tistoryGuideViewModel$GuideNavigator0) {
            this(v1, v2, null, null, v3, tistoryGuideViewModel$GuideNavigator0, null, "", null);
        }

        public GuideType(int v1, int v2, Integer integer0, Integer integer1, int v3, GuideNavigator tistoryGuideViewModel$GuideNavigator0, String s1, String s2, TiaraActionType tiaraActionType0) {
            this.a = v1;
            this.b = v2;
            this.c = integer0;
            this.d = integer1;
            this.e = v3;
            this.f = tistoryGuideViewModel$GuideNavigator0;
            this.g = s1;
            this.h = s2;
            this.i = tiaraActionType0;
        }

        public final int getButtonStringId() {
            return this.e;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return GuideType.k;
        }

        @NotNull
        public final GuideNavigator getGuideNavigator() {
            return this.f;
        }

        @Nullable
        public final Integer getLinkedTextStringId() {
            return this.c;
        }

        @Nullable
        public final Integer getLinkedTextUrlStringId() {
            return this.d;
        }

        public final int getMessageStringId() {
            return this.b;
        }

        @Nullable
        public final TiaraActionType getTiaraLinkClickActionType() {
            return this.i;
        }

        @NotNull
        public final String getTiaraPage() {
            return this.h;
        }

        @Nullable
        public final String getTiaraSection() {
            return this.g;
        }

        public final int getTitleStringId() {
            return this.a;
        }
    }

    public static final int $stable = 8;
    public final MutableLiveData g;
    public GuideType h;
    public final MutableLiveData i;
    public final MutableLiveData j;
    public final MutableLiveData k;

    @Inject
    public TistoryGuideViewModel() {
        this.g = new MutableLiveData();
        this.i = new MutableLiveData();
        this.j = new MutableLiveData();
        this.k = new MutableLiveData();
    }

    public static final void access$goToDestination(TistoryGuideViewModel tistoryGuideViewModel0, GuideNavigator tistoryGuideViewModel$GuideNavigator0) {
        Event event0 = new Event(tistoryGuideViewModel$GuideNavigator0);
        tistoryGuideViewModel0.g.postValue(event0);
    }

    @NotNull
    public final LiveData getButton() {
        return this.k;
    }

    @NotNull
    public final LiveData getGuideNavigator() {
        return this.g;
    }

    @NotNull
    public final LiveData getMessage() {
        return this.j;
    }

    @NotNull
    public final LiveData getTitle() {
        return this.i;
    }

    public final void init(@NotNull GuideType tistoryGuideViewModel$GuideType0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(tistoryGuideViewModel$GuideType0, "guideType");
        this.h = tistoryGuideViewModel$GuideType0;
        String s1 = BaseKt.getAppContext().getString(tistoryGuideViewModel$GuideType0.getTitleStringId());
        this.i.setValue(s1);
        Integer integer0 = tistoryGuideViewModel$GuideType0.getLinkedTextStringId();
        String s2 = integer0 == null ? null : BaseKt.getAppContext().getString(integer0.intValue());
        StringUtils stringUtils0 = StringUtils.INSTANCE;
        String s3 = BaseKt.getAppContext().getString(tistoryGuideViewModel$GuideType0.getMessageStringId());
        Intrinsics.checkNotNullExpressionValue(s3, "getString(...)");
        String s4 = String.format(s3, Arrays.copyOf(new Object[]{s2}, 1));
        Intrinsics.checkNotNullExpressionValue(s4, "format(...)");
        Spanned spanned0 = stringUtils0.getHtmlText(s4);
        MutableLiveData mutableLiveData0 = this.j;
        if(s2 != null) {
            String s5 = p.isBlank(s2) ? null : s2;
            if(s5 != null) {
                SpannableString spannableString0 = StringUtils.getStringWithClickableSpan$default(stringUtils0, spanned0, s5, ContextCompat.getColor(BaseKt.getAppContext(), color.gray5), true, false, new a7(tistoryGuideViewModel$GuideType0, this), 16, null);
                if(spannableString0 != null) {
                    spanned0 = spannableString0;
                }
            }
        }
        mutableLiveData0.setValue(spanned0);
        this.k.setValue(tistoryGuideViewModel$GuideType0.getButtonStringId());
    }

    public final void onClickGuideButton() {
        GuideType tistoryGuideViewModel$GuideType0 = this.h;
        GuideType tistoryGuideViewModel$GuideType1 = null;
        if(tistoryGuideViewModel$GuideType0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("guideType");
            tistoryGuideViewModel$GuideType0 = null;
        }
        GuideNavigator tistoryGuideViewModel$GuideNavigator0 = tistoryGuideViewModel$GuideType0.getGuideNavigator();
        if(tistoryGuideViewModel$GuideNavigator0 instanceof Back) {
            GuideType tistoryGuideViewModel$GuideType2 = this.h;
            if(tistoryGuideViewModel$GuideType2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("guideType");
            }
            else {
                tistoryGuideViewModel$GuideType1 = tistoryGuideViewModel$GuideType2;
            }
            Event event0 = new Event(tistoryGuideViewModel$GuideType1.getGuideNavigator());
            this.g.postValue(event0);
            return;
        }
        if(tistoryGuideViewModel$GuideNavigator0 instanceof Main) {
            GuideType tistoryGuideViewModel$GuideType3 = this.h;
            if(tistoryGuideViewModel$GuideType3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("guideType");
                tistoryGuideViewModel$GuideType3 = null;
            }
            GuideNavigator tistoryGuideViewModel$GuideNavigator1 = tistoryGuideViewModel$GuideType3.getGuideNavigator();
            Intrinsics.checkNotNull(tistoryGuideViewModel$GuideNavigator1, "null cannot be cast to non-null type com.kakao.tistory.presentation.viewmodel.TistoryGuideViewModel.GuideNavigator.Main");
            ((Main)tistoryGuideViewModel$GuideNavigator1).setRedirectUrl(null);
            GuideType tistoryGuideViewModel$GuideType4 = this.h;
            if(tistoryGuideViewModel$GuideType4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("guideType");
            }
            else {
                tistoryGuideViewModel$GuideType1 = tistoryGuideViewModel$GuideType4;
            }
            Event event1 = new Event(tistoryGuideViewModel$GuideType1.getGuideNavigator());
            this.g.postValue(event1);
        }
    }
}

