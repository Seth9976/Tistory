package androidx.constraintlayout.core.motion.utils;

public interface TypedValues {
    public interface AttributesType {
        public static final String[] KEY_WORDS = null;
        public static final String NAME = "KeyAttributes";
        public static final String S_ALPHA = "alpha";
        public static final String S_CURVE_FIT = "curveFit";
        public static final String S_CUSTOM = "CUSTOM";
        public static final String S_EASING = "easing";
        public static final String S_ELEVATION = "elevation";
        public static final String S_FRAME = "frame";
        public static final String S_PATH_ROTATE = "pathRotate";
        public static final String S_PIVOT_TARGET = "pivotTarget";
        public static final String S_PIVOT_X = "pivotX";
        public static final String S_PIVOT_Y = "pivotY";
        public static final String S_PROGRESS = "progress";
        public static final String S_ROTATION_X = "rotationX";
        public static final String S_ROTATION_Y = "rotationY";
        public static final String S_ROTATION_Z = "rotationZ";
        public static final String S_SCALE_X = "scaleX";
        public static final String S_SCALE_Y = "scaleY";
        public static final String S_TARGET = "target";
        public static final String S_TRANSLATION_X = "translationX";
        public static final String S_TRANSLATION_Y = "translationY";
        public static final String S_TRANSLATION_Z = "translationZ";
        public static final String S_VISIBILITY = "visibility";
        public static final int TYPE_ALPHA = 303;
        public static final int TYPE_CURVE_FIT = 301;
        public static final int TYPE_EASING = 317;
        public static final int TYPE_ELEVATION = 307;
        public static final int TYPE_PATH_ROTATE = 316;
        public static final int TYPE_PIVOT_TARGET = 318;
        public static final int TYPE_PIVOT_X = 313;
        public static final int TYPE_PIVOT_Y = 314;
        public static final int TYPE_PROGRESS = 315;
        public static final int TYPE_ROTATION_X = 308;
        public static final int TYPE_ROTATION_Y = 309;
        public static final int TYPE_ROTATION_Z = 310;
        public static final int TYPE_SCALE_X = 311;
        public static final int TYPE_SCALE_Y = 312;
        public static final int TYPE_TRANSLATION_X = 304;
        public static final int TYPE_TRANSLATION_Y = 305;
        public static final int TYPE_TRANSLATION_Z = 306;
        public static final int TYPE_VISIBILITY = 302;

        static {
            AttributesType.KEY_WORDS = new String[]{"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", "frame", "target", "pivotTarget"};
        }

        static int getId(String s) {
            s.getClass();
            switch(s) {
                case "alpha": {
                    return 303;
                }
                case "curveFit": {
                    return 301;
                }
                case "easing": {
                    return 317;
                }
                case "elevation": {
                    return 307;
                }
                case "frame": {
                    return 100;
                }
                case "pathRotate": {
                    return 316;
                }
                case "pivotTarget": {
                    return 318;
                }
                case "pivotX": {
                    return 313;
                }
                case "pivotY": {
                    return 314;
                }
                case "progress": {
                    return 315;
                }
                case "rotationX": {
                    return 308;
                }
                case "rotationY": {
                    return 309;
                }
                case "rotationZ": {
                    return 310;
                }
                case "scaleX": {
                    return 311;
                }
                case "scaleY": {
                    return 312;
                }
                case "target": {
                    return 101;
                }
                case "translationX": {
                    return 304;
                }
                case "translationY": {
                    return 305;
                }
                case "translationZ": {
                    return 306;
                }
                case "visibility": {
                    return 302;
                }
                default: {
                    return -1;
                }
            }
        }

        static int getType(int v) {
            switch(v) {
                case 100: 
                case 301: 
                case 302: {
                    return 2;
                }
                case 303: 
                case 304: 
                case 305: 
                case 306: 
                case 307: 
                case 308: 
                case 309: 
                case 310: 
                case 311: 
                case 312: 
                case 313: 
                case 314: 
                case 315: 
                case 316: {
                    return 4;
                }
                case 101: 
                case 317: 
                case 318: {
                    return 8;
                }
                default: {
                    return -1;
                }
            }
        }
    }

