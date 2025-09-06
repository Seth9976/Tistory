package com.kakao.tistory.presentation.screen.home.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Category;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\r\u0082\u0001\f\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "", "ChangeFollow", "FollowFail", "HideDialog", "Loading", "OnClickFollow", "OnClickUnFollow", "SelectCategory", "ShowDialog", "ShowErrorDialog", "SlotListLoadingFail", "SlotListLoadingSuccess", "UpdateCategory", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$ChangeFollow;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$FollowFail;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$HideDialog;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$Loading;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$OnClickFollow;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$OnClickUnFollow;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$SelectCategory;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$ShowDialog;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$ShowErrorDialog;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$SlotListLoadingFail;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$SlotListLoadingSuccess;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$UpdateCategory;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface HomeIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00042\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u0005\u0010\u000B¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$ChangeFollow;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "", "blogName", "", "isFollowing", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$ChangeFollow;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ChangeFollow implements HomeIntent {
        public static final int $stable;
        public final String a;
        public final boolean b;

        public ChangeFollow(@NotNull String s, boolean z) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            super();
            this.a = s;
            this.b = z;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final boolean component2() {
            return this.b;
        }

        @NotNull
        public final ChangeFollow copy(@NotNull String s, boolean z) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new ChangeFollow(s, z);
        }

        public static ChangeFollow copy$default(ChangeFollow homeIntent$ChangeFollow0, String s, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeIntent$ChangeFollow0.a;
            }
            if((v & 2) != 0) {
                z = homeIntent$ChangeFollow0.b;
            }
            return homeIntent$ChangeFollow0.copy(s, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ChangeFollow)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((ChangeFollow)object0).a) ? this.b == ((ChangeFollow)object0).b : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.b) + this.a.hashCode() * 0x1F;
        }

        public final boolean isFollowing() {
            return this.b;
        }

        @Override
        @NotNull
        public String toString() {
            return "ChangeFollow(blogName=" + this.a + ", isFollowing=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000E\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0014\u001A\u00020\u00042\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u0005\u0010\u000B¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$FollowFail;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "", "blogName", "", "isFollowRequest", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$FollowFail;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class FollowFail implements HomeIntent {
        public static final int $stable;
        public final String a;
        public final boolean b;

        public FollowFail(@NotNull String s, boolean z) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            super();
            this.a = s;
            this.b = z;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        public final boolean component2() {
            return this.b;
        }

        @NotNull
        public final FollowFail copy(@NotNull String s, boolean z) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new FollowFail(s, z);
        }

        public static FollowFail copy$default(FollowFail homeIntent$FollowFail0, String s, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeIntent$FollowFail0.a;
            }
            if((v & 2) != 0) {
                z = homeIntent$FollowFail0.b;
            }
            return homeIntent$FollowFail0.copy(s, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof FollowFail)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((FollowFail)object0).a) ? this.b == ((FollowFail)object0).b : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.b) + this.a.hashCode() * 0x1F;
        }

        public final boolean isFollowRequest() {
            return this.b;
        }

        @Override
        @NotNull
        public String toString() {
            return "FollowFail(blogName=" + this.a + ", isFollowRequest=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$HideDialog;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class HideDialog implements HomeIntent {
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
            return 0xDEE8925C;
        }

        @Override
        @NotNull
        public String toString() {
            return "HideDialog";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00022\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0003\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$Loading;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "", "isRefresh", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$Loading;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Loading implements HomeIntent {
        public static final int $stable;
        public final boolean a;

        public Loading() {
            this(false, 1, null);
        }

        public Loading(boolean z) {
            this.a = z;
        }

        public Loading(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                z = false;
            }
            this(z);
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final Loading copy(boolean z) {
            return new Loading(z);
        }

        public static Loading copy$default(Loading homeIntent$Loading0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = homeIntent$Loading0.a;
            }
            return homeIntent$Loading0.copy(z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Loading ? this.a == ((Loading)object0).a : false;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final boolean isRefresh() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            return "Loading(isRefresh=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$OnClickFollow;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "", "blogName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$OnClickFollow;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnClickFollow implements HomeIntent {
        public static final int $stable;
        public final String a;

        public OnClickFollow(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final OnClickFollow copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new OnClickFollow(s);
        }

        public static OnClickFollow copy$default(OnClickFollow homeIntent$OnClickFollow0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeIntent$OnClickFollow0.a;
            }
            return homeIntent$OnClickFollow0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof OnClickFollow ? Intrinsics.areEqual(this.a, ((OnClickFollow)object0).a) : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "OnClickFollow(blogName=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$OnClickUnFollow;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "", "blogName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$OnClickUnFollow;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class OnClickUnFollow implements HomeIntent {
        public static final int $stable;
        public final String a;

        public OnClickUnFollow(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final OnClickUnFollow copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            return new OnClickUnFollow(s);
        }

        public static OnClickUnFollow copy$default(OnClickUnFollow homeIntent$OnClickUnFollow0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeIntent$OnClickUnFollow0.a;
            }
            return homeIntent$OnClickUnFollow0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof OnClickUnFollow ? Intrinsics.areEqual(this.a, ((OnClickUnFollow)object0).a) : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "OnClickUnFollow(blogName=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$SelectCategory;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "", "categoryGroupId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$SelectCategory;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCategoryGroupId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SelectCategory implements HomeIntent {
        public static final int $stable;
        public final String a;

        public SelectCategory(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "categoryGroupId");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final SelectCategory copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "categoryGroupId");
            return new SelectCategory(s);
        }

        public static SelectCategory copy$default(SelectCategory homeIntent$SelectCategory0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeIntent$SelectCategory0.a;
            }
            return homeIntent$SelectCategory0.copy(s);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof SelectCategory ? Intrinsics.areEqual(this.a, ((SelectCategory)object0).a) : false;
        }

        @NotNull
        public final String getCategoryGroupId() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "SelectCategory(categoryGroupId=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$ShowDialog;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "Lcom/kakao/tistory/presentation/screen/home/contract/DialogType;", "type", "<init>", "(Lcom/kakao/tistory/presentation/screen/home/contract/DialogType;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/home/contract/DialogType;", "copy", "(Lcom/kakao/tistory/presentation/screen/home/contract/DialogType;)Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$ShowDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/home/contract/DialogType;", "getType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowDialog implements HomeIntent {
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

        public static ShowDialog copy$default(ShowDialog homeIntent$ShowDialog0, DialogType dialogType0, int v, Object object0) {
            if((v & 1) != 0) {
                dialogType0 = homeIntent$ShowDialog0.a;
            }
            return homeIntent$ShowDialog0.copy(dialogType0);
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$ShowErrorDialog;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "<init>", "(Lcom/kakao/android/base/model/ErrorModel;)V", "component1", "()Lcom/kakao/android/base/model/ErrorModel;", "copy", "(Lcom/kakao/android/base/model/ErrorModel;)Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$ShowErrorDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/android/base/model/ErrorModel;", "getErrorModel", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowErrorDialog implements HomeIntent {
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

        public static ShowErrorDialog copy$default(ShowErrorDialog homeIntent$ShowErrorDialog0, ErrorModel errorModel0, int v, Object object0) {
            if((v & 1) != 0) {
                errorModel0 = homeIntent$ShowErrorDialog0.a;
            }
            return homeIntent$ShowErrorDialog0.copy(errorModel0);
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

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$SlotListLoadingFail;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "<init>", "(Lcom/kakao/android/base/model/ErrorModel;)V", "component1", "()Lcom/kakao/android/base/model/ErrorModel;", "copy", "(Lcom/kakao/android/base/model/ErrorModel;)Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$SlotListLoadingFail;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/android/base/model/ErrorModel;", "getErrorModel", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SlotListLoadingFail implements HomeIntent {
        public static final int $stable = 8;
        public final ErrorModel a;

        public SlotListLoadingFail(@NotNull ErrorModel errorModel0) {
            Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
            super();
            this.a = errorModel0;
        }

        @NotNull
        public final ErrorModel component1() {
            return this.a;
        }

        @NotNull
        public final SlotListLoadingFail copy(@NotNull ErrorModel errorModel0) {
            Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
            return new SlotListLoadingFail(errorModel0);
        }

        public static SlotListLoadingFail copy$default(SlotListLoadingFail homeIntent$SlotListLoadingFail0, ErrorModel errorModel0, int v, Object object0) {
            if((v & 1) != 0) {
                errorModel0 = homeIntent$SlotListLoadingFail0.a;
            }
            return homeIntent$SlotListLoadingFail0.copy(errorModel0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof SlotListLoadingFail ? Intrinsics.areEqual(this.a, ((SlotListLoadingFail)object0).a) : false;
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
            return "SlotListLoadingFail(errorModel=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ \u0010\f\u001A\u00020\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0014\u001A\u00020\u00132\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u000B¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$SlotListLoadingSuccess;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState;", "slotList", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$SlotListLoadingSuccess;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getSlotList", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SlotListLoadingSuccess implements HomeIntent {
        public static final int $stable = 8;
        public final List a;

        public SlotListLoadingSuccess(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "slotList");
            super();
            this.a = list0;
        }

        @NotNull
        public final List component1() {
            return this.a;
        }

        @NotNull
        public final SlotListLoadingSuccess copy(@NotNull List list0) {
            Intrinsics.checkNotNullParameter(list0, "slotList");
            return new SlotListLoadingSuccess(list0);
        }

        public static SlotListLoadingSuccess copy$default(SlotListLoadingSuccess homeIntent$SlotListLoadingSuccess0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                list0 = homeIntent$SlotListLoadingSuccess0.a;
            }
            return homeIntent$SlotListLoadingSuccess0.copy(list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof SlotListLoadingSuccess ? Intrinsics.areEqual(this.a, ((SlotListLoadingSuccess)object0).a) : false;
        }

        @NotNull
        public final List getSlotList() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return a.d("SlotListLoadingSuccess(slotList=[", CollectionsKt___CollectionsKt.joinToString$default(this.a, null, null, null, 0, null, c.a, 0x1F, null), "])");
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$UpdateCategory;", "Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent;", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category;", "category", "<init>", "(Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category;)V", "component1", "()Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category;", "copy", "(Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category;)Lcom/kakao/tistory/presentation/screen/home/contract/HomeIntent$UpdateCategory;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Category;", "getCategory", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateCategory implements HomeIntent {
        public static final int $stable = 8;
        public final Category a;

        public UpdateCategory(@NotNull Category homeSlotUiState$Category0) {
            Intrinsics.checkNotNullParameter(homeSlotUiState$Category0, "category");
            super();
            this.a = homeSlotUiState$Category0;
        }

        @NotNull
        public final Category component1() {
            return this.a;
        }

        @NotNull
        public final UpdateCategory copy(@NotNull Category homeSlotUiState$Category0) {
            Intrinsics.checkNotNullParameter(homeSlotUiState$Category0, "category");
            return new UpdateCategory(homeSlotUiState$Category0);
        }

        public static UpdateCategory copy$default(UpdateCategory homeIntent$UpdateCategory0, Category homeSlotUiState$Category0, int v, Object object0) {
            if((v & 1) != 0) {
                homeSlotUiState$Category0 = homeIntent$UpdateCategory0.a;
            }
            return homeIntent$UpdateCategory0.copy(homeSlotUiState$Category0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateCategory ? Intrinsics.areEqual(this.a, ((UpdateCategory)object0).a) : false;
        }

        @NotNull
        public final Category getCategory() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateCategory(category=" + this.a + ")";
        }
    }

}

