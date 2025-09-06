package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.DpKt;
import cb.h;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.textedit.TextEditorKt;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class yc extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final int w;
    public final boolean x;
    public final Function2 y;
    public final Object z;

    public yc(String s, List list0, TextData textData0, boolean z, Function2 function20, Function0 function00) {
        this.w = 1;
        this.z = s;
        this.A = list0;
        this.B = textData0;
        this.x = z;
        this.y = function20;
        this.C = function00;
        super(2);
    }

    public yc(Function2 function20, MenuItemColors menuItemColors0, boolean z, Function2 function21, RowScopeInstance rowScopeInstance0, Function2 function22) {
        this.w = 0;
        this.y = function20;
        this.B = menuItemColors0;
        this.x = z;
        this.z = function21;
        this.C = rowScopeInstance0;
        this.A = function22;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE0A3C84D, v, -1, "com.kakao.kandinsky.textedit.TextSignatureEditor.<anonymous> (TextEditor.kt:64)");
            }
            Pair pair0 = TuplesKt.to(((TextData)this.B), Boolean.valueOf(this.x));
            h h0 = new h(DpKt.DpSize-YgX7TsA(14.0f, 10.0f), true, 13, 20.0f);
            TextEditorKt.access$TextEditor(((String)this.z), ((List)this.A), pair0, false, h0, this.y, ((Function0)this.C), ((Composer)object0), 0x40, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object1).intValue();
        if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065051884, v1, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:473)");
        }
        ((Composer)object0).startReplaceGroup(1264683960);
        boolean z = this.x;
        MenuItemColors menuItemColors0 = (MenuItemColors)this.B;
        Function2 function20 = this.y;
        if(function20 != null) {
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(menuItemColors0.leadingIconColor-vNxB06k$material3_release(z))), ComposableLambdaKt.rememberComposableLambda(0x79540FC7, true, new vc(function20), ((Composer)object0), 54), ((Composer)object0), ProvidedValue.$stable | 0x30);
        }
        ((Composer)object0).endReplaceGroup();
        ProvidedValue providedValue0 = ContentColorKt.getLocalContentColor().provides(Color.box-impl(menuItemColors0.textColor-vNxB06k$material3_release(z)));
        Function2 function21 = (Function2)this.z;
        CompositionLocalKt.CompositionLocalProvider(providedValue0, ComposableLambdaKt.rememberComposableLambda(0x98F32BAC, true, new wc(((RowScopeInstance)this.C), function20, function21, ((Function2)this.A)), ((Composer)object0), 54), ((Composer)object0), ProvidedValue.$stable | 0x30);
        if(function21 != null) {
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(menuItemColors0.trailingIconColor-vNxB06k$material3_release(z))), ComposableLambdaKt.rememberComposableLambda(580312062, true, new xc(function21), ((Composer)object0), 54), ((Composer)object0), 56);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

