package com.kakao.tistory.presentation.screen.blog.common.contract;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.domain.blog.entity.BlogRoleType;
import com.kakao.tistory.presentation.main.contract.a;
import com.kakao.tistory.presentation.main.contract.b;
import com.kakao.tistory.presentation.main.contract.c;
import com.kakao.tistory.presentation.screen.item.ViewState.Loading;
import com.kakao.tistory.presentation.screen.item.ViewState.Success;
import com.kakao.tistory.presentation.screen.item.ViewState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u001B\b\u0087\b\u0018\u00002\u00020\u0001B\u00A1\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\u001A\u0010\u0007\u001A\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00060\u000B\u0012\b\b\u0002\u0010\r\u001A\u00020\u0005\u0012\u0012\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000E\u00126\u0010\u0014\u001A2\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0004\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001A\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0016\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0016\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00060\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u001C\u0010!\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000EH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J@\u0010#\u001A2\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0004H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\u001AJ\u00B2\u0001\u0010$\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u001C\b\u0002\u0010\u0007\u001A\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00060\u000B2\b\b\u0002\u0010\r\u001A\u00020\u00052\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000E28\b\u0002\u0010\u0014\u001A2\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0004H\u00C6\u0001\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\u0018J\u0010\u0010(\u001A\u00020\'H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010)J\u001A\u0010+\u001A\u00020\u00052\b\u0010*\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u0018R+\u0010\u0007\u001A\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001AR\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0006\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010\u001CR\u001D\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00060\u000B8\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u0010\u001ER\u0017\u0010\r\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b\r\u0010 R#\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000E8\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010\"RG\u0010\u0014\u001A2\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0002\u00A2\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u00048\u0006\u00A2\u0006\f\n\u0004\b>\u00101\u001A\u0004\b?\u0010\u001AR\u0017\u0010A\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b@\u0010:\u001A\u0004\bA\u0010 \u00A8\u0006B"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogUiState;", "", "", "blogName", "Lkotlin/Function2;", "", "", "init", "Lcom/kakao/tistory/presentation/screen/item/ViewState;", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "state", "Lkotlin/Function0;", "refresh", "isRefreshing", "Lkotlin/Function1;", "changeBlogInfo", "Lkotlin/ParameterName;", "name", "section", "page", "onFinish", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/kakao/tistory/presentation/screen/item/ViewState;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/jvm/functions/Function2;", "component3", "()Lcom/kakao/tistory/presentation/screen/item/ViewState;", "component4", "()Lkotlin/jvm/functions/Function0;", "component5", "()Z", "component6", "()Lkotlin/jvm/functions/Function1;", "component7", "copy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/kakao/tistory/presentation/screen/item/ViewState;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogUiState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "Lkotlin/jvm/functions/Function2;", "getInit", "c", "Lcom/kakao/tistory/presentation/screen/item/ViewState;", "getState", "d", "Lkotlin/jvm/functions/Function0;", "getRefresh", "e", "Z", "f", "Lkotlin/jvm/functions/Function1;", "getChangeBlogInfo", "g", "getOnFinish", "h", "isMine", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogUiState {
    public static final int $stable;
    public final String a;
    public final Function2 b;
    public final ViewState c;
    public final Function0 d;
    public final boolean e;
    public final Function1 f;
    public final Function2 g;
    public final boolean h;

    public BlogUiState(@NotNull String s, @NotNull Function2 function20, @NotNull ViewState viewState0, @NotNull Function0 function00, boolean z, @NotNull Function1 function10, @NotNull Function2 function21) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        boolean z1;
        Intrinsics.checkNotNullParameter(function20, "init");
        Intrinsics.checkNotNullParameter(viewState0, "state");
        Intrinsics.checkNotNullParameter(function00, "refresh");
        Intrinsics.checkNotNullParameter(function10, "changeBlogInfo");
        Intrinsics.checkNotNullParameter(function21, "onFinish");
        super();
        this.a = s;
        this.b = function20;
        this.c = viewState0;
        this.d = function00;
        this.e = z;
        this.f = function10;
        this.g = function21;
        Success viewState$Success0 = viewState0 instanceof Success ? ((Success)viewState0) : null;
        if(viewState$Success0 == null) {
            z1 = false;
        }
        else {
            BlogInfo blogInfo0 = (BlogInfo)viewState$Success0.getItem();
            if(blogInfo0 == null) {
                z1 = false;
            }
            else {
                z1 = true;
                BlogRoleType blogRoleType0 = blogInfo0.getRole();
                if(blogRoleType0 == null || !blogRoleType0.getHasBlogRole()) {
                    z1 = false;
                }
            }
        }
        this.h = z1;
    }

    public BlogUiState(String s, Function2 function20, ViewState viewState0, Function0 function00, boolean z, Function1 function10, Function2 function21, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        ViewState viewState1 = (v & 4) == 0 ? viewState0 : Loading.INSTANCE;
        this(((v & 1) == 0 ? s : ""), function20, viewState1, function00, ((v & 16) == 0 ? z : false), function10, function21);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final Function2 component2() {
        return this.b;
    }

    @NotNull
    public final ViewState component3() {
        return this.c;
    }

    @NotNull
    public final Function0 component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    @NotNull
    public final Function1 component6() {
        return this.f;
    }

    @NotNull
    public final Function2 component7() {
        return this.g;
    }

    @NotNull
    public final BlogUiState copy(@NotNull String s, @NotNull Function2 function20, @NotNull ViewState viewState0, @NotNull Function0 function00, boolean z, @NotNull Function1 function10, @NotNull Function2 function21) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(function20, "init");
        Intrinsics.checkNotNullParameter(viewState0, "state");
        Intrinsics.checkNotNullParameter(function00, "refresh");
        Intrinsics.checkNotNullParameter(function10, "changeBlogInfo");
        Intrinsics.checkNotNullParameter(function21, "onFinish");
        return new BlogUiState(s, function20, viewState0, function00, z, function10, function21);
    }

    public static BlogUiState copy$default(BlogUiState blogUiState0, String s, Function2 function20, ViewState viewState0, Function0 function00, boolean z, Function1 function10, Function2 function21, int v, Object object0) {
        if((v & 1) != 0) {
            s = blogUiState0.a;
        }
        if((v & 2) != 0) {
            function20 = blogUiState0.b;
        }
        if((v & 4) != 0) {
            viewState0 = blogUiState0.c;
        }
        if((v & 8) != 0) {
            function00 = blogUiState0.d;
        }
        if((v & 16) != 0) {
            z = blogUiState0.e;
        }
        if((v & 0x20) != 0) {
            function10 = blogUiState0.f;
        }
        if((v & 0x40) != 0) {
            function21 = blogUiState0.g;
        }
        return blogUiState0.copy(s, function20, viewState0, function00, z, function10, function21);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogUiState)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((BlogUiState)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((BlogUiState)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((BlogUiState)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((BlogUiState)object0).d)) {
            return false;
        }
        if(this.e != ((BlogUiState)object0).e) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((BlogUiState)object0).f) ? Intrinsics.areEqual(this.g, ((BlogUiState)object0).g) : false;
    }

    @NotNull
    public final String getBlogName() {
        return this.a;
    }

    @NotNull
    public final Function1 getChangeBlogInfo() {
        return this.f;
    }

    @NotNull
    public final Function2 getInit() {
        return this.b;
    }

    @NotNull
    public final Function2 getOnFinish() {
        return this.g;
    }

    @NotNull
    public final Function0 getRefresh() {
        return this.d;
    }

    @NotNull
    public final ViewState getState() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.g.hashCode() + b.a(this.f, c.a(this.e, a.a(this.d, (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    public final boolean isMine() {
        return this.h;
    }

    public final boolean isRefreshing() {
        return this.e;
    }

    @Override
    @NotNull
    public String toString() {
        return "BlogUiState(blogName=" + this.a + ", init=" + this.b + ", state=" + this.c + ", refresh=" + this.d + ", isRefreshing=" + this.e + ", changeBlogInfo=" + this.f + ", onFinish=" + this.g + ")";
    }
}