    public interface Custom {
        public static final String[] KEY_WORDS = null;
        public static final String NAME = "Custom";
        public static final String S_BOOLEAN = "boolean";
        public static final String S_COLOR = "color";
        public static final String S_DIMENSION = "dimension";
        public static final String S_FLOAT = "float";
        public static final String S_INT = "integer";
        public static final String S_REFERENCE = "refrence";
        public static final String S_STRING = "string";
        public static final int TYPE_BOOLEAN = 904;
        public static final int TYPE_COLOR = 902;
        public static final int TYPE_DIMENSION = 905;
        public static final int TYPE_FLOAT = 901;
        public static final int TYPE_INT = 900;
        public static final int TYPE_REFERENCE = 906;
        public static final int TYPE_STRING = 903;

        static {
            Custom.KEY_WORDS = new String[]{"float", "color", "string", "boolean", "dimension", "refrence"};
        }

        static int getId(String s) {
            s.getClass();
            switch(s) {
                case "boolean": {
                    return 904;
                }
                case "color": {
                    return 902;
                }
                case "dimension": {
                    return 905;
                }
                case "float": {
                    return 901;
                }
                case "integer": {
                    return 900;
                }
                case "refrence": {
                    return 906;
                }
                case "string": {
                    return 903;
                }
                default: {
                    return -1;
                }
            }
        }
    }

    public interface CycleType {
        public static final String[] KEY_WORDS = null;
        public static final String NAME = "KeyCycle";
        public static final String S_ALPHA = "alpha";
        public static final String S_CURVE_FIT = "curveFit";
        public static final String S_CUSTOM_WAVE_SHAPE = "customWave";
        public static final String S_EASING = "easing";
        public static final String S_ELEVATION = "elevation";
        public static final String S_PATH_ROTATE = "pathRotate";
        public static final String S_PIVOT_X = "pivotX";
        public static final String S_PIVOT_Y = "pivotY";
        public static final String S_PROGRESS = "progress";
        public static final String S_ROTATION_X = "rotationX";
        public static final String S_ROTATION_Y = "rotationY";
        public static final String S_ROTATION_Z = "rotationZ";
        public static final String S_SCALE_X = "scaleX";
        public static final String S_SCALE_Y = "scaleY";
        public static final String S_TRANSLATION_X = "translationX";
        public static final String S_TRANSLATION_Y = "translationY";
        public static final String S_TRANSLATION_Z = "translationZ";
        public static final String S_VISIBILITY = "visibility";
        public static final String S_WAVE_OFFSET = "offset";
        public static final String S_WAVE_PERIOD = "period";
        public static final String S_WAVE_PHASE = "phase";
        public static final String S_WAVE_SHAPE = "waveShape";
        public static final int TYPE_ALPHA = 403;
        public static final int TYPE_CURVE_FIT = 401;
        public static final int TYPE_CUSTOM_WAVE_SHAPE = 422;
        public static final int TYPE_EASING = 420;
        public static final int TYPE_ELEVATION = 307;
        public static final int TYPE_PATH_ROTATE = 0x1A0;
        public static final int TYPE_PIVOT_X = 313;
        public static final int TYPE_PIVOT_Y = 314;
        public static final int TYPE_PROGRESS = 315;
        public static final int TYPE_ROTATION_X = 308;
        public static final int TYPE_ROTATION_Y = 309;
        public static final int TYPE_ROTATION_Z = 310;
        public static final int TYPE_SCALE_X = 311;
        public static final int TYPE_SCALE_Y = 312;
        public static final int TYPE_TRANSLATION_X = 304;
        public static final int TYPE_TRANSLATION_Y = 305;
        public static final int TYPE_TRANSLATION_Z = 306;
        public static final int TYPE_VISIBILITY = 402;
        public static final int TYPE_WAVE_OFFSET = 424;
        public static final int TYPE_WAVE_PERIOD = 423;
        public static final int TYPE_WAVE_PHASE = 425;
        public static final int TYPE_WAVE_SHAPE = 421;

