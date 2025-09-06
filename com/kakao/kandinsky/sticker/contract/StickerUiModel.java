package com.kakao.kandinsky.sticker.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import com.kakao.kandinsky.core.kdphoto.Decoration;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.Sticker;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.preview.PreviewUiState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xa.a;
import xa.b;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b \n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00A3\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\u0014\b\u0002\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b\u0012\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\f\u0012\u0014\b\u0002\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\t0\b\u0012\u0014\b\u0002\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\b\u0012\u000E\b\u0002\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\t0\u0012\u0012\u000E\b\u0002\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\t0\u0012\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0018\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0012\u0010\u001E\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J\u001C\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001A\b\u0012\u0004\u0012\u00020\f0\u000BH\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J\u001C\u0010(\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b(\u0010#J\u001C\u0010)\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b)\u0010#J\u0016\u0010*\u001A\b\u0012\u0004\u0012\u00020\t0\u0012H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0016\u0010,\u001A\b\u0012\u0004\u0012\u00020\t0\u0012H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010+J\u00AC\u0001\u0010-\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u0014\b\u0002\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\f2\u0014\b\u0002\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\t0\b2\u0014\b\u0002\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\b2\u000E\b\u0002\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\t0\u00122\u000E\b\u0002\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\t0\u0012H\u00C6\u0001\u00A2\u0006\u0004\b-\u0010.J\u0010\u00100\u001A\u00020/H\u00D6\u0001\u00A2\u0006\u0004\b0\u00101J\u0010\u00102\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b2\u00103J\u001A\u00107\u001A\u0002062\b\u00105\u001A\u0004\u0018\u000104H\u00D6\u0003\u00A2\u0006\u0004\b7\u00108R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010\u001DR\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010\u001FR\u001A\u0010\u0007\u001A\u00020\u00068\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010!R#\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b8\u0006\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010#R\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B8\u0006\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\bG\u0010%R\u0017\u0010\u000E\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010\'R#\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\t0\b8\u0006\u00A2\u0006\f\n\u0004\bK\u0010C\u001A\u0004\bL\u0010#R#\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\b8\u0006\u00A2\u0006\f\n\u0004\bM\u0010C\u001A\u0004\bN\u0010#R\u001D\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\t0\u00128\u0006\u00A2\u0006\f\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010+R\u001D\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\t0\u00128\u0006\u00A2\u0006\f\n\u0004\bR\u0010P\u001A\u0004\bS\u0010+R\u001D\u0010V\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000B8\u0006\u00A2\u0006\f\n\u0004\bT\u0010F\u001A\u0004\bU\u0010%R\u0017\u0010Z\u001A\b\u0012\u0004\u0012\u0002060W8F\u00A2\u0006\u0006\u001A\u0004\bX\u0010Y\u00A8\u0006["}, d2 = {"Lcom/kakao/kandinsky/sticker/contract/StickerUiModel;", "Lcom/kakao/kandinsky/preview/PreviewUiState;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "", "selectedNo", "Landroidx/compose/ui/geometry/Rect;", "contentBounds", "Lkotlin/Function1;", "", "onChangedContentBounds", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/kakao/kandinsky/sticker/contract/StickerGroup;", "groupList", "selectStickerGroup", "Lcom/kakao/kandinsky/sticker/contract/StickerItem;", "addSticker", "onSelectStickerGroup", "Lkotlin/Function0;", "onClickRemoveAll", "onFinish", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Ljava/lang/Integer;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;Lkotlinx/collections/immutable/ImmutableList;Lcom/kakao/kandinsky/sticker/contract/StickerGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lcom/kakao/kandinsky/core/kdphoto/Decoration;", "decoration", "Lcom/kakao/kandinsky/decoration/DecorationStatus;", "getDecorationStatus", "(Lcom/kakao/kandinsky/core/kdphoto/Decoration;)Lcom/kakao/kandinsky/decoration/DecorationStatus;", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "component2", "()Ljava/lang/Integer;", "component3", "()Landroidx/compose/ui/geometry/Rect;", "component4", "()Lkotlin/jvm/functions/Function1;", "component5", "()Lkotlinx/collections/immutable/ImmutableList;", "component6", "()Lcom/kakao/kandinsky/sticker/contract/StickerGroup;", "component7", "component8", "component9", "()Lkotlin/jvm/functions/Function0;", "component10", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Ljava/lang/Integer;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;Lkotlinx/collections/immutable/ImmutableList;Lcom/kakao/kandinsky/sticker/contract/StickerGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/kakao/kandinsky/sticker/contract/StickerUiModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "s", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "t", "Ljava/lang/Integer;", "getSelectedNo", "u", "Landroidx/compose/ui/geometry/Rect;", "getContentBounds", "v", "Lkotlin/jvm/functions/Function1;", "getOnChangedContentBounds", "w", "Lkotlinx/collections/immutable/ImmutableList;", "getGroupList", "x", "Lcom/kakao/kandinsky/sticker/contract/StickerGroup;", "getSelectStickerGroup", "y", "getAddSticker", "z", "getOnSelectStickerGroup", "A", "Lkotlin/jvm/functions/Function0;", "getOnClickRemoveAll", "B", "getOnFinish", "C", "getItemList", "itemList", "", "getFilter", "()Ljava/util/List;", "filter", "sticker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStickerUiModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerUiModel.kt\ncom/kakao/kandinsky/sticker/contract/StickerUiModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1549#2:37\n1620#2,3:38\n*S KotlinDebug\n*F\n+ 1 StickerUiModel.kt\ncom/kakao/kandinsky/sticker/contract/StickerUiModel\n*L\n25#1:37\n25#1:38,3\n*E\n"})
public final class StickerUiModel extends PreviewUiState {
    public static final int $stable;
    public final Function0 A;
    public final Function0 B;
    public final ImmutableList C;
    public final KDPhoto s;
    public final Integer t;
    public final Rect u;
    public final Function1 v;
    public final ImmutableList w;
    public final StickerGroup x;
    public final Function1 y;
    public final Function1 z;

    public StickerUiModel() {
        this(null, null, null, null, null, null, null, null, null, null, 0x3FF, null);
    }

    public StickerUiModel(@NotNull KDPhoto kDPhoto0, @Nullable Integer integer0, @NotNull Rect rect0, @NotNull Function1 function10, @NotNull ImmutableList immutableList0, @NotNull StickerGroup stickerGroup0, @NotNull Function1 function11, @NotNull Function1 function12, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function10, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(immutableList0, "groupList");
        Intrinsics.checkNotNullParameter(stickerGroup0, "selectStickerGroup");
        Intrinsics.checkNotNullParameter(function11, "addSticker");
        Intrinsics.checkNotNullParameter(function12, "onSelectStickerGroup");
        Intrinsics.checkNotNullParameter(function00, "onClickRemoveAll");
        Intrinsics.checkNotNullParameter(function01, "onFinish");
        super();
        this.s = kDPhoto0;
        this.t = integer0;
        this.u = rect0;
        this.v = function10;
        this.w = immutableList0;
        this.x = stickerGroup0;
        this.y = function11;
        this.z = function12;
        this.A = function00;
        this.B = function01;
        this.C = ExtensionsKt.toImmutableList(((Iterable)StickerObject.INSTANCE.getItemMap().getOrDefault(stickerGroup0.getName(), CollectionsKt__CollectionsKt.emptyList())));
    }

    public StickerUiModel(KDPhoto kDPhoto0, Integer integer0, Rect rect0, Function1 function10, ImmutableList immutableList0, StickerGroup stickerGroup0, Function1 function11, Function1 function12, Function0 function00, Function0 function01, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        KDPhoto kDPhoto1 = (v & 1) == 0 ? kDPhoto0 : KDPhoto.Companion.getEmpty();
        Rect rect1 = (v & 4) == 0 ? rect0 : Rect.Companion.getZero();
        Function1 function13 = (v & 8) == 0 ? function10 : a.x;
        ImmutableList immutableList1 = (v & 16) == 0 ? immutableList0 : StickerObject.INSTANCE.getGroupList();
        StickerGroup stickerGroup1 = (v & 0x20) == 0 ? stickerGroup0 : ((StickerGroup)CollectionsKt___CollectionsKt.first(immutableList1));
        Function1 function14 = (v & 0x40) == 0 ? function11 : a.y;
        Function1 function15 = (v & 0x80) == 0 ? function12 : a.z;
        Function0 function02 = (v & 0x100) == 0 ? function00 : b.x;
        Function0 function03 = (v & 0x200) == 0 ? function01 : b.y;
        this(kDPhoto1, ((v & 2) == 0 ? integer0 : null), rect1, function13, immutableList1, stickerGroup1, function14, function15, function02, function03);
    }

    @NotNull
    public final KDPhoto component1() {
        return this.s;
    }

    @NotNull
    public final Function0 component10() {
        return this.B;
    }

    @Nullable
    public final Integer component2() {
        return this.t;
    }

    @NotNull
    public final Rect component3() {
        return this.u;
    }

    @NotNull
    public final Function1 component4() {
        return this.v;
    }

    @NotNull
    public final ImmutableList component5() {
        return this.w;
    }

    @NotNull
    public final StickerGroup component6() {
        return this.x;
    }

    @NotNull
    public final Function1 component7() {
        return this.y;
    }

    @NotNull
    public final Function1 component8() {
        return this.z;
    }

    @NotNull
    public final Function0 component9() {
        return this.A;
    }

    @NotNull
    public final StickerUiModel copy(@NotNull KDPhoto kDPhoto0, @Nullable Integer integer0, @NotNull Rect rect0, @NotNull Function1 function10, @NotNull ImmutableList immutableList0, @NotNull StickerGroup stickerGroup0, @NotNull Function1 function11, @NotNull Function1 function12, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function10, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(immutableList0, "groupList");
        Intrinsics.checkNotNullParameter(stickerGroup0, "selectStickerGroup");
        Intrinsics.checkNotNullParameter(function11, "addSticker");
        Intrinsics.checkNotNullParameter(function12, "onSelectStickerGroup");
        Intrinsics.checkNotNullParameter(function00, "onClickRemoveAll");
        Intrinsics.checkNotNullParameter(function01, "onFinish");
        return new StickerUiModel(kDPhoto0, integer0, rect0, function10, immutableList0, stickerGroup0, function11, function12, function00, function01);
    }

    public static StickerUiModel copy$default(StickerUiModel stickerUiModel0, KDPhoto kDPhoto0, Integer integer0, Rect rect0, Function1 function10, ImmutableList immutableList0, StickerGroup stickerGroup0, Function1 function11, Function1 function12, Function0 function00, Function0 function01, int v, Object object0) {
        KDPhoto kDPhoto1 = (v & 1) == 0 ? kDPhoto0 : stickerUiModel0.s;
        Integer integer1 = (v & 2) == 0 ? integer0 : stickerUiModel0.t;
        Rect rect1 = (v & 4) == 0 ? rect0 : stickerUiModel0.u;
        Function1 function13 = (v & 8) == 0 ? function10 : stickerUiModel0.v;
        ImmutableList immutableList1 = (v & 16) == 0 ? immutableList0 : stickerUiModel0.w;
        StickerGroup stickerGroup1 = (v & 0x20) == 0 ? stickerGroup0 : stickerUiModel0.x;
        Function1 function14 = (v & 0x40) == 0 ? function11 : stickerUiModel0.y;
        Function1 function15 = (v & 0x80) == 0 ? function12 : stickerUiModel0.z;
        Function0 function02 = (v & 0x100) == 0 ? function00 : stickerUiModel0.A;
        return (v & 0x200) == 0 ? stickerUiModel0.copy(kDPhoto1, integer1, rect1, function13, immutableList1, stickerGroup1, function14, function15, function02, function01) : stickerUiModel0.copy(kDPhoto1, integer1, rect1, function13, immutableList1, stickerGroup1, function14, function15, function02, stickerUiModel0.B);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof StickerUiModel)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.s, ((StickerUiModel)object0).s)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.t, ((StickerUiModel)object0).t)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.u, ((StickerUiModel)object0).u)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.v, ((StickerUiModel)object0).v)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.w, ((StickerUiModel)object0).w)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.x, ((StickerUiModel)object0).x)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.y, ((StickerUiModel)object0).y)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.z, ((StickerUiModel)object0).z)) {
            return false;
        }
        return Intrinsics.areEqual(this.A, ((StickerUiModel)object0).A) ? Intrinsics.areEqual(this.B, ((StickerUiModel)object0).B) : false;
    }

    @NotNull
    public final Function1 getAddSticker() {
        return this.y;
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
        if(decoration0 instanceof Sticker) {
            Integer integer0 = this.getSelectedNo();
            if(integer0 != null && ((int)integer0) == ((Sticker)decoration0).getNo()) {
                return DecorationStatus.Selected;
            }
        }
        return decoration0 instanceof Sticker ? DecorationStatus.Enabled : DecorationStatus.Disabled;
    }

    @NotNull
    public final List getFilter() {
        PersistentList persistentList0 = this.getPhoto().getDecorationList();
        List list0 = new ArrayList(l.collectionSizeOrDefault(persistentList0, 10));
        for(Object object0: persistentList0) {
            list0.add(Boolean.valueOf(((Absolute)object0) instanceof Blur));
        }
        return list0;
    }

    @NotNull
    public final ImmutableList getGroupList() {
        return this.w;
    }

    @NotNull
    public final ImmutableList getItemList() {
        return this.C;
    }

    @NotNull
    public final Function1 getOnChangedContentBounds() {
        return this.v;
    }

    @NotNull
    public final Function0 getOnClickRemoveAll() {
        return this.A;
    }

    @NotNull
    public final Function0 getOnFinish() {
        return this.B;
    }

    @NotNull
    public final Function1 getOnSelectStickerGroup() {
        return this.z;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public KDPhoto getPhoto() {
        return this.s;
    }

    @NotNull
    public final StickerGroup getSelectStickerGroup() {
        return this.x;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @Nullable
    public Integer getSelectedNo() {
        return this.t;
    }

    @Override
    public int hashCode() {
        int v = this.s.hashCode();
        return this.t == null ? this.B.hashCode() + r0.a.g(this.A, r0.a.d(r0.a.d((this.x.hashCode() + (this.w.hashCode() + r0.a.d((this.u.hashCode() + v * 961) * 0x1F, 0x1F, this.v)) * 0x1F) * 0x1F, 0x1F, this.y), 0x1F, this.z), 0x1F) : this.B.hashCode() + r0.a.g(this.A, r0.a.d(r0.a.d((this.x.hashCode() + (this.w.hashCode() + r0.a.d((this.u.hashCode() + (v * 0x1F + this.t.hashCode()) * 0x1F) * 0x1F, 0x1F, this.v)) * 0x1F) * 0x1F, 0x1F, this.y), 0x1F, this.z), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "StickerUiModel(photo=" + this.s + ", selectedNo=" + this.t + ", contentBounds=" + this.u + ", onChangedContentBounds=" + this.v + ", groupList=" + this.w + ", selectStickerGroup=" + this.x + ", addSticker=" + this.y + ", onSelectStickerGroup=" + this.z + ", onClickRemoveAll=" + this.A + ", onFinish=" + this.B + ")";
    }
}

