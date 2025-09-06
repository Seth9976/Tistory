package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import m0.a1;
import m0.b1;
import m0.c1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0003)*+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n¢\u0006\u0004\b\u000E\u0010\u000FJ0\u0010\u001A\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001D\u001A\u00020\r2\u0006\u0010\u001C\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001D\u0010\u001EJ\'\u0010\"\u001A\u00020\u001B2\u0006\u0010\u001F\u001A\u00020\u001B2\u0006\u0010 \u001A\u00020\u001B2\u0006\u0010!\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u001C\u001A\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b$\u0010%R\u0014\u0010(\u001A\u00020\u001B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b&\u0010\'\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache;", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/runtime/snapshots/StateObject;", "<init>", "()V", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "softWrap", "", "updateNonMeasureInputs", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZZ)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Constraints;", "constraints", "layoutWithNewMeasureInputs--hBUhpc", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Landroidx/compose/ui/text/TextLayoutResult;", "layoutWithNewMeasureInputs", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "previous", "current", "applied", "mergeRecords", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "getValue", "()Landroidx/compose/ui/text/TextLayoutResult;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "m0/a1", "m0/b1", "m0/c1", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldLayoutStateCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,458:1\n232#1,4:466\n237#1:476\n81#2:459\n107#2,2:460\n81#2:462\n107#2,2:463\n2420#3:465\n2302#3:470\n1843#3:471\n2303#3,2:473\n2302#3:477\n1843#3:478\n2303#3,2:480\n89#4:472\n89#4:479\n1#5:475\n1#5:482\n1#5:483\n1240#6:484\n*S KotlinDebug\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache\n*L\n213#1:466,4\n213#1:476\n65#1:459\n65#1:460,2\n69#1:462\n69#1:463,2\n157#1:465\n213#1:470\n213#1:471\n213#1:473,2\n235#1:477\n235#1:478\n235#1:480,2\n213#1:472\n235#1:479\n213#1:475\n235#1:482\n270#1:484\n*E\n"})
public final class TextFieldLayoutStateCache implements State, StateObject {
    public static final int $stable;
    public final MutableState a;
    public final MutableState b;
    public TextMeasurer c;
    public a1 d;

    public TextFieldLayoutStateCache() {
        this.a = SnapshotStateKt.mutableStateOf(null, c1.e.getMutationPolicy());
        this.b = SnapshotStateKt.mutableStateOf(null, b1.g.getMutationPolicy());
        this.d = new a1();
    }

    public final TextLayoutResult a(c1 c10, b1 b10) {
        TextFieldCharSequence textFieldCharSequence0 = c10.a.getVisualText();
        a1 a10 = (a1)SnapshotKt.current(this.d);
        TextLayoutResult textLayoutResult0 = a10.m;
        int v = 1;
        if(textLayoutResult0 != null && (a10.c != null && p.contentEquals(a10.c, textFieldCharSequence0) && Intrinsics.areEqual(a10.d, textFieldCharSequence0.getComposition-MzsxiRA()) && a10.f == c10.c && a10.g == c10.d && a10.j == b10.b && a10.h == b10.a.getDensity() && a10.i == b10.a.getFontScale() && Constraints.equals-impl0(a10.l, b10.d) && Intrinsics.areEqual(a10.k, b10.c) && !textLayoutResult0.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts())) {
            boolean z = a10.e == null ? false : a10.e.hasSameLayoutAffectingAttributes(c10.b);
            if(z && (a10.e == null ? false : a10.e.hasSameDrawAffectingAttributes(c10.b))) {
                return textLayoutResult0;
            }
            if(z) {
                return TextLayoutResult.copy-O0kMr_c$default(textLayoutResult0, new TextLayoutInput(textLayoutResult0.getLayoutInput().getText(), c10.b, textLayoutResult0.getLayoutInput().getPlaceholders(), textLayoutResult0.getLayoutInput().getMaxLines(), textLayoutResult0.getLayoutInput().getSoftWrap(), textLayoutResult0.getLayoutInput().getOverflow-gIe3tQ8(), textLayoutResult0.getLayoutInput().getDensity(), textLayoutResult0.getLayoutInput().getLayoutDirection(), textLayoutResult0.getLayoutInput().getFontFamilyResolver(), textLayoutResult0.getLayoutInput().getConstraints-msEJaDk(), null), 0L, 2, null);
            }
        }
        TextMeasurer textMeasurer0 = this.c;
        if(textMeasurer0 == null) {
            textMeasurer0 = new TextMeasurer(b10.c, b10.a, b10.b, 1);
            this.c = textMeasurer0;
        }
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        annotatedString$Builder0.append(textFieldCharSequence0.toString());
        if(textFieldCharSequence0.getComposition-MzsxiRA() != null) {
            annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, null, 0xEFFF, null), TextRange.getMin-impl(textFieldCharSequence0.getComposition-MzsxiRA().unbox-impl()), TextRange.getMax-impl(textFieldCharSequence0.getComposition-MzsxiRA().unbox-impl()));
        }
        AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
        TextStyle textStyle0 = c10.b;
        if(!c10.c) {
            v = 0x7FFFFFFF;
        }
        TextLayoutResult textLayoutResult1 = TextMeasurer.measure-xDpz5zY$default(textMeasurer0, annotatedString0, textStyle0, 0, c10.d, v, null, b10.d, b10.b, b10.a, b10.c, false, 1060, null);
        if(!Intrinsics.areEqual(textLayoutResult1, textLayoutResult0)) {
            Snapshot snapshot0 = Snapshot.Companion.getCurrent();
            if(!snapshot0.getReadOnly()) {
                synchronized(SnapshotKt.getLock()) {
                    a1 a11 = (a1)SnapshotKt.writableRecord(this.d, this, snapshot0);
                    a11.c = textFieldCharSequence0;
                    a11.d = textFieldCharSequence0.getComposition-MzsxiRA();
                    a11.f = c10.c;
                    a11.g = c10.d;
                    a11.e = c10.b;
                    a11.j = b10.b;
                    a11.h = b10.e;
                    a11.i = b10.f;
                    a11.l = b10.d;
                    a11.k = b10.c;
                    a11.m = textLayoutResult1;
                }
                SnapshotKt.notifyWrite(snapshot0, this);
                return textLayoutResult1;
            }
        }
        return textLayoutResult1;
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.d;
    }

    @Nullable
    public TextLayoutResult getValue() {
        c1 c10 = (c1)this.a.getValue();
        if(c10 == null) {
            return null;
        }
        b1 b10 = (b1)this.b.getValue();
        return b10 == null ? null : this.a(c10, b10);
    }

    @Override  // androidx.compose.runtime.State
    public Object getValue() {
        return this.getValue();
    }

    @NotNull
    public final TextLayoutResult layoutWithNewMeasureInputs--hBUhpc(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0, @NotNull Resolver fontFamily$Resolver0, long v) {
        b1 b10 = new b1(density0, layoutDirection0, fontFamily$Resolver0, v);
        this.b.setValue(b10);
        c1 c10 = (c1)this.a.getValue();
        if(c10 == null) {
            throw new IllegalStateException("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
        }
        return this.a(c10, b10);
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord mergeRecords(@NotNull StateRecord stateRecord0, @NotNull StateRecord stateRecord1, @NotNull StateRecord stateRecord2) {
        return stateRecord2;
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord stateRecord0) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.d = (a1)stateRecord0;
    }

    public final void updateNonMeasureInputs(@NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextStyle textStyle0, boolean z, boolean z1) {
        c1 c10 = new c1(transformedTextFieldState0, textStyle0, z, z1);
        this.a.setValue(c10);
    }
}

