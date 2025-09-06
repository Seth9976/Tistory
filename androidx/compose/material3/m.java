package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.p;
import r0.a;

public final class m extends Lambda implements Function1 {
    public final int w;
    public final String x;

    public m(String s, int v) {
        this.w = v;
        this.x = s;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                SemanticsPropertiesKt.setPaneTitle(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 1: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 2: {
                SemanticsPropertiesKt.setPaneTitle(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 3: {
                SemanticsPropertiesKt.setPaneTitle(((SemanticsPropertyReceiver)object0), this.x);
                SemanticsPropertiesKt.setTraversalIndex(((SemanticsPropertyReceiver)object0), 0.0f);
                return Unit.INSTANCE;
            }
            case 4: {
                SemanticsPropertiesKt.setPaneTitle(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 5: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 6: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 7: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 8: {
                SemanticsPropertiesKt.setTraversalGroup(((SemanticsPropertyReceiver)object0), true);
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 9: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 10: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 11: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 12: {
                Intrinsics.checkNotNullParameter(((String)object0), "line");
                return a.o(new StringBuilder(), this.x, ((String)object0));
            }
            case 13: {
                Intrinsics.checkNotNullParameter(((String)object0), "it");
                boolean z = p.isBlank(((String)object0));
                String s = this.x;
                if(z) {
                    return ((String)object0).length() >= s.length() ? ((String)object0) : s;
                }
                return s + ((String)object0);
            }
            case 14: {
                return Boolean.valueOf(Intrinsics.areEqual(((String)object0), this.x));
            }
            case 15: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 16: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 17: {
                SemanticsPropertiesKt.error(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            case 18: {
                Intrinsics.checkNotNullParameter(((Pair)object0), "it");
                return Boolean.valueOf(Intrinsics.areEqual(((Pair)object0).getFirst(), this.x));
            }
            case 19: {
                SemanticsPropertiesKt.setContentDescription(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
            default: {
                SemanticsPropertiesKt.error(((SemanticsPropertyReceiver)object0), this.x);
                return Unit.INSTANCE;
            }
        }
    }
}

