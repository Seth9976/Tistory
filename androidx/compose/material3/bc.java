package androidx.compose.material3;

import aa.e;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollState;
import androidx.compose.material.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Modifier;
import cb.h;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.textedit.TextEditorKt;
import java.util.List;
import kotlin.Function;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class bc extends Lambda implements Function2 {
    public final Object A;
    public final Function B;
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public bc(Object object0, Object object1, Object object2, Object object3, Function function0, int v) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        this.z = object2;
        this.A = object3;
        this.B = function0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1502590376, v1, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:163)");
                }
                ListItemKt.access$ListItemLayout(((ComposableLambda)this.x), ((ComposableLambda)this.y), ((ComposableLambda)this.z), ((ComposableLambda)this.A), ((ComposableLambda)this.B), ((Composer)object0), 0x180);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v2 = ((Number)object1).intValue();
                if((v2 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x8F654B18, v2, -1, "com.kakao.kandinsky.textedit.TextDecorationEditor.<anonymous> (TextEditor.kt:42)");
                }
                Pair pair0 = TuplesKt.to(((TextData)this.z), Boolean.FALSE);
                h h0 = new h(0L, false, 0x3F, 0.0f);
                ((Composer)object0).startReplaceGroup(0xB2702A6F);
                Function1 function10 = (Function1)this.A;
                boolean z = ((Composer)object0).changed(function10);
                e e0 = ((Composer)object0).rememberedValue();
                if(z || e0 == Composer.Companion.getEmpty()) {
                    e0 = new e(function10, 2);
                    ((Composer)object0).updateRememberedValue(e0);
                }
                ((Composer)object0).endReplaceGroup();
                TextEditorKt.access$TextEditor(((String)this.x), ((List)this.y), pair0, false, h0, e0, ((Function0)this.B), ((Composer)object0), 0x6C40, 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                int v = ((Number)object1).intValue();
                if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-47803778, v, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:138)");
                }
                MenuKt.DropdownMenuContent(((MutableTransitionState)this.x), ((MutableState)this.y), ((ScrollState)this.z), ((Modifier)this.A), ((Function3)this.B), ((Composer)object0), MutableTransitionState.$stable | 0x30, 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

