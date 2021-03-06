package mnj.mfg.model.views;

import mnj.mfg.model.entities.MNJ_ISSUEREC_WASH_DEL_SIZE_EOImpl;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Feb 21 16:12:05 PKT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        LineId {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getLineId();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        SizeDetail {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getSizeDetail();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setSizeDetail((Number)value);
            }
        }
        ,
        Inseam {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getInseam();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setInseam((String)value);
            }
        }
        ,
        SizeInseam {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getSizeInseam();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setSizeInseam((String)value);
            }
        }
        ,
        Quantity {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getQuantity();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setQuantity((Number)value);
            }
        }
        ,
        Attribute1 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute1();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute1((String)value);
            }
        }
        ,
        Attribute2 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute2();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute2((String)value);
            }
        }
        ,
        Attribute3 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute3();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute3((String)value);
            }
        }
        ,
        Attribute4 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute4();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute4((String)value);
            }
        }
        ,
        Attribute5 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute5();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute5((String)value);
            }
        }
        ,
        Attribute6 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute6();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute6((String)value);
            }
        }
        ,
        Attribute7 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute7();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute7((String)value);
            }
        }
        ,
        Attribute8 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute8();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute8((String)value);
            }
        }
        ,
        Attribute9 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute9();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute9((String)value);
            }
        }
        ,
        Attribute10 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute10();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute10((String)value);
            }
        }
        ,
        Attribute11 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute11();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute11((String)value);
            }
        }
        ,
        Attribute12 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute12();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute12((String)value);
            }
        }
        ,
        Attribute13 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute13();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute13((String)value);
            }
        }
        ,
        Attribute14 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute14();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute14((String)value);
            }
        }
        ,
        Attribute15 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getAttribute15();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttribute15((String)value);
            }
        }
        ,
        SalesorderId {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getSalesorderId();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setSalesorderId((Number)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        Remarks {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getRemarks();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setRemarks((String)value);
            }
        }
        ,
        ProblemType {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getProblemType();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setProblemType((String)value);
            }
        }
        ,
        RejectionType {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getRejectionType();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setRejectionType((String)value);
            }
        }
        ,
        StitchingWashingOne {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getStitchingWashingOne();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setStitchingWashingOne((String)value);
            }
        }
        ,
        StitchingWashingTwo {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getStitchingWashingTwo();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setStitchingWashingTwo((String)value);
            }
        }
        ,
        QtyTotal {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getQtyTotal();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setQtyTotal((Number)value);
            }
        }
        ,
        Rejection_Type_LOV1 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getRejection_Type_LOV1();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Problem_Type_LOV1 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getProblem_Type_LOV1();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Stitching_Washing_LOV1 {
            public Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj) {
                return obj.getStitching_Washing_LOV1();
            }

            public void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl obj,
                            Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl object);

        public abstract void put(MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl object,
                                 Object value);

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


    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int SIZEDETAIL = AttributesEnum.SizeDetail.index();
    public static final int INSEAM = AttributesEnum.Inseam.index();
    public static final int SIZEINSEAM = AttributesEnum.SizeInseam.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int ATTRIBUTE1 = AttributesEnum.Attribute1.index();
    public static final int ATTRIBUTE2 = AttributesEnum.Attribute2.index();
    public static final int ATTRIBUTE3 = AttributesEnum.Attribute3.index();
    public static final int ATTRIBUTE4 = AttributesEnum.Attribute4.index();
    public static final int ATTRIBUTE5 = AttributesEnum.Attribute5.index();
    public static final int ATTRIBUTE6 = AttributesEnum.Attribute6.index();
    public static final int ATTRIBUTE7 = AttributesEnum.Attribute7.index();
    public static final int ATTRIBUTE8 = AttributesEnum.Attribute8.index();
    public static final int ATTRIBUTE9 = AttributesEnum.Attribute9.index();
    public static final int ATTRIBUTE10 = AttributesEnum.Attribute10.index();
    public static final int ATTRIBUTE11 = AttributesEnum.Attribute11.index();
    public static final int ATTRIBUTE12 = AttributesEnum.Attribute12.index();
    public static final int ATTRIBUTE13 = AttributesEnum.Attribute13.index();
    public static final int ATTRIBUTE14 = AttributesEnum.Attribute14.index();
    public static final int ATTRIBUTE15 = AttributesEnum.Attribute15.index();
    public static final int SALESORDERID = AttributesEnum.SalesorderId.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int PROBLEMTYPE = AttributesEnum.ProblemType.index();
    public static final int REJECTIONTYPE = AttributesEnum.RejectionType.index();
    public static final int STITCHINGWASHINGONE = AttributesEnum.StitchingWashingOne.index();
    public static final int STITCHINGWASHINGTWO = AttributesEnum.StitchingWashingTwo.index();
    public static final int QTYTOTAL = AttributesEnum.QtyTotal.index();
    public static final int REJECTION_TYPE_LOV1 = AttributesEnum.Rejection_Type_LOV1.index();
    public static final int PROBLEM_TYPE_LOV1 = AttributesEnum.Problem_Type_LOV1.index();
    public static final int STITCHING_WASHING_LOV1 = AttributesEnum.Stitching_Washing_LOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MNJ_ISSUEREC_WASH_DEL_SIZE_VORowImpl() {
    }

    /**
     * Gets MNJ_ISSUEREC_WASH_DEL_SIZE_E1 entity object.
     * @return the MNJ_ISSUEREC_WASH_DEL_SIZE_E1
     */
    public MNJ_ISSUEREC_WASH_DEL_SIZE_EOImpl getMNJ_ISSUEREC_WASH_DEL_SIZE_E1() {
        return (MNJ_ISSUEREC_WASH_DEL_SIZE_EOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for LINE_ID using the alias name LineId.
     * @return the LINE_ID
     */
    public Number getLineId() {
        return (Number) getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as attribute value for LINE_ID using the alias name LineId.
     * @param value value to set the LINE_ID
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for SIZE_DETAIL using the alias name SizeDetail.
     * @return the SIZE_DETAIL
     */
    public Number getSizeDetail() {
        return (Number) getAttributeInternal(SIZEDETAIL);
    }

    /**
     * Sets <code>value</code> as attribute value for SIZE_DETAIL using the alias name SizeDetail.
     * @param value value to set the SIZE_DETAIL
     */
    public void setSizeDetail(Number value) {
        setAttributeInternal(SIZEDETAIL, value);
    }

    /**
     * Gets the attribute value for INSEAM using the alias name Inseam.
     * @return the INSEAM
     */
    public String getInseam() {
        return (String) getAttributeInternal(INSEAM);
    }

    /**
     * Sets <code>value</code> as attribute value for INSEAM using the alias name Inseam.
     * @param value value to set the INSEAM
     */
    public void setInseam(String value) {
        setAttributeInternal(INSEAM, value);
    }

    /**
     * Gets the attribute value for SIZE_INSEAM using the alias name SizeInseam.
     * @return the SIZE_INSEAM
     */
    public String getSizeInseam() {
        return (String) getAttributeInternal(SIZEINSEAM);
    }

    /**
     * Sets <code>value</code> as attribute value for SIZE_INSEAM using the alias name SizeInseam.
     * @param value value to set the SIZE_INSEAM
     */
    public void setSizeInseam(String value) {
        setAttributeInternal(SIZEINSEAM, value);
    }

    /**
     * Gets the attribute value for QUANTITY using the alias name Quantity.
     * @return the QUANTITY
     */
    public Number getQuantity() {
        return (Number) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for QUANTITY using the alias name Quantity.
     * @param value value to set the QUANTITY
     */
    public void setQuantity(Number value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE1 using the alias name Attribute1.
     * @return the ATTRIBUTE1
     */
    public String getAttribute1() {
        return (String) getAttributeInternal(ATTRIBUTE1);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE1 using the alias name Attribute1.
     * @param value value to set the ATTRIBUTE1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE2 using the alias name Attribute2.
     * @return the ATTRIBUTE2
     */
    public String getAttribute2() {
        return (String) getAttributeInternal(ATTRIBUTE2);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE2 using the alias name Attribute2.
     * @param value value to set the ATTRIBUTE2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE3 using the alias name Attribute3.
     * @return the ATTRIBUTE3
     */
    public String getAttribute3() {
        return (String) getAttributeInternal(ATTRIBUTE3);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE3 using the alias name Attribute3.
     * @param value value to set the ATTRIBUTE3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE4 using the alias name Attribute4.
     * @return the ATTRIBUTE4
     */
    public String getAttribute4() {
        return (String) getAttributeInternal(ATTRIBUTE4);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE4 using the alias name Attribute4.
     * @param value value to set the ATTRIBUTE4
     */
    public void setAttribute4(String value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE5 using the alias name Attribute5.
     * @return the ATTRIBUTE5
     */
    public String getAttribute5() {
        return (String) getAttributeInternal(ATTRIBUTE5);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE5 using the alias name Attribute5.
     * @param value value to set the ATTRIBUTE5
     */
    public void setAttribute5(String value) {
        setAttributeInternal(ATTRIBUTE5, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE6 using the alias name Attribute6.
     * @return the ATTRIBUTE6
     */
    public String getAttribute6() {
        return (String) getAttributeInternal(ATTRIBUTE6);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE6 using the alias name Attribute6.
     * @param value value to set the ATTRIBUTE6
     */
    public void setAttribute6(String value) {
        setAttributeInternal(ATTRIBUTE6, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE7 using the alias name Attribute7.
     * @return the ATTRIBUTE7
     */
    public String getAttribute7() {
        return (String) getAttributeInternal(ATTRIBUTE7);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE7 using the alias name Attribute7.
     * @param value value to set the ATTRIBUTE7
     */
    public void setAttribute7(String value) {
        setAttributeInternal(ATTRIBUTE7, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE8 using the alias name Attribute8.
     * @return the ATTRIBUTE8
     */
    public String getAttribute8() {
        return (String) getAttributeInternal(ATTRIBUTE8);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE8 using the alias name Attribute8.
     * @param value value to set the ATTRIBUTE8
     */
    public void setAttribute8(String value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE9 using the alias name Attribute9.
     * @return the ATTRIBUTE9
     */
    public String getAttribute9() {
        return (String) getAttributeInternal(ATTRIBUTE9);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE9 using the alias name Attribute9.
     * @param value value to set the ATTRIBUTE9
     */
    public void setAttribute9(String value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE10 using the alias name Attribute10.
     * @return the ATTRIBUTE10
     */
    public String getAttribute10() {
        return (String) getAttributeInternal(ATTRIBUTE10);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE10 using the alias name Attribute10.
     * @param value value to set the ATTRIBUTE10
     */
    public void setAttribute10(String value) {
        setAttributeInternal(ATTRIBUTE10, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE11 using the alias name Attribute11.
     * @return the ATTRIBUTE11
     */
    public String getAttribute11() {
        return (String) getAttributeInternal(ATTRIBUTE11);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE11 using the alias name Attribute11.
     * @param value value to set the ATTRIBUTE11
     */
    public void setAttribute11(String value) {
        setAttributeInternal(ATTRIBUTE11, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE12 using the alias name Attribute12.
     * @return the ATTRIBUTE12
     */
    public String getAttribute12() {
        return (String) getAttributeInternal(ATTRIBUTE12);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE12 using the alias name Attribute12.
     * @param value value to set the ATTRIBUTE12
     */
    public void setAttribute12(String value) {
        setAttributeInternal(ATTRIBUTE12, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE13 using the alias name Attribute13.
     * @return the ATTRIBUTE13
     */
    public String getAttribute13() {
        return (String) getAttributeInternal(ATTRIBUTE13);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE13 using the alias name Attribute13.
     * @param value value to set the ATTRIBUTE13
     */
    public void setAttribute13(String value) {
        setAttributeInternal(ATTRIBUTE13, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE14 using the alias name Attribute14.
     * @return the ATTRIBUTE14
     */
    public String getAttribute14() {
        return (String) getAttributeInternal(ATTRIBUTE14);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE14 using the alias name Attribute14.
     * @param value value to set the ATTRIBUTE14
     */
    public void setAttribute14(String value) {
        setAttributeInternal(ATTRIBUTE14, value);
    }

    /**
     * Gets the attribute value for ATTRIBUTE15 using the alias name Attribute15.
     * @return the ATTRIBUTE15
     */
    public String getAttribute15() {
        return (String) getAttributeInternal(ATTRIBUTE15);
    }

    /**
     * Sets <code>value</code> as attribute value for ATTRIBUTE15 using the alias name Attribute15.
     * @param value value to set the ATTRIBUTE15
     */
    public void setAttribute15(String value) {
        setAttributeInternal(ATTRIBUTE15, value);
    }

    /**
     * Gets the attribute value for SALESORDER_ID using the alias name SalesorderId.
     * @return the SALESORDER_ID
     */
    public Number getSalesorderId() {
        return (Number) getAttributeInternal(SALESORDERID);
    }

    /**
     * Sets <code>value</code> as attribute value for SALESORDER_ID using the alias name SalesorderId.
     * @param value value to set the SALESORDER_ID
     */
    public void setSalesorderId(Number value) {
        setAttributeInternal(SALESORDERID, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for ORG_ID using the alias name OrgId.
     * @return the ORG_ID
     */
    public Number getOrgId() {
        return (Number) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for ORG_ID using the alias name OrgId.
     * @param value value to set the ORG_ID
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for REMARKS using the alias name Remarks.
     * @return the REMARKS
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for REMARKS using the alias name Remarks.
     * @param value value to set the REMARKS
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for PROBLEM_TYPE using the alias name ProblemType.
     * @return the PROBLEM_TYPE
     */
    public String getProblemType() {
        return (String) getAttributeInternal(PROBLEMTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for PROBLEM_TYPE using the alias name ProblemType.
     * @param value value to set the PROBLEM_TYPE
     */
    public void setProblemType(String value) {
        setAttributeInternal(PROBLEMTYPE, value);
    }

    /**
     * Gets the attribute value for REJECTION_TYPE using the alias name RejectionType.
     * @return the REJECTION_TYPE
     */
    public String getRejectionType() {
        return (String) getAttributeInternal(REJECTIONTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for REJECTION_TYPE using the alias name RejectionType.
     * @param value value to set the REJECTION_TYPE
     */
    public void setRejectionType(String value) {
        setAttributeInternal(REJECTIONTYPE, value);
    }

    /**
     * Gets the attribute value for STITCHING_WASHING_ONE using the alias name StitchingWashingOne.
     * @return the STITCHING_WASHING_ONE
     */
    public String getStitchingWashingOne() {
        return (String) getAttributeInternal(STITCHINGWASHINGONE);
    }

    /**
     * Sets <code>value</code> as attribute value for STITCHING_WASHING_ONE using the alias name StitchingWashingOne.
     * @param value value to set the STITCHING_WASHING_ONE
     */
    public void setStitchingWashingOne(String value) {
        setAttributeInternal(STITCHINGWASHINGONE, value);
    }

    /**
     * Gets the attribute value for STITCHING_WASHING_TWO using the alias name StitchingWashingTwo.
     * @return the STITCHING_WASHING_TWO
     */
    public String getStitchingWashingTwo() {
        return (String) getAttributeInternal(STITCHINGWASHINGTWO);
    }

    /**
     * Sets <code>value</code> as attribute value for STITCHING_WASHING_TWO using the alias name StitchingWashingTwo.
     * @param value value to set the STITCHING_WASHING_TWO
     */
    public void setStitchingWashingTwo(String value) {
        setAttributeInternal(STITCHINGWASHINGTWO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute QtyTotal.
     * @return the QtyTotal
     */
    public Number getQtyTotal() {
        return (Number) getAttributeInternal(QTYTOTAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute QtyTotal.
     * @param value value to set the  QtyTotal
     */
    public void setQtyTotal(Number value) {
        setAttributeInternal(QTYTOTAL, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Rejection_Type_LOV1.
     */
    public RowSet getRejection_Type_LOV1() {
        return (RowSet)getAttributeInternal(REJECTION_TYPE_LOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Problem_Type_LOV1.
     */
    public RowSet getProblem_Type_LOV1() {
        return (RowSet)getAttributeInternal(PROBLEM_TYPE_LOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Stitching_Washing_LOV1.
     */
    public RowSet getStitching_Washing_LOV1() {
        return (RowSet)getAttributeInternal(STITCHING_WASHING_LOV1);
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
