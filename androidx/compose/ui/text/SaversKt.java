package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset.Companion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00B2\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AK\u0010\t\u001A\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\t\u0010\n\u001AN\u0010\f\u001A\u0004\u0018\u00018\u0003\"\u0014\b\u0000\u0010\u0001*\u000E\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0006\b\u0003\u0010\u000B\u0018\u00012\b\u0010\u0004\u001A\u0004\u0018\u00018\u00022\u0006\u0010\u0005\u001A\u00028\u0000H\u0080\b\u00A2\u0006\u0004\b\f\u0010\r\u001A!\u0010\t\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001A\u0004\u0018\u00018\u0000H\u0000\u00A2\u0006\u0004\b\t\u0010\u000E\u001A$\u0010\f\u001A\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000B\u0018\u00012\b\u0010\u0004\u001A\u0004\u0018\u00010\bH\u0080\b\u00A2\u0006\u0004\b\f\u0010\u000E\"&\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"&\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u0016\u0010\u0011\u001A\u0004\b\u0017\u0010\u0013\"&\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u001A\u0010\u0011\u001A\u0004\b\u001B\u0010\u0013\"&\u0010 \u001A\u000E\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u001E\u0010\u0011\u001A\u0004\b\u001F\u0010\u0013\"$\u0010%\u001A\u000E\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\u0000*\u00020!8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010$\"$\u0010%\u001A\u000E\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\b0\u0000*\u00020&8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010(\"$\u0010%\u001A\u000E\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\b0\u0000*\u00020)8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010+\"$\u0010%\u001A\u000E\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\u0000*\u00020,8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010.\"$\u0010%\u001A\u000E\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\b0\u0000*\u00020/8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u00101\"$\u0010%\u001A\u000E\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\b0\u0000*\u0002028@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u00104\"$\u0010%\u001A\u000E\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\b0\u0000*\u0002058@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u00107\"$\u0010%\u001A\u000E\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\b0\u0000*\u0002088@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010:\"$\u0010%\u001A\u000E\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\b0\u0000*\u00020;8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010=\"$\u0010%\u001A\u000E\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\b0\u0000*\u00020>8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010@\"$\u0010%\u001A\u000E\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\b0\u0000*\u00020A8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010C\"$\u0010%\u001A\u000E\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\b0\u0000*\u00020D8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010F\u00A8\u0006G"}, d2 = {"Landroidx/compose/runtime/saveable/Saver;", "T", "Original", "Saveable", "value", "saver", "Landroidx/compose/runtime/saveable/SaverScope;", "scope", "", "save", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;", "Result", "restore", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/text/AnnotatedString;", "a", "Landroidx/compose/runtime/saveable/Saver;", "getAnnotatedStringSaver", "()Landroidx/compose/runtime/saveable/Saver;", "AnnotatedStringSaver", "Landroidx/compose/ui/text/ParagraphStyle;", "h", "getParagraphStyleSaver", "ParagraphStyleSaver", "Landroidx/compose/ui/text/SpanStyle;", "i", "getSpanStyleSaver", "SpanStyleSaver", "Landroidx/compose/ui/text/TextLinkStyles;", "j", "getTextLinkStylesSaver", "TextLinkStylesSaver", "Landroidx/compose/ui/text/style/TextDecoration$Companion;", "Landroidx/compose/ui/text/style/TextDecoration;", "getSaver", "(Landroidx/compose/ui/text/style/TextDecoration$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Saver", "Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "(Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextIndent$Companion;", "Landroidx/compose/ui/text/style/TextIndent;", "(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "Landroidx/compose/ui/text/font/FontWeight;", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/BaselineShift$Companion;", "Landroidx/compose/ui/text/style/BaselineShift;", "(Landroidx/compose/ui/text/style/BaselineShift$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/TextRange$Companion;", "Landroidx/compose/ui/text/TextRange;", "(Landroidx/compose/ui/text/TextRange$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Shadow$Companion;", "Landroidx/compose/ui/graphics/Shadow;", "(Landroidx/compose/ui/graphics/Shadow$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Color$Companion;", "Landroidx/compose/ui/graphics/Color;", "(Landroidx/compose/ui/graphics/Color$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnit$Companion;", "Landroidx/compose/ui/unit/TextUnit;", "(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/LocaleList$Companion;", "Landroidx/compose/ui/text/intl/LocaleList;", "(Landroidx/compose/ui/text/intl/LocaleList$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/Locale$Companion;", "Landroidx/compose/ui/text/intl/Locale;", "(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n1#2:542\n*E\n"})
public final class SaversKt {
    public static final Saver a;
    public static final Saver b;
    public static final Saver c;
    public static final Saver d;
    public static final Saver e;
    public static final Saver f;
    public static final Saver g;
    public static final Saver h;
    public static final Saver i;
    public static final Saver j;
    public static final Saver k;
    public static final Saver l;
    public static final Saver m;
    public static final Saver n;
    public static final Saver o;
    public static final Saver p;
    public static final Saver q;
    public static final SaversKt.NonNullValueClassSaver.1 r;
    public static final SaversKt.NonNullValueClassSaver.1 s;
    public static final SaversKt.NonNullValueClassSaver.1 t;
    public static final Saver u;
    public static final Saver v;

    static {
        SaversKt.a = SaverKt.Saver(l.x, m.w);
        SaversKt.b = SaverKt.Saver(n.w, o.w);
        SaversKt.c = SaverKt.Saver(p.w, q.w);
        SaversKt.d = SaverKt.Saver(l.H, s.F);
        SaversKt.e = SaverKt.Saver(l.G, s.E);
        SaversKt.f = SaverKt.Saver(w.w, x.w);
        SaversKt.g = SaverKt.Saver(t.w, u.w);
        SaversKt.h = SaverKt.Saver(c0.w, d0.w);
        SaversKt.i = SaverKt.Saver(g0.w, h0.w);
        SaversKt.j = SaverKt.Saver(l.E, s.C);
        SaversKt.k = SaverKt.Saver(l.C, s.A);
        SaversKt.l = SaverKt.Saver(l.D, s.B);
        SaversKt.m = SaverKt.Saver(i0.w, j0.w);
        SaversKt.n = SaverKt.Saver(l.A, s.y);
        SaversKt.o = SaverKt.Saver(l.y, s.x);
        SaversKt.p = SaverKt.Saver(l.F, s.D);
        SaversKt.q = SaverKt.Saver(e0.w, f0.w);
        SaversKt.r = new SaversKt.NonNullValueClassSaver.1(l.z, v.w);
        SaversKt.s = new SaversKt.NonNullValueClassSaver.1(k0.w, l0.w);
        SaversKt.t = new SaversKt.NonNullValueClassSaver.1(a0.w, b0.w);
        SaversKt.u = SaverKt.Saver(y.w, z.w);
        SaversKt.v = SaverKt.Saver(l.B, s.z);
    }

    @NotNull
    public static final Saver getAnnotatedStringSaver() {
        return SaversKt.a;
    }

    @NotNull
    public static final Saver getParagraphStyleSaver() {
        return SaversKt.h;
    }

    @NotNull
    public static final Saver getSaver(@NotNull Companion offset$Companion0) {
        return SaversKt.t;
    }

    @NotNull
    public static final Saver getSaver(@NotNull androidx.compose.ui.graphics.Color.Companion color$Companion0) {
        return SaversKt.r;
    }

    @NotNull
    public static final Saver getSaver(@NotNull androidx.compose.ui.graphics.Shadow.Companion shadow$Companion0) {
        return SaversKt.q;
    }

    @NotNull
    public static final Saver getSaver(@NotNull androidx.compose.ui.text.TextRange.Companion textRange$Companion0) {
        return SaversKt.p;
    }

    @NotNull
    public static final Saver getSaver(@NotNull androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0) {
        return SaversKt.n;
    }

    @NotNull
    public static final Saver getSaver(@NotNull androidx.compose.ui.text.intl.Locale.Companion locale$Companion0) {
        return SaversKt.v;
    }

    @NotNull
    public static final Saver getSaver(@NotNull androidx.compose.ui.text.intl.LocaleList.Companion localeList$Companion0) {
        return SaversKt.u;
    }

    @NotNull
    public static final Saver getSaver(@NotNull androidx.compose.ui.text.style.BaselineShift.Companion baselineShift$Companion0) {
        return SaversKt.o;
    }

    @NotNull
    public static final Saver getSaver(@NotNull androidx.compose.ui.text.style.TextDecoration.Companion textDecoration$Companion0) {
        return SaversKt.k;
    }

    @NotNull
    public static final Saver getSaver(@NotNull androidx.compose.ui.text.style.TextGeometricTransform.Companion textGeometricTransform$Companion0) {
        return SaversKt.l;
    }

    @NotNull
    public static final Saver getSaver(@NotNull androidx.compose.ui.text.style.TextIndent.Companion textIndent$Companion0) {
        return SaversKt.m;
    }

    @NotNull
    public static final Saver getSaver(@NotNull androidx.compose.ui.unit.TextUnit.Companion textUnit$Companion0) {
        return SaversKt.s;
    }

    @NotNull
    public static final Saver getSpanStyleSaver() {
        return SaversKt.i;
    }

    @NotNull
    public static final Saver getTextLinkStylesSaver() {
        return SaversKt.j;
    }

    public static final Object restore(Object object0) {
        if(object0 != null) {
            Intrinsics.reifiedOperationMarker(1, "Result");
            return object0;
        }
        return null;
    }

    public static final Object restore(Object object0, Saver saver0) {
        Object object1 = null;
        if(Intrinsics.areEqual(object0, Boolean.FALSE) && !(saver0 instanceof NonNullValueClassSaver)) {
            return null;
        }
        if(object0 != null) {
            object1 = saver0.restore(object0);
            Intrinsics.reifiedOperationMarker(1, "Result");
        }
        return object1;
    }

    @Nullable
    public static final Object save(@Nullable Object object0) [...] // Inlined contents

    @NotNull
    public static final Object save(@Nullable Object object0, @NotNull Saver saver0, @NotNull SaverScope saverScope0) {
        if(object0 != null) {
            Boolean boolean0 = saver0.save(saverScope0, object0);
            return boolean0 == null ? false : boolean0;
        }
        return false;
    }
}

