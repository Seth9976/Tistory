package androidx.window;

public final class R {
    public static final class attr {
        public static int activityAction = 0x7F030028;  // attr:activityAction
        public static int activityName = 0x7F03002A;  // attr:activityName
        public static int alwaysExpand = 0x7F030034;  // attr:alwaysExpand
        public static int clearTop = 0x7F0300E4;  // attr:clearTop
        public static int finishPrimaryWithSecondary = 0x7F0301F1;  // attr:finishPrimaryWithSecondary
        public static int finishSecondaryWithPrimary = 0x7F0301F2;  // attr:finishSecondaryWithPrimary
        public static int placeholderActivityName = 0x7F0303A6;  // attr:placeholderActivityName
        public static int primaryActivityName = 0x7F0303BB;  // attr:primaryActivityName
        public static int secondaryActivityAction = 0x7F0303E5;  // attr:secondaryActivityAction
        public static int secondaryActivityName = 0x7F0303E6;  // attr:secondaryActivityName
        public static int splitLayoutDirection = 0x7F030416;  // attr:splitLayoutDirection
        public static int splitMinSmallestWidth = 0x7F030417;  // attr:splitMinSmallestWidth
        public static int splitMinWidth = 0x7F030418;  // attr:splitMinWidth
        public static int splitRatio = 0x7F030419;  // attr:splitRatio

    }

    public static final class id {
        public static int androidx_window_activity_scope = 0x7F090052;  // id:androidx_window_activity_scope
        public static int locale = 0x7F09026F;  // id:locale
        public static int ltr = 0x7F090271;  // id:ltr
        public static int rtl = 0x7F090316;  // id:rtl

    }

    public static final class styleable {
        public static int[] ActivityFilter = null;
        public static int ActivityFilter_activityAction = 0;
        public static int ActivityFilter_activityName = 1;
        public static int[] ActivityRule = null;
        public static int ActivityRule_alwaysExpand = 0;
        public static int[] SplitPairFilter = null;
        public static int SplitPairFilter_primaryActivityName = 0;
        public static int SplitPairFilter_secondaryActivityAction = 1;
        public static int SplitPairFilter_secondaryActivityName = 2;
        public static int[] SplitPairRule = null;
        public static int SplitPairRule_clearTop = 0;
        public static int SplitPairRule_finishPrimaryWithSecondary = 1;
        public static int SplitPairRule_finishSecondaryWithPrimary = 2;
        public static int SplitPairRule_splitLayoutDirection = 3;
        public static int SplitPairRule_splitMinSmallestWidth = 4;
        public static int SplitPairRule_splitMinWidth = 5;
        public static int SplitPairRule_splitRatio = 6;
        public static int[] SplitPlaceholderRule = null;
        public static int SplitPlaceholderRule_placeholderActivityName = 0;
        public static int SplitPlaceholderRule_splitLayoutDirection = 1;
        public static int SplitPlaceholderRule_splitMinSmallestWidth = 2;
        public static int SplitPlaceholderRule_splitMinWidth = 3;
        public static int SplitPlaceholderRule_splitRatio = 4;

        static {
            styleable.ActivityFilter = new int[]{0x7F030028, 0x7F03002A};  // attr:activityAction
            styleable.ActivityRule = new int[]{0x7F030034};  // attr:alwaysExpand
            styleable.SplitPairFilter = new int[]{0x7F0303BB, 0x7F0303E5, 0x7F0303E6};  // attr:primaryActivityName
            styleable.SplitPairRule = new int[]{0x7F0300E4, 0x7F0301F1, 0x7F0301F2, 0x7F030416, 0x7F030417, 0x7F030418, 0x7F030419};  // attr:clearTop
            styleable.SplitPlaceholderRule = new int[]{0x7F0303A6, 0x7F030416, 0x7F030417, 0x7F030418, 0x7F030419};  // attr:placeholderActivityName
        }
    }

}

