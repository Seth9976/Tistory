package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import java.util.Set;

public class WidgetFrame {
    public float alpha;
    public int bottom;
    public float interpolatedPos;
    public int left;
    public final HashMap mCustom;
    public String name;
    public static float phone_orientation = NaNf;
    public float pivotX;
    public float pivotY;
    public int right;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public int top;
    public float translationX;
    public float translationY;
    public float translationZ;
    public int visibility;
    public ConstraintWidget widget;

    public WidgetFrame() {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = NaNf;
        this.pivotY = NaNf;
        this.rotationX = NaNf;
        this.rotationY = NaNf;
        this.rotationZ = NaNf;
        this.translationX = NaNf;
        this.translationY = NaNf;
        this.translationZ = NaNf;
        this.scaleX = NaNf;
        this.scaleY = NaNf;
        this.alpha = NaNf;
        this.interpolatedPos = NaNf;
        this.visibility = 0;
        this.mCustom = new HashMap();
        this.name = null;
    }

    public WidgetFrame(WidgetFrame widgetFrame0) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = NaNf;
        this.pivotY = NaNf;
        this.rotationX = NaNf;
        this.rotationY = NaNf;
        this.rotationZ = NaNf;
        this.translationX = NaNf;
        this.translationY = NaNf;
        this.translationZ = NaNf;
        this.scaleX = NaNf;
        this.scaleY = NaNf;
        this.alpha = NaNf;
        this.interpolatedPos = NaNf;
        this.visibility = 0;
        this.mCustom = new HashMap();
        this.name = null;
        this.widget = widgetFrame0.widget;
        this.left = widgetFrame0.left;
        this.top = widgetFrame0.top;
        this.right = widgetFrame0.right;
        this.bottom = widgetFrame0.bottom;
        this.updateAttributes(widgetFrame0);
    }

    public WidgetFrame(ConstraintWidget constraintWidget0) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = NaNf;
        this.pivotY = NaNf;
        this.rotationX = NaNf;
        this.rotationY = NaNf;
        this.rotationZ = NaNf;
        this.translationX = NaNf;
        this.translationY = NaNf;
        this.translationZ = NaNf;
        this.scaleX = NaNf;
        this.scaleY = NaNf;
        this.alpha = NaNf;
        this.interpolatedPos = NaNf;
        this.visibility = 0;
        this.mCustom = new HashMap();
        this.name = null;
        this.widget = constraintWidget0;
    }

    public static void a(float f, String s, StringBuilder stringBuilder0) {
        if(Float.isNaN(f)) {
            return;
        }
        stringBuilder0.append(s);
        stringBuilder0.append(": ");
        stringBuilder0.append(f);
        stringBuilder0.append(",\n");
    }

    public void addCustomColor(String s, int v) {
        this.setCustomAttribute(s, 902, v);
    }

    public void addCustomFloat(String s, float f) {
        this.setCustomAttribute(s, 901, f);
    }

    public static void b(int v, String s, StringBuilder stringBuilder0) {
        stringBuilder0.append(s);
        stringBuilder0.append(": ");
        stringBuilder0.append(v);
        stringBuilder0.append(",\n");
    }

    public static float c(float f, float f1, float f2, float f3) {
        boolean z = Float.isNaN(f);
        boolean z1 = Float.isNaN(f1);
        if(z && z1) {
            return NaNf;
        }
        if(z) {
            f = f2;
        }
        if(z1) {
            f1 = f2;
        }
        return (f1 - f) * f3 + f;
    }

    public float centerX() {
        return ((float)(this.right - this.left)) / 2.0f + ((float)this.left);
    }

    public float centerY() {
        return ((float)(this.bottom - this.top)) / 2.0f + ((float)this.top);
    }

    public CustomVariable getCustomAttribute(String s) {
        return (CustomVariable)this.mCustom.get(s);
    }

    public Set getCustomAttributeNames() {
        return this.mCustom.keySet();
    }

    // 去混淆评级： 低(20)
    public int getCustomColor(String s) {
        return this.mCustom.containsKey(s) ? ((CustomVariable)this.mCustom.get(s)).getColorValue() : -21880;
    }

    // 去混淆评级： 低(20)
    public float getCustomFloat(String s) {
        return this.mCustom.containsKey(s) ? ((CustomVariable)this.mCustom.get(s)).getFloatValue() : NaNf;
    }

    public String getId() [...] // 潜在的解密器

    public int height() {
        return Math.max(0, this.bottom - this.top);
    }

    public static void interpolate(int v, int v1, WidgetFrame widgetFrame0, WidgetFrame widgetFrame1, WidgetFrame widgetFrame2, Transition transition0, float f) {
        float f7;
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        float f5;
        float f4;
        float f3;
        int v12;
        int v11;
        int v10;
        int v2 = widgetFrame1.left;
        int v3 = widgetFrame1.top;
        int v4 = widgetFrame2.left;
        int v5 = widgetFrame2.top;
        int v6 = widgetFrame2.right - v4;
        int v7 = widgetFrame1.right - v2;
        int v8 = widgetFrame2.bottom - v5;
        int v9 = widgetFrame1.bottom - v3;
        float f1 = widgetFrame1.alpha;
        float f2 = widgetFrame2.alpha;
        if(widgetFrame1.visibility == 8) {
            v3 = (int)(((float)v3) - ((float)v8) / 2.0f);
            v10 = (int)(((float)v2) - ((float)v6) / 2.0f);
            if(Float.isNaN(f1)) {
                v11 = v8;
                v12 = v6;
                f3 = 0.0f;
            }
            else {
                f3 = f1;
                v12 = v6;
                v11 = v8;
            }
        }
        else {
            v12 = v7;
            f3 = f1;
            v11 = v9;
            v10 = v2;
        }
        if(widgetFrame2.visibility == 8) {
            v4 = (int)(((float)v4) - ((float)v12) / 2.0f);
            v5 = (int)(((float)v5) - ((float)v11) / 2.0f);
            v6 = v12;
            v8 = v11;
            if(Float.isNaN(f2)) {
                f2 = 0.0f;
            }
        }
        if(Float.isNaN(f3) && !Float.isNaN(f2)) {
            f3 = 1.0f;
        }
        if(!Float.isNaN(f3) && Float.isNaN(f2)) {
            f2 = 1.0f;
        }
        if(widgetFrame1.visibility == 4) {
            f4 = f2;
            f5 = 0.0f;
        }
        else {
            f5 = f3;
            f4 = f2;
        }
        float f6 = widgetFrame2.visibility == 4 ? 0.0f : f4;
        if(widgetFrame0.widget == null || !transition0.hasPositionKeyframes()) {
            v13 = v3;
            f7 = f;
            v16 = v10;
            v17 = v4;
        }
        else {
            e e0 = transition0.findPreviousPosition(widgetFrame0.widget.stringId, ((int)(100.0f * f)));
            v13 = v3;
            e e1 = transition0.findNextPosition(widgetFrame0.widget.stringId, ((int)(100.0f * f)));
            if(e0 == e1) {
                e1 = null;
            }
            if(e0 == null) {
                v14 = v4;
                v15 = 0;
            }
            else {
                v10 = (int)(e0.b * ((float)v));
                v14 = v4;
                v13 = (int)(e0.c * ((float)v1));
                v15 = e0.a;
            }
            v16 = v10;
            if(e1 == null) {
                v18 = 100;
                v17 = v14;
            }
            else {
                v17 = (int)(e1.b * ((float)v));
                v5 = (int)(e1.c * ((float)v1));
                v18 = e1.a;
            }
            f7 = (100.0f * f - ((float)v15)) / ((float)(v18 - v15));
        }
        widgetFrame0.widget = widgetFrame1.widget;
        int v19 = (int)(((float)(v17 - v16)) * f7 + ((float)v16));
        widgetFrame0.left = v19;
        int v20 = (int)(f7 * ((float)(v5 - v13)) + ((float)v13));
        widgetFrame0.top = v20;
        widgetFrame0.right = v19 + ((int)(((float)v6) * f + ((float)v12) * (1.0f - f)));
        widgetFrame0.bottom = v20 + ((int)(((float)v8) * f + (1.0f - f) * ((float)v11)));
        widgetFrame0.pivotX = WidgetFrame.c(widgetFrame1.pivotX, widgetFrame2.pivotX, 0.5f, f);
        widgetFrame0.pivotY = WidgetFrame.c(widgetFrame1.pivotY, widgetFrame2.pivotY, 0.5f, f);
        widgetFrame0.rotationX = WidgetFrame.c(widgetFrame1.rotationX, widgetFrame2.rotationX, 0.0f, f);
        widgetFrame0.rotationY = WidgetFrame.c(widgetFrame1.rotationY, widgetFrame2.rotationY, 0.0f, f);
        widgetFrame0.rotationZ = WidgetFrame.c(widgetFrame1.rotationZ, widgetFrame2.rotationZ, 0.0f, f);
        widgetFrame0.scaleX = WidgetFrame.c(widgetFrame1.scaleX, widgetFrame2.scaleX, 1.0f, f);
        widgetFrame0.scaleY = WidgetFrame.c(widgetFrame1.scaleY, widgetFrame2.scaleY, 1.0f, f);
        widgetFrame0.translationX = WidgetFrame.c(widgetFrame1.translationX, widgetFrame2.translationX, 0.0f, f);
        widgetFrame0.translationY = WidgetFrame.c(widgetFrame1.translationY, widgetFrame2.translationY, 0.0f, f);
        widgetFrame0.translationZ = WidgetFrame.c(widgetFrame1.translationZ, widgetFrame2.translationZ, 0.0f, f);
        widgetFrame0.alpha = WidgetFrame.c(f5, f6, 1.0f, f);
        Set set0 = widgetFrame2.mCustom.keySet();
        widgetFrame0.mCustom.clear();
        for(Object object0: set0) {
            String s = (String)object0;
            if(widgetFrame1.mCustom.containsKey(s)) {
                CustomVariable customVariable0 = (CustomVariable)widgetFrame1.mCustom.get(s);
                CustomVariable customVariable1 = (CustomVariable)widgetFrame2.mCustom.get(s);
                CustomVariable customVariable2 = new CustomVariable(customVariable0);
                widgetFrame0.mCustom.put(s, customVariable2);
                if(customVariable0.numberOfInterpolatedValues() == 1) {
                    customVariable2.setValue(WidgetFrame.c(customVariable0.getValueToInterpolate(), customVariable1.getValueToInterpolate(), 0.0f, f));
                }
                else {
                    int v21 = customVariable0.numberOfInterpolatedValues();
                    float[] arr_f = new float[v21];
                    float[] arr_f1 = new float[v21];
                    customVariable0.getValuesToInterpolate(arr_f);
                    customVariable1.getValuesToInterpolate(arr_f1);
                    for(int v22 = 0; v22 < v21; ++v22) {
                        arr_f[v22] = WidgetFrame.c(arr_f[v22], arr_f1[v22], 0.0f, f);
                        customVariable2.setValue(arr_f);
                    }
                }
            }
        }
    }

    // 去混淆评级： 中等(90)
    public boolean isDefaultTransform() {
        return Float.isNaN(this.rotationX) && Float.isNaN(this.rotationY) && Float.isNaN(this.rotationZ) && Float.isNaN(this.translationX) && Float.isNaN(this.translationY) && Float.isNaN(this.translationZ) && Float.isNaN(this.scaleX) && Float.isNaN(this.scaleY) && Float.isNaN(this.alpha);
    }

    public StringBuilder serialize(StringBuilder stringBuilder0) {
        return this.serialize(stringBuilder0, false);
    }

    public StringBuilder serialize(StringBuilder stringBuilder0, boolean z) {
        stringBuilder0.append("{\n");
        WidgetFrame.b(this.left, "left", stringBuilder0);
        WidgetFrame.b(this.top, "top", stringBuilder0);
        WidgetFrame.b(this.right, "right", stringBuilder0);
        WidgetFrame.b(this.bottom, "bottom", stringBuilder0);
        WidgetFrame.a(this.pivotX, "pivotX", stringBuilder0);
        WidgetFrame.a(this.pivotY, "pivotY", stringBuilder0);
        WidgetFrame.a(this.rotationX, "rotationX", stringBuilder0);
        WidgetFrame.a(this.rotationY, "rotationY", stringBuilder0);
        WidgetFrame.a(this.rotationZ, "rotationZ", stringBuilder0);
        WidgetFrame.a(this.translationX, "translationX", stringBuilder0);
        WidgetFrame.a(this.translationY, "translationY", stringBuilder0);
        WidgetFrame.a(this.translationZ, "translationZ", stringBuilder0);
        WidgetFrame.a(this.scaleX, "scaleX", stringBuilder0);
        WidgetFrame.a(this.scaleY, "scaleY", stringBuilder0);
        WidgetFrame.a(this.alpha, "alpha", stringBuilder0);
        WidgetFrame.b(this.visibility, "visibility", stringBuilder0);
        WidgetFrame.a(this.interpolatedPos, "interpolatedPos", stringBuilder0);
        if(this.widget != null) {
            Type[] arr_constraintAnchor$Type = Type.values();
            for(int v = 0; v < arr_constraintAnchor$Type.length; ++v) {
                Type constraintAnchor$Type0 = arr_constraintAnchor$Type[v];
                ConstraintAnchor constraintAnchor0 = this.widget.getAnchor(constraintAnchor$Type0);
                if(constraintAnchor0 != null && constraintAnchor0.mTarget != null) {
                    stringBuilder0.append("Anchor");
                    stringBuilder0.append(constraintAnchor$Type0.name());
                    stringBuilder0.append(": [\'");
                    String s = constraintAnchor0.mTarget.getOwner().stringId;
                    if(s == null) {
                        s = "#PARENT";
                    }
                    stringBuilder0.append(s);
                    stringBuilder0.append("\', \'");
                    stringBuilder0.append(constraintAnchor0.mTarget.getType().name());
                    stringBuilder0.append("\', \'");
                    stringBuilder0.append(constraintAnchor0.mMargin);
                    stringBuilder0.append("\'],\n");
                }
            }
        }
        if(z) {
            WidgetFrame.a(WidgetFrame.phone_orientation, "phone_orientation", stringBuilder0);
        }
        if(z) {
            WidgetFrame.a(WidgetFrame.phone_orientation, "phone_orientation", stringBuilder0);
        }
        if(this.mCustom.size() != 0) {
            stringBuilder0.append("custom : {\n");
            for(Object object0: this.mCustom.keySet()) {
                CustomVariable customVariable0 = (CustomVariable)this.mCustom.get(((String)object0));
                stringBuilder0.append(((String)object0));
                stringBuilder0.append(": ");
                switch(customVariable0.getType()) {
                    case 900: {
                        stringBuilder0.append(customVariable0.getIntegerValue());
                        stringBuilder0.append(",\n");
                        break;
                    }
                    case 902: {
                        stringBuilder0.append("\'");
                        stringBuilder0.append(CustomVariable.colorString(customVariable0.getIntegerValue()));
                        stringBuilder0.append("\',\n");
                        break;
                    }
                    case 903: {
                        stringBuilder0.append("\'");
                        stringBuilder0.append(customVariable0.getStringValue());
                        stringBuilder0.append("\',\n");
                        break;
                    }
                    case 904: {
                        stringBuilder0.append("\'");
                        stringBuilder0.append(customVariable0.getBooleanValue());
                        stringBuilder0.append("\',\n");
                        break;
                    }
                    case 901: 
                    case 905: {
                        stringBuilder0.append(customVariable0.getFloatValue());
                        stringBuilder0.append(",\n");
                    }
                }
            }
            stringBuilder0.append("}\n");
        }
        stringBuilder0.append("}\n");
        return stringBuilder0;
    }

    public void setCustomAttribute(String s, int v, float f) {
        if(this.mCustom.containsKey(s)) {
            ((CustomVariable)this.mCustom.get(s)).setFloatValue(f);
            return;
        }
        CustomVariable customVariable0 = new CustomVariable(s, v, f);
        this.mCustom.put(s, customVariable0);
    }

    public void setCustomAttribute(String s, int v, int v1) {
        if(this.mCustom.containsKey(s)) {
            ((CustomVariable)this.mCustom.get(s)).setIntValue(v1);
            return;
        }
        CustomVariable customVariable0 = new CustomVariable(s, v, v1);
        this.mCustom.put(s, customVariable0);
    }

    public void setCustomAttribute(String s, int v, String s1) {
        if(this.mCustom.containsKey(s)) {
            ((CustomVariable)this.mCustom.get(s)).setStringValue(s1);
            return;
        }
        CustomVariable customVariable0 = new CustomVariable(s, v, s1);
        this.mCustom.put(s, customVariable0);
    }

    public void setCustomAttribute(String s, int v, boolean z) {
        if(this.mCustom.containsKey(s)) {
            ((CustomVariable)this.mCustom.get(s)).setBooleanValue(z);
            return;
        }
        CustomVariable customVariable0 = new CustomVariable(s, v, z);
        this.mCustom.put(s, customVariable0);
    }

    public void setCustomValue(CustomAttribute customAttribute0, float[] arr_f) {
    }

    public boolean setValue(String s, CLElement cLElement0) throws CLParsingException {
        s.getClass();
        switch(s) {
            case "alpha": {
                this.alpha = cLElement0.getFloat();
                return true;
            }
            case "bottom": {
                this.bottom = cLElement0.getInt();
                return true;
            }
            case "custom": {
                int v1 = ((CLObject)cLElement0).size();
                for(int v = 0; v < v1; ++v) {
                    CLKey cLKey0 = (CLKey)((CLObject)cLElement0).get(v);
                    cLKey0.content();
                    CLElement cLElement1 = cLKey0.getValue();
                    String s1 = cLElement1.content();
                    if(s1.matches("#[0-9a-fA-F]+")) {
                        int v2 = Integer.parseInt(s1.substring(1), 16);
                        this.setCustomAttribute(cLKey0.content(), 902, v2);
                    }
                    else if(cLElement1 instanceof CLNumber) {
                        this.setCustomAttribute(cLKey0.content(), 901, cLElement1.getFloat());
                    }
                    else {
                        this.setCustomAttribute(cLKey0.content(), 903, s1);
                    }
                }
                return true;
            }
            case "interpolatedPos": {
                this.interpolatedPos = cLElement0.getFloat();
                return true;
            }
            case "left": {
                this.left = cLElement0.getInt();
                return true;
            }
            case "phone_orientation": {
                WidgetFrame.phone_orientation = cLElement0.getFloat();
                return true;
            }
            case "pivotX": {
                this.pivotX = cLElement0.getFloat();
                return true;
            }
            case "pivotY": {
                this.pivotY = cLElement0.getFloat();
                return true;
            }
            case "right": {
                this.right = cLElement0.getInt();
                return true;
            }
            case "rotationX": {
                this.rotationX = cLElement0.getFloat();
                return true;
            }
            case "rotationY": {
                this.rotationY = cLElement0.getFloat();
                return true;
            }
            case "rotationZ": {
                this.rotationZ = cLElement0.getFloat();
                return true;
            }
            case "scaleX": {
                this.scaleX = cLElement0.getFloat();
                return true;
            }
            case "scaleY": {
                this.scaleY = cLElement0.getFloat();
                return true;
            }
            case "top": {
                this.top = cLElement0.getInt();
                return true;
            }
            case "translationX": {
                this.translationX = cLElement0.getFloat();
                return true;
            }
            case "translationY": {
                this.translationY = cLElement0.getFloat();
                return true;
            }
            case "translationZ": {
                this.translationZ = cLElement0.getFloat();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public WidgetFrame update() {
        ConstraintWidget constraintWidget0 = this.widget;
        if(constraintWidget0 != null) {
            this.left = constraintWidget0.getLeft();
            this.top = this.widget.getTop();
            this.right = this.widget.getRight();
            this.bottom = this.widget.getBottom();
            this.updateAttributes(this.widget.frame);
        }
        return this;
    }

    public WidgetFrame update(ConstraintWidget constraintWidget0) {
        if(constraintWidget0 == null) {
            return this;
        }
        this.widget = constraintWidget0;
        this.update();
        return this;
    }

    public void updateAttributes(WidgetFrame widgetFrame0) {
        this.pivotX = widgetFrame0.pivotX;
        this.pivotY = widgetFrame0.pivotY;
        this.rotationX = widgetFrame0.rotationX;
        this.rotationY = widgetFrame0.rotationY;
        this.rotationZ = widgetFrame0.rotationZ;
        this.translationX = widgetFrame0.translationX;
        this.translationY = widgetFrame0.translationY;
        this.translationZ = widgetFrame0.translationZ;
        this.scaleX = widgetFrame0.scaleX;
        this.scaleY = widgetFrame0.scaleY;
        this.alpha = widgetFrame0.alpha;
        this.visibility = widgetFrame0.visibility;
        this.mCustom.clear();
        for(Object object0: widgetFrame0.mCustom.values()) {
            String s = ((CustomVariable)object0).getName();
            CustomVariable customVariable0 = ((CustomVariable)object0).copy();
            this.mCustom.put(s, customVariable0);
        }
    }

    public int width() {
        return Math.max(0, this.right - this.left);
    }
}

