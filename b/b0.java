package b;

import a.a2;
import a.b2;
import a.c2;
import a.d2;
import a.e2;
import a.f2;
import a.y1;
import a.z1;
import a5.b;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.preview.PreviewUiState;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.a;

public final class b0 extends PreviewUiState {
    public final s a;
    public final List b;
    public final Rect c;
    public final Function1 d;
    public final boolean e;
    public final List f;
    public final int g;
    public final Function1 h;
    public final Function1 i;
    public final Function1 j;
    public final Function1 k;
    public final Function0 l;
    public final Function0 m;
    public final Function0 n;
    public final KDPhoto o;
    public final int p;

    public b0() {
        Rect rect0 = Rect.Companion.getZero();
        this(s.d, CollectionsKt__CollectionsKt.emptyList(), rect0, t.a, false, CollectionsKt__CollectionsKt.emptyList(), 0, u.a, v.a, w.a, x.a, y.a, z.a, a0.a);
    }

    public b0(s s0, List list0, Rect rect0, Function1 function10, boolean z, List list1, int v, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function0 function00, Function0 function01, Function0 function02) {
        Intrinsics.checkNotNullParameter(s0, "screen");
        Intrinsics.checkNotNullParameter(list0, "menu");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function10, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(list1, "photoList");
        Intrinsics.checkNotNullParameter(function11, "onSelectPhoto");
        Intrinsics.checkNotNullParameter(function12, "updatePhoto");
        Intrinsics.checkNotNullParameter(function13, "updateMultiplePhoto");
        Intrinsics.checkNotNullParameter(function14, "onChangeScreen");
        Intrinsics.checkNotNullParameter(function00, "onClickReset");
        Intrinsics.checkNotNullParameter(function01, "onClickConfirm");
        Intrinsics.checkNotNullParameter(function02, "onBackPressed");
        super();
        this.a = s0;
        this.b = list0;
        this.c = rect0;
        this.d = function10;
        this.e = z;
        this.f = list1;
        this.g = v;
        this.h = function11;
        this.i = function12;
        this.j = function13;
        this.k = function14;
        this.l = function00;
        this.m = function01;
        this.n = function02;
        KDPhoto kDPhoto0 = (KDPhoto)CollectionsKt___CollectionsKt.getOrNull(list1, v);
        if(kDPhoto0 == null) {
            kDPhoto0 = KDPhoto.Companion.getEmpty();
        }
        this.o = kDPhoto0;
        this.p = list1.size();
    }

    public static b0 a(b0 b00, s s0, List list0, Rect rect0, y1 y10, boolean z, List list1, int v, z1 z10, a2 a20, b2 b20, c2 c20, d2 d20, e2 e20, f2 f20, int v1) {
        s s1 = (v1 & 1) == 0 ? s0 : b00.a;
        List list2 = (v1 & 2) == 0 ? list0 : b00.b;
        Rect rect1 = (v1 & 4) == 0 ? rect0 : b00.c;
        Function1 function10 = (v1 & 8) == 0 ? y10 : b00.d;
        boolean z1 = (v1 & 16) == 0 ? z : b00.e;
        List list3 = (v1 & 0x20) == 0 ? list1 : b00.f;
        int v2 = (v1 & 0x40) == 0 ? v : b00.g;
        Function1 function11 = (v1 & 0x80) == 0 ? z10 : b00.h;
        Function1 function12 = (v1 & 0x100) == 0 ? a20 : b00.i;
        Function1 function13 = (v1 & 0x200) == 0 ? b20 : b00.j;
        Function1 function14 = (v1 & 0x400) == 0 ? c20 : b00.k;
        Function0 function00 = (v1 & 0x800) == 0 ? d20 : b00.l;
        Function0 function01 = (v1 & 0x1000) == 0 ? e20 : b00.m;
        Function0 function02 = (v1 & 0x2000) == 0 ? f20 : b00.n;
        b00.getClass();
        Intrinsics.checkNotNullParameter(s1, "screen");
        Intrinsics.checkNotNullParameter(list2, "menu");
        Intrinsics.checkNotNullParameter(rect1, "contentBounds");
        Intrinsics.checkNotNullParameter(function10, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(list3, "photoList");
        Intrinsics.checkNotNullParameter(function11, "onSelectPhoto");
        Intrinsics.checkNotNullParameter(function12, "updatePhoto");
        Intrinsics.checkNotNullParameter(function13, "updateMultiplePhoto");
        Intrinsics.checkNotNullParameter(function14, "onChangeScreen");
        Intrinsics.checkNotNullParameter(function00, "onClickReset");
        Intrinsics.checkNotNullParameter(function01, "onClickConfirm");
        Intrinsics.checkNotNullParameter(function02, "onBackPressed");
        return new b0(s1, list2, rect1, function10, z1, list3, v2, function11, function12, function13, function14, function00, function01, function02);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b0)) {
            return false;
        }
        if(this.a != ((b0)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((b0)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((b0)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((b0)object0).d)) {
            return false;
        }
        if(this.e != ((b0)object0).e) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((b0)object0).f)) {
            return false;
        }
        if(this.g != ((b0)object0).g) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((b0)object0).h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((b0)object0).i)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.j, ((b0)object0).j)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, ((b0)object0).k)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.l, ((b0)object0).l)) {
            return false;
        }
        return Intrinsics.areEqual(this.m, ((b0)object0).m) ? Intrinsics.areEqual(this.n, ((b0)object0).n) : false;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    public final Rect getContentBounds() {
        return this.c;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    public final KDPhoto getPhoto() {
        return this.o;
    }

    @Override
    public final int hashCode() {
        return this.n.hashCode() + a.g(this.m, a.g(this.l, a.d(a.d(a.d(a.d(a.c(this.g, b.c(this.f, a.e(a.d((this.c.hashCode() + b.c(this.b, this.a.hashCode() * 0x1F, 0x1F)) * 0x1F, 0x1F, this.d), 0x1F, this.e), 0x1F), 0x1F), 0x1F, this.h), 0x1F, this.i), 0x1F, this.j), 0x1F, this.k), 0x1F), 0x1F);
    }

    @Override
    public final String toString() {
        return "KandinskyUiState(screen=" + this.a + ", menu=" + this.b + ", contentBounds=" + this.c + ", onChangedContentBounds=" + this.d + ", isLoading=" + this.e + ", photoList=" + this.f + ", selectedIndex=" + this.g + ", onSelectPhoto=" + this.h + ", updatePhoto=" + this.i + ", updateMultiplePhoto=" + this.j + ", onChangeScreen=" + this.k + ", onClickReset=" + this.l + ", onClickConfirm=" + this.m + ", onBackPressed=" + this.n + ")";
    }
}

