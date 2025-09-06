package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002R\u0014\u0010\u0004\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0005R\u0014\u0010\b\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000Bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "", "Landroidx/compose/ui/focus/FocusState;", "", "isFocused", "()Z", "getHasFocus", "hasFocus", "isCaptured", "Active", "ActiveParent", "Captured", "Inactive", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public enum FocusStateImpl implements FocusState {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[FocusStateImpl.values().length];
            try {
                arr_v[FocusStateImpl.Captured.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.Active.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.ActiveParent.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[FocusStateImpl.Inactive.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    Active,
    ActiveParent,
    Captured,
    Inactive;

    @Override  // androidx.compose.ui.focus.FocusState
    public boolean getHasFocus() {
        switch(WhenMappings.$EnumSwitchMapping$0[this.ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                return true;
            }
            case 4: {
                return false;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override  // androidx.compose.ui.focus.FocusState
    public boolean isCaptured() {
        switch(WhenMappings.$EnumSwitchMapping$0[this.ordinal()]) {
            case 1: {
                return true;
            }
            case 2: 
            case 3: 
            case 4: {
                return false;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override  // androidx.compose.ui.focus.FocusState
    public boolean isFocused() {
        switch(WhenMappings.$EnumSwitchMapping$0[this.ordinal()]) {
            case 1: 
            case 2: {
                return true;
            }
            case 3: 
            case 4: {
                return false;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

