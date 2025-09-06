package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\b\b\u0002\u0010\u000F\u001A\u00020\r\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0016\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001C\u001A\u00020\u000B2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AH\u0096\u0002¢\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u001E\u0010\u001FJ\u0013\u0010!\u001A\u00020\u0017*\u00020 H\u0016¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "node", "", "update", "(Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextStringSimpleElement extends ModifierNodeElement {
    public static final int $stable;
    public final String b;
    public final TextStyle c;
    public final Resolver d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final ColorProducer i;

    public TextStringSimpleElement(String s, TextStyle textStyle0, Resolver fontFamily$Resolver0, int v, boolean z, int v1, int v2, ColorProducer colorProducer0, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, textStyle0, fontFamily$Resolver0, ((v3 & 8) == 0 ? v : 1), ((v3 & 16) == 0 ? z : true), ((v3 & 0x20) == 0 ? v1 : 0x7FFFFFFF), ((v3 & 0x40) == 0 ? v2 : 1), ((v3 & 0x80) == 0 ? colorProducer0 : null), null);
    }

    public TextStringSimpleElement(String s, TextStyle textStyle0, Resolver fontFamily$Resolver0, int v, boolean z, int v1, int v2, ColorProducer colorProducer0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.b = s;
        this.c = textStyle0;
        this.d = fontFamily$Resolver0;
        this.e = v;
        this.f = z;
        this.g = v1;
        this.h = v2;
        this.i = colorProducer0;
    }

    @NotNull
    public TextStringSimpleNode create() {
        return new TextStringSimpleNode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
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
        if(!(object0 instanceof TextStringSimpleElement)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((TextStringSimpleElement)object0).i)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((TextStringSimpleElement)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((TextStringSimpleElement)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((TextStringSimpleElement)object0).d)) {
            return false;
        }
        if(!TextOverflow.equals-impl0(this.e, ((TextStringSimpleElement)object0).e)) {
            return false;
        }
        if(this.f != ((TextStringSimpleElement)object0).f) {
            return false;
        }
        return this.g == ((TextStringSimpleElement)object0).g ? this.h == ((TextStringSimpleElement)object0).h : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int v = ((a.e((TextOverflow.hashCode-impl(this.e) + (this.d.hashCode() + q.b(this.b.hashCode() * 0x1F, 0x1F, this.c)) * 0x1F) * 0x1F, 0x1F, this.f) + this.g) * 0x1F + this.h) * 0x1F;
        return this.i == null ? v : v + this.i.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
    }

    public void update(@NotNull TextStringSimpleNode textStringSimpleNode0) {
        textStringSimpleNode0.doInvalidations(textStringSimpleNode0.updateDraw(this.i, this.c), textStringSimpleNode0.updateText(this.b), textStringSimpleNode0.updateLayoutRelatedArgs-HuAbxIM(this.c, this.h, this.g, this.f, this.d, this.e));
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((TextStringSimpleNode)modifier$Node0));
    }
}

