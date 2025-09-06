package androidx.compose.ui.platform.actionmodecallback;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000F\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0011\u0010\f\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\u0006j\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "", "a", "I", "getId", "()I", "id", "b", "getOrder", "order", "getTitleResource", "titleResource", "Copy", "Paste", "Cut", "SelectAll", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public enum MenuItemOption {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[MenuItemOption.values().length];
            try {
                arr_v[MenuItemOption.Copy.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MenuItemOption.Paste.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MenuItemOption.Cut.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MenuItemOption.SelectAll.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);

    public final int a;
    public final int b;

    public MenuItemOption(int v1) {
        this.a = v1;
        this.b = v1;
    }

    public final int getId() {
        return this.a;
    }

    public final int getOrder() {
        return this.b;
    }

    public final int getTitleResource() {
        switch(WhenMappings.$EnumSwitchMapping$0[this.ordinal()]) {
            case 1: {
                return 0x1040001;
            }
            case 2: {
                return 0x104000B;
            }
            case 3: {
                return 0x1040003;
            }
            case 4: {
                return 0x104000D;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

