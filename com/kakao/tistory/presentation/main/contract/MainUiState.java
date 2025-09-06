package com.kakao.tistory.presentation.main.contract;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.domain.entity.Blog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bp\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0006\u0012!\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\t\u0012\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u000E0\u0010\u0012\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u000E0\u0010\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001AJ+\u0010\u001C\u001A\u001D\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\tH\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0016\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u000E0\u0010H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0016\u0010 \u001A\b\u0012\u0004\u0012\u00020\u000E0\u0010H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001FJ\u007F\u0010!\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062#\b\u0002\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\t2\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u000E0\u00102\u000E\b\u0002\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u000E0\u0010H\u00C6\u0001\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001A\u00020#H\u00D6\u0001\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010\'\u001A\u00020&H\u00D6\u0001\u00A2\u0006\u0004\b\'\u0010(J\u001A\u0010*\u001A\u00020\u00062\b\u0010)\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u0016R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u0018R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u001AR\u0017\u0010\b\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b5\u00103\u001A\u0004\b6\u0010\u001AR2\u0010\u000F\u001A\u001D\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000E0\t8\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\u001DR\u001D\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u000E0\u00108\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010\u001FR\u001D\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u000E0\u00108\u0006\u00A2\u0006\f\n\u0004\b=\u0010;\u001A\u0004\b>\u0010\u001FR\u0017\u0010B\u001A\u00020#8\u0006\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010%R\u0017\u0010D\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bC\u00103\u001A\u0004\bD\u0010\u001AR\u0017\u0010F\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bE\u00103\u001A\u0004\bF\u0010\u001A\u00A8\u0006G"}, d2 = {"Lcom/kakao/tistory/presentation/main/contract/MainUiState;", "", "Lcom/kakao/tistory/domain/entity/Blog;", "currentBlog", "", "notificationCount", "", "showBackPressedSnackBar", "hasRedirection", "Lkotlin/Function1;", "Landroid/content/Intent;", "Lkotlin/ParameterName;", "name", "intent", "", "onNewIntent", "Lkotlin/Function0;", "onBackPressedInHome", "onNavigateToEditor", "<init>", "(Lcom/kakao/tistory/domain/entity/Blog;JZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lcom/kakao/tistory/domain/entity/Blog;", "component2", "()J", "component3", "()Z", "component4", "component5", "()Lkotlin/jvm/functions/Function1;", "component6", "()Lkotlin/jvm/functions/Function0;", "component7", "copy", "(Lcom/kakao/tistory/domain/entity/Blog;JZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/kakao/tistory/presentation/main/contract/MainUiState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/entity/Blog;", "getCurrentBlog", "b", "J", "getNotificationCount", "c", "Z", "getShowBackPressedSnackBar", "d", "getHasRedirection", "e", "Lkotlin/jvm/functions/Function1;", "getOnNewIntent", "f", "Lkotlin/jvm/functions/Function0;", "getOnBackPressedInHome", "g", "getOnNavigateToEditor", "h", "Ljava/lang/String;", "getBlogTitle", "blogTitle", "i", "isBlogLess", "j", "isBlogRestricted", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MainUiState {
    public static final int $stable;
    public final Blog a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final Function1 e;
    public final Function0 f;
    public final Function0 g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public MainUiState(@Nullable Blog blog0, long v, boolean z, boolean z1, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(function10, "onNewIntent");
        Intrinsics.checkNotNullParameter(function00, "onBackPressedInHome");
        Intrinsics.checkNotNullParameter(function01, "onNavigateToEditor");
        super();
        this.a = blog0;
        this.b = v;
        this.c = z;
        this.d = z1;
        this.e = function10;
        this.f = function00;
        this.g = function01;
        String s = null;
        String s1 = blog0 == null ? null : blog0.getTitle();
        if(s1 == null) {
            s1 = "";
        }
        this.h = s1;
        String s2 = blog0 == null ? null : blog0.getTitle();
        this.i = s2 == null || p.isBlank(s2);
        if(blog0 != null) {
            s = blog0.getStatus();
        }
        this.j = !Intrinsics.areEqual(s, "open");
    }

    public MainUiState(Blog blog0, long v, boolean z, boolean z1, Function1 function10, Function0 function00, Function0 function01, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v1 & 1) == 0 ? blog0 : null), ((v1 & 2) == 0 ? v : 0L), ((v1 & 4) == 0 ? z : false), ((v1 & 8) == 0 ? z1 : false), function10, function00, function01);
    }

    @Nullable
    public final Blog component1() {
        return this.a;
    }

    public final long component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    @NotNull
    public final Function1 component5() {
        return this.e;
    }

    @NotNull
    public final Function0 component6() {
        return this.f;
    }

    @NotNull
    public final Function0 component7() {
        return this.g;
    }

    @NotNull
    public final MainUiState copy(@Nullable Blog blog0, long v, boolean z, boolean z1, @NotNull Function1 function10, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(function10, "onNewIntent");
        Intrinsics.checkNotNullParameter(function00, "onBackPressedInHome");
        Intrinsics.checkNotNullParameter(function01, "onNavigateToEditor");
        return new MainUiState(blog0, v, z, z1, function10, function00, function01);
    }

    public static MainUiState copy$default(MainUiState mainUiState0, Blog blog0, long v, boolean z, boolean z1, Function1 function10, Function0 function00, Function0 function01, int v1, Object object0) {
        Blog blog1 = (v1 & 1) == 0 ? blog0 : mainUiState0.a;
        long v2 = (v1 & 2) == 0 ? v : mainUiState0.b;
        boolean z2 = (v1 & 4) == 0 ? z : mainUiState0.c;
        boolean z3 = (v1 & 8) == 0 ? z1 : mainUiState0.d;
        Function1 function11 = (v1 & 16) == 0 ? function10 : mainUiState0.e;
        Function0 function02 = (v1 & 0x20) == 0 ? function00 : mainUiState0.f;
        return (v1 & 0x40) == 0 ? mainUiState0.copy(blog1, v2, z2, z3, function11, function02, function01) : mainUiState0.copy(blog1, v2, z2, z3, function11, function02, mainUiState0.g);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MainUiState)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((MainUiState)object0).a)) {
            return false;
        }
        if(this.b != ((MainUiState)object0).b) {
            return false;
        }
        if(this.c != ((MainUiState)object0).c) {
            return false;
        }
        if(this.d != ((MainUiState)object0).d) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((MainUiState)object0).e)) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((MainUiState)object0).f) ? Intrinsics.areEqual(this.g, ((MainUiState)object0).g) : false;
    }

    @NotNull
    public final String getBlogTitle() {
        return this.h;
    }

    @Nullable
    public final Blog getCurrentBlog() {
        return this.a;
    }

    public final boolean getHasRedirection() {
        return this.d;
    }

    public final long getNotificationCount() {
        return this.b;
    }

    @NotNull
    public final Function0 getOnBackPressedInHome() {
        return this.f;
    }

    @NotNull
    public final Function0 getOnNavigateToEditor() {
        return this.g;
    }

    @NotNull
    public final Function1 getOnNewIntent() {
        return this.e;
    }

    public final boolean getShowBackPressedSnackBar() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.a == null ? this.g.hashCode() + a.a(this.f, b.a(this.e, c.a(this.d, c.a(this.c, wb.a.k(this.b, 0, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F) : this.g.hashCode() + a.a(this.f, b.a(this.e, c.a(this.d, c.a(this.c, wb.a.k(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    public final boolean isBlogLess() {
        return this.i;
    }

    public final boolean isBlogRestricted() {
        return this.j;
    }

    @Override
    @NotNull
    public String toString() {
        return "MainUiState(currentBlog=" + this.a + ", notificationCount=" + this.b + ", showBackPressedSnackBar=" + this.c + ", hasRedirection=" + this.d + ", onNewIntent=" + this.e + ", onBackPressedInHome=" + this.f + ", onNavigateToEditor=" + this.g + ")";
    }
}

