package com.kakao.tistory.presentation.screen.blog.setting.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextFieldValue;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u000E\u0082\u0001\r\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "", "ChangeBlogDescription", "ChangeBlogInfo", "ChangeBlogTitle", "ChangeImageFileUrl", "ChangeImageMaxSize", "ChangeNickname", "ChangeNicknameValidation", "Complete", "HideBottomSheet", "HideDialog", "ShowBottomSheet", "ShowDialog", "ShowErrorDialog", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeBlogDescription;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeBlogInfo;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeBlogTitle;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeImageFileUrl;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeImageMaxSize;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeNickname;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeNicknameValidation;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$Complete;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$HideBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$HideDialog;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ShowBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ShowDialog;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ShowErrorDialog;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface BlogSettingIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeBlogDescription;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "Landroidx/compose/ui/text/input/TextFieldValue;", "blogDescription", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "component1", "()Landroidx/compose/ui/text/input/TextFieldValue;", "copy", "(Landroidx/compose/ui/text/input/TextFieldValue;)Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeBlogDescription;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/input/TextFieldValue;", "getBlogDescription", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeBlogDescription implements BlogSettingIntent {
        public static final int $stable;
        public final TextFieldValue a;

        public ChangeBlogDescription(@NotNull TextFieldValue textFieldValue0) {
            Intrinsics.checkNotNullParameter(textFieldValue0, "blogDescription");
            super();
            this.a = textFieldValue0;
        }

        @NotNull
        public final TextFieldValue component1() {
            return this.a;
        }

        @NotNull
        public final ChangeBlogDescription copy(@NotNull TextFieldValue textFieldValue0) {
            Intrinsics.checkNotNullParameter(textFieldValue0, "blogDescription");
            return new ChangeBlogDescription(textFieldValue0);
        }

        public static ChangeBlogDescription copy$default(ChangeBlogDescription blogSettingIntent$ChangeBlogDescription0, TextFieldValue textFieldValue0, int v, Object object0) {
            if((v & 1) != 0) {
                textFieldValue0 = blogSettingIntent$ChangeBlogDescription0.a;
            }
            return blogSettingIntent$ChangeBlogDescription0.copy(textFieldValue0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeBlogDescription ? Intrinsics.areEqual(this.a, ((ChangeBlogDescription)object0).a) : false;
        }

        @NotNull
        public final TextFieldValue getBlogDescription() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeBlogDescription(blogDescription=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeBlogInfo;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "blog", "<init>", "(Lcom/kakao/tistory/domain/blog/entity/BlogInfo;)V", "component1", "()Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "copy", "(Lcom/kakao/tistory/domain/blog/entity/BlogInfo;)Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeBlogInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "getBlog", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeBlogInfo implements BlogSettingIntent {
        public static final int $stable = 8;
        public final BlogInfo a;

        public ChangeBlogInfo(@Nullable BlogInfo blogInfo0) {
            this.a = blogInfo0;
        }

        @Nullable
        public final BlogInfo component1() {
            return this.a;
        }

        @NotNull
        public final ChangeBlogInfo copy(@Nullable BlogInfo blogInfo0) {
            return new ChangeBlogInfo(blogInfo0);
        }

        public static ChangeBlogInfo copy$default(ChangeBlogInfo blogSettingIntent$ChangeBlogInfo0, BlogInfo blogInfo0, int v, Object object0) {
            if((v & 1) != 0) {
                blogInfo0 = blogSettingIntent$ChangeBlogInfo0.a;
            }
            return blogSettingIntent$ChangeBlogInfo0.copy(blogInfo0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeBlogInfo ? Intrinsics.areEqual(this.a, ((ChangeBlogInfo)object0).a) : false;
        }

        @Nullable
        public final BlogInfo getBlog() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeBlogInfo(blog=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeBlogTitle;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "Landroidx/compose/ui/text/input/TextFieldValue;", "blogTitle", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "component1", "()Landroidx/compose/ui/text/input/TextFieldValue;", "copy", "(Landroidx/compose/ui/text/input/TextFieldValue;)Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeBlogTitle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/input/TextFieldValue;", "getBlogTitle", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeBlogTitle implements BlogSettingIntent {
        public static final int $stable;
        public final TextFieldValue a;

        public ChangeBlogTitle(@NotNull TextFieldValue textFieldValue0) {
            Intrinsics.checkNotNullParameter(textFieldValue0, "blogTitle");
            super();
            this.a = textFieldValue0;
        }

        @NotNull
        public final TextFieldValue component1() {
            return this.a;
        }

        @NotNull
        public final ChangeBlogTitle copy(@NotNull TextFieldValue textFieldValue0) {
            Intrinsics.checkNotNullParameter(textFieldValue0, "blogTitle");
            return new ChangeBlogTitle(textFieldValue0);
        }

        public static ChangeBlogTitle copy$default(ChangeBlogTitle blogSettingIntent$ChangeBlogTitle0, TextFieldValue textFieldValue0, int v, Object object0) {
            if((v & 1) != 0) {
                textFieldValue0 = blogSettingIntent$ChangeBlogTitle0.a;
            }
            return blogSettingIntent$ChangeBlogTitle0.copy(textFieldValue0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeBlogTitle ? Intrinsics.areEqual(this.a, ((ChangeBlogTitle)object0).a) : false;
        }

        @NotNull
        public final TextFieldValue getBlogTitle() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeBlogTitle(blogTitle=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeImageFileUrl;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "", "imageFileUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeImageFileUrl;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getImageFileUrl", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeImageFileUrl implements BlogSettingIntent {
        public static final int $stable;
        public final String a;

        public ChangeImageFileUrl(@Nullable String s) {
            this.a = s;
        }

        @Nullable
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final ChangeImageFileUrl copy(@Nullable String s) {
            return new ChangeImageFileUrl(s);
        }

        public static ChangeImageFileUrl copy$default(ChangeImageFileUrl blogSettingIntent$ChangeImageFileUrl0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = blogSettingIntent$ChangeImageFileUrl0.a;
            }
            return blogSettingIntent$ChangeImageFileUrl0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeImageFileUrl ? Intrinsics.areEqual(this.a, ((ChangeImageFileUrl)object0).a) : false;
        }

        @Nullable
        public final String getImageFileUrl() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeImageFileUrl(imageFileUrl=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeImageMaxSize;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "", "imageMaxSize", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeImageMaxSize;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getImageMaxSize", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeImageMaxSize implements BlogSettingIntent {
        public static final int $stable;
        public final long a;

        public ChangeImageMaxSize(long v) {
            this.a = v;
        }

        public final long component1() {
            return this.a;
        }

        @NotNull
        public final ChangeImageMaxSize copy(long v) {
            return new ChangeImageMaxSize(v);
        }

        public static ChangeImageMaxSize copy$default(ChangeImageMaxSize blogSettingIntent$ChangeImageMaxSize0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = blogSettingIntent$ChangeImageMaxSize0.a;
            }
            return blogSettingIntent$ChangeImageMaxSize0.copy(v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeImageMaxSize ? this.a == ((ChangeImageMaxSize)object0).a : false;
        }

        public final long getImageMaxSize() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeImageMaxSize(imageMaxSize=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeNickname;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "Landroidx/compose/ui/text/input/TextFieldValue;", "nickname", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "component1", "()Landroidx/compose/ui/text/input/TextFieldValue;", "copy", "(Landroidx/compose/ui/text/input/TextFieldValue;)Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeNickname;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/input/TextFieldValue;", "getNickname", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeNickname implements BlogSettingIntent {
        public static final int $stable;
        public final TextFieldValue a;

        public ChangeNickname(@NotNull TextFieldValue textFieldValue0) {
            Intrinsics.checkNotNullParameter(textFieldValue0, "nickname");
            super();
            this.a = textFieldValue0;
        }

        @NotNull
        public final TextFieldValue component1() {
            return this.a;
        }

        @NotNull
        public final ChangeNickname copy(@NotNull TextFieldValue textFieldValue0) {
            Intrinsics.checkNotNullParameter(textFieldValue0, "nickname");
            return new ChangeNickname(textFieldValue0);
        }

        public static ChangeNickname copy$default(ChangeNickname blogSettingIntent$ChangeNickname0, TextFieldValue textFieldValue0, int v, Object object0) {
            if((v & 1) != 0) {
                textFieldValue0 = blogSettingIntent$ChangeNickname0.a;
            }
            return blogSettingIntent$ChangeNickname0.copy(textFieldValue0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChangeNickname ? Intrinsics.areEqual(this.a, ((ChangeNickname)object0).a) : false;
        }

        @NotNull
        public final TextFieldValue getNickname() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeNickname(nickname=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ&\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000BJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00022\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0003\u0010\tR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u000B¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeNicknameValidation;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "", "isValid", "", "errorMessage", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ChangeNicknameValidation;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "Ljava/lang/String;", "getErrorMessage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeNicknameValidation implements BlogSettingIntent {
        public static final int $stable;
        public final boolean a;
        public final String b;

        public ChangeNicknameValidation(boolean z, @Nullable String s) {
            this.a = z;
            this.b = s;
        }

        public ChangeNicknameValidation(boolean z, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                s = null;
            }
            this(z, s);
        }

        public final boolean component1() {
            return this.a;
        }

        @Nullable
        public final String component2() {
            return this.b;
        }

        @NotNull
        public final ChangeNicknameValidation copy(boolean z, @Nullable String s) {
            return new ChangeNicknameValidation(z, s);
        }

        public static ChangeNicknameValidation copy$default(ChangeNicknameValidation blogSettingIntent$ChangeNicknameValidation0, boolean z, String s, int v, Object object0) {
            if((v & 1) != 0) {
                z = blogSettingIntent$ChangeNicknameValidation0.a;
            }
            if((v & 2) != 0) {
                s = blogSettingIntent$ChangeNicknameValidation0.b;
            }
            return blogSettingIntent$ChangeNicknameValidation0.copy(z, s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ChangeNicknameValidation)) {
                return false;
            }
            return this.a == ((ChangeNicknameValidation)object0).a ? Intrinsics.areEqual(this.b, ((ChangeNicknameValidation)object0).b) : false;
        }

        @Nullable
        public final String getErrorMessage() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = Boolean.hashCode(this.a);
            return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
        }

        public final boolean isValid() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeNicknameValidation(isValid=" + this.a + ", errorMessage=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$Complete;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Complete implements BlogSettingIntent {
        public static final int $stable;
        @NotNull
        public static final Complete INSTANCE;

        static {
            Complete.INSTANCE = new Complete();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Complete;
        }

        @Override
        public int hashCode() {
            return 0xC34D60A3;
        }

        @Override
        @NotNull
        public String toString() {
            return "Complete";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$HideBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class HideBottomSheet implements BlogSettingIntent {
        public static final int $stable;
        @NotNull
        public static final HideBottomSheet INSTANCE;

        static {
            HideBottomSheet.INSTANCE = new HideBottomSheet();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof HideBottomSheet;
        }

        @Override
        public int hashCode() {
            return 0x924048A8;
        }

        @Override
        @NotNull
        public String toString() {
            return "HideBottomSheet";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$HideDialog;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class HideDialog implements BlogSettingIntent {
        public static final int $stable;
        @NotNull
        public static final HideDialog INSTANCE;

        static {
            HideDialog.INSTANCE = new HideDialog();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof HideDialog;
        }

        @Override
        public int hashCode() {
            return 1080773140;
        }

        @Override
        @NotNull
        public String toString() {
            return "HideDialog";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ShowBottomSheet;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BottomSheetType;", "type", "<init>", "(Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BottomSheetType;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BottomSheetType;", "copy", "(Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BottomSheetType;)Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ShowBottomSheet;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BottomSheetType;", "getType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowBottomSheet implements BlogSettingIntent {
        public static final int $stable = 8;
        public final BottomSheetType a;

        public ShowBottomSheet(@NotNull BottomSheetType bottomSheetType0) {
            Intrinsics.checkNotNullParameter(bottomSheetType0, "type");
            super();
            this.a = bottomSheetType0;
        }

        @NotNull
        public final BottomSheetType component1() {
            return this.a;
        }

        @NotNull
        public final ShowBottomSheet copy(@NotNull BottomSheetType bottomSheetType0) {
            Intrinsics.checkNotNullParameter(bottomSheetType0, "type");
            return new ShowBottomSheet(bottomSheetType0);
        }

        public static ShowBottomSheet copy$default(ShowBottomSheet blogSettingIntent$ShowBottomSheet0, BottomSheetType bottomSheetType0, int v, Object object0) {
            if((v & 1) != 0) {
                bottomSheetType0 = blogSettingIntent$ShowBottomSheet0.a;
            }
            return blogSettingIntent$ShowBottomSheet0.copy(bottomSheetType0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowBottomSheet ? Intrinsics.areEqual(this.a, ((ShowBottomSheet)object0).a) : false;
        }

        @NotNull
        public final BottomSheetType getType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowBottomSheet(type=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ShowDialog;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/DialogType;", "type", "<init>", "(Lcom/kakao/tistory/presentation/screen/blog/setting/contract/DialogType;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/blog/setting/contract/DialogType;", "copy", "(Lcom/kakao/tistory/presentation/screen/blog/setting/contract/DialogType;)Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ShowDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/DialogType;", "getType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowDialog implements BlogSettingIntent {
        public static final int $stable = 8;
        public final DialogType a;

        public ShowDialog(@NotNull DialogType dialogType0) {
            Intrinsics.checkNotNullParameter(dialogType0, "type");
            super();
            this.a = dialogType0;
        }

        @NotNull
        public final DialogType component1() {
            return this.a;
        }

        @NotNull
        public final ShowDialog copy(@NotNull DialogType dialogType0) {
            Intrinsics.checkNotNullParameter(dialogType0, "type");
            return new ShowDialog(dialogType0);
        }

        public static ShowDialog copy$default(ShowDialog blogSettingIntent$ShowDialog0, DialogType dialogType0, int v, Object object0) {
            if((v & 1) != 0) {
                dialogType0 = blogSettingIntent$ShowDialog0.a;
            }
            return blogSettingIntent$ShowDialog0.copy(dialogType0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowDialog ? Intrinsics.areEqual(this.a, ((ShowDialog)object0).a) : false;
        }

        @NotNull
        public final DialogType getType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowDialog(type=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ShowErrorDialog;", "Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent;", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "<init>", "(Lcom/kakao/android/base/model/ErrorModel;)V", "component1", "()Lcom/kakao/android/base/model/ErrorModel;", "copy", "(Lcom/kakao/android/base/model/ErrorModel;)Lcom/kakao/tistory/presentation/screen/blog/setting/contract/BlogSettingIntent$ShowErrorDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/android/base/model/ErrorModel;", "getErrorModel", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowErrorDialog implements BlogSettingIntent {
        public static final int $stable = 8;
        public final ErrorModel a;

        public ShowErrorDialog(@NotNull ErrorModel errorModel0) {
            Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
            super();
            this.a = errorModel0;
        }

        @NotNull
        public final ErrorModel component1() {
            return this.a;
        }

        @NotNull
        public final ShowErrorDialog copy(@NotNull ErrorModel errorModel0) {
            Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
            return new ShowErrorDialog(errorModel0);
        }

        public static ShowErrorDialog copy$default(ShowErrorDialog blogSettingIntent$ShowErrorDialog0, ErrorModel errorModel0, int v, Object object0) {
            if((v & 1) != 0) {
                errorModel0 = blogSettingIntent$ShowErrorDialog0.a;
            }
            return blogSettingIntent$ShowErrorDialog0.copy(errorModel0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowErrorDialog ? Intrinsics.areEqual(this.a, ((ShowErrorDialog)object0).a) : false;
        }

        @NotNull
        public final ErrorModel getErrorModel() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowErrorDialog(errorModel=" + this.a + ")";
        }
    }

}