        static {
            CycleType.KEY_WORDS = new String[]{"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", "customWave", "period", "offset", "phase"};
        }

        static int getId(String s) {
            s.getClass();
            switch(s) {
                case "alpha": {
                    return 403;
                }
                case "curveFit": {
                    return 401;
                }
                case "easing": {
                    return 420;
                }
                case "pathRotate": {
                    return 0x1A0;
                }
                case "pivotX": {
                    return 313;
                }
                case "pivotY": {
                    return 314;
                }
                case "progress": {
                    return 315;
                }
                case "rotationX": {
                    return 308;
                }
                case "rotationY": {
                    return 309;
                }
                case "rotationZ": {
                    return 310;
                }
                case "scaleX": {
                    return 311;
                }
                case "scaleY": {
                    return 312;
                }
                case "translationX": {
                    return 304;
                }
                case "translationY": {
                    return 305;
                }
                case "translationZ": {
                    return 306;
                }
                case "visibility": {
                    return 402;
                }
                default: {
                    return -1;
                }
            }
        }

        static int getType(int v) {
            switch(v) {
                case 100: 
                case 401: 
                case 402: {
                    return 2;
                }
                case 304: 
                case 305: 
                case 306: 
                case 307: 
                case 308: 
                case 309: 
                case 310: 
                case 311: 
                case 312: 
                case 313: 
                case 314: 
                case 315: 
                case 403: 
                case 0x1A0: {
                    return 4;
                }
                case 101: 
                case 420: 
                case 421: {
                    return 8;
                }
                default: {
                    return v == 423 || v == 424 || v == 425 ? 4 : -1;
                }
            }
        }
    }

    public interface MotionScene {
        public static final String[] KEY_WORDS = null;
        public static final String NAME = "MotionScene";
        public static final String S_DEFAULT_DURATION = "defaultDuration";
        public static final String S_LAYOUT_DURING_TRANSITION = "layoutDuringTransition";
        public static final int TYPE_DEFAULT_DURATION = 600;
        public static final int TYPE_LAYOUT_DURING_TRANSITION = 601;

        static {
            MotionScene.KEY_WORDS = new String[]{"defaultDuration", "layoutDuringTransition"};
        }

        static int getId(String s) {
            s.getClass();
            if(!s.equals("defaultDuration")) {
                return s.equals("layoutDuringTransition") ? 601 : -1;
            }
            return 600;
        }

        static int getType(int v) {
            switch(v) {
                case 600: {
                    return 2;
                }
                case 601: {
                    return 1;
                }
                default: {
                    return -1;
                }
            }
        }
    }

