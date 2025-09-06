package com.kakao.kandinsky.resize.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.preview.PreviewUiState;
import com.kakao.kandinsky.resize.ResizeScreenType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qa.a;
import qa.b;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001A\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u00BE\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\u0014\b\u0002\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u000E\u0012\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u000E0\u0010\u0012#\b\u0002\u0010\u0015\u001A\u001D\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\t\u0012\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\n0\u0016\u0012\u000E\b\u0002\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\n0\u0016\u0012\u000E\b\u0002\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\n0\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J\u001C\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J\u0016\u0010(\u001A\b\u0012\u0004\u0012\u00020\u000E0\u0010H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010)J+\u0010*\u001A\u001D\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b*\u0010#J\u0016\u0010+\u001A\b\u0012\u0004\u0012\u00020\n0\u0016H\u00C6\u0003\u00A2\u0006\u0004\b+\u0010,J\u0016\u0010-\u001A\b\u0012\u0004\u0012\u00020\n0\u0016H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010,J\u0016\u0010.\u001A\b\u0012\u0004\u0012\u00020\n0\u0016H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010,J\u00C7\u0001\u0010/\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\u0014\b\u0002\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u000E0\u00102#\b\u0002\u0010\u0015\u001A\u001D\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\t2\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\n0\u00162\u000E\b\u0002\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\n0\u00162\u000E\b\u0002\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\n0\u0016H\u00C6\u0001\u00A2\u0006\u0004\b/\u00100J\u0010\u00102\u001A\u000201H\u00D6\u0001\u00A2\u0006\u0004\b2\u00103J\u0010\u00104\u001A\u00020\u000EH\u00D6\u0001\u00A2\u0006\u0004\b4\u0010\'J\u001A\u00107\u001A\u00020\f2\b\u00106\u001A\u0004\u0018\u000105H\u00D6\u0003\u00A2\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010\u001DR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010\u001FR\u001A\u0010\b\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010!R#\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t8\u0006\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010#R\u0017\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\b\r\u0010%R\u0017\u0010\u000F\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010\'R\u001D\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u000E0\u00108\u0006\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010)R2\u0010\u0015\u001A\u001D\u0012\u0013\u0012\u00110\u000E\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\t8\u0006\u00A2\u0006\f\n\u0004\bM\u0010C\u001A\u0004\bN\u0010#R\u001D\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\n0\u00168\u0006\u00A2\u0006\f\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010,R\u001D\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\n0\u00168\u0006\u00A2\u0006\f\n\u0004\bR\u0010P\u001A\u0004\bS\u0010,R\u001D\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\n0\u00168\u0006\u00A2\u0006\f\n\u0004\bT\u0010P\u001A\u0004\bU\u0010,R\u0017\u0010X\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\bV\u0010F\u001A\u0004\bW\u0010%R\u001D\u0010^\u001A\u00020Y8\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bZ\u0010[\u001A\u0004\b\\\u0010]R\u0017\u0010a\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\b_\u0010H\u001A\u0004\b`\u0010\'\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006b"}, d2 = {"Lcom/kakao/kandinsky/resize/contract/ResizeUiState;", "Lcom/kakao/kandinsky/preview/PreviewUiState;", "Lcom/kakao/kandinsky/resize/ResizeScreenType;", "screenType", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "savedPhoto", "Landroidx/compose/ui/geometry/Rect;", "contentBounds", "Lkotlin/Function1;", "", "updateContentBounds", "", "isSingleImage", "", "minSize", "Lkotlinx/collections/immutable/ImmutableList;", "fixedWidthList", "Lkotlin/ParameterName;", "name", "width", "onChangeWidth", "Lkotlin/Function0;", "onClickOriginalSize", "onClickCustomInput", "onBackPressed", "<init>", "(Lcom/kakao/kandinsky/resize/ResizeScreenType;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;ZILkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lcom/kakao/kandinsky/resize/ResizeScreenType;", "component2", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "component4", "()Landroidx/compose/ui/geometry/Rect;", "component5", "()Lkotlin/jvm/functions/Function1;", "component6", "()Z", "component7", "()I", "component8", "()Lkotlinx/collections/immutable/ImmutableList;", "component9", "component10", "()Lkotlin/jvm/functions/Function0;", "component11", "component12", "copy", "(Lcom/kakao/kandinsky/resize/ResizeScreenType;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;ZILkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/kakao/kandinsky/resize/contract/ResizeUiState;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "s", "Lcom/kakao/kandinsky/resize/ResizeScreenType;", "getScreenType", "t", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "v", "Landroidx/compose/ui/geometry/Rect;", "getContentBounds", "w", "Lkotlin/jvm/functions/Function1;", "getUpdateContentBounds", "x", "Z", "y", "I", "getMinSize", "z", "Lkotlinx/collections/immutable/ImmutableList;", "getFixedWidthList", "A", "getOnChangeWidth", "B", "Lkotlin/jvm/functions/Function0;", "getOnClickOriginalSize", "C", "getOnClickCustomInput", "D", "getOnBackPressed", "E", "getChanged", "changed", "Landroidx/compose/ui/unit/IntSize;", "F", "J", "getOriginalSize-YbymL2g", "()J", "originalSize", "G", "getModifiedWidth", "modifiedWidth", "resize_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ResizeUiState extends PreviewUiState {
    public static final int $stable;
    public final Function1 A;
    public final Function0 B;
    public final Function0 C;
    public final Function0 D;
    public final boolean E;
    public final long F;
    public final int G;
    public final ResizeScreenType s;
    public final KDPhoto t;
    public final KDPhoto u;
    public final Rect v;
    public final Function1 w;
    public final boolean x;
    public final int y;
    public final ImmutableList z;

    public ResizeUiState() {
        this(null, null, null, null, null, false, 0, null, null, null, null, null, 0xFFF, null);
    }

    public ResizeUiState(@NotNull ResizeScreenType resizeScreenType0, @NotNull KDPhoto kDPhoto0, @NotNull KDPhoto kDPhoto1, @NotNull Rect rect0, @NotNull Function1 function10, boolean z, int v, @NotNull ImmutableList immutableList0, @NotNull Function1 function11, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02) {
        Intrinsics.checkNotNullParameter(resizeScreenType0, "screenType");
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function10, "updateContentBounds");
        Intrinsics.checkNotNullParameter(immutableList0, "fixedWidthList");
        Intrinsics.checkNotNullParameter(function11, "onChangeWidth");
        Intrinsics.checkNotNullParameter(function00, "onClickOriginalSize");
        Intrinsics.checkNotNullParameter(function01, "onClickCustomInput");
        Intrinsics.checkNotNullParameter(function02, "onBackPressed");
        super();
        this.s = resizeScreenType0;
        this.t = kDPhoto0;
        this.u = kDPhoto1;
        this.v = rect0;
        this.w = function10;
        this.x = z;
        this.y = v;
        this.z = immutableList0;
        this.A = function11;
        this.B = function00;
        this.C = function01;
        this.D = function02;
        this.E = !Intrinsics.areEqual(this.getPhoto(), kDPhoto1);
        this.F = this.getPhoto().getCropIntSize-YbymL2g();
        this.G = this.getPhoto().getRequireWidth();
    }

    public ResizeUiState(ResizeScreenType resizeScreenType0, KDPhoto kDPhoto0, KDPhoto kDPhoto1, Rect rect0, Function1 function10, boolean z, int v, ImmutableList immutableList0, Function1 function11, Function0 function00, Function0 function01, Function0 function02, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        ResizeScreenType resizeScreenType1 = (v1 & 1) == 0 ? resizeScreenType0 : ResizeScreenType.Default;
        KDPhoto kDPhoto2 = (v1 & 2) == 0 ? kDPhoto0 : KDPhoto.Companion.getEmpty();
        KDPhoto kDPhoto3 = (v1 & 4) == 0 ? kDPhoto1 : KDPhoto.Companion.getEmpty();
        Rect rect1 = (v1 & 8) == 0 ? rect0 : Rect.Companion.getZero();
        Function1 function12 = (v1 & 16) == 0 ? function10 : a.x;
        ImmutableList immutableList1 = (v1 & 0x80) == 0 ? immutableList0 : ExtensionsKt.persistentListOf();
        Function1 function13 = (v1 & 0x100) == 0 ? function11 : a.y;
        Function0 function03 = (v1 & 0x200) == 0 ? function00 : b.x;
        Function0 function04 = (v1 & 0x400) == 0 ? function01 : b.y;
        Function0 function05 = (v1 & 0x800) == 0 ? function02 : b.z;
        this(resizeScreenType1, kDPhoto2, kDPhoto3, rect1, function12, ((v1 & 0x20) == 0 ? z : false), ((v1 & 0x40) == 0 ? v : 0), immutableList1, function13, function03, function04, function05);
    }

    @NotNull
    public final ResizeScreenType component1() {
        return this.s;
    }

    @NotNull
    public final Function0 component10() {
        return this.B;
    }

    @NotNull
    public final Function0 component11() {
        return this.C;
    }

    @NotNull
    public final Function0 component12() {
        return this.D;
    }

    @NotNull
    public final KDPhoto component2() {
        return this.t;
    }

    @NotNull
    public final Rect component4() {
        return this.v;
    }

    @NotNull
    public final Function1 component5() {
        return this.w;
    }

    public final boolean component6() {
        return this.x;
    }

    public final int component7() {
        return this.y;
    }

    @NotNull
    public final ImmutableList component8() {
        return this.z;
    }

    @NotNull
    public final Function1 component9() {
        return this.A;
    }

    @NotNull
    public final ResizeUiState copy(@NotNull ResizeScreenType resizeScreenType0, @NotNull KDPhoto kDPhoto0, @NotNull KDPhoto kDPhoto1, @NotNull Rect rect0, @NotNull Function1 function10, boolean z, int v, @NotNull ImmutableList immutableList0, @NotNull Function1 function11, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02) {
        Intrinsics.checkNotNullParameter(resizeScreenType0, "screenType");
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function10, "updateContentBounds");
        Intrinsics.checkNotNullParameter(immutableList0, "fixedWidthList");
        Intrinsics.checkNotNullParameter(function11, "onChangeWidth");
        Intrinsics.checkNotNullParameter(function00, "onClickOriginalSize");
        Intrinsics.checkNotNullParameter(function01, "onClickCustomInput");
        Intrinsics.checkNotNullParameter(function02, "onBackPressed");
        return new ResizeUiState(resizeScreenType0, kDPhoto0, kDPhoto1, rect0, function10, z, v, immutableList0, function11, function00, function01, function02);
    }

    public static ResizeUiState copy$default(ResizeUiState resizeUiState0, ResizeScreenType resizeScreenType0, KDPhoto kDPhoto0, KDPhoto kDPhoto1, Rect rect0, Function1 function10, boolean z, int v, ImmutableList immutableList0, Function1 function11, Function0 function00, Function0 function01, Function0 function02, int v1, Object object0) {
        ResizeScreenType resizeScreenType1 = (v1 & 1) == 0 ? resizeScreenType0 : resizeUiState0.s;
        KDPhoto kDPhoto2 = (v1 & 2) == 0 ? kDPhoto0 : resizeUiState0.t;
        KDPhoto kDPhoto3 = (v1 & 4) == 0 ? kDPhoto1 : resizeUiState0.u;
        Rect rect1 = (v1 & 8) == 0 ? rect0 : resizeUiState0.v;
        Function1 function12 = (v1 & 16) == 0 ? function10 : resizeUiState0.w;
        boolean z1 = (v1 & 0x20) == 0 ? z : resizeUiState0.x;
        int v2 = (v1 & 0x40) == 0 ? v : resizeUiState0.y;
        ImmutableList immutableList1 = (v1 & 0x80) == 0 ? immutableList0 : resizeUiState0.z;
        Function1 function13 = (v1 & 0x100) == 0 ? function11 : resizeUiState0.A;
        Function0 function03 = (v1 & 0x200) == 0 ? function00 : resizeUiState0.B;
        Function0 function04 = (v1 & 0x400) == 0 ? function01 : resizeUiState0.C;
        return (v1 & 0x800) == 0 ? resizeUiState0.copy(resizeScreenType1, kDPhoto2, kDPhoto3, rect1, function12, z1, v2, immutableList1, function13, function03, function04, function02) : resizeUiState0.copy(resizeScreenType1, kDPhoto2, kDPhoto3, rect1, function12, z1, v2, immutableList1, function13, function03, function04, resizeUiState0.D);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ResizeUiState)) {
            return false;
        }
        if(this.s != ((ResizeUiState)object0).s) {
            return false;
        }
        if(!Intrinsics.areEqual(this.t, ((ResizeUiState)object0).t)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.u, ((ResizeUiState)object0).u)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.v, ((ResizeUiState)object0).v)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.w, ((ResizeUiState)object0).w)) {
            return false;
        }
        if(this.x != ((ResizeUiState)object0).x) {
            return false;
        }
        if(this.y != ((ResizeUiState)object0).y) {
            return false;
        }
        if(!Intrinsics.areEqual(this.z, ((ResizeUiState)object0).z)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.A, ((ResizeUiState)object0).A)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.B, ((ResizeUiState)object0).B)) {
            return false;
        }
        return Intrinsics.areEqual(this.C, ((ResizeUiState)object0).C) ? Intrinsics.areEqual(this.D, ((ResizeUiState)object0).D) : false;
    }

    public final boolean getChanged() {
        return this.E;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public Rect getContentBounds() {
        return this.v;
    }

    @NotNull
    public final ImmutableList getFixedWidthList() {
        return this.z;
    }

    public final int getMinSize() {
        return this.y;
    }

    public final int getModifiedWidth() {
        return this.G;
    }

    @NotNull
    public final Function0 getOnBackPressed() {
        return this.D;
    }

    @NotNull
    public final Function1 getOnChangeWidth() {
        return this.A;
    }

    @NotNull
    public final Function0 getOnClickCustomInput() {
        return this.C;
    }

    @NotNull
    public final Function0 getOnClickOriginalSize() {
        return this.B;
    }

    public final long getOriginalSize-YbymL2g() {
        return this.F;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public KDPhoto getPhoto() {
        return this.t;
    }

    @NotNull
    public final ResizeScreenType getScreenType() {
        return this.s;
    }

    @NotNull
    public final Function1 getUpdateContentBounds() {
        return this.w;
    }

    @Override
    public int hashCode() {
        return this.D.hashCode() + r0.a.g(this.C, r0.a.g(this.B, r0.a.d((this.z.hashCode() + r0.a.c(this.y, r0.a.e(r0.a.d((this.v.hashCode() + (this.u.hashCode() + (this.t.hashCode() + this.s.hashCode() * 0x1F) * 0x1F) * 0x1F) * 0x1F, 0x1F, this.w), 0x1F, this.x), 0x1F)) * 0x1F, 0x1F, this.A), 0x1F), 0x1F);
    }

    public final boolean isSingleImage() {
        return this.x;
    }

    @Override
    @NotNull
    public String toString() {
        return "ResizeUiState(screenType=" + this.s + ", photo=" + this.t + ", savedPhoto=" + this.u + ", contentBounds=" + this.v + ", updateContentBounds=" + this.w + ", isSingleImage=" + this.x + ", minSize=" + this.y + ", fixedWidthList=" + this.z + ", onChangeWidth=" + this.A + ", onClickOriginalSize=" + this.B + ", onClickCustomInput=" + this.C + ", onBackPressed=" + this.D + ")";
    }
}

