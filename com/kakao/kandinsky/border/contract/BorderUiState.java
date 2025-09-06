package com.kakao.kandinsky.border.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.border.R.drawable;
import com.kakao.kandinsky.core.kdphoto.Border;
import com.kakao.kandinsky.core.kdphoto.Decoration;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.preview.PreviewUiState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u9.a;
import u9.b;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001B\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0001HB{\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\b0\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0015\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001C\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0016\u0010!\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u001C\u0010#\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0007H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\u001EJ\u0016\u0010$\u001A\b\u0012\u0004\u0012\u00020\b0\u0010H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0084\u0001\u0010&\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0014\b\u0002\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000B\u001A\u00020\n2\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u00072\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\b0\u0010H\u00C6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010)\u001A\u00020(H\u00D6\u0001\u00A2\u0006\u0004\b)\u0010*J\u0010\u0010,\u001A\u00020+H\u00D6\u0001\u00A2\u0006\u0004\b,\u0010-J\u001A\u00100\u001A\u00020\n2\b\u0010/\u001A\u0004\u0018\u00010.H\u00D6\u0003\u00A2\u0006\u0004\b0\u00101R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u001AR\u001A\u0010\u0006\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010\u001CR#\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010\u001ER\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b\u000B\u0010 R\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f8\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010\"R#\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u00078\u0006\u00A2\u0006\f\n\u0004\b@\u00109\u001A\u0004\bA\u0010\u001ER\u001D\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\b0\u00108\u0006\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010%R\u0017\u0010G\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\bE\u0010<\u001A\u0004\bF\u0010 \u00A8\u0006I"}, d2 = {"Lcom/kakao/kandinsky/border/contract/BorderUiState;", "Lcom/kakao/kandinsky/preview/PreviewUiState;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "savedPhoto", "Landroidx/compose/ui/geometry/Rect;", "contentBounds", "Lkotlin/Function1;", "", "onChangedContentBounds", "", "isSingleImage", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/kakao/kandinsky/core/kdphoto/Border;", "borderList", "onSelectBorder", "Lkotlin/Function0;", "onClickCancel", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;ZLkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lcom/kakao/kandinsky/core/kdphoto/Decoration;", "decoration", "Lcom/kakao/kandinsky/decoration/DecorationStatus;", "getDecorationStatus", "(Lcom/kakao/kandinsky/core/kdphoto/Decoration;)Lcom/kakao/kandinsky/decoration/DecorationStatus;", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "component3", "()Landroidx/compose/ui/geometry/Rect;", "component4", "()Lkotlin/jvm/functions/Function1;", "component5", "()Z", "component6", "()Lkotlinx/collections/immutable/ImmutableList;", "component7", "component8", "()Lkotlin/jvm/functions/Function0;", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;ZLkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/kakao/kandinsky/border/contract/BorderUiState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "s", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "u", "Landroidx/compose/ui/geometry/Rect;", "getContentBounds", "v", "Lkotlin/jvm/functions/Function1;", "getOnChangedContentBounds", "w", "Z", "x", "Lkotlinx/collections/immutable/ImmutableList;", "getBorderList", "y", "getOnSelectBorder", "z", "Lkotlin/jvm/functions/Function0;", "getOnClickCancel", "A", "getChanged", "changed", "Companion", "border_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BorderUiState extends PreviewUiState {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/border/contract/BorderUiState$Companion;", "", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/kakao/kandinsky/core/kdphoto/Border;", "BORDER_LIST", "Lkotlinx/collections/immutable/PersistentList;", "border_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    public final boolean A;
    public static final PersistentList B;
    @NotNull
    public static final Companion Companion;
    public final KDPhoto s;
    public final KDPhoto t;
    public final Rect u;
    public final Function1 v;
    public final boolean w;
    public final ImmutableList x;
    public final Function1 y;
    public final Function0 z;

    static {
        BorderUiState.Companion = new Companion(null);
        BorderUiState.B = ExtensionsKt.persistentListOf(new Border[]{new Border(1, drawable.frame1_t_l, drawable.frame1_t, drawable.frame1_t_r, drawable.frame1_l, drawable.frame1_r, drawable.frame1_b_l, drawable.frame1_b, drawable.frame1_b_r), new Border(2, drawable.frame2_t_l, drawable.frame2_t, drawable.frame2_t_r, drawable.frame2_l, drawable.frame2_r, drawable.frame2_b_l, drawable.frame2_b, drawable.frame2_b_r), new Border(3, drawable.frame3_t_l, drawable.frame3_t, drawable.frame3_t_r, drawable.frame3_l, drawable.frame3_r, drawable.frame3_b_l, drawable.frame3_b, drawable.frame3_b_r), new Border(4, drawable.frame4_t_l, drawable.frame4_t, drawable.frame4_t_r, drawable.frame4_l, drawable.frame4_r, drawable.frame4_b_l, drawable.frame4_b, drawable.frame4_b_r), new Border(5, drawable.frame5_t_l, drawable.frame5_t, drawable.frame5_t_r, drawable.frame5_l, drawable.frame5_r, drawable.frame5_b_l, drawable.frame5_b, drawable.frame5_b_r), new Border(6, drawable.frame6_t_l, drawable.frame6_t, drawable.frame6_t_r, drawable.frame6_l, drawable.frame6_r, drawable.frame6_b_l, drawable.frame6_b, drawable.frame6_b_r), new Border(7, drawable.frame7_t_l, drawable.frame7_t, drawable.frame7_t_r, drawable.frame7_l, drawable.frame7_r, drawable.frame7_b_l, drawable.frame7_b, drawable.frame7_b_r), new Border(8, drawable.frame8_t_l, drawable.frame8_t, drawable.frame8_t_r, drawable.frame8_l, drawable.frame8_r, drawable.frame8_b_l, drawable.frame8_b, drawable.frame8_b_r)});
    }

    public BorderUiState() {
        this(null, null, null, null, false, null, null, null, 0xFF, null);
    }

    public BorderUiState(@NotNull KDPhoto kDPhoto0, @NotNull KDPhoto kDPhoto1, @NotNull Rect rect0, @NotNull Function1 function10, boolean z, @NotNull ImmutableList immutableList0, @NotNull Function1 function11, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function10, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(immutableList0, "borderList");
        Intrinsics.checkNotNullParameter(function11, "onSelectBorder");
        Intrinsics.checkNotNullParameter(function00, "onClickCancel");
        super();
        this.s = kDPhoto0;
        this.t = kDPhoto1;
        this.u = rect0;
        this.v = function10;
        this.w = z;
        this.x = immutableList0;
        this.y = function11;
        this.z = function00;
        this.A = !Intrinsics.areEqual(this.getPhoto(), kDPhoto1);
    }

    public BorderUiState(KDPhoto kDPhoto0, KDPhoto kDPhoto1, Rect rect0, Function1 function10, boolean z, ImmutableList immutableList0, Function1 function11, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        KDPhoto kDPhoto2 = (v & 1) == 0 ? kDPhoto0 : KDPhoto.Companion.getEmpty();
        KDPhoto kDPhoto3 = (v & 2) == 0 ? kDPhoto1 : KDPhoto.Companion.getEmpty();
        Rect rect1 = (v & 4) == 0 ? rect0 : Rect.Companion.getZero();
        Function1 function12 = (v & 8) == 0 ? function10 : a.x;
        ImmutableList immutableList1 = (v & 0x20) == 0 ? immutableList0 : BorderUiState.B;
        Function1 function13 = (v & 0x40) == 0 ? function11 : a.y;
        Function0 function01 = (v & 0x80) == 0 ? function00 : b.w;
        this(kDPhoto2, kDPhoto3, rect1, function12, ((v & 16) == 0 ? z : true), immutableList1, function13, function01);
    }

    @NotNull
    public final KDPhoto component1() {
        return this.s;
    }

    @NotNull
    public final Rect component3() {
        return this.u;
    }

    @NotNull
    public final Function1 component4() {
        return this.v;
    }

    public final boolean component5() {
        return this.w;
    }

    @NotNull
    public final ImmutableList component6() {
        return this.x;
    }

    @NotNull
    public final Function1 component7() {
        return this.y;
    }

    @NotNull
    public final Function0 component8() {
        return this.z;
    }

    @NotNull
    public final BorderUiState copy(@NotNull KDPhoto kDPhoto0, @NotNull KDPhoto kDPhoto1, @NotNull Rect rect0, @NotNull Function1 function10, boolean z, @NotNull ImmutableList immutableList0, @NotNull Function1 function11, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function10, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(immutableList0, "borderList");
        Intrinsics.checkNotNullParameter(function11, "onSelectBorder");
        Intrinsics.checkNotNullParameter(function00, "onClickCancel");
        return new BorderUiState(kDPhoto0, kDPhoto1, rect0, function10, z, immutableList0, function11, function00);
    }

    public static BorderUiState copy$default(BorderUiState borderUiState0, KDPhoto kDPhoto0, KDPhoto kDPhoto1, Rect rect0, Function1 function10, boolean z, ImmutableList immutableList0, Function1 function11, Function0 function00, int v, Object object0) {
        KDPhoto kDPhoto2 = (v & 1) == 0 ? kDPhoto0 : borderUiState0.s;
        KDPhoto kDPhoto3 = (v & 2) == 0 ? kDPhoto1 : borderUiState0.t;
        Rect rect1 = (v & 4) == 0 ? rect0 : borderUiState0.u;
        Function1 function12 = (v & 8) == 0 ? function10 : borderUiState0.v;
        boolean z1 = (v & 16) == 0 ? z : borderUiState0.w;
        ImmutableList immutableList1 = (v & 0x20) == 0 ? immutableList0 : borderUiState0.x;
        Function1 function13 = (v & 0x40) == 0 ? function11 : borderUiState0.y;
        return (v & 0x80) == 0 ? borderUiState0.copy(kDPhoto2, kDPhoto3, rect1, function12, z1, immutableList1, function13, function00) : borderUiState0.copy(kDPhoto2, kDPhoto3, rect1, function12, z1, immutableList1, function13, borderUiState0.z);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BorderUiState)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.s, ((BorderUiState)object0).s)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.t, ((BorderUiState)object0).t)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.u, ((BorderUiState)object0).u)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.v, ((BorderUiState)object0).v)) {
            return false;
        }
        if(this.w != ((BorderUiState)object0).w) {
            return false;
        }
        if(!Intrinsics.areEqual(this.x, ((BorderUiState)object0).x)) {
            return false;
        }
        return Intrinsics.areEqual(this.y, ((BorderUiState)object0).y) ? Intrinsics.areEqual(this.z, ((BorderUiState)object0).z) : false;
    }

    @NotNull
    public final ImmutableList getBorderList() {
        return this.x;
    }

    public final boolean getChanged() {
        return this.A;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public Rect getContentBounds() {
        return this.u;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public DecorationStatus getDecorationStatus(@NotNull Decoration decoration0) {
        Intrinsics.checkNotNullParameter(decoration0, "decoration");
        return decoration0 instanceof Border ? DecorationStatus.Enabled : DecorationStatus.Disabled;
    }

    @NotNull
    public final Function1 getOnChangedContentBounds() {
        return this.v;
    }

    @NotNull
    public final Function0 getOnClickCancel() {
        return this.z;
    }

    @NotNull
    public final Function1 getOnSelectBorder() {
        return this.y;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public KDPhoto getPhoto() {
        return this.s;
    }

    @Override
    public int hashCode() {
        return this.z.hashCode() + r0.a.d((this.x.hashCode() + r0.a.e(r0.a.d((this.u.hashCode() + (this.t.hashCode() + this.s.hashCode() * 0x1F) * 0x1F) * 0x1F, 0x1F, this.v), 0x1F, this.w)) * 0x1F, 0x1F, this.y);
    }

    public final boolean isSingleImage() {
        return this.w;
    }

    @Override
    @NotNull
    public String toString() {
        return "BorderUiState(photo=" + this.s + ", savedPhoto=" + this.t + ", contentBounds=" + this.u + ", onChangedContentBounds=" + this.v + ", isSingleImage=" + this.w + ", borderList=" + this.x + ", onSelectBorder=" + this.y + ", onClickCancel=" + this.z + ")";
    }
}

