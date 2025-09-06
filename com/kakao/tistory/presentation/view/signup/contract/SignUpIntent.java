package com.kakao.tistory.presentation.view.signup.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.tistory.presentation.main.contract.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000B\f\r\u000E\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent;", "", "ChangeBlogName", "ChangeBlogNameValidation", "ChangePage", "DuplicateEmails", "Init", "RequestRecommendation", "ToggleAgreeTalkChannel", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$ChangeBlogName;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$ChangeBlogNameValidation;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$ChangePage;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$DuplicateEmails;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$Init;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$RequestRecommendation;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$ToggleAgreeTalkChannel;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class SignUpIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000BJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000B¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$ChangeBlogName;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent;", "Landroidx/compose/ui/text/input/TextFieldValue;", "blogName", "", "recommendedBy", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;)V", "component1", "()Landroidx/compose/ui/text/input/TextFieldValue;", "component2", "()Ljava/lang/String;", "copy", "(Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;)Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$ChangeBlogName;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/input/TextFieldValue;", "getBlogName", "b", "Ljava/lang/String;", "getRecommendedBy", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeBlogName extends SignUpIntent {
        public static final int $stable;
        public final TextFieldValue a;
        public final String b;

        public ChangeBlogName(@NotNull TextFieldValue textFieldValue0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(textFieldValue0, "blogName");
            Intrinsics.checkNotNullParameter(s, "recommendedBy");
            super(null);
            this.a = textFieldValue0;
            this.b = s;
        }

        public ChangeBlogName(TextFieldValue textFieldValue0, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                s = "";
            }
            this(textFieldValue0, s);
        }

        @NotNull
        public final TextFieldValue component1() {
            return this.a;
        }

        @NotNull
        public final String component2() {
            return this.b;
        }

        @NotNull
        public final ChangeBlogName copy(@NotNull TextFieldValue textFieldValue0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(textFieldValue0, "blogName");
            Intrinsics.checkNotNullParameter(s, "recommendedBy");
            return new ChangeBlogName(textFieldValue0, s);
        }

        public static ChangeBlogName copy$default(ChangeBlogName signUpIntent$ChangeBlogName0, TextFieldValue textFieldValue0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                textFieldValue0 = signUpIntent$ChangeBlogName0.a;
            }
            if((v & 2) != 0) {
                s = signUpIntent$ChangeBlogName0.b;
            }
            return signUpIntent$ChangeBlogName0.copy(textFieldValue0, s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ChangeBlogName)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((ChangeBlogName)object0).a) ? Intrinsics.areEqual(this.b, ((ChangeBlogName)object0).b) : false;
        }

        @NotNull
        public final TextFieldValue getBlogName() {
            return this.a;
        }

        @NotNull
        public final String getRecommendedBy() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeBlogName(blogName=" + this.a + ", recommendedBy=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000E\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\rJ\u0012\u0010\u000F\u001A\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0016\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0017\u001A\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001B\u001A\u00020\u00022\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u0003\u0010\rR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u001E\u001A\u0004\b \u0010\rR\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u0010R\u001D\u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u0012¨\u0006\'"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$ChangeBlogNameValidation;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent;", "", "isValid", "showRecommendation", "", "statusMessage", "", "Lcom/kakao/tistory/domain/entity/common/RecommendedBlogNameInfo;", "recommendedBlogNames", "<init>", "(ZZLjava/lang/String;Ljava/util/List;)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(ZZLjava/lang/String;Ljava/util/List;)Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$ChangeBlogNameValidation;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "getShowRecommendation", "c", "Ljava/lang/String;", "getStatusMessage", "d", "Ljava/util/List;", "getRecommendedBlogNames", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeBlogNameValidation extends SignUpIntent {
        public static final int $stable = 8;
        public final boolean a;
        public final boolean b;
        public final String c;
        public final List d;

        public ChangeBlogNameValidation(boolean z, boolean z1, @Nullable String s, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "recommendedBlogNames");
            super(null);
            this.a = z;
            this.b = z1;
            this.c = s;
            this.d = list0;
        }

        public ChangeBlogNameValidation(boolean z, boolean z1, String s, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 4) != 0) {
                s = null;
            }
            if((v & 8) != 0) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            this(z, z1, s, list0);
        }

        public final boolean component1() {
            return this.a;
        }

        public final boolean component2() {
            return this.b;
        }

        @Nullable
        public final String component3() {
            return this.c;
        }

        @NotNull
        public final List component4() {
            return this.d;
        }

        @NotNull
        public final ChangeBlogNameValidation copy(boolean z, boolean z1, @Nullable String s, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "recommendedBlogNames");
            return new ChangeBlogNameValidation(z, z1, s, list0);
        }

        public static ChangeBlogNameValidation copy$default(ChangeBlogNameValidation signUpIntent$ChangeBlogNameValidation0, boolean z, boolean z1, String s, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                z = signUpIntent$ChangeBlogNameValidation0.a;
            }
            if((v & 2) != 0) {
                z1 = signUpIntent$ChangeBlogNameValidation0.b;
            }
            if((v & 4) != 0) {
                s = signUpIntent$ChangeBlogNameValidation0.c;
            }
            if((v & 8) != 0) {
                list0 = signUpIntent$ChangeBlogNameValidation0.d;
            }
            return signUpIntent$ChangeBlogNameValidation0.copy(z, z1, s, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ChangeBlogNameValidation)) {
                return false;
            }
            if(this.a != ((ChangeBlogNameValidation)object0).a) {
                return false;
            }
            if(this.b != ((ChangeBlogNameValidation)object0).b) {
                return false;
            }
            return Intrinsics.areEqual(this.c, ((ChangeBlogNameValidation)object0).c) ? Intrinsics.areEqual(this.d, ((ChangeBlogNameValidation)object0).d) : false;
        }

        @NotNull
        public final List getRecommendedBlogNames() {
            return this.d;
        }

        public final boolean getShowRecommendation() {
            return this.b;
        }

        @Nullable
        public final String getStatusMessage() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = c.a(this.b, Boolean.hashCode(this.a) * 0x1F, 0x1F);
            return this.c == null ? this.d.hashCode() + v * 0x1F : this.d.hashCode() + (v + this.c.hashCode()) * 0x1F;
        }

        public final boolean isValid() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeBlogNameValidation(isValid=" + this.a + ", showRecommendation=" + this.b + ", statusMessage=" + this.c + ", recommendedBlogNames=" + this.d + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$ChangePage;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpPageType;", "pageType", "<init>", "(Lcom/kakao/tistory/presentation/view/signup/contract/SignUpPageType;)V", "component1", "()Lcom/kakao/tistory/presentation/view/signup/contract/SignUpPageType;", "copy", "(Lcom/kakao/tistory/presentation/view/signup/contract/SignUpPageType;)Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$ChangePage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpPageType;", "getPageType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangePage extends SignUpIntent {
        public static final int $stable;
        public final SignUpPageType a;

        public ChangePage(@NotNull SignUpPageType signUpPageType0) {
            Intrinsics.checkNotNullParameter(signUpPageType0, "pageType");
            super(null);
            this.a = signUpPageType0;
        }

        @NotNull
        public final SignUpPageType component1() {
            return this.a;
        }

        @NotNull
        public final ChangePage copy(@NotNull SignUpPageType signUpPageType0) {
            Intrinsics.checkNotNullParameter(signUpPageType0, "pageType");
            return new ChangePage(signUpPageType0);
        }

        public static ChangePage copy$default(ChangePage signUpIntent$ChangePage0, SignUpPageType signUpPageType0, int v, Object object0) {
            if((v & 1) != 0) {
                signUpPageType0 = signUpIntent$ChangePage0.a;
            }
            return signUpIntent$ChangePage0.copy(signUpPageType0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangePage ? this.a == ((ChangePage)object0).a : false;
        }

        @NotNull
        public final SignUpPageType getPageType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangePage(pageType=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$DuplicateEmails;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent;", "", "", "emails", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$DuplicateEmails;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getEmails", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class DuplicateEmails extends SignUpIntent {
        public static final int $stable = 8;
        public final List a;

        public DuplicateEmails(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "emails");
            super(null);
            this.a = list0;
        }

        @NotNull
        public final List component1() {
            return this.a;
        }

        @NotNull
        public final DuplicateEmails copy(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "emails");
            return new DuplicateEmails(list0);
        }

        public static DuplicateEmails copy$default(DuplicateEmails signUpIntent$DuplicateEmails0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = signUpIntent$DuplicateEmails0.a;
            }
            return signUpIntent$DuplicateEmails0.copy(list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof DuplicateEmails ? Intrinsics.areEqual(this.a, ((DuplicateEmails)object0).a) : false;
        }

        @NotNull
        public final List getEmails() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "DuplicateEmails(emails=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$Init;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Init extends SignUpIntent {
        public static final int $stable;
        @NotNull
        public static final Init INSTANCE;

        static {
            Init.INSTANCE = new Init();
        }

        public Init() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$RequestRecommendation;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RequestRecommendation extends SignUpIntent {
        public static final int $stable;
        @NotNull
        public static final RequestRecommendation INSTANCE;

        static {
            RequestRecommendation.INSTANCE = new RequestRecommendation();
        }

        public RequestRecommendation() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent$ToggleAgreeTalkChannel;", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpIntent;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ToggleAgreeTalkChannel extends SignUpIntent {
        public static final int $stable;
        @NotNull
        public static final ToggleAgreeTalkChannel INSTANCE;

        static {
            ToggleAgreeTalkChannel.INSTANCE = new ToggleAgreeTalkChannel();
        }

        public ToggleAgreeTalkChannel() {
            super(null);
        }
    }

    public static final int $stable;

    public SignUpIntent(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