    public interface MotionType {
        public static final String[] KEY_WORDS = null;
        public static final String NAME = "Motion";
        public static final String S_ANIMATE_CIRCLEANGLE_TO = "AnimateCircleAngleTo";
        public static final String S_ANIMATE_RELATIVE_TO = "AnimateRelativeTo";
        public static final String S_DRAW_PATH = "DrawPath";
        public static final String S_EASING = "TransitionEasing";
        public static final String S_PATHMOTION_ARC = "PathMotionArc";
        public static final String S_PATH_ROTATE = "PathRotate";
        public static final String S_POLAR_RELATIVETO = "PolarRelativeTo";
        public static final String S_QUANTIZE_INTERPOLATOR = "QuantizeInterpolator";
        public static final String S_QUANTIZE_INTERPOLATOR_ID = "QuantizeInterpolatorID";
        public static final String S_QUANTIZE_INTERPOLATOR_TYPE = "QuantizeInterpolatorType";
        public static final String S_QUANTIZE_MOTIONSTEPS = "QuantizeMotionSteps";
        public static final String S_QUANTIZE_MOTION_PHASE = "QuantizeMotionPhase";
        public static final String S_STAGGER = "Stagger";
        public static final int TYPE_ANIMATE_CIRCLEANGLE_TO = 606;
        public static final int TYPE_ANIMATE_RELATIVE_TO = 605;
        public static final int TYPE_DRAW_PATH = 608;
        public static final int TYPE_EASING = 603;
        public static final int TYPE_PATHMOTION_ARC = 607;
        public static final int TYPE_PATH_ROTATE = 601;
        public static final int TYPE_POLAR_RELATIVETO = 609;
        public static final int TYPE_QUANTIZE_INTERPOLATOR = 604;
        public static final int TYPE_QUANTIZE_INTERPOLATOR_ID = 612;
        public static final int TYPE_QUANTIZE_INTERPOLATOR_TYPE = 611;
        public static final int TYPE_QUANTIZE_MOTIONSTEPS = 610;
        public static final int TYPE_QUANTIZE_MOTION_PHASE = 602;
        public static final int TYPE_STAGGER = 600;

        static {
            MotionType.KEY_WORDS = new String[]{"Stagger", "PathRotate", "QuantizeMotionPhase", "TransitionEasing", "QuantizeInterpolator", "AnimateRelativeTo", "AnimateCircleAngleTo", "PathMotionArc", "DrawPath", "PolarRelativeTo", "QuantizeMotionSteps", "QuantizeInterpolatorType", "QuantizeInterpolatorID"};
        }

        static int getId(String s) {
            s.getClass();
            switch(s) {
                case "AnimateCircleAngleTo": {
                    return 606;
                }
                case "AnimateRelativeTo": {
                    return 605;
                }
                case "DrawPath": {
                    return 608;
                }
                case "PathMotionArc": {
                    return 607;
                }
                case "PathRotate": {
                    return 601;
                }
                case "PolarRelativeTo": {
                    return 609;
                }
                case "QuantizeInterpolator": {
                    return 604;
                }
                case "QuantizeInterpolatorID": {
                    return 612;
                }
                case "QuantizeInterpolatorType": {
                    return 611;
                }
                case "QuantizeMotionPhase": {
                    return 602;
                }
                case "QuantizeMotionSteps": {
                    return 610;
                }
                case "Stagger": {
                    return 600;
                }
                case "TransitionEasing": {
                    return 603;
                }
                default: {
                    return -1;
                }
            }
        }
    }

    public interface OnSwipe {
        public static final String AUTOCOMPLETE_MODE = "autocompletemode";
        public static final String[] AUTOCOMPLETE_MODE_ENUM = null;
        public static final String DRAG_DIRECTION = "dragdirection";
        public static final String DRAG_SCALE = "dragscale";
        public static final String DRAG_THRESHOLD = "dragthreshold";
        public static final String LIMIT_BOUNDS_TO = "limitboundsto";
        public static final String MAX_ACCELERATION = "maxacceleration";
        public static final String MAX_VELOCITY = "maxvelocity";
        public static final String MOVE_WHEN_SCROLLAT_TOP = "movewhenscrollattop";
        public static final String NESTED_SCROLL_FLAGS = "nestedscrollflags";
        public static final String[] NESTED_SCROLL_FLAGS_ENUM = null;
        public static final String ON_TOUCH_UP = "ontouchup";
        public static final String[] ON_TOUCH_UP_ENUM = null;
        public static final String ROTATION_CENTER_ID = "rotationcenterid";
        public static final String SPRINGS_TOP_THRESHOLD = "springstopthreshold";
        public static final String SPRING_BOUNDARY = "springboundary";
        public static final String[] SPRING_BOUNDARY_ENUM = null;
        public static final String SPRING_DAMPING = "springdamping";
        public static final String SPRING_MASS = "springmass";
        public static final String SPRING_STIFFNESS = "springstiffness";
        public static final String TOUCH_ANCHOR_ID = "touchanchorid";
        public static final String TOUCH_ANCHOR_SIDE = "touchanchorside";
        public static final String TOUCH_REGION_ID = "touchregionid";

