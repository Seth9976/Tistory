package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class AccessibilityEventCompat {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ContentChangeType {
    }

    public static final int CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION = 4;
    public static final int CONTENT_CHANGE_TYPE_CONTENT_INVALID = 0x400;
    public static final int CONTENT_CHANGE_TYPE_DRAG_CANCELLED = 0x200;
    public static final int CONTENT_CHANGE_TYPE_DRAG_DROPPED = 0x100;
    public static final int CONTENT_CHANGE_TYPE_DRAG_STARTED = 0x80;
    public static final int CONTENT_CHANGE_TYPE_ENABLED = 0x1000;
    public static final int CONTENT_CHANGE_TYPE_ERROR = 0x800;
    public static final int CONTENT_CHANGE_TYPE_PANE_APPEARED = 16;
    public static final int CONTENT_CHANGE_TYPE_PANE_DISAPPEARED = 0x20;
    public static final int CONTENT_CHANGE_TYPE_PANE_TITLE = 8;
    public static final int CONTENT_CHANGE_TYPE_STATE_DESCRIPTION = 0x40;
    public static final int CONTENT_CHANGE_TYPE_SUBTREE = 1;
    public static final int CONTENT_CHANGE_TYPE_TEXT = 2;
    public static final int CONTENT_CHANGE_TYPE_UNDEFINED = 0;
    public static final int TYPES_ALL_MASK = -1;
    public static final int TYPE_ANNOUNCEMENT = 0x4000;
    public static final int TYPE_ASSIST_READING_CONTEXT = 0x1000000;
    public static final int TYPE_GESTURE_DETECTION_END = 0x80000;
    public static final int TYPE_GESTURE_DETECTION_START = 0x40000;
    @Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_END = 0x400;
    @Deprecated
    public static final int TYPE_TOUCH_EXPLORATION_GESTURE_START = 0x200;
    public static final int TYPE_TOUCH_INTERACTION_END = 0x200000;
    public static final int TYPE_TOUCH_INTERACTION_START = 0x100000;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUSED = 0x8000;
    public static final int TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED = 0x10000;
    public static final int TYPE_VIEW_CONTEXT_CLICKED = 0x800000;
    @Deprecated
    public static final int TYPE_VIEW_HOVER_ENTER = 0x80;
    @Deprecated
    public static final int TYPE_VIEW_HOVER_EXIT = 0x100;
    @Deprecated
    public static final int TYPE_VIEW_SCROLLED = 0x1000;
    public static final int TYPE_VIEW_TARGETED_BY_SCROLL = 0x4000000;
    @Deprecated
    public static final int TYPE_VIEW_TEXT_SELECTION_CHANGED = 0x2000;
    public static final int TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY = 0x20000;
    public static final int TYPE_WINDOWS_CHANGED = 0x400000;
    @Deprecated
    public static final int TYPE_WINDOW_CONTENT_CHANGED = 0x800;

    @Deprecated
    public static void appendRecord(AccessibilityEvent accessibilityEvent0, AccessibilityRecordCompat accessibilityRecordCompat0) {
        accessibilityEvent0.appendRecord(((AccessibilityRecord)accessibilityRecordCompat0.getImpl()));
    }

    @Deprecated
    public static AccessibilityRecordCompat asRecord(AccessibilityEvent accessibilityEvent0) {
        return new AccessibilityRecordCompat(accessibilityEvent0);
    }

    public static int getAction(@NonNull AccessibilityEvent accessibilityEvent0) {
        return accessibilityEvent0.getAction();
    }

    @SuppressLint({"WrongConstant"})
    public static int getContentChangeTypes(@NonNull AccessibilityEvent accessibilityEvent0) {
        return accessibilityEvent0.getContentChangeTypes();
    }

    public static int getMovementGranularity(@NonNull AccessibilityEvent accessibilityEvent0) {
        return accessibilityEvent0.getMovementGranularity();
    }

    @Deprecated
    public static AccessibilityRecordCompat getRecord(AccessibilityEvent accessibilityEvent0, int v) {
        return new AccessibilityRecordCompat(accessibilityEvent0.getRecord(v));
    }

    @Deprecated
    public static int getRecordCount(AccessibilityEvent accessibilityEvent0) {
        return accessibilityEvent0.getRecordCount();
    }

    public static boolean isAccessibilityDataSensitive(@NonNull AccessibilityEvent accessibilityEvent0) {
        return Build.VERSION.SDK_INT < 34 ? false : a.a(accessibilityEvent0);
    }

    public static void setAccessibilityDataSensitive(@NonNull AccessibilityEvent accessibilityEvent0, boolean z) {
        if(Build.VERSION.SDK_INT >= 34) {
            a.b(accessibilityEvent0, z);
        }
    }

    public static void setAction(@NonNull AccessibilityEvent accessibilityEvent0, int v) {
        accessibilityEvent0.setAction(v);
    }

    public static void setContentChangeTypes(@NonNull AccessibilityEvent accessibilityEvent0, int v) {
        accessibilityEvent0.setContentChangeTypes(v);
    }

    public static void setMovementGranularity(@NonNull AccessibilityEvent accessibilityEvent0, int v) {
        accessibilityEvent0.setMovementGranularity(v);
    }
}

