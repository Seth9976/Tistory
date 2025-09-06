package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "androidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$menuItem$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$menuItem$1\n+ 2 TextFieldSelectionState.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState\n*L\n1#1,1542:1\n1396#2:1543\n*E\n"})
public final class TextFieldSelectionState.showTextToolbar..inlined.menuItem.1 extends Lambda implements Function0 {
    public final TextFieldSelectionState w;
    public final TextToolbarState x;
    public final TextFieldSelectionState y;

    public TextFieldSelectionState.showTextToolbar..inlined.menuItem.1(TextFieldSelectionState textFieldSelectionState0, TextToolbarState textToolbarState0, TextFieldSelectionState textFieldSelectionState1) {
        this.w = textFieldSelectionState0;
        this.x = textToolbarState0;
        this.y = textFieldSelectionState1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        TextFieldSelectionState.copy$default(this.y, false, 1, null);
        this.w.updateTextToolbarState(this.x);
    }
}

