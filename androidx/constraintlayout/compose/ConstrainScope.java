package androidx.constraintlayout.compose;

import a7.b;
import aa.e0;
import aa.o;
import androidx.annotation.FloatRange;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@LayoutScopeMarker
@Stable
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b?\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\n\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0005H\u0000\u00A2\u0006\u0004\b\b\u0010\tJU\u0010\u0017\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u000E2\b\b\u0003\u0010\u0014\u001A\u00020\u0013\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016JU\u0010\u0017\u001A\u00020\u00072\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u001A\u001A\u00020\u00182\b\b\u0002\u0010\u001B\u001A\u00020\u000E2\b\b\u0002\u0010\u001C\u001A\u00020\u000E2\b\b\u0002\u0010\u001D\u001A\u00020\u000E2\b\b\u0002\u0010\u001E\u001A\u00020\u000E2\b\b\u0003\u0010\u0014\u001A\u00020\u0013\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0015\u0010\u001FJ\u0097\u0001\u0010\u0017\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0019\u001A\u00020\u00182\u0006\u0010\r\u001A\u00020\u000B2\u0006\u0010\u001A\u001A\u00020\u00182\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u001B\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u001C\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u000E2\b\b\u0002\u0010\u001D\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u000E2\b\b\u0002\u0010\u001E\u001A\u00020\u000E2\b\b\u0003\u0010 \u001A\u00020\u00132\b\b\u0003\u0010!\u001A\u00020\u0013\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001A\u00020\u00072\u0006\u0010%\u001A\u00020$\u00A2\u0006\u0004\b&\u0010\'J\u001F\u0010(\u001A\u00020\u00072\u0006\u0010%\u001A\u00020$2\b\b\u0003\u0010\u0014\u001A\u00020\u0013\u00A2\u0006\u0004\b(\u0010)J\u001F\u0010*\u001A\u00020\u00072\u0006\u0010%\u001A\u00020$2\b\b\u0003\u0010\u0014\u001A\u00020\u0013\u00A2\u0006\u0004\b*\u0010)J\u0015\u0010,\u001A\u00020\u00072\u0006\u0010+\u001A\u00020\u000B\u00A2\u0006\u0004\b,\u0010-J\u0015\u0010,\u001A\u00020\u00072\u0006\u0010+\u001A\u00020\u0018\u00A2\u0006\u0004\b,\u0010.J+\u00103\u001A\u00020\u00072\u0006\u0010%\u001A\u00020$2\u0006\u0010/\u001A\u00020\u00132\u0006\u00100\u001A\u00020\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b1\u00102J\r\u00104\u001A\u00020\u0007\u00A2\u0006\u0004\b4\u00105J\r\u00106\u001A\u00020\u0007\u00A2\u0006\u0004\b6\u00105J\r\u00107\u001A\u00020\u0007\u00A2\u0006\u0004\b7\u00105J\r\u00108\u001A\u00020\u0007\u00A2\u0006\u0004\b8\u00105J\r\u00109\u001A\u00020\u0007\u00A2\u0006\u0004\b9\u00105R\u001A\u0010\u0002\u001A\u00020\u00018\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R,\u0010D\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070?0>8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010CR\u0017\u0010I\u001A\u00020$8\u0006\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\bG\u0010HR\u0017\u0010\f\u001A\u00020J8\u0006\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010NR\u0017\u0010Q\u001A\u00020J8\u0006\u00A2\u0006\f\n\u0004\bO\u0010L\u001A\u0004\bP\u0010NR\u0017\u0010\u0019\u001A\u00020R8\u0006\u00A2\u0006\f\n\u0004\bS\u0010T\u001A\u0004\bU\u0010VR\u0017\u0010\r\u001A\u00020J8\u0006\u00A2\u0006\f\n\u0004\bW\u0010L\u001A\u0004\bX\u0010NR\u0017\u0010[\u001A\u00020J8\u0006\u00A2\u0006\f\n\u0004\bY\u0010L\u001A\u0004\bZ\u0010NR\u0017\u0010\u001A\u001A\u00020R8\u0006\u00A2\u0006\f\n\u0004\b\\\u0010T\u001A\u0004\b]\u0010VR\u0017\u0010c\u001A\u00020^8\u0006\u00A2\u0006\f\n\u0004\b_\u0010`\u001A\u0004\ba\u0010bR*\u0010l\u001A\u00020d2\u0006\u0010e\u001A\u00020d8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bf\u0010g\u001A\u0004\bh\u0010i\"\u0004\bj\u0010kR*\u0010p\u001A\u00020d2\u0006\u0010e\u001A\u00020d8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bm\u0010g\u001A\u0004\bn\u0010i\"\u0004\bo\u0010kR*\u0010x\u001A\u00020q2\u0006\u0010e\u001A\u00020q8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\br\u0010s\u001A\u0004\bt\u0010u\"\u0004\bv\u0010wR*\u0010\u007F\u001A\u00020\u00132\u0006\u0010e\u001A\u00020\u00138\u0006@FX\u0087\u000E\u00A2\u0006\u0012\n\u0004\by\u0010z\u001A\u0004\b{\u0010|\"\u0004\b}\u0010~R.\u0010\u0083\u0001\u001A\u00020\u00132\u0006\u0010e\u001A\u00020\u00138\u0006@FX\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u0080\u0001\u0010z\u001A\u0005\b\u0081\u0001\u0010|\"\u0005\b\u0082\u0001\u0010~R.\u0010\u0087\u0001\u001A\u00020\u00132\u0006\u0010e\u001A\u00020\u00138\u0006@FX\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u0084\u0001\u0010z\u001A\u0005\b\u0085\u0001\u0010|\"\u0005\b\u0086\u0001\u0010~R.\u0010\u008B\u0001\u001A\u00020\u00132\u0006\u0010e\u001A\u00020\u00138\u0006@FX\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u0088\u0001\u0010z\u001A\u0005\b\u0089\u0001\u0010|\"\u0005\b\u008A\u0001\u0010~R.\u0010\u008F\u0001\u001A\u00020\u00132\u0006\u0010e\u001A\u00020\u00138\u0006@FX\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u008C\u0001\u0010z\u001A\u0005\b\u008D\u0001\u0010|\"\u0005\b\u008E\u0001\u0010~R.\u0010\u0093\u0001\u001A\u00020\u00132\u0006\u0010e\u001A\u00020\u00138\u0006@FX\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u0090\u0001\u0010z\u001A\u0005\b\u0091\u0001\u0010|\"\u0005\b\u0092\u0001\u0010~R7\u0010\u0097\u0001\u001A\u00020\u000E2\u0006\u0010e\u001A\u00020\u000E8\u0006@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0015\n\u0005\b\u0094\u0001\u0010z\u001A\u0005\b\u0095\u0001\u0010|\"\u0005\b\u0096\u0001\u0010~R7\u0010\u009B\u0001\u001A\u00020\u000E2\u0006\u0010e\u001A\u00020\u000E8\u0006@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0015\n\u0005\b\u0098\u0001\u0010z\u001A\u0005\b\u0099\u0001\u0010|\"\u0005\b\u009A\u0001\u0010~R7\u0010\u009F\u0001\u001A\u00020\u000E2\u0006\u0010e\u001A\u00020\u000E8\u0006@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0015\n\u0005\b\u009C\u0001\u0010z\u001A\u0005\b\u009D\u0001\u0010|\"\u0005\b\u009E\u0001\u0010~R.\u0010\u00A3\u0001\u001A\u00020\u00132\u0006\u0010e\u001A\u00020\u00138\u0006@FX\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u00A0\u0001\u0010z\u001A\u0005\b\u00A1\u0001\u0010|\"\u0005\b\u00A2\u0001\u0010~R.\u0010\u00A7\u0001\u001A\u00020\u00132\u0006\u0010e\u001A\u00020\u00138\u0006@FX\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u00A4\u0001\u0010z\u001A\u0005\b\u00A5\u0001\u0010|\"\u0005\b\u00A6\u0001\u0010~R.\u0010\u00AB\u0001\u001A\u00020\u00132\u0006\u0010e\u001A\u00020\u00138\u0006@FX\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u00A8\u0001\u0010z\u001A\u0005\b\u00A9\u0001\u0010|\"\u0005\b\u00AA\u0001\u0010~R.\u0010\u00AF\u0001\u001A\u00020\u00132\u0006\u0010e\u001A\u00020\u00138\u0006@FX\u0086\u000E\u00A2\u0006\u0015\n\u0005\b\u00AC\u0001\u0010z\u001A\u0005\b\u00AD\u0001\u0010|\"\u0005\b\u00AE\u0001\u0010~\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00B0\u0001"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope;", "", "id", "<init>", "(Ljava/lang/Object;)V", "Landroidx/constraintlayout/compose/State;", "state", "", "applyTo$compose_release", "(Landroidx/constraintlayout/compose/State;)V", "applyTo", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "start", "end", "Landroidx/compose/ui/unit/Dp;", "startMargin", "endMargin", "startGoneMargin", "endGoneMargin", "", "bias", "linkTo-8ZKsbrE", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FFFFF)V", "linkTo", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "top", "bottom", "topMargin", "bottomMargin", "topGoneMargin", "bottomGoneMargin", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFF)V", "horizontalBias", "verticalBias", "linkTo-R7zmacU", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFFFFFFF)V", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "other", "centerTo", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;)V", "centerHorizontallyTo", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;F)V", "centerVerticallyTo", "anchor", "centerAround", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;)V", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;)V", "angle", "distance", "circular-wH6b6FI", "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;FF)V", "circular", "clearHorizontal", "()V", "clearVertical", "clearConstraints", "resetDimensions", "resetTransforms", "a", "Ljava/lang/Object;", "getId$compose_release", "()Ljava/lang/Object;", "", "Lkotlin/Function1;", "b", "Ljava/util/List;", "getTasks$compose_release", "()Ljava/util/List;", "tasks", "c", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getParent", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "parent", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "d", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "getStart", "()Landroidx/constraintlayout/compose/VerticalAnchorable;", "e", "getAbsoluteLeft", "absoluteLeft", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "f", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "getTop", "()Landroidx/constraintlayout/compose/HorizontalAnchorable;", "g", "getEnd", "h", "getAbsoluteRight", "absoluteRight", "i", "getBottom", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "j", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "getBaseline", "()Landroidx/constraintlayout/compose/BaselineAnchorable;", "baseline", "Landroidx/constraintlayout/compose/Dimension;", "value", "k", "Landroidx/constraintlayout/compose/Dimension;", "getWidth", "()Landroidx/constraintlayout/compose/Dimension;", "setWidth", "(Landroidx/constraintlayout/compose/Dimension;)V", "width", "l", "getHeight", "setHeight", "height", "Landroidx/constraintlayout/compose/Visibility;", "m", "Landroidx/constraintlayout/compose/Visibility;", "getVisibility", "()Landroidx/constraintlayout/compose/Visibility;", "setVisibility", "(Landroidx/constraintlayout/compose/Visibility;)V", "visibility", "n", "F", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "o", "getScaleX", "setScaleX", "scaleX", "p", "getScaleY", "setScaleY", "scaleY", "q", "getRotationX", "setRotationX", "rotationX", "r", "getRotationY", "setRotationY", "rotationY", "s", "getRotationZ", "setRotationZ", "rotationZ", "t", "getTranslationX-D9Ej5fM", "setTranslationX-0680j_4", "translationX", "u", "getTranslationY-D9Ej5fM", "setTranslationY-0680j_4", "translationY", "v", "getTranslationZ-D9Ej5fM", "setTranslationZ-0680j_4", "translationZ", "w", "getPivotX", "setPivotX", "pivotX", "x", "getPivotY", "setPivotY", "pivotY", "y", "getHorizontalChainWeight", "setHorizontalChainWeight", "horizontalChainWeight", "z", "getVerticalChainWeight", "setVerticalChainWeight", "verticalChainWeight", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ConstrainScope {
    public final Object a;
    public final ArrayList b;
    public final ConstrainedLayoutReference c;
    public final e d;
    public final e e;
    public final d f;
    public final e g;
    public final e h;
    public final d i;
    public final b j;
    public Dimension k;
    public Dimension l;
    public Visibility m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public ConstrainScope(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "id");
        super();
        this.a = object0;
        ArrayList arrayList0 = new ArrayList();
        this.b = arrayList0;
        Intrinsics.checkNotNullExpressionValue(State.PARENT, "PARENT");
        this.c = new ConstrainedLayoutReference(State.PARENT);
        this.d = new e(object0, -2, arrayList0);
        this.e = new e(object0, 0, arrayList0);
        this.f = new d(object0, 0, arrayList0);
        this.g = new e(object0, -1, arrayList0);
        this.h = new e(object0, 1, arrayList0);
        this.i = new d(object0, 1, arrayList0);
        this.j = new b(object0, arrayList0);
        this.k = Dimension.Companion.getWrapContent();
        this.l = Dimension.Companion.getWrapContent();
        this.m = Visibility.Companion.getVisible();
        this.n = 1.0f;
        this.o = 1.0f;
        this.p = 1.0f;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = 0.0f;
        this.w = 0.5f;
        this.x = 0.5f;
        this.y = NaNf;
        this.z = NaNf;
    }

    public final void a(Function1 function10) {
        o o0 = new o(function10, this);
        this.b.add(o0);
    }

    public final void applyTo$compose_release(@NotNull androidx.constraintlayout.compose.State state0) {
        Intrinsics.checkNotNullParameter(state0, "state");
        for(Object object0: this.b) {
            ((Function1)object0).invoke(state0);
        }
    }

    public final void centerAround(@NotNull HorizontalAnchor constraintLayoutBaseScope$HorizontalAnchor0) {
        Intrinsics.checkNotNullParameter(constraintLayoutBaseScope$HorizontalAnchor0, "anchor");
        ConstrainScope.linkTo-8ZKsbrE$default(this, constraintLayoutBaseScope$HorizontalAnchor0, constraintLayoutBaseScope$HorizontalAnchor0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0x7C, null);
    }

    public final void centerAround(@NotNull VerticalAnchor constraintLayoutBaseScope$VerticalAnchor0) {
        Intrinsics.checkNotNullParameter(constraintLayoutBaseScope$VerticalAnchor0, "anchor");
        ConstrainScope.linkTo-8ZKsbrE$default(this, constraintLayoutBaseScope$VerticalAnchor0, constraintLayoutBaseScope$VerticalAnchor0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0x7C, null);
    }

    public final void centerHorizontallyTo(@NotNull ConstrainedLayoutReference constrainedLayoutReference0, @FloatRange(from = 0.0, to = 1.0) float f) {
        Intrinsics.checkNotNullParameter(constrainedLayoutReference0, "other");
        ConstrainScope.linkTo-8ZKsbrE$default(this, constrainedLayoutReference0.getStart(), constrainedLayoutReference0.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, f, 60, null);
    }

    public static void centerHorizontallyTo$default(ConstrainScope constrainScope0, ConstrainedLayoutReference constrainedLayoutReference0, float f, int v, Object object0) {
        if((v & 2) != 0) {
            f = 0.5f;
        }
        constrainScope0.centerHorizontallyTo(constrainedLayoutReference0, f);
    }

    public final void centerTo(@NotNull ConstrainedLayoutReference constrainedLayoutReference0) {
        Intrinsics.checkNotNullParameter(constrainedLayoutReference0, "other");
        ConstrainScope.linkTo-R7zmacU$default(this, constrainedLayoutReference0.getStart(), constrainedLayoutReference0.getTop(), constrainedLayoutReference0.getEnd(), constrainedLayoutReference0.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0x3FF0, null);
    }

    public final void centerVerticallyTo(@NotNull ConstrainedLayoutReference constrainedLayoutReference0, @FloatRange(from = 0.0, to = 1.0) float f) {
        Intrinsics.checkNotNullParameter(constrainedLayoutReference0, "other");
        ConstrainScope.linkTo-8ZKsbrE$default(this, constrainedLayoutReference0.getTop(), constrainedLayoutReference0.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, f, 60, null);
    }

    public static void centerVerticallyTo$default(ConstrainScope constrainScope0, ConstrainedLayoutReference constrainedLayoutReference0, float f, int v, Object object0) {
        if((v & 2) != 0) {
            f = 0.5f;
        }
        constrainScope0.centerVerticallyTo(constrainedLayoutReference0, f);
    }

    public final void circular-wH6b6FI(@NotNull ConstrainedLayoutReference constrainedLayoutReference0, float f, float f1) {
        Intrinsics.checkNotNullParameter(constrainedLayoutReference0, "other");
        c c0 = new c(f, f1, this, 2, constrainedLayoutReference0);
        this.b.add(c0);
    }

    public final void clearConstraints() {
        h h0 = new h(this, 0);
        this.b.add(h0);
    }

    public final void clearHorizontal() {
        h h0 = new h(this, 1);
        this.b.add(h0);
    }

    public final void clearVertical() {
        h h0 = new h(this, 2);
        this.b.add(h0);
    }

    @NotNull
    public final VerticalAnchorable getAbsoluteLeft() {
        return this.e;
    }

    @NotNull
    public final VerticalAnchorable getAbsoluteRight() {
        return this.h;
    }

    public final float getAlpha() {
        return this.n;
    }

    @NotNull
    public final BaselineAnchorable getBaseline() {
        return this.j;
    }

    @NotNull
    public final HorizontalAnchorable getBottom() {
        return this.i;
    }

    @NotNull
    public final VerticalAnchorable getEnd() {
        return this.g;
    }

    @NotNull
    public final Dimension getHeight() {
        return this.l;
    }

    public final float getHorizontalChainWeight() {
        return this.y;
    }

    @NotNull
    public final Object getId$compose_release() {
        return this.a;
    }

    @NotNull
    public final ConstrainedLayoutReference getParent() {
        return this.c;
    }

    public final float getPivotX() {
        return this.w;
    }

    public final float getPivotY() {
        return this.x;
    }

    public final float getRotationX() {
        return this.q;
    }

    public final float getRotationY() {
        return this.r;
    }

    public final float getRotationZ() {
        return this.s;
    }

    public final float getScaleX() {
        return this.o;
    }

    public final float getScaleY() {
        return this.p;
    }

    @NotNull
    public final VerticalAnchorable getStart() {
        return this.d;
    }

    @NotNull
    public final List getTasks$compose_release() {
        return this.b;
    }

    @NotNull
    public final HorizontalAnchorable getTop() {
        return this.f;
    }

    public final float getTranslationX-D9Ej5fM() {
        return this.t;
    }

    public final float getTranslationY-D9Ej5fM() {
        return this.u;
    }

    public final float getTranslationZ-D9Ej5fM() {
        return this.v;
    }

    public final float getVerticalChainWeight() {
        return this.z;
    }

    @NotNull
    public final Visibility getVisibility() {
        return this.m;
    }

    @NotNull
    public final Dimension getWidth() {
        return this.k;
    }

    public final void linkTo-8ZKsbrE(@NotNull HorizontalAnchor constraintLayoutBaseScope$HorizontalAnchor0, @NotNull HorizontalAnchor constraintLayoutBaseScope$HorizontalAnchor1, float f, float f1, float f2, float f3, @FloatRange(from = 0.0, to = 1.0) float f4) {
        Intrinsics.checkNotNullParameter(constraintLayoutBaseScope$HorizontalAnchor0, "top");
        Intrinsics.checkNotNullParameter(constraintLayoutBaseScope$HorizontalAnchor1, "bottom");
        this.f.linkTo-VpY3zN4(constraintLayoutBaseScope$HorizontalAnchor0, f, f2);
        this.i.linkTo-VpY3zN4(constraintLayoutBaseScope$HorizontalAnchor1, f1, f3);
        g g0 = new g(this, f4, 3);
        this.b.add(g0);
    }

    public final void linkTo-8ZKsbrE(@NotNull VerticalAnchor constraintLayoutBaseScope$VerticalAnchor0, @NotNull VerticalAnchor constraintLayoutBaseScope$VerticalAnchor1, float f, float f1, float f2, float f3, @FloatRange(from = 0.0, to = 1.0) float f4) {
        Intrinsics.checkNotNullParameter(constraintLayoutBaseScope$VerticalAnchor0, "start");
        Intrinsics.checkNotNullParameter(constraintLayoutBaseScope$VerticalAnchor1, "end");
        this.d.linkTo-VpY3zN4(constraintLayoutBaseScope$VerticalAnchor0, f, f2);
        this.g.linkTo-VpY3zN4(constraintLayoutBaseScope$VerticalAnchor1, f1, f3);
        g g0 = new g(f4, this);
        this.b.add(g0);
    }

    public static void linkTo-8ZKsbrE$default(ConstrainScope constrainScope0, HorizontalAnchor constraintLayoutBaseScope$HorizontalAnchor0, HorizontalAnchor constraintLayoutBaseScope$HorizontalAnchor1, float f, float f1, float f2, float f3, float f4, int v, Object object0) {
        constrainScope0.linkTo-8ZKsbrE(constraintLayoutBaseScope$HorizontalAnchor0, constraintLayoutBaseScope$HorizontalAnchor1, ((v & 4) == 0 ? f : 0.0f), ((v & 8) == 0 ? f1 : 0.0f), ((v & 16) == 0 ? f2 : 0.0f), ((v & 0x20) == 0 ? f3 : 0.0f), ((v & 0x40) == 0 ? f4 : 0.5f));
    }

    public static void linkTo-8ZKsbrE$default(ConstrainScope constrainScope0, VerticalAnchor constraintLayoutBaseScope$VerticalAnchor0, VerticalAnchor constraintLayoutBaseScope$VerticalAnchor1, float f, float f1, float f2, float f3, float f4, int v, Object object0) {
        constrainScope0.linkTo-8ZKsbrE(constraintLayoutBaseScope$VerticalAnchor0, constraintLayoutBaseScope$VerticalAnchor1, ((v & 4) == 0 ? f : 0.0f), ((v & 8) == 0 ? f1 : 0.0f), ((v & 16) == 0 ? f2 : 0.0f), ((v & 0x20) == 0 ? f3 : 0.0f), ((v & 0x40) == 0 ? f4 : 0.5f));
    }

    public final void linkTo-R7zmacU(@NotNull VerticalAnchor constraintLayoutBaseScope$VerticalAnchor0, @NotNull HorizontalAnchor constraintLayoutBaseScope$HorizontalAnchor0, @NotNull VerticalAnchor constraintLayoutBaseScope$VerticalAnchor1, @NotNull HorizontalAnchor constraintLayoutBaseScope$HorizontalAnchor1, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, @FloatRange(from = 0.0, to = 1.0) float f8, @FloatRange(from = 0.0, to = 1.0) float f9) {
        Intrinsics.checkNotNullParameter(constraintLayoutBaseScope$VerticalAnchor0, "start");
        Intrinsics.checkNotNullParameter(constraintLayoutBaseScope$HorizontalAnchor0, "top");
        Intrinsics.checkNotNullParameter(constraintLayoutBaseScope$VerticalAnchor1, "end");
        Intrinsics.checkNotNullParameter(constraintLayoutBaseScope$HorizontalAnchor1, "bottom");
        this.linkTo-8ZKsbrE(constraintLayoutBaseScope$VerticalAnchor0, constraintLayoutBaseScope$VerticalAnchor1, f, f2, f4, f6, f8);
        this.linkTo-8ZKsbrE(constraintLayoutBaseScope$HorizontalAnchor0, constraintLayoutBaseScope$HorizontalAnchor1, f1, f3, f5, f7, f9);
    }

    public static void linkTo-R7zmacU$default(ConstrainScope constrainScope0, VerticalAnchor constraintLayoutBaseScope$VerticalAnchor0, HorizontalAnchor constraintLayoutBaseScope$HorizontalAnchor0, VerticalAnchor constraintLayoutBaseScope$VerticalAnchor1, HorizontalAnchor constraintLayoutBaseScope$HorizontalAnchor1, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int v, Object object0) {
        constrainScope0.linkTo-R7zmacU(constraintLayoutBaseScope$VerticalAnchor0, constraintLayoutBaseScope$HorizontalAnchor0, constraintLayoutBaseScope$VerticalAnchor1, constraintLayoutBaseScope$HorizontalAnchor1, ((v & 16) == 0 ? f : 0.0f), ((v & 0x20) == 0 ? f1 : 0.0f), ((v & 0x40) == 0 ? f2 : 0.0f), ((v & 0x80) == 0 ? f3 : 0.0f), ((v & 0x100) == 0 ? f4 : 0.0f), ((v & 0x200) == 0 ? f5 : 0.0f), ((v & 0x400) == 0 ? f6 : 0.0f), ((v & 0x800) == 0 ? f7 : 0.0f), ((v & 0x1000) == 0 ? f8 : 0.5f), ((v & 0x2000) == 0 ? f9 : 0.5f));
    }

    public final void resetDimensions() {
        h h0 = new h(this, 3);
        this.b.add(h0);
    }

    public final void resetTransforms() {
        h h0 = new h(this, 4);
        this.b.add(h0);
    }

    public final void setAlpha(float f) {
        this.n = f;
        this.a(new g(this, f, 0));
    }

    public final void setHeight(@NotNull Dimension dimension0) {
        Intrinsics.checkNotNullParameter(dimension0, "value");
        this.l = dimension0;
        i i0 = new i(this, dimension0, 0);
        this.b.add(i0);
    }

    public final void setHorizontalChainWeight(float f) {
        this.y = f;
        g g0 = new g(this, f, 1);
        this.b.add(g0);
    }

    public final void setPivotX(float f) {
        this.w = f;
        this.a(new e0(f, 2));
    }

    public final void setPivotY(float f) {
        this.x = f;
        this.a(new e0(f, 3));
    }

    public final void setRotationX(float f) {
        this.q = f;
        this.a(new e0(f, 4));
    }

    public final void setRotationY(float f) {
        this.r = f;
        this.a(new e0(f, 5));
    }

    public final void setRotationZ(float f) {
        this.s = f;
        this.a(new e0(f, 6));
    }

    public final void setScaleX(float f) {
        this.o = f;
        this.a(new e0(f, 7));
    }

    public final void setScaleY(float f) {
        this.p = f;
        this.a(new e0(f, 8));
    }

    public final void setTranslationX-0680j_4(float f) {
        this.t = f;
        f f1 = new f(a.C, this, f);
        this.b.add(f1);
    }

    public final void setTranslationY-0680j_4(float f) {
        this.u = f;
        f f1 = new f(a.D, this, f);
        this.b.add(f1);
    }

    public final void setTranslationZ-0680j_4(float f) {
        this.v = f;
        f f1 = new f(a.E, this, f);
        this.b.add(f1);
    }

    public final void setVerticalChainWeight(float f) {
        this.z = f;
        g g0 = new g(this, f, 4);
        this.b.add(g0);
    }

    public final void setVisibility(@NotNull Visibility visibility0) {
        Intrinsics.checkNotNullParameter(visibility0, "value");
        this.m = visibility0;
        o o0 = new o(17, this, visibility0);
        this.b.add(o0);
    }

    public final void setWidth(@NotNull Dimension dimension0) {
        Intrinsics.checkNotNullParameter(dimension0, "value");
        this.k = dimension0;
        i i0 = new i(this, dimension0, 1);
        this.b.add(i0);
    }
}

