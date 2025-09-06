package com.kakao.tistory.presentation.screen.blog.navigation;

import androidx.compose.runtime.Immutable;
import com.kakao.tistory.presentation.ActivityNavigator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\'\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005R2\u0010\u0010\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u00068\u0006\u00A2\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FRG\u0010\u0018\u001A2\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000B0\u00118\u0006\u00A2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\\\u0010\u001F\u001AG\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u001A\u0012\u0004\u0012\u00020\u000B0\u00198\u0006\u00A2\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ERG\u0010\"\u001A2\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0012\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000B0\u00118\u0006\u00A2\u0006\f\n\u0004\b \u0010\u0015\u001A\u0004\b!\u0010\u0017R2\u0010%\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u00068\u0006\u00A2\u0006\f\n\u0004\b#\u0010\r\u001A\u0004\b$\u0010\u000FR2\u0010(\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u00068\u0006\u00A2\u0006\f\n\u0004\b&\u0010\r\u001A\u0004\b\'\u0010\u000FRG\u0010-\u001A2\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110)\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u000B0\u00118\u0006\u00A2\u0006\f\n\u0004\b+\u0010\u0015\u001A\u0004\b,\u0010\u0017R2\u00102\u001A\u001D\u0012\u0013\u0012\u00110.\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u000B0\u00068\u0006\u00A2\u0006\f\n\u0004\b0\u0010\r\u001A\u0004\b1\u0010\u000FR2\u00105\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u00068\u0006\u00A2\u0006\f\n\u0004\b3\u0010\r\u001A\u0004\b4\u0010\u000FR2\u00108\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u00068\u0006\u00A2\u0006\f\n\u0004\b6\u0010\r\u001A\u0004\b7\u0010\u000FR)\u0010=\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09\u0012\u0004\u0012\u00020\u000B0\u00068\u0006\u00A2\u0006\f\n\u0004\b;\u0010\r\u001A\u0004\b<\u0010\u000FR2\u0010A\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\u000B0\u00068\u0006\u00A2\u0006\f\n\u0004\b?\u0010\r\u001A\u0004\b@\u0010\u000FR2\u0010E\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020\u000B0\u00068\u0006\u00A2\u0006\f\n\u0004\bC\u0010\r\u001A\u0004\bD\u0010\u000FRG\u0010I\u001A2\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020\u000B0\u00118\u0006\u00A2\u0006\f\n\u0004\bG\u0010\u0015\u001A\u0004\bH\u0010\u0017R2\u0010L\u001A\u001D\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000B0\u00068\u0006\u00A2\u0006\f\n\u0004\bJ\u0010\r\u001A\u0004\bK\u0010\u000FR\u001A\u0010P\u001A\b\u0012\u0004\u0012\u00020\u000B0M8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bN\u0010OR\u001A\u0010R\u001A\b\u0012\u0004\u0012\u00020\u000B0M8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bQ\u0010O\u00A8\u0006S"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/navigation/NavActions;", "", "Lcom/kakao/tistory/presentation/ActivityNavigator;", "navigator", "<init>", "(Lcom/kakao/tistory/presentation/ActivityNavigator;)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "blogName", "", "a", "Lkotlin/jvm/functions/Function1;", "getGoBlog", "()Lkotlin/jvm/functions/Function1;", "goBlog", "Lkotlin/Function2;", "", "entryId", "b", "Lkotlin/jvm/functions/Function2;", "getGoEntry", "()Lkotlin/jvm/functions/Function2;", "goEntry", "Lkotlin/Function3;", "title", "c", "Lkotlin/jvm/functions/Function3;", "getGoEntryStatistics", "()Lkotlin/jvm/functions/Function3;", "goEntryStatistics", "d", "getGoEntryEditor", "goEntryEditor", "e", "getGoFollowerList", "goFollowerList", "f", "getGoFollowingList", "goFollowingList", "", "isMine", "g", "getGoTopEntryList", "goTopEntryList", "Lcom/kakao/tistory/presentation/screen/item/GuestbookExtra;", "guestbookExtra", "h", "getGoGuestbook", "goGuestbook", "i", "getGoTrend", "goTrend", "j", "getGoRefererLog", "goRefererLog", "", "Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "k", "getGoRefererKeyword", "goRefererKeyword", "url", "l", "getGoWeb", "goWeb", "link", "m", "getGoStoryCreator", "goStoryCreator", "subject", "n", "getGoShare", "goShare", "o", "getGoSearch", "goSearch", "Lkotlin/Function0;", "getShowBlogSwitchBottomSheet", "()Lkotlin/jvm/functions/Function0;", "showBlogSwitchBottomSheet", "getFinish", "finish", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class NavActions {
    public static final int $stable;
    public final k a;
    public final l b;
    public final n c;
    public final m d;
    public final o e;
    public final p f;
    public final w g;
    public final q h;
    public final x i;
    public final s j;
    public final r k;
    public final y l;
    public final v m;
    public final u n;
    public final t o;

    public NavActions(@NotNull ActivityNavigator activityNavigator0) {
        Intrinsics.checkNotNullParameter(activityNavigator0, "navigator");
        super();
        this.a = new k(activityNavigator0);
        this.b = new l(activityNavigator0);
        this.c = new n(activityNavigator0);
        this.d = new m(activityNavigator0);
        this.e = new o(activityNavigator0);
        this.f = new p(activityNavigator0);
        this.g = new w(activityNavigator0);
        this.h = new q(activityNavigator0);
        this.i = new x(activityNavigator0);
        this.j = new s(activityNavigator0);
        this.k = new r(activityNavigator0);
        this.l = new y(activityNavigator0);
        this.m = new v(activityNavigator0);
        this.n = new u(activityNavigator0);
        this.o = new t(activityNavigator0);
    }

    @NotNull
    public abstract Function0 getFinish();

    @NotNull
    public final Function1 getGoBlog() {
        return this.a;
    }

    @NotNull
    public final Function2 getGoEntry() {
        return this.b;
    }

    @NotNull
    public final Function2 getGoEntryEditor() {
        return this.d;
    }

    @NotNull
    public final Function3 getGoEntryStatistics() {
        return this.c;
    }

    @NotNull
    public final Function1 getGoFollowerList() {
        return this.e;
    }

    @NotNull
    public final Function1 getGoFollowingList() {
        return this.f;
    }

    @NotNull
    public final Function1 getGoGuestbook() {
        return this.h;
    }

    @NotNull
    public final Function1 getGoRefererKeyword() {
        return this.k;
    }

    @NotNull
    public final Function1 getGoRefererLog() {
        return this.j;
    }

    @NotNull
    public final Function1 getGoSearch() {
        return this.o;
    }

    @NotNull
    public final Function2 getGoShare() {
        return this.n;
    }

    @NotNull
    public final Function1 getGoStoryCreator() {
        return this.m;
    }

    @NotNull
    public final Function2 getGoTopEntryList() {
        return this.g;
    }

    @NotNull
    public final Function1 getGoTrend() {
        return this.i;
    }

    @NotNull
    public final Function1 getGoWeb() {
        return this.l;
    }

    @NotNull
    public abstract Function0 getShowBlogSwitchBottomSheet();
}

