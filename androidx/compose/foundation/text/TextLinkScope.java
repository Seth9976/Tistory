package androidx.compose.foundation.text;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.selection.a;
import androidx.compose.material3.gd;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation.Clickable;
import androidx.compose.ui.text.LinkAnnotation.Url;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import com.google.android.material.search.k;
import d0.s;
import j0.b2;
import j0.m3;
import j0.n3;
import j0.t2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\nR/\u0010\u0017\u001A\u0004\u0018\u00010\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F8F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001B\u001A\u00020\u00028\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001A\u0004\b\u0019\u0010\n\"\u0004\b\u001A\u0010\u0005R\u0017\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001D0\u001C8F¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001F¨\u0006$²\u0006\f\u0010!\u001A\u00020\u001D8\nX\u008A\u0084\u0002²\u0006\f\u0010\"\u001A\u00020\u001D8\nX\u008A\u0084\u0002²\u0006\f\u0010#\u001A\u00020\u001D8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextLinkScope;", "", "Landroidx/compose/ui/text/AnnotatedString;", "initialText", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "LinksComposables", "(Landroidx/compose/runtime/Composer;I)V", "applyAnnotators$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "applyAnnotators", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getInitialText$foundation_release", "Landroidx/compose/ui/text/TextLayoutResult;", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "setTextLayoutResult", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "textLayoutResult", "c", "getText$foundation_release", "setText$foundation_release", "text", "Lkotlin/Function0;", "", "getShouldMeasureLinks", "()Lkotlin/jvm/functions/Function0;", "shouldMeasureLinks", "isHovered", "isFocused", "isPressed", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextLinkScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,284:1\n33#2,6:285\n33#2,4:295\n38#2:318\n33#2,6:320\n81#3:291\n107#3,2:292\n81#3:332\n81#3:333\n81#3:334\n77#4:294\n1#5:299\n1223#6,6:300\n1223#6,6:306\n1223#6,6:312\n1223#6,6:326\n1240#7:319\n*S KotlinDebug\n*F\n+ 1 TextLinkScope.kt\nandroidx/compose/foundation/text/TextLinkScope\n*L\n73#1:285,6\n157#1:295,4\n157#1:318\n228#1:320,6\n67#1:291\n67#1:292,2\n174#1:332\n175#1:333\n176#1:334\n154#1:294\n160#1:300,6\n170#1:306,6\n186#1:312,6\n239#1:326,6\n225#1:319\n*E\n"})
public final class TextLinkScope {
    public static final int $stable = 8;
    public final AnnotatedString a;
    public final MutableState b;
    public AnnotatedString c;
    public final SnapshotStateList d;