        static {
            OnSwipe.ON_TOUCH_UP_ENUM = new String[]{"autoComplete", "autoCompleteToStart", "autoCompleteToEnd", "stop", "decelerate", "decelerateAndComplete", "neverCompleteToStart", "neverCompleteToEnd"};
            OnSwipe.SPRING_BOUNDARY_ENUM = new String[]{"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};
            OnSwipe.AUTOCOMPLETE_MODE_ENUM = new String[]{"continuousVelocity", "spring"};
            OnSwipe.NESTED_SCROLL_FLAGS_ENUM = new String[]{"none", "disablePostScroll", "disableScroll", "supportScrollUp"};
        }
    }

    public interface PositionType {
        public static final String[] KEY_WORDS = null;
        public static final String NAME = "KeyPosition";
        public static final String S_DRAWPATH = "drawPath";
        public static final String S_PERCENT_HEIGHT = "percentHeight";
        public static final String S_PERCENT_WIDTH = "percentWidth";
        public static final String S_PERCENT_X = "percentX";
        public static final String S_PERCENT_Y = "percentY";
        public static final String S_SIZE_PERCENT = "sizePercent";
        public static final String S_TRANSITION_EASING = "transitionEasing";
        public static final int TYPE_CURVE_FIT = 508;
        public static final int TYPE_DRAWPATH = 502;
        public static final int TYPE_PATH_MOTION_ARC = 509;
        public static final int TYPE_PERCENT_HEIGHT = 504;
        public static final int TYPE_PERCENT_WIDTH = 503;
        public static final int TYPE_PERCENT_X = 506;
        public static final int TYPE_PERCENT_Y = 507;
        public static final int TYPE_POSITION_TYPE = 510;
        public static final int TYPE_SIZE_PERCENT = 505;
        public static final int TYPE_TRANSITION_EASING = 501;

        static {
            PositionType.KEY_WORDS = new String[]{"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};
        }

        static int getId(String s) {
            s.getClass();
            switch(s) {
                case "drawPath": {
                    return 502;
                }
                case "percentHeight": {
                    return 504;
                }
                case "percentWidth": {
                    return 503;
                }
                case "percentX": {
                    return 506;
                }
                case "percentY": {
                    return 507;
                }
                case "sizePercent": {
                    return 505;
                }
                case "transitionEasing": {
                    return 501;
                }
                default: {
                    return -1;
                }
            }
        }

        static int getType(int v) {
            switch(v) {
                case 101: 
                case 501: 
                case 502: {
                    return 8;
                }
                case 503: 
                case 504: 
                case 505: 
                case 506: 
                case 507: {
                    return 4;
                }
                case 100: 
                case 508: {
                    return 2;
                }
                default: {
                    return -1;
                }
            }
        }
    }

    public interface TransitionType {
        public static final String[] KEY_WORDS = null;
        public static final String NAME = "Transitions";
        public static final String S_AUTO_TRANSITION = "autoTransition";
        public static final String S_DURATION = "duration";
        public static final String S_FROM = "from";
        public static final String S_INTERPOLATOR = "motionInterpolator";
        public static final String S_PATH_MOTION_ARC = "pathMotionArc";
        public static final String S_STAGGERED = "staggered";
        public static final String S_TO = "to";
        public static final String S_TRANSITION_FLAGS = "transitionFlags";
        public static final int TYPE_AUTO_TRANSITION = 704;
        public static final int TYPE_DURATION = 700;
        public static final int TYPE_FROM = 701;
        public static final int TYPE_INTERPOLATOR = 705;
        public static final int TYPE_PATH_MOTION_ARC = 509;
        public static final int TYPE_STAGGERED = 706;
        public static final int TYPE_TO = 702;
        public static final int TYPE_TRANSITION_FLAGS = 707;

