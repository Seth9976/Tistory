package com.kakao.kandinsky.text.contract;

import ab.a;
import ab.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import com.kakao.kandinsky.core.kdphoto.Decoration;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.Text;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.preview.PreviewUiState;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\'\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u00ED\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\u0014\b\u0002\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u0012\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u0012#\b\u0002\u0010\u0015\u001A\u001D\u0012\u0013\u0012\u00110\u0011\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\t\u0012\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\n0\u0016\u0012%\b\u0002\u0010\u001A\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\n0\t\u0012\u000E\b\u0002\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\n0\u0016\u0012\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\n0\u0016\u0012\u000E\b\u0002\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\n0\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0017\u0010#\u001A\u00020\"2\u0006\u0010!\u001A\u00020 H\u0016\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010&J\u0012\u0010\'\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010*J\u001C\u0010+\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b+\u0010,J\u0016\u0010-\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u00C6\u0003\u00A2\u0006\u0004\b-\u0010.J\u0010\u0010/\u001A\u00020\u000FH\u00C6\u0003\u00A2\u0006\u0004\b/\u00100J+\u00101\u001A\u001D\u0012\u0013\u0012\u00110\u0011\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b1\u0010,J\u0016\u00102\u001A\b\u0012\u0004\u0012\u00020\n0\u0016H\u00C6\u0003\u00A2\u0006\u0004\b2\u00103J-\u00104\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b4\u0010,J\u0016\u00105\u001A\b\u0012\u0004\u0012\u00020\n0\u0016H\u00C6\u0003\u00A2\u0006\u0004\b5\u00103J\u0016\u00106\u001A\b\u0012\u0004\u0012\u00020\n0\u0016H\u00C6\u0003\u00A2\u0006\u0004\b6\u00103J\u0016\u00107\u001A\b\u0012\u0004\u0012\u00020\n0\u0016H\u00C6\u0003\u00A2\u0006\u0004\b7\u00103J\u00F6\u0001\u00108\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\u0014\b\u0002\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2#\b\u0002\u0010\u0015\u001A\u001D\u0012\u0013\u0012\u00110\u0011\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\t2\u000E\b\u0002\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\n0\u00162%\b\u0002\u0010\u001A\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\n0\t2\u000E\b\u0002\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\n0\u00162\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\n0\u00162\u000E\b\u0002\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\n0\u0016H\u00C6\u0001\u00A2\u0006\u0004\b8\u00109J\u0010\u0010;\u001A\u00020:H\u00D6\u0001\u00A2\u0006\u0004\b;\u0010<J\u0010\u0010=\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b=\u0010>J\u001A\u0010A\u001A\u00020\u00112\b\u0010@\u001A\u0004\u0018\u00010?H\u00D6\u0003\u00A2\u0006\u0004\bA\u0010BR\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010&R\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010(R\u001A\u0010\b\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bI\u0010J\u001A\u0004\bK\u0010*R#\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t8\u0006\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010,R\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f8\u0006\u00A2\u0006\f\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010.R\u0017\u0010\u0010\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\bR\u0010S\u001A\u0004\bT\u00100R2\u0010\u0015\u001A\u001D\u0012\u0013\u0012\u00110\u0011\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\n0\t8\u0006\u00A2\u0006\f\n\u0004\bU\u0010M\u001A\u0004\bV\u0010,R\u001D\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\n0\u00168\u0006\u00A2\u0006\f\n\u0004\bW\u0010X\u001A\u0004\bY\u00103R4\u0010\u001A\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\u0018\u00A2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\n0\t8\u0006\u00A2\u0006\f\n\u0004\bZ\u0010M\u001A\u0004\b[\u0010,R\u001D\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\n0\u00168\u0006\u00A2\u0006\f\n\u0004\b\\\u0010X\u001A\u0004\b]\u00103R\u001D\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\n0\u00168\u0006\u00A2\u0006\f\n\u0004\b^\u0010X\u001A\u0004\b_\u00103R\u001D\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\n0\u00168\u0006\u00A2\u0006\f\n\u0004\b`\u0010X\u001A\u0004\ba\u00103R\u0017\u0010f\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\bb\u0010c\u001A\u0004\bd\u0010eR\u0019\u0010l\u001A\u0004\u0018\u00010g8\u0006\u00A2\u0006\f\n\u0004\bh\u0010i\u001A\u0004\bj\u0010k\u00A8\u0006m"}, d2 = {"Lcom/kakao/kandinsky/text/contract/TextUiState;", "Lcom/kakao/kandinsky/preview/PreviewUiState;", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "", "selectedNo", "savedPhoto", "Landroidx/compose/ui/geometry/Rect;", "contentBounds", "Lkotlin/Function1;", "", "onChangedContentBounds", "", "Lcom/kakao/kandinsky/textedit/contract/FontData;", "fonts", "Lcom/kakao/kandinsky/text/contract/TextMode;", "textMode", "", "Lkotlin/ParameterName;", "name", "new", "changeModeToInput", "Lkotlin/Function0;", "changeModeToControl", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "data", "updateTextData", "removeAllDeco", "onClickCancel", "onClickConfirm", "<init>", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Ljava/lang/Integer;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/kakao/kandinsky/text/contract/TextMode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lcom/kakao/kandinsky/core/kdphoto/Decoration;", "decoration", "Lcom/kakao/kandinsky/decoration/DecorationStatus;", "getDecorationStatus", "(Lcom/kakao/kandinsky/core/kdphoto/Decoration;)Lcom/kakao/kandinsky/decoration/DecorationStatus;", "component1", "()Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "component2", "()Ljava/lang/Integer;", "component4", "()Landroidx/compose/ui/geometry/Rect;", "component5", "()Lkotlin/jvm/functions/Function1;", "component6", "()Ljava/util/List;", "component7", "()Lcom/kakao/kandinsky/text/contract/TextMode;", "component8", "component9", "()Lkotlin/jvm/functions/Function0;", "component10", "component11", "component12", "component13", "copy", "(Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Ljava/lang/Integer;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/kakao/kandinsky/text/contract/TextMode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/kakao/kandinsky/text/contract/TextUiState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "s", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "getPhoto", "t", "Ljava/lang/Integer;", "getSelectedNo", "v", "Landroidx/compose/ui/geometry/Rect;", "getContentBounds", "w", "Lkotlin/jvm/functions/Function1;", "getOnChangedContentBounds", "x", "Ljava/util/List;", "getFonts", "y", "Lcom/kakao/kandinsky/text/contract/TextMode;", "getTextMode", "z", "getChangeModeToInput", "A", "Lkotlin/jvm/functions/Function0;", "getChangeModeToControl", "B", "getUpdateTextData", "C", "getRemoveAllDeco", "D", "getOnClickCancel", "E", "getOnClickConfirm", "F", "Z", "getChanged", "()Z", "changed", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "G", "Lcom/kakao/kandinsky/core/kdphoto/Text;", "getSelectedText", "()Lcom/kakao/kandinsky/core/kdphoto/Text;", "selectedText", "text_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUiState.kt\ncom/kakao/kandinsky/text/contract/TextUiState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class TextUiState extends PreviewUiState {
    public static final int $stable = 8;
    public final Function0 A;
    public final Function1 B;
    public final Function0 C;
    public final Function0 D;
    public final Function0 E;
    public final boolean F;
    public final Text G;
    public final KDPhoto s;
    public final Integer t;
    public final KDPhoto u;
    public final Rect v;
    public final Function1 w;
    public final List x;
    public final TextMode y;
    public final Function1 z;

    public TextUiState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 0x1FFF, null);
    }

    public TextUiState(@NotNull KDPhoto kDPhoto0, @Nullable Integer integer0, @NotNull KDPhoto kDPhoto1, @NotNull Rect rect0, @NotNull Function1 function10, @NotNull List list0, @NotNull TextMode textMode0, @NotNull Function1 function11, @NotNull Function0 function00, @NotNull Function1 function12, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function0 function03) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Object object0;
        Text text0;
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function10, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(list0, "fonts");
        Intrinsics.checkNotNullParameter(textMode0, "textMode");
        Intrinsics.checkNotNullParameter(function11, "changeModeToInput");
        Intrinsics.checkNotNullParameter(function00, "changeModeToControl");
        Intrinsics.checkNotNullParameter(function12, "updateTextData");
        Intrinsics.checkNotNullParameter(function01, "removeAllDeco");
        Intrinsics.checkNotNullParameter(function02, "onClickCancel");
        Intrinsics.checkNotNullParameter(function03, "onClickConfirm");
        super();
        this.s = kDPhoto0;
        this.t = integer0;
        this.u = kDPhoto1;
        this.v = rect0;
        this.w = function10;
        this.x = list0;
        this.y = textMode0;
        this.z = function11;
        this.A = function00;
        this.B = function12;
        this.C = function01;
        this.D = function02;
        this.E = function03;
        this.F = !Intrinsics.areEqual(this.getPhoto(), kDPhoto1) || this.getSelectedNo() != null;
        Iterator iterator0 = this.getPhoto().getDecorationList().iterator();
        do {
            text0 = null;
            if(!iterator0.hasNext()) {
                goto label_34;
            }
            object0 = iterator0.next();
            Integer integer1 = this.getSelectedNo();
        }
        while(integer1 == null || ((Absolute)object0).getNo() != ((int)integer1));
        goto label_35;
    label_34:
        object0 = null;
    label_35:
        if(object0 instanceof Text) {
            text0 = (Text)object0;
        }
        this.G = text0;
    }

    public TextUiState(KDPhoto kDPhoto0, Integer integer0, KDPhoto kDPhoto1, Rect rect0, Function1 function10, List list0, TextMode textMode0, Function1 function11, Function0 function00, Function1 function12, Function0 function01, Function0 function02, Function0 function03, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        KDPhoto kDPhoto2 = (v & 1) == 0 ? kDPhoto0 : KDPhoto.Companion.getEmpty();
        KDPhoto kDPhoto3 = (v & 4) == 0 ? kDPhoto1 : KDPhoto.Companion.getEmpty();
        Rect rect1 = (v & 8) == 0 ? rect0 : Rect.Companion.getZero();
        Function1 function13 = (v & 16) == 0 ? function10 : a.x;
        List list1 = (v & 0x20) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList();
        TextMode textMode1 = (v & 0x40) == 0 ? textMode0 : Control.INSTANCE;
        Function1 function14 = (v & 0x80) == 0 ? function11 : a.y;
        Function0 function04 = (v & 0x100) == 0 ? function00 : b.x;
        Function1 function15 = (v & 0x200) == 0 ? function12 : a.z;
        Function0 function05 = (v & 0x400) == 0 ? function01 : b.y;
        Function0 function06 = (v & 0x800) == 0 ? function02 : b.z;
        Function0 function07 = (v & 0x1000) == 0 ? function03 : b.A;
        this(kDPhoto2, ((v & 2) == 0 ? integer0 : null), kDPhoto3, rect1, function13, list1, textMode1, function14, function04, function15, function05, function06, function07);
    }

    @NotNull
    public final KDPhoto component1() {
        return this.s;
    }

    @NotNull
    public final Function1 component10() {
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
    public final Function0 component13() {
        return this.E;
    }

    @Nullable
    public final Integer component2() {
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

    @NotNull
    public final List component6() {
        return this.x;
    }

    @NotNull
    public final TextMode component7() {
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
    public final TextUiState copy(@NotNull KDPhoto kDPhoto0, @Nullable Integer integer0, @NotNull KDPhoto kDPhoto1, @NotNull Rect rect0, @NotNull Function1 function10, @NotNull List list0, @NotNull TextMode textMode0, @NotNull Function1 function11, @NotNull Function0 function00, @NotNull Function1 function12, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function0 function03) {
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Intrinsics.checkNotNullParameter(kDPhoto1, "savedPhoto");
        Intrinsics.checkNotNullParameter(rect0, "contentBounds");
        Intrinsics.checkNotNullParameter(function10, "onChangedContentBounds");
        Intrinsics.checkNotNullParameter(list0, "fonts");
        Intrinsics.checkNotNullParameter(textMode0, "textMode");
        Intrinsics.checkNotNullParameter(function11, "changeModeToInput");
        Intrinsics.checkNotNullParameter(function00, "changeModeToControl");
        Intrinsics.checkNotNullParameter(function12, "updateTextData");
        Intrinsics.checkNotNullParameter(function01, "removeAllDeco");
        Intrinsics.checkNotNullParameter(function02, "onClickCancel");
        Intrinsics.checkNotNullParameter(function03, "onClickConfirm");
        return new TextUiState(kDPhoto0, integer0, kDPhoto1, rect0, function10, list0, textMode0, function11, function00, function12, function01, function02, function03);
    }

    public static TextUiState copy$default(TextUiState textUiState0, KDPhoto kDPhoto0, Integer integer0, KDPhoto kDPhoto1, Rect rect0, Function1 function10, List list0, TextMode textMode0, Function1 function11, Function0 function00, Function1 function12, Function0 function01, Function0 function02, Function0 function03, int v, Object object0) {
        KDPhoto kDPhoto2 = (v & 1) == 0 ? kDPhoto0 : textUiState0.s;
        Integer integer1 = (v & 2) == 0 ? integer0 : textUiState0.t;
        KDPhoto kDPhoto3 = (v & 4) == 0 ? kDPhoto1 : textUiState0.u;
        Rect rect1 = (v & 8) == 0 ? rect0 : textUiState0.v;
        Function1 function13 = (v & 16) == 0 ? function10 : textUiState0.w;
        List list1 = (v & 0x20) == 0 ? list0 : textUiState0.x;
        TextMode textMode1 = (v & 0x40) == 0 ? textMode0 : textUiState0.y;
        Function1 function14 = (v & 0x80) == 0 ? function11 : textUiState0.z;
        Function0 function04 = (v & 0x100) == 0 ? function00 : textUiState0.A;
        Function1 function15 = (v & 0x200) == 0 ? function12 : textUiState0.B;
        Function0 function05 = (v & 0x400) == 0 ? function01 : textUiState0.C;
        Function0 function06 = (v & 0x800) == 0 ? function02 : textUiState0.D;
        return (v & 0x1000) == 0 ? textUiState0.copy(kDPhoto2, integer1, kDPhoto3, rect1, function13, list1, textMode1, function14, function04, function15, function05, function06, function03) : textUiState0.copy(kDPhoto2, integer1, kDPhoto3, rect1, function13, list1, textMode1, function14, function04, function15, function05, function06, textUiState0.E);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextUiState)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.s, ((TextUiState)object0).s)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.t, ((TextUiState)object0).t)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.u, ((TextUiState)object0).u)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.v, ((TextUiState)object0).v)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.w, ((TextUiState)object0).w)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.x, ((TextUiState)object0).x)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.y, ((TextUiState)object0).y)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.z, ((TextUiState)object0).z)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.A, ((TextUiState)object0).A)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.B, ((TextUiState)object0).B)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.C, ((TextUiState)object0).C)) {
            return false;
        }
        return Intrinsics.areEqual(this.D, ((TextUiState)object0).D) ? Intrinsics.areEqual(this.E, ((TextUiState)object0).E) : false;
    }

    @NotNull
    public final Function0 getChangeModeToControl() {
        return this.A;
    }

    @NotNull
    public final Function1 getChangeModeToInput() {
        return this.z;
    }

    public final boolean getChanged() {
        return this.F;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public Rect getContentBounds() {
        return this.v;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public DecorationStatus getDecorationStatus(@NotNull Decoration decoration0) {
        Intrinsics.checkNotNullParameter(decoration0, "decoration");
        if(decoration0 instanceof Text) {
            Integer integer0 = this.getSelectedNo();
            if(integer0 != null && ((int)integer0) == ((Text)decoration0).getNo()) {
                return this.y instanceof Input ? DecorationStatus.OnlyView : DecorationStatus.Selected;
            }
        }
        return decoration0 instanceof Text ? DecorationStatus.Enabled : DecorationStatus.Disabled;
    }

    @NotNull
    public final List getFonts() {
        return this.x;
    }

    @NotNull
    public final Function1 getOnChangedContentBounds() {
        return this.w;
    }

    @NotNull
    public final Function0 getOnClickCancel() {
        return this.D;
    }

    @NotNull
    public final Function0 getOnClickConfirm() {
        return this.E;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @NotNull
    public KDPhoto getPhoto() {
        return this.s;
    }

    @NotNull
    public final Function0 getRemoveAllDeco() {
        return this.C;
    }

    @Override  // com.kakao.kandinsky.preview.PreviewUiState
    @Nullable
    public Integer getSelectedNo() {
        return this.t;
    }

    @Nullable
    public final Text getSelectedText() {
        return this.G;
    }

    @NotNull
    public final TextMode getTextMode() {
        return this.y;
    }

    @NotNull
    public final Function1 getUpdateTextData() {
        return this.B;
    }

    @Override
    public int hashCode() {
        int v = this.s.hashCode();
        return this.t == null ? this.E.hashCode() + r0.a.g(this.D, r0.a.g(this.C, r0.a.d(r0.a.g(this.A, r0.a.d((this.y.hashCode() + a5.b.c(this.x, r0.a.d((this.v.hashCode() + (this.u.hashCode() + v * 961) * 0x1F) * 0x1F, 0x1F, this.w), 0x1F)) * 0x1F, 0x1F, this.z), 0x1F), 0x1F, this.B), 0x1F), 0x1F) : this.E.hashCode() + r0.a.g(this.D, r0.a.g(this.C, r0.a.d(r0.a.g(this.A, r0.a.d((this.y.hashCode() + a5.b.c(this.x, r0.a.d((this.v.hashCode() + (this.u.hashCode() + (v * 0x1F + this.t.hashCode()) * 0x1F) * 0x1F) * 0x1F, 0x1F, this.w), 0x1F)) * 0x1F, 0x1F, this.z), 0x1F), 0x1F, this.B), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("TextUiState(photo=");
        stringBuilder0.append(this.s);
        stringBuilder0.append(", selectedNo=");
        stringBuilder0.append(this.t);
        stringBuilder0.append(", savedPhoto=");
        stringBuilder0.append(this.u);
        stringBuilder0.append(", contentBounds=");
        stringBuilder0.append(this.v);
        stringBuilder0.append(", onChangedContentBounds=");
        stringBuilder0.append(this.w);
        stringBuilder0.append(", fonts=");
        stringBuilder0.append(this.x);
        stringBuilder0.append(", textMode=");
        stringBuilder0.append(this.y);
        stringBuilder0.append(", changeModeToInput=");
        stringBuilder0.append(this.z);
        stringBuilder0.append(", changeModeToControl=");
        stringBuilder0.append(this.A);
        stringBuilder0.append(", updateTextData=");
        stringBuilder0.append(this.B);
        stringBuilder0.append(", removeAllDeco=");
        stringBuilder0.append(this.C);
        stringBuilder0.append(", onClickCancel=");
        stringBuilder0.append(this.D);
        stringBuilder0.append(", onClickConfirm=");
        return q.q(stringBuilder0, this.E, ")");
    }
}

