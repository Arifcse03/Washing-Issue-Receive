package mnj.mfg.model.lov;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 03 18:05:23 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class papulateSizeVoRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        BpoNo {
            public Object get(papulateSizeVoRowImpl obj) {
                return obj.getBpoNo();
            }

            public void put(papulateSizeVoRowImpl obj, Object value) {
                obj.setBpoNo((String)value);
            }
        }
        ,
        Style {
            public Object get(papulateSizeVoRowImpl obj) {
                return obj.getStyle();
            }

            public void put(papulateSizeVoRowImpl obj, Object value) {
                obj.setStyle((String)value);
            }
        }
        ,
        BpoId {
            public Object get(papulateSizeVoRowImpl obj) {
                return obj.getBpoId();
            }

            public void put(papulateSizeVoRowImpl obj, Object value) {
                obj.setBpoId((Number)value);
            }
        }
        ,
        Color {
            public Object get(papulateSizeVoRowImpl obj) {
                return obj.getColor();
            }

            public void put(papulateSizeVoRowImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        Inseam {
            public Object get(papulateSizeVoRowImpl obj) {
                return obj.getInseam();
            }

            public void put(papulateSizeVoRowImpl obj, Object value) {
                obj.setInseam((String)value);
            }
        }
        ,
        TransType {
            public Object get(papulateSizeVoRowImpl obj) {
                return obj.getTransType();
            }

            public void put(papulateSizeVoRowImpl obj, Object value) {
                obj.setTransType((String)value);
            }
        }
        ,
        SizeVal {
            public Object get(papulateSizeVoRowImpl obj) {
                return obj.getSizeVal();
            }

            public void put(papulateSizeVoRowImpl obj, Object value) {
                obj.setSizeVal((String)value);
            }
        }
        ,
        ReceivedQty {
            public Object get(papulateSizeVoRowImpl obj) {
                return obj.getReceivedQty();
            }

            public void put(papulateSizeVoRowImpl obj, Object value) {
                obj.setReceivedQty((Number)value);
            }
        }
        ,
        DeleveredQuantity {
            public Object get(papulateSizeVoRowImpl obj) {
                return obj.getDeleveredQuantity();
            }

            public void put(papulateSizeVoRowImpl obj, Object value) {
                obj.setDeleveredQuantity((Number)value);
            }
        }
        ,
        BalanceQty {
            public Object get(papulateSizeVoRowImpl obj) {
                return obj.getBalanceQty();
            }

            public void put(papulateSizeVoRowImpl obj, Object value) {
                obj.setBalanceQty((Number)value);
            }
        }
        ,
        StnNumber {
            public Object get(papulateSizeVoRowImpl obj) {
                return obj.getStnNumber();
            }

            public void put(papulateSizeVoRowImpl obj, Object value) {
                obj.setStnNumber((String)value);
            }
        }
        ,
        Flag {
            public Object get(papulateSizeVoRowImpl obj) {
                return obj.getFlag();
            }

            public void put(papulateSizeVoRowImpl obj, Object value) {
                obj.setFlag((String)value);
            }
        }
        ,
        FlagSize {
            public Object get(papulateSizeVoRowImpl obj) {
                return obj.getFlagSize();
            }

            public void put(papulateSizeVoRowImpl obj, Object value) {
                obj.setFlagSize((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(papulateSizeVoRowImpl object);

        public abstract void put(papulateSizeVoRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int BPONO = AttributesEnum.BpoNo.index();
    public static final int STYLE = AttributesEnum.Style.index();
    public static final int BPOID = AttributesEnum.BpoId.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int INSEAM = AttributesEnum.Inseam.index();
    public static final int TRANSTYPE = AttributesEnum.TransType.index();
    public static final int SIZEVAL = AttributesEnum.SizeVal.index();
    public static final int RECEIVEDQTY = AttributesEnum.ReceivedQty.index();
    public static final int DELEVEREDQUANTITY = AttributesEnum.DeleveredQuantity.index();
    public static final int BALANCEQTY = AttributesEnum.BalanceQty.index();
    public static final int STNNUMBER = AttributesEnum.StnNumber.index();
    public static final int FLAG = AttributesEnum.Flag.index();
    public static final int FLAGSIZE = AttributesEnum.FlagSize.index();

    /**
     * This is the default constructor (do not remove).
     */
    public papulateSizeVoRowImpl() {
    }


    /**
     * Gets the attribute value for the calculated attribute BpoNo.
     * @return the BpoNo
     */
    public String getBpoNo() {
        return (String) getAttributeInternal(BPONO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BpoNo.
     * @param value value to set the  BpoNo
     */
    public void setBpoNo(String value) {
        setAttributeInternal(BPONO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Style.
     * @return the Style
     */
    public String getStyle() {
        return (String) getAttributeInternal(STYLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Style.
     * @param value value to set the  Style
     */
    public void setStyle(String value) {
        setAttributeInternal(STYLE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BpoId.
     * @return the BpoId
     */
    public Number getBpoId() {
        return (Number) getAttributeInternal(BPOID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BpoId.
     * @param value value to set the  BpoId
     */
    public void setBpoId(Number value) {
        setAttributeInternal(BPOID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StnNumber.
     * @return the StnNumber
     */
    public String getStnNumber() {
        return (String) getAttributeInternal(STNNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StnNumber.
     * @param value value to set the  StnNumber
     */
    public void setStnNumber(String value) {
        setAttributeInternal(STNNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Color.
     * @return the Color
     */
    public String getColor() {
        return (String) getAttributeInternal(COLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Color.
     * @param value value to set the  Color
     */
    public void setColor(String value) {
        setAttributeInternal(COLOR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Inseam.
     * @return the Inseam
     */
    public String getInseam() {
        return (String) getAttributeInternal(INSEAM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Inseam.
     * @param value value to set the  Inseam
     */
    public void setInseam(String value) {
        setAttributeInternal(INSEAM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransType.
     * @return the TransType
     */
    public String getTransType() {
        return (String) getAttributeInternal(TRANSTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransType.
     * @param value value to set the  TransType
     */
    public void setTransType(String value) {
        setAttributeInternal(TRANSTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SizeVal.
     * @return the SizeVal
     */
    public String getSizeVal() {
        return (String) getAttributeInternal(SIZEVAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SizeVal.
     * @param value value to set the  SizeVal
     */
    public void setSizeVal(String value) {
        setAttributeInternal(SIZEVAL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ReceivedQty.
     * @return the ReceivedQty
     */
    public Number getReceivedQty() {
        return (Number) getAttributeInternal(RECEIVEDQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ReceivedQty.
     * @param value value to set the  ReceivedQty
     */
    public void setReceivedQty(Number value) {
        setAttributeInternal(RECEIVEDQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DeleveredQuantity.
     * @return the DeleveredQuantity
     */
    public Number getDeleveredQuantity() {
        return (Number) getAttributeInternal(DELEVEREDQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DeleveredQuantity.
     * @param value value to set the  DeleveredQuantity
     */
    public void setDeleveredQuantity(Number value) {
        setAttributeInternal(DELEVEREDQUANTITY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BalanceQty.
     * @return the BalanceQty
     */
    public Number getBalanceQty() {
        return (Number) getAttributeInternal(BALANCEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BalanceQty.
     * @param value value to set the  BalanceQty
     */
    public void setBalanceQty(Number value) {
        setAttributeInternal(BALANCEQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Flag.
     * @return the Flag
     */
    public String getFlag() {
        return (String) getAttributeInternal(FLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Flag.
     * @param value value to set the  Flag
     */
    public void setFlag(String value) {
        setAttributeInternal(FLAG, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FlagSize.
     * @return the FlagSize
     */
    public String getFlagSize() {
        return (String) getAttributeInternal(FLAGSIZE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FlagSize.
     * @param value value to set the  FlagSize
     */
    public void setFlagSize(String value) {
        setAttributeInternal(FLAGSIZE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