        static {
            TransitionType.KEY_WORDS = new String[]{"duration", "from", "to", "pathMotionArc", "autoTransition", "motionInterpolator", "staggered", "from", "transitionFlags"};
        }

        static int getId(String s) {
            s.getClass();
            switch(s) {
                case "autoTransition": {
                    return 704;
                }
                case "duration": {
                    return 700;
                }
                case "from": {
                    return 701;
                }
                case "motionInterpolator": {
                    return 705;
                }
                case "pathMotionArc": {
                    return 509;
                }
                case "staggered": {
                    return 706;
                }
                case "to": {
                    return 702;
                }
                case "transitionFlags": {
                    return 707;
                }
                default: {
                    return -1;
                }
            }
        }

        static int getType(int v) {
            if(v != 509) {
                switch(v) {
                    case 700: {
                        break;
                    }
                    case 706: {
                        return 4;
                    }
                    case 701: 
                    case 702: 
                    case 705: 
                    case 707: {
                        return 8;
                    }
                    default: {
                        return -1;
                    }
                }
            }
            return 2;
        }
    }

    public interface TriggerType {
        public static final String CROSS = "CROSS";
        public static final String[] KEY_WORDS = null;
        public static final String NAME = "KeyTrigger";
        public static final String NEGATIVE_CROSS = "negativeCross";
        public static final String POSITIVE_CROSS = "positiveCross";
        public static final String POST_LAYOUT = "postLayout";
        public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
        public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
        public static final String TRIGGER_ID = "triggerID";
        public static final String TRIGGER_RECEIVER = "triggerReceiver";
        public static final String TRIGGER_SLACK = "triggerSlack";
        public static final int TYPE_CROSS = 312;
        public static final int TYPE_NEGATIVE_CROSS = 310;
        public static final int TYPE_POSITIVE_CROSS = 309;
        public static final int TYPE_POST_LAYOUT = 304;
        public static final int TYPE_TRIGGER_COLLISION_ID = 307;
        public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
        public static final int TYPE_TRIGGER_ID = 308;
        public static final int TYPE_TRIGGER_RECEIVER = 311;
        public static final int TYPE_TRIGGER_SLACK = 305;
        public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
        public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
        public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
        public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
        public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
        public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";

        static {
            TriggerType.KEY_WORDS = new String[]{"viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS"};
        }

        static int getId(String s) {
            s.getClass();
            switch(s) {
                case "CROSS": {
                    return 312;
                }
                case "negativeCross": {
                    return 310;
                }
                case "positiveCross": {
                    return 309;
                }
                case "postLayout": {
                    return 304;
                }
                case "triggerCollisionId": {
                    return 307;
                }
                case "triggerCollisionView": {
                    return 306;
                }
                case "triggerID": {
                    return 308;
                }
                case "triggerReceiver": {
                    return 311;
                }
                case "triggerSlack": {
                    return 305;
                }
                case "viewTransitionOnCross": {
                    return 301;
                }
                case "viewTransitionOnNegativeCross": {
                    return 303;
                }
                case "viewTransitionOnPositiveCross": {
                    return 302;
                }
                default: {
                    return -1;
                }
            }
        }
    }

    public static final int BOOLEAN_MASK = 1;
    public static final int FLOAT_MASK = 4;
    public static final int INT_MASK = 2;
    public static final int STRING_MASK = 8;
    public static final String S_CUSTOM = "CUSTOM";
    public static final int TYPE_FRAME_POSITION = 100;
    public static final int TYPE_TARGET = 101;

    int getId(String arg1);

    boolean setValue(int arg1, float arg2);

    boolean setValue(int arg1, int arg2);

    boolean setValue(int arg1, String arg2);

    boolean setValue(int arg1, boolean arg2);
}

