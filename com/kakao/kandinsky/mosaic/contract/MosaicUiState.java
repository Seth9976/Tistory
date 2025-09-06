package com.kakao.kandinsky.mosaic.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import com.kakao.kandinsky.core.kdphoto.Decoration;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.Mosaic.Type;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.mosaic.ViewType;
import com.kakao.kandinsky.preview.PreviewUiState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import la.a;
import la.b;
import la.c;
import la.d;
import la.e;
import la.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\'\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u00CD\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\b\b\u0002\u0010\u000F\u001A\u00020\r\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u0010\u0012\u0014\b\u0002\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000E\b\u0002\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00050\u0019\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010 \u001A\u00020\u001F2\u0006\u0010\u001E\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u001C\u0010$\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b(\u0010)J\u0012\u0010*\u001A\u0004\u0018\u00010\u000BH\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001A\u00020\u0010H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010/J\u001C\u00100\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\b0\u0010%J\u001C\u00101\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\b1\u0010%J\u001C\u00102\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\b2\u0010%J\u001C\u00103\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u0004H\u00C6\u0003\u00A2\u0006\u0004\b3\u0010%J\u0016\u00104\u001A\b\u0012\u0004\u0012\u00020\u00050\u0019H\u00C6\u0003\u00A2\u0006\u0004\b4\u00105J\u00D6\u0001\u00106\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\u0014\b\u0002\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u00042\u000E\b\u0002\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00050\u0019H\u00C6\u0001\u00A2\u0006\u0004\b6\u00107J\u0010\u00109\u001A\u000208H\u00D6\u0001\u00A2\u0006\u0004\b9\u0010:J\u0010\u0010;\u001A\u00020\u000BH\u00D6\u0001\u00A2\u0006\u0004\b;\u0010<J\u001A\u0010@\u001A\u00020?2\b\u0010>\u001A\u0004\u0018\u00010=H\u00D6\u0003\u00A2\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010#R#\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\bG\u0010%R\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010\'R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010)R\u001C\u0010\f\u001A\u0004\u0018\u00010\u000B8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bN\u0010O\u001A\u0004\bP\u0010+R\u001A\u0010\u000E\u001A\u00020\r8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bQ\u0010R\u001A\u0004\bS\u0010-R\u001A\u0010\u0011\u001A\u00020\u00108\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bT\u0010U\u001A\u0004\bV\u0010/R#\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\bW\u0010F\u001A\u0004\bX\u0010%R#\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\bY\u0010F\u001A\u0004\bZ\u0010%R#\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\b[\u0010F\u001A\u0004\b\\\u0010%R#\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\b]\u0010F\u001A\u0004\b^\u0010%R\u001D\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00050\u00198\u0006\u00A2\u0006\f\n\u0004\b_\u0010`\u001A\u0004\ba\u00105R\u0017\u0010f\u001A\u00020?8\u0006\u00A2\u0006\f\n\u0004\bb\u0010c\u001A\u0004\bd\u0010eR\u0019\u0010l\u001A\u0004\u0018\u00010g8\u0006\u00A2\u0006\f\n\u0004\bh\u0010i\u001A\u0004\bj\u0010kR\u0017\u0010p\u001A\u00020\u00138\u0006\u00A2\u0006\f\n\u0004\bm\u0010b\u001A\u0004\bn\u0010o\u00A8\u0006q"}, d2 = {"Lcom/kakao/kandinsky/mosaic/contract/MosaicUiState;", "Lcom/kakao/kandinsky/preview/PreviewUiState;", "Lcom/kakao/kandinsky/mosaic/ViewType;", "viewType", "Lkotlin/Function1;", "", "onChangeViewType", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;", "selectedMosaicType", "Lcom/kakao/kandinsky/core/kdphoto/Blur$Type;", "selectedBlurType", "", "selectedNo", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "savedPhoto", "Landroidx/compose/ui/geometry/Rect;", "contentBounds", "onChangedContentBounds", "", "onChangeIntensity", "Lcom/kakao/kandinsky/mosaic/MosaicMenu;", "onClickMosaicMenu", "Lcom/kakao/kandinsky/mosaic/BlurMenu;", "onClickBlurMenu", "Lkotlin/Function0;", "onClickCancel", "<init>", "(Lcom/kakao/kandinsky/mosaic/ViewType;Lkotlin/jvm/functions/Function1;Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;Lcom/kakao/kandinsky/core/kdphoto/Blur$Type;Ljava/lang/Integer;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lcom/kakao/kandinsky/core/kdphoto/Decoration;", "decoration", "Lcom/kakao/kandinsky/decoration/DecorationStatus;", "getDecorationStatus", "(Lcom/kakao/kandinsky/core/kdphoto/Decoration;)Lcom/kakao/kandinsky/decoration/DecorationStatus;", "component1", "()Lcom/kakao/kandinsky/mosaic/ViewType;", "component2", "()Lkotlin/jvm/functions/Function1;", "component3", "()Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;", "component4", "()Lcom/kakao/kandinsky/core/kdphoto/Blur$Type;", "component5", "()Ljava/lang/Integer;", "component6", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "component8", "()Landroidx/compose/ui/geometry/Rect;", "component9", "component10", "component11", "component12", "component13", "()Lkotlin/jvm/functions/Function0;", "copy", "(Lcom/kakao/kandinsky/mosaic/ViewType;Lkotlin/jvm/functions/Function1;Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;Lcom/kakao/kandinsky/core/kdphoto/Blur$Type;Ljava/lang/Integer;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/kakao/kandinsky/mosaic/contract/MosaicUiState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "s", "Lcom/kakao/kandinsky/mosaic/ViewType;", "getViewType", "t", "Lkotlin/jvm/functions/Function1;", "getOnChangeViewType", "u", "Lcom/kakao/kandinsky/core/kdphoto/Mosaic$Type;", "getSelectedMosaicType", "v", "Lcom/kakao/kandinsky/core/kdphoto/Blur$Type;", "getSelectedBlurType", "w", "Ljava/lang/Integer;", "getSelectedNo", "x", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "z", "Landroidx/compose/ui/geometry/Rect;", "getContentBounds", "A", "getOnChangedContentBounds", "B", "getOnChangeIntensity", "C", "getOnClickMosaicMenu", "D", "getOnClickBlurMenu", "E", "Lkotlin/jvm/functions/Function0;", "getOnClickCancel", "F", "Z", "getChanged", "()Z", "changed", "Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute;", "G", "Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute;", "getSelectedItem", "()Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute;", "selectedItem", "H", "getSelectedItemIntensity", "()F", "selectedItemIntensity", "mosaic_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMosaicUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MosaicUiState.kt\ncom/kakao/kandinsky/mosaic/contract/MosaicUiState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
public final class MosaicUiState extends PreviewUiState {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ViewType.values().length];
            try {
                arr_v[ViewType.Mosaic.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[ViewType.Blur.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    public final Function1 A;
    public final Function1 B;
    public final Function1 C;
    public final Function1 D;
    public final Function0 E;
    public final boolean F;
    public final Absolute G;
    public final float H;
    public final ViewType s;
    public final Function1 t;
    public final Type u;
    public final com.kakao.kandinsky.core.kdphoto.Blur.Type v;
    public final Integer w;
    public final KDPhoto x;
    public final KDPhoto y;
    public final Rect z;

    public MosaicUiState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFF, null);
    }

    public MosaicUiState(@NotNull ViewType viewType0, @NotNull Function1 function10, @NotNull Type mosaic$Type0, @NotNull com.kakao.kandinsky.core.kdphoto.Blur.Type blur$Type0, @Nullable Integer integer0, @NotNull KDPhoto kDPhoto0, @NotNull KDPhoto kDPhoto1, @NotNull Rect rect0, @NotNull Function1 function11, @NotNull Function1 function12, @NotNull Function1 function13, @NotNull Function1 function14, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(viewType0, "viewType");
        float f;
        Intrinsics.checkNotNullParameter(function10, "onChangeViewType");
        Intrinsics.checkNotNullParameter(mosaic$Type0, "selectedMosaicType");
        Intrinsics.checkNotNullParameter(blur$Type0, "selectedBlurType");
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function11, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(function12, "onChangeIntensity");
        Intrinsics.checkNotNullParameter(function13, "onClickMosaicMenu");
        Intrinsics.checkNotNullParameter(function14, "onClickBlurMenu");
        Intrinsics.checkNotNullParameter(function00, "onClickCancel");
        super();
        this.s = viewType0;
        this.t = function10;
        this.u = mosaic$Type0;
        this.v = blur$Type0;
        this.w = integer0;
        this.x = kDPhoto0;
        this.y = kDPhoto1;
        this.z = rect0;
        this.A = function11;
        this.B = function12;
        this.C = function13;
        this.D = function14;
        this.E = function00;
        this.F = !Intrinsics.areEqual(this.getPhoto(), kDPhoto1);
        Integer integer1 = this.getSelectedNo();
        Absolute decoration$Absolute0 = null;
        if(integer1 != null) {
            Object object0 = null;
            int v = integer1.intValue();
            for(Object object1: this.getPhoto().getDecorationList()) {
                if(((Absolute)object1).getNo() == v) {
                    object0 = object1;
                    break;
                }
            }
            switch(WhenMappings.$EnumSwitchMapping$0[this.s.ordinal()]) {
                case 1: {
                    if(((Absolute)object0) instanceof Mosaic) {
                        decoration$Absolute0 = (Mosaic)(((Absolute)object0));
                    }
                    break;
                }
                case 2: {
                    if(((Absolute)object0) instanceof Blur) {
                        decoration$Absolute0 = (Blur)(((Absolute)object0));
                    }
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        this.G = decoration$Absolute0;
        if(decoration$Absolute0 instanceof Mosaic) {
            f = ((Mosaic)decoration$Absolute0).getIntensity();
        }
        else {
            f = decoration$Absolute0 instanceof Blur ? ((Blur)decoration$Absolute0).getIntensity() : 1.0f;
        }
        this.H = f;
    }

    public MosaicUiState(ViewType viewType0, Function1 function10, Type mosaic$Type0, com.kakao.kandinsky.core.kdphoto.Blur.Type blur$Type0, Integer integer0, KDPhoto kDPhoto0, KDPhoto kDPhoto1, Rect rect0, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        ViewType viewType1 = (v & 1) == 0 ? viewType0 : ViewType.Mosaic;
        Function1 function15 = (v & 2) == 0 ? function10 : a.w;
        Type mosaic$Type1 = (v & 4) == 0 ? mosaic$Type0 : Type.Circle;
        com.kakao.kandinsky.core.kdphoto.Blur.Type blur$Type1 = (v & 8) == 0 ? blur$Type0 : com.kakao.kandinsky.core.kdphoto.Blur.Type.Circle;
        KDPhoto kDPhoto2 = (v & 0x20) == 0 ? kDPhoto0 : KDPhoto.Companion.getEmpty();
        KDPhoto kDPhoto3 = (v & 0x40) == 0 ? kDPhoto1 : KDPhoto.Companion.getEmpty();
        Rect rect1 = (v & 0x80) == 0 ? rect0 : Rect.Companion.getZero();
        Function1 function16 = (v & 0x100) == 0 ? function11 : b.w;
        Function1 function17 = (v & 0x200) == 0 ? function12 : c.w;
        Function1 function18 = (v & 0x400) == 0 ? function13 : d.w;
        Function1 function19 = (v & 0x800) == 0 ? function14 : e.w;
        Function0 function01 = (v & 0x1000) == 0 ? function00 : f.w;
        this(viewType1, function15, mosaic$Type1, blur$Type1, ((v & 16) == 0 ? integer0 : null), kDPhoto2, kDPhoto3, rect1, function16, function17, function18, function19, function01);
    }

    @NotNull
    public final ViewType component1() {
        return this.s;
    }

    @NotNull
    public final Function1 component10() {
        return this.B;
    }

    @NotNull
    public final Function1 component11() {
        return this.C;
    }

    @NotNull
    public final Function1 component12() {
        return this.D;
    }

    @NotNull
    public final Function0 component13() {
        return this.E;
    }

    @NotNull
    public final Function1 component2() {
        return this.t;
    }

    @NotNull
    public final Type component3() {
        return this.u;
    }

    @NotNull
    public final com.kakao.kandinsky.core.kdphoto.Blur.Type component4() {
        return this.v;
    }

    @Nullable
    public final Integer component5() {
        return this.w;
    }

    @NotNull
    public final KDPhoto component6() {
        return this.x;
    }

    @NotNull
    public final Rect component8() {
        return this.z;
    }

    @NotNull
    public final Function1 component9() {
        return this.A;
    }

    @NotNull
    public final MosaicUiState copy(@NotNull ViewType viewType0, @NotNull Function1 function10, @NotNull Type mosaic$Type0, @NotNull com.kakao.kandinsky.core.kdphoto.Blur.Type blur$Type0, @Nullable Integer integer0, @NotNull KDPhoto kDPhoto0, @NotNull KDPhoto kDPhoto1, @NotNull Rect rect0, @NotNull Function1 function11, @NotNull Function1 function12, @NotNull Function1 function13, @NotNull Function1 function14, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(viewType0, "viewType");
        Intrinsics.checkNotNullParameter(function10, "onChangeViewType");
        Intrinsics.checkNotNullParameter(mosaic$Type0, "selectedMosaicType");
        Intrinsics.checkNotNullParameter(blur$Type0, "selectedBlurType");
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function11, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(function12, "onChangeIntensity");
        Intrinsics.checkNotNullParameter(function13, "onClickMosaicMenu");
        Intrinsics.checkNotNullParameter(function14, "onClickBlurMenu");
        Intrinsics.checkNotNullParameter(function00, "onClickCancel");
        return new MosaicUiState(viewType0, function10, mosaic$Type0, blur$Type0, integer0, kDPhoto0, kDPhoto1, rect0, function11, function12, function13, function14, function00);
    }

    public static MosaicUiState copy$default(MosaicUiState mosaicUiState0, ViewType viewType0, Function1 function10, Type mosaic$Type0, com.kakao.kandinsky.core.kdphoto.Blur.Type blur$Type0, Integer integer0, KDPhoto kDPhoto0, KDPhoto kDPhoto1, Rect rect0, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function0 function00, int v, Object object0) {
        ViewType viewType1 = (v & 1) == 0 ? viewType0 : mosaicUiState0.s;
        Function1 function15 = (v & 2) == 0 ? function10 : mosaicUiState0.t;
        Type mosaic$Type1 = (v & 4) == 0 ? mosaic$Type0 : mosaicUiState0.u;
        com.kakao.kandinsky.core.kdphoto.Blur.Type blur$Type1 = (v & 8) == 0 ? blur$Type0 : mosaicUiState0.v;
        Integer integer1 = (v & 16) == 0 ? integer0 : mosaicUiState0.w;
        KDPhoto kDPhoto2 = (v & 0x20) == 0 ? kDPhoto0 : mosaicUiState0.x;
        KDPhoto kDPhoto3 = (v & 0x40) == 0 ? kDPhoto1 : mosaicUiState0.y;
        Rect rect1 = (v & 0x80) == 0 ? rect0 : mosaicUiState0.z;
        Function1 function16 = (v & 0x100) == 0 ? function11 : mosaicUiState0.A;
        Function1 function17 = (v & 0x200) == 0 ? function12 : mosaicUiState0.B;
        Function1 function18 = (v & 0x400) == 0 ? function13 : mosaicUiState0.C;
        Function1 function19 = (v & 0x800) == 0 ? function14 : mosaicUiState0.D;
        return (v & 0x1000) == 0 ? mosaicUiState0.copy(viewType1, function15, mosaic$Type1, blur$Type1, integer1, kDPhoto2, kDPhoto3, rect1, function16, function17, function18, function19, function00) : mosaicUiState0.copy(viewType1, function15, mosaic$Type1, blur$Type1, integer1, kDPhoto2, kDPhoto3, rect1, function16, function17, function18, function19, mosaicUiState0.E);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MosaicUiState)) {
            return false;
        }
        if(this.s != ((MosaicUiState)object0).s) {
            return false;
        }
        if(!Intrinsics.areEqual(this.t, ((MosaicUiState)object0).t)) {
            return false;
        }
        if(this.u != ((MosaicUiState)object0).u) {
            return false;
        }
        if(this.v != ((MosaicUiState)object0).v) {
            return false;
        }
        if(!Intrinsics.areEqual(this.w, ((MosaicUiState)object0).w)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.x, ((MosaicUiState)object0).x)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.y, ((MosaicUiState)object0).y)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.z, ((MosaicUiState)object0).z)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.A, ((MosaicUiState)object0).A)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.B, ((MosaicUiState)object0).B)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.C, ((MosaicUiState)object0).C)) {
            return false;
        }
        return Intrinsics.areEqual(this.D, ((MosaicUiState)object0).D) ? Intrinsics.areEqual(this.E, ((MosaicUiState)object0).E) : false;
    }

    public final boolean getChanged() {
        return this.F;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public Rect getContentBounds() {
        return this.z;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public DecorationStatus getDecorationStatus(@NotNull Decoration decoration0) {
        Intrinsics.checkNotNullParameter(decoration0, "decoration");
        switch(WhenMappings.$EnumSwitchMapping$0[this.s.ordinal()]) {
            case 1: {
                if(decoration0 instanceof Mosaic) {
                    Integer integer0 = this.getSelectedNo();
                    if(integer0 != null && ((int)integer0) == ((Mosaic)decoration0).getNo()) {
                        return DecorationStatus.Selected;
                    }
                }
                if(decoration0 instanceof Mosaic) {
                    return DecorationStatus.Enabled;
                }
                return decoration0 instanceof Blur ? DecorationStatus.OnlyView : DecorationStatus.Disabled;
            }
            case 2: {
                if(decoration0 instanceof Blur) {
                    Integer integer1 = this.getSelectedNo();
                    if(integer1 != null && ((int)integer1) == ((Blur)decoration0).getNo()) {
                        return DecorationStatus.Selected;
                    }
                }
                if(decoration0 instanceof Blur) {
                    return DecorationStatus.Enabled;
                }
                return decoration0 instanceof Mosaic ? DecorationStatus.OnlyView : DecorationStatus.Disabled;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final Function1 getOnChangeIntensity() {
        return this.B;
    }

    @NotNull
    public final Function1 getOnChangeViewType() {
        return this.t;
    }

    @NotNull
    public final Function1 getOnChangedContentBounds() {
        return this.A;
    }

    @NotNull
    public final Function1 getOnClickBlurMenu() {
        return this.D;
    }

    @NotNull
    public final Function0 getOnClickCancel() {
        return this.E;
    }

    @NotNull
    public final Function1 getOnClickMosaicMenu() {
        return this.C;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public KDPhoto getPhoto() {
        return this.x;
    }

    @NotNull
    public final com.kakao.kandinsky.core.kdphoto.Blur.Type getSelectedBlurType() {
        return this.v;
    }

    @Nullable
    public final Absolute getSelectedItem() {
        return this.G;
    }

    public final float getSelectedItemIntensity() {
        return this.H;
    }

    @NotNull
    public final Type getSelectedMosaicType() {
        return this.u;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @Nullable
    public Integer getSelectedNo() {
        return this.w;
    }

    @NotNull
    public final ViewType getViewType() {
        return this.s;
    }

    @Override
    public int hashCode() {
        int v = r0.a.d(this.s.hashCode() * 0x1F, 0x1F, this.t);
        int v1 = this.u.hashCode();
        int v2 = this.v.hashCode();
        return this.w == null ? this.E.hashCode() + r0.a.d(r0.a.d(r0.a.d(r0.a.d((this.z.hashCode() + (this.y.hashCode() + (this.x.hashCode() + (v2 + (v1 + v) * 0x1F) * 961) * 0x1F) * 0x1F) * 0x1F, 0x1F, this.A), 0x1F, this.B), 0x1F, this.C), 0x1F, this.D) : this.E.hashCode() + r0.a.d(r0.a.d(r0.a.d(r0.a.d((this.z.hashCode() + (this.y.hashCode() + (this.x.hashCode() + ((v2 + (v1 + v) * 0x1F) * 0x1F + this.w.hashCode()) * 0x1F) * 0x1F) * 0x1F) * 0x1F, 0x1F, this.A), 0x1F, this.B), 0x1F, this.C), 0x1F, this.D);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("MosaicUiState(viewType=");
        stringBuilder0.append(this.s);
        stringBuilder0.append(", onChangeViewType=");
        stringBuilder0.append(this.t);
        stringBuilder0.append(", selectedMosaicType=");
        stringBuilder0.append(this.u);
        stringBuilder0.append(", selectedBlurType=");
        stringBuilder0.append(this.v);
        stringBuilder0.append(", selectedNo=");
        stringBuilder0.append(this.w);
        stringBuilder0.append(", photo=");
        stringBuilder0.append(this.x);
        stringBuilder0.append(", savedPhoto=");
        stringBuilder0.append(this.y);
        stringBuilder0.append(", contentBounds=");
        stringBuilder0.append(this.z);
        stringBuilder0.append(", onChangedContentBounds=");
        stringBuilder0.append(this.A);
        stringBuilder0.append(", onChangeIntensity=");
        stringBuilder0.append(this.B);
        stringBuilder0.append(", onClickMosaicMenu=");
        stringBuilder0.append(this.C);
        stringBuilder0.append(", onClickBlurMenu=");
        stringBuilder0.append(this.D);
        stringBuilder0.append(", onClickCancel=");
        return q.q(stringBuilder0, this.E, ")");
    }
}

