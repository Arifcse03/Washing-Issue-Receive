package mnj.mfg.model.lov;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 03 17:48:37 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FillBposVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        BpoNo {
            public Object get(FillBposVORowImpl obj) {
                return obj.getBpoNo();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setBpoNo((String)value);
            }
        }
        ,
        CurrentBpo {
            public Object get(FillBposVORowImpl obj) {
                return obj.getCurrentBpo();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setCurrentBpo((String)value);
            }
        }
        ,
        StnNumber {
            public Object get(FillBposVORowImpl obj) {
                return obj.getStnNumber();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setStnNumber((String)value);
            }
        }
        ,
        Color {
            public Object get(FillBposVORowImpl obj) {
                return obj.getColor();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        FinishGoodsColor {
            public Object get(FillBposVORowImpl obj) {
                return obj.getFinishGoodsColor();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setFinishGoodsColor((String)value);
            }
        }
        ,
        Season {
            public Object get(FillBposVORowImpl obj) {
                return obj.getSeason();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setSeason((String)value);
            }
        }
        ,
        Style {
            public Object get(FillBposVORowImpl obj) {
                return obj.getStyle();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setStyle((String)value);
            }
        }
        ,
        Quantity {
            public Object get(FillBposVORowImpl obj) {
                return obj.getQuantity();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setQuantity((String)value);
            }
        }
        ,
        ProductionType {
            public Object get(FillBposVORowImpl obj) {
                return obj.getProductionType();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setProductionType((String)value);
            }
        }
        ,
        Buyer {
            public Object get(FillBposVORowImpl obj) {
                return obj.getBuyer();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setBuyer((String)value);
            }
        }
        ,
        BuyerId {
            public Object get(FillBposVORowImpl obj) {
                return obj.getBuyerId();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setBuyerId((Number)value);
            }
        }
        ,
        CurrentStyle {
            public Object get(FillBposVORowImpl obj) {
                return obj.getCurrentStyle();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setCurrentStyle((String)value);
            }
        }
        ,
        CurrentSeason {
            public Object get(FillBposVORowImpl obj) {
                return obj.getCurrentSeason();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setCurrentSeason((String)value);
            }
        }
        ,
        Unit {
            public Object get(FillBposVORowImpl obj) {
                return obj.getUnit();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setUnit((String)value);
            }
        }
        ,
        WashEmdPrintInv {
            public Object get(FillBposVORowImpl obj) {
                return obj.getWashEmdPrintInv();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setWashEmdPrintInv((Number)value);
            }
        }
        ,
        WashUnwash {
            public Object get(FillBposVORowImpl obj) {
                return obj.getWashUnwash();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setWashUnwash((String)value);
            }
        }
        ,
        IssueQty {
            public Object get(FillBposVORowImpl obj) {
                return obj.getIssueQty();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setIssueQty((Number)value);
            }
        }
        ,
        Flag {
            public Object get(FillBposVORowImpl obj) {
                return obj.getFlag();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setFlag((String)value);
            }
        }
        ,
        FlagNew {
            public Object get(FillBposVORowImpl obj) {
                return obj.getFlagNew();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setFlagNew((String)value);
            }
        }
        ,
        Stn {
            public Object get(FillBposVORowImpl obj) {
                return obj.getStn();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setStn((String)value);
            }
        }
        ,
        OrderedQty {
            public Object get(FillBposVORowImpl obj) {
                return obj.getOrderedQty();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setOrderedQty((String)value);
            }
        }
        ,
        StyleName {
            public Object get(FillBposVORowImpl obj) {
                return obj.getStyleName();
            }

            public void put(FillBposVORowImpl obj, Object value) {
                obj.setStyleName((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(FillBposVORowImpl object);

        public abstract void put(FillBposVORowImpl object, Object value);

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
    public static final int CURRENTBPO = AttributesEnum.CurrentBpo.index();
    public static final int STNNUMBER = AttributesEnum.StnNumber.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int FINISHGOODSCOLOR = AttributesEnum.FinishGoodsColor.index();
    public static final int SEASON = AttributesEnum.Season.index();
    public static final int STYLE = AttributesEnum.Style.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int PRODUCTIONTYPE = AttributesEnum.ProductionType.index();
    public static final int BUYER = AttributesEnum.Buyer.index();
    public static final int BUYERID = AttributesEnum.BuyerId.index();
    public static final int CURRENTSTYLE = AttributesEnum.CurrentStyle.index();
    public static final int CURRENTSEASON = AttributesEnum.CurrentSeason.index();
    public static final int UNIT = AttributesEnum.Unit.index();
    public static final int WASHEMDPRINTINV = AttributesEnum.WashEmdPrintInv.index();
    public static final int WASHUNWASH = AttributesEnum.WashUnwash.index();
    public static final int ISSUEQTY = AttributesEnum.IssueQty.index();
    public static final int FLAG = AttributesEnum.Flag.index();
    public static final int FLAGNEW = AttributesEnum.FlagNew.index();
    public static final int STN = AttributesEnum.Stn.index();
    public static final int ORDEREDQTY = AttributesEnum.OrderedQty.index();
    public static final int STYLENAME = AttributesEnum.StyleName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public FillBposVORowImpl() {
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
     * Gets the attribute value for the calculated attribute CurrentBpo.
     * @return the CurrentBpo
     */
    public String getCurrentBpo() {
        return (String) getAttributeInternal(CURRENTBPO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentBpo.
     * @param value value to set the  CurrentBpo
     */
    public void setCurrentBpo(String value) {
        setAttributeInternal(CURRENTBPO, value);
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
     * Gets the attribute value for the calculated attribute FinishGoodsColor.
     * @return the FinishGoodsColor
     */
    public String getFinishGoodsColor() {
        return (String) getAttributeInternal(FINISHGOODSCOLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FinishGoodsColor.
     * @param value value to set the  FinishGoodsColor
     */
    public void setFinishGoodsColor(String value) {
        setAttributeInternal(FINISHGOODSCOLOR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Season.
     * @return the Season
     */
    public String getSeason() {
        return (String) getAttributeInternal(SEASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Season.
     * @param value value to set the  Season
     */
    public void setSeason(String value) {
        setAttributeInternal(SEASON, value);
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
     * Gets the attribute value for the calculated attribute Quantity.
     * @return the Quantity
     */
    public String getQuantity() {
        return (String) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Quantity.
     * @param value value to set the  Quantity
     */
    public void setQuantity(String value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ProductionType.
     * @return the ProductionType
     */
    public String getProductionType() {
        return (String) getAttributeInternal(PRODUCTIONTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProductionType.
     * @param value value to set the  ProductionType
     */
    public void setProductionType(String value) {
        setAttributeInternal(PRODUCTIONTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Buyer.
     * @return the Buyer
     */
    public String getBuyer() {
        return (String) getAttributeInternal(BUYER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Buyer.
     * @param value value to set the  Buyer
     */
    public void setBuyer(String value) {
        setAttributeInternal(BUYER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BuyerId.
     * @return the BuyerId
     */
    public Number getBuyerId() {
        return (Number) getAttributeInternal(BUYERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuyerId.
     * @param value value to set the  BuyerId
     */
    public void setBuyerId(Number value) {
        setAttributeInternal(BUYERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentStyle.
     * @return the CurrentStyle
     */
    public String getCurrentStyle() {
        return (String) getAttributeInternal(CURRENTSTYLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentStyle.
     * @param value value to set the  CurrentStyle
     */
    public void setCurrentStyle(String value) {
        setAttributeInternal(CURRENTSTYLE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentSeason.
     * @return the CurrentSeason
     */
    public String getCurrentSeason() {
        return (String) getAttributeInternal(CURRENTSEASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentSeason.
     * @param value value to set the  CurrentSeason
     */
    public void setCurrentSeason(String value) {
        setAttributeInternal(CURRENTSEASON, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Unit.
     * @return the Unit
     */
    public String getUnit() {
        return (String) getAttributeInternal(UNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Unit.
     * @param value value to set the  Unit
     */
    public void setUnit(String value) {
        setAttributeInternal(UNIT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WashEmdPrintInv.
     * @return the WashEmdPrintInv
     */
    public Number getWashEmdPrintInv() {
        return (Number) getAttributeInternal(WASHEMDPRINTINV);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WashEmdPrintInv.
     * @param value value to set the  WashEmdPrintInv
     */
    public void setWashEmdPrintInv(Number value) {
        setAttributeInternal(WASHEMDPRINTINV, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WashUnwash.
     * @return the WashUnwash
     */
    public String getWashUnwash() {
        return (String) getAttributeInternal(WASHUNWASH);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WashUnwash.
     * @param value value to set the  WashUnwash
     */
    public void setWashUnwash(String value) {
        setAttributeInternal(WASHUNWASH, value);
    }

    /**
     * Gets the attribute value for the calculated attribute IssueQty.
     * @return the IssueQty
     */
    public Number getIssueQty() {
        return (Number) getAttributeInternal(ISSUEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute IssueQty.
     * @param value value to set the  IssueQty
     */
    public void setIssueQty(Number value) {
        setAttributeInternal(ISSUEQTY, value);
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
     * Gets the attribute value for the calculated attribute FlagNew.
     * @return the FlagNew
     */
    public String getFlagNew() {
        return (String) getAttributeInternal(FLAGNEW);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FlagNew.
     * @param value value to set the  FlagNew
     */
    public void setFlagNew(String value) {
        setAttributeInternal(FLAGNEW, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Stn.
     * @return the Stn
     */
    public String getStn() {
        return (String) getAttributeInternal(STN);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Stn.
     * @param value value to set the  Stn
     */
    public void setStn(String value) {
        setAttributeInternal(STN, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrderedQty.
     * @return the OrderedQty
     */
    public String getOrderedQty() {
        return (String) getAttributeInternal(ORDEREDQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrderedQty.
     * @param value value to set the  OrderedQty
     */
    public void setOrderedQty(String value) {
        setAttributeInternal(ORDEREDQTY, value);
    }


    /**
     * Gets the attribute value for the calculated attribute StyleName.
     * @return the StyleName
     */
    public String getStyleName() {
        return (String) getAttributeInternal(STYLENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StyleName.
     * @param value value to set the  StyleName
     */
    public void setStyleName(String value) {
        setAttributeInternal(STYLENAME, value);
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