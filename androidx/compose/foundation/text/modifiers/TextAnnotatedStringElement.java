package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextOverflow;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001A\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\t\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001A\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001E\b\u0002\u0010\u0019\u001A\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000B\u0018\u00010\t\u0012\n\b\u0002\u0010\u001B\u001A\u0004\u0018\u00010\u001A\u0012\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u0012\u0016\b\u0002\u0010\u001F\u001A\u0010\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u000B\u0018\u00010\t¢\u0006\u0004\b \u0010!J\u000F\u0010\"\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001A\u00020\u000B2\u0006\u0010$\u001A\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u001A\u0010)\u001A\u00020\u000F2\b\u0010(\u001A\u0004\u0018\u00010\'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000F\u0010+\u001A\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001A\u00020\u000B*\u00020-H\u0016¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "node", "update", "(Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextAnnotatedStringElement extends ModifierNodeElement {
    public static final int $stable;
    public final AnnotatedString b;
    public final TextStyle c;
    public final Resolver d;
    public final Function1 e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final List j;
    public final Function1 k;
    public final SelectionController l;
    public final ColorProducer m;
    public final Function1 n;

    public TextAnnotatedStringElement(AnnotatedString annotatedString0, TextStyle textStyle0, Resolver fontFamily$Resolver0, Function1 function10, int v, boolean z, int v1, int v2, List list0, Function1 function11, SelectionController selectionController0, ColorProducer colorProducer0, Function1 function12, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, textStyle0, fontFamily$Resolver0, ((v3 & 8) == 0 ? function10 : null), ((v3 & 16) == 0 ? v : 1), ((v3 & 0x20) == 0 ? z : true), ((v3 & 0x40) == 0 ? v1 : 0x7FFFFFFF), ((v3 & 0x80) == 0 ? v2 : 1), ((v3 & 0x100) == 0 ? list0 : null), ((v3 & 0x200) == 0 ? function11 : null), ((v3 & 0x400) == 0 ? selectionController0 : null), ((v3 & 0x800) == 0 ? colorProducer0 : null), ((v3 & 0x1000) == 0 ? function12 : null), null);
    }

    public TextAnnotatedStringElement(AnnotatedString annotatedString0, TextStyle textStyle0, Resolver fontFamily$Resolver0, Function1 function10, int v, boolean z, int v1, int v2, List list0, Function1 function11, SelectionController selectionController0, ColorProducer colorProducer0, Function1 function12, DefaultConstructorMarker defaultConstructorMarker0) {
        this.b = annotatedString0;
        this.c = textStyle0;
        this.d = fontFamily$Resolver0;
        this.e = function10;
        this.f = v;
        this.g = z;
        this.h = v1;
        this.i = v2;
        this.j = list0;
        this.k = function11;
        this.l = selectionController0;
        this.m = colorProducer0;
        this.n = function12;
    }

    @NotNull
    public TextAnnotatedStringNode create() {
        return new TextAnnotatedStringNode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, null);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextAnnotatedStringElement)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.m, ((TextAnnotatedStringElement)object0).m)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((TextAnnotatedStringElement)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((TextAnnotatedStringElement)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.j, ((TextAnnotatedStringElement)object0).j)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((TextAnnotatedStringElement)object0).d)) {
            return false;
        }
        if(this.e != ((TextAnnotatedStringElement)object0).e) {
            return false;
        }
        if(this.n != ((TextAnnotatedStringElement)object0).n) {
            return false;
        }
        if(!TextOverflow.equals-impl0(this.f, ((TextAnnotatedStringElement)object0).f)) {
            return false;
        }
        if(this.g != ((TextAnnotatedStringElement)object0).g) {
            return false;
        }
        if(this.h != ((TextAnnotatedStringElement)object0).h) {
            return false;
        }
        if(this.i != ((TextAnnotatedStringElement)object0).i) {
            return false;
        }
        return this.k == ((TextAnnotatedStringElement)object0).k ? Intrinsics.areEqual(this.l, ((TextAnnotatedStringElement)object0).l) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int v = 0;
        int v1 = ((a.e((TextOverflow.hashCode-impl(this.f) + ((this.d.hashCode() + q.b(this.b.hashCode() * 0x1F, 0x1F, this.c)) * 0x1F + (this.e == null ? 0 : this.e.hashCode())) * 0x1F) * 0x1F, 0x1F, this.g) + this.h) * 0x1F + this.i) * 0x1F;
        int v2 = this.j == null ? 0 : this.j.hashCode();
        int v3 = this.k == null ? 0 : this.k.hashCode();
        int v4 = this.l == null ? 0 : this.l.hashCode();
        int v5 = this.m == null ? 0 : this.m.hashCode();
        Function1 function10 = this.n;
        if(function10 != null) {
            v = function10.hashCode();
        }
        return ((((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
    }

    public void update(@NotNull TextAnnotatedStringNode textAnnotatedStringNode0) {
        textAnnotatedStringNode0.doInvalidations(textAnnotatedStringNode0.updateDraw(this.m, this.c), textAnnotatedStringNode0.updateText$foundation_release(this.b), textAnnotatedStringNode0.updateLayoutRelatedArgs-MPT68mk(this.c, this.j, this.i, this.h, this.g, this.d, this.f), textAnnotatedStringNode0.updateCallbacks(this.e, this.k, this.l, this.n));
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((TextAnnotatedStringNode)modifier$Node0));
    }
}

