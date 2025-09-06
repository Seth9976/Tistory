package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.intellij.lang.annotations.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\b\b\u0001\u0010\u0004\u001A\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u0012\u001A\u00020\f2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000FH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001F\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u001B\u0010\u001E\u001A\u00020\u00182\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u001C0\u001B¢\u0006\u0004\b\u001E\u0010\u001FJ\u0017\u0010\"\u001A\u00020\u00182\u0006\u0010!\u001A\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001A\u00020\u00182\u0006\u0010\u0004\u001A\u00020\u0003H\u0014¢\u0006\u0004\b$\u0010%J\u001F\u0010)\u001A\u00020\u00062\u0006\u0010&\u001A\u00020\u00032\u0006\u0010(\u001A\u00020\'H\u0016¢\u0006\u0004\b)\u0010*R\u001C\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.¨\u0006/"}, d2 = {"Landroidx/constraintlayout/compose/JSONConstraintSet;", "Landroidx/constraintlayout/compose/EditableJSONLayout;", "Landroidx/constraintlayout/compose/DerivedConstraintSet;", "", "content", "overrideVariables", "Landroidx/constraintlayout/compose/ConstraintSet;", "extendFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/constraintlayout/compose/ConstraintSet;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "isDirty", "(Ljava/util/List;)Z", "Landroidx/constraintlayout/core/state/Transition;", "transition", "", "type", "", "applyTo", "(Landroidx/constraintlayout/core/state/Transition;I)V", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/compose/DesignElement;", "designElements", "emitDesignElements", "(Ljava/util/ArrayList;)V", "Landroidx/constraintlayout/compose/State;", "state", "applyToState", "(Landroidx/constraintlayout/compose/State;)V", "onNewContent", "(Ljava/lang/String;)V", "name", "", "value", "override", "(Ljava/lang/String;F)Landroidx/constraintlayout/compose/ConstraintSet;", "j", "Landroidx/constraintlayout/compose/ConstraintSet;", "getExtendFrom", "()Landroidx/constraintlayout/compose/ConstraintSet;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class JSONConstraintSet extends EditableJSONLayout implements DerivedConstraintSet {
    public final ConstraintSet j;
    public final HashMap k;
    public final String l;
    public boolean m;

    public JSONConstraintSet(@Language("json5") @NotNull String s, @Language("json5") @Nullable String s1, @Nullable ConstraintSet constraintSet0) {
        Intrinsics.checkNotNullParameter(s, "content");
        super(s);
        this.j = constraintSet0;
        this.k = new HashMap();
        this.l = s1;
        this.m = true;
        this.initialization();
    }

    public JSONConstraintSet(String s, String s1, ConstraintSet constraintSet0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            constraintSet0 = null;
        }
        this(s, s1, constraintSet0);
    }

    public final void a(LayoutVariables layoutVariables0) {
        String s = this.l;
        if(s != null) {
            try {
                CLObject cLObject0 = CLParser.parse(s);
                int v = cLObject0.size();
                if(v > 0) {
                    for(int v1 = 0; true; ++v1) {
                        CLElement cLElement0 = cLObject0.get(v1);
                        if(cLElement0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                        }
                        float f = ((CLKey)cLElement0).getValue().getFloat();
                        String s1 = ((CLKey)cLElement0).content();
                        Intrinsics.checkNotNullExpressionValue(s1, "key.content()");
                        layoutVariables0.putOverride(s1, f);
                        if(v1 + 1 >= v) {
                            break;
                        }
                    }
                }
                goto label_19;
            }
            catch(CLParsingException cLParsingException0) {
            }
            System.err.println("exception: " + cLParsingException0);
        }
    label_19:
        HashMap hashMap0 = this.k;
        for(Object object0: hashMap0.keySet()) {
            Intrinsics.checkNotNullExpressionValue(((String)object0), "name");
            Float float0 = (Float)hashMap0.get(((String)object0));
            Intrinsics.checkNotNull(float0);
            layoutVariables0.putOverride(((String)object0), float0.floatValue());
        }
    }

    @Override  // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyTo(@NotNull State state0, @NotNull List list0) {
        DefaultImpls.applyTo(this, state0, list0);
    }

    @Override  // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@NotNull Transition transition0, int v) {
        Intrinsics.checkNotNullParameter(transition0, "transition");
        this.a(new LayoutVariables());
        ConstraintSetParserKt.parseJSON(this.getCurrentContent(), transition0, v);
    }

    @Override  // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyToState(@NotNull State state0) {
        Intrinsics.checkNotNullParameter(state0, "state");
        LayoutVariables layoutVariables0 = new LayoutVariables();
        this.a(layoutVariables0);
        try {
            ConstraintSetParserKt.parseJSON(this.getCurrentContent(), state0, layoutVariables0);
            this.m = false;
        }
        catch(Exception unused_ex) {
            this.m = true;
        }
    }

    public final void emitDesignElements(@NotNull ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(arrayList0, "designElements");
        try {
            arrayList0.clear();
            ConstraintSetParserKt.parseDesignElementsJSON(this.getCurrentContent(), arrayList0);
        }
        catch(Exception unused_ex) {
        }
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof JSONConstraintSet ? Intrinsics.areEqual(this.getCurrentContent(), ((JSONConstraintSet)object0).getCurrentContent()) : false;
    }

    @Override  // androidx.constraintlayout.compose.DerivedConstraintSet
    @Nullable
    public ConstraintSet getExtendFrom() {
        return this.j;
    }

    @Override  // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "measurables");
        return this.m;
    }

    @Override  // androidx.constraintlayout.compose.EditableJSONLayout
    public void onNewContent(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "content");
        super.onNewContent(s);
        this.m = true;
    }

    @Override  // androidx.constraintlayout.compose.ConstraintSet
    @NotNull
    public ConstraintSet override(@NotNull String s, float f) {
        Intrinsics.checkNotNullParameter(s, "name");
        this.k.put(s, f);
        return this;
    }
}