    public TextLinkScope(@NotNull AnnotatedString annotatedString0) {
        this.a = annotatedString0;
        this.b = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        Builder annotatedString$Builder0 = new Builder(annotatedString0);
        List list0 = annotatedString0.getLinkAnnotations(0, annotatedString0.length());
        int v1 = list0.size();
        for(int v = 0; v < v1; ++v) {
            Range annotatedString$Range0 = (Range)list0.get(v);
            TextLinkStyles textLinkStyles0 = ((LinkAnnotation)annotatedString$Range0.getItem()).getStyles();
            if(textLinkStyles0 != null) {
                SpanStyle spanStyle0 = textLinkStyles0.getStyle();
                if(spanStyle0 != null) {
                    annotatedString$Builder0.addStyle(spanStyle0, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd());
                }
            }
        }
        this.c = annotatedString$Builder0.toAnnotatedString();
        this.d = SnapshotStateKt.mutableStateListOf();
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void LinksComposables(@Nullable Composer composer0, int v) {
        Modifier modifier1;
        Path path0;
        Composer composer1 = composer0.startRestartGroup(0x44D294DA);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(this) ? 4 : 2) | v : v;
        if((v1 & 3) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x44D294DA, v1, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:152)");
            }
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalUriHandler());
            List list0 = this.c.getLinkAnnotations(0, this.c.length());
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                Range annotatedString$Range0 = (Range)list0.get(v3);
                if(((Boolean)this.getShouldMeasureLinks().invoke()).booleanValue()) {
                    TextLayoutResult textLayoutResult0 = this.getTextLayoutResult();
                    if(textLayoutResult0 != null) {
                        path0 = textLayoutResult0.getPathForRange(annotatedString$Range0.getStart(), annotatedString$Range0.getEnd());
                        Rect rect0 = textLayoutResult0.getBoundingBox(annotatedString$Range0.getStart());
                        Rect rect1 = textLayoutResult0.getBoundingBox(annotatedString$Range0.getEnd() - 1);
                        path0.translate-k-4lQ0M(Offset.unaryMinus-F1C5BW0(OffsetKt.Offset((textLayoutResult0.getLineForOffset(annotatedString$Range0.getStart()) == textLayoutResult0.getLineForOffset(annotatedString$Range0.getEnd()) ? Math.min(rect1.getLeft(), rect0.getLeft()) : 0.0f), rect0.getTop())));
                    }
                }
                else {
                    path0 = null;
                }
                TextLinkScope.shapeForRange.1.1 textLinkScope$shapeForRange$1$10 = path0 == null ? null : new TextLinkScope.shapeForRange.1.1(path0);
                if(textLinkScope$shapeForRange$1$10 == null) {
                    modifier1 = Modifier.Companion;
                }
                else {
                    Modifier modifier0 = ClipKt.clip(Modifier.Companion, textLinkScope$shapeForRange$1$10);
                    if(modifier0 != null) {
                        modifier1 = modifier0;
                    }
                }
                MutableInteractionSource mutableInteractionSource0 = composer1.rememberedValue();
                Companion composer$Companion0 = Composer.Companion;
                if(mutableInteractionSource0 == composer$Companion0.getEmpty()) {
                    mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
                    composer1.updateRememberedValue(mutableInteractionSource0);
                }
                Modifier modifier2 = PointerIconKt.pointerHoverIcon$default(HoverableKt.hoverable$default(modifier1.then(new TextRangeLayoutModifier(new k(this, annotatedString$Range0.getStart(), annotatedString$Range0.getEnd()))), mutableInteractionSource0, false, 2, null), PointerIcon.Companion.getHand(), false, 2, null);
                boolean z = composer1.changedInstance(this);
                boolean z1 = composer1.changed(annotatedString$Range0);
                boolean z2 = composer1.changedInstance(((UriHandler)object0));
                m3 m30 = composer1.rememberedValue();
                if((z | z1 | z2) != 0 || m30 == composer$Companion0.getEmpty()) {
                    m30 = new m3(this, annotatedString$Range0, ((UriHandler)object0));
                    composer1.updateRememberedValue(m30);
                }
                BoxKt.Box(ClickableKt.combinedClickable-XVZzFYc$default(modifier2, mutableInteractionSource0, null, false, null, null, null, null, null, m30, 0xFC, null), composer1, 0);
                State state0 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource0, composer1, 6);
                State state1 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource0, composer1, 6);
                State state2 = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource0, composer1, 6);
                Object object1 = state0.getValue();
                ((Boolean)object1).getClass();
                Object object2 = state1.getValue();
                ((Boolean)object2).getClass();
                Object object3 = state2.getValue();
                ((Boolean)object3).getClass();
                TextLinkStyles textLinkStyles0 = ((LinkAnnotation)annotatedString$Range0.getItem()).getStyles();
                TextLinkStyles textLinkStyles1 = ((LinkAnnotation)annotatedString$Range0.getItem()).getStyles();
                TextLinkStyles textLinkStyles2 = ((LinkAnnotation)annotatedString$Range0.getItem()).getStyles();
                TextLinkStyles textLinkStyles3 = ((LinkAnnotation)annotatedString$Range0.getItem()).getStyles();
                Object[] arr_object = {((Boolean)object1), ((Boolean)object2), ((Boolean)object3), (textLinkStyles0 == null ? null : textLinkStyles0.getStyle()), (textLinkStyles1 == null ? null : textLinkStyles1.getFocusedStyle()), (textLinkStyles2 == null ? null : textLinkStyles2.getHoveredStyle()), (textLinkStyles3 == null ? null : textLinkStyles3.getPressedStyle())};
                boolean z3 = composer1.changedInstance(this);
                boolean z4 = composer1.changed(annotatedString$Range0);
                boolean z5 = composer1.changed(state1);
                boolean z6 = composer1.changed(state0);
                boolean z7 = composer1.changed(state2);
                n3 n30 = composer1.rememberedValue();
                if((z3 | z4 | z5 | z6 | z7) != 0 || n30 == composer$Companion0.getEmpty()) {
                    n3 n31 = new n3(this, annotatedString$Range0, state1, state0, state2);
                    composer1.updateRememberedValue(n31);
                    n30 = n31;
                }
                this.a(arr_object, n30, composer1, v1 << 6 & 0x380);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gd(this, v, 9));
        }
    }

    public final void a(Object[] arr_object, Function1 function10, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-2083052099);
        int v1 = (v & 0x30) == 0 ? (composer1.changedInstance(function10) ? 0x20 : 16) | v : v;
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(this) ? 0x100 : 0x80);
        }
        composer1.startMovableGroup(0xE7296489, ((int)arr_object.length));
        for(int v2 = 0; v2 < arr_object.length; ++v2) {
            v1 |= (composer1.changedInstance(arr_object[v2]) ? 4 : 0);
        }
        composer1.endMovableGroup();
        if((v1 & 14) == 0) {
            v1 |= 2;
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2083052099, v1, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:237)");
            }
            SpreadBuilder spreadBuilder0 = new SpreadBuilder(2);
            spreadBuilder0.add(function10);
            spreadBuilder0.addSpread(arr_object);
            Object[] arr_object1 = spreadBuilder0.toArray(new Object[spreadBuilder0.size()]);
            boolean z = composer1.changedInstance(this);
            b2 b20 = composer1.rememberedValue();
            if((v1 & 0x70) == 0x20 || z || b20 == Composer.Companion.getEmpty()) {
                b20 = new b2(1, this, function10);
                composer1.updateRememberedValue(b20);
            }
            EffectsKt.DisposableEffect(arr_object1, b20, composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, 10, this, arr_object, function10));
        }
    }

    public static final boolean access$LinksComposables$lambda$13$lambda$10(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    public static final boolean access$LinksComposables$lambda$13$lambda$11(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    public static final boolean access$LinksComposables$lambda$13$lambda$9(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    public static final void access$handleLink(TextLinkScope textLinkScope0, LinkAnnotation linkAnnotation0, UriHandler uriHandler0) {
        Unit unit0;
        textLinkScope0.getClass();
        if(linkAnnotation0 instanceof Url) {
            LinkInteractionListener linkInteractionListener0 = linkAnnotation0.getLinkInteractionListener();
            if(linkInteractionListener0 == null) {
                unit0 = null;
            }
            else {
                linkInteractionListener0.onClick(linkAnnotation0);
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                try {
                    uriHandler0.openUri(((Url)linkAnnotation0).getUrl());
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
        }
        else if(linkAnnotation0 instanceof Clickable) {
            LinkInteractionListener linkInteractionListener1 = linkAnnotation0.getLinkInteractionListener();
            if(linkInteractionListener1 != null) {
                linkInteractionListener1.onClick(linkAnnotation0);
            }
        }
    }

    public static final SpanStyle access$mergeOrUse(TextLinkScope textLinkScope0, SpanStyle spanStyle0, SpanStyle spanStyle1) {
        textLinkScope0.getClass();
        if(spanStyle0 != null) {
            SpanStyle spanStyle2 = spanStyle0.merge(spanStyle1);
            return spanStyle2 == null ? spanStyle1 : spanStyle2;
        }
        return spanStyle1;
    }

    @NotNull
    public final AnnotatedString applyAnnotators$foundation_release() {
        AnnotatedString annotatedString0;
        SnapshotStateList snapshotStateList0 = this.d;
        if(snapshotStateList0.isEmpty()) {
            annotatedString0 = this.c;
        }
        else {
            Builder annotatedString$Builder0 = new Builder(0, 1, null);
            annotatedString$Builder0.append(this.a);
            t2 t20 = new t2(annotatedString$Builder0);
            int v1 = snapshotStateList0.size();
            for(int v = 0; v < v1; ++v) {
                ((Function1)snapshotStateList0.get(v)).invoke(t20);
            }
            annotatedString0 = annotatedString$Builder0.toAnnotatedString();
        }
        this.c = annotatedString0;
        return annotatedString0;
    }

    @NotNull
    public final AnnotatedString getInitialText$foundation_release() {
        return this.a;
    }

    @NotNull
    public final Function0 getShouldMeasureLinks() {
        return new s(this, 27);
    }

    @NotNull
    public final AnnotatedString getText$foundation_release() {
        return this.c;
    }

    @Nullable
    public final TextLayoutResult getTextLayoutResult() {
        return (TextLayoutResult)this.b.getValue();
    }

    public final void setText$foundation_release(@NotNull AnnotatedString annotatedString0) {
        this.c = annotatedString0;
    }

    public final void setTextLayoutResult(@Nullable TextLayoutResult textLayoutResult0) {
        this.b.setValue(textLayoutResult0);
    }
}

