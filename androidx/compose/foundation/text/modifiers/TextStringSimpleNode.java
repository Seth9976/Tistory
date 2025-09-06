package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import m0.b0;
import o0.d;
import o0.e;
import o0.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001<BS\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u000F\u0012\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0017\u001A\u00020\r2\b\u0010\u0016\u001A\u0004\u0018\u00010\u00122\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001A\u00020\r2\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0019\u0010\u001AJ@\u0010\u001D\u001A\u00020\r2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ%\u0010\"\u001A\u00020!2\u0006\u0010\u001E\u001A\u00020\r2\u0006\u0010\u001F\u001A\u00020\r2\u0006\u0010 \u001A\u00020\r\u00A2\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001A\u00020!*\u00020$H\u0016\u00A2\u0006\u0004\b%\u0010&J&\u0010/\u001A\u00020,*\u00020\'2\u0006\u0010)\u001A\u00020(2\u0006\u0010+\u001A\u00020*H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b-\u0010.J#\u00103\u001A\u00020\u000F*\u0002002\u0006\u0010)\u001A\u0002012\u0006\u00102\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b3\u00104J#\u00106\u001A\u00020\u000F*\u0002002\u0006\u0010)\u001A\u0002012\u0006\u00105\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b6\u00104J#\u00107\u001A\u00020\u000F*\u0002002\u0006\u0010)\u001A\u0002012\u0006\u00102\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b7\u00104J#\u00108\u001A\u00020\u000F*\u0002002\u0006\u0010)\u001A\u0002012\u0006\u00105\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b8\u00104J\u0013\u0010:\u001A\u00020!*\u000209H\u0016\u00A2\u0006\u0004\b:\u0010;\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006="}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/ColorProducer;", "overrideColor", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "color", "updateDraw", "(Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/text/TextStyle;)Z", "updateText", "(Ljava/lang/String;)Z", "updateLayoutRelatedArgs-HuAbxIM", "(Landroidx/compose/ui/text/TextStyle;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "updateLayoutRelatedArgs", "drawChanged", "textChanged", "layoutChanged", "", "doInvalidations", "(ZZZ)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "TextSubstitutionValue", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextStringSimpleNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,470:1\n1#2:471\n26#3:472\n26#3:473\n256#4:474\n696#5:475\n696#5:476\n*S KotlinDebug\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n*L\n362#1:472\n363#1:473\n422#1:474\n447#1:475\n449#1:476\n*E\n"})
public final class TextStringSimpleNode extends Node implements DrawModifierNode, LayoutModifierNode, SemanticsModifierNode {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000E\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000E\u0010\fJ\u0010\u0010\u000F\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0012\u0010\u0011\u001A\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u0019\u001A\u00020\u00052\b\u0010\u0018\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\fR\"\u0010\u0004\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u001C\u001A\u0004\b\u001F\u0010\f\"\u0004\b \u0010!R\"\u0010\u0006\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b\u0006\u0010\u0010\"\u0004\b$\u0010%R$\u0010\b\u001A\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0012\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "", "", "original", "substitution", "", "isShowingSubstitution", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "layoutCache", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "()Z", "component4", "()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;)Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOriginal", "b", "getSubstitution", "setSubstitution", "(Ljava/lang/String;)V", "c", "Z", "setShowingSubstitution", "(Z)V", "d", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "getLayoutCache", "setLayoutCache", "(Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class TextSubstitutionValue {
        public static final int $stable = 8;
        public final String a;
        public String b;
        public boolean c;
        public ParagraphLayoutCache d;

        public TextSubstitutionValue(@NotNull String s, @NotNull String s1, boolean z, @Nullable ParagraphLayoutCache paragraphLayoutCache0) {
            this.a = s;
            this.b = s1;
            this.c = z;
            this.d = paragraphLayoutCache0;
        }

        public TextSubstitutionValue(String s, String s1, boolean z, ParagraphLayoutCache paragraphLayoutCache0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 4) != 0) {
                z = false;
            }
            if((v & 8) != 0) {
                paragraphLayoutCache0 = null;
            }
            this(s, s1, z, paragraphLayoutCache0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final String component2() {
            return this.b;
        }

        public final boolean component3() {
            return this.c;
        }

        @Nullable
        public final ParagraphLayoutCache component4() {
            return this.d;
        }

        @NotNull
        public final TextSubstitutionValue copy(@NotNull String s, @NotNull String s1, boolean z, @Nullable ParagraphLayoutCache paragraphLayoutCache0) {
            return new TextSubstitutionValue(s, s1, z, paragraphLayoutCache0);
        }

        public static TextSubstitutionValue copy$default(TextSubstitutionValue textStringSimpleNode$TextSubstitutionValue0, String s, String s1, boolean z, ParagraphLayoutCache paragraphLayoutCache0, int v, Object object0) {
            if((v & 1) != 0) {
                s = textStringSimpleNode$TextSubstitutionValue0.a;
            }
            if((v & 2) != 0) {
                s1 = textStringSimpleNode$TextSubstitutionValue0.b;
            }
            if((v & 4) != 0) {
                z = textStringSimpleNode$TextSubstitutionValue0.c;
            }
            if((v & 8) != 0) {
                paragraphLayoutCache0 = textStringSimpleNode$TextSubstitutionValue0.d;
            }
            return textStringSimpleNode$TextSubstitutionValue0.copy(s, s1, z, paragraphLayoutCache0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof TextSubstitutionValue)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((TextSubstitutionValue)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((TextSubstitutionValue)object0).b)) {
                return false;
            }
            return this.c == ((TextSubstitutionValue)object0).c ? Intrinsics.areEqual(this.d, ((TextSubstitutionValue)object0).d) : false;
        }

        @Nullable
        public final ParagraphLayoutCache getLayoutCache() {
            return this.d;
        }

        @NotNull
        public final String getOriginal() {
            return this.a;
        }

        @NotNull
        public final String getSubstitution() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = a.e(q.c(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c);
            return this.d == null ? v : v + this.d.hashCode();
        }

        public final boolean isShowingSubstitution() {
            return this.c;
        }

        public final void setLayoutCache(@Nullable ParagraphLayoutCache paragraphLayoutCache0) {
            this.d = paragraphLayoutCache0;
        }

        public final void setShowingSubstitution(boolean z) {
            this.c = z;
        }

        public final void setSubstitution(@NotNull String s) {
            this.b = s;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("TextSubstitution(layoutCache=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", isShowingSubstitution=");
            return a.p(stringBuilder0, this.c, ')');
        }
    }

    public static final int $stable = 8;
    public String n;
    public TextStyle o;
    public Resolver p;
    public int q;
    public boolean r;
    public int s;
    public int t;
    public ColorProducer u;
    public Map v;
    public ParagraphLayoutCache w;
    public d x;
    public TextSubstitutionValue y;

    public TextStringSimpleNode(String s, TextStyle textStyle0, Resolver fontFamily$Resolver0, int v, boolean z, int v1, int v2, ColorProducer colorProducer0, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, textStyle0, fontFamily$Resolver0, ((v3 & 8) == 0 ? v : 1), ((v3 & 16) == 0 ? z : true), ((v3 & 0x20) == 0 ? v1 : 0x7FFFFFFF), ((v3 & 0x40) == 0 ? v2 : 1), ((v3 & 0x80) == 0 ? colorProducer0 : null), null);
    }

    public TextStringSimpleNode(String s, TextStyle textStyle0, Resolver fontFamily$Resolver0, int v, boolean z, int v1, int v2, ColorProducer colorProducer0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.n = s;
        this.o = textStyle0;
        this.p = fontFamily$Resolver0;
        this.q = v;
        this.r = z;
        this.s = v1;
        this.t = v2;
        this.u = colorProducer0;
    }

    public static final void access$clearSubstitution(TextStringSimpleNode textStringSimpleNode0) {
        textStringSimpleNode0.y = null;
    }

    public static final void access$invalidateForTranslate(TextStringSimpleNode textStringSimpleNode0) {
        textStringSimpleNode0.getClass();
        SemanticsModifierNodeKt.invalidateSemantics(textStringSimpleNode0);
        LayoutModifierNodeKt.invalidateMeasurement(textStringSimpleNode0);
        DrawModifierNodeKt.invalidateDraw(textStringSimpleNode0);
    }

    public static final boolean access$setSubstitution(TextStringSimpleNode textStringSimpleNode0, String s) {
        TextSubstitutionValue textStringSimpleNode$TextSubstitutionValue0 = textStringSimpleNode0.y;
        if(textStringSimpleNode$TextSubstitutionValue0 != null) {
            if(!Intrinsics.areEqual(s, textStringSimpleNode$TextSubstitutionValue0.getSubstitution())) {
                textStringSimpleNode$TextSubstitutionValue0.setSubstitution(s);
                ParagraphLayoutCache paragraphLayoutCache0 = textStringSimpleNode$TextSubstitutionValue0.getLayoutCache();
                if(paragraphLayoutCache0 != null) {
                    paragraphLayoutCache0.update-L6sJoHM(s, textStringSimpleNode0.o, textStringSimpleNode0.p, textStringSimpleNode0.q, textStringSimpleNode0.r, textStringSimpleNode0.s, textStringSimpleNode0.t);
                    return Unit.INSTANCE != null;
                }
                return false;
            }
            return false;
        }
        TextSubstitutionValue textStringSimpleNode$TextSubstitutionValue1 = new TextSubstitutionValue(textStringSimpleNode0.n, s, false, null, 12, null);
        ParagraphLayoutCache paragraphLayoutCache1 = new ParagraphLayoutCache(s, textStringSimpleNode0.o, textStringSimpleNode0.p, textStringSimpleNode0.q, textStringSimpleNode0.r, textStringSimpleNode0.s, textStringSimpleNode0.t, null);
        paragraphLayoutCache1.setDensity$foundation_release(textStringSimpleNode0.b().getDensity$foundation_release());
        textStringSimpleNode$TextSubstitutionValue1.setLayoutCache(paragraphLayoutCache1);
        textStringSimpleNode0.y = textStringSimpleNode$TextSubstitutionValue1;
        return true;
    }

    @Override  // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        d d0 = this.x;
        if(d0 == null) {
            d0 = new d(this);
            this.x = d0;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver0, new AnnotatedString(this.n, null, null, 6, null));
        TextSubstitutionValue textStringSimpleNode$TextSubstitutionValue0 = this.y;
        if(textStringSimpleNode$TextSubstitutionValue0 != null) {
            SemanticsPropertiesKt.setShowingTextSubstitution(semanticsPropertyReceiver0, textStringSimpleNode$TextSubstitutionValue0.isShowingSubstitution());
            SemanticsPropertiesKt.setTextSubstitution(semanticsPropertyReceiver0, new AnnotatedString(textStringSimpleNode$TextSubstitutionValue0.getSubstitution(), null, null, 6, null));
        }
        SemanticsPropertiesKt.setTextSubstitution$default(semanticsPropertyReceiver0, null, new b0(this, 10), 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default(semanticsPropertyReceiver0, null, new b(this), 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default(semanticsPropertyReceiver0, null, new e(this, 0), 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver0, null, d0, 1, null);
    }

    public final ParagraphLayoutCache b() {
        if(this.w == null) {
            this.w = new ParagraphLayoutCache(this.n, this.o, this.p, this.q, this.r, this.s, this.t, null);
        }
        ParagraphLayoutCache paragraphLayoutCache0 = this.w;
        Intrinsics.checkNotNull(paragraphLayoutCache0);
        return paragraphLayoutCache0;
    }

    public final ParagraphLayoutCache c(Density density0) {
        TextSubstitutionValue textStringSimpleNode$TextSubstitutionValue0 = this.y;
        if(textStringSimpleNode$TextSubstitutionValue0 != null && textStringSimpleNode$TextSubstitutionValue0.isShowingSubstitution()) {
            ParagraphLayoutCache paragraphLayoutCache0 = textStringSimpleNode$TextSubstitutionValue0.getLayoutCache();
            if(paragraphLayoutCache0 != null) {
                paragraphLayoutCache0.setDensity$foundation_release(density0);
                return paragraphLayoutCache0;
            }
        }
        ParagraphLayoutCache paragraphLayoutCache1 = this.b();
        paragraphLayoutCache1.setDensity$foundation_release(density0);
        return paragraphLayoutCache1;
    }

    public final void doInvalidations(boolean z, boolean z1, boolean z2) {
        if(z1 || z2) {
            this.b().update-L6sJoHM(this.n, this.o, this.p, this.q, this.r, this.s, this.t);
        }
        if(!this.isAttached()) {
            return;
        }
        if(z1 || z && this.x != null) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if(z1 || z2) {
            LayoutModifierNodeKt.invalidateMeasurement(this);
            DrawModifierNodeKt.invalidateDraw(this);
        }
        if(z) {
            DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope0) {
        if(!this.isAttached()) {
            return;
        }
        ParagraphLayoutCache paragraphLayoutCache0 = this.c(contentDrawScope0);
        Paragraph paragraph0 = paragraphLayoutCache0.getParagraph$foundation_release();
        if(paragraph0 == null) {
            throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.w + ", textSubstitution=" + this.y + ')').toString());
        }
        Canvas canvas0 = contentDrawScope0.getDrawContext().getCanvas();
        boolean z = paragraphLayoutCache0.getDidOverflow$foundation_release();
        if(z) {
            canvas0.save();
            Canvas.clipRect-N_I0leg$default(canvas0, 0.0f, 0.0f, ((float)IntSize.getWidth-impl(paragraphLayoutCache0.getLayoutSize-YbymL2g$foundation_release())), ((float)IntSize.getHeight-impl(paragraphLayoutCache0.getLayoutSize-YbymL2g$foundation_release())), 0, 16, null);
        }
        try {
            TextDecoration textDecoration0 = this.o.getTextDecoration();
            if(textDecoration0 == null) {
                textDecoration0 = TextDecoration.Companion.getNone();
            }
            Shadow shadow0 = this.o.getShadow();
            if(shadow0 == null) {
                shadow0 = Shadow.Companion.getNone();
            }
            DrawStyle drawStyle0 = this.o.getDrawStyle();
            if(drawStyle0 == null) {
                drawStyle0 = Fill.INSTANCE;
            }
            Brush brush0 = this.o.getBrush();
            if(brush0 == null) {
                long v1 = this.u == null ? 0L : this.u.invoke-0d7_KjU();
                if(v1 == 16L) {
                    v1 = this.o.getColor-0d7_KjU() == 16L ? 0xFF00000000000000L : this.o.getColor-0d7_KjU();
                }
                Paragraph.paint-LG529CI$default(paragraph0, canvas0, v1, shadow0, textDecoration0, drawStyle0, 0, 0x20, null);
            }
            else {
                Paragraph.paint-hn5TExg$default(paragraph0, canvas0, brush0, this.o.getAlpha(), shadow0, textDecoration0, drawStyle0, 0, 0x40, null);
            }
        }
        finally {
            if(z) {
                canvas0.restore();
            }
        }
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.c(intrinsicMeasureScope0).intrinsicHeight(v, intrinsicMeasureScope0.getLayoutDirection());
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.c(intrinsicMeasureScope0).maxIntrinsicWidth(intrinsicMeasureScope0.getLayoutDirection());
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        ParagraphLayoutCache paragraphLayoutCache0 = this.c(measureScope0);
        boolean z = paragraphLayoutCache0.layoutWithConstraints-K40F9xA(v, measureScope0.getLayoutDirection());
        paragraphLayoutCache0.getObserveFontChanges$foundation_release();
        Paragraph paragraph0 = paragraphLayoutCache0.getParagraph$foundation_release();
        Intrinsics.checkNotNull(paragraph0);
        long v1 = paragraphLayoutCache0.getLayoutSize-YbymL2g$foundation_release();
        if(z) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Map map0 = this.v;
            if(map0 == null) {
                map0 = new LinkedHashMap(2);
            }
            map0.put(AlignmentLineKt.getFirstBaseline(), Math.round(paragraph0.getFirstBaseline()));
            map0.put(AlignmentLineKt.getLastBaseline(), Math.round(paragraph0.getLastBaseline()));
            this.v = map0;
        }
        Placeable placeable0 = measurable0.measure-BRTryo0(Constraints.Companion.fitPrioritizingWidth-Zbe2FdA(IntSize.getWidth-impl(v1), IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1), IntSize.getHeight-impl(v1)));
        Map map1 = this.v;
        Intrinsics.checkNotNull(map1);
        return measureScope0.layout(IntSize.getWidth-impl(v1), IntSize.getHeight-impl(v1), map1, new f(placeable0));
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.c(intrinsicMeasureScope0).intrinsicHeight(v, intrinsicMeasureScope0.getLayoutDirection());
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope0, @NotNull IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return this.c(intrinsicMeasureScope0).minIntrinsicWidth(intrinsicMeasureScope0.getLayoutDirection());
    }

    public final boolean updateDraw(@Nullable ColorProducer colorProducer0, @NotNull TextStyle textStyle0) {
        boolean z = Intrinsics.areEqual(colorProducer0, this.u);
        this.u = colorProducer0;
        return !z || !textStyle0.hasSameDrawAffectingAttributes(this.o);
    }

    public final boolean updateLayoutRelatedArgs-HuAbxIM(@NotNull TextStyle textStyle0, int v, int v1, boolean z, @NotNull Resolver fontFamily$Resolver0, int v2) {
        int v3 = !this.o.hasSameLayoutAffectingAttributes(textStyle0);
        this.o = textStyle0;
        if(this.t != v) {
            this.t = v;
            v3 = 1;
        }
        if(this.s != v1) {
            this.s = v1;
            v3 = 1;
        }
        if(this.r != z) {
            this.r = z;
            v3 = 1;
        }
        if(!Intrinsics.areEqual(this.p, fontFamily$Resolver0)) {
            this.p = fontFamily$Resolver0;
            v3 = 1;
        }
        if(!TextOverflow.equals-impl0(this.q, v2)) {
            this.q = v2;
            return true;
        }
        return v3;
    }

    public final boolean updateText(@NotNull String s) {
        if(Intrinsics.areEqual(this.n, s)) {
            return false;
        }
        this.n = s;
        this.y = null;
        return true;
    }
}

