package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo;
import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;
import android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat.PrereleaseSdkCheck;
import androidx.core.view.v1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AccessibilityNodeInfoCompat {
    public static class AccessibilityActionCompat {
        public static final AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS;
        public static final AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS;
        public static final AccessibilityActionCompat ACTION_CLEAR_FOCUS;
        public static final AccessibilityActionCompat ACTION_CLEAR_SELECTION;
        public static final AccessibilityActionCompat ACTION_CLICK;
        public static final AccessibilityActionCompat ACTION_COLLAPSE;
        public static final AccessibilityActionCompat ACTION_CONTEXT_CLICK;
        public static final AccessibilityActionCompat ACTION_COPY;
        public static final AccessibilityActionCompat ACTION_CUT;
        public static final AccessibilityActionCompat ACTION_DISMISS;
        @NonNull
        public static final AccessibilityActionCompat ACTION_DRAG_CANCEL;
        @NonNull
        public static final AccessibilityActionCompat ACTION_DRAG_DROP;
        @NonNull
        public static final AccessibilityActionCompat ACTION_DRAG_START;
        public static final AccessibilityActionCompat ACTION_EXPAND;
        public static final AccessibilityActionCompat ACTION_FOCUS;
        public static final AccessibilityActionCompat ACTION_HIDE_TOOLTIP;
        @NonNull
        public static final AccessibilityActionCompat ACTION_IME_ENTER;
        public static final AccessibilityActionCompat ACTION_LONG_CLICK;
        public static final AccessibilityActionCompat ACTION_MOVE_WINDOW;
        public static final AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
        public static final AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT;
        @NonNull
        public static final AccessibilityActionCompat ACTION_PAGE_DOWN;
        @NonNull
        public static final AccessibilityActionCompat ACTION_PAGE_LEFT;
        @NonNull
        public static final AccessibilityActionCompat ACTION_PAGE_RIGHT;
        @NonNull
        public static final AccessibilityActionCompat ACTION_PAGE_UP;
        public static final AccessibilityActionCompat ACTION_PASTE;
        @NonNull
        public static final AccessibilityActionCompat ACTION_PRESS_AND_HOLD;
        public static final AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
        public static final AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT;
        public static final AccessibilityActionCompat ACTION_SCROLL_BACKWARD;
        public static final AccessibilityActionCompat ACTION_SCROLL_DOWN;
        public static final AccessibilityActionCompat ACTION_SCROLL_FORWARD;
        @NonNull
        @OptIn(markerClass = {PrereleaseSdkCheck.class})
        public static final AccessibilityActionCompat ACTION_SCROLL_IN_DIRECTION;
        public static final AccessibilityActionCompat ACTION_SCROLL_LEFT;
        public static final AccessibilityActionCompat ACTION_SCROLL_RIGHT;
        public static final AccessibilityActionCompat ACTION_SCROLL_TO_POSITION;
        public static final AccessibilityActionCompat ACTION_SCROLL_UP;
        public static final AccessibilityActionCompat ACTION_SELECT;
        public static final AccessibilityActionCompat ACTION_SET_PROGRESS;
        public static final AccessibilityActionCompat ACTION_SET_SELECTION;
        public static final AccessibilityActionCompat ACTION_SET_TEXT;
        public static final AccessibilityActionCompat ACTION_SHOW_ON_SCREEN;
        @NonNull
        public static final AccessibilityActionCompat ACTION_SHOW_TEXT_SUGGESTIONS;
        public static final AccessibilityActionCompat ACTION_SHOW_TOOLTIP;
        public final Object a;
        public final int b;
        public final Class c;
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        protected final AccessibilityViewCommand mCommand;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityNodeInfo$AccessibilityAction0 = null;
            AccessibilityActionCompat.ACTION_FOCUS = new AccessibilityActionCompat(1, null);
            AccessibilityActionCompat.ACTION_CLEAR_FOCUS = new AccessibilityActionCompat(2, null);
            AccessibilityActionCompat.ACTION_SELECT = new AccessibilityActionCompat(4, null);
            AccessibilityActionCompat.ACTION_CLEAR_SELECTION = new AccessibilityActionCompat(8, null);
            AccessibilityActionCompat.ACTION_CLICK = new AccessibilityActionCompat(16, null);
            AccessibilityActionCompat.ACTION_LONG_CLICK = new AccessibilityActionCompat(0x20, null);
            AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(0x40, null);
            AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS = new AccessibilityActionCompat(0x80, null);
            AccessibilityActionCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(0x100, MoveAtGranularityArguments.class);
            AccessibilityActionCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new AccessibilityActionCompat(0x200, MoveAtGranularityArguments.class);
            AccessibilityActionCompat.ACTION_NEXT_HTML_ELEMENT = new AccessibilityActionCompat(0x400, MoveHtmlArguments.class);
            AccessibilityActionCompat.ACTION_PREVIOUS_HTML_ELEMENT = new AccessibilityActionCompat(0x800, MoveHtmlArguments.class);
            AccessibilityActionCompat.ACTION_SCROLL_FORWARD = new AccessibilityActionCompat(0x1000, null);
            AccessibilityActionCompat.ACTION_SCROLL_BACKWARD = new AccessibilityActionCompat(0x2000, null);
            AccessibilityActionCompat.ACTION_COPY = new AccessibilityActionCompat(0x4000, null);
            AccessibilityActionCompat.ACTION_PASTE = new AccessibilityActionCompat(0x8000, null);
            AccessibilityActionCompat.ACTION_CUT = new AccessibilityActionCompat(0x10000, null);
            AccessibilityActionCompat.ACTION_SET_SELECTION = new AccessibilityActionCompat(0x20000, SetSelectionArguments.class);
            AccessibilityActionCompat.ACTION_EXPAND = new AccessibilityActionCompat(0x40000, null);
            AccessibilityActionCompat.ACTION_COLLAPSE = new AccessibilityActionCompat(0x80000, null);
            AccessibilityActionCompat.ACTION_DISMISS = new AccessibilityActionCompat(0x100000, null);
            AccessibilityActionCompat.ACTION_SET_TEXT = new AccessibilityActionCompat(0x200000, SetTextArguments.class);
            int v = Build.VERSION.SDK_INT;
            AccessibilityActionCompat.ACTION_SHOW_ON_SCREEN = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 0x1020036, null, null, null);
            AccessibilityActionCompat.ACTION_SCROLL_TO_POSITION = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 0x1020037, null, null, ScrollToPositionArguments.class);
            AccessibilityActionCompat.ACTION_SCROLL_UP = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 0x1020038, null, null, null);
            AccessibilityActionCompat.ACTION_SCROLL_LEFT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 0x1020039, null, null, null);
            AccessibilityActionCompat.ACTION_SCROLL_DOWN = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 0x102003A, null, null, null);
            AccessibilityActionCompat.ACTION_SCROLL_RIGHT = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 0x102003B, null, null, null);
            AccessibilityActionCompat.ACTION_PAGE_UP = new AccessibilityActionCompat((v < 29 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP), 0x1020046, null, null, null);
            AccessibilityActionCompat.ACTION_PAGE_DOWN = new AccessibilityActionCompat((v < 29 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN), 0x1020047, null, null, null);
            AccessibilityActionCompat.ACTION_PAGE_LEFT = new AccessibilityActionCompat((v < 29 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT), 0x1020048, null, null, null);
            AccessibilityActionCompat.ACTION_PAGE_RIGHT = new AccessibilityActionCompat((v < 29 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT), 0x1020049, null, null, null);
            AccessibilityActionCompat.ACTION_CONTEXT_CLICK = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 0x102003C, null, null, null);
            AccessibilityActionCompat.ACTION_SET_PROGRESS = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 0x102003D, null, null, SetProgressArguments.class);
            AccessibilityActionCompat.ACTION_MOVE_WINDOW = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 0x1020042, null, null, MoveWindowArguments.class);
            AccessibilityActionCompat.ACTION_SHOW_TOOLTIP = new AccessibilityActionCompat((v < 28 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP), 0x1020044, null, null, null);
            AccessibilityActionCompat.ACTION_HIDE_TOOLTIP = new AccessibilityActionCompat((v < 28 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP), 0x1020045, null, null, null);
            AccessibilityActionCompat.ACTION_PRESS_AND_HOLD = new AccessibilityActionCompat((v < 30 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD), 0x102004A, null, null, null);
            AccessibilityActionCompat.ACTION_IME_ENTER = new AccessibilityActionCompat((v < 30 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER), 0x1020054, null, null, null);
            AccessibilityActionCompat.ACTION_DRAG_START = new AccessibilityActionCompat((v < 0x20 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START), 0x1020055, null, null, null);
            AccessibilityActionCompat.ACTION_DRAG_DROP = new AccessibilityActionCompat((v < 0x20 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP), 0x1020056, null, null, null);
            AccessibilityActionCompat.ACTION_DRAG_CANCEL = new AccessibilityActionCompat((v < 0x20 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL), 0x1020057, null, null, null);
            AccessibilityActionCompat.ACTION_SHOW_TEXT_SUGGESTIONS = new AccessibilityActionCompat((v < 33 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS), 0x1020058, null, null, null);
            if(v >= 34) {
                accessibilityNodeInfo$AccessibilityAction0 = j.a();
            }
            AccessibilityActionCompat.ACTION_SCROLL_IN_DIRECTION = new AccessibilityActionCompat(accessibilityNodeInfo$AccessibilityAction0, 0x102005E, null, null, null);
        }

        public AccessibilityActionCompat(int v, CharSequence charSequence0) {
            this(null, v, charSequence0, null, null);
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public AccessibilityActionCompat(int v, CharSequence charSequence0, AccessibilityViewCommand accessibilityViewCommand0) {
            this(null, v, charSequence0, accessibilityViewCommand0, null);
        }

        public AccessibilityActionCompat(int v, Class class0) {
            this(null, v, null, null, class0);
        }

        public AccessibilityActionCompat(Object object0, int v, CharSequence charSequence0, AccessibilityViewCommand accessibilityViewCommand0, Class class0) {
            this.b = v;
            this.mCommand = accessibilityViewCommand0;
            this.a = object0 == null ? new AccessibilityNodeInfo.AccessibilityAction(v, charSequence0) : object0;
            this.c = class0;
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public AccessibilityActionCompat createReplacementAction(CharSequence charSequence0, AccessibilityViewCommand accessibilityViewCommand0) {
            return new AccessibilityActionCompat(null, this.b, charSequence0, accessibilityViewCommand0, this.c);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(!(object0 instanceof AccessibilityActionCompat)) {
                return false;
            }
            Object object1 = ((AccessibilityActionCompat)object0).a;
            return this.a == null ? object1 == null : this.a.equals(object1);
        }

        public int getId() {
            return ((AccessibilityNodeInfo.AccessibilityAction)this.a).getId();
        }

        public CharSequence getLabel() {
            return ((AccessibilityNodeInfo.AccessibilityAction)this.a).getLabel();
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public boolean perform(View view0, Bundle bundle0) {
            CommandArguments accessibilityViewCommand$CommandArguments1;
            if(this.mCommand != null) {
                Class class0 = this.c;
                CommandArguments accessibilityViewCommand$CommandArguments0 = null;
                if(class0 != null) {
                    try {
                        accessibilityViewCommand$CommandArguments1 = (CommandArguments)class0.getDeclaredConstructor(null).newInstance(null);
                    }
                    catch(Exception exception0) {
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (class0 == null ? "null" : class0.getName()), exception0);
                        return this.mCommand.perform(view0, accessibilityViewCommand$CommandArguments0);
                    }
                    try {
                        accessibilityViewCommand$CommandArguments1.setBundle(bundle0);
                        return this.mCommand.perform(view0, accessibilityViewCommand$CommandArguments1);
                    }
                    catch(Exception exception0) {
                        accessibilityViewCommand$CommandArguments0 = accessibilityViewCommand$CommandArguments1;
                    }
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (class0 == null ? "null" : class0.getName()), exception0);
                    return this.mCommand.perform(view0, accessibilityViewCommand$CommandArguments0);
                }
                return this.mCommand.perform(view0, null);
            }
            return false;
        }

        @Override
        @NonNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("AccessibilityActionCompat: ");
            String s = AccessibilityNodeInfoCompat.b(this.b);
            if(s.equals("ACTION_UNKNOWN") && this.getLabel() != null) {
                s = this.getLabel().toString();
            }
            stringBuilder0.append(s);
            return stringBuilder0.toString();
        }
    }

    public static class CollectionInfoCompat {
        public static final int SELECTION_MODE_MULTIPLE = 2;
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;
        public final AccessibilityNodeInfo.CollectionInfo a;

        public CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo accessibilityNodeInfo$CollectionInfo0) {
            this.a = accessibilityNodeInfo$CollectionInfo0;
        }

        public int getColumnCount() {
            return this.a.getColumnCount();
        }

        public int getRowCount() {
            return this.a.getRowCount();
        }

        public int getSelectionMode() {
            return this.a.getSelectionMode();
        }

        public boolean isHierarchical() {
            return this.a.isHierarchical();
        }

        public static CollectionInfoCompat obtain(int v, int v1, boolean z) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(v, v1, z));
        }

        public static CollectionInfoCompat obtain(int v, int v1, boolean z, int v2) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(v, v1, z, v2));
        }
    }

    public static class CollectionItemInfoCompat {
        public static final class Builder {
            public boolean a;
            public int b;
            public int c;
            public int d;
            public int e;
            public boolean f;
            public String g;
            public String h;

            @NonNull
            public CollectionItemInfoCompat build() {
                return Build.VERSION.SDK_INT < 33 ? g.a(this.c, this.e, this.b, this.d, this.a, this.f) : i.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            }

            @NonNull
            public Builder setColumnIndex(int v) {
                this.b = v;
                return this;
            }

            @NonNull
            public Builder setColumnSpan(int v) {
                this.d = v;
                return this;
            }

            @NonNull
            public Builder setColumnTitle(@Nullable String s) {
                this.h = s;
                return this;
            }

            @NonNull
            public Builder setHeading(boolean z) {
                this.a = z;
                return this;
            }

            @NonNull
            public Builder setRowIndex(int v) {
                this.c = v;
                return this;
            }

            @NonNull
            public Builder setRowSpan(int v) {
                this.e = v;
                return this;
            }

            @NonNull
            public Builder setRowTitle(@Nullable String s) {
                this.g = s;
                return this;
            }

            @NonNull
            public Builder setSelected(boolean z) {
                this.f = z;
                return this;
            }
        }

        public final AccessibilityNodeInfo.CollectionItemInfo a;

        public CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo accessibilityNodeInfo$CollectionItemInfo0) {
            this.a = accessibilityNodeInfo$CollectionItemInfo0;
        }

        public int getColumnIndex() {
            return this.a.getColumnIndex();
        }

        public int getColumnSpan() {
            return this.a.getColumnSpan();
        }

        @Nullable
        public String getColumnTitle() {
            return Build.VERSION.SDK_INT < 33 ? null : i.c(this.a);
        }

        public int getRowIndex() {
            return this.a.getRowIndex();
        }

        public int getRowSpan() {
            return this.a.getRowSpan();
        }

        @Nullable
        public String getRowTitle() {
            return Build.VERSION.SDK_INT < 33 ? null : i.d(this.a);
        }

        @Deprecated
        public boolean isHeading() {
            return this.a.isHeading();
        }

        public boolean isSelected() {
            return this.a.isSelected();
        }

        public static CollectionItemInfoCompat obtain(int v, int v1, int v2, int v3, boolean z) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(v, v1, v2, v3, z));
        }

        public static CollectionItemInfoCompat obtain(int v, int v1, int v2, int v3, boolean z, boolean z1) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(v, v1, v2, v3, z, z1));
        }
    }

    public static class RangeInfoCompat {
        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_PERCENT = 2;
        public final Object a;

        public RangeInfoCompat(int v, float f, float f1, float f2) {
            if(Build.VERSION.SDK_INT >= 30) {
                this.a = h.a(v, f, f1, f2);
                return;
            }
            this.a = AccessibilityNodeInfo.RangeInfo.obtain(v, f, f1, f2);
        }

        public RangeInfoCompat(AccessibilityNodeInfo.RangeInfo accessibilityNodeInfo$RangeInfo0) {
            this.a = accessibilityNodeInfo$RangeInfo0;
        }

        public float getCurrent() {
            return ((AccessibilityNodeInfo.RangeInfo)this.a).getCurrent();
        }

        public float getMax() {
            return ((AccessibilityNodeInfo.RangeInfo)this.a).getMax();
        }

        public float getMin() {
            return ((AccessibilityNodeInfo.RangeInfo)this.a).getMin();
        }

        public int getType() {
            return ((AccessibilityNodeInfo.RangeInfo)this.a).getType();
        }

        public static RangeInfoCompat obtain(int v, float f, float f1, float f2) {
            return new RangeInfoCompat(AccessibilityNodeInfo.RangeInfo.obtain(v, f, f1, f2));
        }
    }

    public static final class TouchDelegateInfoCompat {
        public final AccessibilityNodeInfo.TouchDelegateInfo a;

        public TouchDelegateInfoCompat(AccessibilityNodeInfo.TouchDelegateInfo accessibilityNodeInfo$TouchDelegateInfo0) {
            this.a = accessibilityNodeInfo$TouchDelegateInfo0;
        }

        public TouchDelegateInfoCompat(@NonNull Map map0) {
            if(Build.VERSION.SDK_INT >= 29) {
                this.a = v1.i(map0);
                return;
            }
            this.a = null;
        }

        @Nullable
        public Region getRegionAt(@IntRange(from = 0L) int v) {
            return Build.VERSION.SDK_INT < 29 ? null : this.a.getRegionAt(v);
        }

        @IntRange(from = 0L)
        public int getRegionCount() {
            return Build.VERSION.SDK_INT < 29 ? 0 : this.a.getRegionCount();
        }

        @Nullable
        public AccessibilityNodeInfoCompat getTargetForRegion(@NonNull Region region0) {
            if(Build.VERSION.SDK_INT >= 29) {
                AccessibilityNodeInfo accessibilityNodeInfo0 = this.a.getTargetForRegion(region0);
                return accessibilityNodeInfo0 == null ? null : AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo0);
            }
            return null;
        }
    }

    public static final int ACTION_ACCESSIBILITY_FOCUS = 0x40;
    public static final String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String ACTION_ARGUMENT_DIRECTION_INT = "androidx.core.view.accessibility.action.ARGUMENT_DIRECTION_INT";
    public static final String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    @SuppressLint({"ActionValue"})
    public static final String ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    public static final String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";
    public static final String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 0x80;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COLLAPSE = 0x80000;
    public static final int ACTION_COPY = 0x4000;
    public static final int ACTION_CUT = 0x10000;
    public static final int ACTION_DISMISS = 0x100000;
    public static final int ACTION_EXPAND = 0x40000;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_LONG_CLICK = 0x20;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 0x100;
    public static final int ACTION_NEXT_HTML_ELEMENT = 0x400;
    public static final int ACTION_PASTE = 0x8000;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 0x200;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 0x800;
    public static final int ACTION_SCROLL_BACKWARD = 0x2000;
    public static final int ACTION_SCROLL_FORWARD = 0x1000;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_SET_SELECTION = 0x20000;
    public static final int ACTION_SET_TEXT = 0x200000;
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
    public static final int EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH = 20000;
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
    public static final String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
    public static final int FLAG_PREFETCH_ANCESTORS = 1;
    public static final int FLAG_PREFETCH_DESCENDANTS_BREADTH_FIRST = 16;
    public static final int FLAG_PREFETCH_DESCENDANTS_DEPTH_FIRST = 8;
    public static final int FLAG_PREFETCH_DESCENDANTS_HYBRID = 4;
    public static final int FLAG_PREFETCH_SIBLINGS = 2;
    public static final int FLAG_PREFETCH_UNINTERRUPTIBLE = 0x20;
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int FOCUS_INPUT = 1;
    @SuppressLint({"MinMaxConstant"})
    public static final int MAX_NUMBER_OF_PREFETCHED_NODES = 50;
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;
    public final AccessibilityNodeInfo a;
    public int b;
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public int mParentVirtualDescendantId;

    public AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo0) {
        this.mParentVirtualDescendantId = -1;
        this.b = -1;
        this.a = accessibilityNodeInfo0;
    }

    @Deprecated
    public AccessibilityNodeInfoCompat(Object object0) {
        this.mParentVirtualDescendantId = -1;
        this.b = -1;
        this.a = (AccessibilityNodeInfo)object0;
    }

    public final ArrayList a(String s) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        ArrayList arrayList0 = accessibilityNodeInfo0.getExtras().getIntegerArrayList(s);
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
            accessibilityNodeInfo0.getExtras().putIntegerArrayList(s, arrayList0);
        }
        return arrayList0;
    }

    public void addAction(int v) {
        this.a.addAction(v);
    }

    public void addAction(AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0) {
        this.a.addAction(((AccessibilityNodeInfo.AccessibilityAction)accessibilityNodeInfoCompat$AccessibilityActionCompat0.a));
    }

    public void addChild(View view0) {
        this.a.addChild(view0);
    }

    public void addChild(View view0, int v) {
        this.a.addChild(view0, v);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void addSpansToExtras(CharSequence charSequence0, View view0) {
    }

    public static String b(int v) {
        switch(v) {
            case 1: {
                return "ACTION_FOCUS";
            }
            case 2: {
                return "ACTION_CLEAR_FOCUS";
            }
            case 4: {
                return "ACTION_SELECT";
            }
            case 8: {
                return "ACTION_CLEAR_SELECTION";
            }
            case 16: {
                return "ACTION_CLICK";
            }
            case 0x20: {
                return "ACTION_LONG_CLICK";
            }
            case 0x40: {
                return "ACTION_ACCESSIBILITY_FOCUS";
            }
            case 0x80: {
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            }
            case 0x100: {
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            }
            case 0x200: {
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            }
            case 0x400: {
                return "ACTION_NEXT_HTML_ELEMENT";
            }
            case 0x800: {
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            }
            case 0x1000: {
                return "ACTION_SCROLL_FORWARD";
            }
            case 0x2000: {
                return "ACTION_SCROLL_BACKWARD";
            }
            case 0x4000: {
                return "ACTION_COPY";
            }
            case 0x8000: {
                return "ACTION_PASTE";
            }
            case 0x10000: {
                return "ACTION_CUT";
            }
            case 0x20000: {
                return "ACTION_SET_SELECTION";
            }
            case 0x40000: {
                return "ACTION_EXPAND";
            }
            case 0x80000: {
                return "ACTION_COLLAPSE";
            }
            case 0x200000: {
                return "ACTION_SET_TEXT";
            }
            case 0x1020036: {
                return "ACTION_SHOW_ON_SCREEN";
            }
            case 0x1020037: {
                return "ACTION_SCROLL_TO_POSITION";
            }
            case 0x1020038: {
                return "ACTION_SCROLL_UP";
            }
            case 0x1020039: {
                return "ACTION_SCROLL_LEFT";
            }
            case 0x102003A: {
                return "ACTION_SCROLL_DOWN";
            }
            case 0x102003B: {
                return "ACTION_SCROLL_RIGHT";
            }
            case 0x102003C: {
                return "ACTION_CONTEXT_CLICK";
            }
            case 0x102003D: {
                return "ACTION_SET_PROGRESS";
            }
            case 0x1020042: {
                return "ACTION_MOVE_WINDOW";
            }
            case 0x1020044: {
                return "ACTION_SHOW_TOOLTIP";
            }
            case 0x1020045: {
                return "ACTION_HIDE_TOOLTIP";
            }
            case 0x1020046: {
                return "ACTION_PAGE_UP";
            }
            case 0x1020047: {
                return "ACTION_PAGE_DOWN";
            }
            case 0x1020048: {
                return "ACTION_PAGE_LEFT";
            }
            case 0x1020049: {
                return "ACTION_PAGE_RIGHT";
            }
            case 0x102004A: {
                return "ACTION_PRESS_AND_HOLD";
            }
            case 0x1020054: {
                return "ACTION_IME_ENTER";
            }
            case 0x1020055: {
                return "ACTION_DRAG_START";
            }
            case 0x1020056: {
                return "ACTION_DRAG_DROP";
            }
            case 0x1020057: {
                return "ACTION_DRAG_CANCEL";
            }
            case 0x102005E: {
                return "ACTION_SCROLL_IN_DIRECTION";
            }
            default: {
                return "ACTION_UNKNOWN";
            }
        }
    }

    public final boolean c(int v) {
        Bundle bundle0 = this.getExtras();
        return bundle0 == null ? false : (bundle0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & v) == v;
    }

    public boolean canOpenPopup() {
        return this.a.canOpenPopup();
    }

    public final void d(int v, boolean z) {
        Bundle bundle0 = this.getExtras();
        if(bundle0 != null) {
            int v1 = bundle0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & ~v;
            if(!z) {
                v = 0;
            }
            bundle0.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", v | v1);
        }
    }

    public static AccessibilityNodeInfoCompat e(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return accessibilityNodeInfo0 == null ? null : new AccessibilityNodeInfoCompat(accessibilityNodeInfo0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo0 = ((AccessibilityNodeInfoCompat)object0).a;
        AccessibilityNodeInfo accessibilityNodeInfo1 = this.a;
        if(accessibilityNodeInfo1 == null) {
            if(accessibilityNodeInfo0 != null) {
                return false;
            }
        }
        else if(!accessibilityNodeInfo1.equals(accessibilityNodeInfo0)) {
            return false;
        }
        return this.b == ((AccessibilityNodeInfoCompat)object0).b ? this.mParentVirtualDescendantId == ((AccessibilityNodeInfoCompat)object0).mParentVirtualDescendantId : false;
    }

    public List findAccessibilityNodeInfosByText(String s) {
        List list0 = new ArrayList();
        List list1 = this.a.findAccessibilityNodeInfosByText(s);
        int v = list1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(AccessibilityNodeInfoCompat.wrap(((AccessibilityNodeInfo)list1.get(v1))));
        }
        return list0;
    }

    public List findAccessibilityNodeInfosByViewId(String s) {
        List list0 = this.a.findAccessibilityNodeInfosByViewId(s);
        List list1 = new ArrayList();
        for(Object object0: list0) {
            ((ArrayList)list1).add(AccessibilityNodeInfoCompat.wrap(((AccessibilityNodeInfo)object0)));
        }
        return list1;
    }

    public AccessibilityNodeInfoCompat findFocus(int v) {
        return AccessibilityNodeInfoCompat.e(this.a.findFocus(v));
    }

    public AccessibilityNodeInfoCompat focusSearch(int v) {
        return AccessibilityNodeInfoCompat.e(this.a.focusSearch(v));
    }

    public List getActionList() {
        List list0 = this.a.getActionList();
        if(list0 != null) {
            List list1 = new ArrayList();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((ArrayList)list1).add(new AccessibilityActionCompat(list0.get(v1), 0, null, null, null));
            }
            return list1;
        }
        return Collections.emptyList();
    }

    @Deprecated
    public int getActions() {
        return this.a.getActions();
    }

    @NonNull
    public List getAvailableExtraData() {
        return this.a.getAvailableExtraData();
    }

    @Deprecated
    public void getBoundsInParent(Rect rect0) {
        this.a.getBoundsInParent(rect0);
    }

    public void getBoundsInScreen(Rect rect0) {
        this.a.getBoundsInScreen(rect0);
    }

    public void getBoundsInWindow(@NonNull Rect rect0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        if(Build.VERSION.SDK_INT >= 34) {
            j.b(accessibilityNodeInfo0, rect0);
            return;
        }
        Rect rect1 = (Rect)accessibilityNodeInfo0.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if(rect1 != null) {
            rect0.set(rect1.left, rect1.top, rect1.right, rect1.bottom);
        }
    }

    public AccessibilityNodeInfoCompat getChild(int v) {
        return AccessibilityNodeInfoCompat.e(this.a.getChild(v));
    }

    @Nullable
    public AccessibilityNodeInfoCompat getChild(int v, int v1) {
        return Build.VERSION.SDK_INT < 33 ? this.getChild(v) : i.b(this.a, v, v1);
    }

    public int getChildCount() {
        return this.a.getChildCount();
    }

    public CharSequence getClassName() {
        return this.a.getClassName();
    }

    // 去混淆评级： 低(20)
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] getClickableSpans(CharSequence charSequence0) {
        return charSequence0 instanceof Spanned ? ((ClickableSpan[])((Spanned)charSequence0).getSpans(0, charSequence0.length(), ClickableSpan.class)) : null;
    }

    public CollectionInfoCompat getCollectionInfo() {
        AccessibilityNodeInfo.CollectionInfo accessibilityNodeInfo$CollectionInfo0 = this.a.getCollectionInfo();
        return accessibilityNodeInfo$CollectionInfo0 == null ? null : new CollectionInfoCompat(accessibilityNodeInfo$CollectionInfo0);
    }

    public CollectionItemInfoCompat getCollectionItemInfo() {
        AccessibilityNodeInfo.CollectionItemInfo accessibilityNodeInfo$CollectionItemInfo0 = this.a.getCollectionItemInfo();
        return accessibilityNodeInfo$CollectionItemInfo0 == null ? null : new CollectionItemInfoCompat(accessibilityNodeInfo$CollectionItemInfo0);
    }

    @Nullable
    public CharSequence getContainerTitle() {
        return Build.VERSION.SDK_INT < 34 ? this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY") : j.c(this.a);
    }

    public CharSequence getContentDescription() {
        return this.a.getContentDescription();
    }

    public int getDrawingOrder() {
        return this.a.getDrawingOrder();
    }

    public CharSequence getError() {
        return this.a.getError();
    }

    @Nullable
    public AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() {
        return Build.VERSION.SDK_INT < 33 ? null : i.e(this.a);
    }

    public Bundle getExtras() {
        return this.a.getExtras();
    }

    @Nullable
    public CharSequence getHintText() {
        return this.a.getHintText();
    }

    @Deprecated
    public Object getInfo() {
        return this.a;
    }

    public int getInputType() {
        return this.a.getInputType();
    }

    public AccessibilityNodeInfoCompat getLabelFor() {
        return AccessibilityNodeInfoCompat.e(this.a.getLabelFor());
    }

    public AccessibilityNodeInfoCompat getLabeledBy() {
        return AccessibilityNodeInfoCompat.e(this.a.getLabeledBy());
    }

    public int getLiveRegion() {
        return this.a.getLiveRegion();
    }

    public int getMaxTextLength() {
        return this.a.getMaxTextLength();
    }

    public long getMinDurationBetweenContentChangesMillis() {
        return Build.VERSION.SDK_INT < 34 ? this.a.getExtras().getLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY") : j.d(this.a);
    }

    public int getMovementGranularities() {
        return this.a.getMovementGranularities();
    }

    public CharSequence getPackageName() {
        return this.a.getPackageName();
    }

    @Nullable
    public CharSequence getPaneTitle() {
        return Build.VERSION.SDK_INT < 28 ? this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY") : e.m(this.a);
    }

    public AccessibilityNodeInfoCompat getParent() {
        return AccessibilityNodeInfoCompat.e(this.a.getParent());
    }

    @Nullable
    public AccessibilityNodeInfoCompat getParent(int v) {
        return Build.VERSION.SDK_INT < 33 ? this.getParent() : i.f(this.a, v);
    }

    public RangeInfoCompat getRangeInfo() {
        AccessibilityNodeInfo.RangeInfo accessibilityNodeInfo$RangeInfo0 = this.a.getRangeInfo();
        return accessibilityNodeInfo$RangeInfo0 == null ? null : new RangeInfoCompat(accessibilityNodeInfo$RangeInfo0);
    }

    @Nullable
    public CharSequence getRoleDescription() {
        return this.a.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
    }

    @Nullable
    public CharSequence getStateDescription() {
        return Build.VERSION.SDK_INT < 30 ? this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY") : h.b(this.a);
    }

    public CharSequence getText() {
        boolean z = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        if(!z) {
            ArrayList arrayList0 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList arrayList1 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList arrayList2 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList arrayList3 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            CharSequence charSequence0 = new SpannableString(TextUtils.substring(accessibilityNodeInfo0.getText(), 0, accessibilityNodeInfo0.getText().length()));
            for(int v = 0; v < arrayList0.size(); ++v) {
                ((SpannableString)charSequence0).setSpan(new AccessibilityClickableSpanCompat(((int)(((Integer)arrayList3.get(v)))), this, this.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((int)(((Integer)arrayList0.get(v)))), ((int)(((Integer)arrayList1.get(v)))), ((int)(((Integer)arrayList2.get(v)))));
            }
            return charSequence0;
        }
        return accessibilityNodeInfo0.getText();
    }

    public int getTextSelectionEnd() {
        return this.a.getTextSelectionEnd();
    }

    public int getTextSelectionStart() {
        return this.a.getTextSelectionStart();
    }

    @Nullable
    public CharSequence getTooltipText() {
        return Build.VERSION.SDK_INT < 28 ? this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY") : e.z(this.a);
    }

    @Nullable
    public TouchDelegateInfoCompat getTouchDelegateInfo() {
        if(Build.VERSION.SDK_INT >= 29) {
            AccessibilityNodeInfo.TouchDelegateInfo accessibilityNodeInfo$TouchDelegateInfo0 = this.a.getTouchDelegateInfo();
            return accessibilityNodeInfo$TouchDelegateInfo0 == null ? null : new TouchDelegateInfoCompat(accessibilityNodeInfo$TouchDelegateInfo0);
        }
        return null;
    }

    public AccessibilityNodeInfoCompat getTraversalAfter() {
        return AccessibilityNodeInfoCompat.e(this.a.getTraversalAfter());
    }

    public AccessibilityNodeInfoCompat getTraversalBefore() {
        return AccessibilityNodeInfoCompat.e(this.a.getTraversalBefore());
    }

    @Nullable
    public String getUniqueId() {
        return Build.VERSION.SDK_INT < 33 ? this.a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY") : i.g(this.a);
    }

    public String getViewIdResourceName() {
        return this.a.getViewIdResourceName();
    }

    public AccessibilityWindowInfoCompat getWindow() {
        AccessibilityWindowInfo accessibilityWindowInfo0 = this.a.getWindow();
        return accessibilityWindowInfo0 == null ? null : new AccessibilityWindowInfoCompat(accessibilityWindowInfo0);
    }

    public int getWindowId() {
        return this.a.getWindowId();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean hasRequestInitialAccessibilityFocus() {
        return Build.VERSION.SDK_INT < 34 ? this.c(0x20) : j.e(this.a);
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    public boolean isAccessibilityDataSensitive() {
        return Build.VERSION.SDK_INT < 34 ? this.c(0x40) : j.f(this.a);
    }

    public boolean isAccessibilityFocused() {
        return this.a.isAccessibilityFocused();
    }

    public boolean isCheckable() {
        return this.a.isCheckable();
    }

    public boolean isChecked() {
        return this.a.isChecked();
    }

    public boolean isClickable() {
        return this.a.isClickable();
    }

    public boolean isContentInvalid() {
        return this.a.isContentInvalid();
    }

    public boolean isContextClickable() {
        return this.a.isContextClickable();
    }

    public boolean isDismissable() {
        return this.a.isDismissable();
    }

    public boolean isEditable() {
        return this.a.isEditable();
    }

    public boolean isEnabled() {
        return this.a.isEnabled();
    }

    public boolean isFocusable() {
        return this.a.isFocusable();
    }

    public boolean isFocused() {
        return this.a.isFocused();
    }

    public boolean isGranularScrollingSupported() {
        return this.c(0x4000000);
    }

    public boolean isHeading() {
        if(Build.VERSION.SDK_INT >= 28) {
            return this.a.isHeading();
        }
        if(this.c(2)) {
            return true;
        }
        CollectionItemInfoCompat accessibilityNodeInfoCompat$CollectionItemInfoCompat0 = this.getCollectionItemInfo();
        return accessibilityNodeInfoCompat$CollectionItemInfoCompat0 != null && accessibilityNodeInfoCompat$CollectionItemInfoCompat0.isHeading();
    }

    public boolean isImportantForAccessibility() {
        return this.a.isImportantForAccessibility();
    }

    public boolean isLongClickable() {
        return this.a.isLongClickable();
    }

    public boolean isMultiLine() {
        return this.a.isMultiLine();
    }

    public boolean isPassword() {
        return this.a.isPassword();
    }

    public boolean isScreenReaderFocusable() {
        return Build.VERSION.SDK_INT < 28 ? this.c(1) : this.a.isScreenReaderFocusable();
    }

    public boolean isScrollable() {
        return this.a.isScrollable();
    }

    public boolean isSelected() {
        return this.a.isSelected();
    }

    public boolean isShowingHintText() {
        return this.a.isShowingHintText();
    }

    public boolean isTextEntryKey() {
        return Build.VERSION.SDK_INT < 29 ? this.c(8) : this.a.isTextEntryKey();
    }

    public boolean isTextSelectable() {
        return Build.VERSION.SDK_INT < 33 ? this.c(0x800000) : i.h(this.a);
    }

    public boolean isVisibleToUser() {
        return this.a.isVisibleToUser();
    }

    public static AccessibilityNodeInfoCompat obtain() {
        return AccessibilityNodeInfoCompat.wrap(AccessibilityNodeInfo.obtain());
    }

    public static AccessibilityNodeInfoCompat obtain(View view0) {
        return AccessibilityNodeInfoCompat.wrap(AccessibilityNodeInfo.obtain(view0));
    }

    public static AccessibilityNodeInfoCompat obtain(View view0, int v) {
        return AccessibilityNodeInfoCompat.e(AccessibilityNodeInfo.obtain(view0, v));
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        return AccessibilityNodeInfoCompat.wrap(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat0.a));
    }

    public boolean performAction(int v) {
        return this.a.performAction(v);
    }

    public boolean performAction(int v, Bundle bundle0) {
        return this.a.performAction(v, bundle0);
    }

    @Deprecated
    public void recycle() {
    }

    public boolean refresh() {
        return this.a.refresh();
    }

    public boolean removeAction(AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0) {
        return this.a.removeAction(((AccessibilityNodeInfo.AccessibilityAction)accessibilityNodeInfoCompat$AccessibilityActionCompat0.a));
    }

    public boolean removeChild(View view0) {
        return this.a.removeChild(view0);
    }

    public boolean removeChild(View view0, int v) {
        return this.a.removeChild(view0, v);
    }

    public void setAccessibilityDataSensitive(boolean z) {
        if(Build.VERSION.SDK_INT >= 34) {
            j.g(this.a, z);
            return;
        }
        this.d(0x40, z);
    }

    public void setAccessibilityFocused(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public void setAvailableExtraData(@NonNull List list0) {
        this.a.setAvailableExtraData(list0);
    }

    @Deprecated
    public void setBoundsInParent(Rect rect0) {
        this.a.setBoundsInParent(rect0);
    }

    public void setBoundsInScreen(Rect rect0) {
        this.a.setBoundsInScreen(rect0);
    }

    public void setBoundsInWindow(@NonNull Rect rect0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        if(Build.VERSION.SDK_INT >= 34) {
            j.h(accessibilityNodeInfo0, rect0);
            return;
        }
        accessibilityNodeInfo0.getExtras().putParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY", rect0);
    }

    public void setCanOpenPopup(boolean z) {
        this.a.setCanOpenPopup(z);
    }

    public void setCheckable(boolean z) {
        this.a.setCheckable(z);
    }

    public void setChecked(boolean z) {
        this.a.setChecked(z);
    }

    public void setClassName(CharSequence charSequence0) {
        this.a.setClassName(charSequence0);
    }

    public void setClickable(boolean z) {
        this.a.setClickable(z);
    }

    public void setCollectionInfo(Object object0) {
        this.a.setCollectionInfo((object0 == null ? null : ((CollectionInfoCompat)object0).a));
    }

    public void setCollectionItemInfo(Object object0) {
        this.a.setCollectionItemInfo((object0 == null ? null : ((CollectionItemInfoCompat)object0).a));
    }

    public void setContainerTitle(@Nullable CharSequence charSequence0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        if(Build.VERSION.SDK_INT >= 34) {
            j.i(accessibilityNodeInfo0, charSequence0);
            return;
        }
        accessibilityNodeInfo0.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY", charSequence0);
    }

    public void setContentDescription(CharSequence charSequence0) {
        this.a.setContentDescription(charSequence0);
    }

    public void setContentInvalid(boolean z) {
        this.a.setContentInvalid(z);
    }

    public void setContextClickable(boolean z) {
        this.a.setContextClickable(z);
    }

    public void setDismissable(boolean z) {
        this.a.setDismissable(z);
    }

    public void setDrawingOrder(int v) {
        this.a.setDrawingOrder(v);
    }

    public void setEditable(boolean z) {
        this.a.setEditable(z);
    }

    public void setEnabled(boolean z) {
        this.a.setEnabled(z);
    }

    public void setError(CharSequence charSequence0) {
        this.a.setError(charSequence0);
    }

    public void setFocusable(boolean z) {
        this.a.setFocusable(z);
    }

    public void setFocused(boolean z) {
        this.a.setFocused(z);
    }

    public void setGranularScrollingSupported(boolean z) {
        this.d(0x4000000, z);
    }

    public void setHeading(boolean z) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
            return;
        }
        this.d(2, z);
    }

    public void setHintText(@Nullable CharSequence charSequence0) {
        this.a.setHintText(charSequence0);
    }

    public void setImportantForAccessibility(boolean z) {
        this.a.setImportantForAccessibility(z);
    }

    public void setInputType(int v) {
        this.a.setInputType(v);
    }

    public void setLabelFor(View view0) {
        this.a.setLabelFor(view0);
    }

    public void setLabelFor(View view0, int v) {
        this.a.setLabelFor(view0, v);
    }

    public void setLabeledBy(View view0) {
        this.a.setLabeledBy(view0);
    }

    public void setLabeledBy(View view0, int v) {
        this.a.setLabeledBy(view0, v);
    }

    public void setLiveRegion(int v) {
        this.a.setLiveRegion(v);
    }

    public void setLongClickable(boolean z) {
        this.a.setLongClickable(z);
    }

    public void setMaxTextLength(int v) {
        this.a.setMaxTextLength(v);
    }

    public void setMinDurationBetweenContentChangesMillis(long v) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        if(Build.VERSION.SDK_INT >= 34) {
            j.j(accessibilityNodeInfo0, v);
            return;
        }
        accessibilityNodeInfo0.getExtras().putLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY", v);
    }

    public void setMovementGranularities(int v) {
        this.a.setMovementGranularities(v);
    }

    public void setMultiLine(boolean z) {
        this.a.setMultiLine(z);
    }

    public void setPackageName(CharSequence charSequence0) {
        this.a.setPackageName(charSequence0);
    }

    public void setPaneTitle(@Nullable CharSequence charSequence0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        if(Build.VERSION.SDK_INT >= 28) {
            accessibilityNodeInfo0.setPaneTitle(charSequence0);
            return;
        }
        accessibilityNodeInfo0.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence0);
    }

    public void setParent(View view0) {
        this.mParentVirtualDescendantId = -1;
        this.a.setParent(view0);
    }

    public void setParent(View view0, int v) {
        this.mParentVirtualDescendantId = v;
        this.a.setParent(view0, v);
    }

    public void setPassword(boolean z) {
        this.a.setPassword(z);
    }

    public void setQueryFromAppProcessEnabled(@NonNull View view0, boolean z) {
        if(Build.VERSION.SDK_INT >= 34) {
            j.k(this.a, view0, z);
        }
    }

    public void setRangeInfo(RangeInfoCompat accessibilityNodeInfoCompat$RangeInfoCompat0) {
        this.a.setRangeInfo(((AccessibilityNodeInfo.RangeInfo)accessibilityNodeInfoCompat$RangeInfoCompat0.a));
    }

    @SuppressLint({"GetterSetterNames"})
    public void setRequestInitialAccessibilityFocus(boolean z) {
        if(Build.VERSION.SDK_INT >= 34) {
            j.l(this.a, z);
            return;
        }
        this.d(0x20, z);
    }

    public void setRoleDescription(@Nullable CharSequence charSequence0) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence0);
    }

    public void setScreenReaderFocusable(boolean z) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
            return;
        }
        this.d(1, z);
    }

    public void setScrollable(boolean z) {
        this.a.setScrollable(z);
    }

    public void setSelected(boolean z) {
        this.a.setSelected(z);
    }

    public void setShowingHintText(boolean z) {
        this.a.setShowingHintText(z);
    }

    public void setSource(View view0) {
        this.b = -1;
        this.a.setSource(view0);
    }

    public void setSource(View view0, int v) {
        this.b = v;
        this.a.setSource(view0, v);
    }

    public void setStateDescription(@Nullable CharSequence charSequence0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        if(Build.VERSION.SDK_INT >= 30) {
            h.c(accessibilityNodeInfo0, charSequence0);
            return;
        }
        accessibilityNodeInfo0.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence0);
    }

    public void setText(CharSequence charSequence0) {
        this.a.setText(charSequence0);
    }

    public void setTextEntryKey(boolean z) {
        if(Build.VERSION.SDK_INT >= 29) {
            this.a.setTextEntryKey(z);
            return;
        }
        this.d(8, z);
    }

    public void setTextSelectable(boolean z) {
        if(Build.VERSION.SDK_INT >= 33) {
            i.i(this.a, z);
            return;
        }
        this.d(0x800000, z);
    }

    public void setTextSelection(int v, int v1) {
        this.a.setTextSelection(v, v1);
    }

    public void setTooltipText(@Nullable CharSequence charSequence0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        if(Build.VERSION.SDK_INT >= 28) {
            accessibilityNodeInfo0.setTooltipText(charSequence0);
            return;
        }
        accessibilityNodeInfo0.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence0);
    }

    public void setTouchDelegateInfo(@NonNull TouchDelegateInfoCompat accessibilityNodeInfoCompat$TouchDelegateInfoCompat0) {
        if(Build.VERSION.SDK_INT >= 29) {
            this.a.setTouchDelegateInfo(accessibilityNodeInfoCompat$TouchDelegateInfoCompat0.a);
        }
    }

    public void setTraversalAfter(View view0) {
        this.a.setTraversalAfter(view0);
    }

    public void setTraversalAfter(View view0, int v) {
        this.a.setTraversalAfter(view0, v);
    }

    public void setTraversalBefore(View view0) {
        this.a.setTraversalBefore(view0);
    }

    public void setTraversalBefore(View view0, int v) {
        this.a.setTraversalBefore(view0, v);
    }

    public void setUniqueId(@Nullable String s) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        if(Build.VERSION.SDK_INT >= 33) {
            i.j(accessibilityNodeInfo0, s);
            return;
        }
        accessibilityNodeInfo0.getExtras().putString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY", s);
    }

    public void setViewIdResourceName(String s) {
        this.a.setViewIdResourceName(s);
    }

    public void setVisibleToUser(boolean z) {
        this.a.setVisibleToUser(z);
    }

    @Override
    @NonNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        Rect rect0 = new Rect();
        this.getBoundsInParent(rect0);
        stringBuilder0.append("; boundsInParent: " + rect0);
        this.getBoundsInScreen(rect0);
        stringBuilder0.append("; boundsInScreen: " + rect0);
        this.getBoundsInWindow(rect0);
        stringBuilder0.append("; boundsInWindow: " + rect0);
        stringBuilder0.append("; packageName: ");
        stringBuilder0.append(this.getPackageName());
        stringBuilder0.append("; className: ");
        stringBuilder0.append(this.getClassName());
        stringBuilder0.append("; text: ");
        stringBuilder0.append(this.getText());
        stringBuilder0.append("; error: ");
        stringBuilder0.append(this.getError());
        stringBuilder0.append("; maxTextLength: ");
        stringBuilder0.append(this.getMaxTextLength());
        stringBuilder0.append("; stateDescription: ");
        stringBuilder0.append(this.getStateDescription());
        stringBuilder0.append("; contentDescription: ");
        stringBuilder0.append(this.getContentDescription());
        stringBuilder0.append("; tooltipText: ");
        stringBuilder0.append(this.getTooltipText());
        stringBuilder0.append("; viewIdResName: ");
        stringBuilder0.append(this.getViewIdResourceName());
        stringBuilder0.append("; uniqueId: ");
        stringBuilder0.append(this.getUniqueId());
        stringBuilder0.append("; checkable: ");
        stringBuilder0.append(this.isCheckable());
        stringBuilder0.append("; checked: ");
        stringBuilder0.append(this.isChecked());
        stringBuilder0.append("; focusable: ");
        stringBuilder0.append(this.isFocusable());
        stringBuilder0.append("; focused: ");
        stringBuilder0.append(this.isFocused());
        stringBuilder0.append("; selected: ");
        stringBuilder0.append(this.isSelected());
        stringBuilder0.append("; clickable: ");
        stringBuilder0.append(this.isClickable());
        stringBuilder0.append("; longClickable: ");
        stringBuilder0.append(this.isLongClickable());
        stringBuilder0.append("; contextClickable: ");
        stringBuilder0.append(this.isContextClickable());
        stringBuilder0.append("; enabled: ");
        stringBuilder0.append(this.isEnabled());
        stringBuilder0.append("; password: ");
        stringBuilder0.append(this.isPassword());
        stringBuilder0.append("; scrollable: " + this.isScrollable());
        stringBuilder0.append("; containerTitle: ");
        stringBuilder0.append(this.getContainerTitle());
        stringBuilder0.append("; granularScrollingSupported: ");
        stringBuilder0.append(this.isGranularScrollingSupported());
        stringBuilder0.append("; importantForAccessibility: ");
        stringBuilder0.append(this.isImportantForAccessibility());
        stringBuilder0.append("; visible: ");
        stringBuilder0.append(this.isVisibleToUser());
        stringBuilder0.append("; isTextSelectable: ");
        stringBuilder0.append(this.isTextSelectable());
        stringBuilder0.append("; accessibilityDataSensitive: ");
        stringBuilder0.append(this.isAccessibilityDataSensitive());
        stringBuilder0.append("; [");
        List list0 = this.getActionList();
        for(int v = 0; v < list0.size(); ++v) {
            AccessibilityActionCompat accessibilityNodeInfoCompat$AccessibilityActionCompat0 = (AccessibilityActionCompat)list0.get(v);
            String s = AccessibilityNodeInfoCompat.b(accessibilityNodeInfoCompat$AccessibilityActionCompat0.getId());
            if(s.equals("ACTION_UNKNOWN") && accessibilityNodeInfoCompat$AccessibilityActionCompat0.getLabel() != null) {
                s = accessibilityNodeInfoCompat$AccessibilityActionCompat0.getLabel().toString();
            }
            stringBuilder0.append(s);
            if(v != list0.size() - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public AccessibilityNodeInfo unwrap() {
        return this.a;
    }

    public static AccessibilityNodeInfoCompat wrap(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo0);
    }
}

